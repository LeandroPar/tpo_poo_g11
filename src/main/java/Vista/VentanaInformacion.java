/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;
import Controlador.Supertlon;
import Modelo.SucursalGimnasio;
import Modelo.Usuarios.Administrativo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class VentanaInformacion extends javax.swing.JFrame {
    private Supertlon supertlon;
    private SucursalGimnasio sucursal;
    private Administrativo admin;
    
    public VentanaInformacion(Administrativo admin, SucursalGimnasio sucursal) {
        initComponents();
        supertlon = Supertlon.getInstance();
        this.admin = admin;
        this.sucursal = sucursal;
        nombreSucursal.setText(sucursal.getSedeNombre());
        
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
        btnAgendarClase = new javax.swing.JButton();
        bajaCliente = new javax.swing.JButton();
        gestionarClase = new javax.swing.JButton();
        nombreSucursal = new javax.swing.JLabel();
        botonVolver = new javax.swing.JButton();
        btnGestionarProfesores = new javax.swing.JButton();

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

        btnAgendarClase.setText("Agendar Clase");
        btnAgendarClase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgendarClaseActionPerformed(evt);
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

        nombreSucursal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        botonVolver.setText("Volver");
        botonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverActionPerformed(evt);
            }
        });

        btnGestionarProfesores.setText("Gestionar Profesores");
        btnGestionarProfesores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionarProfesoresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnAgendarClase)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(gestionarClase))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(cargarCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bajaCliente))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(agregarArticulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(gestionarArticulos))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(claseStreaming)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                        .addComponent(btnGestionarProfesores)))
                .addGap(32, 32, 32))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonVolver)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombreSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(botonVolver)
                .addGap(1, 1, 1)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nombreSucursal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agregarArticulo)
                    .addComponent(gestionarArticulos))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cargarCliente)
                    .addComponent(bajaCliente))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gestionarClase)
                    .addComponent(btnAgendarClase))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(claseStreaming, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGestionarProfesores))
                .addGap(64, 64, 64))
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
        VentanaSeleccionarTipoArticulo ventana = new VentanaSeleccionarTipoArticulo(admin, sucursal);
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_agregarArticuloActionPerformed

    private void cargarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargarClienteActionPerformed
        CargarCliente ventanaCargarCliente = new CargarCliente(admin, sucursal);
        ventanaCargarCliente.setVisible(true);
        ventanaCargarCliente.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_cargarClienteActionPerformed

    private void claseStreamingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_claseStreamingActionPerformed
        ClasesStreaming ventanaStreaming = new ClasesStreaming(admin, sucursal);
        ventanaStreaming.setVisible(true);
        ventanaStreaming.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_claseStreamingActionPerformed

    private void bajaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bajaClienteActionPerformed
        BajaCliente ventanaBajaCliente = new BajaCliente(admin, sucursal);
        ventanaBajaCliente.setVisible(true);
        ventanaBajaCliente.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_bajaClienteActionPerformed

    private void gestionarClaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gestionarClaseActionPerformed
        GestionarClase ventanaGestionarClase = new GestionarClase(admin, sucursal);
        ventanaGestionarClase.setVisible(true);
        ventanaGestionarClase.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_gestionarClaseActionPerformed

    private void btnAgendarClaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgendarClaseActionPerformed
        AgendarClase ventanaAgenda = new AgendarClase(admin, sucursal);
        ventanaAgenda.setVisible(true);
        ventanaAgenda.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnAgendarClaseActionPerformed

    private void gestionarArticulosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gestionarArticulosActionPerformed
        GestionarArticulos ventanaArticulos = new GestionarArticulos(admin, sucursal);
        ventanaArticulos.setVisible(true);
        ventanaArticulos.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_gestionarArticulosActionPerformed

    private void botonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverActionPerformed
        MenuAdministrativo ventanaMenu = new MenuAdministrativo(admin);
        ventanaMenu.setVisible(true);
        ventanaMenu.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_botonVolverActionPerformed

    private void btnGestionarProfesoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionarProfesoresActionPerformed
        // TODO add your handling code here:
        GestionarProfesores ventanaProfesores = new GestionarProfesores(admin, sucursal);
        ventanaProfesores.setVisible(true);
        ventanaProfesores.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnGestionarProfesoresActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarArticulo;
    private javax.swing.JButton bajaCliente;
    private javax.swing.JButton botonVolver;
    private javax.swing.JButton btnAgendarClase;
    private javax.swing.JButton btnGestionarProfesores;
    private javax.swing.JButton cargarCliente;
    private javax.swing.JButton claseStreaming;
    private javax.swing.JButton gestionarArticulos;
    private javax.swing.JButton gestionarClase;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel nombreSucursal;
    // End of variables declaration//GEN-END:variables
}
