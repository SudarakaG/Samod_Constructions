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
public class Project_Salary_Payment extends javax.swing.JPanel {

    /**
     * Creates new form Project_Salary_Payment
     */
    public Project_Salary_Payment() {
        initComponents();
        from_date.setFormats("yyyy-MM-dd","yyyy/MM/dd");
        from_date1.setFormats("yyyy-MM-dd","yyyy/MM/dd");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Meterial_Allocation_Panel = new javax.swing.JPanel();
        user_panel_hedding4 = new javax.swing.JPanel();
        jLabel68 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jSeparator16 = new javax.swing.JSeparator();
        txt_Input_Panel_Branch4 = new javax.swing.JPanel();
        btn_new_primary_project = new javax.swing.JButton();
        jLabel106 = new javax.swing.JLabel();
        txt_project_tender_result1 = new javax.swing.JTextField();
        btn_new_primary_project1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel107 = new javax.swing.JLabel();
        from_date = new org.jdesktop.swingx.JXDatePicker();
        jLabel108 = new javax.swing.JLabel();
        from_date1 = new org.jdesktop.swingx.JXDatePicker();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel109 = new javax.swing.JLabel();
        jLabel110 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel111 = new javax.swing.JLabel();
        btn_new_primary_project2 = new javax.swing.JButton();
        btn_new_primary_project3 = new javax.swing.JButton();
        txt_project_tender_result2 = new javax.swing.JTextField();
        jLabel112 = new javax.swing.JLabel();

        Meterial_Allocation_Panel.setBackground(new java.awt.Color(255, 255, 255));
        Meterial_Allocation_Panel.setPreferredSize(new java.awt.Dimension(1050, 710));

        user_panel_hedding4.setBackground(new java.awt.Color(0, 153, 153));

        jLabel68.setBackground(new java.awt.Color(255, 255, 255));
        jLabel68.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(255, 255, 255));
        jLabel68.setText("Administrations / System Management / Operations /");

        jLabel71.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel71.setForeground(new java.awt.Color(255, 255, 255));
        jLabel71.setText("Daily Salary Payment");

        jSeparator16.setBackground(new java.awt.Color(204, 0, 51));
        jSeparator16.setOpaque(true);

