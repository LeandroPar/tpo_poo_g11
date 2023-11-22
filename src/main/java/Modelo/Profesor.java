package Modelo;

import jdk.jfr.Timespan;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Profesor {
    private String nombre;
    private int Sueldo;
    private Agenda agenda;

    public Profesor(String nombre, int sueldo) {
        this.nombre = nombre;
        Sueldo = sueldo;
        this.agenda = new Agenda();
    }

    public int getSueldo() {
        return Sueldo;
    }

    public void setSueldo(int sueldo) {
        Sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public Agenda getAgenda() {
        return agenda;
    }

    public boolean estaDisponible(LocalDateTime horario, LocalTime duracion) {
        return true;
    }
}
