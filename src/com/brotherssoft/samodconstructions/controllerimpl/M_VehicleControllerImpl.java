/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.controllerimpl;

import com.brotherssoft.samodconstructions.controller.M_VehicleController;
import com.brotherssoft.samodconstructions.model.M_Vehicle;
import com.brotherssoft.samodconstructions.servicefactory.ServiceFactory;
import com.brotherssoft.samodconstructions.servicefactoryimpl.ServiceFactoryImpl;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

/**
 *
 * @author gksde
 */
public class M_VehicleControllerImpl extends UnicastRemoteObject implements M_VehicleController{

    private ServiceFactory sf = new ServiceFactoryImpl();
    
    public M_VehicleControllerImpl() throws Exception{
    }

    @Override
    public boolean addVehivle(M_Vehicle vehicle) throws Exception {
        return sf.getVehicleService().addVehicle(vehicle);
    }

    @Override
    public boolean updateVehicle(M_Vehicle vehicle) throws Exception {
        return sf.getVehicleService().updateVehicle(vehicle);
    }

    @Override
    public boolean deleteVehicle(int id) throws Exception {
        return sf.getVehicleService().deleteVehicle(id);
    }

    @Override
    public M_Vehicle searchVehicle(int id) throws Exception {
        return sf.getVehicleService().searchVehicle(id);
    }

    @Override
    public M_Vehicle searchVehicle(String regNo) throws Exception {
        return sf.getVehicleService().searchVehicle(regNo);
    }

    @Override
    public List<M_Vehicle> getAllVehicles() throws Exception {
        return sf.getVehicleService().getAllVehicles();
    }
    
    
    
}