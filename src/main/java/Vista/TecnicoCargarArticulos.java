/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Controlador.Supertlon;
import Modelo.SucursalGimnasio;
import Modelo.Usuarios.Administrativo;
import Modelo.Usuarios.SoporteTecnico;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TecnicoCargarArticulos extends javax.swing.JFrame {
    private Supertlon controlador;
    private SoporteTecnico tecnico;
    private Administrativo admin;
    public TecnicoCargarArticulos( SoporteTecnico tecnico) {
        initComponents();
        controlador = Supertlon.getInstance();
        this.tecnico = tecnico;
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
        comboUso = new javax.swing.JComboBox<>();
        txtUso = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtAccesorio = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setText("¿Que tipo de articulo queres agregar a esta sucursal?");

        txtArticuloId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtArticuloIdActionPerformed(evt);
            }
        });

        jLabel1.setText("ID del articulo");

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

        comboUso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "De Mano", "Tobilleras", "Discos" }));

        txtUso.setText("Uso (Pesas)");

        jLabel11.setText("Nombre (Accesorios):");

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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtArticuloId)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel2)
                                        .addComponent(txtArticuloCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(comboUso, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtUso, javax.swing.GroupLayout.Alignment.TRAILING)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addGap(27, 27, 27)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel5)
                                                .addComponent(jLabel6))
                                            .addGap(44, 44, 44)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel9)
                                                .addComponent(jLabel8)))
                                        .addComponent(jLabel4)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(54, 54, 54)
                                            .addComponent(msj)))
                                    .addGap(44, 44, 44)
                                    .addComponent(jLabel10))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(105, 105, 105)
                                    .addComponent(btnAgregarArticulos)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAccesorio, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)))))
                .addContainerGap(55, Short.MAX_VALUE))
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
                            .addComponent(jLabel2)
                            .addComponent(txtUso))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtArticuloId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtArticuloCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboUso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtAccesorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnAgregarArticulos)
                .addGap(4, 4, 4)
                .addComponent(msj)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        TecnicoMenu ventanaMenu = new TecnicoMenu(tecnico);
        ventanaMenu.setVisible(true);
        ventanaMenu.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_volverAtrasActionPerformed

    private void btnAgregarArticulosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarArticulosActionPerformed
        // TODO add your handling code here:
        msj.setText("Verificar que los datos ingresados sean validos");
        String articuloId = txtArticuloId.getText();
        int articuloCantidad = Integer.parseInt(txtArticuloCantidad.getText());
        String uso = comboUso.getSelectedItem().toString();
        String nombreAccesorio = txtAccesorio.getText();
        controlador.cargarArticulos(articuloId, articuloCantidad, uso, nombreAccesorio);        
        msj.setText("Carga de articulos exitosa");
    }//GEN-LAST:event_btnAgregarArticulosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarArticulos;
    private javax.swing.JComboBox<String> comboUso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JTextField txtAccesorio;
    private javax.swing.JTextField txtArticuloCantidad;
    private javax.swing.JTextField txtArticuloId;
    private javax.swing.JLabel txtUso;
    private javax.swing.JButton volverAtras;
    // End of variables declaration//GEN-END:variables
}
