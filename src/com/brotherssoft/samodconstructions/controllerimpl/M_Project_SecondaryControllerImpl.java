/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.controllerimpl;

import com.brotherssoft.samodconstructions.controller.M_Project_SecondaryController;
import com.brotherssoft.samodconstructions.model.M_Project_Secondary;
import com.brotherssoft.samodconstructions.servicefactory.ServiceFactory;
import com.brotherssoft.samodconstructions.servicefactoryimpl.ServiceFactoryImpl;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

/**
 *
 * @author gksde
 */
public class M_Project_SecondaryControllerImpl extends  UnicastRemoteObject implements M_Project_SecondaryController{

    private final ServiceFactory sf = new ServiceFactoryImpl();
    
    public M_Project_SecondaryControllerImpl() throws Exception{
    }

    @Override
    public boolean updateSecondaryProject(M_Project_Secondary secondary) throws Exception {
        return sf.getSecondaryService().updateSecondary(secondary);
    }

    @Override
    public boolean deleteSecondaryProject(int id) throws Exception {
        return sf.getSecondaryService().deleteSecondary(id);
    }

    @Override
    public M_Project_Secondary searchSecondary(int id) throws Exception {
        return sf.getSecondaryService().searchSecondary(id);
    }

    @Override
    public M_Project_Secondary searchSecondary(String name) throws Exception {
        return sf.getSecondaryService().searchSecondary(name);
    }

    @Override
    public List<M_Project_Secondary> getAllSecondarys() throws Exception {
        return sf.getSecondaryService().getAllSecondarys();
    }
    
    
    
}
