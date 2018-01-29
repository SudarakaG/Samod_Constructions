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
public class R_SiteStatus implements Serializable{
    
    private int siteStatus_id;
    private String siteStatus_code;
    private String siteStatus_name;

    public R_SiteStatus() {
    }

    public R_SiteStatus(int siteStatus_id, String siteStatus_code, String siteStatus_name) {
        this.siteStatus_id = siteStatus_id;
        this.siteStatus_code = siteStatus_code;
        this.siteStatus_name = siteStatus_name;
    }

    /**
     * @return the siteStatus_id
     */
    public int getSiteStatus_id() {
        return siteStatus_id;
    }

    /**
     * @param siteStatus_id the siteStatus_id to set
     */
    public void setSiteStatus_id(int siteStatus_id) {
        this.siteStatus_id = siteStatus_id;
    }

    /**
     * @return the siteStatus_code
     */
    public String getSiteStatus_code() {
        return siteStatus_code;
    }

    /**
     * @param siteStatus_code the siteStatus_code to set
     */
    public void setSiteStatus_code(String siteStatus_code) {
        this.siteStatus_code = siteStatus_code;
    }

    /**
     * @return the siteStatus_name
     */
    public String getSiteStatus_name() {
        return siteStatus_name;
    }

    /**
     * @param siteStatus_name the siteStatus_name to set
     */
    public void setSiteStatus_name(String siteStatus_name) {
        this.siteStatus_name = siteStatus_name;
    }
    
    
}
