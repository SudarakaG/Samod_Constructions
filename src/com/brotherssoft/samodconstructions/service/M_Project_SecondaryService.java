/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.service;

import com.brotherssoft.samodconstructions.dbAccessFactory.DBAccessFactory;
import com.brotherssoft.samodconstructions.dbAccessFactoryImpl.DBAccessFactoryImpl;
import com.brotherssoft.samodconstructions.model.M_Project_Secondary;
import java.util.List;

/**
 *
 * @author gksde
 */
public class M_Project_SecondaryService {
    
    private final DBAccessFactory dbaf = new DBAccessFactoryImpl();

    public M_Project_SecondaryService() {
    }
    
    public boolean updateSecondary(M_Project_Secondary secondary)throws Exception{
        return dbaf.getSecondaryDBAccess().updateSecondaryProject(secondary);
    }
    
    public boolean deleteSecondary(int id)throws Exception{
        return dbaf.getSecondaryDBAccess().deleteSecondaryProject(id);
    }
    
    public M_Project_Secondary searchSecondary(int id)throws Exception{
        return dbaf.getSecondaryDBAccess().searchSecondaryProject(id);
    }
    
    public M_Project_Secondary searchSecondary(String name)throws Exception{
        return dbaf.getSecondaryDBAccess().searchSecondaryProject(name);
    }
    
    public List<M_Project_Secondary> getAllSecondarys()throws Exception{
        return dbaf.getSecondaryDBAccess().getAllSecondaryProjects();
    }
    
}
