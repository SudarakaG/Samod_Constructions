/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.view;

import com.brotherssoft.samodconstructions.controller.R_PaymentModeController;
import com.brotherssoft.samodconstructions.controller.R_ProjectGradeController;
import com.brotherssoft.samodconstructions.controller.R_ProjectSpecialityController;
import com.brotherssoft.samodconstructions.controller.R_ProjectTypeController;
import com.brotherssoft.samodconstructions.custom.IDGenerator;
import com.brotherssoft.samodconstructions.custom.Validation;
import com.brotherssoft.samodconstructions.model.M_Project_Primary;
import com.brotherssoft.samodconstructions.model.R_PaymentMode;
import com.brotherssoft.samodconstructions.model.R_ProjectGrade;
import com.brotherssoft.samodconstructions.model.R_ProjectSpeciality;
import com.brotherssoft.samodconstructions.model.R_ProjectType;
import com.brotherssoft.samodconstructions.serverconnector.ServerConnector;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import javax.swing.table.DefaultTableModel;
import com.brotherssoft.samodconstructions.controller.M_Project_PrimaryController;
import java.awt.Color;

/**
 *
 * @author Akvasoft
 */
public class Project_Primary_Panel extends javax.swing.JPanel {

    R_ProjectTypeController projectTypeController;
    R_ProjectSpecialityController projectSpecialityController;
    R_ProjectGradeController projectGradeController;
    R_PaymentModeController paymentModeController;
    M_Project_PrimaryController primary_ProjectController;
    DefaultTableModel dtmPriProject;

    JSpinner.DateEditor de;
    SimpleDateFormat sdf;
    Date date;
    DecimalFormat decimalFormat;

    M_Project_Primary primary = null;
    public static int projectIdPub;

    /**
     * Creates new form Project_Primary_Panel
     */
    public Project_Primary_Panel() throws Exception {
        initComponents();
        txt_project_tender_open_date_1.setFormats("yyyy-MM-dd","yyyy/MM/dd");
        txt_project_states_active_date_1.setFormats("yyyy-MM-dd","yyyy/MM/dd");
        txt_project_states_inactive_date_1.setFormats("yyyy-MM-dd","yyyy/MM/dd");

        dtmPriProject = (DefaultTableModel) tblPrimaryProject.getModel();
        projectTypeController = ServerConnector.getServerConnetor().getProjectTypeController();
        projectSpecialityController = ServerConnector.getServerConnetor().getProjectSpecialityController();
        projectGradeController = ServerConnector.getServerConnetor().getProjectGradeController();
        paymentModeController = ServerConnector.getServerConnetor().getPaymentModeController();
        primary_ProjectController = ServerConnector.getServerConnetor().getPrimary_ProjectController();

        loadToCmbProjectType();
        loadToCmbProjectSpeciality();
        loadToCmbProjectGrade();
        loadToCmbPaymentMode();
        loadToPrimaryProjectTable();

        de = new JSpinner.DateEditor(txt_project_tender_open_time_1, "HH:mm a");
        txt_project_tender_open_time_1.setEditor(de);
        sdf = new SimpleDateFormat("dd/MM/yyyy");
        date = new Date();

        jScrollPane11.getVerticalScrollBar().setUnitIncrement(16);
        jScrollPane12.getVerticalScrollBar().setUnitIncrement(16);
//        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
//        symbols.setGroupingSeparator(' ');
        decimalFormat = new DecimalFormat("#,##0.00");
    }

    Project_Primary_Panel(int id) throws Exception {
        initComponents();
        txt_project_tender_open_date_1.setFormats("yyyy-MM-dd","yyyy/MM/dd");
        txt_project_states_active_date_1.setFormats("yyyy-MM-dd","yyyy/MM/dd");
        txt_project_states_inactive_date_1.setFormats("yyyy-MM-dd","yyyy/MM/dd");

        dtmPriProject = (DefaultTableModel) tblPrimaryProject.getModel();
        projectTypeController = ServerConnector.getServerConnetor().getProjectTypeController();
        projectSpecialityController = ServerConnector.getServerConnetor().getProjectSpecialityController();
        projectGradeController = ServerConnector.getServerConnetor().getProjectGradeController();
        paymentModeController = ServerConnector.getServerConnetor().getPaymentModeController();
        primary_ProjectController = ServerConnector.getServerConnetor().getPrimary_ProjectController();

        loadToCmbProjectType();
        loadToCmbProjectSpeciality();
        loadToCmbProjectGrade();
        loadToCmbPaymentMode();
        loadToPrimaryProjectTable();

        de = new JSpinner.DateEditor(txt_project_tender_open_time_1, "HH:mm a");
        txt_project_tender_open_time_1.setEditor(de);
        sdf = new SimpleDateFormat("dd/MM/yyyy");
        date = new Date();

//        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
//        symbols.setGroupingSeparator(' ');
        decimalFormat = new DecimalFormat("#,##0.00");

        primary = primary_ProjectController.searchPrimaryProject(id);
        loadFromPrimaryProjectTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Project_Primary_Info_Panel = new javax.swing.JPanel();
        user_panel_hedding2 = new javax.swing.JPanel();
        jLabel66 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jSeparator14 = new javax.swing.JSeparator();
        jScrollPane11 = new javax.swing.JScrollPane();
        txt_Input_Panel_Branch4 = new javax.swing.JPanel();
        jLabel98 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        txt_project_desc_1 = new javax.swing.JTextField();
        jLabel100 = new javax.swing.JLabel();
        txt_project_address1 = new javax.swing.JTextField();
        jLabel101 = new javax.swing.JLabel();
        txt_project_address2 = new javax.swing.JTextField();
        jLabel102 = new javax.swing.JLabel();
        txt_project_address3 = new javax.swing.JTextField();
        jLabel103 = new javax.swing.JLabel();
        txt_project_address4 = new javax.swing.JTextField();
        jLabel107 = new javax.swing.JLabel();
        txt_project_client_1 = new javax.swing.JTextField();
        jLabel109 = new javax.swing.JLabel();
        txt_project_client_address1 = new javax.swing.JTextField();
        jLabel110 = new javax.swing.JLabel();
        txt_project_client_address2 = new javax.swing.JTextField();
        jLabel111 = new javax.swing.JLabel();
        txt_project_client_address3 = new javax.swing.JTextField();
        jLabel112 = new javax.swing.JLabel();
        cmb_project_type_1 = new javax.swing.JComboBox<>();
        txt_project_states_active_date_1 = new org.jdesktop.swingx.JXDatePicker();
        btn_to_secondary_project = new javax.swing.JButton();
        btn_add_primary_project = new javax.swing.JButton();
        txt_project_name_1 = new javax.swing.JTextField();
        jLabel117 = new javax.swing.JLabel();
        cmb_project_vatAdded = new javax.swing.JComboBox<>();
        jLabel104 = new javax.swing.JLabel();
        txt_project_contract_bid_1 = new javax.swing.JTextField();
        jLabel118 = new javax.swing.JLabel();
        txt_project_client_address4 = new javax.swing.JTextField();
        jLabel119 = new javax.swing.JLabel();
        txt_project_client_contact_1 = new javax.swing.JTextField();
        jLabel120 = new javax.swing.JLabel();
        txt_project_client_contact_1_2 = new javax.swing.JTextField();
        jLabel121 = new javax.swing.JLabel();
        txt_project_intendedDuration_1 = new javax.swing.JTextField();
        jSeparator26 = new javax.swing.JSeparator();
        jSeparator27 = new javax.swing.JSeparator();
        jLabel122 = new javax.swing.JLabel();
        cmb_project_Specialiti = new javax.swing.JComboBox<>();
        jLabel123 = new javax.swing.JLabel();
        cmb_project_grade_1 = new javax.swing.JComboBox<>();
        jLabel124 = new javax.swing.JLabel();
        jLabel125 = new javax.swing.JLabel();
        jLabel126 = new javax.swing.JLabel();
        txt_project_engineer_estimate = new javax.swing.JTextField();
        txt_project_tender_fee_1 = new javax.swing.JTextField();
        jLabel127 = new javax.swing.JLabel();
        jLabel128 = new javax.swing.JLabel();
        cmb_project_bid_payment_mode = new javax.swing.JComboBox<>();
        jLabel130 = new javax.swing.JLabel();
        txt_project_bid_amount_1 = new javax.swing.JTextField();
        txt_project_bid_organization = new javax.swing.JTextField();
        jLabel131 = new javax.swing.JLabel();
        jSeparator28 = new javax.swing.JSeparator();
        jLabel132 = new javax.swing.JLabel();
        txt_project_bid_duration_1 = new javax.swing.JTextField();
        jLabel133 = new javax.swing.JLabel();
        jLabel134 = new javax.swing.JLabel();
        jLabel129 = new javax.swing.JLabel();
        cmb_project_made_of_states_1 = new javax.swing.JComboBox<>();
        jLabel135 = new javax.swing.JLabel();
        jLabel136 = new javax.swing.JLabel();
        txt_project_states_inactive_date_1 = new org.jdesktop.swingx.JXDatePicker();
        txt_project_tender_open_date_1 = new org.jdesktop.swingx.JXDatePicker();
        jLabel137 = new javax.swing.JLabel();
        Date date = new Date();
        SpinnerDateModel sdm = new SpinnerDateModel(date, null, null, Calendar.HOUR_OF_DAY);
        txt_project_tender_open_time_1 = new javax.swing.JSpinner(sdm);
        btn_new_primary_project = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_project_tender_result = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane12 = new javax.swing.JScrollPane();
        tblPrimaryProject = new javax.swing.JTable();
        txt_search_name_ = new javax.swing.JTextField();

        Project_Primary_Info_Panel.setBackground(new java.awt.Color(255, 255, 255));
        Project_Primary_Info_Panel.setPreferredSize(new java.awt.Dimension(1050, 710));

        user_panel_hedding2.setBackground(new java.awt.Color(0, 153, 153));

        jLabel66.setBackground(new java.awt.Color(255, 255, 255));
        jLabel66.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(255, 255, 255));
        jLabel66.setText("Administrations / System Management / Master Details /");

