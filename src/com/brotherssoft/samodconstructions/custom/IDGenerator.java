/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.custom;

import com.brotherssoft.samodconstructions.serverconnector.ServerConnector;

/**
 *
 * @author gksde
 */
public class IDGenerator {
    
    public static int getNewID(String tableName, String colName) throws Exception {
        int lastId = ServerConnector.getServerConnetor().getIDController().getLastID(tableName, colName);
        if (lastId != 0) {
            int id = lastId;
            id++;
            
            return id;
        } else {
            return 1;

        }
    }
}
