package Modelo;

import Modelo.Articulos.Articulo;
import Modelo.Ejercicios.*;
import Modelo.Usuarios.Alumno;
import Modelo.enums.Amortizacion;
import Modelo.enums.ClaseEstado;
import Modelo.enums.TipoLugar;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.LinkedList;

public class Clase {
    private int capacidad;
    private Ejercicio ejercicio;
    private LinkedList<Alumno> alumnos;
    private Profesor profesor;
    private LocalDateTime horario;
    private LocalTime duracion;
    private ClaseEstado estado;
    private ArrayList<Articulo> articulos;
    private String sede;
    
    public void actualizar(SucursalGimnasio sucursal) {
        int costo = 0;
        int ingreso = 0;
        costo += this.profesor.getSueldo()/90;
        TipoLugar lugar = sucursal.getLugar().getNombre();
        int horas = this.duracion.getHour() + this.duracion.getMinute()/60;
        switch (lugar) {
            case SALON:
                costo += sucursal.getAlquiler()/300;
                break;
            case PILETA:
                costo += sucursal.getAlquiler()/150;
                break;
            case AIRE_LIBRE:
                costo += 500*sucursal.getLugar().getSuperficieM2()/horas;
                break;
            default:
                break;
        }
        for (Alumno alumno : this.alumnos) {
            ingreso += alumno.getCostoMembresia()/30;
        }
        //Costos arbitrarios: POR USO -> costo 5 ; POR FECHA -> costo 2
        for (Articulo articulo : this.articulos) {
            if (articulo.getAmortizacion().equals(Amortizacion.POR_USO)) {
                costo += 5;
            } else {
                costo += (this.duracion.getHour()/8) * 2;
            }
        }
        
        int balance = costo + ingreso;
        if (balance < 0) {
            this.estado = ClaseEstado.AGENDADA;
        }
        else if (balance > 0) {
            this.estado = ClaseEstado.CONFIRMADA;
        }
    }

    public Clase(String ejercicio, Profesor profesor, LocalDateTime horario, LocalTime duracion, String sede) {
        this.capacidad = 30;
        switch (ejercicio) {
            case "Crossfit": 
                this.ejercicio = new Crossfit();
                break;
            case "Yoga": 
                this.ejercicio = new Yoga();
                break;
            case "Kangoo Jumping": 
                this.ejercicio = new KangooJumping();
                break;
            case "Gimnasia Postural": 
                this.ejercicio = new GimnasiaPostural();
                break;
            case "Aero Combat":
                this.ejercicio = new AeroCombat();
                break;
        }
        this.alumnos = new LinkedList<>();
        this.profesor = profesor;
        this.horario = horario;
        this.duracion = duracion;
        this.sede = sede;
    }

    
    public void addAlumno(Alumno alumno, boolean virtual) {
        this.alumnos.add(alumno);
        if (!virtual) this.capacidad--;
    }
    public int getCapacidad() {
        return capacidad;
    }

    public Ejercicio getEjercicio() {
        return ejercicio;
    }

    public LinkedList<Alumno> getAlumnos() {
        return alumnos;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public LocalDateTime getHorario() {
        return horario;
    }

    public LocalTime getDuracion() {
        return duracion;
    }

    public ClaseEstado getEstado() {
        return estado;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public void setEstado(ClaseEstado estado) {
        this.estado = estado;
    }

    public ArrayList<Articulo> getArticulos() {
        return articulos;
    }
    
    public void addArticulo(Articulo articulo) {
        this.articulos.add(articulo);
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }
    

    @Override
    public String toString() {
        return "- Sede: " + sede + "\n" + ""
                + "- Clase de " + ejercicio.getNombre() + "\n" +
                "- Capacidad: " + capacidad + "\n" +
                "- Profesor: " + profesor.getNombre() + "\n" +
                "- Fecha y hora: " + horario.toString() + "\n" +
                "- Duracion: " + duracion;
    }
}
