package Modelo;

import Modelo.enums.TipoLugar;

public class Lugar {
    private double superficieM2;
    private TipoLugar nombre;

    public Lugar(double superficieM2, TipoLugar nombre) {
        this.superficieM2 = superficieM2;
        this.nombre = nombre;
    }
    public double getSuperficieM2() {
        return superficieM2;
    }

    public TipoLugar getNombre() {
        return nombre;
    }
}
