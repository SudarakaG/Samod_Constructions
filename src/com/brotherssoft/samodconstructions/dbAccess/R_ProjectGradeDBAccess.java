/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.dbAccess;

import com.brotherssoft.samodconstructions.db.DBConnection;
import com.brotherssoft.samodconstructions.model.R_ProjectGrade;
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
public class R_ProjectGradeDBAccess {
    
    public R_ProjectGrade searchProjectGrade(int id) throws Exception {
        
            String sql = "Select * From r_projectgrade where PROJECTGRADE_ID=?";
            Connection conn = DBConnection.getDBConnection().getConnection();
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setObject(1, id);
            ResultSet rst = stm.executeQuery();
            R_ProjectGrade projectGrade = null;
            if (rst.next()) {
                projectGrade = new R_ProjectGrade(rst.getInt(1), rst.getString(2), rst.getString(3));

            }
            return projectGrade;
        
    }

    public List<R_ProjectGrade> getAllProjectGrades() throws Exception {
       
            Connection conn = DBConnection.getDBConnection().getConnection();
            Statement stm = conn.createStatement();
            ResultSet rst = stm.executeQuery("Select * From r_projectgrade");
            List<R_ProjectGrade> projectGrades = new ArrayList<>();
            while (rst.next()) {
                R_ProjectGrade projectGrade = new R_ProjectGrade(rst.getInt(1), rst.getString(2), rst.getString(3));
                projectGrades.add(projectGrade);
            }
            return projectGrades;
        
    }
    
    public R_ProjectGrade searchProjectGradeByName(String name) throws Exception {
        
            String sql = "Select * From r_projectgrade where PROJECTGRADE_NAME=?";
            Connection conn = DBConnection.getDBConnection().getConnection();
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setObject(1, name);
            ResultSet rst = stm.executeQuery();
            R_ProjectGrade projectGrade = null;
            if (rst.next()) {
                projectGrade = new R_ProjectGrade(rst.getInt(1), rst.getString(2), rst.getString(3));

            }
            return projectGrade;
        
    }
    
}
