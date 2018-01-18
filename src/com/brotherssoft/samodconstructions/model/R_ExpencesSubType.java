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
public class R_ExpencesSubType implements Serializable{
    
    private int expencesSubTytpe_id;
    private int expencesSubTytpe_expencesType_id;
    private String expencesSubTytpe_name;
    private String expencesSubTytpe_description;
    private char expencesSubTytpe_status;

    public R_ExpencesSubType() {
    }

    public R_ExpencesSubType(int expencesSubTytpe_id, int expencesSubTytpe_expencesType_id, String expencesSubTytpe_name, String expencesSubTytpe_description, char expencesSubTytpe_status) {
        this.expencesSubTytpe_id = expencesSubTytpe_id;
        this.expencesSubTytpe_expencesType_id = expencesSubTytpe_expencesType_id;
        this.expencesSubTytpe_name = expencesSubTytpe_name;
        this.expencesSubTytpe_description = expencesSubTytpe_description;
        this.expencesSubTytpe_status = expencesSubTytpe_status;
    }

    /**
     * @return the expencesSubTytpe_id
     */
    public int getExpencesSubTytpe_id() {
        return expencesSubTytpe_id;
    }

    /**
     * @param expencesSubTytpe_id the expencesSubTytpe_id to set
     */
    public void setExpencesSubTytpe_id(int expencesSubTytpe_id) {
        this.expencesSubTytpe_id = expencesSubTytpe_id;
    }

    /**
     * @return the expencesSubTytpe_expencesType_id
     */
    public int getExpencesSubTytpe_expencesType_id() {
        return expencesSubTytpe_expencesType_id;
    }

    /**
     * @param expencesSubTytpe_expencesType_id the expencesSubTytpe_expencesType_id to set
     */
    public void setExpencesSubTytpe_expencesType_id(int expencesSubTytpe_expencesType_id) {
        this.expencesSubTytpe_expencesType_id = expencesSubTytpe_expencesType_id;
    }

    /**
     * @return the expencesSubTytpe_name
     */
    public String getExpencesSubTytpe_name() {
        return expencesSubTytpe_name;
    }

    /**
     * @param expencesSubTytpe_name the expencesSubTytpe_name to set
     */
    public void setExpencesSubTytpe_name(String expencesSubTytpe_name) {
        this.expencesSubTytpe_name = expencesSubTytpe_name;
    }

    /**
     * @return the expencesSubTytpe_description
     */
    public String getExpencesSubTytpe_description() {
        return expencesSubTytpe_description;
    }

    /**
     * @param expencesSubTytpe_description the expencesSubTytpe_description to set
     */
    public void setExpencesSubTytpe_description(String expencesSubTytpe_description) {
        this.expencesSubTytpe_description = expencesSubTytpe_description;
    }

    /**
     * @return the expencesSubTytpe_status
     */
    public char getExpencesSubTytpe_status() {
        return expencesSubTytpe_status;
    }

    /**
     * @param expencesSubTytpe_status the expencesSubTytpe_status to set
     */
    public void setExpencesSubTytpe_status(char expencesSubTytpe_status) {
        this.expencesSubTytpe_status = expencesSubTytpe_status;
    }
    
    
    
}
