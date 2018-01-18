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
public class R_IncomeType implements Serializable{
    
    private int incomeType_id;
    private String incomeType_name;
    private String incomeType_description;
    private char incomeType_status;
    private char incomeType_transactionCategory;
    private char incomeType_transactionMode;

    public R_IncomeType() {
    }

    public R_IncomeType(int incomeType_id, String incomeType_name, String incomeType_description, char incomeType_status, char incomeType_transactionCategory, char incomeType_transactionMode) {
        this.incomeType_id = incomeType_id;
        this.incomeType_name = incomeType_name;
        this.incomeType_description = incomeType_description;
        this.incomeType_status = incomeType_status;
        this.incomeType_transactionCategory = incomeType_transactionCategory;
        this.incomeType_transactionMode = incomeType_transactionMode;
    }

    /**
     * @return the incomeType_id
     */
    public int getIncomeType_id() {
        return incomeType_id;
    }

    /**
     * @param incomeType_id the incomeType_id to set
     */
    public void setIncomeType_id(int incomeType_id) {
        this.incomeType_id = incomeType_id;
    }

    /**
     * @return the incomeType_name
     */
    public String getIncomeType_name() {
        return incomeType_name;
    }

    /**
     * @param incomeType_name the incomeType_name to set
     */
    public void setIncomeType_name(String incomeType_name) {
        this.incomeType_name = incomeType_name;
    }

    /**
     * @return the incomeType_description
     */
    public String getIncomeType_description() {
        return incomeType_description;
    }

    /**
     * @param incomeType_description the incomeType_description to set
     */
    public void setIncomeType_description(String incomeType_description) {
        this.incomeType_description = incomeType_description;
    }

    /**
     * @return the incomeType_status
     */
    public char getIncomeType_status() {
        return incomeType_status;
    }

    /**
     * @param incomeType_status the incomeType_status to set
     */
    public void setIncomeType_status(char incomeType_status) {
        this.incomeType_status = incomeType_status;
    }

    /**
     * @return the incomeType_transactionCategory
     */
    public char getIncomeType_transactionCategory() {
        return incomeType_transactionCategory;
    }

    /**
     * @param incomeType_transactionCategory the incomeType_transactionCategory to set
     */
    public void setIncomeType_transactionCategory(char incomeType_transactionCategory) {
        this.incomeType_transactionCategory = incomeType_transactionCategory;
    }

    /**
     * @return the incomeType_transactionMode
     */
    public char getIncomeType_transactionMode() {
        return incomeType_transactionMode;
    }

    /**
     * @param incomeType_transactionMode the incomeType_transactionMode to set
     */
    public void setIncomeType_transactionMode(char incomeType_transactionMode) {
        this.incomeType_transactionMode = incomeType_transactionMode;
    }
    
    
}
