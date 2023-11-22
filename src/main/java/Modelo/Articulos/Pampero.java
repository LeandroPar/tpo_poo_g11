package Modelo.Articulos;

import Modelo.enums.Amortizacion;
import Modelo.GenerarId;

public class Pampero extends Colchoneta{
    private double ancho;
    private double largo;
    private int desgaste;
    private Amortizacion amortizacion;
    private String nombre;
    private int id;
    private int itemId;


    public Pampero() {
        this.ancho = 2;
        this.largo = 0.75;
        this.desgaste = 20;
        this.amortizacion = Amortizacion.POR_USO;
        this.nombre = "Colchoneta de alta densidad Pampero";
        this.id = 2;
        this.itemId = GenerarId.generarItemId();
    }

    public int getDesgaste() {
        return desgaste;
    }

    public void setDesgaste(int desgaste) {
        this.desgaste = desgaste;
    }

    public double getAncho() {
        return ancho;
    }

    public double getLargo() {
        return largo;
    }

    public Amortizacion getAmortizacion() {
        return amortizacion;
    }

    public String getNombre() {
        return nombre;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }
}


