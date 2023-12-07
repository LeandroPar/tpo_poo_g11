package Modelo.Articulos;

import Modelo.SucursalGimnasio;
import Modelo.enums.Amortizacion;
import java.time.Duration;
import java.time.LocalDate;

public abstract class Articulo {
    private String nombre;
    private Amortizacion amortizacion;
    private LocalDate fabricacion;
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

    public LocalDate getFabricacion() {
        return fabricacion;
    }

    public void setFabricacion(LocalDate fabricacion) {
        this.fabricacion = fabricacion;
    }
    

    @Override
    public String toString() {
        return "ItemId: " + itemId + " - " + nombre + ", desgaste=" + desgaste + ", amortizacion " + amortizacion; 
    }
    
    public boolean amortizar(SucursalGimnasio sucursal) {
        boolean eliminado = false;
        if (this.amortizacion.equals(Amortizacion.POR_USO)) {
            this.desgaste--;
            if (this.desgaste==0) {
                eliminado = true;
            } else {
                sucursal.addArticulo(this);
            }
        } else {
            LocalDate hoy = LocalDate.now();
            long diasvida = Duration.between(fabricacion, hoy).toDays();
            if (diasvida==desgaste) {
                eliminado = true;
            } else {
                sucursal.addArticulo(this);
            }
        }
        return eliminado;
    }
    
    
}
