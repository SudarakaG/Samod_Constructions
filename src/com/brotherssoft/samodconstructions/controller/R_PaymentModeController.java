/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.controller;

import com.brotherssoft.samodconstructions.model.R_PaymentMode;
import java.rmi.Remote;
import java.util.List;

/**
 *
 * @author gksde
 */
public interface R_PaymentModeController extends Remote{
    
    public R_PaymentMode searchPaymentMode(int id)throws Exception;
    public List<R_PaymentMode> getAllPaymentModes()throws Exception;
    public R_PaymentMode searPaymentMode(String name)throws Exception;
    
}
