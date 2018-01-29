/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.model;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author gksde
 */
public class T_Runchart implements Serializable{
    
    private int runchart_id;
    private int runchart_vehicleId;
    private Date runchart_date;
    private String runchart_description;
    private double runchart_odoStart;
    private double runchart_odoEnd;
    private Date runchart_timeStart;
    private Date runchart_timeEnd;
    private double runchart_fuelOdoMeter;
    private double runchart_fuelQuantity;
    private double runchart_fuelPrice;
    private String runchart_status;

    public T_Runchart() {
    }

    public T_Runchart(int runchart_id, int runchart_vehicleId, Date runchart_date, String runchart_description, double runchart_odoStart, double runchart_odoEnd, Date runchart_timeStart, Date runchart_timeEnd, double runchart_fuelOdoMeter, double runchart_fuelQuantity, double runchart_fuelPrice, String runchart_status) {
        this.runchart_id = runchart_id;
        this.runchart_vehicleId = runchart_vehicleId;
        this.runchart_date = runchart_date;
        this.runchart_description = runchart_description;
        this.runchart_odoStart = runchart_odoStart;
        this.runchart_odoEnd = runchart_odoEnd;
        this.runchart_timeStart = runchart_timeStart;
        this.runchart_timeEnd = runchart_timeEnd;
        this.runchart_fuelOdoMeter = runchart_fuelOdoMeter;
        this.runchart_fuelQuantity = runchart_fuelQuantity;
        this.runchart_fuelPrice = runchart_fuelPrice;
        this.runchart_status = runchart_status;
    }

    /**
     * @return the runchart_id
     */
    public int getRunchart_id() {
        return runchart_id;
    }

    /**
     * @param runchart_id the runchart_id to set
     */
    public void setRunchart_id(int runchart_id) {
        this.runchart_id = runchart_id;
    }

    /**
     * @return the runchart_vehicleId
     */
    public int getRunchart_vehicleId() {
        return runchart_vehicleId;
    }

    /**
     * @param runchart_vehicleId the runchart_vehicleId to set
     */
    public void setRunchart_vehicleId(int runchart_vehicleId) {
        this.runchart_vehicleId = runchart_vehicleId;
    }

    /**
     * @return the runchart_date
     */
    public Date getRunchart_date() {
        return runchart_date;
    }

    /**
     * @param runchart_date the runchart_date to set
     */
    public void setRunchart_date(Date runchart_date) {
        this.runchart_date = runchart_date;
    }

    /**
     * @return the runchart_description
     */
    public String getRunchart_description() {
        return runchart_description;
    }

    /**
     * @param runchart_description the runchart_description to set
     */
    public void setRunchart_description(String runchart_description) {
        this.runchart_description = runchart_description;
    }

    /**
     * @return the runchart_odoStart
     */
    public double getRunchart_odoStart() {
        return runchart_odoStart;
    }

    /**
     * @param runchart_odoStart the runchart_odoStart to set
     */
    public void setRunchart_odoStart(double runchart_odoStart) {
        this.runchart_odoStart = runchart_odoStart;
    }

    /**
     * @return the runchart_odoEnd
     */
    public double getRunchart_odoEnd() {
        return runchart_odoEnd;
    }

    /**
     * @param runchart_odoEnd the runchart_odoEnd to set
     */
    public void setRunchart_odoEnd(double runchart_odoEnd) {
        this.runchart_odoEnd = runchart_odoEnd;
    }

    /**
     * @return the runchart_timeStart
     */
    public Date getRunchart_timeStart() {
        return runchart_timeStart;
    }

    /**
     * @param runchart_timeStart the runchart_timeStart to set
     */
    public void setRunchart_timeStart(Date runchart_timeStart) {
        this.runchart_timeStart = runchart_timeStart;
    }

    /**
     * @return the runchart_timeEnd
     */
    public Date getRunchart_timeEnd() {
        return runchart_timeEnd;
    }

    /**
     * @param runchart_timeEnd the runchart_timeEnd to set
     */
    public void setRunchart_timeEnd(Date runchart_timeEnd) {
        this.runchart_timeEnd = runchart_timeEnd;
    }

    /**
     * @return the runchart_fuelOdoMeter
     */
    public double getRunchart_fuelOdoMeter() {
        return runchart_fuelOdoMeter;
    }

    /**
     * @param runchart_fuelOdoMeter the runchart_fuelOdoMeter to set
     */
    public void setRunchart_fuelOdoMeter(double runchart_fuelOdoMeter) {
        this.runchart_fuelOdoMeter = runchart_fuelOdoMeter;
    }

    /**
     * @return the runchart_fuelQuantity
     */
    public double getRunchart_fuelQuantity() {
        return runchart_fuelQuantity;
    }

    /**
     * @param runchart_fuelQuantity the runchart_fuelQuantity to set
     */
    public void setRunchart_fuelQuantity(double runchart_fuelQuantity) {
        this.runchart_fuelQuantity = runchart_fuelQuantity;
    }

    /**
     * @return the runchart_fuelPrice
     */
    public double getRunchart_fuelPrice() {
        return runchart_fuelPrice;
    }

    /**
     * @param runchart_fuelPrice the runchart_fuelPrice to set
     */
    public void setRunchart_fuelPrice(double runchart_fuelPrice) {
        this.runchart_fuelPrice = runchart_fuelPrice;
    }

    /**
     * @return the runchart_status
     */
    public String getRunchart_status() {
        return runchart_status;
    }

    /**
     * @param runchart_status the runchart_status to set
     */
    public void setRunchart_status(String runchart_status) {
        this.runchart_status = runchart_status;
    }
    
}
