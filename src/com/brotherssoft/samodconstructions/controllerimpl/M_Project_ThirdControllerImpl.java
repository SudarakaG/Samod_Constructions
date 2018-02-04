/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.controllerimpl;

import com.brotherssoft.samodconstructions.controller.M_Project_ThirdController;
import com.brotherssoft.samodconstructions.model.M_Project_Third;
import com.brotherssoft.samodconstructions.servicefactory.ServiceFactory;
import com.brotherssoft.samodconstructions.servicefactoryimpl.ServiceFactoryImpl;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

/**
 *
 * @author gksde
 */
public class M_Project_ThirdControllerImpl extends UnicastRemoteObject implements M_Project_ThirdController{

    private final ServiceFactory sf = new ServiceFactoryImpl();
    
    public M_Project_ThirdControllerImpl() throws Exception{
    }

    @Override
    public boolean updateThirdProject(M_Project_Third third) throws Exception {
        return sf.getThirdService().updateThird(third);
    }

    @Override
    public boolean deleteThirdProject(int id) throws Exception {
        return sf.getThirdService().deleteSecondary(id);
    }

    @Override
    public M_Project_Third searchThird(int id) throws Exception {
        return sf.getThirdService().searchThird(id);
    }

    @Override
    public M_Project_Third searchThird(String name) throws Exception {
        return sf.getThirdService().searchThird(name);
    }

    @Override
    public List<M_Project_Third> getAllThirds() throws Exception {
        return sf.getThirdService().getAllThirds();
    }
    
    
    
}
