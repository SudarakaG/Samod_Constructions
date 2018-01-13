/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.view;

import javax.swing.JFrame;
import javax.swing.UIManager;

/**
 *
 * @author Akvasoft
 */
public class GUI_Login extends javax.swing.JFrame {

    /**
     * Creates new form GUI_Login
     */
    public GUI_Login() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        login_panel = new javax.swing.JPanel();
        label_sign_in = new javax.swing.JLabel();
        label_pass = new javax.swing.JLabel();
        label_name = new javax.swing.JLabel();
        txt_name = new javax.swing.JTextField();
        txt_pass = new javax.swing.JPasswordField();
        btn_cancel = new javax.swing.JButton();
        btn_sign_in = new javax.swing.JButton();
        login_panel_background_label = new javax.swing.JLabel();
        login_panel_background_label1 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        login_panel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        login_panel.setOpaque(false);
        login_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_sign_in.setFont(new java.awt.Font("Top Secret", 3, 36)); // NOI18N
        label_sign_in.setForeground(new java.awt.Color(0, 255, 0));
        label_sign_in.setText("welcome");
        login_panel.add(label_sign_in, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 190, 40));

        label_pass.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        label_pass.setForeground(new java.awt.Color(0, 204, 153));
        label_pass.setText("Password");
        login_panel.add(label_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 100, 40));

        label_name.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        label_name.setForeground(new java.awt.Color(0, 204, 153));
        label_name.setText("Name");
        login_panel.add(label_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 60, 40));

        txt_name.setBackground(new java.awt.Color(204, 204, 204));
        txt_name.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        txt_name.setForeground(new java.awt.Color(255, 255, 255));
        txt_name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_name.setToolTipText("Type Your User Name Here !");
        txt_name.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        txt_name.setOpaque(false);
        login_panel.add(txt_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 290, 30));

        txt_pass.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        txt_pass.setForeground(new java.awt.Color(255, 255, 255));
        txt_pass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_pass.setToolTipText("Enter Password !");
        txt_pass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        txt_pass.setOpaque(false);
        login_panel.add(txt_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 290, 30));

        btn_cancel.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        btn_cancel.setForeground(new java.awt.Color(255, 0, 0));
        btn_cancel.setText("Cancel");
        btn_cancel.setToolTipText("click to sign in");
        btn_cancel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        login_panel.add(btn_cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 400, 100, 30));

        btn_sign_in.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        btn_sign_in.setForeground(new java.awt.Color(0, 204, 51));
        btn_sign_in.setText("Sign In");
        btn_sign_in.setToolTipText("click to sign in");
        btn_sign_in.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        login_panel.add(btn_sign_in, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 400, 100, 30));

        login_panel_background_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication6/images/bg-mask.png"))); // NOI18N
        login_panel.add(login_panel_background_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 3, 380, 480));

        login_panel_background_label1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication6/images/bg-mask.png"))); // NOI18N
        login_panel.add(login_panel_background_label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 3, 380, 480));

        getContentPane().add(login_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 200, 380, 480));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication6/images/construction-hero.jpg"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            UIManager.setLookAndFeel("com.jtattoo.plaf.smart.SmartLookAndFeel");
        }catch(Exception e){
        
            e.printStackTrace();
        }
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton btn_cancel;
    private javax.swing.JButton btn_sign_in;
    private javax.swing.JLabel label_name;
    private javax.swing.JLabel label_pass;
    private javax.swing.JLabel label_sign_in;
    private javax.swing.JPanel login_panel;
    private javax.swing.JLabel login_panel_background_label;
    private javax.swing.JLabel login_panel_background_label1;
    private javax.swing.JTextField txt_name;
    private javax.swing.JPasswordField txt_pass;
    // End of variables declaration//GEN-END:variables
}
