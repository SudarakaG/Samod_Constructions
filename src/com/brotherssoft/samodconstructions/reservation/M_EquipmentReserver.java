/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.reservation;

import com.brotherssoft.samodconstructions.controller.M_EquipmentController;
import java.util.HashMap;

/**
 *
 * @author gksde
 */
public class M_EquipmentReserver {
    
    private final HashMap<String, M_EquipmentController> reserveData = new HashMap<>();

    public boolean reserveEquipment(String id, M_EquipmentController equipmentController) {
        if (reserveData.containsKey(id)) {
            return  reserveData.get(id) == equipmentController; 
        } else {
            reserveData.put(id, equipmentController);
            return true;
        }
    }

    public boolean releaseEquipment(String id, M_EquipmentController equipmentController) {
        if (reserveData.get(id) == equipmentController) {
            reserveData.remove(id);
            return true;

        } else {
            return false;
        }
    }
    
}
