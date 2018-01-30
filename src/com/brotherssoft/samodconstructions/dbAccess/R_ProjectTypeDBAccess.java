/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.dbAccess;

import com.brotherssoft.samodconstructions.db.DBConnection;
import com.brotherssoft.samodconstructions.model.R_ProjectType;
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
public class R_ProjectTypeDBAccess {

    public R_ProjectType searchProjectType(int id) throws Exception {

        String sql = "Select * From r_projecttype where PROJECTTYPE_ID=?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, id);
        ResultSet rst = stm.executeQuery();
        R_ProjectType projectType = null;
        if (rst.next()) {
            projectType = new R_ProjectType(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getString(4));

        }
        return projectType;

    }

    public List<R_ProjectType> getAllProjectTypes() throws Exception {

        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery("Select * From r_projecttype");
        List<R_ProjectType> projectTypes = new ArrayList<>();
        while (rst.next()) {
            R_ProjectType projectType = new R_ProjectType(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getString(4));
            projectTypes.add(projectType);
        }
        return projectTypes;

    }

    public R_ProjectType searchProjectTypeByName(String name) throws Exception {

        String sql = "Select * From r_projecttype where PROJECTTYPE_NAME=?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, name);
        ResultSet rst = stm.executeQuery();
        R_ProjectType projectType = null;
        if (rst.next()) {
            projectType = new R_ProjectType(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getString(4));

        }
        return projectType;

    }

}
