/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.controllerfactoryimpl;

import com.brotherssoft.samodconstructions.controller.R_BankController;
import com.brotherssoft.samodconstructions.controllerfactory.ControllerFactory;
import com.brotherssoft.samodconstructions.controllerimpl.R_BankControllerImpl;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author gksde
 */
public class ControllerFactoryImpl extends UnicastRemoteObject implements ControllerFactory{

    public ControllerFactoryImpl() throws Exception{
        
    }
    
    @Override
    public R_BankController getBankController() throws Exception {
        return new R_BankControllerImpl();
    }
    
}
