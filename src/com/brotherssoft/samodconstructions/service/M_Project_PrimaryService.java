/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.service;

import com.brotherssoft.samodconstructions.dbAccessFactory.DBAccessFactory;
import com.brotherssoft.samodconstructions.dbAccessFactoryImpl.DBAccessFactoryImpl;
import com.brotherssoft.samodconstructions.model.M_Project_Primary;
import java.util.List;

/**
 *
 * @author gksde
 */
public class M_Project_PrimaryService {
    
    private final DBAccessFactory dbAccessFactory;

    public M_Project_PrimaryService(){
        this.dbAccessFactory = new DBAccessFactoryImpl();
    }
        
    public boolean addPrimaryProject(M_Project_Primary primary)throws Exception{
        return dbAccessFactory.getPrimary_ProjectDBAccess().addPrimaryProject(primary);
    }
    
    public boolean updatePrimaryProject(M_Project_Primary primary)throws Exception{
        return dbAccessFactory.getPrimary_ProjectDBAccess().updatePrimaryProject(primary);
    }
    
    public boolean deletePrimaryProject(int id)throws Exception{
        return dbAccessFactory.getPrimary_ProjectDBAccess().deletePrimaryProject(id);
    }
    
    public M_Project_Primary searchPrimaryProject(int id)throws Exception{
        return dbAccessFactory.getPrimary_ProjectDBAccess().searchPrimaryProject(id);
    }
    
    public List<M_Project_Primary> getAllPrimaryProjects()throws Exception{
        return dbAccessFactory.getPrimary_ProjectDBAccess().getAllPrimaryProjects();
    }
    
    public M_Project_Primary searchPrimaryProjectByName(String name)throws Exception{
        return dbAccessFactory.getPrimary_ProjectDBAccess().searchPrimaryProjectByName(name);
    }
    
    public List<M_Project_Primary> getAllPrimaryProjectsByLetter(String phrase)throws Exception{
        return dbAccessFactory.getPrimary_ProjectDBAccess().getAllPrimaryProjectsByLetter(phrase);
    }
    
}
