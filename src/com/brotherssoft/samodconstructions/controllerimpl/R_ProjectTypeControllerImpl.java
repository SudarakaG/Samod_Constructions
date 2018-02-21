/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.controllerimpl;

import com.brotherssoft.samodconstructions.controller.R_ProjectTypeController;
import com.brotherssoft.samodconstructions.model.R_ProjectType;
import com.brotherssoft.samodconstructions.servicefactory.ServiceFactory;
import com.brotherssoft.samodconstructions.servicefactoryimpl.ServiceFactoryImpl;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

/**
 *
 * @author gksde
 */
public class R_ProjectTypeControllerImpl extends UnicastRemoteObject implements R_ProjectTypeController{
    
    private final ServiceFactory sf;

    public R_ProjectTypeControllerImpl() throws Exception{
        this.sf = new ServiceFactoryImpl();
    }

    @Override
    public R_ProjectType searchProjectType(int pTypeId) throws Exception {
        return sf.getProjectTypeService().searchProjectType(pTypeId);
    }

    @Override
    public List<R_ProjectType> getAllProjectTypes() throws Exception {
        return sf.getProjectTypeService().getAllProjectTypes();
    }

    @Override
    public R_ProjectType searProjectTypeByName(String pTypeName) throws Exception {
        return sf.getProjectTypeService().searchProjectTypeByName(pTypeName);
    }
    
    
    
}
