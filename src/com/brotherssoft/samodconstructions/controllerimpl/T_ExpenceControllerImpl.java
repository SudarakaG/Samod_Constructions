/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.controllerimpl;

import com.brotherssoft.samodconstructions.controller.T_ExpencesController;
import com.brotherssoft.samodconstructions.model.T_Expences;
import com.brotherssoft.samodconstructions.reservation.T_ExpenceReserver;
import com.brotherssoft.samodconstructions.servicefactory.ServiceFactory;
import com.brotherssoft.samodconstructions.servicefactoryimpl.ServiceFactoryImpl;
import java.rmi.server.UnicastRemoteObject;
import java.util.Date;
import java.util.List;

/**
 *
 * @author gksde
 */
public class T_ExpenceControllerImpl extends UnicastRemoteObject implements T_ExpencesController{

    private final ServiceFactory sf;
    private static final T_ExpenceReserver EXPENCE_RESERVER = new T_ExpenceReserver();
    
    public T_ExpenceControllerImpl()throws Exception{
        this.sf = new ServiceFactoryImpl();
        
    }
    
    @Override
    public boolean addExpence(T_Expences expences) throws Exception {
        return sf.getExpenceService().addExpence(expences);
    }

    @Override
    public boolean updateExpence(T_Expences expences) throws Exception {
        return sf.getExpenceService().updateExpence(expences);
    }

    @Override
    public boolean deleteExpence(int id) throws Exception {
        return sf.getExpenceService().deleteExpence(id);
    }

    @Override
    public T_Expences searchExpence(int id) throws Exception {
        return sf.getExpenceService().searchExpence(id);
    }

    @Override
    public List<T_Expences> getAllExpences() throws Exception {
        return sf.getExpenceService().getAllExpences();
    }

    @Override
    public List<T_Expences> getExpencesByLetter(String phrase) throws Exception {
        return sf.getExpenceService().getExpencesByLetter(phrase);
    }

    @Override
    public T_Expences searchExpence(Date date, int project, double amount) throws Exception {
        return sf.getExpenceService().searchExpence(date, project, amount);
    }

    @Override
    public boolean reserveExpence(int id) throws Exception {
        return EXPENCE_RESERVER.reserveExpence(id, this);
    }

    @Override
    public boolean releaseExpence(int id) throws Exception {
        return EXPENCE_RESERVER.releaseExpence(id, this);
    }
    
}
