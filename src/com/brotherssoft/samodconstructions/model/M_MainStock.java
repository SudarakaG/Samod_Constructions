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
public class M_MainStock implements Serializable{
    
    private int mainStock_id;
    private int mainStock_site_id;
    private int mainStock_equipment_id;
    private char mainStock_allocationType;
    private Date mainStock_updateDate;
    private int mainStock_user_id;
    private double mainStock_quantity;

    public M_MainStock() {
    }

    public M_MainStock(int mainStock_id, int mainStock_site_id, int mainStock_equipment_id, char mainStock_allocationType, Date mainStock_updateDate, int mainStock_user_id, double mainStock_quantity) {
        this.mainStock_id = mainStock_id;
        this.mainStock_site_id = mainStock_site_id;
        this.mainStock_equipment_id = mainStock_equipment_id;
        this.mainStock_allocationType = mainStock_allocationType;
        this.mainStock_updateDate = mainStock_updateDate;
        this.mainStock_user_id = mainStock_user_id;
        this.mainStock_quantity = mainStock_quantity;
    }

    /**
     * @return the mainStock_id
     */
    public int getMainStock_id() {
        return mainStock_id;
    }

    /**
     * @param mainStock_id the mainStock_id to set
     */
    public void setMainStock_id(int mainStock_id) {
        this.mainStock_id = mainStock_id;
    }

    /**
     * @return the mainStock_site_id
     */
    public int getMainStock_site_id() {
        return mainStock_site_id;
    }

    /**
     * @param mainStock_site_id the mainStock_site_id to set
     */
    public void setMainStock_site_id(int mainStock_site_id) {
        this.mainStock_site_id = mainStock_site_id;
    }

    /**
     * @return the mainStock_equipment_id
     */
    public int getMainStock_equipment_id() {
        return mainStock_equipment_id;
    }

    /**
     * @param mainStock_equipment_id the mainStock_equipment_id to set
     */
    public void setMainStock_equipment_id(int mainStock_equipment_id) {
        this.mainStock_equipment_id = mainStock_equipment_id;
    }

    /**
     * @return the mainStock_allocationType
     */
    public char getMainStock_allocationType() {
        return mainStock_allocationType;
    }

    /**
     * @param mainStock_allocationType the mainStock_allocationType to set
     */
    public void setMainStock_allocationType(char mainStock_allocationType) {
        this.mainStock_allocationType = mainStock_allocationType;
    }

    /**
     * @return the mainStock_updateDate
     */
    public Date getMainStock_updateDate() {
        return mainStock_updateDate;
    }

    /**
     * @param mainStock_updateDate the mainStock_updateDate to set
     */
    public void setMainStock_updateDate(Date mainStock_updateDate) {
        this.mainStock_updateDate = mainStock_updateDate;
    }

    /**
     * @return the mainStock_user_id
     */
    public int getMainStock_user_id() {
        return mainStock_user_id;
    }

    /**
     * @param mainStock_user_id the mainStock_user_id to set
     */
    public void setMainStock_user_id(int mainStock_user_id) {
        this.mainStock_user_id = mainStock_user_id;
    }

    /**
     * @return the mainStock_quantity
     */
    public double getMainStock_quantity() {
        return mainStock_quantity;
    }

    /**
     * @param mainStock_quantity the mainStock_quantity to set
     */
    public void setMainStock_quantity(double mainStock_quantity) {
        this.mainStock_quantity = mainStock_quantity;
    }

    
    
}
