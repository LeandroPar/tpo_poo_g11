package Modelo.Articulos;

import Modelo.enums.Amortizacion;

public abstract class Articulo {
    private String nombre;
    private Amortizacion amortizacion;
    private int desgaste;
    private String id;
    private String itemId;

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

    public Amortizacion getAmortizacion() {
        return amortizacion;
    }

    public void setAmortizacion(Amortizacion amortizacion) {
        this.amortizacion = amortizacion;
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

    @Override
    public String toString() {
        return "ItemId: " + itemId + " - " + nombre + ", desgaste=" + desgaste + ", amortizacion " + amortizacion; 
    }
    
    
}
