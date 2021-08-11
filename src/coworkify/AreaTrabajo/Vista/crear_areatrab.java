/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coworkify.AreaTrabajo.Vista;
import coworkify.AreaTrabajo.Vista.selec_areatrab;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class crear_areatrab extends javax.swing.JFrame {

    public JButton getAtras() {
        return atras;
    }

    public static JTextField getEnviaNombre() {
        return enviaNombre;
    }

    public JTextField getEnviarContraseña() {
        return enviarContraseña;
    }

    public static JButton getRegistrar() {
        return registrar;
    }

    
    
    
    
    
    /**
     * Creates new form crear_areatab
     */
    public crear_areatrab() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        enviaNombre = new javax.swing.JTextField();
        enviarContraseña = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        registrar = new javax.swing.JButton();
        atras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Lucida Fax", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("NOMBRE ESPACIO");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(40, 80, 150, 40);

        jLabel2.setFont(new java.awt.Font("Lucida Fax", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Contraseña del espacio");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 130, 180, 40);

        enviaNombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        enviaNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviaNombreActionPerformed(evt);
            }
        });
        enviaNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                enviaNombreKeyTyped(evt);
            }
        });
        jPanel1.add(enviaNombre);
        enviaNombre.setBounds(210, 80, 250, 40);

        enviarContraseña.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        enviarContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarContraseñaActionPerformed(evt);
            }
        });
        jPanel1.add(enviarContraseña);
        enviarContraseña.setBounds(210, 130, 250, 40);

        jLabel5.setFont(new java.awt.Font("Lucida Fax", 1, 20)); // NOI18N
        jLabel5.setText("REGISTRA LOS DATOS");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(140, 10, 280, 50);

        registrar.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        registrar.setText("REGISTRATE");
        registrar.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                registrarStateChanged(evt);
            }
        });
        registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarActionPerformed(evt);
            }
        });
        jPanel1.add(registrar);
        registrar.setBounds(190, 240, 170, 40);

        atras.setText("atras");
        atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasActionPerformed(evt);
            }
        });
        jPanel1.add(atras);
        atras.setBounds(230, 290, 80, 23);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 539, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void enviaNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviaNombreActionPerformed
        // TODO add your handling code here:
     
       
    }//GEN-LAST:event_enviaNombreActionPerformed

    private void registrarStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_registrarStateChanged
        // TODO add your handling code here:

    }//GEN-LAST:event_registrarStateChanged

    private void registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarActionPerformed

       /* this.setVisible(false);
        menu_princ menu = new  menu_princ();
        menu.setVisible(true);
        menu.setBounds(375,155,800,500);
        menu.setTitle("COWORKIFY");
       menu.recibenombre.setText(envianombre.getText());*/
    }//GEN-LAST:event_registrarActionPerformed

    private void enviaNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_enviaNombreKeyTyped
  
    }//GEN-LAST:event_enviaNombreKeyTyped

    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
                 selec_areatrab forma = new  selec_areatrab();
                 forma.setVisible(true);
                 forma.setBounds(375,210, 365, 310);
                 forma.setTitle("ÁREA DE TRABAJO");
    }//GEN-LAST:event_atrasActionPerformed

    private void enviarContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enviarContraseñaActionPerformed

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atras;
    public static javax.swing.JTextField enviaNombre;
    private javax.swing.JTextField enviarContraseña;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JButton registrar;
    // End of variables declaration//GEN-END:variables
}
