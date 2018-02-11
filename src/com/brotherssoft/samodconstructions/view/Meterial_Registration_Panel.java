/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.view;

import com.brotherssoft.samodconstructions.controller.M_MaterialController;
import com.brotherssoft.samodconstructions.controller.R_UnitController;
import com.brotherssoft.samodconstructions.custom.IDGenerator;
import com.brotherssoft.samodconstructions.model.M_Material;
import com.brotherssoft.samodconstructions.model.R_Unit;
import com.brotherssoft.samodconstructions.serverconnector.ServerConnector;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Akvasoft
 */
public class Meterial_Registration_Panel extends javax.swing.JPanel {

    R_UnitController unitController;
    M_MaterialController materialController;
    DefaultTableModel dtmMaterial;
    
    /**
     * Creates new form Meterial_Registration_Panel
     */
    public Meterial_Registration_Panel() throws Exception {
        initComponents();
        
        unitController = ServerConnector.getServerConnetor().getUnitController();
        materialController = ServerConnector.getServerConnetor().getMaterialController();
        dtmMaterial = (DefaultTableModel) tbl_material_info.getModel();
        
        loadUnitCombo();
        loadMaterialTable();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Meterial_Registration_Panel1 = new javax.swing.JPanel();
        user_panel_hedding9 = new javax.swing.JPanel();
        jLabel88 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jSeparator21 = new javax.swing.JSeparator();
        bank_panel_input_area4 = new javax.swing.JPanel();
        jLabel157 = new javax.swing.JLabel();
        jLabel158 = new javax.swing.JLabel();
        jLabel159 = new javax.swing.JLabel();
        jLabel160 = new javax.swing.JLabel();
        txt_material_name1 = new javax.swing.JTextField();
        jScrollPane18 = new javax.swing.JScrollPane();
        txtArea_material_desc = new javax.swing.JTextArea();
        btn_save_material = new javax.swing.JButton();
        btn_new_material = new javax.swing.JButton();
        cmb_material_unit = new javax.swing.JComboBox<>();
        btn_material = new javax.swing.JButton();
        jLabel161 = new javax.swing.JLabel();
        cmb_material_status = new javax.swing.JComboBox<>();
        datePicker_material_reg_date = new org.jdesktop.swingx.JXDatePicker();
        bank_panel_tbl4 = new javax.swing.JPanel();
        jScrollPane19 = new javax.swing.JScrollPane();
        tbl_material_info = new javax.swing.JTable();
        txt_search_material = new javax.swing.JTextField();

        Meterial_Registration_Panel1.setBackground(new java.awt.Color(255, 255, 255));
        Meterial_Registration_Panel1.setPreferredSize(new java.awt.Dimension(1050, 710));

        user_panel_hedding9.setBackground(new java.awt.Color(122, 72, 222));

        jLabel88.setBackground(new java.awt.Color(255, 255, 255));
        jLabel88.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel88.setForeground(new java.awt.Color(204, 204, 255));
        jLabel88.setText("Administrations / System Management / Master Details /");

        jLabel89.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel89.setForeground(new java.awt.Color(204, 204, 204));
        jLabel89.setText("Meterial Registration");

        javax.swing.GroupLayout user_panel_hedding9Layout = new javax.swing.GroupLayout(user_panel_hedding9);
        user_panel_hedding9.setLayout(user_panel_hedding9Layout);
        user_panel_hedding9Layout.setHorizontalGroup(
            user_panel_hedding9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(user_panel_hedding9Layout.createSequentialGroup()
                .addGroup(user_panel_hedding9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(user_panel_hedding9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel88, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(user_panel_hedding9Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel89)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator21)))
                .addContainerGap())
        );
        user_panel_hedding9Layout.setVerticalGroup(
            user_panel_hedding9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(user_panel_hedding9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel88, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(user_panel_hedding9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel89)
                    .addComponent(jSeparator21, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        bank_panel_input_area4.setBackground(new java.awt.Color(255, 255, 255));
        bank_panel_input_area4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Save And Modify Material", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 14))); // NOI18N

        jLabel157.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel157.setText("Material Name");

        jLabel158.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel158.setText("Registration Date");

        jLabel159.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel159.setText("Unit");

        jLabel160.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel160.setText("Description");

        txt_material_name1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt_material_name1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_material_name1ActionPerformed(evt);
            }
        });
        txt_material_name1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_material_name1KeyReleased(evt);
            }
        });

        txtArea_material_desc.setColumns(20);
        txtArea_material_desc.setRows(5);
        txtArea_material_desc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtArea_material_descKeyPressed(evt);
            }
        });
        jScrollPane18.setViewportView(txtArea_material_desc);

        btn_save_material.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_save_material.setText("Save");
        btn_save_material.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_save_materialActionPerformed(evt);
            }
        });

        btn_new_material.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_new_material.setText("New");
        btn_new_material.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_new_materialActionPerformed(evt);
            }
        });

        cmb_material_unit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cmb_material_unit.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Select Unit -" }));
        cmb_material_unit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_material_unitActionPerformed(evt);
            }
        });

        btn_material.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_material.setText("Material");
        btn_material.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_materialMouseClicked(evt);
            }
        });

        jLabel161.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel161.setText("Status");

        cmb_material_status.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cmb_material_status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Active", "Inactive" }));
        cmb_material_status.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_material_statusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bank_panel_input_area4Layout = new javax.swing.GroupLayout(bank_panel_input_area4);
        bank_panel_input_area4.setLayout(bank_panel_input_area4Layout);
        bank_panel_input_area4Layout.setHorizontalGroup(
            bank_panel_input_area4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bank_panel_input_area4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bank_panel_input_area4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bank_panel_input_area4Layout.createSequentialGroup()
                        .addComponent(jLabel157, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_material_name1))
                    .addGroup(bank_panel_input_area4Layout.createSequentialGroup()
                        .addComponent(jLabel160, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane18, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE))
                    .addGroup(bank_panel_input_area4Layout.createSequentialGroup()
                        .addComponent(jLabel158, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(datePicker_material_reg_date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(bank_panel_input_area4Layout.createSequentialGroup()
                        .addComponent(jLabel159, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmb_material_unit, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bank_panel_input_area4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_material, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_save_material, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_new_material, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bank_panel_input_area4Layout.createSequentialGroup()
                        .addComponent(jLabel161, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmb_material_status, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        bank_panel_input_area4Layout.setVerticalGroup(
            bank_panel_input_area4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bank_panel_input_area4Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(bank_panel_input_area4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel157, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_material_name1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(bank_panel_input_area4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel160, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(bank_panel_input_area4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel159, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmb_material_unit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(bank_panel_input_area4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel161, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmb_material_status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(bank_panel_input_area4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel158, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(datePicker_material_reg_date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(40, 40, 40)
                .addGroup(bank_panel_input_area4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_save_material, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_new_material, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_material, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bank_panel_tbl4.setBackground(new java.awt.Color(255, 255, 255));
        bank_panel_tbl4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Material Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 14))); // NOI18N

        tbl_material_info.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tbl_material_info.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Material Name", "Status", "Register Date"
            }
        ));
        tbl_material_info.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tbl_material_info.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_material_infoMouseClicked(evt);
            }
        });
        jScrollPane19.setViewportView(tbl_material_info);

        txt_search_material.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txt_search_material.setForeground(new java.awt.Color(102, 102, 102));
        txt_search_material.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_search_material.setText("Search Material");
        txt_search_material.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_search_materialMouseClicked(evt);
            }
        });
        txt_search_material.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_search_materialKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout bank_panel_tbl4Layout = new javax.swing.GroupLayout(bank_panel_tbl4);
        bank_panel_tbl4.setLayout(bank_panel_tbl4Layout);
        bank_panel_tbl4Layout.setHorizontalGroup(
            bank_panel_tbl4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bank_panel_tbl4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bank_panel_tbl4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane19, javax.swing.GroupLayout.DEFAULT_SIZE, 472, Short.MAX_VALUE)
                    .addGroup(bank_panel_tbl4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txt_search_material, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        bank_panel_tbl4Layout.setVerticalGroup(
            bank_panel_tbl4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bank_panel_tbl4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txt_search_material, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout Meterial_Registration_Panel1Layout = new javax.swing.GroupLayout(Meterial_Registration_Panel1);
        Meterial_Registration_Panel1.setLayout(Meterial_Registration_Panel1Layout);
        Meterial_Registration_Panel1Layout.setHorizontalGroup(
            Meterial_Registration_Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Meterial_Registration_Panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bank_panel_input_area4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bank_panel_tbl4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(user_panel_hedding9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        Meterial_Registration_Panel1Layout.setVerticalGroup(
            Meterial_Registration_Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Meterial_Registration_Panel1Layout.createSequentialGroup()
                .addComponent(user_panel_hedding9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(Meterial_Registration_Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bank_panel_input_area4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bank_panel_tbl4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Meterial_Registration_Panel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1070, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Meterial_Registration_Panel1, javax.swing.GroupLayout.DEFAULT_SIZE, 704, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_materialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_materialMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_materialMouseClicked

    private void btn_save_materialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_save_materialActionPerformed
        if(btn_save_material.getText().equalsIgnoreCase("Save")){
            saveMaterial();
        }else{
            updateMaterial();
        }
        loadMaterialTable();
        clearFields();
    }//GEN-LAST:event_btn_save_materialActionPerformed

    private void tbl_material_infoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_material_infoMouseClicked
        loadFieldsFromTable(searchByTableName());
        txt_search_material.setText("Search Material");
        txt_search_material.setForeground(Color.GRAY);
    }//GEN-LAST:event_tbl_material_infoMouseClicked

    private void btn_new_materialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_new_materialActionPerformed
        clearFields();
    }//GEN-LAST:event_btn_new_materialActionPerformed

    private void txt_search_materialKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_search_materialKeyReleased
        try {
            dtmMaterial.setRowCount(0);
            List<M_Material> allMaterials = materialController.getAllMaterialsByLetter(txt_search_material.getText());
            for (M_Material allMaterial : allMaterials) {
                String status = "";
                if(allMaterial.getMaterial_status() == 0){
                    status = "Active";
                }else{
                    status = "Inactive";
                }
                Date material_regDate = allMaterial.getMaterial_regDate();
                SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
                String format = sdf.format(material_regDate);
                String[] rowData = {allMaterial.getMaterial_name(),status,format};
                dtmMaterial.addRow(rowData);
            }
        } catch (Exception ex) {
            Logger.getLogger(Meterial_Registration_Panel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txt_search_materialKeyReleased

    private void txt_search_materialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_search_materialMouseClicked
        txt_search_material.setText("");
        txt_search_material.setForeground(Color.BLACK);
    }//GEN-LAST:event_txt_search_materialMouseClicked

    private void txt_material_name1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_material_name1ActionPerformed
        txtArea_material_desc.requestFocus();
    }//GEN-LAST:event_txt_material_name1ActionPerformed

    private void txtArea_material_descKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtArea_material_descKeyPressed
        cmb_material_unit.requestFocus();
    }//GEN-LAST:event_txtArea_material_descKeyPressed

    private void cmb_material_unitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_material_unitActionPerformed
        cmb_material_status.requestFocus();
    }//GEN-LAST:event_cmb_material_unitActionPerformed

    private void cmb_material_statusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_material_statusActionPerformed
        datePicker_material_reg_date.requestFocus();
    }//GEN-LAST:event_cmb_material_statusActionPerformed

    private void txt_material_name1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_material_name1KeyReleased
        try {
            M_Material searchMaterial = materialController.searchMaterial(txt_material_name1.getText());
            if(searchMaterial != null){
                JOptionPane.showMessageDialog(this, "A Material Already Save in this Name..");
                loadFieldsFromTable(searchMaterial);
            }
        } catch (Exception ex) {
            Logger.getLogger(Meterial_Registration_Panel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txt_material_name1KeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Meterial_Registration_Panel1;
    private javax.swing.JPanel bank_panel_input_area4;
    private javax.swing.JPanel bank_panel_tbl4;
    private javax.swing.JButton btn_material;
    private javax.swing.JButton btn_new_material;
    private javax.swing.JButton btn_save_material;
    private javax.swing.JComboBox<String> cmb_material_status;
    private javax.swing.JComboBox<String> cmb_material_unit;
    private org.jdesktop.swingx.JXDatePicker datePicker_material_reg_date;
    private javax.swing.JLabel jLabel157;
    private javax.swing.JLabel jLabel158;
    private javax.swing.JLabel jLabel159;
    private javax.swing.JLabel jLabel160;
    private javax.swing.JLabel jLabel161;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JSeparator jSeparator21;
    private javax.swing.JTable tbl_material_info;
    private javax.swing.JTextArea txtArea_material_desc;
    private javax.swing.JTextField txt_material_name1;
    private javax.swing.JTextField txt_search_material;
    private javax.swing.JPanel user_panel_hedding9;
    // End of variables declaration//GEN-END:variables

    private void loadUnitCombo() {
        try {
            cmb_material_unit.removeAll();
            List<R_Unit> allUnits = unitController.getAllUnits();
            for (R_Unit allUnit : allUnits) {
                cmb_material_unit.addItem(allUnit.getUnit_name());
            }
        } catch (Exception ex) {
            Logger.getLogger(Meterial_Registration_Panel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void loadMaterialTable() {
        try {
            dtmMaterial.setRowCount(0);
            List<M_Material> allMaterials = materialController.getAllMaterials();
            for (M_Material allMaterial : allMaterials) {
                String status = "";
                if(allMaterial.getMaterial_status() == 0){
                    status = "Active";
                }else{
                    status = "Inactive";
                }
                Date material_regDate = allMaterial.getMaterial_regDate();
                SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
                String format = sdf.format(material_regDate);
                String[] rowData = {allMaterial.getMaterial_name(),status,format};
                dtmMaterial.addRow(rowData);
            }
        } catch (Exception ex) {
            Logger.getLogger(Meterial_Registration_Panel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void saveMaterial() {
        if(cmb_material_unit.getSelectedIndex() != 0){
        try {
            
            int materialId = IDGenerator.getNewID("m_material", "MATERIAL_ID");
            String materialName = txt_material_name1.getText();
            String materialDesc = txtArea_material_desc.getText();
            int unitId = unitController.searchUnit(cmb_material_unit.getSelectedItem().toString()).getUnit_id();
            int status = cmb_material_status.getSelectedIndex();
            Date regDate = datePicker_material_reg_date.getDate();
            
            M_Material material = new M_Material(materialId, materialName, materialDesc, unitId, status, regDate);
            boolean addMaterial = materialController.addMaterial(material);
            if (addMaterial) {
                JOptionPane.showMessageDialog(this, "Material Successfulley Added..");
            }else{
                JOptionPane.showMessageDialog(this, "Adding Material Failed.. Please Check Again..");
            }
            
        } catch (Exception ex) {
            Logger.getLogger(Meterial_Registration_Panel.class.getName()).log(Level.SEVERE, null, ex);
        }
        }else{
            JOptionPane.showMessageDialog(this, "Please Select the Unit");
        }
    }

    private void updateMaterial() {
        if(cmb_material_unit.getSelectedIndex() != 0){
        try {
            
            int materialId = searchByTableName().getMaterial_id();
            String materialName = txt_material_name1.getText();
            String materialDesc = txtArea_material_desc.getText();
            int unitId = unitController.searchUnit(cmb_material_unit.getSelectedItem().toString()).getUnit_id();
            int status = cmb_material_status.getSelectedIndex();
            Date regDate = datePicker_material_reg_date.getDate();
            
            M_Material material = new M_Material(materialId, materialName, materialDesc, unitId, status, regDate);
            boolean updateMaterial = materialController.updateMaterial(material);
            if (updateMaterial) {
                JOptionPane.showMessageDialog(this, "Material Successfulley Updated..");
            }else{
                JOptionPane.showMessageDialog(this, "Updating Material Failed.. Please Check Again..");
            }
            
        } catch (Exception ex) {
            Logger.getLogger(Meterial_Registration_Panel.class.getName()).log(Level.SEVERE, null, ex);
        }
        }else{
            JOptionPane.showMessageDialog(this, "Please Select the Unit");
        }
    }

    private void loadFieldsFromTable(M_Material material) {
        try {
            
            
            txt_material_name1.setText(material.getMaterial_name());
            txtArea_material_desc.setText(material.getMaterial_description());
            cmb_material_unit.setSelectedItem(unitController.searchUnit(material.getMaterial_unit_id()).getUnit_name());
            cmb_material_status.setSelectedIndex(material.getMaterial_status());
            datePicker_material_reg_date.setDate(material.getMaterial_regDate());
            
            btn_save_material.setText("Update");
            
        } catch (Exception ex) {
            Logger.getLogger(Meterial_Registration_Panel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    private M_Material searchByTableName() {
        int selectedRow = tbl_material_info.getSelectedRow();
        String name = (String) dtmMaterial.getValueAt(selectedRow, 0);
        M_Material searchMaterial = null;
        try {
            searchMaterial = materialController.searchMaterial(name);
        } catch (Exception ex) {
            Logger.getLogger(Meterial_Registration_Panel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return searchMaterial;
    }

    private void clearFields() {
        txt_material_name1.setText("");
        txtArea_material_desc.setText("");
        cmb_material_unit.setSelectedIndex(0);
        cmb_material_status.setSelectedIndex(0);
        datePicker_material_reg_date.setDate(new Date());
        
        btn_save_material.setText("Save");
    }
}
