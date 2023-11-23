/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;
import Controlador.Supertlon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class VentanaInformacion extends javax.swing.JFrame {

    private Supertlon supertlon;
    private String nombre;
    public VentanaInformacion(String nombre) {
        initComponents();
        supertlon = Supertlon.getInstance();
        this.nombreSucursal.setText(nombre);
        
        agregarArticulo.setSelected(false);
        agenda.setSelected(false);
        bajaCliente.setSelected(false);
        cargarCliente.setSelected(false);
        claseStreaming.setSelected(false);
        gestionarArticulos.setSelected(false);
        gestionarClase.setSelected(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        agregarArticulo = new javax.swing.JButton();
        cargarCliente = new javax.swing.JButton();
        gestionarArticulos = new javax.swing.JButton();
        claseStreaming = new javax.swing.JButton();
        agenda = new javax.swing.JButton();
        bajaCliente = new javax.swing.JButton();
        gestionarClase = new javax.swing.JButton();
        nombreSucursal = new javax.swing.JLabel();
        botonVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Informacion de la sucursal");

        agregarArticulo.setText("Agregar Articulo");
        agregarArticulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarArticuloActionPerformed(evt);
            }
        });

        cargarCliente.setText("Cargar Cliente");
        cargarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargarClienteActionPerformed(evt);
            }
        });

        gestionarArticulos.setText("Gestionar Articulos");
        gestionarArticulos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gestionarArticulosActionPerformed(evt);
            }
        });

        claseStreaming.setText("Clases Streaming");
        claseStreaming.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                claseStreamingActionPerformed(evt);
            }
        });

        agenda.setText("Agenda");
        agenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agendaActionPerformed(evt);
            }
        });

        bajaCliente.setText("Baja Cliente");
        bajaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bajaClienteActionPerformed(evt);
            }
        });

        gestionarClase.setText("Gestionar Clase");
        gestionarClase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gestionarClaseActionPerformed(evt);
            }
        });

        botonVolver.setText("Volver");
        botonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bajaCliente)
                                    .addComponent(cargarCliente))
                                .addGap(12, 12, 12))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(agregarArticulo)))
                        .addGap(94, 94, 94)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(claseStreaming)
                            .addComponent(gestionarArticulos)
                            .addComponent(agenda)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(nombreSucursal)))
                .addContainerGap(26, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(gestionarClase))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(jLabel1))
                    .addComponent(botonVolver))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(botonVolver)
                .addGap(1, 1, 1)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(nombreSucursal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(agregarArticulo)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bajaCliente)
                    .addComponent(agenda))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cargarCliente)
                    .addComponent(gestionarArticulos))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gestionarClase)
                    .addComponent(claseStreaming))
                .addGap(57, 57, 57))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void agregarArticuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarArticuloActionPerformed
       agregarArticulo.addActionListener(new ActionListener(){

       public void actionPerformed(ActionEvent  e){
           VentanaSeleccionarTipoArticulo ventana = new VentanaSeleccionarTipoArticulo();
           ventana.setVisible(true);
           ventana.setLocationRelativeTo(null);
       }
            
    });
        
    }//GEN-LAST:event_agregarArticuloActionPerformed

    private void cargarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargarClienteActionPerformed
        cargarCliente.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e){
               CargarCliente ventanaCargarCliente = new CargarCliente();
               ventanaCargarCliente.setVisible(true);
               ventanaCargarCliente.setLocationRelativeTo(null);
           } 
        });
    }//GEN-LAST:event_cargarClienteActionPerformed

    private void claseStreamingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_claseStreamingActionPerformed
        claseStreaming.addActionListener(new ActionListener(){
        
            public void actionPerformed(ActionEvent e){
                ClasesStreaming ventanaStreaming = new ClasesStreaming();
                ventanaStreaming.setVisible(true);
                ventanaStreaming.setLocationRelativeTo(null);
            }
        
        });
    }//GEN-LAST:event_claseStreamingActionPerformed

    private void bajaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bajaClienteActionPerformed
        bajaCliente.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                BajaCliente ventanaBajaCliente = new BajaCliente();
                ventanaBajaCliente.setVisible(true);
                ventanaBajaCliente.setLocationRelativeTo(null);
            }
        });
    }//GEN-LAST:event_bajaClienteActionPerformed

    private void gestionarClaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gestionarClaseActionPerformed
        gestionarClase.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e){
               GestionarClase ventanaGestionarClase = new GestionarClase();
               ventanaGestionarClase.setVisible(true);
               ventanaGestionarClase.setLocationRelativeTo(null);
           } 
        });
    }//GEN-LAST:event_gestionarClaseActionPerformed

    private void agendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agendaActionPerformed
        agenda.addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent e){
                Agenda ventanaAgenda = new Agenda();
                ventanaAgenda.setVisible(true);
                ventanaAgenda.setLocationRelativeTo(null);
            }
            
        });
    }//GEN-LAST:event_agendaActionPerformed

    private void gestionarArticulosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gestionarArticulosActionPerformed
        gestionarArticulos.addActionListener(new ActionListener(){
        
            public void actionPerformed(ActionEvent e){
                GestionarArticulos ventanaArticulos = new GestionarArticulos();
                ventanaArticulos.setVisible(true);
                ventanaArticulos.setLocationRelativeTo(null);
            }
        
        });
    }//GEN-LAST:event_gestionarArticulosActionPerformed

    private void botonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverActionPerformed
        botonVolver.addActionListener(new ActionListener(){
        
            public void actionPerformed(ActionEvent e){
                MenuAdministrativo ventanaMenu = new MenuAdministrativo();
                ventanaMenu.setVisible(true);
                ventanaMenu.setLocationRelativeTo(null);
                
                
            }
            
        });
    }//GEN-LAST:event_botonVolverActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agenda;
    private javax.swing.JButton agregarArticulo;
    private javax.swing.JButton bajaCliente;
    private javax.swing.JButton botonVolver;
    private javax.swing.JButton cargarCliente;
    private javax.swing.JButton claseStreaming;
    private javax.swing.JButton gestionarArticulos;
    private javax.swing.JButton gestionarClase;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel nombreSucursal;
    // End of variables declaration//GEN-END:variables
}
