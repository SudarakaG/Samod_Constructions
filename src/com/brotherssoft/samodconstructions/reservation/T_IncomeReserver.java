/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.reservation;

import com.brotherssoft.samodconstructions.controller.T_IncomeController;
import java.util.HashMap;

/**
 *
 * @author gksde
 */
public class T_IncomeReserver {
    private final HashMap<Integer, T_IncomeController> reserveData = new HashMap<>();

    public boolean reserveIncome(int id, T_IncomeController incomeController) {
        if (reserveData.containsKey(id)) {
            return  reserveData.get(id) == incomeController; 
        } else {
            reserveData.put(id, incomeController);
            return true;
        }
    }

    public boolean releaseIncome(int id, T_IncomeController incomeController) {
        if (reserveData.get(id) == incomeController) {
            reserveData.remove(id);
            return true;

        } else {
            return false;
        }
    }
}
