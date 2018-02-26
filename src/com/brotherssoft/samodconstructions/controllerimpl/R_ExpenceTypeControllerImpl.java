/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.controllerimpl;

import com.brotherssoft.samodconstructions.controller.R_ExpenceTypeController;
import com.brotherssoft.samodconstructions.model.R_ExpencesType;
import com.brotherssoft.samodconstructions.servicefactory.ServiceFactory;
import com.brotherssoft.samodconstructions.servicefactoryimpl.ServiceFactoryImpl;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

/**
 *
 * @author gksde
 */
public class R_ExpenceTypeControllerImpl extends UnicastRemoteObject implements R_ExpenceTypeController{

    private final ServiceFactory sf;
    
    public R_ExpenceTypeControllerImpl()throws Exception{
        this.sf = new ServiceFactoryImpl();        
    }
    
    @Override
    public List<R_ExpencesType> getAllExpencesTypes() throws Exception {
        return sf.getExpenceTypeService().getAllExpencesTypes();
    }

    @Override
    public R_ExpencesType searchExpencesType(int id) throws Exception {
        return sf.getExpenceTypeService().searchExpencesType(id);
    }

    @Override
    public R_ExpencesType searchExpencesType(String name) throws Exception {
        return sf.getExpenceTypeService().searchExpencesType(name);
    }
    
}
