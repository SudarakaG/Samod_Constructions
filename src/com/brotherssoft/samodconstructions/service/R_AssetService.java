/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.service;

import com.brotherssoft.samodconstructions.dbAccessFactory.DBAccessFactory;
import com.brotherssoft.samodconstructions.dbAccessFactoryImpl.DBAccessFactoryImpl;
import com.brotherssoft.samodconstructions.model.R_Asset;
import java.util.List;

/**
 *
 * @author gksde
 */
public class R_AssetService {

    private final DBAccessFactory dbaf = new DBAccessFactoryImpl();
    
    public R_AssetService() {
    }    
    
    public R_Asset searchAsset(int id)throws Exception{
        return dbaf.getAssetDBAccess().searchAsset(id);
    }
    
    public R_Asset searchAsset(String name)throws Exception{
        return dbaf.getAssetDBAccess().searchAsset(name);
    }
    
    public List<R_Asset> getAllAssets()throws Exception{
        return dbaf.getAssetDBAccess().getAllAssets();
    }
    
}
