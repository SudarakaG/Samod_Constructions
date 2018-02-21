/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.controllerimpl;

import com.brotherssoft.samodconstructions.controller.R_UnitController;
import com.brotherssoft.samodconstructions.model.R_Unit;
import com.brotherssoft.samodconstructions.servicefactory.ServiceFactory;
import com.brotherssoft.samodconstructions.servicefactoryimpl.ServiceFactoryImpl;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

/**
 *
 * @author gksde
 */
public class R_UnitControllerImpl extends UnicastRemoteObject implements R_UnitController{

    private final ServiceFactory sf;
    
    public R_UnitControllerImpl() throws Exception{
        this.sf = new ServiceFactoryImpl();
    }

    @Override
    public R_Unit searchUnit(int id) throws Exception {
        return sf.getUnitService().searchUnit(id);
    }

    @Override
    public R_Unit searchUnit(String name) throws Exception {
        return sf.getUnitService().searchUnit(name);
    }

    @Override
    public List<R_Unit> getAllUnits() throws Exception {
        return sf.getUnitService().getAllUnits();
    }
    
    
    
}
