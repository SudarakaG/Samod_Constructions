/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.controllerfactory;

import com.brotherssoft.samodconstructions.controller.IDController;
import com.brotherssoft.samodconstructions.controller.R_BankController;
import java.io.IOException;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author gksde
 */
public interface ControllerFactory extends Remote{
    
    public IDController getIDController()throws Exception;
    public R_BankController getBankController()throws Exception;
    
}
