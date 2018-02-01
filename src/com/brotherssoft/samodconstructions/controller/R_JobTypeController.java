/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.controller;

import com.brotherssoft.samodconstructions.model.R_JobType;
import java.rmi.Remote;
import java.util.List;

/**
 *
 * @author gksde
 */
public interface R_JobTypeController extends Remote{
    
    public R_JobType searchJobType(int id)throws Exception;
    public R_JobType searchJobType(String name)throws Exception;
    public List<R_JobType> getAllJobTypes()throws Exception;
    
}
