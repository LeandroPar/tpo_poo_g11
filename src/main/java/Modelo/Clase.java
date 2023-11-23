package Modelo;

import Modelo.Articulos.Articulo;
import Modelo.Ejercicios.Ejercicio;
import Modelo.Usuarios.Alumno;
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
    private int costo;
    private LocalDateTime horario;
    private LocalTime duracion;
    private ClaseEstado estado;
    private ArrayList<Articulo> articulos;
    
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
        String ejercicio = this.getEjercicio().getNombre();
        switch (ejercicio) {
            case "Crossfit":
                
            case "Aero Combat":
                    
            case "Gimnasia Postural":
                
            case "Kangoo Jumping":
                
            case "Yoga":
        }
        
        int balance = costo + ingreso;
        if (balance < 0) {
            this.estado = ClaseEstado.AGENDADA;
        }
        else if (balance > 0) {
            this.estado = ClaseEstado.CONFIRMADA;
        }
    }

    public void addAlumno(Alumno alumno) {
        this.alumnos.add(alumno);
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

    public int getCosto() {
        return costo;
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

    @Override
    public String toString() {
        return "Clase de " + ejercicio.toString() +
                " - Capacidad: " + capacidad +
                "- Profesor: " + profesor.getNombre() + "\n" +
                "Costo: " + costo +
                "- Fecha y hora: " + horario.toString() +
                "- Duracion: " + duracion;
    }
}
