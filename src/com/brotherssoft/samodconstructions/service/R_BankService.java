/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.service;

import com.brotherssoft.samodconstructions.dbAccessFactory.DBAccessFactory;
import com.brotherssoft.samodconstructions.dbAccessFactoryImpl.DBAccessFactoryImpl;
import com.brotherssoft.samodconstructions.model.R_Bank;
import java.util.List;

/**
 *
 * @author gksde
 */
public class R_BankService {
    
    private final DBAccessFactory dbAccessFactory;

    public R_BankService() {
        this.dbAccessFactory = new DBAccessFactoryImpl();
    }
    
    public boolean addBank(R_Bank bank)throws Exception{
        return dbAccessFactory.getBankAccess().addBank(bank);
    }
    
    public boolean updateBank(R_Bank bank)throws Exception{
        System.out.println("service ynwaa....");
        return dbAccessFactory.getBankAccess().updateBank(bank);
    }
    
    public boolean deleteBank(int id)throws Exception{
        return dbAccessFactory.getBankAccess().deleteBank(id);
    }
    
    public R_Bank searchBank(int id)throws Exception{
        return dbAccessFactory.getBankAccess().searchBanbk(id);
    }
    
    public List<R_Bank> getAllBanks()throws Exception{
        return dbAccessFactory.getBankAccess().getAllBanks();
    }
    
    public R_Bank searchBankByName(String name)throws Exception{
        return dbAccessFactory.getBankAccess().searchBankByName(name);
    }
    
    public List<R_Bank> getAllBanksByLetter(String phrase)throws Exception{
        return dbAccessFactory.getBankAccess().getAllBanksByLetter(phrase);
    }
}
