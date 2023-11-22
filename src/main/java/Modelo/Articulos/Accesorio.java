package Modelo.Articulos;

import Modelo.GenerarId;

public class Accesorio extends Articulo {
    private int desgaste;
    private String nombre;
    private int id;
    private int itemId;

    public Accesorio(String nombre) {
        this.nombre = nombre;
        this.desgaste = -1;
        this.id = 3;
        this.itemId = GenerarId.generarItemId();
    }

    public String getNombre() {
        return nombre;
    }
}
