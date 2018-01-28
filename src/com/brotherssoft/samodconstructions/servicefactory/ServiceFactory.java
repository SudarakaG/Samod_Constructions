/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.servicefactory;

import com.brotherssoft.samodconstructions.service.R_BankService;

/**
 *
 * @author gksde
 */
public interface ServiceFactory {
 
    public R_BankService getBankService();
    
}
