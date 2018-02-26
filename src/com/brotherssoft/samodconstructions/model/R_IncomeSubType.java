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
public class R_IncomeSubType implements Serializable{

    private int incomeSubType_id;
    private int incomeSubType_incomeType_id;
    private String incomeSubType_name;
    private String incomeSubType_description;
    private String incomeSubType_status;

    public R_IncomeSubType() {
    }

    public R_IncomeSubType(int incomeSubType_id, int incomeSubType_incomeType_id, String incomeSubType_name, String incomeSubType_description, String incomeSubType_status) {
        this.incomeSubType_id = incomeSubType_id;
        this.incomeSubType_incomeType_id = incomeSubType_incomeType_id;
        this.incomeSubType_name = incomeSubType_name;
        this.incomeSubType_description = incomeSubType_description;
        this.incomeSubType_status = incomeSubType_status;
    }

    /**
     * @return the incomeSubType_id
     */
    public int getIncomeSubType_id() {
        return incomeSubType_id;
    }

    /**
     * @param incomeSubType_id the incomeSubType_id to set
     */
    public void setIncomeSubType_id(int incomeSubType_id) {
        this.incomeSubType_id = incomeSubType_id;
    }

    /**
     * @return the incomeSubType_incomeType_id
     */
    public int getIncomeSubType_incomeType_id() {
        return incomeSubType_incomeType_id;
    }

    /**
     * @param incomeSubType_incomeType_id the incomeSubType_incomeType_id to set
     */
    public void setIncomeSubType_incomeType_id(int incomeSubType_incomeType_id) {
        this.incomeSubType_incomeType_id = incomeSubType_incomeType_id;
    }

    /**
     * @return the incomeSubType_name
     */
    public String getIncomeSubType_name() {
        return incomeSubType_name;
    }

    /**
     * @param incomeSubType_name the incomeSubType_name to set
     */
    public void setIncomeSubType_name(String incomeSubType_name) {
        this.incomeSubType_name = incomeSubType_name;
    }

    /**
     * @return the incomeSubType_description
     */
    public String getIncomeSubType_description() {
        return incomeSubType_description;
    }

    /**
     * @param incomeSubType_description the incomeSubType_description to set
     */
    public void setIncomeSubType_description(String incomeSubType_description) {
        this.incomeSubType_description = incomeSubType_description;
    }

    /**
     * @return the incomeSubType_status
     */
    public String getIncomeSubType_status() {
        return incomeSubType_status;
    }

    /**
     * @param incomeSubType_status the incomeSubType_status to set
     */
    public void setIncomeSubType_status(String incomeSubType_status) {
        this.incomeSubType_status = incomeSubType_status;
    }

}
