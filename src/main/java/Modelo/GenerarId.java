package Modelo;

public class GenerarId {
    private static int userId=0;
    private static int itemId=0;

    public static String generarUserId() {
        userId++;
        return Integer.toString(userId);
    }

    public static String generarItemId() {
        itemId++;
        return Integer.toString(itemId);
    }

}
