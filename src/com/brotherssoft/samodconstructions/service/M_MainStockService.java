/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.service;

import com.brotherssoft.samodconstructions.dbAccessFactory.DBAccessFactory;
import com.brotherssoft.samodconstructions.dbAccessFactoryImpl.DBAccessFactoryImpl;
import com.brotherssoft.samodconstructions.model.M_MainStock;
import java.util.List;

/**
 *
 * @author gksde
 */
public class M_MainStockService {
    
    private final DBAccessFactory dbaf = new DBAccessFactoryImpl();

    public M_MainStockService() {
    }   
    
    public boolean addMainStock(M_MainStock mainStock)throws Exception{
        return dbaf.getMainStockDBAccess().addMainStock(mainStock);
    }
    public boolean updateMainStock(M_MainStock mainStock)throws Exception{
        return dbaf.getMainStockDBAccess().updateMainStock(mainStock);
    }
    public boolean deleteMainStock(int mStockId)throws Exception{
        return dbaf.getMainStockDBAccess().deleteMainStock(mStockId);
    }
    public M_MainStock searchMainStock(int mStockId)throws Exception{
        return dbaf.getMainStockDBAccess().searchMainStock(mStockId);
    }
    public M_MainStock searchMainStockByItem(String itemId)throws Exception{
        return dbaf.getMainStockDBAccess().searchMainStockByItem(itemId);
    }
    public List<M_MainStock> getAllMainStock()throws Exception{
        return dbaf.getMainStockDBAccess().getAllMainStock();
    }
    
    public List<M_MainStock> getAllMainStockByItem(String itemId)throws Exception{
        return dbaf.getMainStockDBAccess().getAllMainStockByItem(itemId);
    }
    
}
