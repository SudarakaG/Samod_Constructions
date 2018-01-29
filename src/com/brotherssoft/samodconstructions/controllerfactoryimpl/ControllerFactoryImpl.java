/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.controllerfactoryimpl;

import com.brotherssoft.samodconstructions.controller.IDController;
import com.brotherssoft.samodconstructions.controller.M_EmployeeController;
import com.brotherssoft.samodconstructions.controller.M_Primary_ProjectController;
import com.brotherssoft.samodconstructions.controller.R_BankController;
import com.brotherssoft.samodconstructions.controller.R_BranchController;
import com.brotherssoft.samodconstructions.controllerfactory.ControllerFactory;
import com.brotherssoft.samodconstructions.controllerimpl.IDControllerImpl;
import com.brotherssoft.samodconstructions.controllerimpl.M_EmployeeControllerImpl;
import com.brotherssoft.samodconstructions.controllerimpl.M_Primary_ProjectControllerImpl;
import com.brotherssoft.samodconstructions.controllerimpl.R_BankControllerImpl;
import com.brotherssoft.samodconstructions.controllerimpl.R_BranchControllerImpl;
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

    @Override
    public IDController getIDController() throws Exception {
        return new IDControllerImpl();
    }

    @Override
    public M_EmployeeController getEmployeeController() throws Exception {
        return new M_EmployeeControllerImpl();
    }

    @Override
    public R_BranchController getBranchController() throws Exception {
        return new R_BranchControllerImpl();
    }

    @Override
    public M_Primary_ProjectController getPrimaryProjectController() throws Exception {
        return new M_Primary_ProjectControllerImpl();
    }
    
}
