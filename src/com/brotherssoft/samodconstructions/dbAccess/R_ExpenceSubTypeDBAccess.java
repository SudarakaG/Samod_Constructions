/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.dbAccess;

import com.brotherssoft.samodconstructions.db.DBConnection;
import com.brotherssoft.samodconstructions.model.R_ExpencesSubType;
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
public class R_ExpenceSubTypeDBAccess {

    public R_ExpencesSubType searchExpenceSubType(int id) throws Exception {

        String sql = "Select * From r_expencessubtype where EXPENCESSUBTYPE_ID=?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, id);
        ResultSet rst = stm.executeQuery();
        R_ExpencesSubType expencesSubType = null;
        if (rst.next()) {
            expencesSubType = new R_ExpencesSubType(rst.getInt(1), rst.getInt(2), rst.getString(3), rst.getString(4), rst.getString(5));
        }
        return expencesSubType;

    }

    public List<R_ExpencesSubType> getAllExpenceSubTypes() throws Exception {

        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery("Select * From r_expencessubtype");
        List<R_ExpencesSubType> expencesSubTypes = new ArrayList<>();
        while (rst.next()) {
            R_ExpencesSubType expencesSubType = new R_ExpencesSubType(rst.getInt(1), rst.getInt(2), rst.getString(3), rst.getString(4), rst.getString(5));
            if (expencesSubType.getExpencesSubTytpe_id() != 0) {
                expencesSubTypes.add(expencesSubType);
            }
        }
        return expencesSubTypes;

    }

    public R_ExpencesSubType searchExpenceSubType(String name) throws Exception {

        String sql = "Select * From r_expencessubtype where EXPENCESSUBTYPE_NAME=?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, name);
        ResultSet rst = stm.executeQuery();
        R_ExpencesSubType expencesSubType = null;
        if (rst.next()) {
            expencesSubType = new R_ExpencesSubType(rst.getInt(1), rst.getInt(2), rst.getString(3), rst.getString(4), rst.getString(5));
        }
        return expencesSubType;

    }
}
