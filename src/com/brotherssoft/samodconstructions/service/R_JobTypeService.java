/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.service;

import com.brotherssoft.samodconstructions.dbAccessFactory.DBAccessFactory;
import com.brotherssoft.samodconstructions.dbAccessFactoryImpl.DBAccessFactoryImpl;
import com.brotherssoft.samodconstructions.model.R_JobType;
import java.util.List;

/**
 *
 * @author gksde
 */
public class R_JobTypeService {

    private final DBAccessFactory dbaf = new DBAccessFactoryImpl();
    
    public R_JobTypeService() {
    }
    
    public R_JobType searchJobType(int id)throws Exception{
        return dbaf.getJobTypeDBAccess().searchJobType(id);
    }
    
    public R_JobType searchJobType(String name)throws Exception{
        return dbaf.getJobTypeDBAccess().searchJobType(name);
    }
    
    public List<R_JobType> getAllJobTypes()throws Exception{
        return dbaf.getJobTypeDBAccess().getAllJobTypes();
    }
    
}
