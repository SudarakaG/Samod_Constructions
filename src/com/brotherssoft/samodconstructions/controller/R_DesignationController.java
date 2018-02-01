/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.controller;

import com.brotherssoft.samodconstructions.model.R_Designation;
import java.rmi.Remote;
import java.util.List;

/**
 *
 * @author gksde
 */
public interface R_DesignationController extends Remote{
    
    public R_Designation searchDesignation(int id)throws Exception;
    public R_Designation searchDesignation(String name)throws Exception;
    public List<R_Designation> getAllDesignations()throws Exception;
    
}
