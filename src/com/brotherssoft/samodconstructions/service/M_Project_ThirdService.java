/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.service;

import com.brotherssoft.samodconstructions.dbAccessFactory.DBAccessFactory;
import com.brotherssoft.samodconstructions.dbAccessFactoryImpl.DBAccessFactoryImpl;
import com.brotherssoft.samodconstructions.model.M_Project_Third;
import java.util.List;

/**
 *
 * @author gksde
 */
public class M_Project_ThirdService {
    
    private final DBAccessFactory dbaf;

    public M_Project_ThirdService() {
        this.dbaf = new DBAccessFactoryImpl();
    }
    
    public boolean updateThird(M_Project_Third third)throws Exception{
        return dbaf.getThirdDBAccess().updateThirdProject(third);
    }
    
    public boolean deleteSecondary(int id)throws Exception{
        return dbaf.getThirdDBAccess().deleteThirdProject(id);
    }
    
    public M_Project_Third searchThird(int id)throws Exception{
        return dbaf.getThirdDBAccess().searchThirdProject(id);
    }
    
    public M_Project_Third searchThird(String name)throws Exception{
        return dbaf.getThirdDBAccess().searchThirdProject(name);
    }
    
    public List<M_Project_Third> getAllThirds()throws Exception{
        return dbaf.getThirdDBAccess().getAllThirdProjects();
    }
    
}
