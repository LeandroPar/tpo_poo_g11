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

/**
 *
 * @author Roman
 */
public class GestionarArticulos extends javax.swing.JFrame {
    private Administrativo admin;
    private Supertlon controlador;
    private SucursalGimnasio sucursal;
    
    public GestionarArticulos(Administrativo admin, SucursalGimnasio sucursal) {
        initComponents();
        controlador = Supertlon.getInstance();
        this.admin = admin;
        this.sucursal = sucursal;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        volverAtras = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArticulos = new javax.swing.JTextArea();
        btnListarArticulos = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtItemId = new javax.swing.JTextField();
        btnBajaArticulo = new javax.swing.JButton();
        msjConfirmacion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        volverAtras.setText("Volver");
        volverAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverAtrasActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Gestion de Articulos");

        txtArticulos.setColumns(20);
        txtArticulos.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        txtArticulos.setRows(5);
        jScrollPane1.setViewportView(txtArticulos);

        btnListarArticulos.setText("Listar articulos");
        btnListarArticulos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarArticulosActionPerformed(evt);
            }
        });

        jLabel2.setText("ItemId:");

        btnBajaArticulo.setText("Dar de baja artículo");
        btnBajaArticulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBajaArticuloActionPerformed(evt);
            }
        });

        msjConfirmacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(volverAtras)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(msjConfirmacion, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnListarArticulos)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(18, 18, 18)
                            .addComponent(txtItemId, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 156, Short.MAX_VALUE)
                            .addComponent(btnBajaArticulo))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(volverAtras)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(btnListarArticulos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtItemId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBajaArticulo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(msjConfirmacion)
                .addContainerGap(33, Short.MAX_VALUE))
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

    private void volverAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverAtrasActionPerformed
        VentanaInformacion ventanaMenu = new VentanaInformacion(admin, sucursal);
        ventanaMenu.setVisible(true);
        ventanaMenu.setLocationRelativeTo(null);
    }//GEN-LAST:event_volverAtrasActionPerformed

    private void btnListarArticulosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarArticulosActionPerformed
        // TODO add your handling code here:
        String articulos = controlador.listarArticulos(sucursal);
        txtArticulos.setText(articulos);
    }//GEN-LAST:event_btnListarArticulosActionPerformed

    private void btnBajaArticuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBajaArticuloActionPerformed
        // TODO add your handling code here:
        String itemId = txtItemId.getText();
        msjConfirmacion.setText("Ingresar un ItemId valido");
        int test = Integer.parseInt(itemId);
        if (controlador.bajaArticulo(sucursal, itemId)) {
            msjConfirmacion.setText("El articulo de ItemId " + itemId + " fue dado de baja");
        } else {
            msjConfirmacion.setText("No se encontro un articulo de ItemId " + itemId);
        }
    }//GEN-LAST:event_btnBajaArticuloActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBajaArticulo;
    private javax.swing.JButton btnListarArticulos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel msjConfirmacion;
    private javax.swing.JTextArea txtArticulos;
    private javax.swing.JTextField txtItemId;
    private javax.swing.JButton volverAtras;
    // End of variables declaration//GEN-END:variables
}
