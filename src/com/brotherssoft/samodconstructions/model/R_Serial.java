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
public class R_Serial implements Serializable{
    
    private int serial_id;
    private String serial_description;
    private int serial_value;

    public R_Serial() {
    }

    public R_Serial(int serial_id, String serial_description, int serial_value) {
        this.serial_id = serial_id;
        this.serial_description = serial_description;
        this.serial_value = serial_value;
    }

    /**
     * @return the serial_id
     */
    public int getSerial_id() {
        return serial_id;
    }

    /**
     * @param serial_id the serial_id to set
     */
    public void setSerial_id(int serial_id) {
        this.serial_id = serial_id;
    }

    /**
     * @return the serial_description
     */
    public String getSerial_description() {
        return serial_description;
    }

    /**
     * @param serial_description the serial_description to set
     */
    public void setSerial_description(String serial_description) {
        this.serial_description = serial_description;
    }

    /**
     * @return the serial_value
     */
    public int getSerial_value() {
        return serial_value;
    }

    /**
     * @param serial_value the serial_value to set
     */
    public void setSerial_value(int serial_value) {
        this.serial_value = serial_value;
    }
    
    
}
