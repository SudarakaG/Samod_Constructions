/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.dbAccess;

import com.brotherssoft.samodconstructions.db.DBConnection;
import com.brotherssoft.samodconstructions.model.M_Material;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gksde
 */
public class M_MaterialDBAccess {
    
    public boolean addMaterial(M_Material material)throws Exception{
        
        String sql = "INSERT INTO m_material VALUES(?,?,?,?,?,?)";
        Connection connection = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = connection.prepareStatement(sql);
        
        stm.setObject(1, material.getMaterial_id());
        stm.setObject(2, material.getMaterial_name());
        stm.setObject(3, material.getMaterial_description());
        stm.setObject(4, material.getMaterial_unit_id());
        stm.setObject(5, material.getMaterial_status());
        stm.setObject(6, material.getMaterial_regDate());
        
        return stm.executeUpdate() > 0;
        
    }
    
    public boolean updateMaterial(M_Material material)throws Exception{
        
        String sql = "UPDATE m_material SET MATERIAL_NAME=?, MATERIAL_DESC=?, MATERIAL_UNIT=?, MATERIAL_STATUS=?, MATERIAL_REG_DATE=? WHERE MATERIAL_ID=?";
        Connection connection = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = connection.prepareStatement(sql);
                
        stm.setObject(1, material.getMaterial_name());
        stm.setObject(2, material.getMaterial_description());
        stm.setObject(3, material.getMaterial_unit_id());
        stm.setObject(4, material.getMaterial_status());
        stm.setObject(5, material.getMaterial_regDate());
        stm.setObject(6, material.getMaterial_id());
        
        return stm.executeUpdate() > 0;
        
    }
    
    public boolean deleteEquipment(String id)throws Exception{
        
        String sql = "DELETE FROM m_material WHERE MATERIAL_ID=?";
        Connection connection = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = connection.prepareStatement(sql);
        
        stm.setObject(1, id);
        
        return stm.executeUpdate() > 0;
        
    }
    
    public M_Material searchMaterial(String id)throws Exception{
        
        String sql = "SELECT * FROM m_material WHERE MATERIAL_ID=?";
        Connection connection = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = connection.prepareStatement(sql);
        
        stm.setObject(1, id);
        
        ResultSet rst = stm.executeQuery();
        M_Material material = null;
        if(rst.next()){
            material = new M_Material(rst.getString(1), rst.getString(2), rst.getString(3), rst.getInt(4), rst.getInt(5), rst.getDate(6));
        }
        return material;
        
    }
    
    public M_Material searchMaterialByName(String name)throws Exception{
        
        String sql = "SELECT * FROM m_material WHERE MATERIAL_NAME=?";
        Connection connection = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = connection.prepareStatement(sql);
        
        stm.setObject(1, name);
        
        ResultSet rst = stm.executeQuery();
        M_Material material = null;
        if(rst.next()){
            material = new M_Material(rst.getString(1), rst.getString(2), rst.getString(3), rst.getInt(4), rst.getInt(5), rst.getDate(6));
        }
        return material;
        
    }
    
    public List<M_Material> getAllMaterials()throws Exception{
        
        String sql = "SELECT * FROM m_material";
        Connection connection = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = connection.prepareStatement(sql);
        ResultSet rst = stm.executeQuery();
        
        List<M_Material> materials = new ArrayList<>();
        while (rst.next()) {            
            M_Material material = new M_Material(rst.getString(1), rst.getString(2), rst.getString(3), rst.getInt(4), rst.getInt(5), rst.getDate(6));
            materials.add(material);
        }
        return materials;
        
    }
    
    public List<M_Material> getAllMaterialsByLetter(String phrase)throws Exception{
        
        String sql = "SELECT * FROM m_material WHERE MATERIAL_NAME LIKE '"+phrase+"%'";
        Connection connection = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = connection.prepareStatement(sql);
        ResultSet rst = stm.executeQuery();
        
        List<M_Material> materials = new ArrayList<>();
        while (rst.next()) {            
            M_Material material = new M_Material(rst.getString(1), rst.getString(2), rst.getString(3), rst.getInt(4), rst.getInt(5), rst.getDate(6));
            materials.add(material);
        }
        return materials;
        
    }
    
}
