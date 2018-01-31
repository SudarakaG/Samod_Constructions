/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.dbAccess;

import com.brotherssoft.samodconstructions.db.DBConnection;
import com.brotherssoft.samodconstructions.model.R_VehicleType;
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
public class R_VehicleTypeDBAccess {
 
    public R_VehicleType searchVehicleType(int id) throws Exception {

        String sql = "Select * From r_vehitype where VEHITYPE_ID=?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, id);
        ResultSet rst = stm.executeQuery();
        R_VehicleType vehicleType = null;
        if (rst.next()) {
            vehicleType = new R_VehicleType(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getString(4));

        }
        return vehicleType;

    }

    public List<R_VehicleType> getAllVehicleTypes() throws Exception {

        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery("Select * From r_vehitype");
        List<R_VehicleType> vehicleTypes = new ArrayList<>();
        while (rst.next()) {
            R_VehicleType vehicleType = new R_VehicleType(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getString(4));
            vehicleTypes.add(vehicleType);
        }
        return vehicleTypes;

    }

    public R_VehicleType searchVehicleType(String name) throws Exception {

        String sql = "Select * From r_vehitype where VEHITYPE_NAME=?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, name);
        ResultSet rst = stm.executeQuery();
        R_VehicleType vehicleType = null;
        if (rst.next()) {
            vehicleType = new R_VehicleType(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getString(4));

        }
        return vehicleType;

    }
    
}
