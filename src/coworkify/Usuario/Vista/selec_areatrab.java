/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectob;

/**
 *
 * @author Dani Beva
 */
public class selec_areatrab extends javax.swing.JFrame {

    
    public selec_areatrab() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        atras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Lucida Fax", 1, 15)); // NOI18N
        jLabel1.setText("<HTML>  SELECIONA TU ÁREA <P>         DE TRABAJO <HTML>");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(80, 20, 210, 70);

        jButton1.setFont(new java.awt.Font("Lucida Fax", 1, 15)); // NOI18N
        jButton1.setText("CREAR ÁREA DE TRBAJO");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(30, 100, 290, 50);

        jButton2.setFont(new java.awt.Font("Lucida Fax", 1, 15)); // NOI18N
        jButton2.setText("INGRESAR AL ÁREA DE TRBAJO");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(30, 160, 290, 50);

        atras.setText("Volver al inicio");
        atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasActionPerformed(evt);
            }
        });
        jPanel1.add(atras);
        atras.setBounds(100, 230, 140, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed
        // TODO add your handling code here:
                 this.setVisible(false);
                 inicio_sesion forma = new inicio_sesion();
                 forma.setVisible(true);
                 forma.setBounds(375,210, 531, 450); 
                 forma.setTitle("INICIO DE SESION");
        
    }//GEN-LAST:event_atrasActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
          this.setVisible(false);
                 crear_areatrab forma = new  crear_areatrab();
                 forma.setVisible(true);
                 forma.setBounds(375,210, 550, 375);
                 forma.setTitle("ÁREA DE TRABAJO");
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
          this.setVisible(false);
                 ingre_areatrab forma = new  ingre_areatrab();
                 forma.setVisible(true);
                 forma.setBounds(375,210, 550, 375);
                 forma.setTitle("INGRESAR AL ÁREA DE TRABAJO");
    }//GEN-LAST:event_jButton2ActionPerformed

  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atras;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
