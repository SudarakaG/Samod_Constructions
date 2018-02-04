/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.controller;

import com.brotherssoft.samodconstructions.model.M_Project_Third;
import java.rmi.Remote;
import java.util.List;

/**
 *
 * @author gksde
 */
public interface M_Project_ThirdController extends Remote{
    
    public boolean updateThirdProject(M_Project_Third third)throws Exception;
    public boolean deleteThirdProject(int id)throws Exception;
    public M_Project_Third searchThird(int id)throws Exception;
    public M_Project_Third searchThird(String name)throws Exception;
    public List<M_Project_Third> getAllThirds()throws Exception;
    
}
