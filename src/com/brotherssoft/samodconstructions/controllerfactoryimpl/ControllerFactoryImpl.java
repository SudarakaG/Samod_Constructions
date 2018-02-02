/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.controllerfactoryimpl;

import com.brotherssoft.samodconstructions.controller.IDController;
import com.brotherssoft.samodconstructions.controller.M_AccountController;
import com.brotherssoft.samodconstructions.controller.M_EmployeeController;
import com.brotherssoft.samodconstructions.controller.M_Primary_ProjectController;
import com.brotherssoft.samodconstructions.controller.M_PurchaserController;
import com.brotherssoft.samodconstructions.controller.M_VehicleController;
import com.brotherssoft.samodconstructions.controller.R_AccountTypeController;
import com.brotherssoft.samodconstructions.controller.R_BankController;
import com.brotherssoft.samodconstructions.controller.R_BranchController;
import com.brotherssoft.samodconstructions.controller.R_DesignationController;
import com.brotherssoft.samodconstructions.controller.R_FuelTypeController;
import com.brotherssoft.samodconstructions.controller.R_JobTypeController;
import com.brotherssoft.samodconstructions.controller.R_PaymentModeController;
import com.brotherssoft.samodconstructions.controller.R_ProjectGradeController;
import com.brotherssoft.samodconstructions.controller.R_ProjectSpecialityController;
import com.brotherssoft.samodconstructions.controller.R_ProjectTypeController;
import com.brotherssoft.samodconstructions.controller.R_SalaryTypeController;
import com.brotherssoft.samodconstructions.controller.R_VehivleTypeController;
import com.brotherssoft.samodconstructions.controller.R_WorkController;
import com.brotherssoft.samodconstructions.controllerfactory.ControllerFactory;
import com.brotherssoft.samodconstructions.controllerimpl.IDControllerImpl;
import com.brotherssoft.samodconstructions.controllerimpl.M_AccountControllerImpl;
import com.brotherssoft.samodconstructions.controllerimpl.M_EmployeeControllerImpl;
import com.brotherssoft.samodconstructions.controllerimpl.M_Primary_ProjectControllerImpl;
import com.brotherssoft.samodconstructions.controllerimpl.M_PurchaserControllerImpl;
import com.brotherssoft.samodconstructions.controllerimpl.M_VehicleControllerImpl;
import com.brotherssoft.samodconstructions.controllerimpl.R_AccountTypeControllerImpl;
import com.brotherssoft.samodconstructions.controllerimpl.R_BankControllerImpl;
import com.brotherssoft.samodconstructions.controllerimpl.R_BranchControllerImpl;
import com.brotherssoft.samodconstructions.controllerimpl.R_DesignationControllerImpl;
import com.brotherssoft.samodconstructions.controllerimpl.R_FuelTypeControllerImpl;
import com.brotherssoft.samodconstructions.controllerimpl.R_JobTypeControllerImpl;
import com.brotherssoft.samodconstructions.controllerimpl.R_PaymentModeControllerImpl;
import com.brotherssoft.samodconstructions.controllerimpl.R_ProjectGradeControllerImpl;
import com.brotherssoft.samodconstructions.controllerimpl.R_ProjectSpecialityControllerImpl;
import com.brotherssoft.samodconstructions.controllerimpl.R_ProjectTypeControllerImpl;
import com.brotherssoft.samodconstructions.controllerimpl.R_SalaryTypeControllerImpl;
import com.brotherssoft.samodconstructions.controllerimpl.R_VehicleTypeControllerImpl;
import com.brotherssoft.samodconstructions.controllerimpl.R_WorkControllerImpl;
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

    @Override
    public R_ProjectGradeController getProjectGradeController() throws Exception {
        return new R_ProjectGradeControllerImpl();
    }

    @Override
    public R_ProjectSpecialityController getProjectSpecialityController() throws Exception {
        return new R_ProjectSpecialityControllerImpl();
    }

    @Override
    public R_ProjectTypeController getProjectTypeController() throws Exception {
        return new R_ProjectTypeControllerImpl();
    }

    @Override
    public R_PaymentModeController getPaymentModeController() throws Exception {
        return new R_PaymentModeControllerImpl();
    }

    @Override
    public M_AccountController getAccountController() throws Exception {
        return new M_AccountControllerImpl();
    }

    @Override
    public R_AccountTypeController getAccountTypeController() throws Exception {
        return new R_AccountTypeControllerImpl();
    }

    @Override
    public R_VehivleTypeController getVehivleTypeController() throws Exception {
        return new R_VehicleTypeControllerImpl();
    }

    @Override
    public R_FuelTypeController getFuelTypeController() throws Exception {
        return new R_FuelTypeControllerImpl();
    }

    @Override
    public M_VehicleController getVehicleController() throws Exception {
        return new M_VehicleControllerImpl();
    }

    @Override
    public M_PurchaserController getPurchaserController() throws Exception {
        return new M_PurchaserControllerImpl();
    }

    @Override
    public R_JobTypeController getJobTypeController() throws Exception {
        return new R_JobTypeControllerImpl();
    }

    @Override
    public R_DesignationController getDesignationController() throws Exception {
        return new R_DesignationControllerImpl();
    }

    @Override
    public R_SalaryTypeController getSalaryTypeController() throws Exception {
        return new R_SalaryTypeControllerImpl();
    }

    @Override
    public R_WorkController getWorkController() throws Exception {
        return new R_WorkControllerImpl();
    }
    
}
