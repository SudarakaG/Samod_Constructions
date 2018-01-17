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
public class R_AccountType implements Serializable{
    
    private int accountType_id;
    private String accountType_name;
    private char accountType_code;
    private String accountType_description;
    private char accountType_status;

    public R_AccountType() {
    }

    public R_AccountType(int accountType_id, String accountType_name, char accountType_code, String accountType_description, char accountType_status) {
        this.accountType_id = accountType_id;
        this.accountType_name = accountType_name;
        this.accountType_code = accountType_code;
        this.accountType_description = accountType_description;
        this.accountType_status = accountType_status;
    }

    /**
     * @return the accountType_id
     */
    public int getAccountType_id() {
        return accountType_id;
    }

    /**
     * @param accountType_id the accountType_id to set
     */
    public void setAccountType_id(int accountType_id) {
        this.accountType_id = accountType_id;
    }

    /**
     * @return the accountType_name
     */
    public String getAccountType_name() {
        return accountType_name;
    }

    /**
     * @param accountType_name the accountType_name to set
     */
    public void setAccountType_name(String accountType_name) {
        this.accountType_name = accountType_name;
    }

    /**
     * @return the accountType_code
     */
    public char getAccountType_code() {
        return accountType_code;
    }

    /**
     * @param accountType_code the accountType_code to set
     */
    public void setAccountType_code(char accountType_code) {
        this.accountType_code = accountType_code;
    }

    /**
     * @return the accountType_description
     */
    public String getAccountType_description() {
        return accountType_description;
    }

    /**
     * @param accountType_description the accountType_description to set
     */
    public void setAccountType_description(String accountType_description) {
        this.accountType_description = accountType_description;
    }

    /**
     * @return the accountType_status
     */
    public char getAccountType_status() {
        return accountType_status;
    }

    /**
     * @param accountType_status the accountType_status to set
     */
    public void setAccountType_status(char accountType_status) {
        this.accountType_status = accountType_status;
    }
    
    
    
}
