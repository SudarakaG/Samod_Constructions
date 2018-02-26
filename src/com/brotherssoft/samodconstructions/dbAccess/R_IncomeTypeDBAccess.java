/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.dbAccess;

import com.brotherssoft.samodconstructions.db.DBConnection;
import com.brotherssoft.samodconstructions.model.R_IncomeType;
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
public class R_IncomeTypeDBAccess {
    public R_IncomeType searchIncomeType(int id) throws Exception {

        String sql = "Select * From r_incometype where INCOMETYPE_ID=?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, id);
        ResultSet rst = stm.executeQuery();
        R_IncomeType incomeType = null;
        if (rst.next()) {
            incomeType = new R_IncomeType(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5), rst.getString(6));
        }
        return incomeType;

    }

    public List<R_IncomeType> getAllIncomeTypes() throws Exception {

        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery("Select * From r_incometype");
        List<R_IncomeType> incomeTypes = new ArrayList<>();
        while (rst.next()) {
            R_IncomeType incomeType = new R_IncomeType(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5), rst.getString(6));
            incomeTypes.add(incomeType);
        }
        return incomeTypes;

    }

    public R_IncomeType searchIncomeType(String name) throws Exception {

        String sql = "Select * From r_incometype where INCOMETYPE_NAME=?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, name);
        ResultSet rst = stm.executeQuery();
        R_IncomeType incomeType = null;
        if (rst.next()) {
            incomeType = new R_IncomeType(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5), rst.getString(6));
        }
        return incomeType;

    }
}
