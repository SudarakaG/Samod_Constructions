/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.dbAccess;

import com.brotherssoft.samodconstructions.db.DBConnection;
import com.brotherssoft.samodconstructions.model.R_Bank;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gksde
 */
public class R_BankDBAccess {
    
    public boolean addBank(R_Bank bank) throws Exception{
     
            Connection connection = DBConnection.getDBConnection().getConnection();
            String sql = "Insert into R_Bank values(?,?,?,?,?)";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setObject(1, bank.getBank_id());
            stm.setObject(2, bank.getBank_name());
            stm.setObject(3, bank.getBank_code());
            stm.setObject(4, bank.getBank_description());
            stm.setObject(5, bank.getBank_status());
            return stm.executeUpdate() > 0;
        
    }
    
    public boolean updateBank(R_Bank bank) throws Exception {

        String sql = "Update R_Bank set BANK_NAME=?,BANK_CODE=?,BANK_DESC=? BANK_STATUS=? where BANK_ID=?";
            Connection conn = DBConnection.getDBConnection().getConnection();
            PreparedStatement stm = conn.prepareStatement(sql);
            
            stm.setObject(1, bank.getBank_name());
            stm.setObject(2, bank.getBank_code());
            stm.setObject(3, bank.getBank_description());
            stm.setObject(4, bank.getBank_status());
            stm.setObject(5, bank.getBank_id());
            return stm.executeUpdate() > 0;
        
    }

    public boolean deleteBank(int id) throws Exception{
        
            String sql = "Delete From R_Bank where BANK_ID=?";
            Connection conn = DBConnection.getDBConnection().getConnection();
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setObject(1, id);
            return stm.executeUpdate() > 0;
        
    }

    public R_Bank searchBanbk(int id) throws Exception {
        
            String sql = "Select * From R_Bank where BANK_ID=?";
            Connection conn = DBConnection.getDBConnection().getConnection();
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setObject(1, id);
            ResultSet rst = stm.executeQuery();
            R_Bank bank = null;
            if (rst.next()) {
                bank = new R_Bank(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getInt(5));

            }
            return bank;
        
    }

    public List<R_Bank> getAllBanks() throws Exception {
       
            Connection conn = DBConnection.getDBConnection().getConnection();
            Statement stm = conn.createStatement();
            ResultSet rst = stm.executeQuery("Select * From R_Bank");
            List<R_Bank> bankList = new ArrayList<>();
            while (rst.next()) {
                R_Bank bank = new R_Bank(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getInt(5));
                bankList.add(bank);
            }
            return bankList;
        
    }
    
}
