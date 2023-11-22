package Modelo;

import java.util.ArrayList;
import java.util.LinkedList;

public class Agenda {
    private ArrayList<Clase> clases;
    private ArrayList<String> dias;

    public Agenda() {
        this.clases = new ArrayList<>();
        this.dias = new ArrayList<>();
    }

    public ArrayList<Clase> getClases() {
        return clases;
    }

    public ArrayList<String> getDias() {
        return dias;
    }

    public void addClase(Clase clase) {
        this.clases.add(clase);
    }
    public void removeClase(Clase clase) {
        this.clases.remove(clase);
    }
    public void addDia(String dia) {
        this.dias.add(dia);
    }
}
