/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.dbAccess;

import com.brotherssoft.samodconstructions.db.DBConnection;
import com.brotherssoft.samodconstructions.model.R_ProjectSpeciality;
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
public class R_ProjectSpecialityDBAccess {
    
    public R_ProjectSpeciality searchProjectSpeciality(int id) throws Exception {

        String sql = "Select * From r_projectspeciality where PROJECTSPECIALITY_ID=?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, id);
        ResultSet rst = stm.executeQuery();
        R_ProjectSpeciality projectSpeciality = null;
        if (rst.next()) {
            projectSpeciality = new R_ProjectSpeciality(rst.getInt(1), rst.getString(2), rst.getString(3));

        }
        return projectSpeciality;

    }

    public List<R_ProjectSpeciality> getAllProjectSpecialities() throws Exception {

        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery("Select * From r_projectspeciality");
        List<R_ProjectSpeciality> projectSpecialities = new ArrayList<>();
        while (rst.next()) {
            R_ProjectSpeciality projectSpeciality = new R_ProjectSpeciality(rst.getInt(1), rst.getString(2), rst.getString(3));
            projectSpecialities.add(projectSpeciality);
        }
        return projectSpecialities;

    }

    public R_ProjectSpeciality searchProjectSpecialityByName(String name) throws Exception {

        String sql = "Select * From r_projectspeciality where PROJECTSPECIALITY_NAME=?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, name);
        ResultSet rst = stm.executeQuery();
        R_ProjectSpeciality projectSpeciality = null;
        if (rst.next()) {
            projectSpeciality = new R_ProjectSpeciality(rst.getInt(1), rst.getString(2), rst.getString(3));

        }
        return projectSpeciality;

    }
    
}
