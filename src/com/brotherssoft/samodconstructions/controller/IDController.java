/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.controller;

import java.rmi.Remote;

/**
 *
 * @author gksde
 */
public interface IDController extends Remote{
    
    public int getLastID(String tableName, String colName) throws Exception;  
    
}
