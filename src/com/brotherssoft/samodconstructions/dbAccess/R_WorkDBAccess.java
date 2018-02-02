/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.dbAccess;

import com.brotherssoft.samodconstructions.db.DBConnection;
import com.brotherssoft.samodconstructions.model.R_Work;
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
public class R_WorkDBAccess {
    
    public boolean addWork(R_Work work) throws Exception{
     
            Connection connection = DBConnection.getDBConnection().getConnection();
            String sql = "Insert into r_work values(?,?,?,?)";
            PreparedStatement stm = connection.prepareStatement(sql);
            
            stm.setObject(1, work.getWork_id());
            stm.setObject(2, work.getWork_name());
            stm.setObject(3, work.getWork_description());
            stm.setObject(4, work.getWork_status());

            return stm.executeUpdate() > 0;
        
    }
    
    public boolean updateWork(R_Work work) throws Exception {
        String sql = "Update r_work set WORK_NAME=?,WORK_DESC=?,WORK_STATUS=? where WORK_ID=?";
            Connection conn = DBConnection.getDBConnection().getConnection();
            PreparedStatement stm = conn.prepareStatement(sql);
            
            stm.setObject(1, work.getWork_name());
            stm.setObject(2, work.getWork_description());
            stm.setObject(3, work.getWork_status());
            stm.setObject(4, work.getWork_id());

            return stm.executeUpdate() > 0;
        
    }

    public boolean deleteWork(int id) throws Exception{
        
            String sql = "Delete From r_work where WORK_ID=?";
            Connection conn = DBConnection.getDBConnection().getConnection();
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setObject(1, id);
            return stm.executeUpdate() > 0;
        
    }

    public R_Work searchWork(int id) throws Exception {
        
            String sql = "Select * From r_work where WORK_ID=?";
            Connection conn = DBConnection.getDBConnection().getConnection();
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setObject(1, id);
            ResultSet rst = stm.executeQuery();
            R_Work work = null;
            if (rst.next()) {
                work = new R_Work(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getString(4));

            }
            return work;
        
    }

    public List<R_Work> getAllWorks() throws Exception {
       
            Connection conn = DBConnection.getDBConnection().getConnection();
            Statement stm = conn.createStatement();
            ResultSet rst = stm.executeQuery("Select * From r_work");
            List<R_Work> works = new ArrayList<>();
            while (rst.next()) {
                R_Work work = new R_Work(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getString(4));
                if(work.getWork_id()!= 0){
                works.add(work);
                }
            }
            return works;
        
    }
    
    public R_Work searchWork(String name) throws Exception {
        
            String sql = "Select * From r_work where WORK_NAME=?";
            Connection conn = DBConnection.getDBConnection().getConnection();
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setObject(1, name);
            ResultSet rst = stm.executeQuery();
            R_Work work = null;
            if (rst.next()) {
                work = new R_Work(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getString(4));

            }
            return work;
        
    }
    
}
