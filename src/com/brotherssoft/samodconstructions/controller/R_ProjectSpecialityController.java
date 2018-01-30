/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.controller;

import com.brotherssoft.samodconstructions.model.R_ProjectSpeciality;
import java.rmi.Remote;
import java.util.List;

/**
 *
 * @author gksde
 */
public interface R_ProjectSpecialityController extends Remote{
    
    public R_ProjectSpeciality searchProjectSpeciality(int pSpecialityId)throws Exception;
    public List<R_ProjectSpeciality> getAllProjectSpecialities()throws Exception;
    public R_ProjectSpeciality searProjectSpecialityByName(String pSpecialityName)throws Exception;
    
}
