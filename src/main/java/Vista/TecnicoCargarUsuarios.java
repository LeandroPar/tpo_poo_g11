/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Controlador.Supertlon;
import Modelo.Usuarios.SoporteTecnico;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class TecnicoCargarUsuarios extends javax.swing.JFrame {
    private Supertlon controlador;
    private SoporteTecnico tecnico;
    private ArrayList<String> sedes;

    /**
     * Creates new form TecnicoCargarUsuarios
     */
    public TecnicoCargarUsuarios(SoporteTecnico tecnico) {
        initComponents();
        controlador = Supertlon.getInstance();
        this.tecnico = tecnico;
        this.sedes = new ArrayList<>();
        btnAsignarSede.setVisible(false);
        btnQuitarSede.setVisible(false);
        panelSedes.setVisible(false);
        lblSedesDesc.setVisible(false);
        comboItems.setVisible(false);
        lblTipoCombo.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnVolver = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        comboTipoUsuario = new javax.swing.JComboBox<>();
        comboItems = new javax.swing.JComboBox<>();
        lblTipoCombo = new javax.swing.JLabel();
        btnAsignarSede = new javax.swing.JButton();
        panelSedes = new javax.swing.JScrollPane();
        txtSedes = new javax.swing.JTextArea();
        btnAgregarUsuario = new javax.swing.JButton();
        btnQuitarSede = new javax.swing.JButton();
        lblSedesDesc = new javax.swing.JLabel();
        msjConfirmacion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("Supertlon");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setText("En esta sección puede realizar la carga de usuarios");

        jLabel3.setText("Nombre del Usuario: ");

        jLabel4.setText("Tipo de Usuario:");

        comboTipoUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alumno", "Administrativo", "Soporte Tecnico" }));
        comboTipoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboTipoUsuarioActionPerformed(evt);
            }
        });

        lblTipoCombo.setText("Variable:");

        btnAsignarSede.setText("Asignar Sede");
        btnAsignarSede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsignarSedeActionPerformed(evt);
            }
        });

        txtSedes.setColumns(20);
        txtSedes.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        txtSedes.setLineWrap(true);
        txtSedes.setRows(5);
        panelSedes.setViewportView(txtSedes);

        btnAgregarUsuario.setText("Agregar Usuario");
        btnAgregarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarUsuarioActionPerformed(evt);
            }
        });

        btnQuitarSede.setText("Quitar Sede");
        btnQuitarSede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitarSedeActionPerformed(evt);
            }
        });

        lblSedesDesc.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        lblSedesDesc.setText("Sedes a disposición del administrador:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnVolver)
                .addGap(133, 133, 133)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(49, 49, 49)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnQuitarSede)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnAsignarSede))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblTipoCombo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(comboItems, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(comboTipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING))))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblSedesDesc)
                                .addComponent(panelSedes, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(btnAgregarUsuario))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(msjConfirmacion)))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnVolver)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboTipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboItems, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTipoCombo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAsignarSede)
                    .addComponent(btnQuitarSede))
                .addGap(15, 15, 15)
                .addComponent(lblSedesDesc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelSedes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAgregarUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(msjConfirmacion)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboTipoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboTipoUsuarioActionPerformed
        // TODO add your handling code here:
        String tipo = comboTipoUsuario.getSelectedItem().toString();
        System.out.println(tipo);
        switch (tipo) {
            case "Alumno":
                lblTipoCombo.setText("Tipo de Membresia:");
                lblTipoCombo.setVisible(true);
                btnQuitarSede.setVisible(false);
                btnAsignarSede.setVisible(false);
                panelSedes.setVisible(false);
                lblSedesDesc.setVisible(false);
                comboItems.setVisible(true);
                comboItems.removeAllItems();
                comboItems.addItem("BLACK");
                comboItems.addItem("ORO");
                comboItems.addItem("PLATINUM");
                break;
            case "Soporte Tecnico":
                lblTipoCombo.setVisible(false);
                comboItems.setVisible(false);
                btnAsignarSede.setVisible(false);
                btnQuitarSede.setVisible(false);
                lblSedesDesc.setVisible(false);
                panelSedes.setVisible(false);
                break;
            case "Administrativo":
                lblSedesDesc.setVisible(true);
                lblTipoCombo.setVisible(true);
                lblTipoCombo.setText("Sedes disponibles:");
                comboItems.setVisible(true);
                btnQuitarSede.setVisible(true);
                btnAsignarSede.setVisible(true);
                panelSedes.setVisible(true);
                comboItems.removeAllItems();
                for (String nombreSede : controlador.getNombresSucursales()) {
                    comboItems.addItem(nombreSede);
                }
                break;
        }
                
    }//GEN-LAST:event_comboTipoUsuarioActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        // TODO add your handling code here:
        TecnicoMenu menu = new TecnicoMenu(this.tecnico);
        menu.setVisible(true);
        menu.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnQuitarSedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitarSedeActionPerformed
        Object item = comboItems.getSelectedItem();
        if (item!=null) {
            String nombreSede = item.toString();
            if (sedes.contains(nombreSede)) {
                sedes.remove(nombreSede);
                String msjSedes= "";
                for (String a : sedes) {
                    msjSedes += a + "-";
                }
                txtSedes.setText(msjSedes);
            }
        }
    }//GEN-LAST:event_btnQuitarSedeActionPerformed

    private void btnAsignarSedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsignarSedeActionPerformed
        // TODO add your handling code here:
        Object item = comboItems.getSelectedItem();
        if (item!=null) {
            String nombreSede = item.toString();
            if (!sedes.contains(nombreSede)) {
                sedes.add(nombreSede);
                String msjSedes= "";
                for (String a : sedes) {
                    msjSedes += a + "-";
                }
                txtSedes.setText(msjSedes);
            }
        }
    }//GEN-LAST:event_btnAsignarSedeActionPerformed

    private void btnAgregarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarUsuarioActionPerformed
        // TODO add your handling code here:
        msjConfirmacion.setText(null);
        String tipo = comboTipoUsuario.getSelectedItem().toString();
        switch (tipo) {
            case ("Alumno"):
                controlador.altaAlumno(txtNombre.getText(), comboItems.getSelectedItem().toString());
                msjConfirmacion.setText("Carga exitosa - Alumno: " + txtNombre.getText());
                txtNombre.setText(null);
                break;
            case ("Administrativo"):
                if (!sedes.isEmpty()) {
                    controlador.altaAdministrativo(txtNombre.getText(), sedes);
                    msjConfirmacion.setText("Carga exitosa - Administrativo: " + txtNombre.getText());
                    txtNombre.setText(null);
                    sedes.clear();
                } else {
                    txtSedes.setText("Ingrese sedes antes de cargar el usuario");
                }
                break;
            case ("Soporte Tecnico"):
                controlador.altaSoporte(txtNombre.getText());
                msjConfirmacion.setText("Carga exitosa - Tecnico: " + txtNombre.getText());
                txtNombre.setText(null);
                break;
        }
    }//GEN-LAST:event_btnAgregarUsuarioActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarUsuario;
    private javax.swing.JButton btnAsignarSede;
    private javax.swing.JButton btnQuitarSede;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> comboItems;
    private javax.swing.JComboBox<String> comboTipoUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblSedesDesc;
    private javax.swing.JLabel lblTipoCombo;
    private javax.swing.JLabel msjConfirmacion;
    private javax.swing.JScrollPane panelSedes;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextArea txtSedes;
    // End of variables declaration//GEN-END:variables
}