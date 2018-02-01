/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.controller;

import com.brotherssoft.samodconstructions.model.M_Employee;
import java.rmi.Remote;
import java.util.List;

/**
 *
 * @author Akvasoft
 */
public interface M_EmployeeController extends Remote{
    
    public boolean addEmployee(M_Employee employee) throws Exception;
    public boolean updateEmployee(M_Employee employee)throws Exception;
    public boolean deleteEmployee(int id)throws Exception;
    public M_Employee searchEmployee(int id)throws Exception;
    public M_Employee searchEmployee(String name)throws Exception;
    public M_Employee searchEmployeeByNIC(String nic)throws Exception;
    public List<M_Employee> getAllEmployees()throws Exception;
    
}
