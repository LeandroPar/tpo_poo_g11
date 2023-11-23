package Modelo;

import jdk.jfr.Timespan;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;

public class Profesor {
    private String nombre;
    private int Sueldo;
    private Agenda agenda;

    public Profesor(String nombre, int sueldo) {
        this.nombre = nombre;
        Sueldo = sueldo;
        this.agenda = new Agenda();
    }
    
    public Profesor(String nombre, int sueldo, ArrayList<String> dias) {
        this.nombre = nombre;
        Sueldo = sueldo;
        this.agenda = new Agenda();
        this.agenda.setDias(dias);
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

    public String estaDisponible(LocalDateTime horario, LocalTime duracion) {
        int max = 3;
        LocalDateTime horarioFinal = horario.plusHours(duracion.getHour() + 3).plusMinutes(duracion.getMinute());
        for (Clase clase : this.agenda.getClases()) {
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
}
