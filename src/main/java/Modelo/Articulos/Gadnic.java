package Modelo.Articulos;

import Modelo.GenerarId;
import Modelo.enums.Amortizacion;
import Modelo.enums.UsoPesa;
import java.time.LocalDate;
import java.time.Month;

public class Gadnic extends Pesa{
    private double peso;
    private UsoPesa uso;
    private int desgaste;
    private Amortizacion amortizacion;
    private LocalDate fabricacion;
    private String nombre;
    private String id;
    private String itemId;

    public Gadnic(UsoPesa uso) {
        this.uso = uso;
        this.peso = 2.5;
        this.amortizacion = Amortizacion.POR_USO;
        this.desgaste=25;
        this.nombre = "Mancuerna de Tobillo de 2.5Kg Gadnic";
        this.id = "5";
        this.itemId = GenerarId.generarItemId();
        this.fabricacion = LocalDate.of(2023, 10, 20);
    }

    public int getDesgaste() {
        return desgaste;
    }

    public void setDesgaste(int desgaste) {
        this.desgaste = desgaste;
    }

    public double getPeso() {
        return peso;
    }

    public UsoPesa getUso() {
        return uso;
    }

    public Amortizacion getAmortizacion() {
        return amortizacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getItemId() {
        return itemId;
    }

    public String getId() {
        return id;
    }
    
    
}
