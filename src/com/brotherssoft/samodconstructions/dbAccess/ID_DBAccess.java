/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.dbAccess;

import com.brotherssoft.samodconstructions.db.DBConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author gksde
 */
public class ID_DBAccess {
    
    public int getLastID(String tableName, String colName) throws Exception {
        String sql = "select " + colName + " from " + tableName + " order by 1 desc limit 1";
        Connection conn = DBConnection.getDBConnection().getConnection();

        Statement stm = conn.createStatement();
        ResultSet rst=stm.executeQuery(sql);
        if (rst.next()) {
            return  rst.getInt(1);
        }
        return 0;  
    }
    
}
