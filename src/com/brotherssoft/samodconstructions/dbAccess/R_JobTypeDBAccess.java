/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.dbAccess;

import com.brotherssoft.samodconstructions.db.DBConnection;
import com.brotherssoft.samodconstructions.model.R_JobType;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gksde
 */
public class R_JobTypeDBAccess {
    
    public R_JobType searchJobType(int id)throws Exception{
        
        String sql = "SELECT * FROM r_jobtype WHERE JOBTYPE_ID=?";
        Connection connection = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = connection.prepareStatement(sql);
        stm.setObject(1, id);
        ResultSet rst = stm.executeQuery();
        
        R_JobType jobType = null;
        if(rst.next()){
            jobType = new R_JobType(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5));
        }
        return jobType;
        
    }
    
    public R_JobType searchJobType(String name)throws Exception{
        
        String sql = "SELECT * FROM r_jobtype WHERE JOBTYPE_NAME=?";
        Connection connection = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = connection.prepareStatement(sql);
        stm.setObject(1, name);
        ResultSet rst = stm.executeQuery();
        
        R_JobType jobType = null;
        if(rst.next()){
            jobType = new R_JobType(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5));
        }
        return jobType;
        
    }
    
    public List<R_JobType> getAllJobTypes()throws Exception{
        
        String sql = "SELECT * FROM r_jobtype";
        Connection connection = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = connection.prepareStatement(sql);
        ResultSet rst = stm.executeQuery();
        
        List<R_JobType> jobTypes = new ArrayList<>();
        while(rst.next()){
            R_JobType jobType = new R_JobType(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5));
            jobTypes.add(jobType);
        }
        return jobTypes;
        
    }
    
}
