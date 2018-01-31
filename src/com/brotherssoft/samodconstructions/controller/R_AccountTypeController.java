/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.controller;

import com.brotherssoft.samodconstructions.model.R_AccountType;
import java.rmi.Remote;
import java.util.List;

/**
 *
 * @author gksde
 */
public interface R_AccountTypeController extends Remote{
 
    public List<R_AccountType> getAllAccountTypes()throws Exception;
    public R_AccountType searchAccountType(int id)throws Exception;
    public R_AccountType searchAccountType(String name)throws Exception;
    
}
