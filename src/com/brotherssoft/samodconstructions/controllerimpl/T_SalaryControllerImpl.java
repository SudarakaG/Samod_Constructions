/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.controllerimpl;

import com.brotherssoft.samodconstructions.controller.T_SalaryController;
import com.brotherssoft.samodconstructions.model.T_Salary;
import com.brotherssoft.samodconstructions.servicefactory.ServiceFactory;
import com.brotherssoft.samodconstructions.servicefactoryimpl.ServiceFactoryImpl;
import java.rmi.server.UnicastRemoteObject;
import java.util.Date;
import java.util.List;

/**
 *
 * @author gksde
 */
public class T_SalaryControllerImpl extends UnicastRemoteObject implements T_SalaryController{

    private final ServiceFactory sf;
    
    public T_SalaryControllerImpl() throws Exception{
        this.sf = new ServiceFactoryImpl();
    }

    @Override
    public boolean addSalaryDetail(T_Salary salary) throws Exception {
        return sf.getSalaryService().addSalaryDetail(salary);
    }

    @Override
    public boolean updateSalaryDetail(T_Salary salary) throws Exception {
        return sf.getSalaryService().updateSalaryDetail(salary);
    }

    @Override
    public boolean deleteSalaryDetail(Date from, Date to, int empId) throws Exception {
        return sf.getSalaryService().deleteSalaryDetail(from, to, empId);
    }

    @Override
    public List<T_Salary> getAllSalaries() throws Exception {
        return sf.getSalaryService().getAllSalaries();
    }

    @Override
    public T_Salary searchSalaryDetails(Date from, Date to, int empId) throws Exception {
        return sf.getSalaryService().searchSalaryDetails(from, to, empId);
    }

    @Override
    public List<T_Salary> getAllSalaries(Date from, Date to) throws Exception {
        return sf.getSalaryService().getAllSalaries(from, to);
    }
    
    
    
}
