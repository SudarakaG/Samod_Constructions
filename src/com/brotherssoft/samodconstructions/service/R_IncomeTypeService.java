/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.service;

import com.brotherssoft.samodconstructions.dbAccessFactory.DBAccessFactory;
import com.brotherssoft.samodconstructions.dbAccessFactoryImpl.DBAccessFactoryImpl;
import com.brotherssoft.samodconstructions.model.R_IncomeType;
import java.util.List;

/**
 *
 * @author gksde
 */
public class R_IncomeTypeService {
    private final DBAccessFactory dbaf;
    public R_IncomeTypeService() {
        this.dbaf = new DBAccessFactoryImpl();
    }
    
    public List<R_IncomeType> getAllIncomeTypes()throws Exception{
        return dbaf.getIncomeTypeDBAccess().getAllIncomeTypes();
    }
    
    public R_IncomeType searchIncomeType(int id)throws Exception{
        return dbaf.getIncomeTypeDBAccess().searchIncomeType(id);
    }
    
    public R_IncomeType searchIncomeType(String name)throws Exception{
        return dbaf.getIncomeTypeDBAccess().searchIncomeType(name);
    }
}
