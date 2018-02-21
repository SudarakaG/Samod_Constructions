/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.controller;

import com.brotherssoft.samodconstructions.model.T_Runchart;
import java.rmi.Remote;
import java.util.Date;
import java.util.List;

/**
 *
 * @author gksde
 */
public interface T_RunchartController extends Remote{
    
    public boolean addRunchart(T_Runchart runchart)throws Exception;
    public boolean updateRunchart(T_Runchart runchart)throws Exception;
    public boolean deleteRunchart(int runchartId)throws Exception;
    public T_Runchart searchRunchart(int runchartId)throws Exception;
    public List<T_Runchart> getAllRuncharts()throws Exception;
    public List<T_Runchart> getAllLastAddedRuncharts()throws Exception;
    public T_Runchart searchRunchart(String vNo,Date rDate,String sTime,String eTime)throws Exception;
    
}
