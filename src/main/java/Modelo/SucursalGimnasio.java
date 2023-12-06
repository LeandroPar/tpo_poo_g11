package Modelo;

import Modelo.enums.Nivel;
import Modelo.Articulos.*;
import Modelo.enums.TipoLugar;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;

public class SucursalGimnasio {
    private String sedeNombre;
    private Nivel nivel;
    private Lugar lugar;
    private ArrayList<Articulo> sedeArticulos;
    private int alquiler;
    private ArrayList<Clase> clases;
    private ArrayList<Profesor> profesores;
    private StreamingBD grabaciones;

    public SucursalGimnasio(String sedeNombre, Nivel nivel, TipoLugar lugar, double superficie, int alquiler) {
        this.sedeNombre = sedeNombre;
        this.nivel = nivel;
        this.lugar = new Lugar(superficie, lugar);
        this.alquiler = alquiler;
        this.sedeArticulos = new ArrayList<>();
        this.clases = new ArrayList<>();
        this.profesores = new ArrayList<>();
        this.grabaciones = new StreamingBD();
    }

    public String getSedeNombre() {
        return sedeNombre;
    }

    public Nivel getNivel() {
        return nivel;
    }

    public Lugar getLugar() {
        return lugar;
    }

    public int getAlquiler() {
        return alquiler;
    }

    public ArrayList<Clase> getClases() {
        return clases;
    }

    public ArrayList<Articulo> getSedeArticulos() {return sedeArticulos;}

    public ArrayList<Articulo> getArticulos(){ return sedeArticulos;}

    public StreamingBD getGrabaciones() {
        return grabaciones;
    }

    public void addClase(Clase clase) {
        this.clases.add(clase);
    }

    public void removeClase(Clase clase) {
        this.clases.remove(clase);
    }

    public void setNivel(Nivel nivel) {
        this.nivel = nivel;
    }

    public void setAlquiler(int alquiler) {
        this.alquiler = alquiler;
    }

    public void addArticulo(Articulo articulo) {this.sedeArticulos.add(articulo); }

    public ArrayList<Profesor> getProfesores() {
        return profesores;
    }
    public void addProfesor(Profesor profesor) {this.profesores.add(profesor);}

    //Si el dia es el mismo --> si (start1 <= end2 and start2 <= end1) devuelvo true [hay colision]
    public boolean colisionHorario(LocalDateTime horario, LocalTime duracion) {
        LocalDateTime horarioFinal = horario.plusHours(duracion.getHour()).plusMinutes(duracion.getMinute());
        for (Clase clase : this.clases) {
            LocalDateTime hora2 = clase.getHorario();
            if ( horario.toLocalDate().equals( hora2.toLocalDate() ) ) {
                LocalTime duracion2 = clase.getDuracion();
                LocalDateTime hora2Final = hora2.plusHours(duracion2.getHour()).plusMinutes(duracion2.getMinute());
                if ( horario.isBefore(hora2Final) && hora2.isBefore(horarioFinal) ) {
                    return true;
                }
            }
        }
    return false;
    }
}
