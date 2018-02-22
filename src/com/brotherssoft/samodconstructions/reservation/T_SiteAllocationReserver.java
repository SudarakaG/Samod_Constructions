/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.reservation;

import com.brotherssoft.samodconstructions.controller.T_SiteAllocationController;
import java.util.HashMap;

/**
 *
 * @author gksde
 */
public class T_SiteAllocationReserver {
    
    private final HashMap<Integer, T_SiteAllocationController> reserveData = new HashMap<>();

    public boolean reserveSiteAllocation(Integer id, T_SiteAllocationController siteAllocationController) {
        if (reserveData.containsKey(id)) {
            return  reserveData.get(id) == siteAllocationController; 
        } else {
            reserveData.put(id, siteAllocationController);
            return true;
        }
    }

    public boolean releaseSiteAllocation(Integer id, T_SiteAllocationController siteAllocationController) {
        if (reserveData.get(id) == siteAllocationController) {
            reserveData.remove(id);
            return true;

        } else {
            return false;
        }
    }
    
}
