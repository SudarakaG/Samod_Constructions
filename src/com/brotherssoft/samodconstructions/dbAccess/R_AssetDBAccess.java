/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.dbAccess;

import com.brotherssoft.samodconstructions.db.DBConnection;
import com.brotherssoft.samodconstructions.model.R_Asset;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gksde
 */
public class R_AssetDBAccess {

    public R_Asset searchAsset(int id) throws Exception {

        String sql = "SELECT * FROM r_asset WHERE ASSET_ID=?";
        Connection connection = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = connection.prepareStatement(sql);
        stm.setObject(1, id);
        ResultSet rst = stm.executeQuery();

        R_Asset asset = null;
        if (rst.next()) {
            asset = new R_Asset(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getInt(5));
        }
        return asset;

    }

    public R_Asset searchAsset(String name) throws Exception {

        String sql = "SELECT * FROM r_asset WHERE ASSET_NAME=?";
        Connection connection = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = connection.prepareStatement(sql);
        stm.setObject(1, name);
        ResultSet rst = stm.executeQuery();

        R_Asset asset = null;
        if (rst.next()) {
            asset = new R_Asset(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getInt(5));
        }
        return asset;

    }

    public List<R_Asset> getAllAssets() throws Exception {

        String sql = "SELECT * FROM r_asset";
        Connection connection = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = connection.prepareStatement(sql);
        ResultSet rst = stm.executeQuery();

        List<R_Asset> assets = new ArrayList<>();
        while (rst.next()) {
            R_Asset asset = new R_Asset(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getInt(5));
            if (asset.getAsset_id()!= 0) {
                assets.add(asset);
            }
        }
        return assets;

    }

}
