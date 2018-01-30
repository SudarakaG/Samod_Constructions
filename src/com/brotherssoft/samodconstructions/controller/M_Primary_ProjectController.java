/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.controller;

import com.brotherssoft.samodconstructions.model.M_Project_Primary;
import java.rmi.Remote;
import java.util.List;

/**
 *
 * @author gksde
 */
public interface M_Primary_ProjectController extends Remote{
    
    public boolean addPrimaryProject(M_Project_Primary project_Primary)throws Exception;
    public boolean updatePrimaryProject(M_Project_Primary project_Primary)throws Exception;
    public boolean deletePrimaryProject(int projectId)throws Exception;
    public M_Project_Primary searchPrimaryProject(int projectId)throws Exception;
    public List<M_Project_Primary> getAllPrimaryProjects()throws Exception;
    
    public M_Project_Primary searchPrimaryProjectByName(String name)throws Exception;
    
}
