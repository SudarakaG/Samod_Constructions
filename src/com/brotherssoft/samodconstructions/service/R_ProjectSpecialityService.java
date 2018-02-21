/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.service;

import com.brotherssoft.samodconstructions.dbAccessFactory.DBAccessFactory;
import com.brotherssoft.samodconstructions.dbAccessFactoryImpl.DBAccessFactoryImpl;
import com.brotherssoft.samodconstructions.model.R_ProjectSpeciality;
import java.util.List;

/**
 *
 * @author gksde
 */
public class R_ProjectSpecialityService {
 
    private final DBAccessFactory dbaf;

    public R_ProjectSpecialityService() {
        this.dbaf = new DBAccessFactoryImpl();
    }

    
    
    public R_ProjectSpeciality searchProjectSpeciality(int id)throws Exception{
        return dbaf.getProjectSpecialityDBAccess().searchProjectSpeciality(id);
    }
    
    public List<R_ProjectSpeciality> getAllProjectSpecialities()throws Exception{
        return dbaf.getProjectSpecialityDBAccess().getAllProjectSpecialities();
    }
    
    public R_ProjectSpeciality searchProjectSpecialityByName(String name)throws Exception{
        return dbaf.getProjectSpecialityDBAccess().searchProjectSpecialityByName(name);
    }
    
}
