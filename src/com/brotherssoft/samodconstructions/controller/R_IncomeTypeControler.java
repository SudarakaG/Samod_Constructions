/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.controller;

import com.brotherssoft.samodconstructions.model.R_IncomeType;
import java.rmi.Remote;
import java.util.List;

/**
 *
 * @author gksde
 */
public interface R_IncomeTypeControler extends Remote{
    public List<R_IncomeType> getAllIncomeTypes()throws Exception;
    public R_IncomeType searchIncomeType(int id)throws Exception;
    public R_IncomeType searchIncomeType(String name)throws Exception;
}
