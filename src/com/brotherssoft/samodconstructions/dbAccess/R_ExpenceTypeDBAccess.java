/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.dbAccess;

import com.brotherssoft.samodconstructions.db.DBConnection;
import com.brotherssoft.samodconstructions.model.R_ExpencesType;
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
public class R_ExpenceTypeDBAccess {

    public R_ExpencesType searchExpenceType(int id) throws Exception {

        String sql = "Select * From r_expencestype where EXPENCESTYPE_ID=?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, id);
        ResultSet rst = stm.executeQuery();
        R_ExpencesType expencesType = null;
        if (rst.next()) {
            expencesType = new R_ExpencesType(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5), rst.getString(6), rst.getString(7));
        }
        return expencesType;

    }

    public List<R_ExpencesType> getAllExpenceTypes() throws Exception {

        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery("Select * From r_expencestype");
        List<R_ExpencesType> expencesTypes = new ArrayList<>();
        while (rst.next()) {
            R_ExpencesType expencesType = new R_ExpencesType(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5), rst.getString(6), rst.getString(7));
            if (expencesType.getExpencesType_id() != 0) {
                expencesTypes.add(expencesType);
            }
        }
        return expencesTypes;

    }

    public R_ExpencesType searchExpenceType(String name) throws Exception {

        String sql = "Select * From r_expencestype where EXPENCESTYPE_NAME=?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, name);
        ResultSet rst = stm.executeQuery();
        R_ExpencesType expencesType = null;
        if (rst.next()) {
            expencesType = new R_ExpencesType(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5), rst.getString(6), rst.getString(7));
        }
        return expencesType;

    }
}
