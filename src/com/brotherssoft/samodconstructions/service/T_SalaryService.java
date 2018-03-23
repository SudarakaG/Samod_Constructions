/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.service;

import com.brotherssoft.samodconstructions.dbAccessFactory.DBAccessFactory;
import com.brotherssoft.samodconstructions.dbAccessFactoryImpl.DBAccessFactoryImpl;
import com.brotherssoft.samodconstructions.model.T_Salary;
import java.util.Date;
import java.util.List;

/**
 *
 * @author gksde
 */
public class T_SalaryService {

    private final DBAccessFactory dbaf;
    
    public T_SalaryService() {
        this.dbaf = new DBAccessFactoryImpl();
    }
    
    public boolean addSalaryDetail(T_Salary salary)throws Exception{
        return dbaf.getSalaryDBAccess().addSalaryDetail(salary);
    }
    
    public boolean updateSalaryDetail(T_Salary salary)throws Exception{
        return dbaf.getSalaryDBAccess().updateSalaryDetail(salary);
    }
    
    public boolean deleteSalaryDetail(Date from,Date to,int empId)throws Exception{
        return dbaf.getSalaryDBAccess().deleteSalaryDetail(from, to, empId);
    }
    
    //public T_Salary searchSalaryDetails(int salId)throws Exception;
    
    public List<T_Salary> getAllSalaries()throws Exception{
        return dbaf.getSalaryDBAccess().getAllSalaryDetail();
    }
    
    public T_Salary searchSalaryDetails(Date from,Date to,int empId)throws Exception{
        return dbaf.getSalaryDBAccess().searchSalaryDetail(from, to, empId);
    }
    
    public List<T_Salary> getAllSalaries(Date from,Date to)throws Exception{
        return dbaf.getSalaryDBAccess().getAllSalaryDetail(from, to);
    }
    
}
