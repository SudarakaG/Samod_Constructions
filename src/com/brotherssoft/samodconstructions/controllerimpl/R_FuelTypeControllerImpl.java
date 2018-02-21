/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.controllerimpl;

import com.brotherssoft.samodconstructions.controller.R_FuelTypeController;
import com.brotherssoft.samodconstructions.model.R_FuelType;
import com.brotherssoft.samodconstructions.servicefactory.ServiceFactory;
import com.brotherssoft.samodconstructions.servicefactoryimpl.ServiceFactoryImpl;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

/**
 *
 * @author gksde
 */
public class R_FuelTypeControllerImpl extends UnicastRemoteObject implements R_FuelTypeController{

    private final ServiceFactory sf;
    
    public R_FuelTypeControllerImpl() throws Exception{
        this.sf = new ServiceFactoryImpl();
    }

    @Override
    public R_FuelType searchFuelType(int id) throws Exception {
        return sf.getFuelTypeService().searchFuelType(id);
    }

    @Override
    public R_FuelType searchFuelType(String name) throws Exception {
        return sf.getFuelTypeService().searchFuelType(name);
    }

    @Override
    public List<R_FuelType> getAllFuelTypes() throws Exception {
        return sf.getFuelTypeService().getAllFuelTypes();
    }
 
    
    
}
