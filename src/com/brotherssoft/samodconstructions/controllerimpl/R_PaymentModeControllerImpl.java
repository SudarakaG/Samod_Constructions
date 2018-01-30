/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.controllerimpl;

import com.brotherssoft.samodconstructions.controller.R_PaymentModeController;
import com.brotherssoft.samodconstructions.model.R_PaymentMode;
import com.brotherssoft.samodconstructions.servicefactory.ServiceFactory;
import com.brotherssoft.samodconstructions.servicefactoryimpl.ServiceFactoryImpl;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

/**
 *
 * @author gksde
 */
public class R_PaymentModeControllerImpl extends UnicastRemoteObject implements R_PaymentModeController{
    
    private ServiceFactory sf = new ServiceFactoryImpl();

    public R_PaymentModeControllerImpl() throws Exception{
    }

    @Override
    public R_PaymentMode searchPaymentMode(int id) throws Exception {
        return sf.getPaymentModeService().searchPaymentMode(id);
    }

    @Override
    public List<R_PaymentMode> getAllPaymentModes() throws Exception {
        return sf.getPaymentModeService().getAllPaymentModes();
    }

    @Override
    public R_PaymentMode searPaymentMode(String name) throws Exception {
        return sf.getPaymentModeService().searchPaymentModeByName(name);
    }
    
    
    
}
