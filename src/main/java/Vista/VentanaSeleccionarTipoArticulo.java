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

public class VentanaSeleccionarTipoArticulo extends javax.swing.JFrame {
    private Supertlon controlador;
    private Administrativo admin;
    private SucursalGimnasio sucursal;
    
    public VentanaSeleccionarTipoArticulo(Administrativo admin, SucursalGimnasio sucursal) {
        initComponents();
        controlador = Supertlon.getInstance();
        this.admin = admin;
        this.sucursal = sucursal;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtArticuloId = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtArticuloCantidad = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnAgregarArticulos = new javax.swing.JButton();
        msj = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        volverAtras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setText("¿Que tipo de articulo queres agregar a esta sucursal?");

        txtArticuloId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtArticuloIdActionPerformed(evt);
            }
        });

        jLabel1.setText("Ingresa el ID del articulo que quieras agregar");

        txtArticuloCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtArticuloCantidadActionPerformed(evt);
            }
        });

        jLabel2.setText("Cantidad");

        btnAgregarArticulos.setText("Agregar");
        btnAgregarArticulos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarArticulosActionPerformed(evt);
            }
        });

        jLabel4.setText("ID de los articulos");

        jLabel5.setText("SoftTech: 1");

        jLabel6.setText("Pampero: 2");

        jLabel8.setText("Accesorio: 3");

        jLabel9.setText("IronMan: 4");

        jLabel10.setText("Gadnic: 5");

        volverAtras.setText("Volver");
        volverAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverAtrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(volverAtras)
                        .addGap(45, 45, 45)
                        .addComponent(jLabel7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtArticuloId))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2)
                                    .addComponent(txtArticuloCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(123, 123, 123)
                                        .addComponent(btnAgregarArticulos))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6))
                                        .addGap(44, 44, 44)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel8)))
                                    .addComponent(jLabel4))
                                .addGap(44, 44, 44)
                                .addComponent(jLabel10))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(msj)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(volverAtras)
                        .addGap(8, 8, 8)
                        .addComponent(jLabel3)
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtArticuloId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtArticuloCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7)))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addComponent(btnAgregarArticulos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(msj)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtArticuloCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtArticuloCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtArticuloCantidadActionPerformed

    private void txtArticuloIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtArticuloIdActionPerformed

    }//GEN-LAST:event_txtArticuloIdActionPerformed

    private void volverAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverAtrasActionPerformed
        MenuAdministrativo ventanaMenu = new MenuAdministrativo(admin);
        ventanaMenu.setVisible(true);
        ventanaMenu.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_volverAtrasActionPerformed

    private void btnAgregarArticulosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarArticulosActionPerformed
        // TODO add your handling code here:
        String articuloId = txtArticuloId.getText();
        String articuloCantidad = txtArticuloCantidad.getText();
        msj.setText("Verificar que los datos ingresados sean validos");
        String exitos = controlador.añadirArticulosASede(sucursal, articuloId, articuloCantidad);
        msj.setText("Se añadieron " + exitos + " de " + articuloCantidad + " articulos");
    }//GEN-LAST:event_btnAgregarArticulosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarArticulos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel msj;
    private javax.swing.JTextField txtArticuloCantidad;
    private javax.swing.JTextField txtArticuloId;
    private javax.swing.JButton volverAtras;
    // End of variables declaration//GEN-END:variables
}
