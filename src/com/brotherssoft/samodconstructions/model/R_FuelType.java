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
public class R_FuelType implements Serializable{
    
    private int fuel_id;
    private String fuel_name;
    private String fuel_description;
    private char fuel_status;

    public R_FuelType() {
    }

    public R_FuelType(int fuel_id, String fuel_name, String fuel_description, char fuel_status) {
        this.fuel_id = fuel_id;
        this.fuel_name = fuel_name;
        this.fuel_description = fuel_description;
        this.fuel_status = fuel_status;
    }

    /**
     * @return the fuel_id
     */
    public int getFuel_id() {
        return fuel_id;
    }

    /**
     * @param fuel_id the fuel_id to set
     */
    public void setFuel_id(int fuel_id) {
        this.fuel_id = fuel_id;
    }

    /**
     * @return the fuel_name
     */
    public String getFuel_name() {
        return fuel_name;
    }

    /**
     * @param fuel_name the fuel_name to set
     */
    public void setFuel_name(String fuel_name) {
        this.fuel_name = fuel_name;
    }

    /**
     * @return the fuel_description
     */
    public String getFuel_description() {
        return fuel_description;
    }

    /**
     * @param fuel_description the fuel_description to set
     */
    public void setFuel_description(String fuel_description) {
        this.fuel_description = fuel_description;
    }

    /**
     * @return the fuel_status
     */
    public char getFuel_status() {
        return fuel_status;
    }

    /**
     * @param fuel_status the fuel_status to set
     */
    public void setFuel_status(char fuel_status) {
        this.fuel_status = fuel_status;
    }
    
    
    
}
