/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.service;

import com.brotherssoft.samodconstructions.dbAccessFactory.DBAccessFactory;
import com.brotherssoft.samodconstructions.dbAccessFactoryImpl.DBAccessFactoryImpl;
import com.brotherssoft.samodconstructions.model.R_ProjectType;
import java.util.List;

/**
 *
 * @author gksde
 */
public class R_ProjectTypeService {
    
    private final DBAccessFactory dbaf = new DBAccessFactoryImpl();

    public R_ProjectTypeService() {
    }

    
    
    public R_ProjectType searchProjectType(int id)throws Exception{
        return dbaf.getProjectTypeDBAccess().searchProjectType(id);
    }
    
    public List<R_ProjectType> getAllProjectTypes()throws Exception{
        return dbaf.getProjectTypeDBAccess().getAllProjectTypes();
    }
    
    public R_ProjectType searchProjectTypeByName(String name)throws Exception{
        return dbaf.getProjectTypeDBAccess().searchProjectTypeByName(name);
    }
    
}
