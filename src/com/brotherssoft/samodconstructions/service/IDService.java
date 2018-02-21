/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.service;

import com.brotherssoft.samodconstructions.dbAccessFactory.DBAccessFactory;
import com.brotherssoft.samodconstructions.dbAccessFactoryImpl.DBAccessFactoryImpl;

/**
 *
 * @author gksde
 */
public class IDService {
    
    private final DBAccessFactory dbAccessFactory;

    public IDService() {
        this.dbAccessFactory = new DBAccessFactoryImpl();
    }
   
    public int getLastID(String tableName, String colName) throws Exception{
        return dbAccessFactory.getIDAccess().getLastID(tableName, colName);
    }
    
    public String getLastIDWithPrefix(String tableName, String colName) throws Exception{
        return dbAccessFactory.getIDAccess().getLastIDWithPrefix(tableName, colName);
    }
    
}
