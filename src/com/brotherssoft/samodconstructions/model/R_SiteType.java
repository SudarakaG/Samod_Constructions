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
public class R_SiteType implements Serializable{
    
    private int siteType_id;
    private String siteType_code;
    private String siteType_name;
    private String siteType_status;

    public R_SiteType() {
    }

    public R_SiteType(int siteType_id, String siteType_code, String siteType_name, String siteType_status) {
        this.siteType_id = siteType_id;
        this.siteType_code = siteType_code;
        this.siteType_name = siteType_name;
        this.siteType_status = siteType_status;
    }

    /**
     * @return the siteType_id
     */
    public int getSiteType_id() {
        return siteType_id;
    }

    /**
     * @param siteType_id the siteType_id to set
     */
    public void setSiteType_id(int siteType_id) {
        this.siteType_id = siteType_id;
    }

    /**
     * @return the siteType_code
     */
    public String getSiteType_code() {
        return siteType_code;
    }

    /**
     * @param siteType_code the siteType_code to set
     */
    public void setSiteType_code(String siteType_code) {
        this.siteType_code = siteType_code;
    }

    /**
     * @return the siteType_name
     */
    public String getSiteType_name() {
        return siteType_name;
    }

    /**
     * @param siteType_name the siteType_name to set
     */
    public void setSiteType_name(String siteType_name) {
        this.siteType_name = siteType_name;
    }

    /**
     * @return the siteType_status
     */
    public String getSiteType_status() {
        return siteType_status;
    }

    /**
     * @param siteType_status the siteType_status to set
     */
    public void setSiteType_status(String siteType_status) {
        this.siteType_status = siteType_status;
    }
    
    
}
