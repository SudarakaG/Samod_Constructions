/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.controllerfactory;

import com.brotherssoft.samodconstructions.controller.IDController;
import com.brotherssoft.samodconstructions.controller.M_AccountController;
import com.brotherssoft.samodconstructions.controller.M_EmployeeController;
import com.brotherssoft.samodconstructions.controller.M_EquipmentController;
import com.brotherssoft.samodconstructions.controller.M_MainStockController;
import com.brotherssoft.samodconstructions.controller.M_MaterialController;
import com.brotherssoft.samodconstructions.controller.R_BankController;
import com.brotherssoft.samodconstructions.controller.R_BranchController;
import java.rmi.Remote;
import com.brotherssoft.samodconstructions.controller.M_PurchaserController;
import com.brotherssoft.samodconstructions.controller.M_VehicleController;
import com.brotherssoft.samodconstructions.controller.R_AccountTypeController;
import com.brotherssoft.samodconstructions.controller.R_AssetCategoryController;
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
import com.brotherssoft.samodconstructions.controller.R_AssetController;
import com.brotherssoft.samodconstructions.controller.R_UnitController;
import com.brotherssoft.samodconstructions.controller.M_Project_PrimaryController;
import com.brotherssoft.samodconstructions.controller.M_Project_SecondaryController;
import com.brotherssoft.samodconstructions.controller.M_Project_ThirdController;
import com.brotherssoft.samodconstructions.controller.R_ExpenceSubTypeController;
import com.brotherssoft.samodconstructions.controller.R_ExpenceTypeController;
import com.brotherssoft.samodconstructions.controller.R_IncomeSubTypeController;
import com.brotherssoft.samodconstructions.controller.R_IncomeTypeControler;
import com.brotherssoft.samodconstructions.controller.T_AttendanceController;
import com.brotherssoft.samodconstructions.controller.T_CashAllocationController;
import com.brotherssoft.samodconstructions.controller.T_ExpencesController;
import com.brotherssoft.samodconstructions.controller.T_IncomeController;
import com.brotherssoft.samodconstructions.controller.T_RunchartController;
import com.brotherssoft.samodconstructions.controller.T_SiteAllocationController;

/**
 *
 * @author gksde
 */
public interface ControllerFactory extends Remote{
    
    public IDController getIDController()throws Exception;
    public R_BankController getBankController()throws Exception;
    public R_BranchController getBranchController()throws Exception;
    public M_EmployeeController getEmployeeController()throws Exception;
    public M_Project_PrimaryController getPrimaryProjectController()throws Exception;
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
    public R_AssetController getAssetController()throws Exception;
    public R_AssetCategoryController getAssetCategoryController()throws Exception;
    public R_UnitController getUnitController()throws Exception;
    public M_EquipmentController getEquipmentController()throws Exception;
    public M_MaterialController getMaterialController()throws Exception;
    public M_Project_SecondaryController getSecondary_ProjectController()throws Exception;
    public M_Project_ThirdController getThird_ProjectController()throws Exception;
    public T_CashAllocationController getCashAllocationController()throws Exception;
    public M_MainStockController getMainStockController()throws Exception;
    public T_SiteAllocationController getSiteAllocationController()throws Exception;
    public T_RunchartController getRunchartController()throws Exception;
    public T_ExpencesController getExpencesController()throws Exception;
    public R_ExpenceSubTypeController getExpenceSubTypeController()throws Exception;
    public R_ExpenceTypeController getExpenceTypeController()throws Exception;
    public R_IncomeSubTypeController getIncomeSubTypeController()throws Exception;
    public R_IncomeTypeControler getIncomeTypeControler()throws Exception;
    public T_IncomeController getIncomeController()throws Exception;
    public T_AttendanceController getAttendanceController()throws Exception;
    
}
