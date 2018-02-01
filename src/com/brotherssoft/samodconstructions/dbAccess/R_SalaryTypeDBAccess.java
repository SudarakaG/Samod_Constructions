/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.dbAccess;

import com.brotherssoft.samodconstructions.db.DBConnection;
import com.brotherssoft.samodconstructions.model.R_SalaryType;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gksde
 */
public class R_SalaryTypeDBAccess {
    
    public R_SalaryType searchSalaryType(int id)throws Exception{
        
        String sql = "SELECT * FROM r_salarytype WHERE SALARYTYPE_ID=?";
        Connection connection = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = connection.prepareStatement(sql);
        stm.setObject(1, id);
        ResultSet rst = stm.executeQuery();
        
        R_SalaryType salaryType = null;
        if(rst.next()){
            salaryType = new R_SalaryType(rst.getInt(1), rst.getString(2), rst.getString(3));
        }
        return salaryType;
        
    }
    
    public R_SalaryType searchSalaryType(String name)throws Exception{
        
        String sql = "SELECT * FROM r_salarytype WHERE SALARYTYPE_NAME=?";
        Connection connection = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = connection.prepareStatement(sql);
        stm.setObject(1, name);
        ResultSet rst = stm.executeQuery();
        
        R_SalaryType salaryType = null;
        if(rst.next()){
            salaryType = new R_SalaryType(rst.getInt(1), rst.getString(2), rst.getString(3));
        }
        return salaryType;
        
    }
    
    public List<R_SalaryType> getAllSalaryTypes()throws Exception{
        
        String sql = "SELECT * FROM r_salarytype";
        Connection connection = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = connection.prepareStatement(sql);
        ResultSet rst = stm.executeQuery();
        
        List<R_SalaryType> salaryTypes = new ArrayList<>();
        while(rst.next()){
            R_SalaryType salaryType = new R_SalaryType(rst.getInt(1), rst.getString(2), rst.getString(3));
            if(salaryType.getSalaryType_id() != 0){
            salaryTypes.add(salaryType);
            }
        }
        return salaryTypes;
        
    }
    
}
