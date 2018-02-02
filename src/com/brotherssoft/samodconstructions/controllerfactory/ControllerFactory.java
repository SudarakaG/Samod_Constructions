/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.controllerfactory;

import com.brotherssoft.samodconstructions.controller.IDController;
import com.brotherssoft.samodconstructions.controller.M_AccountController;
import com.brotherssoft.samodconstructions.controller.M_EmployeeController;
import com.brotherssoft.samodconstructions.controller.R_BankController;
import com.brotherssoft.samodconstructions.controller.R_BranchController;
import java.rmi.Remote;
import com.brotherssoft.samodconstructions.controller.M_Primary_ProjectController;
import com.brotherssoft.samodconstructions.controller.M_PurchaserController;
import com.brotherssoft.samodconstructions.controller.M_VehicleController;
import com.brotherssoft.samodconstructions.controller.R_AccountTypeController;
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

/**
 *
 * @author gksde
 */
public interface ControllerFactory extends Remote{
    
    public IDController getIDController()throws Exception;
    public R_BankController getBankController()throws Exception;
    public R_BranchController getBranchController()throws Exception;
    public M_EmployeeController getEmployeeController()throws Exception;
    public M_Primary_ProjectController getPrimaryProjectController()throws Exception;
    public R_ProjectGradeController getProjectGradeController()throws Exception;
    public R_ProjectSpecialityController getProjectSpecialityController()throws Exception;
    public R_ProjectTypeController getProjectTypeController()throws Exception;
    public R_PaymentModeController getPaymentModeController()throws Exception;
    public M_AccountController getAccountController()throws Exception;
    public R_AccountTypeController getAccountTypeController()throws Exception;
    public R_VehivleTypeController getVehivleTypeController()throws Exception;
    public R_FuelTypeController getFuelTypeController()throws Exception;
    public M_VehicleController getVehicleController()throws Exception;
    public M_PurchaserController getPurchaserController()throws Exception;
    public R_JobTypeController getJobTypeController()throws Exception;
    public R_DesignationController getDesignationController()throws Exception;
    public R_SalaryTypeController getSalaryTypeController()throws Exception;
    public R_WorkController getWorkController()throws Exception;
    
}
