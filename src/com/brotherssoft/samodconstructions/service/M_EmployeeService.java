/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.service;

import com.brotherssoft.samodconstructions.dbAccessFactory.DBAccessFactory;
import com.brotherssoft.samodconstructions.dbAccessFactoryImpl.DBAccessFactoryImpl;
import com.brotherssoft.samodconstructions.model.M_Employee;
import java.util.List;

/**
 *
 * @author Akvasoft
 */
public class M_EmployeeService {
    
    private final DBAccessFactory dbAccessFactory;

    public M_EmployeeService() {
        this.dbAccessFactory = new DBAccessFactoryImpl();
    }
    
    public boolean addEmployee(M_Employee employee) throws Exception{    
       return dbAccessFactory.getEmployeeAccess().addEmployee(employee);
    }
    
    public boolean updateEmployee(M_Employee employee)throws Exception{
        return dbAccessFactory.getEmployeeAccess().updateEmployee(employee);
    }
    
    public boolean deleteEmployee(int id)throws Exception{
        return dbAccessFactory.getEmployeeAccess().deleteEmployee(id);
    }
    
    public M_Employee searchEmployee(int id)throws Exception{
        return dbAccessFactory.getEmployeeAccess().searchEmployee(id);
    }
    
    public M_Employee searchEmployee(String name)throws Exception{
        return dbAccessFactory.getEmployeeAccess().searchEmployee(name);
    }
    
    public M_Employee searchEmployeeByNIC(String nic)throws Exception{
        return dbAccessFactory.getEmployeeAccess().searchEmployeeByNIC(nic);
    }
    
    public List<M_Employee> getAllEmployees()throws Exception{
        return dbAccessFactory.getEmployeeAccess().getAllEmployees();
    }
    
    public M_Employee searchBySubContractorId(int subId)throws Exception{
        return dbAccessFactory.getEmployeeAccess().searchBySubContractorId(subId);
    }
    
    public M_Employee searchByFullName(String fName,String mName,String lName)throws Exception{
        return dbAccessFactory.getEmployeeAccess().searchByFullName(fName, mName, lName);
    }
    
    public List<M_Employee> getAllEmployeesByLetter(String phrase)throws Exception{
        return dbAccessFactory.getEmployeeAccess().getAllEmployeesByLetter(phrase);
    }
    
    public List<M_Employee> getAllLastAddedEmployees()throws Exception{
        return dbAccessFactory.getEmployeeAccess().getAllLastAddedEmployees();
    } 
    
    public List<M_Employee> getAllEmployeesByJobType(int jobTypeId)throws Exception{
        return dbAccessFactory.getEmployeeAccess().getAllEmployeesByJobType(jobTypeId);
    }
}
