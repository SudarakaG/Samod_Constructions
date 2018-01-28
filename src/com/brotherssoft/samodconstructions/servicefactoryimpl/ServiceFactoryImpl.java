/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.servicefactoryimpl;

import com.brotherssoft.samodconstructions.service.IDService;
import com.brotherssoft.samodconstructions.service.R_BankService;
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
    
}
