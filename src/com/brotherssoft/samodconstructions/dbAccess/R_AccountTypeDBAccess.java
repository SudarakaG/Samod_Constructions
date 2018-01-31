/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.dbAccess;

import com.brotherssoft.samodconstructions.db.DBConnection;
import com.brotherssoft.samodconstructions.model.R_AccountType;
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
public class R_AccountTypeDBAccess {
    
    public R_AccountType searchAccountType(int id) throws Exception {
        
            String sql = "Select * From r_acctype where ACCTYPE_ID=?";
            Connection conn = DBConnection.getDBConnection().getConnection();
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setObject(1, id);
            ResultSet rst = stm.executeQuery();
            R_AccountType accountType = null;
            if (rst.next()) {
                accountType = new R_AccountType(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5));

            }
            return accountType;
        
    }

    public List<R_AccountType> getAllAccountTypes() throws Exception {
       
            Connection conn = DBConnection.getDBConnection().getConnection();
            Statement stm = conn.createStatement();
            ResultSet rst = stm.executeQuery("Select * From r_acctype");
            List<R_AccountType> accountTypeList = new ArrayList<>();
            while (rst.next()) {
                R_AccountType accountType = new R_AccountType(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5));
                accountTypeList.add(accountType);
            }
            return accountTypeList;
        
    }
    
    public R_AccountType searchAccountType(String name) throws Exception {
        
            String sql = "Select * From r_acctype where ACCTYPE_NAME=?";
            Connection conn = DBConnection.getDBConnection().getConnection();
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setObject(1, name);
            ResultSet rst = stm.executeQuery();
            R_AccountType accountType = null;
            if (rst.next()) {
                accountType = new R_AccountType(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5));

            }
            return accountType;
        
    }
    
}
