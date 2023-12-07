package Modelo.Articulos;

import Modelo.enums.Amortizacion;
import Modelo.GenerarId;
import java.time.LocalDate;

public class Pampero extends Colchoneta{
    private double ancho;
    private double largo;
    private int desgaste;
    private Amortizacion amortizacion;
    private LocalDate fabricacion;
    private String nombre;
    private String id;
    private String itemId;


    public Pampero() {
        this.ancho = 2;
        this.largo = 0.75;
        this.desgaste = 20;
        this.amortizacion = Amortizacion.POR_USO;
        this.nombre = "Colchoneta de alta densidad Pampero";
        this.id = "2";
        this.itemId = GenerarId.generarItemId();
        this.fabricacion = LocalDate.of(2023, 10, 20);
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


