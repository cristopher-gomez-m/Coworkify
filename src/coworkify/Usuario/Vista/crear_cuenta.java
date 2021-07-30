/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coworkify.Usuario.Vista;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author Dani Beva
 */
public class crear_cuenta extends javax.swing.JFrame {

    public JTextField getApellido() {
        return apellido;
    }

    public JButton getAtras() {
        return atras;
    }

    public JTextField getContraseña() {
        return contraseña;
    }

    public JTextField getCorreo() {
        return correo;
    }

    public JTextField getNombre() {
        return nombre;
    }

    public JButton getRegistrate() {
        return registrate;
    }
    
    
    
    
    

    public crear_cuenta (){   
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        registrate = new javax.swing.JButton();
        check1 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        apellido = new javax.swing.JTextField();
        correo = new javax.swing.JTextField();
        contraseña = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        atras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(null);

        registrate.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        registrate.setText("REGISTRATE");
        registrate.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                registrateStateChanged(evt);
            }
        });
        registrate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrateActionPerformed(evt);
            }
        });
        jPanel1.add(registrate);
        registrate.setBounds(200, 330, 140, 40);

        check1.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        check1.setText("Acceptar terminos");
        check1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check1ActionPerformed(evt);
            }
        });
        jPanel1.add(check1);
        check1.setBounds(70, 293, 160, 20);

        jLabel1.setFont(new java.awt.Font("Lucida Fax", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("NOMBRE");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(70, 80, 120, 40);

        jLabel2.setFont(new java.awt.Font("Lucida Fax", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("APELLIDO");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(70, 130, 120, 40);

        jLabel3.setFont(new java.awt.Font("Lucida Fax", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("CORREO");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(70, 180, 120, 40);

        jLabel4.setFont(new java.awt.Font("Lucida Fax", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("CONTRASEÑA");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(70, 230, 120, 40);

        nombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(nombre);
        nombre.setBounds(210, 80, 250, 40);

        apellido.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(apellido);
        apellido.setBounds(210, 130, 250, 40);

        correo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        correo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                correoActionPerformed(evt);
            }
        });
        jPanel1.add(correo);
        correo.setBounds(210, 180, 250, 40);

        contraseña.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(contraseña);
        contraseña.setBounds(210, 230, 250, 40);

        jLabel5.setFont(new java.awt.Font("Lucida Fax", 1, 20)); // NOI18N
        jLabel5.setText("REGISTRATÉ");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(200, 10, 170, 50);

        atras.setText("ATRAS");
        atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasActionPerformed(evt);
            }
        });
        atras.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                atrasKeyTyped(evt);
            }
        });
        jPanel1.add(atras);
        atras.setBounds(230, 380, 90, 20);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 532, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void check1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check1ActionPerformed

    }//GEN-LAST:event_check1ActionPerformed

    private void correoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correoActionPerformed

    }//GEN-LAST:event_correoActionPerformed

    private void registrateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrateActionPerformed

                /* this.setVisible(false);
 selec_areatrab forma = new  selec_areatrab();
                 forma.setVisible(true);
                 forma.setBounds(375,210, 365, 310);
                 forma.setTitle("ÁREA DE TRABAJO");*/
        
        
        
    }//GEN-LAST:event_registrateActionPerformed

    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed
               // TODO add your handling code here:
                                 this.setVisible(false);
               inicio_sesion forma = new inicio_sesion();
                 forma.setVisible(true);
                 forma.setBounds(375,210, 531, 450); 
                 forma.setTitle("INICIO DE SESION");
               
               
    }//GEN-LAST:event_atrasActionPerformed
    private void atrasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_atrasKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_atrasKeyTyped

    private void registrateStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_registrateStateChanged
        // TODO add your handling code here:
      
    }//GEN-LAST:event_registrateStateChanged

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellido;
    private javax.swing.JButton atras;
    private javax.swing.JCheckBox check1;
    private javax.swing.JTextField contraseña;
    private javax.swing.JTextField correo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nombre;
    private javax.swing.JButton registrate;
    // End of variables declaration//GEN-END:variables
}