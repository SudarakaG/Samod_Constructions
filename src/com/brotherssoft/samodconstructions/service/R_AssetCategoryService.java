/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.service;

import com.brotherssoft.samodconstructions.dbAccessFactory.DBAccessFactory;
import com.brotherssoft.samodconstructions.dbAccessFactoryImpl.DBAccessFactoryImpl;
import com.brotherssoft.samodconstructions.model.R_AssetCategory;
import java.util.List;

/**
 *
 * @author gksde
 */
public class R_AssetCategoryService {
    
    private final DBAccessFactory dbaf;
    
    public R_AssetCategoryService() {
        this.dbaf = new DBAccessFactoryImpl();
    }    
    
    public R_AssetCategory searchAssetCategory(int id)throws Exception{
        return dbaf.getAssetCategoryDBAccess().searchAssetCategory(id);
    }
    
    public R_AssetCategory searchAssetCategory(String name)throws Exception{
        return dbaf.getAssetCategoryDBAccess().searchAssetCategory(name);
    }
    
    public List<R_AssetCategory> getAllAssetCategorys()throws Exception{
        return dbaf.getAssetCategoryDBAccess().getAllAssetCategorys();
    }
    
}
