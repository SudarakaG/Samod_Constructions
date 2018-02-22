/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.controllerimpl;

import com.brotherssoft.samodconstructions.controller.T_RunchartController;
import com.brotherssoft.samodconstructions.model.T_Runchart;
import com.brotherssoft.samodconstructions.reservation.T_RunchartReserver;
import com.brotherssoft.samodconstructions.servicefactory.ServiceFactory;
import com.brotherssoft.samodconstructions.servicefactoryimpl.ServiceFactoryImpl;
import java.rmi.server.UnicastRemoteObject;
import java.util.Date;
import java.util.List;

/**
 *
 * @author gksde
 */
public class T_RunchartControllerImpl extends UnicastRemoteObject implements T_RunchartController{

    private final ServiceFactory sf;
    private static final T_RunchartReserver RUNCHART_RESERVER = new T_RunchartReserver();
    
    public T_RunchartControllerImpl() throws Exception{
        this.sf = new ServiceFactoryImpl();
    }

    @Override
    public boolean addRunchart(T_Runchart runchart) throws Exception {
        return sf.getRunchartService().addRunchart(runchart);
    }

    @Override
    public boolean updateRunchart(T_Runchart runchart) throws Exception {
        return sf.getRunchartService().updateRunchart(runchart);
    }

    @Override
    public boolean deleteRunchart(int runchartId) throws Exception {
        return sf.getRunchartService().deleteRunchart(runchartId);
    }

    @Override
    public T_Runchart searchRunchart(int runchartId) throws Exception {
        return sf.getRunchartService().searchRunchart(runchartId);
    }

    @Override
    public List<T_Runchart> getAllRuncharts() throws Exception {
        return sf.getRunchartService().getAllRuncharts();
    }

    @Override
    public List<T_Runchart> getAllLastAddedRuncharts() throws Exception {
        return sf.getRunchartService().getAllLastAddedRuncharts();
    }

    @Override
    public T_Runchart searchRunchart(String vNo, Date rDate, String sTime, String eTime) throws Exception {
        return sf.getRunchartService().searchRunchart(vNo, rDate, sTime, eTime);
    }

    @Override
    public boolean reserveRunchart(int id) throws Exception {
        return RUNCHART_RESERVER.reserveRunchart(id, this);
    }

    @Override
    public boolean releaseRunchart(int id) throws Exception {
        return RUNCHART_RESERVER.releaseRunchart(id, this);
    }
    
}
