package Modelo.Ejercicios;
import Modelo.enums.Modalidad;

public class Crossfit extends Ejercicio{
    private Modalidad modalidad;
    private String nombre;
    public Crossfit() {
        this.modalidad = Modalidad.PRESENCIAL;
        this.nombre = "Crossfit";
    }

    public Modalidad getModalidad() {
        return modalidad;
    }

    public String getNombre() {
        return nombre;
    }
}
