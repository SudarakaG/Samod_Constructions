/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.controller;

import com.brotherssoft.samodconstructions.model.M_Purchaser;
import java.rmi.Remote;
import java.util.List;

/**
 *
 * @author gksde
 */
public interface M_PurchaserController extends Remote{
    
    public boolean addPurchaser(M_Purchaser purchaser)throws Exception;
    public boolean updatePuchaser(M_Purchaser purchaser)throws Exception;
    public boolean deletePuchaser(int id)throws Exception;
    public M_Purchaser searchPurchaser(int id)throws Exception;
    public M_Purchaser searchPurchaser(String name)throws Exception;
    public List<M_Purchaser> getAllPurchasers()throws Exception;
    
}
