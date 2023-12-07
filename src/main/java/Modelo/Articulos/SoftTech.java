package Modelo.Articulos;

import Modelo.GenerarId;
import Modelo.enums.Amortizacion;
import java.time.LocalDate;

public class SoftTech extends Colchoneta{
    private double ancho;
    private double largo;
    private int desgaste;
    private Amortizacion amortizacion;
    private LocalDate fabricacion;
    private String nombre;
    private String id;
    private String itemId;

    public SoftTech() {
        this.ancho = 1.5;
        this.largo = 0.5;
        this.desgaste = 400;
        this.amortizacion = Amortizacion.POR_FECHA_FABRICACION;
        this.nombre = "Colchoneta liviana SoftTech";
        this.id = "1";
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

    public String getItemId() {
        return itemId;
    }

    public LocalDate getFabricacion() {
        return fabricacion;
    }

    public void setFabricacion(LocalDate fabricacion) {
        this.fabricacion = fabricacion;
    }
    
}
