package Modelo.Usuarios;

import Modelo.Clase;
import Modelo.GenerarId;
import Modelo.enums.Nivel;

import java.util.ArrayList;

public class Alumno extends Usuario{
    private String nombre;
    private Nivel membresia;
    private int costoMembresia;
    private ArrayList<Clase> clases;
    private int id;

    public Alumno(String nombre, Nivel membresia) {
        this.nombre = nombre;
        this.membresia = membresia;
        if (membresia.equals("BLACK")) this.costoMembresia = 1000;
        else if (membresia.equals("ORO")) this.costoMembresia = 2000;
        else this.costoMembresia = 3000;
        this.clases = new ArrayList<>();
        this.id = GenerarId.generarUserId();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Nivel getMembresia() {
        return membresia;
    }

    public void setMembresia(Nivel membresia) {
        this.membresia = membresia;
    }

    public int getCostoMembresia() {
        return costoMembresia;
    }

    public void setCostoMembresia(int costoMembresia) {
        this.costoMembresia = costoMembresia;
    }

    public ArrayList<Clase> getClases() {
        return clases;
    }
    public void addClase(Clase clase) {
        this.clases.add(clase);
    }

    public void removeClase(Clase clase) {
        this.clases.remove(clase);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Alumno - " +
                "Nombre: " + nombre +
                ", Membresia: " + membresia +
                " (Costo: " + costoMembresia +
                "), Id: " + id;
    }
}
