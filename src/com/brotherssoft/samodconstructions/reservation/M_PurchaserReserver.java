/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.reservation;

import com.brotherssoft.samodconstructions.controller.M_PurchaserController;
import java.util.HashMap;

/**
 *
 * @author gksde
 */
public class M_PurchaserReserver {
    
    private final HashMap<Integer, M_PurchaserController> reserveData = new HashMap<>();

    public boolean reservePurchaser(Integer id, M_PurchaserController purchaserController) {
        if (reserveData.containsKey(id)) {
            return  reserveData.get(id) == purchaserController; 
        } else {
            reserveData.put(id, purchaserController);
            return true;
        }
    }

    public boolean releasePurchaser(Integer id, M_PurchaserController purchaserController) {
        if (reserveData.get(id) == purchaserController) {
            reserveData.remove(id);
            return true;

        } else {
            return false;
        }
    }
    
}
