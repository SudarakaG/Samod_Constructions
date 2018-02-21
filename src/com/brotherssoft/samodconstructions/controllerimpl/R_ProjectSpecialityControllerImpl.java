/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.controllerimpl;

import com.brotherssoft.samodconstructions.controller.R_ProjectSpecialityController;
import com.brotherssoft.samodconstructions.model.R_ProjectSpeciality;
import com.brotherssoft.samodconstructions.servicefactory.ServiceFactory;
import com.brotherssoft.samodconstructions.servicefactoryimpl.ServiceFactoryImpl;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

/**
 *
 * @author gksde
 */
public class R_ProjectSpecialityControllerImpl extends UnicastRemoteObject implements R_ProjectSpecialityController{
    
    private final ServiceFactory sf;

    public R_ProjectSpecialityControllerImpl() throws Exception{
        this.sf = new ServiceFactoryImpl();
    }

    @Override
    public R_ProjectSpeciality searchProjectSpeciality(int pSpecialityId) throws Exception {
        return sf.getProjectSpecialityService().searchProjectSpeciality(pSpecialityId);
    }

    @Override
    public List<R_ProjectSpeciality> getAllProjectSpecialities() throws Exception {
        return sf.getProjectSpecialityService().getAllProjectSpecialities();
    }

    @Override
    public R_ProjectSpeciality searProjectSpecialityByName(String pSpecialityName) throws Exception {
        return  sf.getProjectSpecialityService().searchProjectSpecialityByName(pSpecialityName);
    }
    
    
    
}
