/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.controller;

import com.brotherssoft.samodconstructions.model.R_ExpencesType;
import java.rmi.Remote;
import java.util.List;

/**
 *
 * @author gksde
 */
public interface R_ExpenceTypeController extends Remote{
    public List<R_ExpencesType> getAllExpencesTypes()throws Exception;
    public R_ExpencesType searchExpencesType(int id)throws Exception;
    public R_ExpencesType searchExpencesType(String name)throws Exception;
}
