package Modelo.Usuarios;

import Modelo.GenerarId;

public class SoporteTecnico extends Usuario {
    private String nombre;
    private String id;

    public SoporteTecnico(String nombre) {
        this.nombre = nombre;
        this.id = GenerarId.generarUserId();
    }

    public String getNombre() {
        return nombre;
    }

    public String getId() {
        return id;
    }
}
