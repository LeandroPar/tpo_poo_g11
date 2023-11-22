package Modelo.Usuarios;

import java.util.ArrayList;
import Modelo.GenerarId;

public class Administrativo extends Usuario {
    private String nombre;
    private String id;
    private ArrayList<String> sedes;

    public Administrativo(String nombre, ArrayList<String> sedes) {
        this.nombre = nombre;
        this.sedes = sedes;
        this.id = GenerarId.generarUserId();
    }

    public String getNombre() {
        return nombre;
    }

    public String getId() {
        return id;
    }

    public ArrayList<String> getSedes() {
        return sedes;
    }

    public void addSede(String nombreSede) {
        this.sedes.add(nombreSede);
    }
}
