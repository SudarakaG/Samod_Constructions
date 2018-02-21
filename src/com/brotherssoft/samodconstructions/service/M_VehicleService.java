/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.service;

import com.brotherssoft.samodconstructions.dbAccessFactory.DBAccessFactory;
import com.brotherssoft.samodconstructions.dbAccessFactoryImpl.DBAccessFactoryImpl;
import com.brotherssoft.samodconstructions.model.M_Vehicle;
import java.util.List;

/**
 *
 * @author gksde
 */
public class M_VehicleService {

    private final DBAccessFactory dbaf;
    
    public M_VehicleService() {
        this.dbaf = new DBAccessFactoryImpl();
    }
 
    public boolean addVehicle(M_Vehicle vehicle)throws Exception{
        return dbaf.getVehicleDBAccess().addVehicle(vehicle);
    }
    
    public boolean updateVehicle(M_Vehicle vehicle)throws Exception{
        return dbaf.getVehicleDBAccess().updateVehicle(vehicle);
    }
    
    public boolean deleteVehicle(String id)throws Exception{
        return dbaf.getVehicleDBAccess().deleteVehicle(id);
    }
    
    public M_Vehicle searchVehicle(String id)throws Exception{
        return dbaf.getVehicleDBAccess().searchVehicle(id);
    }
    
    public M_Vehicle searchVehicleByNumber(String regNo)throws Exception{
        return dbaf.getVehicleDBAccess().searchVehicleByNumber(regNo);
    }
    
    public List<M_Vehicle> getAllVehicles()throws Exception{
        return dbaf.getVehicleDBAccess().getAllVehicles();
    }
    
    public List<M_Vehicle> getAllVehiclesByLetter(String phrase)throws Exception{
        return dbaf.getVehicleDBAccess().getAllVehiclesByLetter(phrase);
    }
            
}
