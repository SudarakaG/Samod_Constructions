/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.controller;

import com.brotherssoft.samodconstructions.model.M_MainStock;
import java.rmi.Remote;
import java.util.List;

/**
 *
 * @author gksde
 */
public interface M_MainStockController extends Remote{
    
    public boolean addMainStock(M_MainStock mainStock)throws Exception;
    public boolean updateMainStock(M_MainStock mainStock)throws Exception;
    public boolean deleteMainStock(int mStockId)throws Exception;
    public M_MainStock searchMainStock(int mStockId)throws Exception;
    public M_MainStock searchMainStockByItem(String itemId)throws Exception;
    public List<M_MainStock> getAllMainStock()throws Exception;
    public List<M_MainStock> getAllMainStockByItem(String ItemId)throws Exception;
    public List<M_MainStock> getAllLastAddedMainStock()throws Exception;
    public boolean updateMainStockQuantity(String itemId, double quatity)throws Exception;
    
    public boolean reserveMainStock(int id)throws Exception;
    public boolean releaseMainStock(int id)throws Exception;
}
