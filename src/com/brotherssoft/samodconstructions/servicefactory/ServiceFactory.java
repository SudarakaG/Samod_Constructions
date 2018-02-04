/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.servicefactory;

import com.brotherssoft.samodconstructions.service.IDService;
import com.brotherssoft.samodconstructions.service.M_AccountService;
import com.brotherssoft.samodconstructions.service.M_EmployeeService;
import com.brotherssoft.samodconstructions.service.M_EquipmentService;
import com.brotherssoft.samodconstructions.service.M_MaterialService;
import com.brotherssoft.samodconstructions.service.M_Project_PrimaryService;
import com.brotherssoft.samodconstructions.service.M_Project_SecondaryService;
import com.brotherssoft.samodconstructions.service.M_Project_ThirdService;
import com.brotherssoft.samodconstructions.service.M_PurchaserService;
import com.brotherssoft.samodconstructions.service.M_VehicleService;
import com.brotherssoft.samodconstructions.service.R_AccountTypeService;
import com.brotherssoft.samodconstructions.service.R_AssetCategoryService;
import com.brotherssoft.samodconstructions.service.R_AssetService;
import com.brotherssoft.samodconstructions.service.R_BankService;
import com.brotherssoft.samodconstructions.service.R_BranchService;
import com.brotherssoft.samodconstructions.service.R_DesignationService;
import com.brotherssoft.samodconstructions.service.R_FuelTypeService;
import com.brotherssoft.samodconstructions.service.R_JobTypeService;
import com.brotherssoft.samodconstructions.service.R_PaymentModeService;
import com.brotherssoft.samodconstructions.service.R_ProjectGradeService;
import com.brotherssoft.samodconstructions.service.R_ProjectSpecialityService;
import com.brotherssoft.samodconstructions.service.R_ProjectTypeService;
import com.brotherssoft.samodconstructions.service.R_SalaryTypeService;
import com.brotherssoft.samodconstructions.service.R_UnitService;
import com.brotherssoft.samodconstructions.service.R_VehicleTypeService;
import com.brotherssoft.samodconstructions.service.R_WorkService;

/**
 *
 * @author gksde
 */
public interface ServiceFactory {
 
    public IDService getIDService();
    public R_BankService getBankService();
    public R_BranchService getBranchService();
    public M_EmployeeService getEmployeeService();
    public M_Project_PrimaryService getPrimary_ProjectService();
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
    public R_JobTypeService getJobTypeService();
    public R_DesignationService getDesignationService();
    public R_SalaryTypeService getSalaryTypeService();
    public R_WorkService getWorkService();
    public R_AssetService getAssetService();
    public R_AssetCategoryService getAssetCategoryService();
    public R_UnitService getUnitService();
    public M_EquipmentService getEquipmentService();
    public M_MaterialService getMaterialService();
    public M_Project_SecondaryService getSecondaryService();
    public M_Project_ThirdService getThirdService();
    
}
