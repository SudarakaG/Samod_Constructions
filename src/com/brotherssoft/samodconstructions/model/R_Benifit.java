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
public class R_Benifit implements Serializable{
    
    private int benifi_id;
    private String benifit_type;
    private String benifit_description;
    private char benifit_CRDR;

    public R_Benifit() {
    }

    public R_Benifit(int benifi_id, String benifit_type, String benifit_description, char benifit_CRDR) {
        this.benifi_id = benifi_id;
        this.benifit_type = benifit_type;
        this.benifit_description = benifit_description;
        this.benifit_CRDR = benifit_CRDR;
    }

    /**
     * @return the benifi_id
     */
    public int getBenifi_id() {
        return benifi_id;
    }

    /**
     * @param benifi_id the benifi_id to set
     */
    public void setBenifi_id(int benifi_id) {
        this.benifi_id = benifi_id;
    }

    /**
     * @return the benifit_type
     */
    public String getBenifit_type() {
        return benifit_type;
    }

    /**
     * @param benifit_type the benifit_type to set
     */
    public void setBenifit_type(String benifit_type) {
        this.benifit_type = benifit_type;
    }

    /**
     * @return the benifit_description
     */
    public String getBenifit_description() {
        return benifit_description;
    }

    /**
     * @param benifit_description the benifit_description to set
     */
    public void setBenifit_description(String benifit_description) {
        this.benifit_description = benifit_description;
    }

    /**
     * @return the benifit_CRDR
     */
    public char getBenifit_CRDR() {
        return benifit_CRDR;
    }

    /**
     * @param benifit_CRDR the benifit_CRDR to set
     */
    public void setBenifit_CRDR(char benifit_CRDR) {
        this.benifit_CRDR = benifit_CRDR;
    }
    
    
    
}
