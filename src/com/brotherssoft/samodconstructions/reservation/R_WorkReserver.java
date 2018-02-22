/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.reservation;

import com.brotherssoft.samodconstructions.controller.R_WorkController;
import java.util.HashMap;

/**
 *
 * @author gksde
 */
public class R_WorkReserver {
    
    private final HashMap<Integer, R_WorkController> reserveData = new HashMap<>();

    public boolean reserveWork(Integer id, R_WorkController workController) {
        if (reserveData.containsKey(id)) {
            return  reserveData.get(id) == workController; 
        } else {
            reserveData.put(id, workController);
            return true;
        }
    }

    public boolean releaseWork(Integer id, R_WorkController workController) {
        if (reserveData.get(id) == workController) {
            reserveData.remove(id);
            return true;

        } else {
            return false;
        }
    }
    
}
