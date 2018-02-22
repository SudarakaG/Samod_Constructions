/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.reservation;

import com.brotherssoft.samodconstructions.controller.R_BankController;
import java.util.HashMap;

/**
 *
 * @author gksde
 */
public class R_BankReserver {
    
    private final HashMap<Integer, R_BankController> reserveData = new HashMap<>();

    public boolean reserveBank(Integer id, R_BankController bankController) {
        if (reserveData.containsKey(id)) {
            return  reserveData.get(id) == bankController; 
        } else {
            reserveData.put(id, bankController);
            return true;
        }
    }

    public boolean releaseBank(Integer id, R_BankController bankController) {
        if (reserveData.get(id) == bankController) {
            reserveData.remove(id);
            return true;

        } else {
            return false;
        }
    }
    
}
