/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.controllerimpl;

import com.brotherssoft.samodconstructions.controller.M_PurchaserController;
import com.brotherssoft.samodconstructions.model.M_Purchaser;
import com.brotherssoft.samodconstructions.reservation.M_PurchaserReserver;
import com.brotherssoft.samodconstructions.servicefactory.ServiceFactory;
import com.brotherssoft.samodconstructions.servicefactoryimpl.ServiceFactoryImpl;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

/**
 *
 * @author gksde
 */
public class M_PurchaserControllerImpl extends UnicastRemoteObject implements M_PurchaserController{

    private final ServiceFactory sf;
    private static final M_PurchaserReserver PURCHASER_RESERVER = new M_PurchaserReserver();
    
    public M_PurchaserControllerImpl() throws Exception{
        this.sf = new ServiceFactoryImpl();
    }

    @Override
    public boolean addPurchaser(M_Purchaser purchaser) throws Exception {
        return sf.getPurchaserService().addPurchaser(purchaser);
    }

    @Override
    public boolean updatePuchaser(M_Purchaser purchaser) throws Exception {
        return sf.getPurchaserService().updatePurchaser(purchaser);
    }

    @Override
    public boolean deletePuchaser(int id) throws Exception {
        return sf.getPurchaserService().deletePurchaser(id);
    }

    @Override
    public M_Purchaser searchPurchaser(int id) throws Exception {
        return sf.getPurchaserService().searchPurchaser(id);
    }

    @Override
    public M_Purchaser searchPurchaser(String name) throws Exception {
        return sf.getPurchaserService().searchPurchaser(name);
    }

    @Override
    public List<M_Purchaser> getAllPurchasers() throws Exception {
        return sf.getPurchaserService().getAllPurchasers();
    }

    @Override
    public List<M_Purchaser> getAllPurchasersByLetter(String phrase) throws Exception {
        return sf.getPurchaserService().getAllPurchasersByLetter(phrase);
    }

    @Override
    public boolean reservePurchaser(int id) throws Exception {
        return PURCHASER_RESERVER.reservePurchaser(id, this);
    }

    @Override
    public boolean releasePurchaser(int id) throws Exception {
        return PURCHASER_RESERVER.releasePurchaser(id, this);
    }
 
    
    
}
