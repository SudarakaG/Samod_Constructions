/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.service;

import com.brotherssoft.samodconstructions.dbAccessFactory.DBAccessFactory;
import com.brotherssoft.samodconstructions.dbAccessFactoryImpl.DBAccessFactoryImpl;
import com.brotherssoft.samodconstructions.model.R_AccountType;
import java.util.List;

/**
 *
 * @author gksde
 */
public class R_AccountTypeService {

    private final DBAccessFactory dbAccessFactory;
    
    public R_AccountTypeService() {
        this.dbAccessFactory = new DBAccessFactoryImpl();
    }
    
    public R_AccountType searchAccountType(int id)throws Exception{
        return dbAccessFactory.getAccountTypeDBAccess().searchAccountType(id);
    }
    
    public List<R_AccountType> getAllAccountTypes()throws Exception{
        return dbAccessFactory.getAccountTypeDBAccess().getAllAccountTypes();
    }    
    
    public R_AccountType searchAccountType(String name)throws Exception{
        return dbAccessFactory.getAccountTypeDBAccess().searchAccountType(name);
    }
}
