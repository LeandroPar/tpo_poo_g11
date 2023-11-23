package Controlador;

import Modelo.Articulos.*;
import Modelo.Clase;
import Modelo.Profesor;
import Modelo.SucursalGimnasio;
import Modelo.Usuarios.*;
import Modelo.enums.Nivel;
import Modelo.enums.TipoLugar;
import Modelo.enums.UsoPesa;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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

    public void altaAlumno(String nombre, Nivel membresia) {
        Alumno alumno = new Alumno(nombre, membresia);
        alumnos.add(alumno);
        login.put(alumno.getId(), "Alumno");
        System.out.println("Alumno agregado");
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
    
    public boolean altaSucursal(String barrio, Nivel nivel, TipoLugar lugar, double superficieM2, int alquiler) {
        for (SucursalGimnasio sucursalGimnasio : sucursales) {
            if (sucursalGimnasio.getSedeNombre().equals(barrio)) return false;
        }
        sucursales.add(new SucursalGimnasio(barrio, nivel, lugar, superficieM2, alquiler));
        return true;
    }
    private Alumno buscarAlumno(String id) {
        for (Alumno alum : alumnos) {
            if (alum.getId().equals(id)) return alum;
        }
        return null;
    }
    private SucursalGimnasio buscarSucursal(String sede) {
        for (SucursalGimnasio sucursal : sucursales) {
            if (sucursal.getSedeNombre().equals(sede)) return sucursal;
        }
        return null;
    }

    public boolean altaProfesor(String nombreProfesor, int sueldoProfesor, String sedesucursal) {
        Profesor profe = new Profesor(nombreProfesor, sueldoProfesor);
        for (SucursalGimnasio sucursal : sucursales) {
            if (sucursal.getSedeNombre().equals(sedesucursal)){
                sucursal.addProfesor(profe);
                return true;
            }
        }
        return false;
    }
    
    //metodo auxiliar para reserva de clase
    public ArrayList<String> sucursalesDisponibles(String userId) {
        Alumno alumno = buscarAlumno(userId);
        ArrayList<String> listaSedes = new ArrayList<>();
        for (SucursalGimnasio sucursalDisponible : sucursales) {
            if ( (alumno.getMembresia().compareTo( sucursalDisponible.getNivel()) >=0 ) ) {
                listaSedes.add( sucursalDisponible.getSedeNombre() );
            }
        }
        return listaSedes;
    }
    //metodo auxiliar para reserva de clase
    public ArrayList<Clase> clasesDisponibles(String sede, String userId) {
        Alumno alumno = buscarAlumno(userId);
        SucursalGimnasio sucursal = buscarSucursal(sede);
        ArrayList<Clase> listaClases = new ArrayList<>();
        for (Clase clase : sucursal.getClases()) {
            if (clase.getCapacidad()==0 && (sucursal.getLugar().getSuperficieM2() / clase.getCapacidad() ) > 2) {
                for (Clase clase2 : alumno.getClases()) {
                    if (!clase.getHorario().toLocalDate().isEqual( clase.getHorario().toLocalDate())) {
                        listaClases.add(clase);
                    }
                }
            }
        }
        return listaClases;
    }
    public boolean reservarClase(String id, Clase clase) {
        Alumno alumno = buscarAlumno(id);
        alumno.addClase(clase);
        clase.addAlumno(alumno);
        clase.actualizar();         // Actualizar rentabilidad de la clase, capacidad...
        return true;
    }
    public boolean altaClase(int costo, LocalDateTime horario, LocalTime duracion, Profesor profesor, String userId) {
        if (!profesor.estaDisponible(horario, duracion)) {
            System.out.println("Profesor no disponible");
            return false;
        }
        else {
            Administrativo administrativo=null;
            Scanner input = new Scanner(System.in);
            for (Administrativo admin : admins){
                if (admin.getId().equals(userId)) administrativo=admin;
            }
            System.out.println("Ingresar nombre de la sede donde se agendará la clase, o ingresar 0 para cancelar: ");
            String sede = input.nextLine();
            while (!administrativo.getSedes().contains(sede) | !sede.equals("0")) {
                System.out.println("El barrio ingresado no pertenece a alguna sede bajo su control: ");
                System.out.println("Ingresar nombre de la sede donde se agendará la clase, o ingresar 0 para cancelar: ");
                sede = input.nextLine();
            }

            if (sede.equals("0")) return false;
            SucursalGimnasio sucursal= null;
            for (SucursalGimnasio s : sucursales) {
                if (s.getSedeNombre().equals(sede)) {
                    sucursal = s;
                }
            }
            if (sucursal.colisionHorario(horario, duracion)) {
                return false;
            }
        }
        return true;
    }

    public void transicionarClase() {
        return;
    }
    public void monitorearStreaming(String sucursalNombre, String userId) {
        Administrativo administrativo = null;
        SucursalGimnasio sucursal = null;
        for (Administrativo admin : admins) {
            if (admin.getId().equals(userId)) administrativo = admin;
        }
        if (administrativo.getSedes().contains(sucursalNombre))
            for (SucursalGimnasio sucursalGimnasio : sucursales) {
                if (sucursalGimnasio.getSedeNombre().equals(sucursalNombre)) sucursal = sucursalGimnasio;
            }

        return;
    }

    public void listarArticulos () {
        int cantSoftTech = 0;
        int cantPampero = 0;
        int cantAccesorios = 0;
        int cantIronMan = 0;
        int cantGadNic = 0;
        for (int i = 0; i < articulos.size(); i++) {
            System.out.println("Articulos en el almacén, sin sucursal.");
            if (articulos.get(i).getId() == 1){cantSoftTech++;}
            else if (articulos.get(i).getId() == 2) {cantPampero++;}
            else if (articulos.get(i).getId() == 3) {cantAccesorios++;}
            else if (articulos.get(i).getId() == 4) {cantIronMan++;}
            else{cantGadNic++;}
        }
        System.out.println("SoftTech: " + cantSoftTech);
        System.out.println("Pampero: " + cantPampero);
        System.out.println("Accesorios: " + cantAccesorios);
        System.out.println("IronMan: " + cantIronMan);
        System.out.println("GadNic: " + cantGadNic);
    }
    public void listarArticulos(String nombre){
        try {
            if (nombre == ""){
                int i=0;
                for (SucursalGimnasio sucursal : sucursales) {
                    System.out.println("Nombre Sucursal: " + sucursal.getSedeNombre());
                    int cantSoftTech = 0;
                    int cantPampero = 0;
                    int cantAccesorios = 0;
                    int cantIronMan = 0;
                    int cantGadNic = 0;
                    for (int j = 0; j < sucursal.getArticulos().size(); j++) {
                        if (sucursal.getArticulos().get(j).getId() == 1){cantSoftTech++;}
                        else if (sucursal.getArticulos().get(j).getId() == 2) {cantPampero++;}
                        else if (sucursal.getArticulos().get(j).getId() == 3) {cantAccesorios++;}
                        else if (sucursal.getArticulos().get(j).getId() == 4) {cantIronMan++;}
                        else{cantGadNic++;}
                    }
                    System.out.println("SoftTech: " + cantSoftTech);
                    System.out.println("Pampero: " + cantPampero);
                    System.out.println("Accesorios: " + cantAccesorios);
                    System.out.println("IronMan: " + cantIronMan);
                    System.out.println("GadNic: " + cantGadNic);
                    i++;
                }
            }else{
                int i=0;
                for (SucursalGimnasio sucursal : sucursales) {
                    if (sucursal.getSedeNombre() == sucursal.getSedeNombre()){
                        int cantSoftTech = 0;
                        int cantPampero = 0;
                        int cantAccesorios = 0;
                        int cantIronMan = 0;
                        int cantGadNic = 0;
                        System.out.println("Nombre Sucursal: " + sucursal.getSedeNombre());
                        for (int j = 0; j < sucursal.getArticulos().size(); j++) {
                            if (sucursal.getArticulos().get(j).getId() == 1){cantSoftTech++;}
                            else if (sucursal.getArticulos().get(j).getId() == 2) {cantPampero++;}
                            else if (sucursal.getArticulos().get(j).getId() == 3) {cantAccesorios++;}
                            else if (sucursal.getArticulos().get(j).getId() == 4) {cantIronMan++;}
                            else{cantGadNic++;}
                        }
                        System.out.println("SoftTech: " + cantSoftTech);
                        System.out.println("Pampero: " + cantPampero);
                        System.out.println("Accesorios: " + cantAccesorios);
                        System.out.println("IronMan: " + cantIronMan);
                        System.out.println("GadNic: " + cantGadNic);
                        i++;
                    }else {
                        System.out.println("En esta la sede" + sucursal.getSedeNombre() + "No hay articulos");
                    }
                }
            }

        }catch (Exception e){
            System.out.println(e);
        }

    }

    public boolean cargarArticulos() {
        Scanner input = new Scanner(System.in);
        System.out.println("Artículos Disponibles: ");
        System.out.println("1 - SoftTech");
        System.out.println("2 - Pampero");
        System.out.println("3 - Accesorios");
        System.out.println("4 - IronMan");
        System.out.println("5 - GadNic");

        boolean invalido=true;
        int opcion=-1;
        int cantidad;
        do {
            try {
                System.out.println("Ingresar el numero del accesorio a cargar o cualquier letra para cancelar");
                opcion = Integer.parseInt(input.next());
                System.out.println("Ingresar la cantidad de articulos a cargar: ");
                cantidad = Integer.parseInt(input.next());
                if (1<=opcion && opcion<=5 && cantidad>=0) {
                    invalido = false;
                    input.reset();
                }
                else {
                    System.out.println("Ingresar un numero válido");
                    input.reset();
                }
            }
            catch (Exception e) {
                System.out.println("No se ingreso un numero. Cancelando reserva");
                return false;
            }
        } while (invalido);
        if (opcion==1) {
            for (int i=0; i<cantidad; i++) {
                articulos.add(new SoftTech());
            }
        } else if (opcion == 2) {
            for (int i = 0; i <cantidad; i++) {
                articulos.add(new Pampero());
            }
        } else if (opcion == 3) {
            for (int i = 0; i <cantidad; i++) {
                System.out.println("Ingresar nombre del articulo: ");
                String accesorio = input.nextLine();
                articulos.add(new Accesorio(accesorio));
            }
        }else if (opcion == 4) {
            System.out.println("Ingresar uso del articulo (De mano, Tobilleras, Discos: ");
            String uso = input.nextLine();
            while (!uso.equals("De mano") || !uso.equals("Tobilleras") || !uso.equals("Discos")) {
                System.out.println("Ingresar uso válido del articulo (De mano, Tobilleras, Discos: ");
                uso = input.nextLine();
            }
            UsoPesa usopesa;
            if (uso.equals("De mano")) usopesa=UsoPesa.DE_MANO;
            else if (uso.equals("Tobilleras")) usopesa=UsoPesa.TOBILLERAS;
            else usopesa=UsoPesa.DISCOS;
            for (int i = 0; i <cantidad; i++) {
                articulos.add(new IronMan(usopesa));
            }
        }else {
            System.out.println("Ingresar uso del artículo: ");
            String uso = input.nextLine();
            while(!uso.equals("De mano") || !uso.equals("Tobillera") || !uso.equals("Discos")){
                System.out.println("Ingresar uso valido del articulo (De mano, Tobilleras, Discos)");
                uso = input.nextLine();
            }
            UsoPesa usopesa;
            if (uso.equals("De mano")) usopesa = UsoPesa.DE_MANO;
            else if(uso.equals("Tobilleras")) usopesa = UsoPesa.TOBILLERAS;
            else usopesa = UsoPesa.DISCOS;
            for (int i = 0; i <cantidad; i++) {
                articulos.add(new Gadnic(usopesa));
            }
        }
        return true;
    }

    public boolean añadirArticulosASede(int userId){
        listarArticulos();
        Scanner input = new Scanner(System.in);
        Administrativo administrativo=null;
        for (Administrativo admin : admins){
            if (admin.getId().equals(userId)) administrativo=admin;
        }
        System.out.println("Ingresar nombre de la sede donde se agendará la clase, o ingresar 0 para cancelar: ");
        String sede = input.nextLine();
        while (!administrativo.getSedes().contains(sede) | !sede.equals("0")) {
            System.out.println("El barrio ingresado no pertenece a alguna sede bajo su control: ");
            System.out.println("Ingresar nombre de la sede donde se agendará la clase, o ingresar 0 para cancelar: ");
            sede = input.nextLine();
        }
        if (sede.equals("0")) return false;
        SucursalGimnasio sucursal= null;
        for (SucursalGimnasio s : sucursales) {
            if (s.getSedeNombre().equals(sede)) {
                sucursal = s;
            }
        }
        System.out.println("Artículos Disponibles: ");
        System.out.println("1 - SoftTech");
        System.out.println("2 - Pampero");
        System.out.println("3 - Accesorios");
        System.out.println("4 - IronMan");
        System.out.println("5 - GadNic");
        boolean invalido=true;
        int opcion=-1;
        int cantidad;
        do {
            try {
                System.out.println("Ingresar el numero del articulo a cargar o cualquier letra para cancelar");
                opcion = Integer.parseInt(input.next());
                System.out.println("Ingresar la cantidad de articulos a cargar: ");
                cantidad = Integer.parseInt(input.next());
                if (1<=opcion && opcion<=5 && cantidad>=0) {
                    invalido = false;
                    input.reset();
                }
                else {
                    System.out.println("Ingresar un numero válido");
                    input.reset();
                }
            }
            catch (Exception e) {
                System.out.println("No se ingreso un numero. Cancelando reserva");
                return false;
            }
        } while (invalido);
        int i=0;
        int lista = articulos.size();
        if (opcion==1) {
            while (cantidad>0 && lista>0) {
                if (articulos.get(i).getId()==opcion) {
                    sucursal.addArticulo(articulos.get(i));
                    articulos.remove(i);
                    cantidad--;
                }
                i++;
                lista--;
            }
        } else if (opcion == 2) {
            while(cantidad > 0 && lista > 0) {
                if (articulos.get(i).getId() == opcion){
                    sucursal.addArticulo(articulos.get(i));
                }
                i++;
                lista--;
            }
        }else if (opcion == 3) {
            while(cantidad > 0 && lista > 0) {
                if (articulos.get(i).getId() == opcion){
                    sucursal.addArticulo(articulos.get(i));
                }
                i++;
                lista--;
            }
        }else if (opcion == 4) {
            while(cantidad > 0 && lista > 0) {
                if (articulos.get(i).getId() == opcion){
                    sucursal.addArticulo(articulos.get(i));
                }
                i++;
                lista--;
            }
        }else {
            while (cantidad > 0 && lista > 0) {
                if (articulos.get(i).getId() == opcion) {
                    sucursal.addArticulo(articulos.get(i));
                }
                i++;
                lista--;
            }
        }
        return true;
        }

    public ArrayList<SucursalGimnasio> getSucursales() {
        return sucursales;
    }

     public ArrayList<String> getNombresSucursales(){
        ArrayList<SucursalGimnasio> sucursales = getSucursales();
        ArrayList<String> nombres = new ArrayList<String>();
        for(SucursalGimnasio sucursal : sucursales){
            nombres.add(sucursal.getSedeNombre());
        }
        return nombres;
     }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }
    public ArrayList<Articulo> getArticulos() {
        return articulos;
    }

    public HashMap<String, String> getLogin() {
        return login;
    }
}
