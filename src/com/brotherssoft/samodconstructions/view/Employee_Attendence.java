/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.view;

/**
 *
 * @author Akvasoft
 */
public class Employee_Attendence extends javax.swing.JPanel {

    /**
     * Creates new form Employee_Attendence
     */
    public Employee_Attendence() {
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

        Company_Account_Registration = new javax.swing.JPanel();
        bank_panel_hedding2 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        bank_panel_input_area1 = new javax.swing.JPanel();
        btn_acc_save = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        cmb_emp_cate = new javax.swing.JComboBox<>();
        txt_date = new org.jdesktop.swingx.JXDatePicker();
        jLabel133 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jXTable1 = new org.jdesktop.swingx.JXTable();
        bank_panel_tbl1 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tbl_acc = new javax.swing.JTable();
        txt_acc_search = new javax.swing.JTextField();

        Company_Account_Registration.setBackground(new java.awt.Color(255, 255, 255));
        Company_Account_Registration.setPreferredSize(new java.awt.Dimension(1050, 710));

        bank_panel_hedding2.setBackground(new java.awt.Color(0, 153, 153));

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Administrations / System Management / Operations/");

        jLabel20.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Employee Attendence");

        jSeparator8.setBackground(new java.awt.Color(204, 0, 51));
        jSeparator8.setOpaque(true);

        javax.swing.GroupLayout bank_panel_hedding2Layout = new javax.swing.GroupLayout(bank_panel_hedding2);
        bank_panel_hedding2.setLayout(bank_panel_hedding2Layout);
        bank_panel_hedding2Layout.setHorizontalGroup(
            bank_panel_hedding2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bank_panel_hedding2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(bank_panel_hedding2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator8))
        );
        bank_panel_hedding2Layout.setVerticalGroup(
            bank_panel_hedding2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bank_panel_hedding2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bank_panel_hedding2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addComponent(jSeparator8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        bank_panel_input_area1.setBackground(new java.awt.Color(255, 255, 255));
        bank_panel_input_area1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Mark Attendence", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 14))); // NOI18N

        btn_acc_save.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_acc_save.setText("Transfer");
        btn_acc_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_acc_saveActionPerformed(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel26.setText("Category");

        cmb_emp_cate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cmb_emp_cate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Select Employee Category -" }));
        cmb_emp_cate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_emp_cateActionPerformed(evt);
            }
        });

        txt_date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_dateActionPerformed(evt);
            }
        });

        jLabel133.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel133.setText("Date");

        jXTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Select", "Name", "Project", "Nic"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jXTable1);

        javax.swing.GroupLayout bank_panel_input_area1Layout = new javax.swing.GroupLayout(bank_panel_input_area1);
        bank_panel_input_area1.setLayout(bank_panel_input_area1Layout);
        bank_panel_input_area1Layout.setHorizontalGroup(
            bank_panel_input_area1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bank_panel_input_area1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bank_panel_input_area1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(bank_panel_input_area1Layout.createSequentialGroup()
                        .addGroup(bank_panel_input_area1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel133, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(bank_panel_input_area1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmb_emp_cate, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_date, javax.swing.GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bank_panel_input_area1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_acc_save, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        bank_panel_input_area1Layout.setVerticalGroup(
            bank_panel_input_area1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bank_panel_input_area1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(bank_panel_input_area1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel133, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bank_panel_input_area1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmb_emp_cate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_acc_save, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        bank_panel_input_area1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cmb_emp_cate, txt_date});

        bank_panel_tbl1.setBackground(new java.awt.Color(255, 255, 255));
        bank_panel_tbl1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Attendence Sheet", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 14))); // NOI18N

        tbl_acc.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tbl_acc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_acc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tbl_acc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_accMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(tbl_acc);

        txt_acc_search.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txt_acc_search.setForeground(new java.awt.Color(102, 102, 102));
        txt_acc_search.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_acc_search.setText("Search Day");
        txt_acc_search.setToolTipText("Use Bank Nname To Search !");
        txt_acc_search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_acc_searchMouseClicked(evt);
            }
        });
        txt_acc_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_acc_searchKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_acc_searchKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout bank_panel_tbl1Layout = new javax.swing.GroupLayout(bank_panel_tbl1);
        bank_panel_tbl1.setLayout(bank_panel_tbl1Layout);
        bank_panel_tbl1Layout.setHorizontalGroup(
            bank_panel_tbl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 493, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bank_panel_tbl1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txt_acc_search, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        bank_panel_tbl1Layout.setVerticalGroup(
            bank_panel_tbl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bank_panel_tbl1Layout.createSequentialGroup()
                .addComponent(txt_acc_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout Company_Account_RegistrationLayout = new javax.swing.GroupLayout(Company_Account_Registration);
        Company_Account_Registration.setLayout(Company_Account_RegistrationLayout);
        Company_Account_RegistrationLayout.setHorizontalGroup(
            Company_Account_RegistrationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Company_Account_RegistrationLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bank_panel_input_area1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bank_panel_tbl1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(bank_panel_hedding2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        Company_Account_RegistrationLayout.setVerticalGroup(
            Company_Account_RegistrationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Company_Account_RegistrationLayout.createSequentialGroup()
                .addComponent(bank_panel_hedding2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(Company_Account_RegistrationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bank_panel_tbl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bank_panel_input_area1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Company_Account_Registration, javax.swing.GroupLayout.DEFAULT_SIZE, 1039, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Company_Account_Registration, javax.swing.GroupLayout.DEFAULT_SIZE, 723, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_acc_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_acc_saveActionPerformed
     
    }//GEN-LAST:event_btn_acc_saveActionPerformed

    private void cmb_emp_cateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_emp_cateActionPerformed
     
    }//GEN-LAST:event_cmb_emp_cateActionPerformed

    private void tbl_accMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_accMouseClicked
      
    }//GEN-LAST:event_tbl_accMouseClicked

    private void txt_acc_searchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_acc_searchMouseClicked
       
    }//GEN-LAST:event_txt_acc_searchMouseClicked

    private void txt_acc_searchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_acc_searchKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_acc_searchKeyPressed

    private void txt_acc_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_acc_searchKeyReleased
      
    }//GEN-LAST:event_txt_acc_searchKeyReleased

    private void txt_dateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_dateActionPerformed

    }//GEN-LAST:event_txt_dateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Company_Account_Registration;
    private javax.swing.JPanel bank_panel_hedding2;
    private javax.swing.JPanel bank_panel_input_area1;
    private javax.swing.JPanel bank_panel_tbl1;
    private javax.swing.JButton btn_acc_save;
    private javax.swing.JComboBox<String> cmb_emp_cate;
    private javax.swing.JLabel jLabel133;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JSeparator jSeparator8;
    private org.jdesktop.swingx.JXTable jXTable1;
    private javax.swing.JTable tbl_acc;
    private javax.swing.JTextField txt_acc_search;
    private org.jdesktop.swingx.JXDatePicker txt_date;
    // End of variables declaration//GEN-END:variables
}
