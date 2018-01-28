/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.dbAccessFactory;

import com.brotherssoft.samodconstructions.dbAccess.R_BankDBAccess;

/**
 *
 * @author gksde
 */
public interface DBAccessFactory {
    
    public R_BankDBAccess getBankAccess();
    
}
