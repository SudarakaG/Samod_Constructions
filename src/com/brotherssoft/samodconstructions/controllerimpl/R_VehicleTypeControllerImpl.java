/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.controllerimpl;

import com.brotherssoft.samodconstructions.controller.R_VehivleTypeController;
import com.brotherssoft.samodconstructions.model.R_VehicleType;
import com.brotherssoft.samodconstructions.servicefactory.ServiceFactory;
import com.brotherssoft.samodconstructions.servicefactoryimpl.ServiceFactoryImpl;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

/**
 *
 * @author gksde
 */
public class R_VehicleTypeControllerImpl extends UnicastRemoteObject implements R_VehivleTypeController{

    private ServiceFactory sf = new ServiceFactoryImpl();
    
    public R_VehicleTypeControllerImpl() throws Exception{
    }

    @Override
    public R_VehicleType searchVehicleType(int id) throws Exception {
        return sf.getVehicleTypeService().searchVehicleType(id);
    }

    @Override
    public R_VehicleType searchVehicleType(String name) throws Exception {
        return sf.getVehicleTypeService().searchVehicleType(name);
    }

    @Override
    public List<R_VehicleType> getAllVehicleTypes() throws Exception {
        return sf.getVehicleTypeService().getAllVehicleTypes();
    }
    
    
    
}
