/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.controllerimpl;

import com.brotherssoft.samodconstructions.controller.R_WorkController;
import com.brotherssoft.samodconstructions.model.R_Work;
import com.brotherssoft.samodconstructions.servicefactory.ServiceFactory;
import com.brotherssoft.samodconstructions.servicefactoryimpl.ServiceFactoryImpl;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

/**
 *
 * @author gksde
 */
public class R_WorkControllerImpl extends UnicastRemoteObject implements R_WorkController{

    private ServiceFactory sf = new ServiceFactoryImpl();
    
    public R_WorkControllerImpl() throws Exception{
    }

    @Override
    public boolean addWork(R_Work work) throws Exception {
        return sf.getWorkService().addWork(work);
    }

    @Override
    public boolean updateWork(R_Work work) throws Exception {
        return sf.getWorkService().updateWork(work);
    }

    @Override
    public boolean deleteWork(int id) throws Exception {
        return sf.getWorkService().deleteWork(id);
    }

    @Override
    public R_Work searchWork(int id) throws Exception {
        return sf.getWorkService().searchWork(id);
    }

    @Override
    public R_Work searchWork(String name) throws Exception {
        return sf.getWorkService().searchWork(name);
    }

    @Override
    public List<R_Work> getAllWorks() throws Exception {
        return sf.getWorkService().getAllWorks();
    }
    
    
    
}
