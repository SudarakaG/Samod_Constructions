/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.reservation;

import com.brotherssoft.samodconstructions.controller.M_EmployeeController;
import java.util.HashMap;

/**
 *
 * @author gksde
 */
public class M_EmployeeReserver {
    
    private final HashMap<Integer, M_EmployeeController> reserveData = new HashMap<>();

    public boolean reserveEmployee(int id, M_EmployeeController employeeController) {
        if (reserveData.containsKey(id)) {
            return  reserveData.get(id) == employeeController; 
        } else {
            reserveData.put(id, employeeController);
            return true;
        }
    }

    public boolean releaseEmployee(int id, M_EmployeeController employeeController) {
        if (reserveData.get(id) == employeeController) {
            reserveData.remove(id);
            return true;

        } else {
            return false;
        }
    }
    
}
