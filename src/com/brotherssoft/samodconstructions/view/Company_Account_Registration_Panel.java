/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.view;

import com.brotherssoft.samodconstructions.controller.M_AccountController;
import com.brotherssoft.samodconstructions.controller.R_AccountTypeController;
import com.brotherssoft.samodconstructions.controller.R_BankController;
import com.brotherssoft.samodconstructions.controller.R_BranchController;
import com.brotherssoft.samodconstructions.custom.IDGenerator;
import com.brotherssoft.samodconstructions.model.M_Account;
import com.brotherssoft.samodconstructions.model.R_AccountType;
import com.brotherssoft.samodconstructions.model.R_Bank;
import com.brotherssoft.samodconstructions.model.R_Branch;
import com.brotherssoft.samodconstructions.serverconnector.ServerConnector;
import java.awt.Color;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Akvasoft
 */
public class Company_Account_Registration_Panel extends javax.swing.JPanel {

    M_AccountController accountController;
    R_AccountTypeController accountTypeController;
    R_BankController bankController;
    R_BranchController branchController;

    DefaultTableModel dtmcomAccount;

    /**
     * Creates new form Company_Account_Registration_Panel
     */
    public Company_Account_Registration_Panel() throws Exception {
        initComponents();

        accountController = ServerConnector.getServerConnetor().getAccountController();
        accountTypeController = ServerConnector.getServerConnetor().getAccountTypeController();
        bankController = ServerConnector.getServerConnetor().getBankController();
        branchController = ServerConnector.getServerConnetor().getBranchController();
        dtmcomAccount = (DefaultTableModel) tbl_acc.getModel();

        loadToBankCombo();
        loadToAccountTypeCombo();
        loadCompanyAccountTable();
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
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        txt_acc_no = new javax.swing.JTextField();
        txt_acc_name = new javax.swing.JTextField();
        btn_acc_save = new javax.swing.JButton();
        btn_acc_new = new javax.swing.JButton();
        cmb_acc_states = new javax.swing.JComboBox<>();
        cmb_CAR_Bank = new javax.swing.JComboBox<>();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        cmb_CAR_Branch = new javax.swing.JComboBox<>();
        jLabel27 = new javax.swing.JLabel();
        cmb_CAR_Acc_Type = new javax.swing.JComboBox<>();
        bank_panel_tbl1 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tbl_acc = new javax.swing.JTable();
        txt_acc_search = new javax.swing.JTextField();

        Company_Account_Registration.setBackground(new java.awt.Color(255, 255, 255));
        Company_Account_Registration.setPreferredSize(new java.awt.Dimension(1050, 710));

        bank_panel_hedding2.setBackground(new java.awt.Color(122, 72, 222));

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(204, 204, 255));
        jLabel19.setText("Administrations / System Management / Master Detail /");

