/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.dbAccess;

import com.brotherssoft.samodconstructions.db.DBConnection;
import com.brotherssoft.samodconstructions.model.R_Designation;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gksde
 */
public class R_DesignationDBAccess {
    
    public R_Designation searchDesignation(int id)throws Exception{
        
        String sql = "SELECT * FROM r_desg WHERE DESG_ID=?";
        Connection connection = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = connection.prepareStatement(sql);
        stm.setObject(1, id);
        ResultSet rst = stm.executeQuery();
        
        R_Designation designation = null;
        if(rst.next()){
            designation = new R_Designation(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5));
        }
        return designation;
        
    }
    
    public R_Designation searchDesignation(String name)throws Exception{
        
        String sql = "SELECT * FROM r_desg WHERE DESG_NAME=?";
        Connection connection = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = connection.prepareStatement(sql);
        stm.setObject(1, name);
        ResultSet rst = stm.executeQuery();
        
        R_Designation designation = null;
        if(rst.next()){
            designation = new R_Designation(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5));
        }
        return designation;
        
    }
    
    public List<R_Designation> getAllDesignations()throws Exception{
        
        String sql = "SELECT * FROM r_desg";
        Connection connection = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = connection.prepareStatement(sql);
        ResultSet rst = stm.executeQuery();
        
        List<R_Designation> designations = new ArrayList<>();
        while(rst.next()){
            R_Designation designation = new R_Designation(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5));
            designations.add(designation);
        }
        return designations;
        
    }
    
}
