
package coworkify.AreaTrabajo.Vista;

import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import javax.swing.BoundedRangeModel;
import javax.swing.DefaultBoundedRangeModel;

public class menu_princ extends javax.swing.JFrame {

   DefaultBoundedRangeModel model;
           
    public menu_princ() {
        initComponents();
                }       
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel2 = new javax.swing.JPanel();
        recibenombre = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel21 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jPanel18 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jPanel25 = new javax.swing.JPanel();
        jPanel26 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel27 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jPanel28 = new javax.swing.JPanel();
        jPanel29 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jPanel30 = new javax.swing.JPanel();
        jPanel31 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jScrollBar1 = new javax.swing.JScrollBar();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("File");
        jMenuBar3.add(jMenu5);

        jMenu6.setText("Edit");
        jMenuBar3.add(jMenu6);

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel2.setLayout(null);

        recibenombre.setFont(new java.awt.Font("Castellar", 1, 20)); // NOI18N
        recibenombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        recibenombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(recibenombre);
        recibenombre.setBounds(0, 0, 640, 50);

        jLabel1.setText("de los que vienen de la 4");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(580, 50, 140, 40);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBox1);
        jComboBox1.setBounds(640, 0, 140, 50);

        jPanel21.setLayout(null);

        jPanel22.setLayout(null);

        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel7.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("DESACTIVOS");
        jPanel7.add(jLabel4);
        jLabel4.setBounds(40, 110, 90, 40);

        jLabel8.setText("log1");
        jPanel7.add(jLabel8);
        jLabel8.setBounds(90, 10, 30, 40);

        jLabel17.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        jLabel17.setText("MIEMBROS");
        jPanel7.add(jLabel17);
        jLabel17.setBounds(130, 10, 100, 40);

        jLabel18.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel7.add(jLabel18);
        jLabel18.setBounds(160, 110, 90, 40);

        jLabel20.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel20.setText("ACTIVOS");
        jPanel7.add(jLabel20);
        jLabel20.setBounds(40, 60, 90, 40);

        jLabel25.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel25.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel7.add(jLabel25);
        jLabel25.setBounds(160, 60, 90, 40);

        jPanel22.add(jPanel7);
        jPanel7.setBounds(30, 20, 340, 170);

        jPanel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel9.setLayout(null);

        jLabel9.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("DESACTIVOS");
        jPanel9.add(jLabel9);
        jLabel9.setBounds(50, 110, 90, 40);

        jLabel10.setText("log1");
        jPanel9.add(jLabel10);
        jLabel10.setBounds(80, 10, 30, 40);

        jLabel15.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        jLabel15.setText("CONTRATACIONES");
        jPanel9.add(jLabel15);
        jLabel15.setBounds(120, 10, 160, 40);

        jLabel16.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("ACTIVOS");
        jPanel9.add(jLabel16);
        jLabel16.setBounds(50, 60, 90, 40);

        jLabel29.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel29.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel9.add(jLabel29);
        jLabel29.setBounds(150, 60, 130, 40);

        jLabel32.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel32.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel9.add(jLabel32);
        jLabel32.setBounds(150, 110, 130, 40);

        jPanel22.add(jPanel9);
        jPanel9.setBounds(400, 20, 340, 170);

        jPanel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel8.setLayout(null);

        jLabel6.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        jLabel6.setText("FACTURAS");
        jPanel8.add(jLabel6);
        jLabel6.setBounds(230, 10, 100, 40);

        jLabel7.setText("log1");
        jPanel8.add(jLabel7);
        jLabel7.setBounds(180, 10, 30, 40);

        jLabel12.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("CANCELADAS");
        jPanel8.add(jLabel12);
        jLabel12.setBounds(30, 110, 90, 40);

        jLabel11.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("TOTAL");
        jPanel8.add(jLabel11);
        jLabel11.setBounds(30, 60, 90, 40);

        jLabel13.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("NO PAGADAS");
        jPanel8.add(jLabel13);
        jLabel13.setBounds(270, 110, 100, 40);

        jLabel14.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("PAGADAS");
        jPanel8.add(jLabel14);
        jLabel14.setBounds(270, 60, 100, 40);

        jLabel34.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel34.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel8.add(jLabel34);
        jLabel34.setBounds(130, 60, 130, 40);

        jLabel33.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel33.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel8.add(jLabel33);
        jLabel33.setBounds(130, 110, 130, 40);

        jLabel35.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel35.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel8.add(jLabel35);
        jLabel35.setBounds(380, 60, 130, 40);

        jLabel36.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel36.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel8.add(jLabel36);
        jLabel36.setBounds(380, 110, 130, 40);

        jLabel37.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel37.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel8.add(jLabel37);
        jLabel37.setBounds(380, 60, 130, 40);

        jPanel22.add(jPanel8);
        jPanel8.setBounds(130, 210, 520, 170);

        jPanel24.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel24.setLayout(null);

        jLabel26.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        jLabel26.setText("FUTURAS CONTRATACIONES");
        jPanel24.add(jLabel26);
        jLabel26.setBounds(60, 10, 230, 40);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jPanel24.add(jScrollPane2);
        jScrollPane2.setBounds(10, 50, 310, 80);

        jPanel22.add(jPanel24);
        jPanel24.setBounds(410, 390, 340, 150);

        jPanel18.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel18.setLayout(null);

        jLabel19.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        jLabel19.setText("ACTIVIDADES RECIENTES");
        jPanel18.add(jLabel19);
        jLabel19.setBounds(80, 10, 200, 40);

        jPanel23.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel23.setLayout(null);

        jLabel21.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel21.setText("DESACTIVOS");
        jPanel23.add(jLabel21);
        jLabel21.setBounds(30, 110, 90, 40);

        jLabel22.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        jLabel22.setText("ACTIVIDADES RECIENTES");
        jPanel23.add(jLabel22);
        jLabel22.setBounds(60, 10, 200, 40);

        jLabel23.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel23.setText("ACTIVOS");
        jPanel23.add(jLabel23);
        jLabel23.setBounds(30, 60, 90, 40);

        jPanel25.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel25.setLayout(null);
        jPanel23.add(jPanel25);
        jPanel25.setBounds(140, 110, 100, 40);

        jPanel26.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel26.setLayout(null);
        jPanel23.add(jPanel26);
        jPanel26.setBounds(140, 60, 100, 40);

        jPanel18.add(jPanel23);
        jPanel23.setBounds(60, 470, 340, 170);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel18.add(jScrollPane1);
        jScrollPane1.setBounds(10, 50, 310, 80);

        jPanel22.add(jPanel18);
        jPanel18.setBounds(40, 390, 340, 150);

        jPanel27.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel27.setLayout(null);

        jLabel24.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel24.setText("DESACTIVOS       ");
        jPanel27.add(jLabel24);
        jLabel24.setBounds(140, 180, 120, 30);

        jLabel27.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        jLabel27.setText("PLAN DE DISTRIBUICI??N");
        jPanel27.add(jLabel27);
        jLabel27.setBounds(80, 10, 200, 40);

        jPanel28.setBackground(new java.awt.Color(255, 0, 0));
        jPanel28.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel28.setLayout(null);
        jPanel27.add(jPanel28);
        jPanel28.setBounds(30, 60, 100, 30);

        jPanel29.setBackground(new java.awt.Color(102, 102, 255));
        jPanel29.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel29.setLayout(null);
        jPanel27.add(jPanel29);
        jPanel29.setBounds(30, 100, 100, 30);

        jLabel28.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel28.setText("Solo de noche    ");
        jPanel27.add(jLabel28);
        jLabel28.setBounds(140, 140, 120, 30);

        jPanel30.setBackground(new java.awt.Color(153, 153, 0));
        jPanel30.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel30.setLayout(null);
        jPanel27.add(jPanel30);
        jPanel30.setBounds(30, 180, 100, 30);

        jPanel31.setBackground(new java.awt.Color(153, 153, 153));
        jPanel31.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel31.setLayout(null);
        jPanel27.add(jPanel31);
        jPanel31.setBounds(30, 140, 100, 30);

        jLabel30.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel30.setText("Drop-in       ");
        jPanel27.add(jLabel30);
        jLabel30.setBounds(140, 60, 120, 30);

        jLabel31.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel31.setText("Regular");
        jPanel27.add(jLabel31);
        jLabel31.setBounds(140, 100, 120, 30);

        jLabel38.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel38.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel27.add(jLabel38);
        jLabel38.setBounds(240, 140, 80, 30);

        jLabel39.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel39.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel27.add(jLabel39);
        jLabel39.setBounds(240, 180, 80, 30);

        jLabel41.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel41.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel27.add(jLabel41);
        jLabel41.setBounds(240, 60, 80, 30);

        jLabel42.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel42.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel27.add(jLabel42);
        jLabel42.setBounds(240, 100, 80, 30);

        jLabel43.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel43.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel27.add(jLabel43);
        jLabel43.setBounds(240, 100, 80, 30);

        jPanel22.add(jPanel27);
        jPanel27.setBounds(210, 560, 370, 220);

        jScrollBar1.addAdjustmentListener(new java.awt.event.AdjustmentListener() {
            public void adjustmentValueChanged(java.awt.event.AdjustmentEvent evt) {
                jScrollBar1AdjustmentValueChanged(evt);
            }
        });
        jPanel22.add(jScrollBar1);
        jScrollBar1.setBounds(760, 0, 20, 790);

        jPanel21.add(jPanel22);
        jPanel22.setBounds(0, 0, 790, 800);

        jTabbedPane1.addTab("P??GINA PRINCIPAL", jPanel21);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 775, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 812, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("CONTRATACIONES", jPanel1);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 775, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 812, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("FACTURAS", jPanel4);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 775, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 812, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("MIEMBROS", jPanel5);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 775, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 812, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("AJUSTES", jPanel6);

        jPanel2.add(jTabbedPane1);
        jTabbedPane1.setBounds(0, 50, 780, 840);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 800, 880);

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private AdjustmentListener ajustador;
    
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:

        //Cogemos el texto del campo de texto
        //   String menu=recibenombre.getText();

        //A??adimos la pelicula al combobox
        //   jComboBox1.addItem(menu);

        //Reiniciamos el campo de texto
        //    recibenombre.setText("");
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jScrollBar1AdjustmentValueChanged(java.awt.event.AdjustmentEvent evt) {//GEN-FIRST:event_jScrollBar1AdjustmentValueChanged
        // TODO add your handling code here:
        
        
        
    }//GEN-LAST:event_jScrollBar1AdjustmentValueChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    public static javax.swing.JLabel recibenombre;
    // End of variables declaration//GEN-END:variables
}