        jLabel20.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(204, 204, 204));
        jLabel20.setText("Company Account Registration");

        javax.swing.GroupLayout bank_panel_hedding2Layout = new javax.swing.GroupLayout(bank_panel_hedding2);
        bank_panel_hedding2.setLayout(bank_panel_hedding2Layout);
        bank_panel_hedding2Layout.setHorizontalGroup(
            bank_panel_hedding2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bank_panel_hedding2Layout.createSequentialGroup()
                .addGroup(bank_panel_hedding2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bank_panel_hedding2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bank_panel_hedding2Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bank_panel_hedding2Layout.setVerticalGroup(
            bank_panel_hedding2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bank_panel_hedding2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bank_panel_hedding2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel20)
                    .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        bank_panel_input_area1.setBackground(new java.awt.Color(255, 255, 255));
        bank_panel_input_area1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Save And Modify  Bank Accounts", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 14))); // NOI18N

        jLabel21.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel21.setText("Account No");

        jLabel22.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel22.setText("Account Name");

        jLabel23.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel23.setText("States");

        txt_acc_no.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt_acc_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_acc_noActionPerformed(evt);
            }
        });
        txt_acc_no.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_acc_noKeyReleased(evt);
            }
        });

        txt_acc_name.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt_acc_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_acc_nameActionPerformed(evt);
            }
        });

        btn_acc_save.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_acc_save.setText("Save");
        btn_acc_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_acc_saveActionPerformed(evt);
            }
        });

        btn_acc_new.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_acc_new.setText("New");
        btn_acc_new.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_acc_newActionPerformed(evt);
            }
        });

        cmb_acc_states.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cmb_acc_states.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Active", "Inactive" }));

        cmb_CAR_Bank.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cmb_CAR_Bank.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Select Bank -" }));
        cmb_CAR_Bank.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmb_CAR_BankItemStateChanged(evt);
            }
        });
        cmb_CAR_Bank.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_CAR_BankActionPerformed(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel25.setText("Bank");

        jLabel26.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel26.setText("Branch");

        cmb_CAR_Branch.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cmb_CAR_Branch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Select Branch -" }));
        cmb_CAR_Branch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_CAR_BranchActionPerformed(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel27.setText("Account Type");

        cmb_CAR_Acc_Type.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cmb_CAR_Acc_Type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Select Account Type -" }));
        cmb_CAR_Acc_Type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_CAR_Acc_TypeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bank_panel_input_area1Layout = new javax.swing.GroupLayout(bank_panel_input_area1);
        bank_panel_input_area1.setLayout(bank_panel_input_area1Layout);
        bank_panel_input_area1Layout.setHorizontalGroup(
            bank_panel_input_area1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bank_panel_input_area1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bank_panel_input_area1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bank_panel_input_area1Layout.createSequentialGroup()
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_acc_no))
                    .addGroup(bank_panel_input_area1Layout.createSequentialGroup()
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_acc_name))
                    .addGroup(bank_panel_input_area1Layout.createSequentialGroup()
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmb_acc_states, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bank_panel_input_area1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_acc_save, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_acc_new, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bank_panel_input_area1Layout.createSequentialGroup()
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmb_CAR_Bank, 0, 326, Short.MAX_VALUE))
                    .addGroup(bank_panel_input_area1Layout.createSequentialGroup()
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmb_CAR_Branch, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(bank_panel_input_area1Layout.createSequentialGroup()
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmb_CAR_Acc_Type, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        bank_panel_input_area1Layout.setVerticalGroup(
            bank_panel_input_area1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bank_panel_input_area1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(bank_panel_input_area1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmb_CAR_Bank, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(bank_panel_input_area1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmb_CAR_Branch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(bank_panel_input_area1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_acc_no, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(bank_panel_input_area1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_acc_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(bank_panel_input_area1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmb_CAR_Acc_Type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(bank_panel_input_area1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmb_acc_states, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(bank_panel_input_area1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_acc_save, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_acc_new, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bank_panel_tbl1.setBackground(new java.awt.Color(255, 255, 255));
        bank_panel_tbl1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Account Infomations", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 14))); // NOI18N

        tbl_acc.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tbl_acc.setModel(new javax.swing.table.DefaultTableModel(
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
                "Bank Name", "Branch Name", "Account No"
            }
        ));
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
        txt_acc_search.setText("Search Account");
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
                .addContainerGap(30, Short.MAX_VALUE))
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
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Company_Account_Registration, javax.swing.GroupLayout.DEFAULT_SIZE, 1059, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Company_Account_Registration, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_acc_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_acc_saveActionPerformed
        if (btn_acc_save.getText().equalsIgnoreCase("Save")) {
            saveCompanyAccount();
        } else {
            updateCompanyAccount();
        }
        clearFields();
    }//GEN-LAST:event_btn_acc_saveActionPerformed

    private void cmb_CAR_BankActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_CAR_BankActionPerformed
        if (cmb_CAR_Bank.getSelectedIndex() != 0) {
            loadToBranchCombo();
        }
        cmb_CAR_Branch.requestFocus();
    }//GEN-LAST:event_cmb_CAR_BankActionPerformed

    private void cmb_CAR_BankItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmb_CAR_BankItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_CAR_BankItemStateChanged

    private void tbl_accMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_accMouseClicked
        loadFromAccountTable(searchByTableAccountNo());
        txt_acc_search.setText("Search Account");
        txt_acc_search.setForeground(Color.GRAY);
    }//GEN-LAST:event_tbl_accMouseClicked

    private void btn_acc_newActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_acc_newActionPerformed
        cmb_CAR_Bank.setSelectedIndex(0);
        cmb_CAR_Branch.setSelectedIndex(0);
        txt_acc_no.setText("");
        txt_acc_name.setText("");
        cmb_CAR_Acc_Type.setSelectedIndex(0);
        cmb_acc_states.setSelectedIndex(0);

        btn_acc_save.setText("Save");
    }//GEN-LAST:event_btn_acc_newActionPerformed

    private void txt_acc_searchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_acc_searchMouseClicked
        txt_acc_search.setText("");
        txt_acc_search.setForeground(Color.BLACK);
    }//GEN-LAST:event_txt_acc_searchMouseClicked

    private void txt_acc_searchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_acc_searchKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_acc_searchKeyPressed

    private void txt_acc_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_acc_searchKeyReleased
        try {

            List<M_Account> allAccounts = accountController.getAllAccountsByLetter(txt_acc_search.getText());
            dtmcomAccount.setRowCount(0);
            for (M_Account allAccount : allAccounts) {
                String[] rowData = {bankController.searchBank(allAccount.getAccount_bank_id()).getBank_name(), branchController.searchBranch(allAccount.getAccount_branch_id()).getBranch_name(), allAccount.getAccount_accountNo()};
                dtmcomAccount.addRow(rowData);
            }

        } catch (Exception ex) {
            Logger.getLogger(Company_Account_Registration_Panel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txt_acc_searchKeyReleased

    private void cmb_CAR_BranchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_CAR_BranchActionPerformed
        txt_acc_no.requestFocus();
    }//GEN-LAST:event_cmb_CAR_BranchActionPerformed

    private void txt_acc_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_acc_noActionPerformed
        txt_acc_name.requestFocus();
    }//GEN-LAST:event_txt_acc_noActionPerformed

    private void txt_acc_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_acc_nameActionPerformed
        cmb_CAR_Acc_Type.requestFocus();
    }//GEN-LAST:event_txt_acc_nameActionPerformed

    private void cmb_CAR_Acc_TypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_CAR_Acc_TypeActionPerformed
        cmb_acc_states.requestFocus();
    }//GEN-LAST:event_cmb_CAR_Acc_TypeActionPerformed

    private void txt_acc_noKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_acc_noKeyReleased
        if (cmb_CAR_Bank.getSelectedIndex() != 0 && cmb_CAR_Branch.getSelectedIndex() != 0) {
            try {
                M_Account searchAccount = accountController.searchAccount(txt_acc_no.getText());
                if (searchAccount != null && searchAccount.getAccount_branch_id() == branchController.searchBranch(cmb_CAR_Branch.getSelectedItem().toString(), bankController.searchBankByName(cmb_CAR_Bank.getSelectedItem().toString()).getBank_id()).getBranch_id()) {
                    JOptionPane.showMessageDialog(this, "An Account Already Created in "+cmb_CAR_Bank.getSelectedItem().toString()+" @ "+cmb_CAR_Branch.getSelectedItem().toString()+" Branch");
                    loadFromAccountTable(searchAccount);
                }
            } catch (Exception ex) {
                Logger.getLogger(Company_Account_Registration_Panel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            JOptionPane.showMessageDialog(this, "Please Select the Bank & Branch");
            cmb_CAR_Bank.requestFocus();
        }
    }//GEN-LAST:event_txt_acc_noKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Company_Account_Registration;
    private javax.swing.JPanel bank_panel_hedding2;
    private javax.swing.JPanel bank_panel_input_area1;
    private javax.swing.JPanel bank_panel_tbl1;
    private javax.swing.JButton btn_acc_new;
    private javax.swing.JButton btn_acc_save;
    private javax.swing.JComboBox<String> cmb_CAR_Acc_Type;
    private javax.swing.JComboBox<String> cmb_CAR_Bank;
    private javax.swing.JComboBox<String> cmb_CAR_Branch;
    private javax.swing.JComboBox<String> cmb_acc_states;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JTable tbl_acc;
    private javax.swing.JTextField txt_acc_name;
    private javax.swing.JTextField txt_acc_no;
    private javax.swing.JTextField txt_acc_search;
    // End of variables declaration//GEN-END:variables

    private void saveCompanyAccount() {
        if(cmb_CAR_Bank.getSelectedIndex() != 0 && cmb_CAR_Branch.getSelectedIndex() != 0 && cmb_CAR_Acc_Type.getSelectedIndex() != 0){
        try {
            
            int accountId = IDGenerator.getNewID("m_account", "ACCOUNT_ID");
            int bankId = bankController.searchBankByName(cmb_CAR_Bank.getSelectedItem().toString()).getBank_id();
            int branchId = branchController.searchBranch(cmb_CAR_Branch.getSelectedItem().toString(), bankId).getBranch_id();
            String accountNo = txt_acc_no.getText();
            int accTypeId = accountTypeController.searchAccountType(cmb_CAR_Acc_Type.getSelectedItem().toString()).getAccountType_id();
            String accountStatus = null;
            if (cmb_acc_states.getSelectedIndex() == 0) {
                accountStatus = "A";
            } else {
                accountStatus = "I";
            }
            String accountName = txt_acc_name.getText();

            M_Account account = new M_Account(accountId, bankId, branchId, accountNo, accTypeId, accountStatus, accountName);
            boolean addAccount = accountController.addAccount(account);
            if (addAccount) {
                JOptionPane.showMessageDialog(this, "Company Account Details Saved Successfully..");
            } else {
                JOptionPane.showMessageDialog(this, "Account Details Cannot Save..");
            }

        } catch (Exception ex) {
            Logger.getLogger(Company_Account_Registration_Panel.class.getName()).log(Level.SEVERE, null, ex);
        }
        }else{
            JOptionPane.showMessageDialog(this, "Please Check that the Bank , Branch & Account Type are Selected");
            cmb_CAR_Bank.requestFocus();
        }
        

        loadCompanyAccountTable();

    }

    private void loadToBankCombo() {
        try {

            List<R_Bank> allBanks = bankController.getAllBanks();
            cmb_CAR_Bank.removeAll();
            for (R_Bank allBank : allBanks) {
                cmb_CAR_Bank.addItem(allBank.getBank_name());
            }

        } catch (Exception ex) {
            Logger.getLogger(Company_Account_Registration_Panel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void loadToBranchCombo() {
        try {

            for (int i = 1; i < cmb_CAR_Branch.getItemCount(); i++) {
                cmb_CAR_Branch.removeItemAt(i);
            }

            List<R_Branch> allBranches = branchController.getAllBranches();
            int bankId = bankController.searchBankByName(cmb_CAR_Bank.getSelectedItem().toString()).getBank_id();
//            cmb_CAR_Branch.removeAll();
//            cmb_CAR_Branch.revalidate();
//            cmb_CAR_Branch.repaint();
            for (R_Branch allBranche : allBranches) {
                if (allBranche.getBranch_bank_id() == bankId) {
                    cmb_CAR_Branch.addItem(allBranche.getBranch_name());
                } else {
                    cmb_CAR_Branch.removeAll();
                    cmb_CAR_Branch.revalidate();
                    cmb_CAR_Branch.repaint();
                }
            }

        } catch (Exception ex) {
            Logger.getLogger(Company_Account_Registration_Panel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void loadToAccountTypeCombo() {
        try {

            List<R_AccountType> allAccountTypes = accountTypeController.getAllAccountTypes();
            cmb_CAR_Acc_Type.removeAll();
            for (R_AccountType allAccountType : allAccountTypes) {
                cmb_CAR_Acc_Type.addItem(allAccountType.getAccountType_name());
            }

        } catch (Exception ex) {
            Logger.getLogger(Company_Account_Registration_Panel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void loadCompanyAccountTable() {
        try {

            List<M_Account> allAccounts = accountController.getAllAccounts();
            dtmcomAccount.setRowCount(0);
            for (M_Account allAccount : allAccounts) {
                String[] rowData = {bankController.searchBank(allAccount.getAccount_bank_id()).getBank_name(), branchController.searchBranch(allAccount.getAccount_branch_id()).getBranch_name(), allAccount.getAccount_accountNo()};
                dtmcomAccount.addRow(rowData);
            }

        } catch (Exception ex) {
            Logger.getLogger(Company_Account_Registration_Panel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void loadFromAccountTable(M_Account account) {
        try {

            cmb_CAR_Bank.setSelectedItem(bankController.searchBank(account.getAccount_bank_id()).getBank_name());
            cmb_CAR_Branch.setSelectedItem(branchController.searchBranch(account.getAccount_branch_id()).getBranch_name());
            txt_acc_no.setText(account.getAccount_accountNo());
            txt_acc_name.setText(account.getAccount_accountName());
            cmb_CAR_Acc_Type.setSelectedItem(accountTypeController.searchAccountType(account.getAccount_accountType_id()).getAccountType_name());

            if (account.getAccount_status().equalsIgnoreCase("A")) {
                cmb_acc_states.setSelectedIndex(0);
            } else {
                cmb_acc_states.setSelectedIndex(1);
            }

        } catch (Exception ex) {
            Logger.getLogger(Company_Account_Registration_Panel.class.getName()).log(Level.SEVERE, null, ex);
        }

        btn_acc_save.setText("Update");
    }

    private void updateCompanyAccount() {
        if(cmb_CAR_Bank.getSelectedIndex() != 0 && cmb_CAR_Branch.getSelectedIndex() != 0 && cmb_CAR_Acc_Type.getSelectedIndex() != 0){
        try {

            int accountId = accountController.searchAccount(dtmcomAccount.getValueAt(tbl_acc.getSelectedRow(), 2).toString()).getAccount_id();
            int bankId = bankController.searchBankByName(cmb_CAR_Bank.getSelectedItem().toString()).getBank_id();
            int branchId = branchController.searchBranch(cmb_CAR_Branch.getSelectedItem().toString(), bankId).getBranch_id();
            String accountNo = txt_acc_no.getText();
            int accTypeId = accountTypeController.searchAccountType(cmb_CAR_Acc_Type.getSelectedItem().toString()).getAccountType_id();
            String accountStatus = null;
            if (cmb_acc_states.getSelectedIndex() == 0) {
                accountStatus = "A";
            } else {
                accountStatus = "I";
            }
            String accountName = txt_acc_name.getText();

            M_Account account = new M_Account(accountId, bankId, branchId, accountNo, accTypeId, accountStatus, accountName);
            boolean updateAccount = accountController.updateAccount(account);
            if (updateAccount) {
                JOptionPane.showMessageDialog(this, "Account Details Updated Successfully..");
            } else {
                JOptionPane.showMessageDialog(this, "Account Detail Updating Failed..");
            }

        } catch (Exception ex) {
            Logger.getLogger(Company_Account_Registration_Panel.class.getName()).log(Level.SEVERE, null, ex);
        }
        }else{
            JOptionPane.showMessageDialog(this, "Please Check that the Bank , Branch & Account Type are Selected");
            cmb_CAR_Bank.requestFocus();
        }

        loadCompanyAccountTable();

    }

    private M_Account searchByTableAccountNo() {
        M_Account account = null;
        try {
            account = accountController.searchAccount(dtmcomAccount.getValueAt(tbl_acc.getSelectedRow(), 2).toString());
        } catch (Exception ex) {
            Logger.getLogger(Company_Account_Registration_Panel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return account;
    }

    private void clearFields() {
        cmb_CAR_Bank.setSelectedIndex(0);
        cmb_CAR_Branch.setSelectedIndex(0);
        txt_acc_no.setText("");
        txt_acc_name.setText("");
        cmb_CAR_Acc_Type.setSelectedIndex(0);
        cmb_acc_states.setSelectedIndex(0);

        btn_acc_save.setText("Save");
    }

}
