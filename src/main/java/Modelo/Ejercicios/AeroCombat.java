package Modelo.Ejercicios;

import Modelo.enums.Modalidad;

public class AeroCombat extends Ejercicio{
    private Modalidad modalidad;
    private String nombre;
    public AeroCombat() {
        this.modalidad = Modalidad.PRESENCIAL;
        this.nombre = "Aero Combat";
    }

    public Modalidad getModalidad() {
        return modalidad;
    }

    public String getNombre() {
        return nombre;
    }
}
