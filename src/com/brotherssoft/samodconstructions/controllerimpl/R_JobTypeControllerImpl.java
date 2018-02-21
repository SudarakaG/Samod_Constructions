/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.controllerimpl;

import com.brotherssoft.samodconstructions.controller.R_JobTypeController;
import com.brotherssoft.samodconstructions.model.R_JobType;
import com.brotherssoft.samodconstructions.servicefactory.ServiceFactory;
import com.brotherssoft.samodconstructions.servicefactoryimpl.ServiceFactoryImpl;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

/**
 *
 * @author gksde
 */
public class R_JobTypeControllerImpl extends UnicastRemoteObject implements R_JobTypeController{
    
    private final ServiceFactory sf;

    public R_JobTypeControllerImpl() throws Exception{
        this.sf = new ServiceFactoryImpl();
    }

    @Override
    public R_JobType searchJobType(int id) throws Exception {
        return sf.getJobTypeService().searchJobType(id);
    }

    @Override
    public R_JobType searchJobType(String name) throws Exception {
        return sf.getJobTypeService().searchJobType(name);
    }

    @Override
    public List<R_JobType> getAllJobTypes() throws Exception {
        return sf.getJobTypeService().getAllJobTypes();
    }
    
    
    
}
