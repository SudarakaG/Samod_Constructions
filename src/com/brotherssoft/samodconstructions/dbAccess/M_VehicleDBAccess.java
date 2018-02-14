/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.dbAccess;

import com.brotherssoft.samodconstructions.db.DBConnection;
import com.brotherssoft.samodconstructions.model.M_Vehicle;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gksde
 */
public class M_VehicleDBAccess {
    
    public boolean addVehicle(M_Vehicle vehicle)throws Exception{
        
        String sql = "Insert into M_Vehicle values(?,?,?,?,?,?,?,?,?,?,?)";
        Connection connection = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = connection.prepareStatement(sql);
        
        stm.setObject(1, vehicle.getVehicle_id());
        stm.setObject(2, vehicle.getVehicle_regNo());
        stm.setObject(3, vehicle.getVehicle_type_id());
        stm.setObject(4, vehicle.getVehicle_engineNo());
        stm.setObject(5, vehicle.getVehicle_chasisNo());
        stm.setObject(6, vehicle.getVehicle_year());
        stm.setObject(7, vehicle.getVehicle_amount());
        stm.setObject(8, vehicle.getVehicle_depreciationRate());
        stm.setObject(9, vehicle.getVehicle_status());
        stm.setObject(10, vehicle.getVehicle_fuelType());
        stm.setObject(11, vehicle.getVehicle_allocatrionStatus());
        
        return stm.executeUpdate()>0;
        
    }
    
    public boolean updateVehicle(M_Vehicle vehicle)throws Exception{
        
        String sql = "UPDATE M_Vehicle SET VEHICLE_REGNO=?, VEHICLE_VEHITYPEID=?, VEHICLE_ENGINENO=?, VEHICLE_CHASSISNO=?, VEHICLE_YOM=?, VEHICLE_AMOUNT=?, VEHICLE_DEPRATE=?, VEHICLE_STATUS=?, VEHICLE_FUELTYPE=?, VEHICLE_ALLOC_STATUS=? WHERE VEHICLE_ID=?";
        Connection connection = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = connection.prepareStatement(sql);
                
        stm.setObject(1, vehicle.getVehicle_regNo());
        stm.setObject(2, vehicle.getVehicle_type_id());
        stm.setObject(3, vehicle.getVehicle_engineNo());
        stm.setObject(4, vehicle.getVehicle_chasisNo());
        stm.setObject(5, vehicle.getVehicle_year());
        stm.setObject(6, vehicle.getVehicle_amount());
        stm.setObject(7, vehicle.getVehicle_depreciationRate());
        stm.setObject(8, vehicle.getVehicle_status());
        stm.setObject(9, vehicle.getVehicle_fuelType());
        stm.setObject(10, vehicle.getVehicle_allocatrionStatus());
        stm.setObject(11, vehicle.getVehicle_id());
        
        return stm.executeUpdate()>0;
        
    }
    
    public boolean deleteVehicle(String id)throws Exception{
        
        String sql = "DELETE FROM M_Vehicle WHERE VEHICLE_ID=?";
        Connection connection = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = connection.prepareStatement(sql);
        
        stm.setObject(1, id);
        
        return stm.executeUpdate() > 0;
        
    }
    
    public M_Vehicle searchVehicle(String id)throws Exception{
        
        String sql = "SELECT * FROM M_Vehicle WHERE VEHICLE_ID=?";
        Connection connection = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = connection.prepareStatement(sql);
        
        stm.setObject(1, id);
        
        ResultSet rst = stm.executeQuery();
        M_Vehicle vehicle = null;
        if(rst.next()){
            vehicle = new M_Vehicle(rst.getString(1), rst.getString(2), rst.getInt(3), rst.getString(4), rst.getString(5), rst.getString(6), rst.getDouble(7), rst.getDouble(8), rst.getString(9), rst.getInt(10), rst.getString(11));
        }
        return vehicle;
        
    }
    
    public M_Vehicle searchVehicleByNumber(String regNo)throws Exception{
        
        String sql = "SELECT * FROM M_Vehicle WHERE VEHICLE_REGNO=?";
        Connection connection = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = connection.prepareStatement(sql);
        
        stm.setObject(1, regNo);
        
        ResultSet rst = stm.executeQuery();
        M_Vehicle vehicle = null;
        if(rst.next()){
            vehicle = new M_Vehicle(rst.getString(1), rst.getString(2), rst.getInt(3), rst.getString(4), rst.getString(5), rst.getString(6), rst.getDouble(7), rst.getDouble(8), rst.getString(9), rst.getInt(10), rst.getString(11));
        }
        return vehicle;
        
    }
    
    public List<M_Vehicle> getAllVehicles()throws Exception{
        
        String sql = "SELECT * FROM M_Vehicle";
        Connection connection = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = connection.prepareStatement(sql);
        ResultSet rst = stm.executeQuery();
        List<M_Vehicle> vehicles = new ArrayList<>();
        while(rst.next()){
            M_Vehicle vehicle = new M_Vehicle(rst.getString(1), rst.getString(2), rst.getInt(3), rst.getString(4), rst.getString(5), rst.getString(6), rst.getDouble(7), rst.getDouble(8), rst.getString(9), rst.getInt(10), rst.getString(11));
            vehicles.add(vehicle);
        }
        return vehicles;
        
    }
    
    public List<M_Vehicle> getAllVehiclesByLetter(String phrase)throws Exception{
        
        String sql = "SELECT * FROM M_Vehicle WHERE VEHICLE_REGNO LIKE '"+phrase+"%'";
        Connection connection = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = connection.prepareStatement(sql);
        ResultSet rst = stm.executeQuery();
        List<M_Vehicle> vehicles = new ArrayList<>();
        while(rst.next()){
            M_Vehicle vehicle = new M_Vehicle(rst.getString(1), rst.getString(2), rst.getInt(3), rst.getString(4), rst.getString(5), rst.getString(6), rst.getDouble(7), rst.getDouble(8), rst.getString(9), rst.getInt(10), rst.getString(11));
            vehicles.add(vehicle);
        }
        return vehicles;
        
    }
    
}
