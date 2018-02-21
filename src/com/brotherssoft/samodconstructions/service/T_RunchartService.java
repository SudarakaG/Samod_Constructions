/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.service;

import com.brotherssoft.samodconstructions.dbAccessFactory.DBAccessFactory;
import com.brotherssoft.samodconstructions.dbAccessFactoryImpl.DBAccessFactoryImpl;
import com.brotherssoft.samodconstructions.model.T_Runchart;
import java.util.Date;
import java.util.List;

/**
 *
 * @author gksde
 */
public class T_RunchartService {

    private final DBAccessFactory dbaf;
    
    public T_RunchartService() {
        this.dbaf = new DBAccessFactoryImpl();
    }
    
    public boolean addRunchart(T_Runchart runchart)throws Exception{
        return dbaf.getRunchartDBAccess().addRunchart(runchart);
    }
    
    public boolean updateRunchart(T_Runchart runchart)throws Exception{
        return dbaf.getRunchartDBAccess().updateRunchart(runchart);
    }
    
    public boolean deleteRunchart(int runchartId)throws Exception{
        return dbaf.getRunchartDBAccess().deleteRunchart(runchartId);
    }
    
    public T_Runchart searchRunchart(int runchartId)throws Exception{
        return dbaf.getRunchartDBAccess().searchRunchart(runchartId);
    }
    
    public List<T_Runchart> getAllRuncharts()throws Exception{
        return dbaf.getRunchartDBAccess().getAllRuncharts();
    }
    
    public List<T_Runchart> getAllLastAddedRuncharts()throws Exception{
        return dbaf.getRunchartDBAccess().getAllLastAddedRuncharts();
    }
    
    public T_Runchart searchRunchart(String vNo,Date rDate,String sTime,String eTime)throws Exception{
        return dbaf.getRunchartDBAccess().searchRunchart(vNo, rDate, sTime, eTime);
    }
    
}
