/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.controllerimpl;

import com.brotherssoft.samodconstructions.controller.R_IncomeTypeControler;
import com.brotherssoft.samodconstructions.model.R_IncomeType;
import com.brotherssoft.samodconstructions.servicefactory.ServiceFactory;
import com.brotherssoft.samodconstructions.servicefactoryimpl.ServiceFactoryImpl;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

/**
 *
 * @author gksde
 */
public class R_IncomeTypeControllerImpl extends UnicastRemoteObject implements R_IncomeTypeControler{

    private final ServiceFactory sf;
    
    public R_IncomeTypeControllerImpl() throws Exception{
        this.sf = new ServiceFactoryImpl();
    }

    @Override
    public List<R_IncomeType> getAllIncomeTypes() throws Exception {
        return sf.getIncomeTypeService().getAllIncomeTypes();
    }

    @Override
    public R_IncomeType searchIncomeType(int id) throws Exception {
        return sf.getIncomeTypeService().searchIncomeType(id);
    }

    @Override
    public R_IncomeType searchIncomeType(String name) throws Exception {
        return sf.getIncomeTypeService().searchIncomeType(name);
    }
    
}
