/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.reservation;

import com.brotherssoft.samodconstructions.controller.T_ExpencesController;
import java.util.HashMap;

/**
 *
 * @author gksde
 */
public class T_ExpenceReserver {
    private final HashMap<Integer, T_ExpencesController> reserveData = new HashMap<>();

    public boolean reserveExpence(int id, T_ExpencesController expencesController) {
        if (reserveData.containsKey(id)) {
            return  reserveData.get(id) == expencesController; 
        } else {
            reserveData.put(id, expencesController);
            return true;
        }
    }

    public boolean releaseExpence(int id, T_ExpencesController expencesController) {
        if (reserveData.get(id) == expencesController) {
            reserveData.remove(id);
            return true;

        } else {
            return false;
        }
    }
}
