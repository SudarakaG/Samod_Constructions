/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.controllerimpl;

import com.brotherssoft.samodconstructions.controller.M_MainStockController;
import com.brotherssoft.samodconstructions.model.M_MainStock;
import com.brotherssoft.samodconstructions.servicefactory.ServiceFactory;
import com.brotherssoft.samodconstructions.servicefactoryimpl.ServiceFactoryImpl;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

/**
 *
 * @author gksde
 */
public class M_MainStockControllerImpl extends UnicastRemoteObject implements M_MainStockController{
    
    private final ServiceFactory sf = new ServiceFactoryImpl();

    public M_MainStockControllerImpl() throws Exception{
    }

    @Override
    public boolean addMainStock(M_MainStock mainStock) throws Exception {
        return sf.getMainStockService().addMainStock(mainStock);
    }

    @Override
    public boolean updateMainStock(M_MainStock mainStock) throws Exception {
        return sf.getMainStockService().updateMainStock(mainStock);
    }

    @Override
    public boolean deleteMainStock(int mStockId) throws Exception {
        return sf.getMainStockService().deleteMainStock(mStockId);
    }

    @Override
    public M_MainStock searchMainStock(int mStockId) throws Exception {
        return sf.getMainStockService().searchMainStock(mStockId);
    }

    @Override
    public M_MainStock searchMainStockByItem(String itemId) throws Exception {
        return sf.getMainStockService().searchMainStockByItem(itemId);
    }

    @Override
    public List<M_MainStock> getAllMainStock() throws Exception {
        return sf.getMainStockService().getAllMainStock();
    }

    @Override
    public List<M_MainStock> getAllMainStockByItem(String ItemId) throws Exception {
        return sf.getMainStockService().getAllMainStockByItem(ItemId);
    }
    
    
    
}
