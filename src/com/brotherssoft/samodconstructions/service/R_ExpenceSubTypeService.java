/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.service;

import com.brotherssoft.samodconstructions.dbAccessFactory.DBAccessFactory;
import com.brotherssoft.samodconstructions.dbAccessFactoryImpl.DBAccessFactoryImpl;
import com.brotherssoft.samodconstructions.model.R_ExpencesSubType;
import java.util.List;

/**
 *
 * @author gksde
 */
public class R_ExpenceSubTypeService {
    private final DBAccessFactory dbaf;
    public R_ExpenceSubTypeService() {
        this.dbaf = new DBAccessFactoryImpl();
    }
    
    public List<R_ExpencesSubType> getAllExpencesSubTypes()throws Exception{
        return dbaf.getExpenceSubTypeDBAccess().getAllExpenceSubTypes();
    }
    
    public R_ExpencesSubType searchExpencesSubType(int id)throws Exception{
        return dbaf.getExpenceSubTypeDBAccess().searchExpenceSubType(id);
    }
    
    public R_ExpencesSubType searchExpencesSubType(String name)throws Exception{
        return dbaf.getExpenceSubTypeDBAccess().searchExpenceSubType(name);
    }
}
