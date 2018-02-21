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
import java.util.List;

/**
 *
 * @author Akvasoft
 */
public class M_EmployeeControllerImpl extends UnicastRemoteObject implements M_EmployeeController {

    private final ServiceFactory sf;

    public M_EmployeeControllerImpl()throws Exception{this.sf = new ServiceFactoryImpl();
}
    
    @Override
    public boolean addEmployee(M_Employee employee) throws Exception {
        return sf.getEmployeeService().addEmployee(employee);
    }   

    @Override
    public boolean updateEmployee(M_Employee employee) throws Exception {
        return sf.getEmployeeService().updateEmployee(employee);
    }

    @Override
    public boolean deleteEmployee(int id) throws Exception {
        return sf.getEmployeeService().deleteEmployee(id);
    }

    @Override
    public M_Employee searchEmployee(int id) throws Exception {
        return sf.getEmployeeService().searchEmployee(id);
    }

    @Override
    public M_Employee searchEmployee(String name) throws Exception {
        return sf.getEmployeeService().searchEmployee(name);
    }

    @Override
    public M_Employee searchEmployeeByNIC(String nic) throws Exception {
        return sf.getEmployeeService().searchEmployeeByNIC(nic);
    }

    @Override
    public List<M_Employee> getAllEmployees() throws Exception {
        return sf.getEmployeeService().getAllEmployees();
    }

    @Override
    public M_Employee searchBySubContractorId(int subId) throws Exception {
        return sf.getEmployeeService().searchBySubContractorId(subId);
    }

    @Override
    public M_Employee searchByFullName(String fName, String mName, String lName) throws Exception {
        return sf.getEmployeeService().searchByFullName(fName, mName, lName);
    }

    @Override
    public List<M_Employee> getAllEmployeesByLetter(String phrase) throws Exception {
        return sf.getEmployeeService().getAllEmployeesByLetter(phrase);
    }

    
}
