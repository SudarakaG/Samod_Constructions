/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.dbAccess;

import com.brotherssoft.samodconstructions.db.DBConnection;
import com.brotherssoft.samodconstructions.model.M_Equipment;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gksde
 */
public class M_EquipmentDBAccess {
    
    public boolean addEquipment(M_Equipment equipment)throws Exception{
        
        String sql = "INSERT INTO m_equipment VALUES(?,?,?,?,?,?,?,?,?,?)";
        Connection connection = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = connection.prepareStatement(sql);
        
        stm.setObject(1, equipment.getEquipment_id());
        stm.setObject(2, equipment.getEquipment_asset_id());
        stm.setObject(3, equipment.getEquipment_asset_category_id());
        stm.setObject(4, equipment.getEquipment_name());
        stm.setObject(5, equipment.getEquipment_description());
        stm.setObject(6, equipment.getEquipment_regNo());
        stm.setObject(7, equipment.getEquipment_capacity());
        stm.setObject(8, equipment.getEquipment_regDate());
        stm.setObject(9, equipment.getEquipment_status());
        stm.setObject(10, equipment.getEquipment_depreciationRate());
        
        return stm.executeUpdate() > 0;
        
    }
    
    public boolean updateEquipment(M_Equipment equipment)throws Exception{
        
        String sql = "UPDATE m_equipment SET EQUIPMENT_ASSETID=?, EQUIPMENT_ASSETCATID=?, EQUIPMENT_NAME=?, EQUIPMENT_DESCR=?, EQUIPMENT_REGNO=?, EQUIPMENT_CAPACITY=?, EQUIPMENT_REG_DATE=?, EQUIPMENT_STATUS=?, EQUIPMENT_DEPRATE=? WHERE EQUIPMENT_ID=?";
        Connection connection = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = connection.prepareStatement(sql);
                
        stm.setObject(1, equipment.getEquipment_asset_id());
        stm.setObject(2, equipment.getEquipment_asset_category_id());
        stm.setObject(3, equipment.getEquipment_name());
        stm.setObject(4, equipment.getEquipment_description());
        stm.setObject(5, equipment.getEquipment_regNo());
        stm.setObject(6, equipment.getEquipment_capacity());
        stm.setObject(7, equipment.getEquipment_regDate());
        stm.setObject(8, equipment.getEquipment_status());
        stm.setObject(9, equipment.getEquipment_depreciationRate());
        stm.setObject(10, equipment.getEquipment_id());
        
        return stm.executeUpdate() > 0;
        
    }
    
    public boolean deleteEquipment(String id)throws Exception{
        
        String sql = "DELETE FROM m_equipment WHERE EQUIPMENT_ID=?";
        Connection connection = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = connection.prepareStatement(sql);
        
        stm.setObject(1, id);
        
        return stm.executeUpdate() > 0;
        
    }
    
    public M_Equipment searchEquipment(String id)throws Exception{
        
        String sql = "SELECT * FROM m_equipment WHERE EQUIPMENT_ID=?";
        Connection connection = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = connection.prepareStatement(sql);
        
        stm.setObject(1, id);
        
        ResultSet rst = stm.executeQuery();
        M_Equipment equipment = null;
        if(rst.next()){
            equipment = new M_Equipment(rst.getString(1), rst.getInt(2), rst.getInt(3), rst.getString(4), rst.getString(5), rst.getString(6), rst.getString(7), rst.getDate(8), rst.getInt(9), rst.getDouble(10));
        }
        return equipment;
        
    }
    
    public M_Equipment searchEquipmentByName(String name)throws Exception{
        
        String sql = "SELECT * FROM m_equipment WHERE EQUIPMENT_NAME=?";
        Connection connection = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = connection.prepareStatement(sql);
        
        stm.setObject(1, name);
        
        ResultSet rst = stm.executeQuery();
        M_Equipment equipment = null;
        if(rst.next()){
            equipment = new M_Equipment(rst.getString(1), rst.getInt(2), rst.getInt(3), rst.getString(4), rst.getString(5), rst.getString(6), rst.getString(7), rst.getDate(8), rst.getInt(9), rst.getDouble(10));
        }
        return equipment;
        
    }
    
    public List<M_Equipment> getAllEquipments()throws Exception{
        
        String sql = "SELECT * FROM m_equipment";
        Connection connection = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = connection.prepareStatement(sql);
        ResultSet rst = stm.executeQuery();
        
        List<M_Equipment> equipments = new ArrayList<>();
        while (rst.next()) {            
            M_Equipment equipment = new M_Equipment(rst.getString(1), rst.getInt(2), rst.getInt(3), rst.getString(4), rst.getString(5), rst.getString(6), rst.getString(7), rst.getDate(8), rst.getInt(9), rst.getDouble(10));
            equipments.add(equipment);
        }
        return equipments;
        
    }
    
    public List<M_Equipment> getAllEquipmentsByLetter(String phrase)throws Exception{
        
        String sql = "SELECT * FROM m_equipment WHERE EQUIPMENT_NAME LIKE '"+phrase+"%'";
        Connection connection = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = connection.prepareStatement(sql);
        ResultSet rst = stm.executeQuery();
        
        List<M_Equipment> equipments = new ArrayList<>();
        while (rst.next()) {            
            M_Equipment equipment = new M_Equipment(rst.getString(1), rst.getInt(2), rst.getInt(3), rst.getString(4), rst.getString(5), rst.getString(6), rst.getString(7), rst.getDate(8), rst.getInt(9), rst.getDouble(10));
            equipments.add(equipment);
        }
        return equipments;
        
    }
    
}
