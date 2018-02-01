/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.controller;

import com.brotherssoft.samodconstructions.model.R_SalaryType;
import java.rmi.Remote;
import java.util.List;

/**
 *
 * @author gksde
 */
public interface R_SalaryTypeController extends Remote{
    
    public R_SalaryType searchSalaryType(int id)throws Exception;
    public R_SalaryType searchSalaryType(String name)throws Exception;
    public List<R_SalaryType> getAllSalaryTypes()throws Exception;
    
}
