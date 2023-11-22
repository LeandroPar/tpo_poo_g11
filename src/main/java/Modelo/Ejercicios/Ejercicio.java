package Modelo.Ejercicios;
import Modelo.enums.Modalidad;

public abstract class Ejercicio {
    private Modalidad modalidad;
    private String nombre;
    public abstract String getNombre();
    public abstract Modalidad getModalidad();
}
