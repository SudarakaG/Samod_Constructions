/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.dbAccess;

import com.brotherssoft.samodconstructions.db.DBConnection;
import com.brotherssoft.samodconstructions.model.R_Unit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gksde
 */
public class R_UnitDBAccess {
    
    public R_Unit searchUnit(int id) throws Exception {

        String sql = "SELECT * FROM r_units WHERE UNITS_ID=?";
        Connection connection = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = connection.prepareStatement(sql);
        stm.setObject(1, id);
        ResultSet rst = stm.executeQuery();

        R_Unit unit = null;
        if (rst.next()) {
            unit = new R_Unit(rst.getInt(1), rst.getString(2), rst.getString(3));
        }
        return unit;

    }

    public R_Unit searchUnit(String name) throws Exception {

        String sql = "SELECT * FROM r_units WHERE UNITS_NAME=?";
        Connection connection = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = connection.prepareStatement(sql);
        stm.setObject(1, name);
        ResultSet rst = stm.executeQuery();

        R_Unit unit = null;
        if (rst.next()) {
            unit = new R_Unit(rst.getInt(1), rst.getString(2), rst.getString(3));
        }
        return unit;

    }

    public List<R_Unit> getAllUnits() throws Exception {

        String sql = "SELECT * FROM r_units";
        Connection connection = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = connection.prepareStatement(sql);
        ResultSet rst = stm.executeQuery();

        List<R_Unit> units = new ArrayList<>();
        while (rst.next()) {
            R_Unit unit = new R_Unit(rst.getInt(1), rst.getString(2), rst.getString(3));
            if (unit.getUnit_id() != 0) {
                units.add(unit);
            }
        }
        return units;

    }
    
}
