/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.reservation;

import com.brotherssoft.samodconstructions.controller.T_RunchartController;
import java.util.HashMap;

/**
 *
 * @author gksde
 */
public class T_RunchartReserver {
    
    private final HashMap<Integer, T_RunchartController> reserveData = new HashMap<>();

    public boolean reserveRunchart(Integer id, T_RunchartController runchartController) {
        if (reserveData.containsKey(id)) {
            return  reserveData.get(id) == runchartController; 
        } else {
            reserveData.put(id, runchartController);
            return true;
        }
    }

    public boolean releaseRunchart(Integer id, T_RunchartController runchartController) {
        if (reserveData.get(id) == runchartController) {
            reserveData.remove(id);
            return true;

        } else {
            return false;
        }
    }
    
}
