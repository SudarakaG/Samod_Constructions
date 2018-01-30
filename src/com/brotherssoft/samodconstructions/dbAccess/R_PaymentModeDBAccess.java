/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.dbAccess;

import com.brotherssoft.samodconstructions.db.DBConnection;
import com.brotherssoft.samodconstructions.model.R_PaymentMode;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gksde
 */
public class R_PaymentModeDBAccess {
    
    public R_PaymentMode searchPaymentMode(int id) throws Exception {

        String sql = "Select * From r_payment_mode where PAYMENTMODE_ID=?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, id);
        ResultSet rst = stm.executeQuery();
        R_PaymentMode paymentMode = null;
        if (rst.next()) {
            paymentMode = new R_PaymentMode(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5), rst.getString(6));

        }
        return paymentMode;

    }

    public List<R_PaymentMode> getAllPaymentModes() throws Exception {

        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery("Select * From r_payment_mode");
        List<R_PaymentMode> paymentModes = new ArrayList<>();
        while (rst.next()) {
            R_PaymentMode paymentMode = new R_PaymentMode(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5), rst.getString(6));
            paymentModes.add(paymentMode);
        }
        return paymentModes;

    }

    public R_PaymentMode searchPaymentModeByName(String name) throws Exception {

        String sql = "Select * From r_payment_mode where PAYMENTMODE_NAME=?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, name);
        ResultSet rst = stm.executeQuery();
        R_PaymentMode paymentMode = null;
        if (rst.next()) {
            paymentMode = new R_PaymentMode(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5), rst.getString(6));

        }
        return paymentMode;

    }
    
}
