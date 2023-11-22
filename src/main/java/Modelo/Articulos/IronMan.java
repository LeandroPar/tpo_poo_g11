package Modelo.Articulos;
import Modelo.GenerarId;
import Modelo.enums.Amortizacion;
import Modelo.enums.UsoPesa;
public class IronMan extends Pesa{
    private double peso;
    private UsoPesa uso;
    private int desgaste;
    private Amortizacion amortizacion;
    private String nombre;
    private int id;
    private int itemId;

    public IronMan(UsoPesa uso) {
        this.uso = uso;
        this.peso = 2.5;
        this.amortizacion = Amortizacion.POR_FECHA_FABRICACION;
        this.desgaste = 200;
        this.nombre = "Mancuerna de Tobillo de 2.5Kg IronMan";
        this.id = 4;
        this.itemId = GenerarId.generarItemId();
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
}
