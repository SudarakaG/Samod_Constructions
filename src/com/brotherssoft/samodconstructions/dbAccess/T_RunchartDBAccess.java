/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.dbAccess;

import com.brotherssoft.samodconstructions.db.DBConnection;
import com.brotherssoft.samodconstructions.model.T_Runchart;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author gksde
 */
public class T_RunchartDBAccess {
    
    public boolean addRunchart(T_Runchart runchart) throws Exception{
     
            Connection connection = DBConnection.getDBConnection().getConnection();
            String sql = "Insert into t_runchart values(?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setObject(1, runchart.getRunchart_id());
            stm.setObject(2, runchart.getRunchart_vehicleId());
            stm.setObject(3, runchart.getRunchart_date());
            stm.setObject(4, runchart.getRunchart_description());
            stm.setObject(5, runchart.getRunchart_odoStart());
            stm.setObject(6, runchart.getRunchart_odoEnd());
            stm.setObject(7, runchart.getRunchart_timeStart());
            stm.setObject(8, runchart.getRunchart_timeEnd());
            stm.setObject(9, runchart.getRunchart_fuelOdoMeter());
            stm.setObject(10, runchart.getRunchart_fuelQuantity());
            stm.setObject(11, runchart.getRunchart_fuelPrice());
            stm.setObject(12, runchart.getRunchart_status());
            return stm.executeUpdate() > 0;
        
    }
    
    public boolean updateRunchart(T_Runchart runchart) throws Exception {
        String sql = "Update t_runchart set RUNCHART_VEHIID=?,RUNCHART_DATE=?,RUNCHART_DESC=?, RUNCHART_ODOSTART=?, RUNCHART_ODOEND=?, RUNCHART_TIMESTART=?, RUNCHART_TIMEEND=?, RUNCHART_FUELODOMETER=?, RUNCHART_FUELQUANTITY=?, RUNCHART_FUELPRICE=?, RUNCHART_STATUS=? where RUNCHART_ID=?";
            Connection conn = DBConnection.getDBConnection().getConnection();
            PreparedStatement stm = conn.prepareStatement(sql);
            
            stm.setObject(1, runchart.getRunchart_vehicleId());
            stm.setObject(2, runchart.getRunchart_date());
            stm.setObject(3, runchart.getRunchart_description());
            stm.setObject(4, runchart.getRunchart_odoStart());
            stm.setObject(5, runchart.getRunchart_odoEnd());
            stm.setObject(6, runchart.getRunchart_timeStart());
            stm.setObject(7, runchart.getRunchart_timeEnd());
            stm.setObject(8, runchart.getRunchart_fuelOdoMeter());
            stm.setObject(9, runchart.getRunchart_fuelQuantity());
            stm.setObject(10, runchart.getRunchart_fuelPrice());
            stm.setObject(11, runchart.getRunchart_status());
            stm.setObject(12, runchart.getRunchart_id());
            return stm.executeUpdate() > 0;
        
    }

    public boolean deleteRunchart(int id) throws Exception{
        
            String sql = "Delete From t_runchart where RUNCHART_ID=?";
            Connection conn = DBConnection.getDBConnection().getConnection();
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setObject(1, id);
            return stm.executeUpdate() > 0;
        
    }

    public T_Runchart searchRunchart(int id) throws Exception {
        
            String sql = "Select * From t_runchart where RUNCHART_ID=?";
            Connection conn = DBConnection.getDBConnection().getConnection();
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setObject(1, id);
            ResultSet rst = stm.executeQuery();
            T_Runchart runchart = null;
            if (rst.next()) {
                runchart = new T_Runchart(rst.getInt(1), rst.getString(2), rst.getDate(3), rst.getString(4), rst.getDouble(5), rst.getDouble(6), rst.getString(7), rst.getString(8), rst.getDouble(9), rst.getDouble(10), rst.getDouble(11), rst.getInt(12));

            }
            return runchart;
        
    }

    public List<T_Runchart> getAllRuncharts() throws Exception {
       
            Connection conn = DBConnection.getDBConnection().getConnection();
            Statement stm = conn.createStatement();
            ResultSet rst = stm.executeQuery("Select * From t_runchart");
            List<T_Runchart> runcharts = new ArrayList<>();
            while (rst.next()) {
                T_Runchart runchart = new T_Runchart(rst.getInt(1), rst.getString(2), rst.getDate(3), rst.getString(4), rst.getDouble(5), rst.getDouble(6), rst.getString(7), rst.getString(8), rst.getDouble(9), rst.getDouble(10), rst.getDouble(11), rst.getInt(12));
                runcharts.add(runchart);
            }
            return runcharts;
        
    }   
    
    public List<T_Runchart> getAllLastAddedRuncharts() throws Exception {
       
            Connection conn = DBConnection.getDBConnection().getConnection();
            Statement stm = conn.createStatement();
            ResultSet rst = stm.executeQuery("Select * From t_runchart");
            List<T_Runchart> runcharts = new ArrayList<>();
            while (rst.next()) {
                T_Runchart runchart = new T_Runchart(rst.getInt(1), rst.getString(2), rst.getDate(3), rst.getString(4), rst.getDouble(5), rst.getDouble(6), rst.getString(7), rst.getString(8), rst.getDouble(9), rst.getDouble(10), rst.getDouble(11), rst.getInt(12));
                if (runcharts.size() != 0) {
                    for (int i = 0; i < runcharts.size(); i++) {
                        if (runcharts.get(i).getRunchart_vehicleId().equalsIgnoreCase(runchart.getRunchart_vehicleId())) {
                            runcharts.remove(i);
                        }
                    }
                    runcharts.add(runchart);
                }else{
                    runcharts.add(runchart);
                }                
            }
            return runcharts;
        
    }   
    
    public T_Runchart searchRunchart(String vNo,Date rDate,String sTime,String eTime) throws Exception {
        
            String sql = "Select * From t_runchart where RUNCHART_VEHIID=? AND RUNCHART_DATE=? AND RUNCHART_TIMESTART=? AND RUNCHART_TIMEEND=?";
            Connection conn = DBConnection.getDBConnection().getConnection();
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setObject(1, vNo);
            stm.setObject(2, rDate);
            stm.setObject(3, sTime);
            stm.setObject(4, eTime);
            ResultSet rst = stm.executeQuery();
            T_Runchart runchart = null;
            if (rst.next()) {
                runchart = new T_Runchart(rst.getInt(1), rst.getString(2), rst.getDate(3), rst.getString(4), rst.getDouble(5), rst.getDouble(6), rst.getString(7), rst.getString(8), rst.getDouble(9), rst.getDouble(10), rst.getDouble(11), rst.getInt(12));

            }
            return runchart;
        
    }
    
}
