/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.dbAccessFactory;

import com.brotherssoft.samodconstructions.dbAccess.ID_DBAccess;
import com.brotherssoft.samodconstructions.dbAccess.M_EmployeeDBAccess;
import com.brotherssoft.samodconstructions.dbAccess.R_BankDBAccess;
import com.brotherssoft.samodconstructions.dbAccess.R_BranchDBAccess;

/**
 *
 * @author gksde
 */
public interface DBAccessFactory {
    
    public ID_DBAccess getIDAccess();
    public R_BankDBAccess getBankAccess();
    public R_BranchDBAccess getBranchDBAccess();
    public M_EmployeeDBAccess getEmployeeAccess();
    
}
