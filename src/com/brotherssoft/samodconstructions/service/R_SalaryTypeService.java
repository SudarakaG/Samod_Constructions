/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.service;

import com.brotherssoft.samodconstructions.dbAccessFactory.DBAccessFactory;
import com.brotherssoft.samodconstructions.dbAccessFactoryImpl.DBAccessFactoryImpl;
import com.brotherssoft.samodconstructions.model.R_SalaryType;
import java.util.List;

/**
 *
 * @author gksde
 */
public class R_SalaryTypeService {

    private final DBAccessFactory dbaf;
    
    public R_SalaryTypeService() {
        this.dbaf = new DBAccessFactoryImpl();
    }
    
    public R_SalaryType searchSalaryType(int id)throws Exception{
        return dbaf.getSalaryTypeDBAccess().searchSalaryType(id);
    }
    
    public R_SalaryType searchSalaryType(String name)throws Exception{
        return dbaf.getSalaryTypeDBAccess().searchSalaryType(name);
    }
    
    public List<R_SalaryType> getAllSalaryTypes()throws Exception{
        return dbaf.getSalaryTypeDBAccess().getAllSalaryTypes();
    }
    
}
