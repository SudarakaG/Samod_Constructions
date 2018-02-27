/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.dbAccess;

import com.brotherssoft.samodconstructions.db.DBConnection;
import com.brotherssoft.samodconstructions.model.T_Expences;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author gksde
 */
public class T_ExpencesDBAccess {
    
    public boolean addExpence(T_Expences expences) throws Exception{
     
            Connection connection = DBConnection.getDBConnection().getConnection();
            String sql = "Insert into t_expences values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement stm = connection.prepareStatement(sql);
            
            stm.setObject(1, expences.getExpence_id());
            stm.setObject(2, expences.getExpence_description());
            stm.setObject(3, expences.getExpence_typeId());
            stm.setObject(4, expences.getExpence_subTypeId());
            stm.setObject(5, expences.getExpence_date());
            stm.setObject(6, expences.getExpence_purchaserId());
            stm.setObject(7, expences.getExpence_invoiceNo());
            stm.setObject(8, expences.getExpence_invoiceAmount());
            stm.setObject(9, expences.getExpence_vatAmount());
            stm.setObject(10, expences.getExpence_paymentModeId());
            stm.setObject(11, expences.getExpence_RefNo());
            stm.setObject(12, expences.getExpence_dateIssued());
            stm.setObject(13, expences.getExpence_dateReceived());
            stm.setObject(14, expences.getExpence_refId());
            stm.setObject(15, expences.getExpence_refSiteId());
            stm.setObject(16, expences.getExpence_enteredUser());
            stm.setObject(17, expences.getExpence_approvedUser());
            stm.setObject(18, expences.getExpence_enteredDate());
            stm.setObject(19, expences.getExpence_approvedDate());
            stm.setObject(20, expences.getExpence_status());
            stm.setObject(21, expences.getExpence_account());

            return stm.executeUpdate() > 0;
        
    }
    
    public boolean updateExpence(T_Expences expences) throws Exception {
        String sql = "Update t_expences set TEXPENCES_DESC=?,TEXPENCESTYPE_ID=?,TEXPENCESSUBTYPE_ID=?, EXPENCES_DATE=?, EXPENCES_PURCHASERID=?, EXPENCES_INV_NO=?, EXPENCES_INV_AMOUNT=?, EXPENCES_VAT_AMOUNT=?, EXPENCES_PAYMENTMODE_ID=?, EXPENCES_REFNO=?, EXPENCES_DOI=?, EXPENCES_DOR=?, EXPENCES_REFID=?, EXPENCES_REFSITEID=?, EXPENCES_ENT_USER=?, EXPENCES_APP_USER=?, EXPENCES_ENT_DATE=?, EXPENCES_APP_DATE=?, EXPENCES_STATUS=?, EXPENCES_ACCOUNT=? where EXPENCES_ID=?";
            Connection conn = DBConnection.getDBConnection().getConnection();
            PreparedStatement stm = conn.prepareStatement(sql);
            
            stm.setObject(1, expences.getExpence_description());
            stm.setObject(2, expences.getExpence_typeId());
            stm.setObject(3, expences.getExpence_subTypeId());
            stm.setObject(4, expences.getExpence_date());
            stm.setObject(5, expences.getExpence_purchaserId());
            stm.setObject(6, expences.getExpence_invoiceNo());
            stm.setObject(7, expences.getExpence_invoiceAmount());
            stm.setObject(8, expences.getExpence_vatAmount());
            stm.setObject(9, expences.getExpence_paymentModeId());
            stm.setObject(10, expences.getExpence_RefNo());
            stm.setObject(11, expences.getExpence_dateIssued());
            stm.setObject(12, expences.getExpence_dateReceived());
            stm.setObject(13, expences.getExpence_refId());
            stm.setObject(14, expences.getExpence_refSiteId());
            stm.setObject(15, expences.getExpence_enteredUser());
            stm.setObject(16, expences.getExpence_approvedUser());
            stm.setObject(17, expences.getExpence_enteredDate());
            stm.setObject(18, expences.getExpence_approvedDate());
            stm.setObject(19, expences.getExpence_status());
            stm.setObject(20, expences.getExpence_account());
            stm.setObject(21, expences.getExpence_id());

            return stm.executeUpdate() > 0;
        
    }

