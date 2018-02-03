/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.controllerimpl;

import com.brotherssoft.samodconstructions.controller.R_AssetController;
import com.brotherssoft.samodconstructions.model.R_Asset;
import com.brotherssoft.samodconstructions.servicefactory.ServiceFactory;
import com.brotherssoft.samodconstructions.servicefactoryimpl.ServiceFactoryImpl;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

/**
 *
 * @author gksde
 */
public class R_AssetControllerImpl extends UnicastRemoteObject implements R_AssetController{

    private ServiceFactory sf = new ServiceFactoryImpl();
    
    public R_AssetControllerImpl() throws Exception{
    }

    @Override
    public R_Asset searchAsset(int id) throws Exception {
        return sf.getAssetService().searchAsset(id);
    }

    @Override
    public R_Asset searchAsset(String name) throws Exception {
        return sf.getAssetService().searchAsset(name);
    }

    @Override
    public List<R_Asset> getAllAssets() throws Exception {
        return sf.getAssetService().getAllAssets();
    }
    
    
    
}
