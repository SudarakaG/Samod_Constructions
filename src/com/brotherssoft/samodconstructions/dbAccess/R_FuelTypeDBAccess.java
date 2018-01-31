/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.dbAccess;

import com.brotherssoft.samodconstructions.db.DBConnection;
import com.brotherssoft.samodconstructions.model.R_FuelType;
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
public class R_FuelTypeDBAccess {
    
    public R_FuelType searchFuelType(int id) throws Exception {

        String sql = "Select * From r_fualtype where FUAL_ID=?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, id);
        ResultSet rst = stm.executeQuery();
        R_FuelType fuelType = null;
        if (rst.next()) {
            fuelType = new R_FuelType(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getString(4));

        }
        return fuelType;

    }

    public List<R_FuelType> getAllFuelTypes() throws Exception {

        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery("Select * From r_fualtype");
        List<R_FuelType> fuelTypes = new ArrayList<>();
        while (rst.next()) {
            R_FuelType fuelType = new R_FuelType(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getString(4));
            fuelTypes.add(fuelType);
        }
        return fuelTypes;

    }

    public R_FuelType searchFuelType(String name) throws Exception {

        String sql = "Select * From r_fualtype where FUAL_NAME=?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, name);
        ResultSet rst = stm.executeQuery();
        R_FuelType fuelType = null;
        if (rst.next()) {
            fuelType = new R_FuelType(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getString(4));

        }
        return fuelType;

    }
    
}
