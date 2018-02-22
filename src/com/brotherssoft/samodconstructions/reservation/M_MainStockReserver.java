/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.reservation;

import com.brotherssoft.samodconstructions.controller.M_MainStockController;
import java.util.HashMap;

/**
 *
 * @author gksde
 */
public class M_MainStockReserver {
    
    private final HashMap<Integer, M_MainStockController> reserveData = new HashMap<>();

    public boolean reserveMainStock(Integer id, M_MainStockController mainStockController) {
        if (reserveData.containsKey(id)) {
            return  reserveData.get(id) == mainStockController; 
        } else {
            reserveData.put(id, mainStockController);
            return true;
        }
    }

    public boolean releaseMainStock(Integer id, M_MainStockController mainStockController) {
        if (reserveData.get(id) == mainStockController) {
            reserveData.remove(id);
            return true;

        } else {
            return false;
        }
    }
    
}
