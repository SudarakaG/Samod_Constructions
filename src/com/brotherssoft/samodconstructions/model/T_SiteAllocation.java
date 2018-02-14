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
public class T_SiteAllocation implements Serializable{
    
    private int siteAllocation_id;
    private int siteAllocation_siteId;
    private Date siteAllocation_date;
    private String siteAllocation_type;
    private String siteAllocation_itemId;
    private double siteAllocation_quantity;
    private String siteAllocation_comment;
    private String siteAllocation_TRType;
    private int siteAllocation_addedUser;
    private int siteAllocation_authorizedUser;

    public T_SiteAllocation() {
    }

    public T_SiteAllocation(int siteAllocation_id, int siteAllocation_siteId, Date siteAllocation_date, String siteAllocation_type, String siteAllocation_itemId, double siteAllocation_quantity, String siteAllocation_comment, String siteAllocation_TRType, int siteAllocation_addedUser, int siteAllocation_authorizedUser) {
        this.siteAllocation_id = siteAllocation_id;
        this.siteAllocation_siteId = siteAllocation_siteId;
        this.siteAllocation_date = siteAllocation_date;
        this.siteAllocation_type = siteAllocation_type;
        this.siteAllocation_itemId = siteAllocation_itemId;
        this.siteAllocation_quantity = siteAllocation_quantity;
        this.siteAllocation_comment = siteAllocation_comment;
        this.siteAllocation_TRType = siteAllocation_TRType;
        this.siteAllocation_addedUser = siteAllocation_addedUser;
        this.siteAllocation_authorizedUser = siteAllocation_authorizedUser;
    }

    /**
     * @return the siteAllocation_id
     */
    public int getSiteAllocation_id() {
        return siteAllocation_id;
    }

    /**
     * @param siteAllocation_id the siteAllocation_id to set
     */
    public void setSiteAllocation_id(int siteAllocation_id) {
        this.siteAllocation_id = siteAllocation_id;
    }

    /**
     * @return the siteAllocation_siteId
     */
    public int getSiteAllocation_siteId() {
        return siteAllocation_siteId;
    }

    /**
     * @param siteAllocation_siteId the siteAllocation_siteId to set
     */
    public void setSiteAllocation_siteId(int siteAllocation_siteId) {
        this.siteAllocation_siteId = siteAllocation_siteId;
    }

    /**
     * @return the siteAllocation_date
     */
    public Date getSiteAllocation_date() {
        return siteAllocation_date;
    }

    /**
     * @param siteAllocation_date the siteAllocation_date to set
     */
    public void setSiteAllocation_date(Date siteAllocation_date) {
        this.siteAllocation_date = siteAllocation_date;
    }

    /**
     * @return the siteAllocation_type
     */
    public String getSiteAllocation_type() {
        return siteAllocation_type;
    }

    /**
     * @param siteAllocation_type the siteAllocation_type to set
     */
    public void setSiteAllocation_type(String siteAllocation_type) {
        this.siteAllocation_type = siteAllocation_type;
    }

    /**
     * @return the siteAllocation_itemId
     */
    public String getSiteAllocation_itemId() {
        return siteAllocation_itemId;
    }

    /**
     * @param siteAllocation_itemId the siteAllocation_itemId to set
     */
    public void setSiteAllocation_itemId(String siteAllocation_itemId) {
        this.siteAllocation_itemId = siteAllocation_itemId;
    }

    /**
     * @return the siteAllocation_quantity
     */
    public double getSiteAllocation_quantity() {
        return siteAllocation_quantity;
    }

    /**
     * @param siteAllocation_quantity the siteAllocation_quantity to set
     */
    public void setSiteAllocation_quantity(double siteAllocation_quantity) {
        this.siteAllocation_quantity = siteAllocation_quantity;
    }

    /**
     * @return the siteAllocation_comment
     */
    public String getSiteAllocation_comment() {
        return siteAllocation_comment;
    }

    /**
     * @param siteAllocation_comment the siteAllocation_comment to set
     */
    public void setSiteAllocation_comment(String siteAllocation_comment) {
        this.siteAllocation_comment = siteAllocation_comment;
    }

    /**
     * @return the siteAllocation_TRType
     */
    public String getSiteAllocation_TRType() {
        return siteAllocation_TRType;
    }

    /**
     * @param siteAllocation_TRType the siteAllocation_TRType to set
     */
    public void setSiteAllocation_TRType(String siteAllocation_TRType) {
        this.siteAllocation_TRType = siteAllocation_TRType;
    }

    /**
     * @return the siteAllocation_addedUser
     */
    public int getSiteAllocation_addedUser() {
        return siteAllocation_addedUser;
    }

    /**
     * @param siteAllocation_addedUser the siteAllocation_addedUser to set
     */
    public void setSiteAllocation_addedUser(int siteAllocation_addedUser) {
        this.siteAllocation_addedUser = siteAllocation_addedUser;
    }

    /**
     * @return the siteAllocation_authorizedUser
     */
    public int getSiteAllocation_authorizedUser() {
        return siteAllocation_authorizedUser;
    }

    /**
     * @param siteAllocation_authorizedUser the siteAllocation_authorizedUser to set
     */
    public void setSiteAllocation_authorizedUser(int siteAllocation_authorizedUser) {
        this.siteAllocation_authorizedUser = siteAllocation_authorizedUser;
    }

    
}
