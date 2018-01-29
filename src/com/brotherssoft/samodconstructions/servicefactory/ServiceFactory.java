/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.servicefactory;

import com.brotherssoft.samodconstructions.service.IDService;
import com.brotherssoft.samodconstructions.service.M_EmployeeService;
import com.brotherssoft.samodconstructions.service.R_BankService;
import com.brotherssoft.samodconstructions.service.R_BranchService;

/**
 *
 * @author gksde
 */
public interface ServiceFactory {
 
    public IDService getIDService();
    public R_BankService getBankService();
    public R_BranchService getBranchService();
    public M_EmployeeService getEmployeeService();
    
}
