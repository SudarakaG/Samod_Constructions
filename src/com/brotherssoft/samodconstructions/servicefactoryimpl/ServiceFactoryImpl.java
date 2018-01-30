/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.servicefactoryimpl;

import com.brotherssoft.samodconstructions.service.IDService;
import com.brotherssoft.samodconstructions.service.M_EmployeeService;
import com.brotherssoft.samodconstructions.service.M_Primary_ProjectService;
import com.brotherssoft.samodconstructions.service.R_BankService;
import com.brotherssoft.samodconstructions.service.R_BranchService;
import com.brotherssoft.samodconstructions.service.R_PaymentModeService;
import com.brotherssoft.samodconstructions.service.R_ProjectGradeService;
import com.brotherssoft.samodconstructions.service.R_ProjectSpecialityService;
import com.brotherssoft.samodconstructions.service.R_ProjectTypeService;
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
    public M_Primary_ProjectService getPrimary_ProjectService() {
        return new M_Primary_ProjectService();
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
    
}
