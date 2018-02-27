/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.dbAccess;

import com.brotherssoft.samodconstructions.db.DBConnection;
import com.brotherssoft.samodconstructions.model.M_Purchaser;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gksde
 */
public class M_PurchaserDBAccess {

    public boolean addPurchaser(M_Purchaser purchaser) throws Exception {

        String sql = "INSERT INTO M_Purchaser VALUES(?,?,?,?,?,?,?,?,?,?,?)";
        Connection connection = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = connection.prepareStatement(sql);

        stm.setObject(1, purchaser.getPurchaser_id());
        stm.setObject(2, purchaser.getPurchaser_name());
        stm.setObject(3, purchaser.getPurchaser_address());
        stm.setObject(4, purchaser.getPurchaser_accountNo());
        stm.setObject(5, purchaser.getPurchaser_bank_id());
        stm.setObject(6, purchaser.getPurchaser_branch_id());
        stm.setObject(7, purchaser.getPurchaser_contact1());
        stm.setObject(8, purchaser.getPurchaser_contact2());
        stm.setObject(9, purchaser.getPurchaser_repName());
        stm.setObject(10, purchaser.getPurchaser_repContact());
        stm.setObject(11, purchaser.getPurchaser_status());

        return stm.executeUpdate() > 0;

    }

    public boolean updatePurchaser(M_Purchaser purchaser) throws Exception {

        String sql = "UPDATE M_Purchaser SET PURCHASER_NAME=?, PURCHASER_ADDRESS=?, PURCHASER_ACCNO=?, PURCHASER_BANKID=?, PURCHASER_BRANCHID=?, PURCHASER_CONTNO1=?, PURCHASER_CONTNO2=?, PURCHASER_REPNAME=?, PURCHASER_REPCONTNO=?, PURCHASER_STATUS=? WHERE PURCHASER_ID=?";
        Connection connection = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = connection.prepareStatement(sql);

        stm.setObject(1, purchaser.getPurchaser_name());
        stm.setObject(2, purchaser.getPurchaser_address());
        stm.setObject(3, purchaser.getPurchaser_accountNo());
        stm.setObject(4, purchaser.getPurchaser_bank_id());
        stm.setObject(5, purchaser.getPurchaser_branch_id());
        stm.setObject(6, purchaser.getPurchaser_contact1());
        stm.setObject(7, purchaser.getPurchaser_contact2());
        stm.setObject(8, purchaser.getPurchaser_repName());
        stm.setObject(9, purchaser.getPurchaser_repContact());
        stm.setObject(10, purchaser.getPurchaser_status());
        stm.setObject(11, purchaser.getPurchaser_id());

        return stm.executeUpdate() > 0;

    }

    public boolean deletePurchaser(int id) throws Exception {

        String sql = "DELETE FROM M_Purchaser WHERE PURCHASER_ID=?";
        Connection connection = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = connection.prepareStatement(sql);

        stm.setObject(1, id);

        return stm.executeUpdate() > 0;

    }

    public M_Purchaser searchPurchaser(int id) throws Exception {

        String sql = "SELECT * FROM M_Purchaser WHERE PURCHASER_ID=?";
        Connection connection = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = connection.prepareStatement(sql);

        stm.setObject(1, id);

        ResultSet rst = stm.executeQuery();
        M_Purchaser purchaser = null;
        if (rst.next()) {
            purchaser = new M_Purchaser(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getInt(5), rst.getInt(6), rst.getString(7), rst.getString(8), rst.getString(9), rst.getString(10), rst.getString(11));
        }
        return purchaser;

    }

    public M_Purchaser searchPurchaser(String name) throws Exception {

        String sql = "SELECT * FROM M_Purchaser WHERE PURCHASER_NAME=?";
        Connection connection = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = connection.prepareStatement(sql);

        stm.setObject(1, name);

        ResultSet rst = stm.executeQuery();
        M_Purchaser purchaser = null;
        if (rst.next()) {
            purchaser = new M_Purchaser(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getInt(5), rst.getInt(6), rst.getString(7), rst.getString(8), rst.getString(9), rst.getString(10), rst.getString(11));
        }
        return purchaser;

    }

    public List<M_Purchaser> getAllM_Purchasers() throws Exception {

        String sql = "SELECT * FROM M_Purchaser";
        Connection connection = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = connection.prepareStatement(sql);
        ResultSet rst = stm.executeQuery();

        List<M_Purchaser> purchasers = new ArrayList<>();
        while (rst.next()) {
            if (rst.getInt(1) != 0) {
                M_Purchaser purchaser = new M_Purchaser(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getInt(5), rst.getInt(6), rst.getString(7), rst.getString(8), rst.getString(9), rst.getString(10), rst.getString(11));
                purchasers.add(purchaser);
            }
        }
        return purchasers;

    }

    public List<M_Purchaser> getAllPurchasersByLetter(String phrase) throws Exception {

        String sql = "SELECT * FROM M_Purchaser WHERE PURCHASER_NAME LIKE '" + phrase + "%'";
        Connection connection = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = connection.prepareStatement(sql);
        ResultSet rst = stm.executeQuery();

        List<M_Purchaser> purchasers = new ArrayList<>();
        while (rst.next()) {
            if (rst.getInt(1) != 0) {
                M_Purchaser purchaser = new M_Purchaser(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getInt(5), rst.getInt(6), rst.getString(7), rst.getString(8), rst.getString(9), rst.getString(10), rst.getString(11));
                purchasers.add(purchaser);
            }
        }
        return purchasers;

    }

}
