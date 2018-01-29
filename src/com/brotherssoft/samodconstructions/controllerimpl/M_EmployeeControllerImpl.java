/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.controllerimpl;

import com.brotherssoft.samodconstructions.controller.M_EmployeeController;
import com.brotherssoft.samodconstructions.model.M_Employee;
import com.brotherssoft.samodconstructions.servicefactory.ServiceFactory;
import com.brotherssoft.samodconstructions.servicefactoryimpl.ServiceFactoryImpl;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author Akvasoft
 */
public class M_EmployeeControllerImpl extends UnicastRemoteObject implements M_EmployeeController {

    private ServiceFactory sf = new ServiceFactoryImpl();

    public M_EmployeeControllerImpl()throws Exception{}
    @Override
    public boolean add_Employee(M_Employee employee) throws Exception {
        return sf.getEmployeeService().addEmployee(employee);
    }

    
}
