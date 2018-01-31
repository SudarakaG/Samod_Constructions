/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.servicefactory;

import com.brotherssoft.samodconstructions.service.IDService;
import com.brotherssoft.samodconstructions.service.M_AccountService;
import com.brotherssoft.samodconstructions.service.M_EmployeeService;
import com.brotherssoft.samodconstructions.service.M_Primary_ProjectService;
import com.brotherssoft.samodconstructions.service.M_PurchaserService;
import com.brotherssoft.samodconstructions.service.M_VehicleService;
import com.brotherssoft.samodconstructions.service.R_AccountTypeService;
import com.brotherssoft.samodconstructions.service.R_BankService;
import com.brotherssoft.samodconstructions.service.R_BranchService;
import com.brotherssoft.samodconstructions.service.R_FuelTypeService;
import com.brotherssoft.samodconstructions.service.R_PaymentModeService;
import com.brotherssoft.samodconstructions.service.R_ProjectGradeService;
import com.brotherssoft.samodconstructions.service.R_ProjectSpecialityService;
import com.brotherssoft.samodconstructions.service.R_ProjectTypeService;
import com.brotherssoft.samodconstructions.service.R_VehicleTypeService;

/**
 *
 * @author gksde
 */
public interface ServiceFactory {
 
    public IDService getIDService();
    public R_BankService getBankService();
    public R_BranchService getBranchService();
    public M_EmployeeService getEmployeeService();
    public M_Primary_ProjectService getPrimary_ProjectService();
    public R_ProjectGradeService getProjectGradeService();
    public R_ProjectSpecialityService getProjectSpecialityService();
    public R_ProjectTypeService getProjectTypeService();
    public R_PaymentModeService getPaymentModeService();
    public M_AccountService getAccountService();
    public R_AccountTypeService getAccountTypeService();
    public R_VehicleTypeService getVehicleTypeService();
    public R_FuelTypeService getFuelTypeService();
    public M_VehicleService getVehicleService();
    public M_PurchaserService getPurchaserService();
    
}
