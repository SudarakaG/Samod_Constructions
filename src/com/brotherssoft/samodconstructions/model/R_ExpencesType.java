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
public class R_ExpencesType implements Serializable{
    
    private int expencesType_id;
    private String expencesType_name;
    private String expencesType_description;
    private String expencesType_status;
    private String expencesType_type;
    private String expencesType_transactionCategory;
    private String expencesType_transactionMode;

    public R_ExpencesType() {
    }

    public R_ExpencesType(int expencesType_id, String expencesType_name, String expencesType_description, String expencesType_status, String expencesType_type, String expencesType_transactionCategory, String expencesType_transactionMode) {
        this.expencesType_id = expencesType_id;
        this.expencesType_name = expencesType_name;
        this.expencesType_description = expencesType_description;
        this.expencesType_status = expencesType_status;
        this.expencesType_type = expencesType_type;
        this.expencesType_transactionCategory = expencesType_transactionCategory;
        this.expencesType_transactionMode = expencesType_transactionMode;
    }

    /**
     * @return the expencesType_id
     */
    public int getExpencesType_id() {
        return expencesType_id;
    }

    /**
     * @param expencesType_id the expencesType_id to set
     */
    public void setExpencesType_id(int expencesType_id) {
        this.expencesType_id = expencesType_id;
    }

    /**
     * @return the expencesType_name
     */
    public String getExpencesType_name() {
        return expencesType_name;
    }

    /**
     * @param expencesType_name the expencesType_name to set
     */
    public void setExpencesType_name(String expencesType_name) {
        this.expencesType_name = expencesType_name;
    }

    /**
     * @return the expencesType_description
     */
    public String getExpencesType_description() {
        return expencesType_description;
    }

    /**
     * @param expencesType_description the expencesType_description to set
     */
    public void setExpencesType_description(String expencesType_description) {
        this.expencesType_description = expencesType_description;
    }

    /**
     * @return the expencesType_status
     */
    public String getExpencesType_status() {
        return expencesType_status;
    }

    /**
     * @param expencesType_status the expencesType_status to set
     */
    public void setExpencesType_status(String expencesType_status) {
        this.expencesType_status = expencesType_status;
    }

    /**
     * @return the expencesType_type
     */
    public String getExpencesType_type() {
        return expencesType_type;
    }

    /**
     * @param expencesType_type the expencesType_type to set
     */
    public void setExpencesType_type(String expencesType_type) {
        this.expencesType_type = expencesType_type;
    }

    /**
     * @return the expencesType_transactionCategory
     */
    public String getExpencesType_transactionCategory() {
        return expencesType_transactionCategory;
    }

    /**
     * @param expencesType_transactionCategory the expencesType_transactionCategory to set
     */
    public void setExpencesType_transactionCategory(String expencesType_transactionCategory) {
        this.expencesType_transactionCategory = expencesType_transactionCategory;
    }

    /**
     * @return the expencesType_transactionMode
     */
    public String getExpencesType_transactionMode() {
        return expencesType_transactionMode;
    }

    /**
     * @param expencesType_transactionMode the expencesType_transactionMode to set
     */
    public void setExpencesType_transactionMode(String expencesType_transactionMode) {
        this.expencesType_transactionMode = expencesType_transactionMode;
    }

}
