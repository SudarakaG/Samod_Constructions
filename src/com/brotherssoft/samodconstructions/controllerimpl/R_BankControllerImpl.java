/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.controllerimpl;

import com.brotherssoft.samodconstructions.controller.R_BankController;
import com.brotherssoft.samodconstructions.model.R_Bank;
import com.brotherssoft.samodconstructions.servicefactory.ServiceFactory;
import com.brotherssoft.samodconstructions.servicefactoryimpl.ServiceFactoryImpl;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

/**
 *
 * @author gksde
 */
public class R_BankControllerImpl extends UnicastRemoteObject implements R_BankController{

    private ServiceFactory sf = new ServiceFactoryImpl();
    
    public R_BankControllerImpl() throws Exception{
    }

    @Override
    public boolean addBank(R_Bank bank) throws Exception {
        return sf.getBankService().addBank(bank);
    }

    @Override
    public boolean updateBank(R_Bank bank) throws Exception {
        System.out.println("controller impl yanwa...");
        return sf.getBankService().updateBank(bank);
    }

    @Override
    public boolean deleteBank(int bankId) throws Exception {
        return sf.getBankService().deleteBank(bankId);
    }

    @Override
    public R_Bank searchBank(int bankId) throws Exception {
        return sf.getBankService().searchBank(bankId);
    }

    @Override
    public List<R_Bank> getAllBanks() throws Exception {
        return sf.getBankService().getAllBanks();
    }

    @Override
    public R_Bank searchBankByName(String name) throws Exception {
        return sf.getBankService().searchBankByName(name);
    }
    
    
    
    
}
