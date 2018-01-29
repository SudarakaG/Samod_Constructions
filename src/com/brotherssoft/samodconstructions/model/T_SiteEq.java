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
public class T_SiteEq implements Serializable{
    
    private int siteEq_siteId;
    private Date siteEq_date;
    private int siteEq_eqId;
    private double siteEq_quantity;
    private String siteEq_trType;
    private int siteEq_addUser;
    private int siteEq_authUser;

    public T_SiteEq() {
    }

    public T_SiteEq(int siteEq_siteId, Date siteEq_date, int siteEq_eqId, double siteEq_quantity, String siteEq_trType, int siteEq_addUser, int siteEq_authUser) {
        this.siteEq_siteId = siteEq_siteId;
        this.siteEq_date = siteEq_date;
        this.siteEq_eqId = siteEq_eqId;
        this.siteEq_quantity = siteEq_quantity;
        this.siteEq_trType = siteEq_trType;
        this.siteEq_addUser = siteEq_addUser;
        this.siteEq_authUser = siteEq_authUser;
    }

    /**
     * @return the siteEq_siteId
     */
    public int getSiteEq_siteId() {
        return siteEq_siteId;
    }

    /**
     * @param siteEq_siteId the siteEq_siteId to set
     */
    public void setSiteEq_siteId(int siteEq_siteId) {
        this.siteEq_siteId = siteEq_siteId;
    }

    /**
     * @return the siteEq_date
     */
    public Date getSiteEq_date() {
        return siteEq_date;
    }

    /**
     * @param siteEq_date the siteEq_date to set
     */
    public void setSiteEq_date(Date siteEq_date) {
        this.siteEq_date = siteEq_date;
    }

    /**
     * @return the siteEq_eqId
     */
    public int getSiteEq_eqId() {
        return siteEq_eqId;
    }

    /**
     * @param siteEq_eqId the siteEq_eqId to set
     */
    public void setSiteEq_eqId(int siteEq_eqId) {
        this.siteEq_eqId = siteEq_eqId;
    }

    /**
     * @return the siteEq_quantity
     */
    public double getSiteEq_quantity() {
        return siteEq_quantity;
    }

    /**
     * @param siteEq_quantity the siteEq_quantity to set
     */
    public void setSiteEq_quantity(double siteEq_quantity) {
        this.siteEq_quantity = siteEq_quantity;
    }

    /**
     * @return the siteEq_trType
     */
    public String getSiteEq_trType() {
        return siteEq_trType;
    }

    /**
     * @param siteEq_trType the siteEq_trType to set
     */
    public void setSiteEq_trType(String siteEq_trType) {
        this.siteEq_trType = siteEq_trType;
    }

    /**
     * @return the siteEq_addUser
     */
    public int getSiteEq_addUser() {
        return siteEq_addUser;
    }

    /**
     * @param siteEq_addUser the siteEq_addUser to set
     */
    public void setSiteEq_addUser(int siteEq_addUser) {
        this.siteEq_addUser = siteEq_addUser;
    }

    /**
     * @return the siteEq_authUser
     */
    public int getSiteEq_authUser() {
        return siteEq_authUser;
    }

    /**
     * @param siteEq_authUser the siteEq_authUser to set
     */
    public void setSiteEq_authUser(int siteEq_authUser) {
        this.siteEq_authUser = siteEq_authUser;
    }
    
}
