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
public class R_Bank implements Serializable{
    
    private int bank_id;
    private String bank_name;
    private String bank_code;
    private String bank_description;
    private char bank_status;

    public R_Bank() {
    }

    public R_Bank(int bank_id, String bank_name, String bank_code, String bank_description, char bank_status) {
        this.bank_id = bank_id;
        this.bank_name = bank_name;
        this.bank_code = bank_code;
        this.bank_description = bank_description;
        this.bank_status = bank_status;
    }

    /**
     * @return the bank_id
     */
    public int getBank_id() {
        return bank_id;
    }

    /**
     * @param bank_id the bank_id to set
     */
    public void setBank_id(int bank_id) {
        this.bank_id = bank_id;
    }

    /**
     * @return the bank_name
     */
    public String getBank_name() {
        return bank_name;
    }

    /**
     * @param bank_name the bank_name to set
     */
    public void setBank_name(String bank_name) {
        this.bank_name = bank_name;
    }

    /**
     * @return the bank_code
     */
    public String getBank_code() {
        return bank_code;
    }

    /**
     * @param bank_code the bank_code to set
     */
    public void setBank_code(String bank_code) {
        this.bank_code = bank_code;
    }

    /**
     * @return the bank_description
     */
    public String getBank_description() {
        return bank_description;
    }

    /**
     * @param bank_description the bank_description to set
     */
    public void setBank_description(String bank_description) {
        this.bank_description = bank_description;
    }

    /**
     * @return the bank_status
     */
    public char getBank_status() {
        return bank_status;
    }

    /**
     * @param bank_status the bank_status to set
     */
    public void setBank_status(char bank_status) {
        this.bank_status = bank_status;
    }
    
    
    
}
