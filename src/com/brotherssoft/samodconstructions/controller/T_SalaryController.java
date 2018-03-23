/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.controller;

import com.brotherssoft.samodconstructions.model.T_Salary;
import java.rmi.Remote;
import java.util.Date;
import java.util.List;

/**
 *
 * @author gksde
 */
public interface T_SalaryController extends Remote{
    
    public boolean addSalaryDetail(T_Salary salary)throws Exception;
    public boolean updateSalaryDetail(T_Salary salary)throws Exception;
    public boolean deleteSalaryDetail(Date from,Date to,int empId)throws Exception;
    //public T_Salary searchSalaryDetails(int salId)throws Exception;
    public List<T_Salary> getAllSalaries()throws Exception;
    
    public T_Salary searchSalaryDetails(Date from,Date to,int empId)throws Exception;
    public List<T_Salary> getAllSalaries(Date from,Date to)throws Exception;
    
}
