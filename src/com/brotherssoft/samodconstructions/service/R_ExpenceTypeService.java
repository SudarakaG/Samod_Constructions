/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.service;

import com.brotherssoft.samodconstructions.dbAccessFactory.DBAccessFactory;
import com.brotherssoft.samodconstructions.dbAccessFactoryImpl.DBAccessFactoryImpl;
import com.brotherssoft.samodconstructions.model.R_ExpencesType;
import java.util.List;

/**
 *
 * @author gksde
 */
public class R_ExpenceTypeService {

    private final DBAccessFactory dbaf;
    public R_ExpenceTypeService() {
        this.dbaf = new DBAccessFactoryImpl();
    }
    
    public List<R_ExpencesType> getAllExpencesTypes()throws Exception{
        return dbaf.getExpenceTypeDBAccess().getAllExpenceTypes();
    }
    
    public R_ExpencesType searchExpencesType(int id)throws Exception{
        return dbaf.getExpenceTypeDBAccess().searchExpenceType(id);
    }
    
    public R_ExpencesType searchExpencesType(String name)throws Exception{
        return dbaf.getExpenceTypeDBAccess().searchExpenceType(name);
    }
    
}
