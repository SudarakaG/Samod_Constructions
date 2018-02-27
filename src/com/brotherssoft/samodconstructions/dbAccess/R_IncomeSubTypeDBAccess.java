/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.dbAccess;

import com.brotherssoft.samodconstructions.db.DBConnection;
import com.brotherssoft.samodconstructions.model.R_IncomeSubType;
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
public class R_IncomeSubTypeDBAccess {

    public R_IncomeSubType searchIncomeSubType(int id) throws Exception {

        String sql = "Select * From r_incomesubtype where INCOMESUBTYPE_ID=?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, id);
        ResultSet rst = stm.executeQuery();
        R_IncomeSubType incomeSubType = null;
        if (rst.next()) {
            incomeSubType = new R_IncomeSubType(rst.getInt(1), rst.getInt(2), rst.getString(3), rst.getString(4), rst.getString(5));
        }
        return incomeSubType;

    }

    public List<R_IncomeSubType> getAllIncomeSubTypes() throws Exception {

        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery("Select * From r_incomesubtype");
        List<R_IncomeSubType> incomeSubTypes = new ArrayList<>();
        while (rst.next()) {
            R_IncomeSubType incomeSubType = new R_IncomeSubType(rst.getInt(1), rst.getInt(2), rst.getString(3), rst.getString(4), rst.getString(5));
            if (incomeSubType.getIncomeSubType_id() != 0) {
                incomeSubTypes.add(incomeSubType);
            }
        }
        return incomeSubTypes;

    }

    public R_IncomeSubType searchIncomeSubType(String name) throws Exception {

        String sql = "Select * From r_incomesubtype where INCOMESUBTYPE_NAME=?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, name);
        ResultSet rst = stm.executeQuery();
        R_IncomeSubType incomeSubType = null;
        if (rst.next()) {
            incomeSubType = new R_IncomeSubType(rst.getInt(1), rst.getInt(2), rst.getString(3), rst.getString(4), rst.getString(5));
        }
        return incomeSubType;

    }
}
