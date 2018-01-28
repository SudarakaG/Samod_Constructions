/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.controller;

import com.brotherssoft.samodconstructions.model.R_Bank;
import java.io.IOException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author gksde
 */
public interface R_BankController extends Remote{
    
    public boolean addBank(R_Bank bank)throws Exception;
    public boolean updateBank(R_Bank bank)throws Exception;
    public boolean deleteBank(int bankId)throws Exception;
    public R_Bank searchBank(int bankId)throws Exception;
    public List<R_Bank> getAllBanks()throws Exception;
    public R_Bank searchBankByName(String name)throws Exception;
    
}
