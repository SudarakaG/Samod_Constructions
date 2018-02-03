/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.service;

import com.brotherssoft.samodconstructions.dbAccessFactory.DBAccessFactory;
import com.brotherssoft.samodconstructions.dbAccessFactoryImpl.DBAccessFactoryImpl;
import com.brotherssoft.samodconstructions.model.R_Unit;
import java.util.List;

/**
 *
 * @author gksde
 */
public class R_UnitService {

    private final DBAccessFactory dbaf = new DBAccessFactoryImpl();
    
    public R_UnitService() {
    }
    
    public R_Unit searchUnit(int id)throws Exception{
        return dbaf.getUnitDBAccess().searchUnit(id);
    }
    
    public R_Unit searchUnit(String name)throws Exception{
        return dbaf.getUnitDBAccess().searchUnit(name);
    }
    
    public List<R_Unit> getAllUnits()throws Exception{
        return dbaf.getUnitDBAccess().getAllUnits();
    }
    
}
