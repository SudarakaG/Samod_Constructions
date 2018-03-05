/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.reservation;

import com.brotherssoft.samodconstructions.controller.T_AttendanceController;
import java.util.HashMap;

/**
 *
 * @author gksde
 */
public class T_AttendanceReserver {
    private final HashMap<Integer, T_AttendanceController> reserveData = new HashMap<>();

    public boolean reserveAccount(int id, T_AttendanceController attendanceController) {
        if (reserveData.containsKey(id)) {
            return  reserveData.get(id) == attendanceController; 
        } else {
            reserveData.put(id, attendanceController);
            return true;
        }
    }

    public boolean releaseAccount(int id, T_AttendanceController attendanceController) {
        if (reserveData.get(id) == attendanceController) {
            reserveData.remove(id);
            return true;

        } else {
            return false;
        }
    }
}
