/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.servicefactoryimpl;

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
import com.brotherssoft.samodconstructions.servicefactory.ServiceFactory;

/**
 *
 * @author gksde
 */
public class ServiceFactoryImpl implements ServiceFactory{

    public ServiceFactoryImpl() {
    }
      
    @Override
    public R_BankService getBankService() {
        return new R_BankService();
    }

    @Override
    public IDService getIDService() {
        return new IDService();
    }

    @Override
    public M_EmployeeService getEmployeeService() {
        return new M_EmployeeService();
    }

    @Override
    public R_BranchService getBranchService() {
        return new R_BranchService();
    }

    @Override
    public M_Project_PrimaryService getPrimary_ProjectService() {
        return new M_Project_PrimaryService();
    }

    @Override
    public R_ProjectGradeService getProjectGradeService() {
        return new R_ProjectGradeService();
    }

    @Override
    public R_ProjectSpecialityService getProjectSpecialityService() {
        return new R_ProjectSpecialityService();
    }

    @Override
    public R_ProjectTypeService getProjectTypeService() {
        return new R_ProjectTypeService();
    }

    @Override
    public R_PaymentModeService getPaymentModeService() {
        return new R_PaymentModeService();
    }

    @Override
    public M_AccountService getAccountService() {
        return new M_AccountService();
    }

    @Override
    public R_AccountTypeService getAccountTypeService() {
        return new R_AccountTypeService();
    }

    @Override
    public R_VehicleTypeService getVehicleTypeService() {
        return new R_VehicleTypeService();
    }

    @Override
    public R_FuelTypeService getFuelTypeService() {
        return new R_FuelTypeService();
    }

    @Override
    public M_VehicleService getVehicleService() {
        return new M_VehicleService();
    }

    @Override
    public M_PurchaserService getPurchaserService() {
        return new M_PurchaserService();
    }

    @Override
    public R_JobTypeService getJobTypeService() {
        return new R_JobTypeService();
    }

    @Override
    public R_DesignationService getDesignationService() {
        return new R_DesignationService();
    }

    @Override
    public R_SalaryTypeService getSalaryTypeService() {
        return new R_SalaryTypeService();
    }

    @Override
    public R_WorkService getWorkService() {
        return new R_WorkService();
    }

    @Override
    public R_AssetService getAssetService() {
        return new R_AssetService();
    }

    @Override
    public R_AssetCategoryService getAssetCategoryService() {
        return new R_AssetCategoryService();
    }

    @Override
    public R_UnitService getUnitService() {
        return new R_UnitService();
    }

    @Override
    public M_EquipmentService getEquipmentService() {
        return new M_EquipmentService();
    }

    @Override
    public M_MaterialService getMaterialService() {
        return new M_MaterialService();
    }

    @Override
    public M_Project_SecondaryService getSecondaryService() {
        return new M_Project_SecondaryService();
    }

    @Override
    public M_Project_ThirdService getThirdService() {
        return new M_Project_ThirdService();
    }
    
}
