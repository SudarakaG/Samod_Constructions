/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.controller;

import com.brotherssoft.samodconstructions.model.R_ProjectType;
import java.rmi.Remote;
import java.util.List;

/**
 *
 * @author gksde
 */
public interface R_ProjectTypeController extends Remote{
    
    public R_ProjectType searchProjectType(int pTypeId)throws Exception;
    public List<R_ProjectType> getAllProjectTypes()throws Exception;
    public R_ProjectType searProjectTypeByName(String pTypeName)throws Exception;
    
}
