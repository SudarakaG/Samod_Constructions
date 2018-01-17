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
public class R_Designation implements Serializable{
    
    private int designation_id;
    private String designation_name;
    private String designation_description;
    private char designation_status;
    private char designation_code;

    public R_Designation() {
    }

    public R_Designation(int designation_id, String designation_name, String designation_description, char designation_status, char designation_code) {
        this.designation_id = designation_id;
        this.designation_name = designation_name;
        this.designation_description = designation_description;
        this.designation_status = designation_status;
        this.designation_code = designation_code;
    }

    /**
     * @return the designation_id
     */
    public int getDesignation_id() {
        return designation_id;
    }

    /**
     * @param designation_id the designation_id to set
     */
    public void setDesignation_id(int designation_id) {
        this.designation_id = designation_id;
    }

    /**
     * @return the designation_name
     */
    public String getDesignation_name() {
        return designation_name;
    }

    /**
     * @param designation_name the designation_name to set
     */
    public void setDesignation_name(String designation_name) {
        this.designation_name = designation_name;
    }

    /**
     * @return the designation_description
     */
    public String getDesignation_description() {
        return designation_description;
    }

    /**
     * @param designation_description the designation_description to set
     */
    public void setDesignation_description(String designation_description) {
        this.designation_description = designation_description;
    }

    /**
     * @return the designation_status
     */
    public char getDesignation_status() {
        return designation_status;
    }

    /**
     * @param designation_status the designation_status to set
     */
    public void setDesignation_status(char designation_status) {
        this.designation_status = designation_status;
    }

    /**
     * @return the designation_code
     */
    public char getDesignation_code() {
        return designation_code;
    }

    /**
     * @param designation_code the designation_code to set
     */
    public void setDesignation_code(char designation_code) {
        this.designation_code = designation_code;
    }
    
    
    
}
