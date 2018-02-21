/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.service;

import com.brotherssoft.samodconstructions.dbAccessFactory.DBAccessFactory;
import com.brotherssoft.samodconstructions.dbAccessFactoryImpl.DBAccessFactoryImpl;
import com.brotherssoft.samodconstructions.model.R_FuelType;
import java.util.List;

/**
 *
 * @author gksde
 */
public class R_FuelTypeService {

    private final DBAccessFactory dbaf;
    
    public R_FuelTypeService() {
        this.dbaf = new DBAccessFactoryImpl();
    }
 
    public R_FuelType searchFuelType(int id)throws Exception{
        return dbaf.getFuelTypeDBAccess().searchFuelType(id);
    }
    
    public R_FuelType searchFuelType(String name)throws Exception{
        return dbaf.getFuelTypeDBAccess().searchFuelType(name);
    }
    
    public List<R_FuelType> getAllFuelTypes()throws Exception{
        return dbaf.getFuelTypeDBAccess().getAllFuelTypes();
    }
    
}
