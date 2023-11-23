package Modelo.Articulos;

import Modelo.enums.UsoPesa;

public abstract class Pesa extends Articulo {
    private double peso;
    private UsoPesa uso;

    public UsoPesa getUso() {
        return uso;
    }
    
    
}
