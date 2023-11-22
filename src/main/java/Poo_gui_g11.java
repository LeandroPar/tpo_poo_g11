
import Controlador.Supertlon;
import Modelo.enums.Nivel;
import Modelo.enums.TipoLugar;
import Vista.Login;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class Poo_gui_g11 {
    
    public static void main (String[] args) {
        Supertlon controller = Supertlon.getInstance();
        int testData = 0;

        //Declaración de datos de prueba
        if (testData==1) {
            ArrayList<String> lista = new ArrayList<>();
            lista.add("San Lorenzo");
            lista.add("Nunez");
            controller.altaAdministrativo("Jorgito", lista);
            controller.altaAlumno("Jose", Nivel.ORO);
            controller.altaSucursal("Palermo", Nivel.ORO, TipoLugar.SALON, 25, 15000);
            controller.altaSucursal("Liniers", Nivel.BLACK, TipoLugar.SALON, 23, 1500);
            controller.altaSucursal("San Lorenzo", Nivel.PLATINUM, TipoLugar.SALON, 18.5, 1500);
            controller.altaProfesor("Jorgito2", 1500, "Palermo");
            //cargarArticulos pide datos por input
            //controller.cargarArticulos();
            //controller.listarArticulos();
        }
        
        Login login = new Login();
        login.setVisible(true);
        login.setLocationRelativeTo(null);
    }
    
}