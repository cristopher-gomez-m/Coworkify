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
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class crear_areatrab extends javax.swing.JFrame {

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
        jLabel3 = new javax.swing.JLabel();
        envianombre = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        buton1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

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
        jLabel2.setText("CIUDAD");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(40, 130, 150, 40);

        jLabel3.setFont(new java.awt.Font("Lucida Fax", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("PROVINCIA");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(50, 180, 140, 40);

        envianombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        envianombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                envianombreActionPerformed(evt);
            }
        });
        envianombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                envianombreKeyTyped(evt);
            }
        });
        jPanel1.add(envianombre);
        envianombre.setBounds(210, 80, 250, 40);

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(jTextField2);
        jTextField2.setBounds(210, 130, 250, 40);

        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField3);
        jTextField3.setBounds(210, 180, 250, 40);

        jLabel5.setFont(new java.awt.Font("Lucida Fax", 1, 20)); // NOI18N
        jLabel5.setText("REGISTRA LOS DATOS");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(140, 10, 280, 50);

        buton1.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        buton1.setText("REGISTRATE");
        buton1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                buton1StateChanged(evt);
            }
        });
        buton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buton1ActionPerformed(evt);
            }
        });
        jPanel1.add(buton1);
        buton1.setBounds(190, 240, 170, 40);

        jButton1.setText("atras");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(230, 290, 80, 23);

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

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed


    }//GEN-LAST:event_jTextField3ActionPerformed

    private void envianombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_envianombreActionPerformed
        // TODO add your handling code here:
     
       
    }//GEN-LAST:event_envianombreActionPerformed

    private void buton1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_buton1StateChanged
        // TODO add your handling code here:

    }//GEN-LAST:event_buton1StateChanged

    private void buton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buton1ActionPerformed

       /* this.setVisible(false);
        menu_princ menu = new  menu_princ();
        menu.setVisible(true);
        menu.setBounds(375,155,800,500);
        menu.setTitle("COWORKIFY");
       menu.recibenombre.setText(envianombre.getText());*/
    }//GEN-LAST:event_buton1ActionPerformed

    private void envianombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_envianombreKeyTyped
  
    }//GEN-LAST:event_envianombreKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
                 selec_areatrab forma = new  selec_areatrab();
                 forma.setVisible(true);
                 forma.setBounds(375,210, 365, 310);
                 forma.setTitle("ÁREA DE TRABAJO");
    }//GEN-LAST:event_jButton1ActionPerformed

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton buton1;
    public static javax.swing.JTextField envianombre;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
