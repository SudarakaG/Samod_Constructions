/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.dbAccess;

import com.brotherssoft.samodconstructions.db.DBConnection;
import com.brotherssoft.samodconstructions.model.R_AssetCategory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gksde
 */
public class R_AssetCategoryDBAccess {
    
    public R_AssetCategory searchAssetCategory(int id) throws Exception {

        String sql = "SELECT * FROM r_asset_cat WHERE ASSET_CAT_ID=?";
        Connection connection = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = connection.prepareStatement(sql);
        stm.setObject(1, id);
        ResultSet rst = stm.executeQuery();

        R_AssetCategory assetCategory = null;
        if (rst.next()) {
            assetCategory = new R_AssetCategory(rst.getInt(1), rst.getString(2), rst.getString(3));
        }
        return assetCategory;

    }

    public R_AssetCategory searchAssetCategory(String name) throws Exception {

        String sql = "SELECT * FROM r_asset_cat WHERE ASSET_CAT_DESC=?";
        Connection connection = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = connection.prepareStatement(sql);
        stm.setObject(1, name);
        ResultSet rst = stm.executeQuery();

        R_AssetCategory assetCategory = null;
        if (rst.next()) {
            assetCategory = new R_AssetCategory(rst.getInt(1), rst.getString(2), rst.getString(3));
        }
        return assetCategory;

    }

    public List<R_AssetCategory> getAllAssetCategorys() throws Exception {

        String sql = "SELECT * FROM r_asset_cat";
        Connection connection = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = connection.prepareStatement(sql);
        ResultSet rst = stm.executeQuery();

        List<R_AssetCategory> assetCategorys = new ArrayList<>();
        while (rst.next()) {
            R_AssetCategory assetCategory = new R_AssetCategory(rst.getInt(1), rst.getString(2), rst.getString(3));
            if (assetCategory.getAssetCategory_id() != 0) {
                assetCategorys.add(assetCategory);
            }
        }
        return assetCategorys;

    }
    
}
