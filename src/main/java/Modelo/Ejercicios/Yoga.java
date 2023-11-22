package Modelo.Ejercicios;
import Modelo.enums.Modalidad;

import java.util.Queue;

public class Yoga extends Ejercicio{
    private Modalidad modalidad;
    private String nombre;
    public Yoga() {
        this.modalidad= Modalidad.ONLINE;
        this.nombre= "Yoga";
    }

    public Modalidad getModalidad() {
        return modalidad;
    }

    public String getNombre() {
        return nombre;
    }
}
