package Modelo;

import jdk.jfr.Timespan;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;

public class Profesor {
    private String nombre;
    private int Sueldo;
    private ArrayList<Clase> agenda;

    public Profesor(String nombre, int sueldo) {
        this.nombre = nombre;
        Sueldo = sueldo;
        this.agenda = new ArrayList<>();
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

    public ArrayList<Clase> getAgenda() {
        return agenda;
    }
    
    public void addClase(Clase clase) {
        this.agenda.add(clase);
    }
    
    public void removeClase(Clase clase) {
        this.agenda.remove(clase);
    }

    public String estaDisponible(LocalDateTime horario, LocalTime duracion) {
        int max = 3;
        LocalDateTime horarioFinal = horario.plusHours(duracion.getHour() + 3).plusMinutes(duracion.getMinute());
        for (Clase clase : this.agenda) {
            if (max==0) return "El profesor ya tiene 3 clases en el dia ingresado";
            LocalDateTime horario2 = clase.getHorario();
            if ( horario.toLocalDate().equals(horario2.toLocalDate())) {
                max--;
                LocalTime duracion2 = clase.getDuracion();
                LocalDateTime horario2Final = horario2.plusHours(duracion2.getHour()).plusMinutes(duracion2.getMinute());
                if ( horario.isBefore(horario2Final) && horario2.isBefore(horarioFinal)) {
                    return "El profesor ya tiene una clase en ese horario";
                }
            }
        }
        return "Profesor disponible";
    }

    @Override
    public String toString() {
        return "Profesor "  + nombre + " - Sueldo: " + Sueldo;
    }
    
}
