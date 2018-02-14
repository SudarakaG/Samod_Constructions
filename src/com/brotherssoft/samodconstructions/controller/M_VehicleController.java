/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.controller;

import com.brotherssoft.samodconstructions.model.M_Vehicle;
import java.rmi.Remote;
import java.util.List;

/**
 *
 * @author gksde
 */
public interface M_VehicleController extends Remote{
    
    public boolean addVehivle(M_Vehicle vehicle)throws Exception;
    public boolean updateVehicle(M_Vehicle vehicle)throws Exception;
    public boolean deleteVehicle(String id)throws Exception;
    public M_Vehicle searchVehicle(String id)throws Exception;
    public M_Vehicle searchVehicleByNumber(String regNo)throws Exception;
    public List<M_Vehicle> getAllVehicles()throws Exception;
    public List<M_Vehicle> getAllVehiclesByLetter(String phrase)throws Exception;
    
}
