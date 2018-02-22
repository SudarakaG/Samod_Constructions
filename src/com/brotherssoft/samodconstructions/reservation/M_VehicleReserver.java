/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.reservation;

import com.brotherssoft.samodconstructions.controller.M_VehicleController;
import java.util.HashMap;

/**
 *
 * @author gksde
 */
public class M_VehicleReserver {
    
    private final HashMap<String, M_VehicleController> reserveData = new HashMap<>();

    public boolean reserveVehicle(String id, M_VehicleController vehicleController) {
        if (reserveData.containsKey(id)) {
            return  reserveData.get(id) == vehicleController; 
        } else {
            reserveData.put(id, vehicleController);
            return true;
        }
    }

    public boolean releaseVehicle(String id, M_VehicleController vehicleController) {
        if (reserveData.get(id) == vehicleController) {
            reserveData.remove(id);
            return true;

        } else {
            return false;
        }
    }
    
}
