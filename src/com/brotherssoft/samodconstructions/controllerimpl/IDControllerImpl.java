/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.controllerimpl;

import com.brotherssoft.samodconstructions.controller.IDController;
import com.brotherssoft.samodconstructions.servicefactory.ServiceFactory;
import com.brotherssoft.samodconstructions.servicefactoryimpl.ServiceFactoryImpl;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author gksde
 */
public class IDControllerImpl extends UnicastRemoteObject implements IDController{

    private final ServiceFactory sf;
    
    public IDControllerImpl() throws Exception{
        this.sf = new ServiceFactoryImpl();
    }

    @Override
    public int getLastID(String tableName, String colName) throws Exception {
        return sf.getIDService().getLastID(tableName, colName);
    }

    @Override
    public String getLastIDWithPrefix(String tableName, String colName) throws Exception {
        return sf.getIDService().getLastIDWithPrefix(tableName, colName);
    }
    
    
    
}
