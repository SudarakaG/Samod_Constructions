/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.service;

import com.brotherssoft.samodconstructions.dbAccessFactory.DBAccessFactory;
import com.brotherssoft.samodconstructions.dbAccessFactoryImpl.DBAccessFactoryImpl;
import com.brotherssoft.samodconstructions.model.R_IncomeSubType;
import java.util.List;

/**
 *
 * @author gksde
 */
public class R_IncomeSubTypeService {
    private final DBAccessFactory dbaf;
    public R_IncomeSubTypeService() {
        this.dbaf = new DBAccessFactoryImpl();
    }
    
    public List<R_IncomeSubType> getAllIncomeSubTypes()throws Exception{
        return dbaf.getIncomeSubTypeDBAccess().getAllIncomeSubTypes();
    }
    
    public R_IncomeSubType searchIncomeSubType(int id)throws Exception{
        return dbaf.getIncomeSubTypeDBAccess().searchIncomeSubType(id);
    }
    
    public R_IncomeSubType searchIncomeSubType(String name)throws Exception{
        return dbaf.getIncomeSubTypeDBAccess().searchIncomeSubType(name);
    }
}
