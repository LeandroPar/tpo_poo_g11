package Modelo.Articulos;
import Modelo.GenerarId;
import Modelo.enums.Amortizacion;
import Modelo.enums.UsoPesa;
import java.time.LocalDate;
public class IronMan extends Pesa{
    private double peso;
    private UsoPesa uso;
    private int desgaste;
    private Amortizacion amortizacion;
    private LocalDate fabricacion;
    private String nombre;
    private String id;
    private String itemId;

    public IronMan(UsoPesa uso) {
        this.uso = uso;
        this.peso = 2.5;
        this.amortizacion = Amortizacion.POR_FECHA_FABRICACION;
        this.desgaste = 200;
        this.nombre = "Mancuerna de Tobillo de 2.5Kg IronMan";
        this.id = "4";
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

    public LocalDate getFabricacion() {
        return fabricacion;
    }

    public void setFabricacion(LocalDate fabricacion) {
        this.fabricacion = fabricacion;
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
