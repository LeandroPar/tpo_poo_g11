package Modelo.Usuarios;

public class SoporteTecnico extends Usuario {
    private String nombre;
    private int id;

    public SoporteTecnico(String nombre) {
        this.nombre = nombre;
        //this.id = GenerarId();
    }

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }
}
