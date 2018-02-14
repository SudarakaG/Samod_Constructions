/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.dbAccess;

import com.brotherssoft.samodconstructions.db.DBConnection;
import com.brotherssoft.samodconstructions.model.M_MainStock;
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
public class M_MainStockDBAccess {
    
    public boolean addMainStock(M_MainStock mainStock) throws Exception{
     
            Connection connection = DBConnection.getDBConnection().getConnection();
            String sql = "Insert into m_mstock values(?,?,?,?,?,?,?,?,?)";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setObject(1, mainStock.getMainStock_id());
            stm.setObject(2, mainStock.getMainStock_site_id());
            stm.setObject(3, mainStock.getMainStock_equipment_id());
            stm.setObject(4, mainStock.getMainStock_allocationType());
            stm.setObject(5, mainStock.getMainStock_updateDate());
            stm.setObject(6, mainStock.getMainStock_addeduser_id());
            stm.setObject(7, mainStock.getMainStock_quantity());
            stm.setObject(8, mainStock.getMainStock_approveduser_id());
            stm.setObject(9, mainStock.getMainStock_description());
            
            return stm.executeUpdate() > 0;
        
    }
    
    public boolean updateMainStock(M_MainStock mainStock) throws Exception {
        String sql = "Update m_mstock set MSTOCK_SITEID=?, MSTOCK_EQUIPMENTID=?, MSTOCK_ALLOC_TYPE=?, MSTOCK_UPDATEDATE=?, MSTOCK_ADDED_USER=?, MSTOCK_QUANTITY=?, MSTOCK_APPROVED_USER=?, MSTOCK_DESC=? where MSTOCK_ID=?";
            Connection conn = DBConnection.getDBConnection().getConnection();
            PreparedStatement stm = conn.prepareStatement(sql);
            
            stm.setObject(1, mainStock.getMainStock_site_id());
            stm.setObject(2, mainStock.getMainStock_equipment_id());
            stm.setObject(3, mainStock.getMainStock_allocationType());
            stm.setObject(4, mainStock.getMainStock_updateDate());
            stm.setObject(5, mainStock.getMainStock_addeduser_id());
            stm.setObject(6, mainStock.getMainStock_quantity());
            stm.setObject(7, mainStock.getMainStock_approveduser_id());
            stm.setObject(8, mainStock.getMainStock_description());
            stm.setObject(9, mainStock.getMainStock_id());
            
            return stm.executeUpdate() > 0;
        
    }

    public boolean deleteMainStock(int id) throws Exception{
        
            String sql = "Delete From m_mstock where MSTOCK_ID=?";
            Connection conn = DBConnection.getDBConnection().getConnection();
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setObject(1, id);
            return stm.executeUpdate() > 0;
        
    }

    public M_MainStock searchMainStock(int id) throws Exception {
        
            String sql = "Select * From m_mstock where MSTOCK_ID=?";
            Connection conn = DBConnection.getDBConnection().getConnection();
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setObject(1, id);
            ResultSet rst = stm.executeQuery();
            M_MainStock mainStock = null;
            if (rst.next()) {
               mainStock = new M_MainStock(rst.getInt(1), rst.getInt(2), rst.getString(3), rst.getString(4), rst.getDate(5), rst.getInt(6), rst.getDouble(7),rst.getInt(8),rst.getString(9));

            }
            return mainStock;
        
    }

    public List<M_MainStock> getAllLastAddedMainStock() throws Exception {
       
            Connection conn = DBConnection.getDBConnection().getConnection();
            Statement stm = conn.createStatement();
            ResultSet rst = stm.executeQuery("Select * From m_mstock");
            List<M_MainStock> mainStocks = new ArrayList<>();
            while (rst.next()) {
                M_MainStock mainStock = new M_MainStock(rst.getInt(1), rst.getInt(2), rst.getString(3), rst.getString(4), rst.getDate(5), rst.getInt(6), rst.getDouble(7),rst.getInt(8),rst.getString(9));
                if(mainStocks.size() != 0){
                for (int i = 0; i < mainStocks.size(); i++) {                    
                    if (mainStocks.get(i).getMainStock_equipment_id().equalsIgnoreCase(mainStock.getMainStock_equipment_id())) {
                        mainStocks.remove(i);
                        mainStocks.add(mainStock);
                    }else{
                        mainStocks.add(mainStock);
                    }
                }       
                }else{
                    mainStocks.add(mainStock);
                }
            }
            return mainStocks;
        
    }
    
    public M_MainStock searchMainStockByItem(String itemId) throws Exception {
        
            String sql = "Select * From m_mstock where MSTOCK_EQUIPMENTID=?";
            Connection conn = DBConnection.getDBConnection().getConnection();
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setObject(1, itemId);
            ResultSet rst = stm.executeQuery();
            M_MainStock mainStock = null;
            if (rst.next()) {
               mainStock = new M_MainStock(rst.getInt(1), rst.getInt(2), rst.getString(3), rst.getString(4), rst.getDate(5), rst.getInt(6), rst.getDouble(7),rst.getInt(8),rst.getString(9));

            }
            return mainStock;
            
    }
    
    public List<M_MainStock> getAllMainStockByItem(String itemId) throws Exception {
       
            Connection conn = DBConnection.getDBConnection().getConnection();
            Statement stm = conn.createStatement();
            ResultSet rst = stm.executeQuery("Select * From m_mstock WHERE MSTOCK_EQUIPMENTID='"+itemId+"'");
            List<M_MainStock> mainStocks = new ArrayList<>();
            while (rst.next()) {
                M_MainStock mainStock = new M_MainStock(rst.getInt(1), rst.getInt(2), rst.getString(3), rst.getString(4), rst.getDate(5), rst.getInt(6), rst.getDouble(7),rst.getInt(8),rst.getString(9));
                mainStocks.add(mainStock);
            }
            return mainStocks;
        
    }
    
    public List<M_MainStock> getAllMainStock() throws Exception {
       
            Connection conn = DBConnection.getDBConnection().getConnection();
            Statement stm = conn.createStatement();
            ResultSet rst = stm.executeQuery("Select * From m_mstock");
            List<M_MainStock> mainStocks = new ArrayList<>();
            while (rst.next()) {
                M_MainStock mainStock = new M_MainStock(rst.getInt(1), rst.getInt(2), rst.getString(3), rst.getString(4), rst.getDate(5), rst.getInt(6), rst.getDouble(7),rst.getInt(8),rst.getString(9));
                mainStocks.add(mainStock);
            }
            return mainStocks;
        
    }
    
}
