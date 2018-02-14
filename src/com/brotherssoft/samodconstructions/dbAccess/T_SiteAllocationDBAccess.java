/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.dbAccess;

import com.brotherssoft.samodconstructions.db.DBConnection;
import com.brotherssoft.samodconstructions.model.T_SiteAllocation;
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
public class T_SiteAllocationDBAccess {

    public boolean addSiteAllocation(T_SiteAllocation siteAllocation) throws Exception {

        Connection connection = DBConnection.getDBConnection().getConnection();
        String sql = "Insert into t_sitealloc values(?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement stm = connection.prepareStatement(sql);
        stm.setObject(1, siteAllocation.getSiteAllocation_id());
        stm.setObject(2, siteAllocation.getSiteAllocation_siteId());
        stm.setObject(3, siteAllocation.getSiteAllocation_date());
        stm.setObject(4, siteAllocation.getSiteAllocation_type());
        stm.setObject(5, siteAllocation.getSiteAllocation_itemId());
        stm.setObject(6, siteAllocation.getSiteAllocation_quantity());
        stm.setObject(7, siteAllocation.getSiteAllocation_comment());
        stm.setObject(8, siteAllocation.getSiteAllocation_TRType());
        stm.setObject(9, siteAllocation.getSiteAllocation_addedUser());
        stm.setObject(10, siteAllocation.getSiteAllocation_authorizedUser());

        return stm.executeUpdate() > 0;

    }

    public boolean updateSiteAllocation(T_SiteAllocation siteAllocation) throws Exception {
        String sql = "Update t_sitealloc set SITEALLOC_SITEID=?, SITEALLOC_DATE=?, SITEALLOC_TYPE=?, SITEALLOC_ITEMID=?, SITEALLOC_QTY=?, SITEALLOC_COMMENT=?, SITEALLOC_TRTYPE=?, SITEALLOC_ADDUSR=?, SITEALLOC_AUTHUSR=? where SITEALLOC_ID=?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);

        stm.setObject(1, siteAllocation.getSiteAllocation_siteId());
        stm.setObject(2, siteAllocation.getSiteAllocation_date());
        stm.setObject(3, siteAllocation.getSiteAllocation_type());
        stm.setObject(4, siteAllocation.getSiteAllocation_itemId());
        stm.setObject(5, siteAllocation.getSiteAllocation_quantity());
        stm.setObject(6, siteAllocation.getSiteAllocation_comment());
        stm.setObject(7, siteAllocation.getSiteAllocation_TRType());
        stm.setObject(8, siteAllocation.getSiteAllocation_addedUser());
        stm.setObject(9, siteAllocation.getSiteAllocation_authorizedUser());
        stm.setObject(10, siteAllocation.getSiteAllocation_id());
        return stm.executeUpdate() > 0;

    }

    public boolean deleteSiteAllocation(int id) throws Exception {

        String sql = "Delete From t_sitealloc where SITEALLOC_ID=?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, id);
        return stm.executeUpdate() > 0;

    }

    public T_SiteAllocation searchSiteAllocation(int id) throws Exception {

        String sql = "Select * From t_sitealloc where SITEALLOC_ID=?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, id);
        ResultSet rst = stm.executeQuery();
        T_SiteAllocation siteAllocation = null;
        if (rst.next()) {
            siteAllocation = new T_SiteAllocation(rst.getInt(1), rst.getInt(2), rst.getDate(3), rst.getString(4), rst.getString(5), rst.getDouble(6), rst.getString(7), rst.getString(8), rst.getInt(9), rst.getInt(10));
        }
        return siteAllocation;

    }

    public List<T_SiteAllocation> getAllSiteAllocations() throws Exception {

        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery("Select * From t_sitealloc");
        List<T_SiteAllocation> siteAllocations = new ArrayList<>();
        while (rst.next()) {
            T_SiteAllocation siteAllocation = new T_SiteAllocation(rst.getInt(1), rst.getInt(2), rst.getDate(3), rst.getString(4), rst.getString(5), rst.getDouble(6), rst.getString(7), rst.getString(8), rst.getInt(9), rst.getInt(10));
            siteAllocations.add(siteAllocation);
        }
        return siteAllocations;

    }

    public T_SiteAllocation searchSiteAllocationByItem(String itemId) throws Exception {

        String sql = "Select * From t_sitealloc where SITEALLOC_ITEMID=?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, itemId);
        ResultSet rst = stm.executeQuery();
        T_SiteAllocation siteAllocation = null;
        if (rst.next()) {
            siteAllocation = new T_SiteAllocation(rst.getInt(1), rst.getInt(2), rst.getDate(3), rst.getString(4), rst.getString(5), rst.getDouble(6), rst.getString(7), rst.getString(8), rst.getInt(9), rst.getInt(10));
        }
        return siteAllocation;

    }

    public List<T_SiteAllocation> getAllSiteAllocationsByItem(String itemId) throws Exception {

        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery("Select * From t_sitealloc WHERE SITEALLOC_ITEMID='" + itemId + "'");
        List<T_SiteAllocation> siteAllocations = new ArrayList<>();
        while (rst.next()) {
            T_SiteAllocation siteAllocation = new T_SiteAllocation(rst.getInt(1), rst.getInt(2), rst.getDate(3), rst.getString(4), rst.getString(5), rst.getDouble(6), rst.getString(7), rst.getString(8), rst.getInt(9), rst.getInt(10));
            siteAllocations.add(siteAllocation);
        }
        return siteAllocations;

    }

    public List<T_SiteAllocation> getAllLastAddedSiteAllocations() throws Exception {

        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery("Select * From t_sitealloc");
        List<T_SiteAllocation> siteAllocations = new ArrayList<>();
        while (rst.next()) {
            T_SiteAllocation siteAllocation = new T_SiteAllocation(rst.getInt(1), rst.getInt(2), rst.getDate(3), rst.getString(4), rst.getString(5), rst.getDouble(6), rst.getString(7), rst.getString(8), rst.getInt(9), rst.getInt(10));
            if (siteAllocations.size() != 0) {
                for (int i = 0; i < siteAllocations.size(); i++) {
                    if (siteAllocations.get(i).getSiteAllocation_itemId().equalsIgnoreCase(siteAllocation.getSiteAllocation_itemId())) {
                        siteAllocations.remove(i);
                        siteAllocations.add(siteAllocation);
                    }else{
                        siteAllocations.add(siteAllocation);
                    }
                }
            } else {
                siteAllocations.add(siteAllocation);
            }
        }
        return siteAllocations;

    }
}