        jLabel69.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(255, 255, 255));
        jLabel69.setText("Project Registration");

        jSeparator14.setBackground(new java.awt.Color(204, 0, 51));
        jSeparator14.setOpaque(true);

        javax.swing.GroupLayout user_panel_hedding2Layout = new javax.swing.GroupLayout(user_panel_hedding2);
        user_panel_hedding2.setLayout(user_panel_hedding2Layout);
        user_panel_hedding2Layout.setHorizontalGroup(
            user_panel_hedding2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(user_panel_hedding2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(user_panel_hedding2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel69)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator14))
        );
        user_panel_hedding2Layout.setVerticalGroup(
            user_panel_hedding2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(user_panel_hedding2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(user_panel_hedding2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel69)
                    .addComponent(jSeparator14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jScrollPane11.setBorder(null);
        jScrollPane11.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane11.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        txt_Input_Panel_Branch4.setBackground(new java.awt.Color(255, 255, 255));
        txt_Input_Panel_Branch4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Project Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 14))); // NOI18N

        jLabel98.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel98.setText("Project Name");

        jLabel99.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel99.setText("Description");

        txt_project_desc_1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_project_desc_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_project_desc_1ActionPerformed(evt);
            }
        });

        jLabel100.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel100.setText("Address No");

        txt_project_address1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_project_address1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_project_address1ActionPerformed(evt);
            }
        });

        jLabel101.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel101.setText("Street");

        txt_project_address2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_project_address2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_project_address2ActionPerformed(evt);
            }
        });

        jLabel102.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel102.setText("City");

        txt_project_address3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_project_address3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_project_address3ActionPerformed(evt);
            }
        });

        jLabel103.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel103.setText("Country");

        txt_project_address4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_project_address4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_project_address4ActionPerformed(evt);
            }
        });

        jLabel107.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel107.setText("Client Name");

        txt_project_client_1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_project_client_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_project_client_1ActionPerformed(evt);
            }
        });

        jLabel109.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel109.setText("Address No");

        txt_project_client_address1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_project_client_address1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_project_client_address1ActionPerformed(evt);
            }
        });

        jLabel110.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel110.setText("Street");

        txt_project_client_address2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_project_client_address2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_project_client_address2ActionPerformed(evt);
            }
        });

        jLabel111.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel111.setText("City");

        txt_project_client_address3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_project_client_address3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_project_client_address3ActionPerformed(evt);
            }
        });

        jLabel112.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel112.setText("Project Type");

        cmb_project_type_1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmb_project_type_1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Select Project Type -" }));
        cmb_project_type_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_project_type_1ActionPerformed(evt);
            }
        });

        txt_project_states_active_date_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_project_states_active_date_1ActionPerformed(evt);
            }
        });

        btn_to_secondary_project.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_to_secondary_project.setText("To Secondary");
        btn_to_secondary_project.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_to_secondary_projectActionPerformed(evt);
            }
        });

        btn_add_primary_project.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_add_primary_project.setText("Save");
        btn_add_primary_project.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_add_primary_projectActionPerformed(evt);
            }
        });

        txt_project_name_1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_project_name_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_project_name_1ActionPerformed(evt);
            }
        });

        jLabel117.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel117.setText("Vat Added");

        cmb_project_vatAdded.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmb_project_vatAdded.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yes", "No" }));
        cmb_project_vatAdded.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_project_vatAddedActionPerformed(evt);
            }
        });

        jLabel104.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel104.setText("Contract / Bid No");

        txt_project_contract_bid_1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_project_contract_bid_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_project_contract_bid_1ActionPerformed(evt);
            }
        });

        jLabel118.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel118.setText("Country");

        txt_project_client_address4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_project_client_address4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_project_client_address4ActionPerformed(evt);
            }
        });

        jLabel119.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel119.setText("Contact No 1");

        txt_project_client_contact_1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_project_client_contact_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_project_client_contact_1ActionPerformed(evt);
            }
        });
        txt_project_client_contact_1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_project_client_contact_1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_project_client_contact_1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_project_client_contact_1KeyTyped(evt);
            }
        });

        jLabel120.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel120.setText("Contact No 2");

        txt_project_client_contact_1_2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_project_client_contact_1_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_project_client_contact_1_2ActionPerformed(evt);
            }
        });
        txt_project_client_contact_1_2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_project_client_contact_1_2KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_project_client_contact_1_2KeyTyped(evt);
            }
        });

        jLabel121.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel121.setText("Intended Project Duration(Months)");

        txt_project_intendedDuration_1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_project_intendedDuration_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_project_intendedDuration_1ActionPerformed(evt);
            }
        });
        txt_project_intendedDuration_1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_project_intendedDuration_1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_project_intendedDuration_1KeyReleased(evt);
            }
        });

        jLabel122.setBackground(new java.awt.Color(102, 102, 255));
        jLabel122.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel122.setForeground(new java.awt.Color(255, 255, 255));
        jLabel122.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel122.setText("ICTAD Qualifications");
        jLabel122.setOpaque(true);

        cmb_project_Specialiti.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmb_project_Specialiti.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Select ICTAD Speciality -" }));
        cmb_project_Specialiti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_project_SpecialitiActionPerformed(evt);
            }
        });

        jLabel123.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel123.setText("Specialiti");

        cmb_project_grade_1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmb_project_grade_1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Select ICTAD Grade -" }));
        cmb_project_grade_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_project_grade_1ActionPerformed(evt);
            }
        });

        jLabel124.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel124.setText("Grade");

        jLabel125.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel125.setText("Tender Fee");

        jLabel126.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel126.setText("Engineer Estimate");

        txt_project_engineer_estimate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_project_engineer_estimate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_project_engineer_estimateActionPerformed(evt);
            }
        });
        txt_project_engineer_estimate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_project_engineer_estimateKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_project_engineer_estimateKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_project_engineer_estimateKeyTyped(evt);
            }
        });

        txt_project_tender_fee_1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_project_tender_fee_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_project_tender_fee_1ActionPerformed(evt);
            }
        });
        txt_project_tender_fee_1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_project_tender_fee_1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_project_tender_fee_1KeyReleased(evt);
            }
        });

        jLabel127.setBackground(new java.awt.Color(102, 102, 255));
        jLabel127.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel127.setForeground(new java.awt.Color(255, 255, 255));
        jLabel127.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel127.setText("Bid Security");
        jLabel127.setOpaque(true);

        jLabel128.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel128.setText("Mode of Payment");

        cmb_project_bid_payment_mode.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmb_project_bid_payment_mode.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Select Payment Mode -" }));
        cmb_project_bid_payment_mode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_project_bid_payment_modeActionPerformed(evt);
            }
        });

        jLabel130.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel130.setText("Amount");

        txt_project_bid_amount_1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_project_bid_amount_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_project_bid_amount_1ActionPerformed(evt);
            }
        });
        txt_project_bid_amount_1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_project_bid_amount_1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_project_bid_amount_1KeyReleased(evt);
            }
        });

        txt_project_bid_organization.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_project_bid_organization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_project_bid_organizationActionPerformed(evt);
            }
        });

        jLabel131.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel131.setText("Organization");

        jLabel132.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel132.setText("Duration (months)");

        txt_project_bid_duration_1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_project_bid_duration_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_project_bid_duration_1ActionPerformed(evt);
            }
        });
        txt_project_bid_duration_1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_project_bid_duration_1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_project_bid_duration_1KeyReleased(evt);
            }
        });

        jLabel133.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel133.setText("Tender Open Date");

        jLabel134.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel134.setText("Tender Open Time");

        jLabel129.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel129.setText("Project States");

        cmb_project_made_of_states_1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmb_project_made_of_states_1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PENDING", "APPROVED", "ONGOING", "COMPLETED" }));
        cmb_project_made_of_states_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_project_made_of_states_1ActionPerformed(evt);
            }
        });

        jLabel135.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel135.setText("States Active Date");

        jLabel136.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel136.setText("States Inactive Date");

        txt_project_states_inactive_date_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_project_states_inactive_date_1ActionPerformed(evt);
            }
        });

        txt_project_tender_open_date_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_project_tender_open_date_1ActionPerformed(evt);
            }
        });

        jLabel137.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel137.setText("Tender Result");

        JSpinner.DateEditor de = new JSpinner.DateEditor(txt_project_tender_open_time_1, "HH:mm a");
        txt_project_tender_open_time_1.setEditor(de);
        txt_project_tender_open_time_1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_project_tender_open_time_1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                txt_project_tender_open_time_1StateChanged(evt);
            }
        });
        txt_project_tender_open_time_1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txt_project_tender_open_time_1PropertyChange(evt);
            }
        });

        btn_new_primary_project.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_new_primary_project.setText("New");
        btn_new_primary_project.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_new_primary_projectActionPerformed(evt);
            }
        });

        txt_project_tender_result.setColumns(20);
        txt_project_tender_result.setRows(5);
        jScrollPane1.setViewportView(txt_project_tender_result);

        javax.swing.GroupLayout txt_Input_Panel_Branch4Layout = new javax.swing.GroupLayout(txt_Input_Panel_Branch4);
        txt_Input_Panel_Branch4.setLayout(txt_Input_Panel_Branch4Layout);
        txt_Input_Panel_Branch4Layout.setHorizontalGroup(
            txt_Input_Panel_Branch4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txt_Input_Panel_Branch4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(txt_Input_Panel_Branch4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(txt_Input_Panel_Branch4Layout.createSequentialGroup()
                        .addComponent(jLabel121)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_project_intendedDuration_1))
                    .addGroup(txt_Input_Panel_Branch4Layout.createSequentialGroup()
                        .addGroup(txt_Input_Panel_Branch4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel99, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel98, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(txt_Input_Panel_Branch4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_project_name_1, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_project_address1, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_project_desc_1)
                            .addComponent(txt_project_address2, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, txt_Input_Panel_Branch4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_new_primary_project, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_add_primary_project, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_to_secondary_project))
                    .addGroup(txt_Input_Panel_Branch4Layout.createSequentialGroup()
                        .addGroup(txt_Input_Panel_Branch4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(txt_Input_Panel_Branch4Layout.createSequentialGroup()
                                .addComponent(jLabel137, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1))
                            .addGroup(txt_Input_Panel_Branch4Layout.createSequentialGroup()
                                .addComponent(jLabel134, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_project_tender_open_time_1))
                            .addGroup(txt_Input_Panel_Branch4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, txt_Input_Panel_Branch4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(txt_Input_Panel_Branch4Layout.createSequentialGroup()
                                        .addComponent(jLabel111, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_project_client_address3))
                                    .addGroup(txt_Input_Panel_Branch4Layout.createSequentialGroup()
                                        .addComponent(jLabel110, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_project_client_address2))
                                    .addGroup(txt_Input_Panel_Branch4Layout.createSequentialGroup()
                                        .addComponent(jLabel109, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_project_client_address1))
                                    .addGroup(txt_Input_Panel_Branch4Layout.createSequentialGroup()
                                        .addComponent(jLabel107, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_project_client_1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, txt_Input_Panel_Branch4Layout.createSequentialGroup()
                                    .addComponent(jLabel118, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txt_project_client_address4, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(txt_Input_Panel_Branch4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, txt_Input_Panel_Branch4Layout.createSequentialGroup()
                                    .addComponent(jLabel119, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txt_project_client_contact_1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, txt_Input_Panel_Branch4Layout.createSequentialGroup()
                                    .addComponent(jLabel120, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txt_project_client_contact_1_2, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(txt_Input_Panel_Branch4Layout.createSequentialGroup()
                                .addComponent(jLabel117, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmb_project_vatAdded, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(txt_Input_Panel_Branch4Layout.createSequentialGroup()
                                .addComponent(jLabel104, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_project_contract_bid_1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(txt_Input_Panel_Branch4Layout.createSequentialGroup()
                                .addComponent(jLabel102, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_project_address3, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator26, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator27, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel122, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(txt_Input_Panel_Branch4Layout.createSequentialGroup()
                                .addComponent(jLabel123, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmb_project_Specialiti, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(txt_Input_Panel_Branch4Layout.createSequentialGroup()
                                .addComponent(jLabel124, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmb_project_grade_1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator28, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel127, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(txt_Input_Panel_Branch4Layout.createSequentialGroup()
                                .addComponent(jLabel128, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmb_project_bid_payment_mode, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(txt_Input_Panel_Branch4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, txt_Input_Panel_Branch4Layout.createSequentialGroup()
                                    .addComponent(jLabel130, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txt_project_bid_amount_1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, txt_Input_Panel_Branch4Layout.createSequentialGroup()
                                    .addComponent(jLabel131, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txt_project_bid_organization, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(txt_Input_Panel_Branch4Layout.createSequentialGroup()
                                .addComponent(jLabel132, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_project_bid_duration_1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(txt_Input_Panel_Branch4Layout.createSequentialGroup()
                                .addComponent(jLabel133, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_project_tender_open_date_1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(txt_Input_Panel_Branch4Layout.createSequentialGroup()
                                .addComponent(jLabel129, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmb_project_made_of_states_1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(txt_Input_Panel_Branch4Layout.createSequentialGroup()
                                .addComponent(jLabel135, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_project_states_active_date_1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(txt_Input_Panel_Branch4Layout.createSequentialGroup()
                                .addComponent(jLabel136, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_project_states_inactive_date_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(txt_Input_Panel_Branch4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, txt_Input_Panel_Branch4Layout.createSequentialGroup()
                                    .addComponent(jLabel126, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txt_project_engineer_estimate, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, txt_Input_Panel_Branch4Layout.createSequentialGroup()
                                    .addComponent(jLabel125, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txt_project_tender_fee_1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel101, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel100, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(txt_Input_Panel_Branch4Layout.createSequentialGroup()
                                .addComponent(jLabel103, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_project_address4, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(txt_Input_Panel_Branch4Layout.createSequentialGroup()
                                .addComponent(jLabel112, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmb_project_type_1, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        txt_Input_Panel_Branch4Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cmb_project_Specialiti, cmb_project_bid_payment_mode, cmb_project_grade_1, cmb_project_made_of_states_1, cmb_project_type_1, cmb_project_vatAdded, txt_project_address4, txt_project_bid_amount_1, txt_project_bid_duration_1, txt_project_bid_organization, txt_project_client_1, txt_project_client_address1, txt_project_client_address2, txt_project_client_address3, txt_project_client_address4, txt_project_client_contact_1, txt_project_client_contact_1_2, txt_project_contract_bid_1, txt_project_engineer_estimate, txt_project_states_active_date_1, txt_project_tender_fee_1, txt_project_tender_open_date_1});

        txt_Input_Panel_Branch4Layout.setVerticalGroup(
            txt_Input_Panel_Branch4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txt_Input_Panel_Branch4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(txt_Input_Panel_Branch4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel98, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_project_name_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(txt_Input_Panel_Branch4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel99, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_project_desc_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(txt_Input_Panel_Branch4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel100, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_project_address1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(txt_Input_Panel_Branch4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_project_address2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel101, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(txt_Input_Panel_Branch4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel102, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_project_address3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(txt_Input_Panel_Branch4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel103, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_project_address4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(txt_Input_Panel_Branch4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel112, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_project_type_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(txt_Input_Panel_Branch4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel117, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmb_project_vatAdded, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(txt_Input_Panel_Branch4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel104, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_project_contract_bid_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator26, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(txt_Input_Panel_Branch4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel107, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_project_client_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(txt_Input_Panel_Branch4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel109, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_project_client_address1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(txt_Input_Panel_Branch4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel110, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_project_client_address2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(txt_Input_Panel_Branch4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel111, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_project_client_address3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(txt_Input_Panel_Branch4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel118, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_project_client_address4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(txt_Input_Panel_Branch4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel119, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_project_client_contact_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(txt_Input_Panel_Branch4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel120, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_project_client_contact_1_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(txt_Input_Panel_Branch4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel121, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_project_intendedDuration_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator27, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel122, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(txt_Input_Panel_Branch4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel123, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmb_project_Specialiti, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(txt_Input_Panel_Branch4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel124, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmb_project_grade_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(txt_Input_Panel_Branch4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel126, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_project_engineer_estimate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(txt_Input_Panel_Branch4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel125, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_project_tender_fee_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator28, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel127, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(txt_Input_Panel_Branch4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel128, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmb_project_bid_payment_mode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(txt_Input_Panel_Branch4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel130, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_project_bid_amount_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(txt_Input_Panel_Branch4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel131, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_project_bid_organization, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(txt_Input_Panel_Branch4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel132, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_project_bid_duration_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(txt_Input_Panel_Branch4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(txt_Input_Panel_Branch4Layout.createSequentialGroup()
                        .addComponent(jLabel133, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(txt_Input_Panel_Branch4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel134, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_project_tender_open_time_1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(txt_Input_Panel_Branch4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel129, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmb_project_made_of_states_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(txt_Input_Panel_Branch4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel135, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_project_states_active_date_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(txt_Input_Panel_Branch4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel136, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_project_states_inactive_date_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txt_project_tender_open_date_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(txt_Input_Panel_Branch4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel137, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(txt_Input_Panel_Branch4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(txt_Input_Panel_Branch4Layout.createSequentialGroup()
                        .addComponent(btn_add_primary_project)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(txt_Input_Panel_Branch4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_to_secondary_project, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_new_primary_project, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        txt_Input_Panel_Branch4Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cmb_project_Specialiti, cmb_project_bid_payment_mode, cmb_project_grade_1, cmb_project_made_of_states_1, cmb_project_type_1, cmb_project_vatAdded, txt_project_address4, txt_project_bid_amount_1, txt_project_bid_duration_1, txt_project_bid_organization, txt_project_client_1, txt_project_client_address1, txt_project_client_address2, txt_project_client_address3, txt_project_client_address4, txt_project_client_contact_1, txt_project_client_contact_1_2, txt_project_contract_bid_1, txt_project_engineer_estimate, txt_project_states_active_date_1, txt_project_states_inactive_date_1, txt_project_tender_fee_1, txt_project_tender_open_date_1});

        jScrollPane11.setViewportView(txt_Input_Panel_Branch4);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Current Primary Projects", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        jScrollPane12.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        tblPrimaryProject.setModel(new javax.swing.table.DefaultTableModel(
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
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Project Name"
            }
        ));
        tblPrimaryProject.setGridColor(new java.awt.Color(255, 255, 255));
        tblPrimaryProject.setOpaque(false);
        tblPrimaryProject.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPrimaryProjectMouseClicked(evt);
            }
        });
        jScrollPane12.setViewportView(tblPrimaryProject);

        txt_search_name_.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txt_search_name_.setForeground(new java.awt.Color(102, 102, 102));
        txt_search_name_.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_search_name_.setText("Search Project");
        txt_search_name_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_search_name_MouseClicked(evt);
            }
        });
        txt_search_name_.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_search_name_KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txt_search_name_, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane12, javax.swing.GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_search_name_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout Project_Primary_Info_PanelLayout = new javax.swing.GroupLayout(Project_Primary_Info_Panel);
        Project_Primary_Info_Panel.setLayout(Project_Primary_Info_PanelLayout);
        Project_Primary_Info_PanelLayout.setHorizontalGroup(
            Project_Primary_Info_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Project_Primary_Info_PanelLayout.createSequentialGroup()
                .addGroup(Project_Primary_Info_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(user_panel_hedding2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Project_Primary_Info_PanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0))
        );
        Project_Primary_Info_PanelLayout.setVerticalGroup(
            Project_Primary_Info_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Project_Primary_Info_PanelLayout.createSequentialGroup()
                .addComponent(user_panel_hedding2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Project_Primary_Info_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 601, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Project_Primary_Info_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, 1052, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Project_Primary_Info_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, 735, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_add_primary_projectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_add_primary_projectActionPerformed
        if (btn_add_primary_project.getText().equalsIgnoreCase("Save")) {
            savePrimaryProject();
        } else {
            updatePrimaryProject();
        }
    }//GEN-LAST:event_btn_add_primary_projectActionPerformed

    private void tblPrimaryProjectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPrimaryProjectMouseClicked
        searchProjectPrimaryByTableName();
        loadFromPrimaryProjectTable();
        txt_search_name_.setText("Search Project");
        txt_search_name_.setForeground(Color.GRAY);
    }//GEN-LAST:event_tblPrimaryProjectMouseClicked

    private void btn_new_primary_projectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_new_primary_projectActionPerformed
        clearFields();
        try {
            primary_ProjectController.releaseProject(primary.getProject_id());
        } catch (Exception ex) {
            Logger.getLogger(Project_Primary_Panel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_new_primary_projectActionPerformed

    private void txt_project_name_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_project_name_1ActionPerformed
        txt_project_desc_1.requestFocus();
    }//GEN-LAST:event_txt_project_name_1ActionPerformed

    private void txt_project_desc_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_project_desc_1ActionPerformed
        txt_project_address1.requestFocus();
    }//GEN-LAST:event_txt_project_desc_1ActionPerformed

    private void txt_project_address1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_project_address1ActionPerformed
        txt_project_address2.requestFocus();
    }//GEN-LAST:event_txt_project_address1ActionPerformed

    private void txt_project_address2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_project_address2ActionPerformed
        txt_project_address3.requestFocus();
    }//GEN-LAST:event_txt_project_address2ActionPerformed

    private void txt_project_address3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_project_address3ActionPerformed
        txt_project_address4.requestFocus();
    }//GEN-LAST:event_txt_project_address3ActionPerformed

    private void txt_project_address4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_project_address4ActionPerformed
        cmb_project_type_1.requestFocus();
    }//GEN-LAST:event_txt_project_address4ActionPerformed

    private void cmb_project_type_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_project_type_1ActionPerformed
        cmb_project_vatAdded.requestFocus();
    }//GEN-LAST:event_cmb_project_type_1ActionPerformed

    private void cmb_project_vatAddedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_project_vatAddedActionPerformed
        txt_project_contract_bid_1.requestFocus();
    }//GEN-LAST:event_cmb_project_vatAddedActionPerformed

    private void txt_project_contract_bid_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_project_contract_bid_1ActionPerformed
        txt_project_client_1.requestFocus();
    }//GEN-LAST:event_txt_project_contract_bid_1ActionPerformed

    private void txt_project_client_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_project_client_1ActionPerformed
        txt_project_client_address1.requestFocus();
    }//GEN-LAST:event_txt_project_client_1ActionPerformed

    private void txt_project_client_address1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_project_client_address1ActionPerformed
        txt_project_client_address2.requestFocus();
    }//GEN-LAST:event_txt_project_client_address1ActionPerformed

    private void txt_project_client_address2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_project_client_address2ActionPerformed
        txt_project_client_address3.requestFocus();
    }//GEN-LAST:event_txt_project_client_address2ActionPerformed

    private void txt_project_client_address3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_project_client_address3ActionPerformed
        txt_project_client_address4.requestFocus();
    }//GEN-LAST:event_txt_project_client_address3ActionPerformed

    private void txt_project_client_address4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_project_client_address4ActionPerformed
        txt_project_client_contact_1.requestFocus();
    }//GEN-LAST:event_txt_project_client_address4ActionPerformed

    private void txt_project_client_contact_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_project_client_contact_1ActionPerformed
        txt_project_client_contact_1_2.requestFocus();
    }//GEN-LAST:event_txt_project_client_contact_1ActionPerformed

    private void txt_project_client_contact_1_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_project_client_contact_1_2ActionPerformed
        txt_project_intendedDuration_1.requestFocus();
    }//GEN-LAST:event_txt_project_client_contact_1_2ActionPerformed

    private void txt_project_intendedDuration_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_project_intendedDuration_1ActionPerformed
        cmb_project_Specialiti.requestFocus();
    }//GEN-LAST:event_txt_project_intendedDuration_1ActionPerformed

    private void cmb_project_SpecialitiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_project_SpecialitiActionPerformed
        cmb_project_grade_1.requestFocus();
    }//GEN-LAST:event_cmb_project_SpecialitiActionPerformed

    private void cmb_project_grade_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_project_grade_1ActionPerformed
        txt_project_engineer_estimate.requestFocus();
    }//GEN-LAST:event_cmb_project_grade_1ActionPerformed

    private void txt_project_engineer_estimateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_project_engineer_estimateActionPerformed
        txt_project_tender_fee_1.requestFocus();
    }//GEN-LAST:event_txt_project_engineer_estimateActionPerformed

    private void txt_project_tender_fee_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_project_tender_fee_1ActionPerformed
        cmb_project_bid_payment_mode.requestFocus();
    }//GEN-LAST:event_txt_project_tender_fee_1ActionPerformed

    private void cmb_project_bid_payment_modeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_project_bid_payment_modeActionPerformed
        txt_project_bid_amount_1.requestFocus();
    }//GEN-LAST:event_cmb_project_bid_payment_modeActionPerformed

    private void txt_project_bid_amount_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_project_bid_amount_1ActionPerformed
        txt_project_bid_organization.requestFocus();
    }//GEN-LAST:event_txt_project_bid_amount_1ActionPerformed

    private void txt_project_bid_organizationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_project_bid_organizationActionPerformed
        txt_project_bid_duration_1.requestFocus();
    }//GEN-LAST:event_txt_project_bid_organizationActionPerformed

    private void txt_project_bid_duration_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_project_bid_duration_1ActionPerformed
        txt_project_tender_open_date_1.requestFocus();
    }//GEN-LAST:event_txt_project_bid_duration_1ActionPerformed

    private void txt_project_tender_open_date_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_project_tender_open_date_1ActionPerformed
        txt_project_tender_open_time_1.requestFocus();
    }//GEN-LAST:event_txt_project_tender_open_date_1ActionPerformed

    private void txt_project_tender_open_time_1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_txt_project_tender_open_time_1StateChanged
        //cmb_project_made_of_states_1.requestFocus();
    }//GEN-LAST:event_txt_project_tender_open_time_1StateChanged

    private void cmb_project_made_of_states_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_project_made_of_states_1ActionPerformed
        txt_project_states_active_date_1.requestFocus();
    }//GEN-LAST:event_cmb_project_made_of_states_1ActionPerformed

    private void txt_project_states_active_date_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_project_states_active_date_1ActionPerformed
        txt_project_states_inactive_date_1.requestFocus();
    }//GEN-LAST:event_txt_project_states_active_date_1ActionPerformed

    private void txt_project_states_inactive_date_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_project_states_inactive_date_1ActionPerformed
        txt_project_tender_result.requestFocus();
    }//GEN-LAST:event_txt_project_states_inactive_date_1ActionPerformed

    private void txt_project_tender_open_time_1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txt_project_tender_open_time_1PropertyChange
        //cmb_project_made_of_states_1.requestFocus();
    }//GEN-LAST:event_txt_project_tender_open_time_1PropertyChange

    private void txt_project_client_contact_1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_project_client_contact_1KeyPressed
        //Validation.phoneNumber(txt_project_client_contact_1, evt);
    }//GEN-LAST:event_txt_project_client_contact_1KeyPressed

    private void txt_project_client_contact_1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_project_client_contact_1KeyTyped
        Validation.phoneNumber(txt_project_client_contact_1, evt);
    }//GEN-LAST:event_txt_project_client_contact_1KeyTyped

    private void txt_project_client_contact_1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_project_client_contact_1KeyReleased
        Validation.phoneNumber(txt_project_client_contact_1, evt);
    }//GEN-LAST:event_txt_project_client_contact_1KeyReleased

    private void txt_project_client_contact_1_2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_project_client_contact_1_2KeyReleased
        Validation.phoneNumber(txt_project_client_contact_1_2, evt);
    }//GEN-LAST:event_txt_project_client_contact_1_2KeyReleased

    private void txt_project_client_contact_1_2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_project_client_contact_1_2KeyTyped
        Validation.phoneNumber(txt_project_client_contact_1_2, evt);
    }//GEN-LAST:event_txt_project_client_contact_1_2KeyTyped

    private void txt_project_intendedDuration_1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_project_intendedDuration_1KeyPressed
        Validation.priceText(txt_project_intendedDuration_1);
    }//GEN-LAST:event_txt_project_intendedDuration_1KeyPressed

    private void txt_project_intendedDuration_1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_project_intendedDuration_1KeyReleased
        Validation.priceText(txt_project_intendedDuration_1);
    }//GEN-LAST:event_txt_project_intendedDuration_1KeyReleased

    private void txt_project_engineer_estimateKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_project_engineer_estimateKeyPressed
        Validation.priceText(txt_project_engineer_estimate);
    }//GEN-LAST:event_txt_project_engineer_estimateKeyPressed

    private void txt_project_engineer_estimateKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_project_engineer_estimateKeyReleased
        Validation.priceText(txt_project_engineer_estimate);
    }//GEN-LAST:event_txt_project_engineer_estimateKeyReleased

    private void txt_project_tender_fee_1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_project_tender_fee_1KeyPressed
        Validation.priceText(txt_project_tender_fee_1);
    }//GEN-LAST:event_txt_project_tender_fee_1KeyPressed

    private void txt_project_tender_fee_1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_project_tender_fee_1KeyReleased
        Validation.priceText(txt_project_tender_fee_1);
    }//GEN-LAST:event_txt_project_tender_fee_1KeyReleased

    private void txt_project_bid_amount_1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_project_bid_amount_1KeyPressed
        Validation.priceText(txt_project_bid_amount_1);
    }//GEN-LAST:event_txt_project_bid_amount_1KeyPressed

    private void txt_project_bid_amount_1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_project_bid_amount_1KeyReleased
        Validation.priceText(txt_project_bid_amount_1);
    }//GEN-LAST:event_txt_project_bid_amount_1KeyReleased

    private void txt_project_bid_duration_1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_project_bid_duration_1KeyPressed
        Validation.priceText(txt_project_bid_duration_1);
    }//GEN-LAST:event_txt_project_bid_duration_1KeyPressed

    private void txt_project_bid_duration_1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_project_bid_duration_1KeyReleased
        Validation.priceText(txt_project_bid_duration_1);
    }//GEN-LAST:event_txt_project_bid_duration_1KeyReleased

    private void txt_project_engineer_estimateKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_project_engineer_estimateKeyTyped

    }//GEN-LAST:event_txt_project_engineer_estimateKeyTyped

    private void btn_to_secondary_projectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_to_secondary_projectActionPerformed
        Project_Secondery_Panel secondery_Panel = null;
        if (primary != null) {
            try {
                secondery_Panel = new Project_Secondery_Panel(primary.getProject_id());
            } catch (Exception ex) {
                Logger.getLogger(Project_Primary_Panel.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            try {
                secondery_Panel = new Project_Secondery_Panel();
            } catch (Exception ex) {
                Logger.getLogger(Project_Primary_Panel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        GUI_Home.load_panel.removeAll();
        GUI_Home.load_panel.repaint();
        GUI_Home.load_panel.revalidate();
        secondery_Panel.setSize(GUI_Home.load_panel.getSize());
        GUI_Home.load_panel.add(secondery_Panel);
        secondery_Panel.setVisible(true);
    }//GEN-LAST:event_btn_to_secondary_projectActionPerformed

    private void txt_search_name_KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_search_name_KeyReleased
        try {
            dtmPriProject.setRowCount(0);
            List<M_Project_Primary> allPrimaryProjects = primary_ProjectController.getAllPrimaryProjectsByLetter(txt_search_name_.getText());
            for (M_Project_Primary allPrimaryProject : allPrimaryProjects) {
                String[] rowData = {allPrimaryProject.getProject_primary_name()};
                dtmPriProject.addRow(rowData);
            }
        } catch (Exception ex) {
            Logger.getLogger(Project_Primary_Panel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txt_search_name_KeyReleased

    private void txt_search_name_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_search_name_MouseClicked
        txt_search_name_.setText("");
        txt_search_name_.setForeground(Color.BLACK);
    }//GEN-LAST:event_txt_search_name_MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Project_Primary_Info_Panel;
    private javax.swing.JButton btn_add_primary_project;
    private javax.swing.JButton btn_new_primary_project;
    private javax.swing.JButton btn_to_secondary_project;
    private javax.swing.JComboBox<String> cmb_project_Specialiti;
    private javax.swing.JComboBox<String> cmb_project_bid_payment_mode;
    private javax.swing.JComboBox<String> cmb_project_grade_1;
    private javax.swing.JComboBox<String> cmb_project_made_of_states_1;
    private javax.swing.JComboBox<String> cmb_project_type_1;
    private javax.swing.JComboBox<String> cmb_project_vatAdded;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel129;
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel132;
    private javax.swing.JLabel jLabel133;
    private javax.swing.JLabel jLabel134;
    private javax.swing.JLabel jLabel135;
    private javax.swing.JLabel jLabel136;
    private javax.swing.JLabel jLabel137;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator26;
    private javax.swing.JSeparator jSeparator27;
    private javax.swing.JSeparator jSeparator28;
    private javax.swing.JTable tblPrimaryProject;
    private javax.swing.JPanel txt_Input_Panel_Branch4;
    private javax.swing.JTextField txt_project_address1;
    private javax.swing.JTextField txt_project_address2;
    private javax.swing.JTextField txt_project_address3;
    private javax.swing.JTextField txt_project_address4;
    private javax.swing.JTextField txt_project_bid_amount_1;
    private javax.swing.JTextField txt_project_bid_duration_1;
    private javax.swing.JTextField txt_project_bid_organization;
    private javax.swing.JTextField txt_project_client_1;
    private javax.swing.JTextField txt_project_client_address1;
    private javax.swing.JTextField txt_project_client_address2;
    private javax.swing.JTextField txt_project_client_address3;
    private javax.swing.JTextField txt_project_client_address4;
    private javax.swing.JTextField txt_project_client_contact_1;
    private javax.swing.JTextField txt_project_client_contact_1_2;
    private javax.swing.JTextField txt_project_contract_bid_1;
    private javax.swing.JTextField txt_project_desc_1;
    private javax.swing.JTextField txt_project_engineer_estimate;
    private javax.swing.JTextField txt_project_intendedDuration_1;
    private javax.swing.JTextField txt_project_name_1;
    private org.jdesktop.swingx.JXDatePicker txt_project_states_active_date_1;
    private org.jdesktop.swingx.JXDatePicker txt_project_states_inactive_date_1;
    private javax.swing.JTextField txt_project_tender_fee_1;
    private org.jdesktop.swingx.JXDatePicker txt_project_tender_open_date_1;
    private javax.swing.JSpinner txt_project_tender_open_time_1;
    private javax.swing.JTextArea txt_project_tender_result;
    private javax.swing.JTextField txt_search_name_;
    private javax.swing.JPanel user_panel_hedding2;
    // End of variables declaration//GEN-END:variables

    private void loadToCmbProjectType() {

        try {
            List<R_ProjectType> allProjectTypes = projectTypeController.getAllProjectTypes();
            cmb_project_type_1.removeAll();
            for (R_ProjectType allProjectType : allProjectTypes) {
                cmb_project_type_1.addItem(allProjectType.getProjectType_name());
            }
        } catch (Exception ex) {
            Logger.getLogger(Project_Primary_Panel.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void loadToCmbProjectSpeciality() {
        try {
            List<R_ProjectSpeciality> allProjectSpecialities = projectSpecialityController.getAllProjectSpecialities();
            cmb_project_Specialiti.removeAll();
            for (R_ProjectSpeciality allProjectSpeciality : allProjectSpecialities) {
                cmb_project_Specialiti.addItem(allProjectSpeciality.getProjectSpeciality_name());
            }
        } catch (Exception ex) {
            Logger.getLogger(Project_Primary_Panel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void loadToCmbProjectGrade() {
        try {
            List<R_ProjectGrade> allProjectGrades = projectGradeController.getAllProjectGrades();
            cmb_project_grade_1.removeAll();
            for (R_ProjectGrade allProjectGrade : allProjectGrades) {
                cmb_project_grade_1.addItem(allProjectGrade.getProjectGrade_name());
            }
        } catch (Exception ex) {
            Logger.getLogger(Project_Primary_Panel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void loadToCmbPaymentMode() {
        try {
            List<R_PaymentMode> allPaymentModes = paymentModeController.getAllPaymentModes();
            cmb_project_bid_payment_mode.removeAll();
            for (R_PaymentMode allPaymentMode : allPaymentModes) {
                cmb_project_bid_payment_mode.addItem(allPaymentMode.getPaymentMode_name());
            }
        } catch (Exception ex) {
            Logger.getLogger(Project_Primary_Panel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void savePrimaryProject() {
        if (cmb_project_type_1.getSelectedIndex() != 0 && cmb_project_Specialiti.getSelectedIndex() != 0 && cmb_project_grade_1.getSelectedIndex() != 0 && cmb_project_bid_payment_mode.getSelectedIndex() != 0) {
            try {

//            Date date = new Date();
//            SpinnerDateModel sdm = new SpinnerDateModel(date, null, null, Calendar.HOUR_OF_DAY);
//            txt_project_tender_open_time_1 = new JSpinner(sdm);
//            JSpinner.DateEditor de = new JSpinner.DateEditor(txt_project_tender_open_time_1, "HH:mm a");
//            txt_project_tender_open_time_1.setEditor(de);
//            String format = de.getFormat().format(txt_project_tender_open_time_1.getValue());
//            SimpleDateFormat sdf = new SimpleDateFormat("HHmm");
//            Date parse = sdf.parse(format);
                String projectAType = cmb_project_type_1.getSelectedItem().toString();
                String projectASpeciality = cmb_project_Specialiti.getSelectedItem().toString();
                String projectAGrade = cmb_project_grade_1.getSelectedItem().toString();
                String payMode = cmb_project_bid_payment_mode.getSelectedItem().toString();

                int projectId = IDGenerator.getNewID("m_project", "PROJECT_ID");
                String name = txt_project_name_1.getText();
                String desc = txt_project_desc_1.getText();
                String address1 = txt_project_address1.getText();
                String address2 = txt_project_address2.getText();
                String address3 = txt_project_address3.getText();
                String address4 = txt_project_address4.getText();
                int projctTypeId = projectTypeController.searProjectTypeByName(projectAType).getProjectType_id();
                String vatAdded = Integer.toString(cmb_project_vatAdded.getSelectedIndex());
                String contractNo = txt_project_contract_bid_1.getText();
                String clientName = txt_project_client_1.getText();
                String clientAddress1 = txt_project_client_address1.getText();
                String clientAddress2 = txt_project_client_address2.getText();
                String clientAddress3 = txt_project_client_address3.getText();
                String clientAddress4 = txt_project_client_address4.getText();
                String clientContact1 = txt_project_client_contact_1.getText();
                String clientContact2 = txt_project_client_contact_1_2.getText();
                String projectADuration = txt_project_intendedDuration_1.getText();
                int specialityId = projectSpecialityController.searProjectSpecialityByName(projectASpeciality).getProjectSpeciality_id();
                int gradeId = projectGradeController.searProjectGradeByNAme(projectAGrade).getProjectGrade_id();
                double enginnerEstimate = 0;
                if(!"".equals(txt_project_engineer_estimate.getText())){
                 enginnerEstimate = Double.parseDouble(txt_project_engineer_estimate.getText().replaceAll(",", ""));
                }
                double tenderFee = 0;
                if(!"".equals(txt_project_tender_fee_1.getText())){
                 tenderFee = Double.parseDouble(txt_project_tender_fee_1.getText().replaceAll(",", ""));
                }
                int bidPaymentModeId = paymentModeController.searPaymentMode(payMode).getPaymentMode_id();
                double bidAmount = 0;
                if(!"".equals(txt_project_bid_amount_1.getText())){
                 bidAmount = Double.parseDouble(txt_project_bid_amount_1.getText().replaceAll(",", ""));
                }
                String bidDuration = txt_project_bid_duration_1.getText();
                String bidOrganization = txt_project_bid_organization.getText();
                Date tenderOpenDate = txt_project_tender_open_date_1.getDate();
                String tenderOpenTime = de.getFormat().format(txt_project_tender_open_time_1.getValue());
                String currentStatus = Integer.toString(cmb_project_made_of_states_1.getSelectedIndex());
                String tenderResult = txt_project_tender_result.getText();
                Date activeDate = txt_project_states_active_date_1.getDate();
                Date inactiveDate = txt_project_states_inactive_date_1.getDate();

                M_Project_Primary project_Primary = new M_Project_Primary(projectId, name, desc, address1, address2, address3, address4, projctTypeId, vatAdded, contractNo, clientName, clientAddress1, clientAddress2, clientAddress3, clientAddress4, clientContact1, clientContact2, projectADuration, specialityId, gradeId, enginnerEstimate, tenderFee, bidPaymentModeId, bidAmount, bidDuration, bidOrganization, tenderOpenDate, tenderOpenTime, tenderResult, activeDate, inactiveDate, currentStatus);
                boolean addPrimaryProject = primary_ProjectController.addPrimaryProject(project_Primary);
                if (addPrimaryProject) {
                    JOptionPane.showMessageDialog(this, "Primary Project Added Successfully..");
                    primary = project_Primary;
                } else {
                    JOptionPane.showMessageDialog(this, "Primary Priject Cannot Add..");
                }

            } catch (Exception ex) {
                Logger.getLogger(Project_Primary_Panel.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please Check that Project Type , ICTAD Speciality , ICTAD Grade & BID Security Payemnt Mode are Selected");
        }

        loadToPrimaryProjectTable();
    }

//    Date date = new Date();
//        SpinnerDateModel sdm = new SpinnerDateModel(date, null, null, Calendar.HOUR_OF_DAY);
//        
//        JSpinner.DateEditor de = new JSpinner.DateEditor(txt_project_tender_open_time_1, "HH:mm");
//        txt_project_tender_open_time_1.setEditor(de);
    private void loadToPrimaryProjectTable() {
        try {
            dtmPriProject.setRowCount(0);
            List<M_Project_Primary> allPrimaryProjects = primary_ProjectController.getAllPrimaryProjects();
            for (M_Project_Primary allPrimaryProject : allPrimaryProjects) {
                String[] rowData = {allPrimaryProject.getProject_primary_name()};
                dtmPriProject.addRow(rowData);
            }
        } catch (Exception ex) {
            Logger.getLogger(Project_Primary_Panel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void loadFromPrimaryProjectTable() {
        clearFields();
        try {
            if(primary_ProjectController.reserveProject(primary.getProject_id())){
            txt_project_name_1.setText(primary.getProject_primary_name());
            txt_project_desc_1.setText(primary.getProject_primary_description());
            txt_project_address1.setText(primary.getProject_primary_address1());
            txt_project_address2.setText(primary.getProject_primary_address2());
            txt_project_address3.setText(primary.getProject_primary_address3());
            txt_project_address4.setText(primary.getProject_primary_address4());
            cmb_project_type_1.setSelectedItem(projectTypeController.searchProjectType(primary.getProject_primary_type()).getProjectType_name());
            cmb_project_vatAdded.setSelectedIndex(Integer.parseInt(primary.getProject_primary_vatAdded()));
            txt_project_contract_bid_1.setText(primary.getProject_primary_contractBidNo());
            txt_project_client_1.setText(primary.getProject_primary_clientName());
            txt_project_client_address1.setText(primary.getProject_primary_clientAddress1());
            txt_project_client_address2.setText(primary.getProject_primary_clientAddress2());
            txt_project_client_address3.setText(primary.getProject_primary_clientAddress3());
            txt_project_client_address4.setText(primary.getProject_primary_clientAddress4());
            txt_project_client_contact_1.setText(primary.getProject_primary_clientContact1());
            txt_project_client_contact_1_2.setText(primary.getProject_primary_clientContact2());
            if(!"".equals(primary.getProject_primary_intendedDuration())){
            txt_project_intendedDuration_1.setText(decimalFormat.format(Double.parseDouble(primary.getProject_primary_intendedDuration())));
            }
            cmb_project_Specialiti.setSelectedItem(projectSpecialityController.searchProjectSpeciality(primary.getProject_primary_ictadSpeciality_id()).getProjectSpeciality_name());
            cmb_project_grade_1.setSelectedItem(projectGradeController.searchProjectGrade(primary.getProject_primary_ictadGrade_id()).getProjectGrade_name());
            txt_project_engineer_estimate.setText(decimalFormat.format(primary.getProject_primary_engineerEstimate()));
            txt_project_tender_fee_1.setText(decimalFormat.format(primary.getProject_primary_tenderFee()));
            cmb_project_bid_payment_mode.setSelectedItem(paymentModeController.searchPaymentMode(primary.getProject_primary_bidPaymentMode()).getPaymentMode_name());
            txt_project_bid_amount_1.setText(decimalFormat.format(primary.getProject_primary_bidAmount()));
            txt_project_bid_organization.setText(primary.getProject_primary_bidOrganization());
            if(!"".equals(primary.getProject_primary_bidDuration())){
            txt_project_bid_duration_1.setText(decimalFormat.format(Double.parseDouble(primary.getProject_primary_bidDuration())));
            }
            txt_project_tender_open_date_1.setDate(primary.getProject_primary_tenderOpenDate());
            txt_project_tender_open_time_1.setValue(de.getFormat().parse(primary.getProject_primary_tenderOpenTime()));
            cmb_project_made_of_states_1.setSelectedIndex(Integer.parseInt(primary.getProject_current_status()));
            txt_project_states_active_date_1.setDate(primary.getProject_primary_statusActiveDate());
            txt_project_states_inactive_date_1.setDate(primary.getProject_primary_statusInactiveDate());
            txt_project_tender_result.setText(primary.getProject_primary_tenderResult());
            }else{
                JOptionPane.showMessageDialog(this, "This Project is Using by Another Machine.. \n Try Again in a Moment..");
                return;
            }
        } catch (Exception ex) {
            Logger.getLogger(Project_Primary_Panel.class.getName()).log(Level.SEVERE, null, ex);
        }

        btn_add_primary_project.setText("Update");

    }

    private void updatePrimaryProject() {
        if (cmb_project_type_1.getSelectedIndex() != 0 && cmb_project_Specialiti.getSelectedIndex() != 0 && cmb_project_grade_1.getSelectedIndex() != 0 && cmb_project_bid_payment_mode.getSelectedIndex() != 0) {
            try {
                String projectAType = cmb_project_type_1.getSelectedItem().toString();
                String projectASpeciality = cmb_project_Specialiti.getSelectedItem().toString();
                String projectAGrade = cmb_project_grade_1.getSelectedItem().toString();
                String payMode = cmb_project_bid_payment_mode.getSelectedItem().toString();
                int project_id = primary.getProject_id();

                //int projectId = IDGenerator.getNewID("m_project", "PROJECT_ID");
                String name = txt_project_name_1.getText();
                String desc = txt_project_desc_1.getText();
                String address1 = txt_project_address1.getText();
                String address2 = txt_project_address2.getText();
                String address3 = txt_project_address3.getText();
                String address4 = txt_project_address4.getText();
                int projctTypeId = projectTypeController.searProjectTypeByName(projectAType).getProjectType_id();
                String vatAdded = Integer.toString(cmb_project_vatAdded.getSelectedIndex());
                String contractNo = txt_project_contract_bid_1.getText();
                String clientName = txt_project_client_1.getText();
                String clientAddress1 = txt_project_client_address1.getText();
                String clientAddress2 = txt_project_client_address2.getText();
                String clientAddress3 = txt_project_client_address3.getText();
                String clientAddress4 = txt_project_client_address4.getText();
                String clientContact1 = txt_project_client_contact_1.getText();
                String clientContact2 = txt_project_client_contact_1_2.getText();
                String projectADuration = txt_project_intendedDuration_1.getText();
                int specialityId = projectSpecialityController.searProjectSpecialityByName(projectASpeciality).getProjectSpeciality_id();
                int gradeId = projectGradeController.searProjectGradeByNAme(projectAGrade).getProjectGrade_id();
                double enginnerEstimate = 0;
                if(!"".equals(txt_project_engineer_estimate.getText())){
                 enginnerEstimate = Double.parseDouble(txt_project_engineer_estimate.getText().replaceAll(",", ""));
                }
                double tenderFee = 0;
                if(!"".equals(txt_project_tender_fee_1.getText())){
                 tenderFee = Double.parseDouble(txt_project_tender_fee_1.getText().replaceAll(",", ""));
                }
                int bidPaymentModeId = paymentModeController.searPaymentMode(payMode).getPaymentMode_id();
                double bidAmount = 0;
                if(!"".equals(txt_project_bid_amount_1.getText())){
                 bidAmount = Double.parseDouble(txt_project_bid_amount_1.getText().replaceAll(",", ""));
                }
                String bidDuration = txt_project_bid_duration_1.getText();
                String bidOrganization = txt_project_bid_organization.getText();
                Date tenderOpenDate = txt_project_tender_open_date_1.getDate();
                String tenderOpenTime = de.getFormat().format(txt_project_tender_open_time_1.getValue());
                String currentStatus = Integer.toString(cmb_project_made_of_states_1.getSelectedIndex());
                String tenderResult = txt_project_tender_result.getText();
                Date activeDate = txt_project_states_active_date_1.getDate();
                Date inactiveDate = txt_project_states_inactive_date_1.getDate();

                M_Project_Primary project_Primary = new M_Project_Primary(project_id, name, desc, address1, address2, address3, address4, projctTypeId, vatAdded, contractNo, clientName, clientAddress1, clientAddress2, clientAddress3, clientAddress4, clientContact1, clientContact2, projectADuration, specialityId, gradeId, enginnerEstimate, tenderFee, bidPaymentModeId, bidAmount, bidDuration, bidOrganization, tenderOpenDate, tenderOpenTime, tenderResult, activeDate, inactiveDate, currentStatus);

                boolean updatePrimaryProject = primary_ProjectController.updatePrimaryProject(project_Primary);
                if (updatePrimaryProject) {
                    JOptionPane.showMessageDialog(this, "Primary Project Details Updated Successfully..");
                    primary_ProjectController.releaseProject(project_id);
                } else {
                    JOptionPane.showMessageDialog(this, "Primary Project Detail Updating Cannot Process..");
                }
            } catch (Exception ex) {
                Logger.getLogger(Project_Primary_Panel.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please Check that Project Type , ICTAD Speciality , ICTAD Grade & BID Security Payemnt Mode are Selected");
        }

    }

    private void searchProjectPrimaryByTableName() {

        try {
            int selectedRow = tblPrimaryProject.getSelectedRow();
            primary = primary_ProjectController.searchPrimaryProjectByName((String) dtmPriProject.getValueAt(selectedRow, 0));
            if (projectIdPub != primary.getProject_id()) {
                primary_ProjectController.releaseProject(projectIdPub);
            }
            projectIdPub = primary.getProject_id();
        } catch (Exception ex) {
            Logger.getLogger(Project_Primary_Panel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void clearFields() {
        txt_project_name_1.setText("");
        txt_project_desc_1.setText("");
        txt_project_address1.setText("");
        txt_project_address2.setText("");
        txt_project_address3.setText("");
        txt_project_address4.setText("");
        cmb_project_type_1.setSelectedIndex(0);
        cmb_project_vatAdded.setSelectedIndex(0);
        txt_project_contract_bid_1.setText("");
        txt_project_client_1.setText("");
        txt_project_client_address1.setText("");
        txt_project_client_address2.setText("");
        txt_project_client_address3.setText("");
        txt_project_client_address4.setText("");
        txt_project_client_contact_1.setText("");
        txt_project_client_contact_1_2.setText("");
        txt_project_intendedDuration_1.setText("");
        cmb_project_Specialiti.setSelectedIndex(0);
        cmb_project_grade_1.setSelectedIndex(0);
        txt_project_engineer_estimate.setText("");
        txt_project_tender_fee_1.setText("");
        cmb_project_bid_payment_mode.setSelectedIndex(0);
        txt_project_bid_amount_1.setText("");
        txt_project_bid_organization.setText("");
        txt_project_bid_duration_1.setText("");
        txt_project_tender_open_date_1.setDate(date);
        txt_project_tender_open_time_1.setValue(date);
        cmb_project_made_of_states_1.setSelectedIndex(0);
        txt_project_states_active_date_1.setDate(date);
        txt_project_states_inactive_date_1.setDate(date);
        txt_project_tender_result.setText("");

        btn_add_primary_project.setText("Save");
        txt_project_name_1.requestFocus();
    }
}
