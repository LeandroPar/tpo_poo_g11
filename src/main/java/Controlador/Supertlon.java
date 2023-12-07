package Controlador;

import Modelo.Articulos.*;
import Modelo.Clase;
import Modelo.Profesor;
import Modelo.SucursalGimnasio;
import Modelo.Usuarios.*;
import Modelo.enums.Modalidad;
import Modelo.enums.Nivel;
import Modelo.enums.TipoLugar;
import Modelo.enums.UsoPesa;
import java.time.LocalDate;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class Supertlon {

    private static Supertlon supertlon;
    private ArrayList<SucursalGimnasio> sucursales;
    private ArrayList<Alumno> alumnos;
    private ArrayList<Administrativo> admins;
    private ArrayList<SoporteTecnico> tecnicos;
    private ArrayList<Articulo> articulos;
    private HashMap<String, String> login;

    private Supertlon() {}
    public static Supertlon getInstance() {
        if (supertlon == null) {
            supertlon = new Supertlon();
            supertlon.alumnos = new ArrayList<>();
            supertlon.sucursales = new ArrayList<>();
            supertlon.articulos = new ArrayList<>();
            supertlon.admins = new ArrayList<>();
            supertlon.tecnicos = new ArrayList<>();
            supertlon.login = new HashMap<>();
        }
        return supertlon;
    }
    
    public String login(String userId) {
        if (login.containsKey(userId)) {
            return login.get(userId);
        }
        return null;
    }

    public boolean altaAlumno(String nombre, String membresia) {
        Nivel nivel=null;
        if (membresia.equals("BLACK")) nivel = Nivel.BLACK;
        else if (membresia.equals("ORO")) nivel = Nivel.ORO;
        else if (membresia.equals("PLATINUM")) nivel = Nivel.PLATINUM;
        
        Alumno alumno = new Alumno(nombre, nivel);
        alumnos.add(alumno);
        login.put(alumno.getId(), "Alumno");
        System.out.println("Alumno agregado");
        return true;
    }
    public boolean bajaAlumno(String id) {
        for (Alumno alumno: alumnos) {
            if (alumno.getId().equals(id)) {
                alumnos.remove(alumno);
                login.remove(id);
                return true;
            }
        }
        return false;
    }

    public boolean altaAdministrativo(String nombre, ArrayList<String> sedes) {
        Administrativo admin = new Administrativo(nombre, sedes);
        admins.add(admin);
        login.put(admin.getId(), "Administrativo");
        return true;
    }
    public boolean bajaAdministrativo(String id) {
        for (Administrativo admin: admins) {
            System.out.println(admin.getId());
            if (admin.getId().equals(id)) {
                admins.remove(admin);
                login.remove(id);
                return true;
            }
        }
        return false;
    }
    
    public boolean altaSoporte(String nombre) {
        SoporteTecnico soporte = new SoporteTecnico(nombre);
        tecnicos.add(soporte);
        login.put(soporte.getId(), "Soporte Tecnico");
        return true;
    }
    
    public boolean altaSucursal(String barrio, String tiponivel, String tipolugar, double superficieM2, int alquiler) {
        for (SucursalGimnasio sucursalGimnasio : sucursales) {
            if (sucursalGimnasio.getSedeNombre().equals(barrio)) return false;
        }
        Nivel nivel=null;
        if (tiponivel.equals("BLACK")) nivel=Nivel.BLACK;
        else if (tipolugar.equals("GOLD")) nivel=Nivel.ORO;
        else if (tipolugar.equals("PLATINUM")) nivel=Nivel.PLATINUM;
        
        TipoLugar lugar=null;
        if (tipolugar.equals("Pileta")) lugar=TipoLugar.PILETA;
        else if (tipolugar.equals("Salon")) lugar=TipoLugar.SALON;
        else if (tipolugar.equals("Aire libre")) lugar=TipoLugar.AIRE_LIBRE;
        
        sucursales.add(new SucursalGimnasio(barrio, nivel, lugar, superficieM2, alquiler));
        return true;
    }

    public boolean altaProfesor(String nombreProfesor, int sueldoProfesor, SucursalGimnasio sucursal) {
        Profesor profe = new Profesor(nombreProfesor, sueldoProfesor);
        sucursal.addProfesor(profe);
        return true;
    }
    
    //metodo auxiliar para reserva de clase
    public ArrayList<String> sucursalesDisponibles(Alumno alumno) {
        ArrayList<String> listaSedes = new ArrayList<>();
        for (SucursalGimnasio sucursalDisponible : sucursales) {
            if ( (alumno.getMembresia().compareTo( sucursalDisponible.getNivel()) >=0 ) ) {
                listaSedes.add( sucursalDisponible.getSedeNombre() );
            }
        }
        return listaSedes;
    }
    //metodo auxiliar para reserva de clase
    public ArrayList<Clase> clasesDisponibles(String sede, Alumno alumno) {
        SucursalGimnasio sucursal = buscarSucursal(sede);
        ArrayList<Clase> listaClases = new ArrayList<>();
        for (Clase clase : sucursal.getClases()) {
            for (Clase clase2 : alumno.getClases()) {
                if ( !clase.getHorario().toLocalDate().isEqual( clase.getHorario().toLocalDate()) ) {
                    listaClases.add(clase);
                }
            }
        }
        return listaClases;
    }
    public String reservarClase(Alumno alumno, Clase clase, boolean virtual) {
        SucursalGimnasio sucursal = buscarSucursal(clase.getSede());
        String ejercicio = clase.getEjercicio().getNombre();
        Modalidad modalidad = clase.getEjercicio().getModalidad();
        if (modalidad.equals(Modalidad.ONLINE) && virtual) {
            alumno.addClase(clase);
            clase.addAlumno(alumno, virtual);
            clase.actualizar(sucursal);         // Actualizar rentabilidad de la clase, capacidad...
            return "La reserva se realizo exitosamente";
        } else if (modalidad.equals(Modalidad.PRESENCIAL) && virtual) {
            return "Esta clase solo puede ser asistida presencialmente";
        } else {
            if (clase.getCapacidad()==0) return "Esta clase llego a su capacidad máxima";
            if (sucursal.getLugar().getSuperficieM2() / clase.getCapacidad() > 2 ) return "Esta clase no tiene espacio físico para mas alumnos";
            int i = 0;
            int size = sucursal.getArticulos().size();
            ArrayList<Articulo> sucursalArticulos = sucursal.getArticulos();
            switch (ejercicio) {
                case "Crossfit":
                    ArrayList<Articulo> articulos = new ArrayList<>();
                    int pesaMano = 2;
                    int pesaTobillera = 2;
                    int pesaDisco= 1;
                    while ((pesaMano!=0 || pesaTobillera!= 0 || pesaDisco != 0) && i < size ) {
                        Articulo articulo = sucursalArticulos.get(i);
                        if (articulo.getId().equals("4") || articulo.getId().equals("5")) {
                            Pesa pesa = (Pesa)articulo;
                            switch (pesa.getUso()) {
                                case DE_MANO:
                                    if (pesaMano!=0) {
                                        pesaMano--;
                                        articulos.add(articulo);
                                    }
                                case TOBILLERAS:    
                                    if (pesaTobillera!=0) {
                                        pesaTobillera--;
                                        articulos.add(pesa);
                                    }
                                case DISCOS:
                                    if (pesaDisco!=0) {
                                        pesaDisco--;
                                        articulos.add(pesa);
                                    }
                            }
                        }
                    i++;    
                    }
                    if (pesaMano!=0 || pesaTobillera !=0 || pesaDisco !=0) return "La sucursal no cuenta con articulos suficientes";
                    for (Articulo item : articulos) {
                        clase.addArticulo(item);
                        sucursalArticulos.remove(item);
                    }
                    break;
                case "Yoga":
                    Articulo colS = null;
                    while (colS==null || i<size) {
                        Articulo articulo = sucursalArticulos.get(i);
                        if (articulo.getId().equals("1")) {
                            colS= articulo;
                        }
                        i++;
                    }
                    if (colS==null) return "La sucursal no cuenta con articulos suficientes";
                    clase.addArticulo(colS);
                    sucursalArticulos.remove(colS);
                    break;
                case "Gimnasia Postural":
                    Articulo colchonetaGim=null;
                    while (colchonetaGim==null || i<size) {
                        Articulo articulo = sucursalArticulos.get(i);
                        if (articulo.getId().equals("1")) {
                            colchonetaGim= articulo;
                        }
                        i++;
                    }
                    if (colchonetaGim==null) return "La sucursal no cuenta con articulos suficientes";
                    clase.addArticulo(colchonetaGim);
                    sucursalArticulos.remove(colchonetaGim);
                    break;
                case "Kangoo Jumping":
                    Articulo colchonetaKangoo=null;
                    Articulo botasKangoo=null;
                    while (colchonetaKangoo==null || i<size) {
                        Articulo articulo = sucursalArticulos.get(i);
                        if (articulo.getId().equals("1")) colchonetaKangoo= articulo;
                        if (articulo.getId().equals("3")) {
                            Accesorio accesorio = (Accesorio)articulo;
                            if (accesorio.getNombre().equals("Botas Kangoo")) botasKangoo=articulo;
                        }
                        i++;
                    }
                    if (colchonetaKangoo==null || botasKangoo==null) return "La sucursal no cuenta con articulos suficientes";
                    clase.addArticulo(colchonetaKangoo);
                    clase.addArticulo(botasKangoo);
                    sucursalArticulos.remove(colchonetaKangoo);
                    sucursalArticulos.remove(botasKangoo);
                    break;
                case "Aero Combat":
                    int pesaManoAero=2;
                    ArrayList<Articulo> articulosAero = new ArrayList<>();
                    Articulo colchonetaAero = null;
                    while ((pesaManoAero!=0 || colchonetaAero==null) && i < size ) {
                        Articulo articulo = sucursalArticulos.get(i);
                        if (articulo.getId().equals("1") || articulo.getId().equals("4")|| articulo.getId().equals("5")) {
                            if (articulo.getId().equals("1")) colchonetaAero= articulo;
                            else {
                                Pesa pesaAero = (Pesa)articulo;
                                if (pesaAero.getUso()==UsoPesa.DE_MANO) {
                                    articulosAero.add(articulo);
                                    pesaManoAero--;
                                }
                            }
                        }
                    i++;    
                    }
                    if (colchonetaAero==null || pesaManoAero==0) return "La sucursal no cuenta con articulos suficientes";
                    for (Articulo articuloAero : articulosAero) { 
                        clase.addArticulo(articuloAero);
                        sucursalArticulos.remove(articuloAero);
                    }
                    clase.addArticulo(colchonetaAero);
                    sucursalArticulos.remove(colchonetaAero);
                    break;
            }
        }
        alumno.addClase(clase);
        clase.addAlumno(alumno, virtual);
        clase.actualizar(sucursal);         // Actualizar rentabilidad de la clase, capacidad...
        return "La reserva se realizo exitosamente";
    }
    //Metodo para cancelar clase
    public boolean cancelarReservarClase(Alumno alumno, Clase clase) {
        if (LocalDate.now().equals(clase.getHorario().toLocalDate())) {
            return false;
        }
        else {
            alumno.getClases().remove(clase);
            clase.getAlumnos().remove(alumno);
            SucursalGimnasio sucursal = buscarSucursal(clase.getSede());
            ArrayList<Articulo> sucursalArticulos = sucursal.getArticulos();
            String ejercicio = clase.getEjercicio().getNombre();
            int i=0;
            int size = clase.getArticulos().size();
            switch (ejercicio) {
            case "Crossfit":
                ArrayList<Articulo> articulos = new ArrayList<>();
                int pesaMano = 2;
                int pesaTobillera = 2;
                int pesaDisco= 1;
                while ((pesaMano!=0 || pesaTobillera!= 0 || pesaDisco != 0) ) {
                    Articulo articulo = clase.getArticulos().get(i);
                    if (articulo.getId().equals("4") || articulo.getId().equals("5")) {
                        Pesa pesa = (Pesa)articulo;
                        switch (pesa.getUso()) {
                            case DE_MANO:
                                if (pesaMano!=0) {
                                    pesaMano--;
                                    articulos.add(articulo);
                                }
                            case TOBILLERAS:    
                                if (pesaTobillera!=0) {
                                    pesaTobillera--;
                                    articulos.add(pesa);
                                }
                            case DISCOS:
                                if (pesaDisco!=0) {
                                    pesaDisco--;
                                    articulos.add(pesa);
                                }
                        }
                    }
                i++;    
                }
                for (Articulo item : articulos) {
                    clase.getArticulos().remove(item);
                    sucursal.addArticulo(item);
                }
                break;
            case "Yoga":
                Articulo colS = null;
                while (colS==null || i<size) {
                    Articulo articulo = clase.getArticulos().get(i);
                    if (articulo.getId().equals("1")) {
                        colS= articulo;
                    }
                    i++;
                }
                clase.getArticulos().remove(colS);
                sucursal.addArticulo(colS);
                break;
            case "Gimnasia Postural":
                Articulo colchonetaGim=null;
                while (colchonetaGim==null || i<size) {
                    Articulo articulo = clase.getArticulos().get(i);
                    if (articulo.getId().equals("1")) {
                        colchonetaGim= articulo;
                    }
                    i++;
                }
                clase.getArticulos().remove(colchonetaGim);
                sucursal.addArticulo(colchonetaGim);
                break;
            case "Kangoo Jumping":
                Articulo colchonetaKangoo=null;
                Articulo botasKangoo=null;
                while ((colchonetaKangoo==null || botasKangoo==null) || i<size) {
                    Articulo articulo = clase.getArticulos().get(i);
                    if (articulo.getId().equals("1")) colchonetaKangoo= articulo;
                    if (articulo.getId().equals("3")) {
                        Accesorio accesorio = (Accesorio)articulo;
                        if (accesorio.getNombre().equals("Botas Kangoo")) botasKangoo=articulo;
                    }
                    i++;
                }
                clase.getArticulos().remove(colchonetaKangoo);
                clase.getArticulos().remove(botasKangoo);
                sucursal.addArticulo(colchonetaKangoo);
                sucursal.addArticulo(botasKangoo);
                break;
            case "Aero Combat":
                int pesaManoAero=2;
                ArrayList<Articulo> articulosAero = new ArrayList<>();
                Articulo colchonetaAero = null;
                while ((pesaManoAero!=0 || colchonetaAero==null) && i < size ) {
                    Articulo articulo = clase.getArticulos().get(i);
                    if (articulo.getId().equals("1") || articulo.getId().equals("4") || articulo.getId().equals("4")) {
                        if (articulo.getId().equals("1")) colchonetaAero= articulo;
                        else {
                            Pesa pesaAero = (Pesa)articulo;
                            if (pesaAero.getUso()==UsoPesa.DE_MANO) {
                                articulosAero.add(articulo);
                                pesaManoAero--;
                            }
                        }
                    }
                i++;    
                }
                for (Articulo articuloAero : articulosAero) {
                    clase.getArticulos().remove(articuloAero);
                    sucursal.addArticulo(articuloAero);
                }
                clase.getArticulos().remove(colchonetaAero);
                sucursal.addArticulo(colchonetaAero);
                break;
            }
            clase.actualizar(sucursal);
            return true;
        }
    }
    
    public String altaClase(LocalDateTime horario, LocalTime duracion, String ejercicio, Profesor profesor, SucursalGimnasio sucursal) {
        String msj = profesor.estaDisponible(horario, duracion);
        if (!msj.equals("Profesor disponible")) {
            return msj;
        }
        if (sucursal.colisionHorario(horario, duracion)) {
            return "Ya hay otra clase en ese horario";
        }
        Clase clase = new Clase(ejercicio, profesor, horario, duracion, sucursal.getSedeNombre());
        profesor.addClase(clase);
        sucursal.addClase(clase);
        return "Clase agendada exitosamente";
    }

    public int transicionarClase(SucursalGimnasio sucursal, Clase clase) {
        int eliminados=0;
        for (Alumno alumno : clase.getAlumnos()) {
            alumno.removeClase(clase);
        }
        for (Articulo articulo : clase.getArticulos()) {
            if (articulo.amortizar(sucursal)) {
                eliminados++;
            }
        }
        if (clase.getEjercicio().getModalidad().equals(Modalidad.ONLINE)) {
            sucursal.getGrabaciones().addGrabacion(clase);
        }
        return eliminados;
    }
    public LinkedList<Clase> monitorearStreaming(SucursalGimnasio sucursal, String ejercicio) {
        LinkedList<Clase> grabaciones = null;
        switch (ejercicio) {
            case "Yoga":
                grabaciones = sucursal.getGrabaciones().getClasesYoga();
                break;
            case "Gimnasia Postural":
                grabaciones = sucursal.getGrabaciones().getClasesGimnasia();
                break;
        }
        return grabaciones;
    }

    public void listarArticulos () {
        int cantSoftTech = 0;
        int cantPampero = 0;
        int cantAccesorios = 0;
        int cantIronMan = 0;
        int cantGadNic = 0;
        for (int i = 0; i < articulos.size(); i++) {
            System.out.println("Articulos en el almacén, sin sucursal.");
            if (articulos.get(i).getId().equals("1")){cantSoftTech++;}
            else if (articulos.get(i).getId().equals("2")) {cantPampero++;}
            else if (articulos.get(i).getId().equals("3")) {cantAccesorios++;}
            else if (articulos.get(i).getId().equals("4")) {cantIronMan++;}
            else{cantGadNic++;}
        }
        System.out.println("SoftTech: " + cantSoftTech);
        System.out.println("Pampero: " + cantPampero);
        System.out.println("Accesorios: " + cantAccesorios);
        System.out.println("IronMan: " + cantIronMan);
        System.out.println("GadNic: " + cantGadNic);
    }
    public String listarArticulos(SucursalGimnasio sucursal){
        String articulos="";
        for (Articulo articulo : sucursal.getArticulos()) {
            articulos += articulo.toString() + "\n";
        }
        return articulos;
    }
    public boolean bajaArticulo(SucursalGimnasio sucursal, String itemId) {
        for (Articulo articulo : sucursal.getArticulos()) {
            if (articulo.getItemId().equals(itemId)) {
                sucursal.getArticulos().remove(articulo);
                return true;
            }
        }
        return false;
    }
    public void cargarArticulos(String articuloId, int cantidad, String usoPesa, String accesorio) {
        switch (articuloId) {
            case "1":
                for (int i=0; i<cantidad; i++) {
                    articulos.add(new SoftTech());
                }
                break;
            case "2":
                for (int i=0; i<cantidad;i++) {
                    articulos.add(new Pampero());
                }
                break;
            case "3":
                for (int i=0; i<cantidad; i++) {
                    articulos.add(new Accesorio(accesorio));
                }
                break;
            case "4":
                UsoPesa uso4;
                if (usoPesa.equals("De Mano")) uso4=UsoPesa.DE_MANO;
                else if (usoPesa.equals("Tobilleras")) uso4 = UsoPesa.TOBILLERAS;
                else uso4 = UsoPesa.DISCOS;
                for (int i=0; i<cantidad; i++) {
                    articulos.add(new IronMan(uso4));
                }
                break;
            case "5":
                UsoPesa uso5;
                if (usoPesa.equals("De Mano")) uso5=UsoPesa.DE_MANO;
                else if (usoPesa.equals("Tobilleras")) uso5 = UsoPesa.TOBILLERAS;
                else uso5 = UsoPesa.DISCOS;
                for (int i=0; i<cantidad; i++) {
                    articulos.add(new IronMan(uso5));
                }
                break;
        }
    }

    public String añadirArticulosASede(SucursalGimnasio sucursal, String articuloId, String cantidad){
        int i=0;
        int lista = articulos.size();
        int cant = Integer.parseInt(cantidad);
        int exitos=0;
        while (cant > 0 && lista>0) {
            if (articulos.get(i).getId().equals(articuloId)) {
                sucursal.addArticulo(articulos.get(i));
                articulos.remove(i);
                cant--;
                exitos++;
            } else i++;
            lista--;
        }
        return String.valueOf(exitos);
    }

    //metodos de ayuda
    public Alumno buscarAlumno(String id) {
        for (Alumno alum : alumnos) {
            if (alum.getId().equals(id)) return alum;
        }
        return null;
    }
    public Administrativo buscarAdministrativo(String id) {
        for (Administrativo admin : admins) {
            if (admin.getId().equals(id)) return admin;
        }
        return null;
    }
    public SoporteTecnico buscarTecnico(String id) {
        for (SoporteTecnico tecnico : tecnicos) {
            if (tecnico.getId().equals(id)) return tecnico;
        }
        return null;
    }
    public SucursalGimnasio buscarSucursal(String sede) {
        for (SucursalGimnasio sucursal : sucursales) {
            if (sucursal.getSedeNombre().equals(sede)) return sucursal;
        }
        return null;
    }
    public ArrayList<SucursalGimnasio> getSucursales() {return sucursales;}
    public ArrayList<String> getNombresSucursales(){
        ArrayList<SucursalGimnasio> sucursales = getSucursales();
        ArrayList<String> nombres = new ArrayList<String>();
        for(SucursalGimnasio sucursal : sucursales){
            nombres.add(sucursal.getSedeNombre());
        }
        return nombres;
     }
    public ArrayList<Alumno> getAlumnos() {return alumnos;}
    public ArrayList<Articulo> getArticulos() {return articulos;}
    public HashMap<String, String> getLogin() {return login;}
}