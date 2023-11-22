package Modelo;

import Modelo.Ejercicios.Ejercicio;
import Modelo.Usuarios.Alumno;
import Modelo.enums.ClaseEstado;

import java.time.LocalDateTime;
import java.time.LocalTime;
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

    @Override
    public String toString() {
        return "Clase de " + ejercicio.toString() +
                " - Capacidad: " + capacidad +
                "- Profesor: " + profesor.getNombre() +
                "- Costo: " + costo +
                "- Fecha y hora: " + horario.toString() +
                "- Duracion: " + duracion;
    }
}
