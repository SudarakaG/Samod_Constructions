/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.service;

import com.brotherssoft.samodconstructions.dbAccessFactory.DBAccessFactory;
import com.brotherssoft.samodconstructions.dbAccessFactoryImpl.DBAccessFactoryImpl;
import com.brotherssoft.samodconstructions.model.R_Designation;
import java.util.List;

/**
 *
 * @author gksde
 */
public class R_DesignationService {
    
    private final DBAccessFactory dbaf = new DBAccessFactoryImpl();

    public R_DesignationService() {
    }
    
    public R_Designation searchDesignation(int id)throws Exception{
        return dbaf.getDesignationDBAccess().searchDesignation(id);
    }
    
    public R_Designation searchDesignation(String name)throws Exception{
        return dbaf.getDesignationDBAccess().searchDesignation(name);
    }
    
    public List<R_Designation> getAllDesignations()throws Exception{
        return dbaf.getDesignationDBAccess().getAllDesignations();
    }
    
}
