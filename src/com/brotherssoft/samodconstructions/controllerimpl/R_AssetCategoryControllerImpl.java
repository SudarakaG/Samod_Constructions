/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.controllerimpl;

import com.brotherssoft.samodconstructions.controller.R_AssetCategoryController;
import com.brotherssoft.samodconstructions.model.R_AssetCategory;
import com.brotherssoft.samodconstructions.servicefactory.ServiceFactory;
import com.brotherssoft.samodconstructions.servicefactoryimpl.ServiceFactoryImpl;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

/**
 *
 * @author gksde
 */
public class R_AssetCategoryControllerImpl extends UnicastRemoteObject implements R_AssetCategoryController{

    private ServiceFactory sf = new ServiceFactoryImpl();
    
    public R_AssetCategoryControllerImpl() throws Exception{
    }

    @Override
    public R_AssetCategory searchAssetCategory(int id) throws Exception {
        return sf.getAssetCategoryService().searchAssetCategory(id);
    }

    @Override
    public R_AssetCategory searchAssetCategory(String name) throws Exception {
        return sf.getAssetCategoryService().searchAssetCategory(name);
    }

    @Override
    public List<R_AssetCategory> getAllAssetCategorys() throws Exception {
        return sf.getAssetCategoryService().getAllAssetCategorys();
    }
    
    
    
}
