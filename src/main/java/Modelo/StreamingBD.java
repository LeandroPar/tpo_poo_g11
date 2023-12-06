package Modelo;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class StreamingBD {
    private LinkedList<Clase> clasesYoga;
    private LinkedList<Clase> clasesGimnasia;
    private final int yogaCapacidad=10;
    private final int gimnasiaCapacidad=15;

    public StreamingBD() {
        this.clasesYoga = new LinkedList<>();
        this.clasesGimnasia = new LinkedList<>();
    }

    public void addGrabacion(Clase clase) {
        String ejercicio = clase.getEjercicio().getNombre();
        if (ejercicio.equals("Yoga")) {
            if (this.clasesYoga.size() == this.yogaCapacidad) this.clasesYoga.removeFirst();
            this.clasesYoga.addLast(clase);
        }
        else if (ejercicio.equals("Gimnasia Postural")) {
            if (this.clasesGimnasia.size() == this.gimnasiaCapacidad) this.clasesGimnasia.removeFirst();
            this.clasesYoga.addLast(clase);
        }
    }

    public LinkedList<Clase> getClasesYoga() {
        return clasesYoga;
    }

    public LinkedList<Clase> getClasesGimnasia() {
        return clasesGimnasia;
    }
}
