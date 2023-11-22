package Modelo;

public class GenerarId {
    private static int userId=0;
    private static int itemId=0;

    public static int generarUserId() {
        userId++;
        return userId;
    }

    public static int generarItemId() {
        itemId++;
        return itemId;
    }

}
