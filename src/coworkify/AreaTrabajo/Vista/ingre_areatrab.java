/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coworkify.AreaTrabajo.Vista;

import coworkify.AreaTrabajo.Vista.selec_areatrab;
import javax.swing.JButton;
import javax.swing.JTextField;



/**
 *
 * @author Dani Beva
 */
public class ingre_areatrab extends javax.swing.JFrame {

 

    public JButton getAtras() {
        return atras;
    }

    public JTextField getCodigo() {
        return codigo;
    }

    public JButton getIngresar() {
        return ingresar;
    }

  

    
    
    
    
    /**
     * Creates new form ingre_areatrab
     */
    public ingre_areatrab() {
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
        jLabel3 = new javax.swing.JLabel();
        codigo = new javax.swing.JTextField();
        ingresar = new javax.swing.JButton();
        atras = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Lucida Fax", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Cód. ÁREA DE TRABAJO");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 100, 200, 40);

        codigo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoActionPerformed(evt);
            }
        });
        jPanel1.add(codigo);
        codigo.setBounds(250, 110, 250, 40);

        ingresar.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        ingresar.setText("INGRESAR");
        ingresar.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                ingresarStateChanged(evt);
            }
        });
        ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarActionPerformed(evt);
            }
        });
        jPanel1.add(ingresar);
        ingresar.setBounds(190, 180, 170, 40);

        atras.setText("ATRAS");
        atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasActionPerformed(evt);
            }
        });
        jPanel1.add(atras);
        atras.setBounds(230, 260, 80, 23);

        jLabel5.setFont(new java.awt.Font("Lucida Fax", 1, 20)); // NOI18N
        jLabel5.setText("INGRESA LOS DATOS ");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(170, 20, 250, 50);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(84, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoActionPerformed

    }//GEN-LAST:event_codigoActionPerformed

    private void ingresarStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_ingresarStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_ingresarStateChanged

    private void ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarActionPerformed

       /* this.setVisible(false);
        menu_princtrab menu = new  menu_princtrab();
        menu.setVisible(true);
        menu.setBounds(375,155,800,500);
        menu.setTitle("COWORKIFY");*/
    }//GEN-LAST:event_ingresarActionPerformed

    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed
        // TODO add your handling code here:
                 this.setVisible(false);
                 selec_areatrab forma = new  selec_areatrab();
                 forma.setVisible(true);
                 forma.setBounds(375,210, 365, 310);
                 forma.setTitle("ÁREA DE TRABAJO");
        
    }//GEN-LAST:event_atrasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atras;
    private javax.swing.JTextField codigo;
    private javax.swing.JButton ingresar;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
