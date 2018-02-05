/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.controllerimpl;

import com.brotherssoft.samodconstructions.controller.M_AccountController;
import com.brotherssoft.samodconstructions.model.M_Account;
import com.brotherssoft.samodconstructions.servicefactory.ServiceFactory;
import com.brotherssoft.samodconstructions.servicefactoryimpl.ServiceFactoryImpl;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

/**
 *
 * @author gksde
 */
public class M_AccountControllerImpl extends UnicastRemoteObject implements M_AccountController{

    private ServiceFactory sf = new ServiceFactoryImpl();
    
    public M_AccountControllerImpl() throws Exception{
    }

    @Override
    public boolean addAccount(M_Account account) throws Exception {
        return sf.getAccountService().addAccount(account);
    }

    @Override
    public boolean updateAccount(M_Account account) throws Exception {
        return sf.getAccountService().updateAccount(account);
    }

    @Override
    public boolean deleteAccount(int id) throws Exception {
        return sf.getAccountService().deleteAccount(id);
    }

    @Override
    public M_Account searchAccount(int id) throws Exception {
        return sf.getAccountService().searchAccount(id);
    }

    @Override
    public List<M_Account> getAllAccounts() throws Exception {
        return sf.getAccountService().getAllAccounts();
    }

    @Override
    public M_Account searchAccount(String accountNo) throws Exception {
        return sf.getAccountService().searchAccount(accountNo);
    }

    @Override
    public List<M_Account> getAllAccountsByLetter(String phrase) throws Exception {
        return sf.getAccountService().getAllAccountsByLetter(phrase);
    }
    
    
}
