/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.service;

import com.brotherssoft.samodconstructions.dbAccessFactory.DBAccessFactory;
import com.brotherssoft.samodconstructions.dbAccessFactoryImpl.DBAccessFactoryImpl;
import com.brotherssoft.samodconstructions.model.R_VehicleType;
import java.util.List;

/**
 *
 * @author gksde
 */
public class R_VehicleTypeService {

    private final DBAccessFactory dbAccessFactory = new DBAccessFactoryImpl();
    
    public R_VehicleTypeService() {
    }
    
    public R_VehicleType searchVehicleType(int id)throws Exception{
        return dbAccessFactory.getR_VehicleTypeDBAccess().searchVehicleType(id);
    }
    
    public R_VehicleType searchVehicleType(String name)throws Exception{
        return dbAccessFactory.getR_VehicleTypeDBAccess().searchVehicleType(name);
    }
    
    public List<R_VehicleType> getAllVehicleTypes()throws Exception{
        return dbAccessFactory.getR_VehicleTypeDBAccess().getAllVehicleTypes();
    }
}
