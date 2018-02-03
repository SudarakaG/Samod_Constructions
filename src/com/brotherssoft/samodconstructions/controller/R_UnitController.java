/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.controller;

import com.brotherssoft.samodconstructions.model.R_Unit;
import java.rmi.Remote;
import java.util.List;

/**
 *
 * @author gksde
 */
public interface R_UnitController extends Remote{
    
    public R_Unit searchUnit(int id)throws Exception;
    public R_Unit searchUnit(String name)throws Exception;
    public List<R_Unit> getAllUnits()throws Exception;
    
}
