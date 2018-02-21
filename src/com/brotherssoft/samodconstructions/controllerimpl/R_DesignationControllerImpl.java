/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.controllerimpl;

import com.brotherssoft.samodconstructions.controller.R_DesignationController;
import com.brotherssoft.samodconstructions.model.R_Designation;
import com.brotherssoft.samodconstructions.servicefactory.ServiceFactory;
import com.brotherssoft.samodconstructions.servicefactoryimpl.ServiceFactoryImpl;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

/**
 *
 * @author gksde
 */
public class R_DesignationControllerImpl extends UnicastRemoteObject implements R_DesignationController{
    
    private final ServiceFactory sf;

    public R_DesignationControllerImpl() throws Exception{
        this.sf = new ServiceFactoryImpl();
    }

    @Override
    public R_Designation searchDesignation(int id) throws Exception {
        return sf.getDesignationService().searchDesignation(id);
    }

    @Override
    public R_Designation searchDesignation(String name) throws Exception {
        return sf.getDesignationService().searchDesignation(name);
    }

    @Override
    public List<R_Designation> getAllDesignations() throws Exception {
        return sf.getDesignationService().getAllDesignations();
    }
    
    
    
}
