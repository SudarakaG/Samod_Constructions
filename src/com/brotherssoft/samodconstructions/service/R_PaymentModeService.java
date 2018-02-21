/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.service;

import com.brotherssoft.samodconstructions.dbAccessFactory.DBAccessFactory;
import com.brotherssoft.samodconstructions.dbAccessFactoryImpl.DBAccessFactoryImpl;
import com.brotherssoft.samodconstructions.model.R_PaymentMode;
import java.util.List;

/**
 *
 * @author gksde
 */
public class R_PaymentModeService {
    
    private final DBAccessFactory dbaf;

    public R_PaymentModeService() {
        this.dbaf = new DBAccessFactoryImpl();
    }
   
    public R_PaymentMode searchPaymentMode(int id)throws Exception{
        return dbaf.getPaymentModeDBAccess().searchPaymentMode(id);
    }
    
    public List<R_PaymentMode> getAllPaymentModes()throws Exception{
        return dbaf.getPaymentModeDBAccess().getAllPaymentModes();
    }
    
    public R_PaymentMode searchPaymentModeByName(String name)throws Exception{
        return dbaf.getPaymentModeDBAccess().searchPaymentModeByName(name);
    }
    
}
