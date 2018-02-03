/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.controller;

import com.brotherssoft.samodconstructions.model.R_Asset;
import java.rmi.Remote;
import java.util.List;

/**
 *
 * @author gksde
 */
public interface R_AssetController extends Remote{
    
    public R_Asset searchAsset(int id)throws Exception;
    public R_Asset searchAsset(String name)throws Exception;
    public List<R_Asset> getAllAssets()throws Exception;
    
}
