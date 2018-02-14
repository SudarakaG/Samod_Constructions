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
    private String mainStock_equipment_id;
    private String mainStock_allocationType;
    private Date mainStock_updateDate;
    private int mainStock_addeduser_id;
    private double mainStock_quantity;
    private int mainStock_approveduser_id;
    private String mainStock_description;

    public M_MainStock() {
    }

    public M_MainStock(int mainStock_id, int mainStock_site_id, String mainStock_equipment_id, String mainStock_allocationType, Date mainStock_updateDate, int mainStock_addeduser_id, double mainStock_quantity, int mainStock_approveduser_id, String mainStock_description) {
        this.mainStock_id = mainStock_id;
        this.mainStock_site_id = mainStock_site_id;
        this.mainStock_equipment_id = mainStock_equipment_id;
        this.mainStock_allocationType = mainStock_allocationType;
        this.mainStock_updateDate = mainStock_updateDate;
        this.mainStock_addeduser_id = mainStock_addeduser_id;
        this.mainStock_quantity = mainStock_quantity;
        this.mainStock_approveduser_id = mainStock_approveduser_id;
        this.mainStock_description = mainStock_description;
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
    public String getMainStock_equipment_id() {
        return mainStock_equipment_id;
    }

    /**
     * @param mainStock_equipment_id the mainStock_equipment_id to set
     */
    public void setMainStock_equipment_id(String mainStock_equipment_id) {
        this.mainStock_equipment_id = mainStock_equipment_id;
    }

    /**
     * @return the mainStock_allocationType
     */
    public String getMainStock_allocationType() {
        return mainStock_allocationType;
    }

    /**
     * @param mainStock_allocationType the mainStock_allocationType to set
     */
    public void setMainStock_allocationType(String mainStock_allocationType) {
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
     * @return the mainStock_addeduser_id
     */
    public int getMainStock_addeduser_id() {
        return mainStock_addeduser_id;
    }

    /**
     * @param mainStock_addeduser_id the mainStock_addeduser_id to set
     */
    public void setMainStock_addeduser_id(int mainStock_addeduser_id) {
        this.mainStock_addeduser_id = mainStock_addeduser_id;
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

    /**
     * @return the mainStock_approveduser_id
     */
    public int getMainStock_approveduser_id() {
        return mainStock_approveduser_id;
    }

    /**
     * @param mainStock_approveduser_id the mainStock_approveduser_id to set
     */
    public void setMainStock_approveduser_id(int mainStock_approveduser_id) {
        this.mainStock_approveduser_id = mainStock_approveduser_id;
    }

    /**
     * @return the mainStock_description
     */
    public String getMainStock_description() {
        return mainStock_description;
    }

    /**
     * @param mainStock_description the mainStock_description to set
     */
    public void setMainStock_description(String mainStock_description) {
        this.mainStock_description = mainStock_description;
    }

    
}
