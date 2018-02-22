/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.reservation;

import com.brotherssoft.samodconstructions.controller.M_AccountController;
import com.brotherssoft.samodconstructions.controller.M_EmployeeController;
import java.util.HashMap;

/**
 *
 * @author gksde
 */
public class M_AccountReserver {
    
    private final HashMap<Integer, M_AccountController> reserveData = new HashMap<>();

    public boolean reserveAccount(int id, M_AccountController accountController) {
        if (reserveData.containsKey(id)) {
            return  reserveData.get(id) == accountController; 
        } else {
            reserveData.put(id, accountController);
            return true;
        }
    }

    public boolean releaseAccount(int id, M_AccountController accountController) {
        if (reserveData.get(id) == accountController) {
            reserveData.remove(id);
            return true;

        } else {
            return false;
        }
    }
    
}
