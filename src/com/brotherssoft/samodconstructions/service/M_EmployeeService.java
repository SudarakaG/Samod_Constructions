/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.service;

import com.brotherssoft.samodconstructions.dbAccessFactory.DBAccessFactory;
import com.brotherssoft.samodconstructions.dbAccessFactoryImpl.DBAccessFactoryImpl;
import com.brotherssoft.samodconstructions.model.M_Employee;

/**
 *
 * @author Akvasoft
 */
public class M_EmployeeService {
    private final DBAccessFactory dbAccessFactory = new DBAccessFactoryImpl();

    public M_EmployeeService() {
    }
    public boolean addEmployee(M_Employee employee) throws Exception{
    
       return dbAccessFactory.getEmployeeAccess().addEmployee(employee);
    }
}
