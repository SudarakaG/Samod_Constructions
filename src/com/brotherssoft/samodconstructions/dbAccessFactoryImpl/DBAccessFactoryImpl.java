/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.dbAccessFactoryImpl;

import com.brotherssoft.samodconstructions.dbAccess.ID_DBAccess;
import com.brotherssoft.samodconstructions.dbAccess.M_AccountDBAccess;
import com.brotherssoft.samodconstructions.dbAccess.M_EmployeeDBAccess;
import com.brotherssoft.samodconstructions.dbAccess.M_Primary_ProjectDBAccess;
import com.brotherssoft.samodconstructions.dbAccess.M_PurchaserDBAccess;
import com.brotherssoft.samodconstructions.dbAccess.M_VehicleDBAccess;
import com.brotherssoft.samodconstructions.dbAccess.R_AccountTypeDBAccess;
import com.brotherssoft.samodconstructions.dbAccess.R_BankDBAccess;
import com.brotherssoft.samodconstructions.dbAccess.R_BranchDBAccess;
import com.brotherssoft.samodconstructions.dbAccess.R_FuelTypeDBAccess;
import com.brotherssoft.samodconstructions.dbAccess.R_PaymentModeDBAccess;
import com.brotherssoft.samodconstructions.dbAccess.R_ProjectGradeDBAccess;
import com.brotherssoft.samodconstructions.dbAccess.R_ProjectSpecialityDBAccess;
import com.brotherssoft.samodconstructions.dbAccess.R_ProjectTypeDBAccess;
import com.brotherssoft.samodconstructions.dbAccess.R_VehicleTypeDBAccess;
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
    public M_Primary_ProjectDBAccess getPrimary_ProjectDBAccess() {
        return new M_Primary_ProjectDBAccess();
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

    
    
}
