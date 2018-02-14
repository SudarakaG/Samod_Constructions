/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.custom;

import com.brotherssoft.samodconstructions.serverconnector.ServerConnector;
import java.text.NumberFormat;

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
    
    public static String getNewIDWithPrefix(String tableName, String colName,String prefix) throws Exception {
        String lastId = ServerConnector.getServerConnetor().getIDController().getLastIDWithPrefix(tableName, colName);
        if (lastId != null) {
            int id = Integer.parseInt(lastId.split(prefix)[1]);
            id++;
            NumberFormat numberFormat = NumberFormat.getIntegerInstance();
            numberFormat.setMinimumIntegerDigits(1);
            numberFormat.setGroupingUsed(false);
            String newID = numberFormat.format(id);
            return prefix + newID;
        } else {
            return prefix+"1";

        }
    }
}
