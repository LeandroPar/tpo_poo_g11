package Modelo.Ejercicios;

import Modelo.enums.Modalidad;

public class KangooJumping extends Ejercicio{
    private Modalidad modalidad;
    private String nombre;
    public KangooJumping() {
        this.modalidad = Modalidad.PRESENCIAL;
        this.nombre = "Kangoo Jumping";
    }

    @Override
    public Modalidad getModalidad() {
        return modalidad;
    }

    @Override
    public String getNombre() {
        return nombre;
    }
}
