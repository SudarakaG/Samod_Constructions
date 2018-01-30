/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.dbAccessFactoryImpl;

import com.brotherssoft.samodconstructions.dbAccess.ID_DBAccess;
import com.brotherssoft.samodconstructions.dbAccess.M_EmployeeDBAccess;
import com.brotherssoft.samodconstructions.dbAccess.M_Primary_ProjectDBAccess;
import com.brotherssoft.samodconstructions.dbAccess.R_BankDBAccess;
import com.brotherssoft.samodconstructions.dbAccess.R_BranchDBAccess;
import com.brotherssoft.samodconstructions.dbAccess.R_PaymentModeDBAccess;
import com.brotherssoft.samodconstructions.dbAccess.R_ProjectGradeDBAccess;
import com.brotherssoft.samodconstructions.dbAccess.R_ProjectSpecialityDBAccess;
import com.brotherssoft.samodconstructions.dbAccess.R_ProjectTypeDBAccess;
import com.brotherssoft.samodconstructions.dbAccessFactory.DBAccessFactory;
import com.brotherssoft.samodconstructions.model.M_Project_Primary;

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

    
    
}
