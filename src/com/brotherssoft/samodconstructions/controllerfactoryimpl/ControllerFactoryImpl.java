/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.controllerfactoryimpl;

import com.brotherssoft.samodconstructions.controller.IDController;
import com.brotherssoft.samodconstructions.controller.M_AccountController;
import com.brotherssoft.samodconstructions.controller.M_EmployeeController;
import com.brotherssoft.samodconstructions.controller.M_EquipmentController;
import com.brotherssoft.samodconstructions.controller.M_MainStockController;
import com.brotherssoft.samodconstructions.controller.M_MaterialController;
import com.brotherssoft.samodconstructions.controller.M_PurchaserController;
import com.brotherssoft.samodconstructions.controller.M_VehicleController;
import com.brotherssoft.samodconstructions.controller.R_AccountTypeController;
import com.brotherssoft.samodconstructions.controller.R_AssetCategoryController;
import com.brotherssoft.samodconstructions.controller.R_AssetController;
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
import com.brotherssoft.samodconstructions.controller.R_UnitController;
import com.brotherssoft.samodconstructions.controller.R_VehivleTypeController;
import com.brotherssoft.samodconstructions.controller.R_WorkController;
import com.brotherssoft.samodconstructions.controllerfactory.ControllerFactory;
import com.brotherssoft.samodconstructions.controllerimpl.IDControllerImpl;
import com.brotherssoft.samodconstructions.controllerimpl.M_AccountControllerImpl;
import com.brotherssoft.samodconstructions.controllerimpl.M_EmployeeControllerImpl;
import com.brotherssoft.samodconstructions.controllerimpl.M_EquipmentControllerImpl;
import com.brotherssoft.samodconstructions.controllerimpl.M_MaterialControllerImpl;
import com.brotherssoft.samodconstructions.controllerimpl.M_Project_PrimaryControllerImpl;
import com.brotherssoft.samodconstructions.controllerimpl.M_PurchaserControllerImpl;
import com.brotherssoft.samodconstructions.controllerimpl.M_VehicleControllerImpl;
import com.brotherssoft.samodconstructions.controllerimpl.R_AccountTypeControllerImpl;
import com.brotherssoft.samodconstructions.controllerimpl.R_AssetCategoryControllerImpl;
import com.brotherssoft.samodconstructions.controllerimpl.R_AssetControllerImpl;
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
import com.brotherssoft.samodconstructions.controllerimpl.R_UnitControllerImpl;
import com.brotherssoft.samodconstructions.controllerimpl.R_VehicleTypeControllerImpl;
import com.brotherssoft.samodconstructions.controllerimpl.R_WorkControllerImpl;
import java.rmi.server.UnicastRemoteObject;
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
import com.brotherssoft.samodconstructions.controllerimpl.M_MainStockControllerImpl;
import com.brotherssoft.samodconstructions.controllerimpl.M_Project_SecondaryControllerImpl;
import com.brotherssoft.samodconstructions.controllerimpl.M_Project_ThirdControllerImpl;
import com.brotherssoft.samodconstructions.controllerimpl.R_ExpenceSubTypeControllerImpl;
import com.brotherssoft.samodconstructions.controllerimpl.R_ExpenceTypeControllerImpl;
import com.brotherssoft.samodconstructions.controllerimpl.R_IncomeSubTypeControllerImpl;
import com.brotherssoft.samodconstructions.controllerimpl.R_IncomeTypeControllerImpl;
import com.brotherssoft.samodconstructions.controllerimpl.T_AttendanceControllerImpl;
import com.brotherssoft.samodconstructions.controllerimpl.T_CashAllocationControllerImpl;
import com.brotherssoft.samodconstructions.controllerimpl.T_ExpenceControllerImpl;
import com.brotherssoft.samodconstructions.controllerimpl.T_IncomeControllerImpl;
import com.brotherssoft.samodconstructions.controllerimpl.T_RunchartControllerImpl;
import com.brotherssoft.samodconstructions.controllerimpl.T_SiteAllocationControllerImpl;

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
    public M_Project_PrimaryController getPrimaryProjectController() throws Exception {
        return new M_Project_PrimaryControllerImpl();
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

    @Override
    public R_AssetController getAssetController() throws Exception {
        return new R_AssetControllerImpl();
    }

    @Override
    public R_AssetCategoryController getAssetCategoryController() throws Exception {
        return new R_AssetCategoryControllerImpl();
    }

    @Override
    public R_UnitController getUnitController() throws Exception {
        return new R_UnitControllerImpl();
    }

    @Override
    public M_EquipmentController getEquipmentController() throws Exception {
        return new M_EquipmentControllerImpl();
    }

    @Override
    public M_MaterialController getMaterialController() throws Exception {
        return new M_MaterialControllerImpl();
    }

    @Override
    public M_Project_SecondaryController getSecondary_ProjectController() throws Exception {
        return new M_Project_SecondaryControllerImpl();
    }

    @Override
    public M_Project_ThirdController getThird_ProjectController() throws Exception {
        return new M_Project_ThirdControllerImpl();
    }

    @Override
    public T_CashAllocationController getCashAllocationController() throws Exception {
        return new T_CashAllocationControllerImpl();
    }

    @Override
    public M_MainStockController getMainStockController() throws Exception {
        return new M_MainStockControllerImpl();
    }

    @Override
    public T_SiteAllocationController getSiteAllocationController() throws Exception {
        return new T_SiteAllocationControllerImpl();
    }

    @Override
    public T_RunchartController getRunchartController() throws Exception {
        return new T_RunchartControllerImpl();
    }

    @Override
    public T_ExpencesController getExpencesController() throws Exception {
        return new T_ExpenceControllerImpl();
    }

    @Override
    public R_ExpenceSubTypeController getExpenceSubTypeController() throws Exception {
        return new R_ExpenceSubTypeControllerImpl();
    }

    @Override
    public R_ExpenceTypeController getExpenceTypeController() throws Exception {
        return new R_ExpenceTypeControllerImpl();
    }

    @Override
    public R_IncomeSubTypeController getIncomeSubTypeController() throws Exception {
        return new R_IncomeSubTypeControllerImpl();
    }

    @Override
    public R_IncomeTypeControler getIncomeTypeControler() throws Exception {
        return new R_IncomeTypeControllerImpl();
    }

    @Override
    public T_IncomeController getIncomeController() throws Exception {
        return new T_IncomeControllerImpl();
    }

    @Override
    public T_AttendanceController getAttendanceController() throws Exception {
        return new T_AttendanceControllerImpl();
    }
    
}
