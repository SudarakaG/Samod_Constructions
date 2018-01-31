/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.dbAccess;

import com.brotherssoft.samodconstructions.db.DBConnection;
import com.brotherssoft.samodconstructions.model.M_Account;
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
public class M_AccountDBAccess {
 
    public boolean addAccount(M_Account account) throws Exception{
     
            Connection connection = DBConnection.getDBConnection().getConnection();
            String sql = "Insert into M_Account values(?,?,?,?,?,?,?)";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setObject(1, account.getAccount_id());
            stm.setObject(2, account.getAccount_bank_id());
            stm.setObject(3, account.getAccount_branch_id());
            stm.setObject(4, account.getAccount_accountNo());
            stm.setObject(5, account.getAccount_accountType_id());
            stm.setObject(6, account.getAccount_status());
            stm.setObject(7, account.getAccount_accountName());
            return stm.executeUpdate() > 0;
        
    }
    
    public boolean updateAccount(M_Account account) throws Exception {
        String sql = "Update M_Account set ACCOUNT_BANKID=?,ACCOUNT_BRANCHID=?,ACCOUNT_ACCOUNTNO=?, ACCOUNT_ACCTYPEID=?, ACCOUNT_STATUS=?, ACCOUNT_ACCOUNTNAME=? where ACCOUNT_ID=?";
            Connection conn = DBConnection.getDBConnection().getConnection();
            PreparedStatement stm = conn.prepareStatement(sql);
            
            stm.setObject(1, account.getAccount_bank_id());
            stm.setObject(2, account.getAccount_branch_id());
            stm.setObject(3, account.getAccount_accountNo());
            stm.setObject(4, account.getAccount_accountType_id());
            stm.setObject(5, account.getAccount_status());
            stm.setObject(6, account.getAccount_accountName());
            stm.setObject(7, account.getAccount_id());
            return stm.executeUpdate() > 0;
        
    }

    public boolean deleteAccount(int id) throws Exception{
        
            String sql = "Delete From M_Account where ACCOUNT_ID=?";
            Connection conn = DBConnection.getDBConnection().getConnection();
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setObject(1, id);
            return stm.executeUpdate() > 0;
        
    }

    public M_Account searchAccount(int id) throws Exception {
        
            String sql = "Select * From M_Account where ACCOUNT_ID=?";
            Connection conn = DBConnection.getDBConnection().getConnection();
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setObject(1, id);
            ResultSet rst = stm.executeQuery();
            M_Account account = null;
            if (rst.next()) {
                account = new M_Account(rst.getInt(1), rst.getInt(2), rst.getInt(3), rst.getString(4), rst.getInt(5), rst.getString(6), rst.getString(7));

            }
            return account;
        
    }

    public List<M_Account> getAllAccounts() throws Exception {
       
            Connection conn = DBConnection.getDBConnection().getConnection();
            Statement stm = conn.createStatement();
            ResultSet rst = stm.executeQuery("Select * From M_Account");
            List<M_Account> accountList = new ArrayList<>();
            while (rst.next()) {
                M_Account account = new M_Account(rst.getInt(1), rst.getInt(2), rst.getInt(3), rst.getString(4), rst.getInt(5), rst.getString(6), rst.getString(7));
                accountList.add(account);
            }
            return accountList;
        
    }
    
    public M_Account searchAccount(String accountNo) throws Exception {
        
            String sql = "Select * From M_Account where ACCOUNT_ACCOUNTNO=?";
            Connection conn = DBConnection.getDBConnection().getConnection();
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setObject(1, accountNo);
            ResultSet rst = stm.executeQuery();
            M_Account account = null;
            if (rst.next()) {
                account = new M_Account(rst.getInt(1), rst.getInt(2), rst.getInt(3), rst.getString(4), rst.getInt(5), rst.getString(6), rst.getString(7));

            }
            return account;
        
    }
    
}
