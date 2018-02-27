/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.dbAccess;

import com.brotherssoft.samodconstructions.db.DBConnection;
import com.brotherssoft.samodconstructions.model.T_Income;
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
public class T_IncomeDBAccess {
    public boolean addIncome(T_Income income) throws Exception{
     
            Connection connection = DBConnection.getDBConnection().getConnection();
            String sql = "Insert into t_income values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement stm = connection.prepareStatement(sql);
            
            stm.setObject(1, income.getIncome_id());
            stm.setObject(2, income.getIncome_description());
            stm.setObject(3, income.getIncome_typeId());
            stm.setObject(4, income.getIncome_subTypeId());
            stm.setObject(5, income.getIncome_date());
            stm.setObject(6, income.getIncome_siteId());
            stm.setObject(7, income.getIncome_paymentVoucherNo());
            stm.setObject(8, income.getIncome_billAmount());
            stm.setObject(9, income.getIncome_vatAmount());
            stm.setObject(10, income.getIncome_paymentModeId());
            stm.setObject(11, income.getIncome_dateOfIssue());
            stm.setObject(12, income.getIncome_dateOfReceived());
            stm.setObject(13, income.getIncome_RefNo());
            stm.setObject(14, income.getIncome_enteredUser());
            stm.setObject(15, income.getIncome_approvedUser());
            stm.setObject(16, income.getIncome_enteredDate());
            stm.setObject(17, income.getIncome_approvedDate());
            stm.setObject(18, income.getIncome_status());
            stm.setObject(19, income.getIncome_account());

            return stm.executeUpdate() > 0;
        
    }
    
    public boolean updateIncome(T_Income income) throws Exception {
        String sql = "Update t_income set INCOME_DESC=?,TINCOMETYPE_ID=?,TINCOMESUBTYPE_ID=?, INCOME_DATE=?, INCOME_SITEID=?, INCOME_PAY_VOU_NO=?, INCOME_BILL_AMOUNT=?, INCOME_VAT_AMOUNT=?, INCOME_PAYMODE_ID=?, INCOME_DOI=?, INCOME_DOR=?, INCOME_REFNO=?, INCOME_ENT_USER=?, INCOME_APP_USER=?, INCOME_INT_DATE=?, INCOME_APP_DATE=?, INCOME_STATUS=?, INCOME_ACCOUNT=? where INCOME_ID=?";
            Connection conn = DBConnection.getDBConnection().getConnection();
            PreparedStatement stm = conn.prepareStatement(sql);
            
            stm.setObject(1, income.getIncome_description());
            stm.setObject(2, income.getIncome_typeId());
            stm.setObject(3, income.getIncome_subTypeId());
            stm.setObject(4, income.getIncome_date());
            stm.setObject(5, income.getIncome_siteId());
            stm.setObject(6, income.getIncome_paymentVoucherNo());
            stm.setObject(7, income.getIncome_billAmount());
            stm.setObject(8, income.getIncome_vatAmount());
            stm.setObject(9, income.getIncome_paymentModeId());
            stm.setObject(10, income.getIncome_dateOfIssue());
            stm.setObject(11, income.getIncome_dateOfReceived());
            stm.setObject(12, income.getIncome_RefNo());
            stm.setObject(13, income.getIncome_enteredUser());
            stm.setObject(14, income.getIncome_approvedUser());
            stm.setObject(15, income.getIncome_enteredDate());
            stm.setObject(16, income.getIncome_approvedDate());
            stm.setObject(17, income.getIncome_status());
            stm.setObject(18, income.getIncome_account());
            stm.setObject(19, income.getIncome_id());

            return stm.executeUpdate() > 0;
        
    }

    public boolean deleteIncome(int id) throws Exception{
        
            String sql = "Delete From t_income where INCOME_ID=?";
            Connection conn = DBConnection.getDBConnection().getConnection();
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setObject(1, id);
            return stm.executeUpdate() > 0;
        
    }

    public T_Income searchIncome(int id) throws Exception {
        
            String sql = "Select * From t_income where INCOME_ID=?";
            Connection conn = DBConnection.getDBConnection().getConnection();
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setObject(1, id);
            ResultSet rst = stm.executeQuery();
            T_Income income = null;
            if (rst.next()) {
                income = new T_Income(rst.getInt(1), rst.getString(2), rst.getInt(3), rst.getInt(4), rst.getDate(5), rst.getInt(6), rst.getString(7), rst.getDouble(8), rst.getDouble(9), rst.getInt(10), rst.getDate(11), rst.getDate(12), rst.getString(13), rst.getInt(14), rst.getInt(15), rst.getDate(16), rst.getDate(17), rst.getString(18), rst.getString(19));

            }
            return income;
        
    }

    public List<T_Income> getAllIncomes() throws Exception {
       
            Connection conn = DBConnection.getDBConnection().getConnection();
            Statement stm = conn.createStatement();
            ResultSet rst = stm.executeQuery("Select * From t_income");
            List<T_Income> incomes = new ArrayList<>();
            while (rst.next()) {
                T_Income income = new T_Income(rst.getInt(1), rst.getString(2), rst.getInt(3), rst.getInt(4), rst.getDate(5), rst.getInt(6), rst.getString(7), rst.getDouble(8), rst.getDouble(9), rst.getInt(10), rst.getDate(11), rst.getDate(12), rst.getString(13), rst.getInt(14), rst.getInt(15), rst.getDate(16), rst.getDate(17), rst.getString(18), rst.getString(19));
                incomes.add(income);
            }
            return incomes;
        
    }
    
    public T_Income searchIncome(Date date, int project, double amount) throws Exception {
        
            String sql = "Select * From t_income where INCOME_DATE=? AND INCOME_SITEID=? AND INCOME_BILL_AMOUNT=?";
            Connection conn = DBConnection.getDBConnection().getConnection();
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setObject(1, date);
            stm.setObject(2, project);
            stm.setObject(3, amount);
            ResultSet rst = stm.executeQuery();
            T_Income income = null;
            if (rst.next()) {
                income = new T_Income(rst.getInt(1), rst.getString(2), rst.getInt(3), rst.getInt(4), rst.getDate(5), rst.getInt(6), rst.getString(7), rst.getDouble(8), rst.getDouble(9), rst.getInt(10), rst.getDate(11), rst.getDate(12), rst.getString(13), rst.getInt(14), rst.getInt(15), rst.getDate(16), rst.getDate(17), rst.getString(18), rst.getString(19));

            }
            return income;
        
    }
    
    public List<T_Income> getAllIncomesByLetter(String phrase) throws Exception {
       
            Connection conn = DBConnection.getDBConnection().getConnection();
            Statement stm = conn.createStatement();
            ResultSet rst = stm.executeQuery("Select * From t_income WHERE TEXPENCES_DESC LIKE '"+phrase+"%'");
            List<T_Income> incomes = new ArrayList<>();
            while (rst.next()) {
                T_Income income = new T_Income(rst.getInt(1), rst.getString(2), rst.getInt(3), rst.getInt(4), rst.getDate(5), rst.getInt(6), rst.getString(7), rst.getDouble(8), rst.getDouble(9), rst.getInt(10), rst.getDate(11), rst.getDate(12), rst.getString(13), rst.getInt(14), rst.getInt(15), rst.getDate(16), rst.getDate(17), rst.getString(18), rst.getString(19));
                incomes.add(income);
            }
            return incomes;      
    }
}
