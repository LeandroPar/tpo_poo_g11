
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
        int testData = 1;
        
        //Declaración de datos de prueba
        if (testData==1) {
            ArrayList<String> lista = new ArrayList<>();
            lista.add("San Lorenzo");
            lista.add("Nunez");
            controller.altaAdministrativo("Jorgito", lista);
            ArrayList<String> lista2 = new ArrayList<>();
            controller.altaAdministrativo("Jorgelin", lista2);
            controller.altaAlumno("Jose", "ORO");
            controller.altaSoporte("Marquito"); //Id 4
            controller.altaSucursal("Nunez", "ORO", "Salon", 25, 15000);
            controller.altaSucursal("Liniers", "BLACK", "Salon", 23, 1500);
            controller.altaSucursal("San Lorenzo", "PLATINUM", "Pileta", 18.5, 1500);
            
            //cargarArticulos pide datos por input
            //controller.cargarArticulos();
            //controller.listarArticulos();
        }
        
        Login login = new Login();
        login.setVisible(true);
        login.setLocationRelativeTo(null);
    }
    
}
