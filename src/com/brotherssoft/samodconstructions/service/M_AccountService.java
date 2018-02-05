/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.service;

import com.brotherssoft.samodconstructions.dbAccessFactory.DBAccessFactory;
import com.brotherssoft.samodconstructions.dbAccessFactoryImpl.DBAccessFactoryImpl;
import com.brotherssoft.samodconstructions.model.M_Account;
import java.util.List;

/**
 *
 * @author gksde
 */
public class M_AccountService {
    
    private final DBAccessFactory dbAccessFactory = new DBAccessFactoryImpl();

    public M_AccountService() {
    }
    
    public boolean addAccount(M_Account account)throws Exception{
        return dbAccessFactory.getAccountDBAccess().addAccount(account);
    }
    
    public boolean updateAccount(M_Account account)throws Exception{
        return dbAccessFactory.getAccountDBAccess().updateAccount(account);
    }
    
    public boolean deleteAccount(int id)throws Exception{
        return dbAccessFactory.getAccountDBAccess().deleteAccount(id);
    }
    
    public M_Account searchAccount(int id)throws Exception{
        return dbAccessFactory.getAccountDBAccess().searchAccount(id);
    }
    
    public List<M_Account> getAllAccounts()throws Exception{
        return dbAccessFactory.getAccountDBAccess().getAllAccounts();
    }    
    
    public M_Account searchAccount(String accountNo)throws Exception{
        return dbAccessFactory.getAccountDBAccess().searchAccount(accountNo);
    }
    
    public List<M_Account> getAllAccountsByLetter(String phrase)throws Exception{
        return dbAccessFactory.getAccountDBAccess().getAllAccountsByLetter(phrase);
    }
    
}
