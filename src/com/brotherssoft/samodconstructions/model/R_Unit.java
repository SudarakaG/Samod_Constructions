/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.model;

import java.io.Serializable;

/**
 *
 * @author gksde
 */
public class R_Unit implements Serializable{
    
    private int unit_id;
    private String unit_name;
    private String unit_description;

    public R_Unit() {
    }

    public R_Unit(int unit_id, String unit_name, String unit_description) {
        this.unit_id = unit_id;
        this.unit_name = unit_name;
        this.unit_description = unit_description;
    }

    /**
     * @return the unit_id
     */
    public int getUnit_id() {
        return unit_id;
    }

    /**
     * @param unit_id the unit_id to set
     */
    public void setUnit_id(int unit_id) {
        this.unit_id = unit_id;
    }

    /**
     * @return the unit_name
     */
    public String getUnit_name() {
        return unit_name;
    }

    /**
     * @param unit_name the unit_name to set
     */
    public void setUnit_name(String unit_name) {
        this.unit_name = unit_name;
    }

    /**
     * @return the unit_description
     */
    public String getUnit_description() {
        return unit_description;
    }

    /**
     * @param unit_description the unit_description to set
     */
    public void setUnit_description(String unit_description) {
        this.unit_description = unit_description;
    }
    
    
}