    public boolean deleteExpence(int id) throws Exception{
        
            String sql = "Delete From t_expences where EXPENCES_ID=?";
            Connection conn = DBConnection.getDBConnection().getConnection();
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setObject(1, id);
            return stm.executeUpdate() > 0;
        
    }

    public T_Expences searchExpence(int id) throws Exception {
        
            String sql = "Select * From t_expences where EXPENCES_ID=?";
            Connection conn = DBConnection.getDBConnection().getConnection();
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setObject(1, id);
            ResultSet rst = stm.executeQuery();
            T_Expences expences = null;
            if (rst.next()) {
                expences = new T_Expences(rst.getInt(1), rst.getString(2), rst.getInt(3), rst.getInt(4), rst.getDate(5), rst.getInt(6), rst.getString(7), rst.getDouble(8), rst.getDouble(9), rst.getInt(10), rst.getString(11), rst.getDate(12), rst.getDate(13), rst.getInt(14), rst.getInt(15), rst.getInt(16), rst.getInt(17), rst.getDate(18), rst.getDate(19), rst.getString(20), rst.getInt(21));

            }
            return expences;
        
    }

    public List<T_Expences> getAllExpences() throws Exception {
       
            Connection conn = DBConnection.getDBConnection().getConnection();
            Statement stm = conn.createStatement();
            ResultSet rst = stm.executeQuery("Select * From t_expences");
            List<T_Expences> expenceses = new ArrayList<>();
            while (rst.next()) {
                T_Expences expences = new T_Expences(rst.getInt(1), rst.getString(2), rst.getInt(3), rst.getInt(4), rst.getDate(5), rst.getInt(6), rst.getString(7), rst.getDouble(8), rst.getDouble(9), rst.getInt(10), rst.getString(11), rst.getDate(12), rst.getDate(13), rst.getInt(14), rst.getInt(15), rst.getInt(16), rst.getInt(17), rst.getDate(18), rst.getDate(19), rst.getString(20), rst.getInt(21));
                expenceses.add(expences);
            }
            return expenceses;
        
    }
    
    public T_Expences searchExpence(Date date, int project, double amount) throws Exception {
        
            String sql = "Select * From t_expences where EXPENCES_DATE=? AND EXPENCES_REFSITEID=? AND EXPENCES_INV_AMOUNT=?";
            Connection conn = DBConnection.getDBConnection().getConnection();
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setObject(1, date);
            stm.setObject(2, project);
            stm.setObject(3, amount);
            ResultSet rst = stm.executeQuery();
            T_Expences expences = null;
            if (rst.next()) {
                expences = new T_Expences(rst.getInt(1), rst.getString(2), rst.getInt(3), rst.getInt(4), rst.getDate(5), rst.getInt(6), rst.getString(7), rst.getDouble(8), rst.getDouble(9), rst.getInt(10), rst.getString(11), rst.getDate(12), rst.getDate(13), rst.getInt(14), rst.getInt(15), rst.getInt(16), rst.getInt(17), rst.getDate(18), rst.getDate(19), rst.getString(20), rst.getInt(21));

            }
            return expences;
        
    }
    
    public List<T_Expences> getAllExpencesByLetter(String phrase) throws Exception {
       
            Connection conn = DBConnection.getDBConnection().getConnection();
            Statement stm = conn.createStatement();
            ResultSet rst = stm.executeQuery("Select * From t_expences WHERE TEXPENCES_DESC LIKE '"+phrase+"%'");
            List<T_Expences> expenceses = new ArrayList<>();
            while (rst.next()) {
                T_Expences expences = new T_Expences(rst.getInt(1), rst.getString(2), rst.getInt(3), rst.getInt(4), rst.getDate(5), rst.getInt(6), rst.getString(7), rst.getDouble(8), rst.getDouble(9), rst.getInt(10), rst.getString(11), rst.getDate(12), rst.getDate(13), rst.getInt(14), rst.getInt(15), rst.getInt(16), rst.getInt(17), rst.getDate(18), rst.getDate(19), rst.getString(20), rst.getInt(21));
                expenceses.add(expences);
            }
            return expenceses;        
    }
    
}
