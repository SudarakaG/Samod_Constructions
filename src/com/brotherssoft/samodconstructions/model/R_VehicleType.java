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
public class R_VehicleType implements Serializable{
    
    private int vehicleType_id;
    private String vehicleType_name;
    private String vehicleType_description;
    private String vehicleType_status;

    public R_VehicleType() {
    }

    public R_VehicleType(int vehicleType_id, String vehicleType_name, String vehicleType_description, String vehicleType_status) {
        this.vehicleType_id = vehicleType_id;
        this.vehicleType_name = vehicleType_name;
        this.vehicleType_description = vehicleType_description;
        this.vehicleType_status = vehicleType_status;
    }

    /**
     * @return the vehicleType_id
     */
    public int getVehicleType_id() {
        return vehicleType_id;
    }

    /**
     * @param vehicleType_id the vehicleType_id to set
     */
    public void setVehicleType_id(int vehicleType_id) {
        this.vehicleType_id = vehicleType_id;
    }

    /**
     * @return the vehicleType_name
     */
    public String getVehicleType_name() {
        return vehicleType_name;
    }

    /**
     * @param vehicleType_name the vehicleType_name to set
     */
    public void setVehicleType_name(String vehicleType_name) {
        this.vehicleType_name = vehicleType_name;
    }

    /**
     * @return the vehicleType_description
     */
    public String getVehicleType_description() {
        return vehicleType_description;
    }

    /**
     * @param vehicleType_description the vehicleType_description to set
     */
    public void setVehicleType_description(String vehicleType_description) {
        this.vehicleType_description = vehicleType_description;
    }

    /**
     * @return the vehicleType_status
     */
    public String getVehicleType_status() {
        return vehicleType_status;
    }

    /**
     * @param vehicleType_status the vehicleType_status to set
     */
    public void setVehicleType_status(String vehicleType_status) {
        this.vehicleType_status = vehicleType_status;
    }
    
    
}
