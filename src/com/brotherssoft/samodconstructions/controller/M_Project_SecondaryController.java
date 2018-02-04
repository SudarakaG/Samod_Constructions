/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.controller;

import com.brotherssoft.samodconstructions.model.M_Project_Secondary;
import java.rmi.Remote;
import java.util.List;

/**
 *
 * @author gksde
 */
public interface M_Project_SecondaryController extends Remote{
    
    public boolean updateSecondaryProject(M_Project_Secondary secondary)throws Exception;
    public boolean deleteSecondaryProject(int id)throws Exception;
    public M_Project_Secondary searchSecondary(int id)throws Exception;
    public M_Project_Secondary searchSecondary(String name)throws Exception;
    public List<M_Project_Secondary> getAllSecondarys()throws Exception;
    
}
