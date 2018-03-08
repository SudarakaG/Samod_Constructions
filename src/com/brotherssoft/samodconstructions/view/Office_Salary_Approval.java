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
public class Office_Salary_Approval extends javax.swing.JPanel {

    /**
     * Creates new form Office_Salary_Approval
     */
    public Office_Salary_Approval() {
        initComponents();
        from_date.setFormats("yyyy-MM-dd","yyyy/MM/dd");
        to_date.setFormats("yyyy-MM-dd","yyyy/MM/dd");
        
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
        jLabel133 = new javax.swing.JLabel();
        from_date = new org.jdesktop.swingx.JXDatePicker();
        btn_new_primary_project = new javax.swing.JButton();
        jLabel106 = new javax.swing.JLabel();
        txt_project_tender_result1 = new javax.swing.JTextField();
        jLabel134 = new javax.swing.JLabel();
        to_date = new org.jdesktop.swingx.JXDatePicker();
        jButton1 = new javax.swing.JButton();
        btn_new_primary_project1 = new javax.swing.JButton();
        txt_project_tender_result2 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();

        Meterial_Allocation_Panel.setBackground(new java.awt.Color(255, 255, 255));
        Meterial_Allocation_Panel.setPreferredSize(new java.awt.Dimension(1050, 710));

        user_panel_hedding4.setBackground(new java.awt.Color(122, 72, 222));

        jLabel68.setBackground(new java.awt.Color(255, 255, 255));
        jLabel68.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(204, 204, 255));
        jLabel68.setText("Administrations / System Management / Operations /");

        jLabel71.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel71.setForeground(new java.awt.Color(204, 204, 204));
        jLabel71.setText("Office Salary Approval");

        javax.swing.GroupLayout user_panel_hedding4Layout = new javax.swing.GroupLayout(user_panel_hedding4);
        user_panel_hedding4.setLayout(user_panel_hedding4Layout);
        user_panel_hedding4Layout.setHorizontalGroup(
            user_panel_hedding4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(user_panel_hedding4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(511, Short.MAX_VALUE))
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
                .addGroup(user_panel_hedding4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel71)
                    .addComponent(jSeparator16, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        txt_Input_Panel_Branch4.setBackground(new java.awt.Color(255, 255, 255));
        txt_Input_Panel_Branch4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Salary Approval", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 14))); // NOI18N

        jLabel133.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel133.setText("From Date");

        from_date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                from_dateActionPerformed(evt);
            }
        });

        btn_new_primary_project.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_new_primary_project.setForeground(new java.awt.Color(255, 0, 51));
        btn_new_primary_project.setText("Process");
        btn_new_primary_project.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_new_primary_projectActionPerformed(evt);
            }
        });

        jLabel106.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel106.setText("Salaries to be Approved");

        txt_project_tender_result1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_project_tender_result1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_project_tender_result1ActionPerformed(evt);
            }
        });

        jLabel134.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel134.setText("To Date");

        to_date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                to_dateActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jButton1.setText("Load");

        btn_new_primary_project1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_new_primary_project1.setForeground(new java.awt.Color(255, 0, 51));
        btn_new_primary_project1.setText("Change");
        btn_new_primary_project1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_new_primary_project1ActionPerformed(evt);
            }
        });

        txt_project_tender_result2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_project_tender_result2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_project_tender_result2ActionPerformed(evt);
            }
        });

        jComboBox1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Salary Status To View -" }));

        javax.swing.GroupLayout txt_Input_Panel_Branch4Layout = new javax.swing.GroupLayout(txt_Input_Panel_Branch4);
        txt_Input_Panel_Branch4.setLayout(txt_Input_Panel_Branch4Layout);
        txt_Input_Panel_Branch4Layout.setHorizontalGroup(
            txt_Input_Panel_Branch4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txt_Input_Panel_Branch4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(txt_Input_Panel_Branch4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(txt_Input_Panel_Branch4Layout.createSequentialGroup()
                        .addComponent(jLabel133, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(from_date, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel134, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(to_date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(354, 354, 354))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, txt_Input_Panel_Branch4Layout.createSequentialGroup()
                        .addGroup(txt_Input_Panel_Branch4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel106, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_project_tender_result1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_new_primary_project, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(txt_Input_Panel_Branch4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_project_tender_result2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_new_primary_project1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        txt_Input_Panel_Branch4Layout.setVerticalGroup(
            txt_Input_Panel_Branch4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txt_Input_Panel_Branch4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(txt_Input_Panel_Branch4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(from_date, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel133, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(to_date, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel134, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(txt_Input_Panel_Branch4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, txt_Input_Panel_Branch4Layout.createSequentialGroup()
                        .addComponent(jLabel106, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_project_tender_result1, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_new_primary_project, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, txt_Input_Panel_Branch4Layout.createSequentialGroup()
                        .addComponent(jComboBox1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_project_tender_result2, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_new_primary_project1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout Meterial_Allocation_PanelLayout = new javax.swing.GroupLayout(Meterial_Allocation_Panel);
        Meterial_Allocation_Panel.setLayout(Meterial_Allocation_PanelLayout);
        Meterial_Allocation_PanelLayout.setHorizontalGroup(
            Meterial_Allocation_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(user_panel_hedding4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(Meterial_Allocation_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_Input_Panel_Branch4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        Meterial_Allocation_PanelLayout.setVerticalGroup(
            Meterial_Allocation_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Meterial_Allocation_PanelLayout.createSequentialGroup()
                .addComponent(user_panel_hedding4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_Input_Panel_Branch4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
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

    private void from_dateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_from_dateActionPerformed

    }//GEN-LAST:event_from_dateActionPerformed

    private void btn_new_primary_projectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_new_primary_projectActionPerformed

    }//GEN-LAST:event_btn_new_primary_projectActionPerformed

    private void txt_project_tender_result1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_project_tender_result1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_project_tender_result1ActionPerformed

    private void to_dateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_to_dateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_to_dateActionPerformed

    private void btn_new_primary_project1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_new_primary_project1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_new_primary_project1ActionPerformed

    private void txt_project_tender_result2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_project_tender_result2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_project_tender_result2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Meterial_Allocation_Panel;
    private javax.swing.JButton btn_new_primary_project;
    private javax.swing.JButton btn_new_primary_project1;
    private org.jdesktop.swingx.JXDatePicker from_date;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel133;
    private javax.swing.JLabel jLabel134;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JSeparator jSeparator16;
    private org.jdesktop.swingx.JXDatePicker to_date;
    private javax.swing.JPanel txt_Input_Panel_Branch4;
    private javax.swing.JTextField txt_project_tender_result1;
    private javax.swing.JTextField txt_project_tender_result2;
    private javax.swing.JPanel user_panel_hedding4;
    // End of variables declaration//GEN-END:variables
}
