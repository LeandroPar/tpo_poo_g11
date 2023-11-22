package Modelo.Articulos;

import Modelo.GenerarId;
import Modelo.enums.Amortizacion;

public class SoftTech extends Colchoneta{
    private double ancho;
    private double largo;
    private int desgaste;
    private Amortizacion amortizacion;
    private String nombre;
    private int id;
    private String itemId;

    public SoftTech() {
        this.ancho = 1.5;
        this.largo = 0.5;
        this.desgaste = 400;
        this.amortizacion = Amortizacion.POR_FECHA_FABRICACION;
        this.nombre = "Colchoneta liviana SoftTech";
        this.id = 1;
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

    public String getItemId() {
        return itemId;
    }
    
}
