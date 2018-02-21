/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.controllerimpl;

import com.brotherssoft.samodconstructions.controller.R_AccountTypeController;
import com.brotherssoft.samodconstructions.model.R_AccountType;
import com.brotherssoft.samodconstructions.servicefactory.ServiceFactory;
import com.brotherssoft.samodconstructions.servicefactoryimpl.ServiceFactoryImpl;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

/**
 *
 * @author gksde
 */
public class R_AccountTypeControllerImpl extends UnicastRemoteObject implements R_AccountTypeController{

    private final ServiceFactory sf;
    
    public R_AccountTypeControllerImpl() throws Exception{
        this.sf = new ServiceFactoryImpl();
    }

    @Override
    public List<R_AccountType> getAllAccountTypes() throws Exception {
        return sf.getAccountTypeService().getAllAccountTypes();
    }

    @Override
    public R_AccountType searchAccountType(int id) throws Exception {
        return sf.getAccountTypeService().searchAccountType(id);
    }

    @Override
    public R_AccountType searchAccountType(String name) throws Exception {
        return sf.getAccountTypeService().searchAccountType(name);
    }
    
    
    
}
