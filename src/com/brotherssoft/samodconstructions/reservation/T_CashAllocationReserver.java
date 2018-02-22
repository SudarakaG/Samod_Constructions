/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.reservation;

import com.brotherssoft.samodconstructions.controller.T_CashAllocationController;
import java.util.HashMap;

/**
 *
 * @author gksde
 */
public class T_CashAllocationReserver {
    
    private final HashMap<Integer, T_CashAllocationController> reserveData = new HashMap<>();

    public boolean reserveCashAllocation(Integer id, T_CashAllocationController cashAllocationController) {
        if (reserveData.containsKey(id)) {
            return  reserveData.get(id) == cashAllocationController; 
        } else {
            reserveData.put(id, cashAllocationController);
            return true;
        }
    }

    public boolean releaseCashAllocation(Integer id, T_CashAllocationController cashAllocationController) {
        if (reserveData.get(id) == cashAllocationController) {
            reserveData.remove(id);
            return true;

        } else {
            return false;
        }
    }
    
}
