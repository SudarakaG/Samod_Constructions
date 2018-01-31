/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.controller;

import com.brotherssoft.samodconstructions.model.R_VehicleType;
import java.rmi.Remote;
import java.util.List;

/**
 *
 * @author gksde
 */
public interface R_VehivleTypeController extends Remote{
 
    public R_VehicleType searchVehicleType(int id)throws Exception;
    public R_VehicleType searchVehicleType(String name)throws Exception;
    public List<R_VehicleType> getAllVehicleTypes()throws Exception;
    
}
