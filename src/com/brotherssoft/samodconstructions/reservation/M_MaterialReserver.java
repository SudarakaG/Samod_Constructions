/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.reservation;

import com.brotherssoft.samodconstructions.controller.M_MaterialController;
import java.util.HashMap;

/**
 *
 * @author gksde
 */
public class M_MaterialReserver {
    
    private final HashMap<String, M_MaterialController> reserveData = new HashMap<>();

    public boolean reserveMaterial(String id, M_MaterialController materialController) {
        if (reserveData.containsKey(id)) {
            return  reserveData.get(id) == materialController; 
        } else {
            reserveData.put(id, materialController);
            return true;
        }
    }

    public boolean releaseMaterial(String id, M_MaterialController materialController) {
        if (reserveData.get(id) == materialController) {
            reserveData.remove(id);
            return true;

        } else {
            return false;
        }
    }
    
}
