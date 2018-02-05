/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.controllerimpl;

import com.brotherssoft.samodconstructions.model.M_Project_Primary;
import com.brotherssoft.samodconstructions.servicefactory.ServiceFactory;
import com.brotherssoft.samodconstructions.servicefactoryimpl.ServiceFactoryImpl;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import com.brotherssoft.samodconstructions.controller.M_Project_PrimaryController;

/**
 *
 * @author gksde
 */
public class M_Project_PrimaryControllerImpl extends UnicastRemoteObject implements M_Project_PrimaryController{

    private ServiceFactory sf = new ServiceFactoryImpl();
    
    public M_Project_PrimaryControllerImpl() throws Exception{
        
    }
    
    @Override
    public boolean addPrimaryProject(M_Project_Primary project_Primary) throws Exception {
        return sf.getPrimary_ProjectService().addPrimaryProject(project_Primary);
    }

    @Override
    public boolean updatePrimaryProject(M_Project_Primary project_Primary) throws Exception {
        return sf.getPrimary_ProjectService().updatePrimaryProject(project_Primary);
    }

    @Override
    public boolean deletePrimaryProject(int projectId) throws Exception {
        return sf.getPrimary_ProjectService().deletePrimaryProject(projectId);
    }

    @Override
    public M_Project_Primary searchPrimaryProject(int projectId) throws Exception {
        return sf.getPrimary_ProjectService().searchPrimaryProject(projectId);
    }

    @Override
    public List<M_Project_Primary> getAllPrimaryProjects() throws Exception {
        return sf.getPrimary_ProjectService().getAllPrimaryProjects();
    }

    @Override
    public M_Project_Primary searchPrimaryProjectByName(String name) throws Exception {
        return sf.getPrimary_ProjectService().searchPrimaryProjectByName(name);
    }

    @Override
    public List<M_Project_Primary> getAllPrimaryProjectsByLetter(String phrase) throws Exception {
        return sf.getPrimary_ProjectService().getAllPrimaryProjectsByLetter(phrase);
    }
    
}
