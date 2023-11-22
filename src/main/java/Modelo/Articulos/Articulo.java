package Modelo.Articulos;

public abstract class Articulo {
    private int desgaste;
    private int id;
    private String itemId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

}
