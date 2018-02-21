/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.controllerimpl;

import com.brotherssoft.samodconstructions.controller.R_SalaryTypeController;
import com.brotherssoft.samodconstructions.model.R_SalaryType;
import com.brotherssoft.samodconstructions.servicefactory.ServiceFactory;
import com.brotherssoft.samodconstructions.servicefactoryimpl.ServiceFactoryImpl;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

/**
 *
 * @author gksde
 */
public class R_SalaryTypeControllerImpl extends UnicastRemoteObject implements R_SalaryTypeController{
    
    private final ServiceFactory sf;

    public R_SalaryTypeControllerImpl() throws Exception{
        this.sf = new ServiceFactoryImpl();
    }

    @Override
    public R_SalaryType searchSalaryType(int id) throws Exception {
        return sf.getSalaryTypeService().searchSalaryType(id);
    }

    @Override
    public R_SalaryType searchSalaryType(String name) throws Exception {
        return sf.getSalaryTypeService().searchSalaryType(name);
    }

    @Override
    public List<R_SalaryType> getAllSalaryTypes() throws Exception {
        return sf.getSalaryTypeService().getAllSalaryTypes();
    }
    
    
    
}
