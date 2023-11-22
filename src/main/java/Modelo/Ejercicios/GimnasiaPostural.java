package Modelo.Ejercicios;

import Modelo.enums.Modalidad;

import java.util.Queue;

public class GimnasiaPostural extends Ejercicio{
    private Modalidad modalidad;
    private String nombre;

    public GimnasiaPostural() {
        this.modalidad = Modalidad.ONLINE;
        this.nombre = "Gimnasia Postural";
    }

    public Modalidad getModalidad() {
        return modalidad;
    }

    public String getNombre() {
        return nombre;
    }
}


