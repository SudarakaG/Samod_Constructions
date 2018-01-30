/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.controllerfactory;

import com.brotherssoft.samodconstructions.controller.IDController;
import com.brotherssoft.samodconstructions.controller.M_EmployeeController;
import com.brotherssoft.samodconstructions.controller.R_BankController;
import com.brotherssoft.samodconstructions.controller.R_BranchController;
import java.rmi.Remote;
import com.brotherssoft.samodconstructions.controller.M_Primary_ProjectController;
import com.brotherssoft.samodconstructions.controller.R_PaymentModeController;
import com.brotherssoft.samodconstructions.controller.R_ProjectGradeController;
import com.brotherssoft.samodconstructions.controller.R_ProjectSpecialityController;
import com.brotherssoft.samodconstructions.controller.R_ProjectTypeController;

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
    
}
