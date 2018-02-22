/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.reservation;

import com.brotherssoft.samodconstructions.controller.R_BranchController;
import java.util.HashMap;

/**
 *
 * @author gksde
 */
public class R_BranchReserver {
    
    private final HashMap<Integer, R_BranchController> reserveData = new HashMap<>();

    public boolean reserveBranch(Integer id, R_BranchController branchController) {
        if (reserveData.containsKey(id)) {
            return  reserveData.get(id) == branchController; 
        } else {
            reserveData.put(id, branchController);
            return true;
        }
    }

    public boolean releaseBranch(Integer id, R_BranchController branchController) {
        if (reserveData.get(id) == branchController) {
            reserveData.remove(id);
            return true;

        } else {
            return false;
        }
    }
    
}
