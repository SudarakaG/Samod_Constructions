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
public class M_Vehicle implements Serializable{
    
    private String vehicle_id;
    private String vehicle_regNo;
    private int vehicle_type_id;
    private String vehicle_engineNo;
    private String vehicle_chasisNo;
    private String vehicle_year;
    private double vehicle_amount;
    private double vehicle_depreciationRate;
    private String vehicle_status;
    private int vehicle_fuelType;
    private String vehicle_allocatrionStatus;

    public M_Vehicle() {
    }

    public M_Vehicle(String vehicle_id, String vehicle_regNo, int vehicle_type_id, String vehicle_engineNo, String vehicle_chasisNo, String vehicle_year, double vehicle_amount, double vehicle_depreciationRate, String vehicle_status, int vehicle_fuelType, String vehicle_allocatrionStatus) {
        this.vehicle_id = vehicle_id;
        this.vehicle_regNo = vehicle_regNo;
        this.vehicle_type_id = vehicle_type_id;
        this.vehicle_engineNo = vehicle_engineNo;
        this.vehicle_chasisNo = vehicle_chasisNo;
        this.vehicle_year = vehicle_year;
        this.vehicle_amount = vehicle_amount;
        this.vehicle_depreciationRate = vehicle_depreciationRate;
        this.vehicle_status = vehicle_status;
        this.vehicle_fuelType = vehicle_fuelType;
        this.vehicle_allocatrionStatus = vehicle_allocatrionStatus;
    }

    /**
     * @return the vehicle_id
     */
    public String getVehicle_id() {
        return vehicle_id;
    }

    /**
     * @param vehicle_id the vehicle_id to set
     */
    public void setVehicle_id(String vehicle_id) {
        this.vehicle_id = vehicle_id;
    }

    /**
     * @return the vehicle_regNo
     */
    public String getVehicle_regNo() {
        return vehicle_regNo;
    }

    /**
     * @param vehicle_regNo the vehicle_regNo to set
     */
    public void setVehicle_regNo(String vehicle_regNo) {
        this.vehicle_regNo = vehicle_regNo;
    }

    /**
     * @return the vehicle_type_id
     */
    public int getVehicle_type_id() {
        return vehicle_type_id;
    }

    /**
     * @param vehicle_type_id the vehicle_type_id to set
     */
    public void setVehicle_type_id(int vehicle_type_id) {
        this.vehicle_type_id = vehicle_type_id;
    }

    /**
     * @return the vehicle_engineNo
     */
    public String getVehicle_engineNo() {
        return vehicle_engineNo;
    }

    /**
     * @param vehicle_engineNo the vehicle_engineNo to set
     */
    public void setVehicle_engineNo(String vehicle_engineNo) {
        this.vehicle_engineNo = vehicle_engineNo;
    }

    /**
     * @return the vehicle_chasisNo
     */
    public String getVehicle_chasisNo() {
        return vehicle_chasisNo;
    }

    /**
     * @param vehicle_chasisNo the vehicle_chasisNo to set
     */
    public void setVehicle_chasisNo(String vehicle_chasisNo) {
        this.vehicle_chasisNo = vehicle_chasisNo;
    }

    /**
     * @return the vehicle_year
     */
    public String getVehicle_year() {
        return vehicle_year;
    }

    /**
     * @param vehicle_year the vehicle_year to set
     */
    public void setVehicle_year(String vehicle_year) {
        this.vehicle_year = vehicle_year;
    }

    /**
     * @return the vehicle_amount
     */
    public double getVehicle_amount() {
        return vehicle_amount;
    }

    /**
     * @param vehicle_amount the vehicle_amount to set
     */
    public void setVehicle_amount(double vehicle_amount) {
        this.vehicle_amount = vehicle_amount;
    }

    /**
     * @return the vehicle_depreciationRate
     */
    public double getVehicle_depreciationRate() {
        return vehicle_depreciationRate;
    }

    /**
     * @param vehicle_depreciationRate the vehicle_depreciationRate to set
     */
    public void setVehicle_depreciationRate(double vehicle_depreciationRate) {
        this.vehicle_depreciationRate = vehicle_depreciationRate;
    }

    /**
     * @return the vehicle_status
     */
    public String getVehicle_status() {
        return vehicle_status;
    }

    /**
     * @param vehicle_status the vehicle_status to set
     */
    public void setVehicle_status(String vehicle_status) {
        this.vehicle_status = vehicle_status;
    }

    /**
     * @return the vehicle_fuelType
     */
    public int getVehicle_fuelType() {
        return vehicle_fuelType;
    }

    /**
     * @param vehicle_fuelType the vehicle_fuelType to set
     */
    public void setVehicle_fuelType(int vehicle_fuelType) {
        this.vehicle_fuelType = vehicle_fuelType;
    }

    /**
     * @return the vehicle_allocatrionStatus
     */
    public String getVehicle_allocatrionStatus() {
        return vehicle_allocatrionStatus;
    }

    /**
     * @param vehicle_allocatrionStatus the vehicle_allocatrionStatus to set
     */
    public void setVehicle_allocatrionStatus(String vehicle_allocatrionStatus) {
        this.vehicle_allocatrionStatus = vehicle_allocatrionStatus;
    }

    
}
