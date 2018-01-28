/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.dbAccessFactoryImpl;

import com.brotherssoft.samodconstructions.dbAccess.ID_DBAccess;
import com.brotherssoft.samodconstructions.dbAccess.R_BankDBAccess;
import com.brotherssoft.samodconstructions.dbAccessFactory.DBAccessFactory;

/**
 *
 * @author gksde
 */
public class DBAccessFactoryImpl implements DBAccessFactory{

    public DBAccessFactoryImpl() {
    }

    
    
    @Override
    public R_BankDBAccess getBankAccess() {
        return new R_BankDBAccess();
    }

    @Override
    public ID_DBAccess getIDAccess() {
        return new ID_DBAccess();
    }
    
}
