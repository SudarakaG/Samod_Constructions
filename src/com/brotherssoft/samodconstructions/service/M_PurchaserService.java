/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.service;

import com.brotherssoft.samodconstructions.dbAccessFactory.DBAccessFactory;
import com.brotherssoft.samodconstructions.dbAccessFactoryImpl.DBAccessFactoryImpl;
import com.brotherssoft.samodconstructions.model.M_Purchaser;
import java.util.List;

/**
 *
 * @author gksde
 */
public class M_PurchaserService {
    
    private final DBAccessFactory dbaf = new DBAccessFactoryImpl();

    public M_PurchaserService() {
    }
    
    public boolean addPurchaser(M_Purchaser purchaser)throws Exception{
        return dbaf.getPurchaserDBAccess().addPurchaser(purchaser);
    }
    
    public boolean updatePurchaser(M_Purchaser purchaser)throws Exception{
        return dbaf.getPurchaserDBAccess().updatePurchaser(purchaser);
    }
    
    public boolean deletePurchaser(int id)throws Exception{
        return dbaf.getPurchaserDBAccess().deletePurchaser(id);
    }
    
    public M_Purchaser searchPurchaser(int id)throws Exception{
        return dbaf.getPurchaserDBAccess().searchPurchaser(id);
    }
    
    public M_Purchaser searchPurchaser(String name)throws Exception{
        return dbaf.getPurchaserDBAccess().searchPurchaser(name);
    }
    
    public List<M_Purchaser> getAllPurchasers()throws Exception{
        return dbaf.getPurchaserDBAccess().getAllM_Purchasers();
    }
    
}
