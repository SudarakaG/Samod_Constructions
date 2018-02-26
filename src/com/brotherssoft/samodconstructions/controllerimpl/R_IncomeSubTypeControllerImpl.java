/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.controllerimpl;

import com.brotherssoft.samodconstructions.controller.R_IncomeSubTypeController;
import com.brotherssoft.samodconstructions.model.R_IncomeSubType;
import com.brotherssoft.samodconstructions.servicefactory.ServiceFactory;
import com.brotherssoft.samodconstructions.servicefactoryimpl.ServiceFactoryImpl;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

/**
 *
 * @author gksde
 */
public class R_IncomeSubTypeControllerImpl extends UnicastRemoteObject implements R_IncomeSubTypeController{

    private final ServiceFactory sf;
    
    public R_IncomeSubTypeControllerImpl() throws Exception{
        this.sf = new ServiceFactoryImpl();
    }

    @Override
    public List<R_IncomeSubType> getAllIncomeSubTypes() throws Exception {
        return sf.getIncomeSubTypeService().getAllIncomeSubTypes();
    }

    @Override
    public R_IncomeSubType searchIncomeSubType(int id) throws Exception {
        return sf.getIncomeSubTypeService().searchIncomeSubType(id);
    }

    @Override
    public R_IncomeSubType searchIncomeSubType(String name) throws Exception {
        return sf.getIncomeSubTypeService().searchIncomeSubType(name);
    }
    
}
