/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.controller;

import com.brotherssoft.samodconstructions.model.M_Account;
import java.rmi.Remote;
import java.util.List;

/**
 *
 * @author gksde
 */
public interface M_AccountController extends Remote{
    
    public boolean addAccount(M_Account account)throws Exception;
    public boolean updateAccount(M_Account account)throws Exception;
    public boolean deleteAccount(int id)throws Exception;
    public M_Account searchAccount(int id)throws Exception;
    public List<M_Account> getAllAccounts()throws Exception;
    
    public M_Account searchAccount(String accountNo)throws Exception;
    
}
