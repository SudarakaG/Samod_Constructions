/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.controller;

import com.brotherssoft.samodconstructions.model.R_IncomeSubType;
import java.rmi.Remote;
import java.util.List;

/**
 *
 * @author gksde
 */
public interface R_IncomeSubTypeController extends Remote{
    public List<R_IncomeSubType> getAllIncomeSubTypes()throws Exception;
    public R_IncomeSubType searchIncomeSubType(int id)throws Exception;
    public R_IncomeSubType searchIncomeSubType(String name)throws Exception;
}
