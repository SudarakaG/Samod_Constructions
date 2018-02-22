/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.reservation;

import com.brotherssoft.samodconstructions.controller.M_Project_PrimaryController;
import java.util.HashMap;

/**
 *
 * @author gksde
 */
public class M_ProjectReserver {
    
    private final HashMap<Integer, M_Project_PrimaryController> reserveData = new HashMap<>();

    public boolean reserveProject(Integer id, M_Project_PrimaryController projectController) {
        if (reserveData.containsKey(id)) {
            return  reserveData.get(id) == projectController; 
        } else {
            reserveData.put(id, projectController);
            return true;
        }
    }

    public boolean releaseProject(Integer id, M_Project_PrimaryController projectController) {
        if (reserveData.get(id) == projectController) {
            reserveData.remove(id);
            return true;

        } else {
            return false;
        }
    }
    
}