        javax.swing.GroupLayout user_panel_hedding4Layout = new javax.swing.GroupLayout(user_panel_hedding4);
        user_panel_hedding4.setLayout(user_panel_hedding4Layout);
        user_panel_hedding4Layout.setHorizontalGroup(
            user_panel_hedding4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(user_panel_hedding4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(user_panel_hedding4Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel71)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator16))
        );
        user_panel_hedding4Layout.setVerticalGroup(
            user_panel_hedding4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(user_panel_hedding4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(user_panel_hedding4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel71)
                    .addComponent(jSeparator16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        txt_Input_Panel_Branch4.setBackground(new java.awt.Color(255, 255, 255));
        txt_Input_Panel_Branch4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Salary Approval", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 14))); // NOI18N
        txt_Input_Panel_Branch4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_new_primary_project.setBackground(new java.awt.Color(0, 204, 102));
        btn_new_primary_project.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_new_primary_project.setForeground(new java.awt.Color(255, 255, 255));
        btn_new_primary_project.setText("Process");
        btn_new_primary_project.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_new_primary_projectActionPerformed(evt);
            }
        });
        txt_Input_Panel_Branch4.add(btn_new_primary_project, new org.netbeans.lib.awtextra.AbsoluteConstraints(447, 530, 89, 34));

        jLabel106.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel106.setText("Site");
        txt_Input_Panel_Branch4.add(jLabel106, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, 23));

        txt_project_tender_result1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_project_tender_result1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_project_tender_result1ActionPerformed(evt);
            }
        });
        txt_Input_Panel_Branch4.add(txt_project_tender_result1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 520, 241));

        btn_new_primary_project1.setBackground(new java.awt.Color(51, 51, 255));
        btn_new_primary_project1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_new_primary_project1.setForeground(new java.awt.Color(255, 255, 255));
        btn_new_primary_project1.setText("Print Detail");
        btn_new_primary_project1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_new_primary_project1ActionPerformed(evt);
            }
        });
        txt_Input_Panel_Branch4.add(btn_new_primary_project1, new org.netbeans.lib.awtextra.AbsoluteConstraints(921, 530, -1, 34));

        jComboBox1.setEditable(true);
        jComboBox1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Select Site -" }));
        txt_Input_Panel_Branch4.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 400, 31));

        jCheckBox1.setForeground(new java.awt.Color(255, 0, 51));
        jCheckBox1.setText("All");
        txt_Input_Panel_Branch4.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 30, -1, 31));

        jLabel107.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel107.setText("From Date");
        txt_Input_Panel_Branch4.add(jLabel107, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, 23));

        from_date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                from_dateActionPerformed(evt);
            }
        });
        txt_Input_Panel_Branch4.add(from_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 400, 31));

        jLabel108.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel108.setText("To Date");
        txt_Input_Panel_Branch4.add(jLabel108, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, 23));

        from_date1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                from_date1ActionPerformed(evt);
            }
        });
        txt_Input_Panel_Branch4.add(from_date1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 400, 31));

        jComboBox2.setEditable(true);
        jComboBox2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Select Payment status -" }));
        txt_Input_Panel_Branch4.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 400, 31));

        jLabel109.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel109.setText("Payment Status");
        txt_Input_Panel_Branch4.add(jLabel109, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, 23));

        jLabel110.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel110.setText("Employee ID");
        txt_Input_Panel_Branch4.add(jLabel110, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, 23));

        jComboBox3.setEditable(true);
        jComboBox3.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "leave empty to load all employees within the selection" }));
        txt_Input_Panel_Branch4.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 400, 31));

        jButton1.setBackground(new java.awt.Color(51, 51, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Load");
        txt_Input_Panel_Branch4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 210, 86, 33));

        jLabel111.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel111.setText("Daily Salary to be Paid(Summary)");
        txt_Input_Panel_Branch4.add(jLabel111, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, 23));

        btn_new_primary_project2.setBackground(new java.awt.Color(51, 51, 255));
        btn_new_primary_project2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_new_primary_project2.setForeground(new java.awt.Color(255, 255, 255));
        btn_new_primary_project2.setText("Print Summary");
        btn_new_primary_project2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_new_primary_project2ActionPerformed(evt);
            }
        });
        txt_Input_Panel_Branch4.add(btn_new_primary_project2, new org.netbeans.lib.awtextra.AbsoluteConstraints(326, 530, -1, 34));

        btn_new_primary_project3.setBackground(new java.awt.Color(51, 51, 255));
        btn_new_primary_project3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_new_primary_project3.setForeground(new java.awt.Color(255, 255, 255));
        btn_new_primary_project3.setText("Load Details");
        btn_new_primary_project3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_new_primary_project3ActionPerformed(evt);
            }
        });
        txt_Input_Panel_Branch4.add(btn_new_primary_project3, new org.netbeans.lib.awtextra.AbsoluteConstraints(221, 530, -1, 34));

        txt_project_tender_result2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_project_tender_result2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_project_tender_result2ActionPerformed(evt);
            }
        });
        txt_Input_Panel_Branch4.add(txt_project_tender_result2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 90, 474, 400));

        jLabel112.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel112.setText("Daily Salary to be Paid(Detail)");
        txt_Input_Panel_Branch4.add(jLabel112, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 70, -1, 23));

        javax.swing.GroupLayout Meterial_Allocation_PanelLayout = new javax.swing.GroupLayout(Meterial_Allocation_Panel);
        Meterial_Allocation_Panel.setLayout(Meterial_Allocation_PanelLayout);
        Meterial_Allocation_PanelLayout.setHorizontalGroup(
            Meterial_Allocation_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(user_panel_hedding4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(Meterial_Allocation_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_Input_Panel_Branch4, javax.swing.GroupLayout.DEFAULT_SIZE, 1032, Short.MAX_VALUE)
                .addContainerGap())
        );
        Meterial_Allocation_PanelLayout.setVerticalGroup(
            Meterial_Allocation_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Meterial_Allocation_PanelLayout.createSequentialGroup()
                .addComponent(user_panel_hedding4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_Input_Panel_Branch4, javax.swing.GroupLayout.DEFAULT_SIZE, 573, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Meterial_Allocation_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, 1052, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Meterial_Allocation_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, 707, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_new_primary_projectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_new_primary_projectActionPerformed

    }//GEN-LAST:event_btn_new_primary_projectActionPerformed

    private void btn_new_primary_project1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_new_primary_project1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_new_primary_project1ActionPerformed

    private void from_dateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_from_dateActionPerformed

    }//GEN-LAST:event_from_dateActionPerformed

    private void from_date1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_from_date1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_from_date1ActionPerformed

    private void btn_new_primary_project2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_new_primary_project2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_new_primary_project2ActionPerformed

    private void btn_new_primary_project3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_new_primary_project3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_new_primary_project3ActionPerformed

    private void txt_project_tender_result2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_project_tender_result2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_project_tender_result2ActionPerformed

    private void txt_project_tender_result1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_project_tender_result1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_project_tender_result1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Meterial_Allocation_Panel;
    private javax.swing.JButton btn_new_primary_project;
    private javax.swing.JButton btn_new_primary_project1;
    private javax.swing.JButton btn_new_primary_project2;
    private javax.swing.JButton btn_new_primary_project3;
    private org.jdesktop.swingx.JXDatePicker from_date;
    private org.jdesktop.swingx.JXDatePicker from_date1;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JPanel txt_Input_Panel_Branch4;
    private javax.swing.JTextField txt_project_tender_result1;
    private javax.swing.JTextField txt_project_tender_result2;
    private javax.swing.JPanel user_panel_hedding4;
    // End of variables declaration//GEN-END:variables
}
