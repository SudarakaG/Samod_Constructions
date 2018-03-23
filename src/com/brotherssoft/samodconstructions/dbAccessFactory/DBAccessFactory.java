/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.dbAccessFactory;

import com.brotherssoft.samodconstructions.dbAccess.ID_DBAccess;
import com.brotherssoft.samodconstructions.dbAccess.M_AccountDBAccess;
import com.brotherssoft.samodconstructions.dbAccess.M_EmployeeDBAccess;
import com.brotherssoft.samodconstructions.dbAccess.M_EquipmentDBAccess;
import com.brotherssoft.samodconstructions.dbAccess.M_MainStockDBAccess;
import com.brotherssoft.samodconstructions.dbAccess.M_MaterialDBAccess;
import com.brotherssoft.samodconstructions.dbAccess.M_Project_PrimaryDBAccess;
import com.brotherssoft.samodconstructions.dbAccess.M_Project_SecondaryDBAccess;
import com.brotherssoft.samodconstructions.dbAccess.M_Project_ThirdDBAccess;
import com.brotherssoft.samodconstructions.dbAccess.M_PurchaserDBAccess;
import com.brotherssoft.samodconstructions.dbAccess.M_VehicleDBAccess;
import com.brotherssoft.samodconstructions.dbAccess.R_AccountTypeDBAccess;
import com.brotherssoft.samodconstructions.dbAccess.R_AssetCategoryDBAccess;
import com.brotherssoft.samodconstructions.dbAccess.R_AssetDBAccess;
import com.brotherssoft.samodconstructions.dbAccess.R_BankDBAccess;
import com.brotherssoft.samodconstructions.dbAccess.R_BranchDBAccess;
import com.brotherssoft.samodconstructions.dbAccess.R_DesignationDBAccess;
import com.brotherssoft.samodconstructions.dbAccess.R_ExpenceSubTypeDBAccess;
import com.brotherssoft.samodconstructions.dbAccess.R_ExpenceTypeDBAccess;
import com.brotherssoft.samodconstructions.dbAccess.R_FuelTypeDBAccess;
import com.brotherssoft.samodconstructions.dbAccess.R_IncomeSubTypeDBAccess;
import com.brotherssoft.samodconstructions.dbAccess.R_IncomeTypeDBAccess;
import com.brotherssoft.samodconstructions.dbAccess.R_JobTypeDBAccess;
import com.brotherssoft.samodconstructions.dbAccess.R_PaymentModeDBAccess;
import com.brotherssoft.samodconstructions.dbAccess.R_ProjectGradeDBAccess;
import com.brotherssoft.samodconstructions.dbAccess.R_ProjectSpecialityDBAccess;
import com.brotherssoft.samodconstructions.dbAccess.R_ProjectTypeDBAccess;
import com.brotherssoft.samodconstructions.dbAccess.R_SalaryTypeDBAccess;
import com.brotherssoft.samodconstructions.dbAccess.R_UnitDBAccess;
import com.brotherssoft.samodconstructions.dbAccess.R_VehicleTypeDBAccess;
import com.brotherssoft.samodconstructions.dbAccess.R_WorkDBAccess;
import com.brotherssoft.samodconstructions.dbAccess.T_AttendanceDBAccess;
import com.brotherssoft.samodconstructions.dbAccess.T_CashAllocationDBAccess;
import com.brotherssoft.samodconstructions.dbAccess.T_ExpencesDBAccess;
import com.brotherssoft.samodconstructions.dbAccess.T_IncomeDBAccess;
import com.brotherssoft.samodconstructions.dbAccess.T_RunchartDBAccess;
import com.brotherssoft.samodconstructions.dbAccess.T_SalaryDBAccess;
import com.brotherssoft.samodconstructions.dbAccess.T_SiteAllocationDBAccess;

/**
 *
 * @author gksde
 */
public interface DBAccessFactory {
    
    public ID_DBAccess getIDAccess();
    public R_BankDBAccess getBankAccess();
    public R_BranchDBAccess getBranchDBAccess();
    public M_EmployeeDBAccess getEmployeeAccess();
    public M_Project_PrimaryDBAccess getPrimary_ProjectDBAccess();
    public R_ProjectGradeDBAccess getProjectGradeDBAccess();
    public R_ProjectSpecialityDBAccess getProjectSpecialityDBAccess();
    public R_ProjectTypeDBAccess getProjectTypeDBAccess();
    public R_PaymentModeDBAccess getPaymentModeDBAccess();
    public M_AccountDBAccess getAccountDBAccess();
    public R_AccountTypeDBAccess getAccountTypeDBAccess();
    public R_VehicleTypeDBAccess getR_VehicleTypeDBAccess();
    public R_FuelTypeDBAccess getFuelTypeDBAccess();
    public M_VehicleDBAccess getVehicleDBAccess();
    public M_PurchaserDBAccess getPurchaserDBAccess();
    public R_JobTypeDBAccess getJobTypeDBAccess();
    public R_DesignationDBAccess getDesignationDBAccess();
    public R_SalaryTypeDBAccess getSalaryTypeDBAccess();
    public R_WorkDBAccess getWorkDBAccess();
    public R_AssetDBAccess getAssetDBAccess();
    public R_AssetCategoryDBAccess getAssetCategoryDBAccess();
    public R_UnitDBAccess getUnitDBAccess();
    public M_EquipmentDBAccess getEquipmentDBAccess();
    public M_MaterialDBAccess getMaterialDBAccess();
    public M_Project_SecondaryDBAccess getSecondaryDBAccess();
    public M_Project_ThirdDBAccess getThirdDBAccess();
    public T_CashAllocationDBAccess getCashAllocationDBAccess();
    public M_MainStockDBAccess getMainStockDBAccess();
    public T_SiteAllocationDBAccess getSiteAllocationDBAccess();
    public T_RunchartDBAccess getRunchartDBAccess();
    public T_ExpencesDBAccess getExpencesDBAccess();
    public R_ExpenceSubTypeDBAccess getExpenceSubTypeDBAccess();
    public R_ExpenceTypeDBAccess getExpenceTypeDBAccess();
    public R_IncomeSubTypeDBAccess getIncomeSubTypeDBAccess();
    public R_IncomeTypeDBAccess getIncomeTypeDBAccess();
    public T_IncomeDBAccess getIncomeDBAccess();
    public T_AttendanceDBAccess getAttendanceDBAccess();
    public T_SalaryDBAccess getSalaryDBAccess();
    
}
