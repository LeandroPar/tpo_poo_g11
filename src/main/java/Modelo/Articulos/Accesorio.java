package Modelo.Articulos;

import Modelo.GenerarId;

public class Accesorio extends Articulo {
    private int desgaste;
    private String nombre;
    private String id;
    private String itemId;

    public Accesorio(String nombre) {
        this.nombre = nombre;
        this.desgaste = -1;
        this.id = "3";
        this.itemId = GenerarId.generarItemId();
    }

    public int getDesgaste() {
        return desgaste;
    }

    public void setDesgaste(int desgaste) {
        this.desgaste = desgaste;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }
    
    
}
