/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.dbAccessFactoryImpl;

import com.brotherssoft.samodconstructions.dbAccess.ID_DBAccess;
import com.brotherssoft.samodconstructions.dbAccess.M_AccountDBAccess;
import com.brotherssoft.samodconstructions.dbAccess.M_EmployeeDBAccess;
import com.brotherssoft.samodconstructions.dbAccess.M_EquipmentDBAccess;
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
import com.brotherssoft.samodconstructions.dbAccess.R_FuelTypeDBAccess;
import com.brotherssoft.samodconstructions.dbAccess.R_JobTypeDBAccess;
import com.brotherssoft.samodconstructions.dbAccess.R_PaymentModeDBAccess;
import com.brotherssoft.samodconstructions.dbAccess.R_ProjectGradeDBAccess;
import com.brotherssoft.samodconstructions.dbAccess.R_ProjectSpecialityDBAccess;
import com.brotherssoft.samodconstructions.dbAccess.R_ProjectTypeDBAccess;
import com.brotherssoft.samodconstructions.dbAccess.R_SalaryTypeDBAccess;
import com.brotherssoft.samodconstructions.dbAccess.R_UnitDBAccess;
import com.brotherssoft.samodconstructions.dbAccess.R_VehicleTypeDBAccess;
import com.brotherssoft.samodconstructions.dbAccess.R_WorkDBAccess;
import com.brotherssoft.samodconstructions.dbAccessFactory.DBAccessFactory;

/**
 *
 * @author gksde
 */
public class DBAccessFactoryImpl implements DBAccessFactory{

    public DBAccessFactoryImpl() {
    }

    
    
    @Override
    public R_BankDBAccess getBankAccess() {
        return new R_BankDBAccess();
    }

    @Override
    public ID_DBAccess getIDAccess() {
        return new ID_DBAccess();
    }

    @Override
    public M_EmployeeDBAccess getEmployeeAccess() {
        return new M_EmployeeDBAccess();
    }

    @Override
    public R_BranchDBAccess getBranchDBAccess() {
        return new R_BranchDBAccess();
    }

    @Override
    public M_Project_PrimaryDBAccess getPrimary_ProjectDBAccess() {
        return new M_Project_PrimaryDBAccess();
    }

    @Override
    public R_ProjectGradeDBAccess getProjectGradeDBAccess() {
        return new R_ProjectGradeDBAccess();
    }

    @Override
    public R_ProjectSpecialityDBAccess getProjectSpecialityDBAccess() {
        return new R_ProjectSpecialityDBAccess();
    }

    @Override
    public R_ProjectTypeDBAccess getProjectTypeDBAccess() {
        return new R_ProjectTypeDBAccess();
    }

    @Override
    public R_PaymentModeDBAccess getPaymentModeDBAccess() {
        return new R_PaymentModeDBAccess();
    }

    @Override
    public M_AccountDBAccess getAccountDBAccess() {
        return new M_AccountDBAccess();
    }

    @Override
    public R_AccountTypeDBAccess getAccountTypeDBAccess() {
        return new R_AccountTypeDBAccess();
    }

    @Override
    public R_VehicleTypeDBAccess getR_VehicleTypeDBAccess() {
        return new R_VehicleTypeDBAccess();
    }

    @Override
    public R_FuelTypeDBAccess getFuelTypeDBAccess() {
        return new R_FuelTypeDBAccess();
    }

    @Override
    public M_VehicleDBAccess getVehicleDBAccess() {
        return new M_VehicleDBAccess();
    }

    @Override
    public M_PurchaserDBAccess getPurchaserDBAccess() {
        return new M_PurchaserDBAccess();
    }

    @Override
    public R_JobTypeDBAccess getJobTypeDBAccess() {
        return new R_JobTypeDBAccess();
    }

    @Override
    public R_DesignationDBAccess getDesignationDBAccess() {
        return new R_DesignationDBAccess();
    }

    @Override
    public R_SalaryTypeDBAccess getSalaryTypeDBAccess() {
        return new R_SalaryTypeDBAccess();
    }

    @Override
    public R_WorkDBAccess getWorkDBAccess() {
        return new R_WorkDBAccess();
    }

    @Override
    public R_AssetDBAccess getAssetDBAccess() {
        return new R_AssetDBAccess();
    }

    @Override
    public R_AssetCategoryDBAccess getAssetCategoryDBAccess() {
        return new R_AssetCategoryDBAccess();
    }

    @Override
    public R_UnitDBAccess getUnitDBAccess() {
        return new R_UnitDBAccess();
    }

    @Override
    public M_EquipmentDBAccess getEquipmentDBAccess() {
        return new M_EquipmentDBAccess();
    }

    @Override
    public M_MaterialDBAccess getMaterialDBAccess() {
        return new M_MaterialDBAccess();
    }

    @Override
    public M_Project_SecondaryDBAccess getSecondaryDBAccess() {
        return new M_Project_SecondaryDBAccess();
    }

    @Override
    public M_Project_ThirdDBAccess getThirdDBAccess() {
        return new M_Project_ThirdDBAccess();
    }

    
    
}
