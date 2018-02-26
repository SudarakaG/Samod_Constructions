/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.controllerimpl;

import com.brotherssoft.samodconstructions.controller.R_ExpenceSubTypeController;
import com.brotherssoft.samodconstructions.model.R_ExpencesSubType;
import com.brotherssoft.samodconstructions.servicefactory.ServiceFactory;
import com.brotherssoft.samodconstructions.servicefactoryimpl.ServiceFactoryImpl;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

/**
 *
 * @author gksde
 */
public class R_ExpenceSubTypeControllerImpl extends UnicastRemoteObject implements R_ExpenceSubTypeController{

    private final ServiceFactory sf;
    
    public R_ExpenceSubTypeControllerImpl() throws Exception{
        this.sf = new ServiceFactoryImpl();
    }

    @Override
    public List<R_ExpencesSubType> getAllExpencesSubTypes() throws Exception {
        return sf.getExpenceSubTypeService().getAllExpencesSubTypes();
    }

    @Override
    public R_ExpencesSubType searchExpencesSubType(int id) throws Exception {
        return sf.getExpenceSubTypeService().searchExpencesSubType(id);
    }

    @Override
    public R_ExpencesSubType searchExpencesSubType(String name) throws Exception {
        return sf.getExpenceSubTypeService().searchExpencesSubType(name);
    }
    
}
