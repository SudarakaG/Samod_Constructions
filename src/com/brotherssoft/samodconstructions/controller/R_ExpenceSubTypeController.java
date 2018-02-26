/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.controller;

import com.brotherssoft.samodconstructions.model.R_ExpencesSubType;
import java.rmi.Remote;
import java.util.List;

/**
 *
 * @author gksde
 */
public interface R_ExpenceSubTypeController extends Remote{
    public List<R_ExpencesSubType> getAllExpencesSubTypes()throws Exception;
    public R_ExpencesSubType searchExpencesSubType(int id)throws Exception;
    public R_ExpencesSubType searchExpencesSubType(String name)throws Exception;
}
