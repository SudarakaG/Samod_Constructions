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

    private final ServiceFactory sf;
    
    public M_VehicleControllerImpl() throws Exception{
        this.sf = new ServiceFactoryImpl();
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
    public boolean deleteVehicle(String id) throws Exception {
        return sf.getVehicleService().deleteVehicle(id);
    }

    @Override
    public M_Vehicle searchVehicle(String id) throws Exception {
        return sf.getVehicleService().searchVehicle(id);
    }

    @Override
    public M_Vehicle searchVehicleByNumber(String regNo) throws Exception {
        return sf.getVehicleService().searchVehicleByNumber(regNo);
    }

    @Override
    public List<M_Vehicle> getAllVehicles() throws Exception {
        return sf.getVehicleService().getAllVehicles();
    }

    @Override
    public List<M_Vehicle> getAllVehiclesByLetter(String phrase) throws Exception {
        return sf.getVehicleService().getAllVehiclesByLetter(phrase);
    }
    
    
    
}
