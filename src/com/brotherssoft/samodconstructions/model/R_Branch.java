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
public class R_Branch implements Serializable{
    
    private int branch_id;
    private int branch_bank_id;
    private String branch_name;
    private String branch_code;
    private String branch_description;
    private String branch_address;
    private char branch_status;

    public R_Branch() {
    }

    public R_Branch(int branch_id, int branch_bank_id, String branch_name, String branch_code, String branch_description, String branch_address, char branch_status) {
        this.branch_id = branch_id;
        this.branch_bank_id = branch_bank_id;
        this.branch_name = branch_name;
        this.branch_code = branch_code;
        this.branch_description = branch_description;
        this.branch_address = branch_address;
        this.branch_status = branch_status;
    }

    /**
     * @return the branch_id
     */
    public int getBranch_id() {
        return branch_id;
    }

    /**
     * @param branch_id the branch_id to set
     */
    public void setBranch_id(int branch_id) {
        this.branch_id = branch_id;
    }

    /**
     * @return the branch_bank_id
     */
    public int getBranch_bank_id() {
        return branch_bank_id;
    }

    /**
     * @param branch_bank_id the branch_bank_id to set
     */
    public void setBranch_bank_id(int branch_bank_id) {
        this.branch_bank_id = branch_bank_id;
    }

    /**
     * @return the branch_name
     */
    public String getBranch_name() {
        return branch_name;
    }

    /**
     * @param branch_name the branch_name to set
     */
    public void setBranch_name(String branch_name) {
        this.branch_name = branch_name;
    }

    /**
     * @return the branch_code
     */
    public String getBranch_code() {
        return branch_code;
    }

    /**
     * @param branch_code the branch_code to set
     */
    public void setBranch_code(String branch_code) {
        this.branch_code = branch_code;
    }

    /**
     * @return the branch_description
     */
    public String getBranch_description() {
        return branch_description;
    }

    /**
     * @param branch_description the branch_description to set
     */
    public void setBranch_description(String branch_description) {
        this.branch_description = branch_description;
    }

    /**
     * @return the branch_address
     */
    public String getBranch_address() {
        return branch_address;
    }

    /**
     * @param branch_address the branch_address to set
     */
    public void setBranch_address(String branch_address) {
        this.branch_address = branch_address;
    }

    /**
     * @return the branch_status
     */
    public char getBranch_status() {
        return branch_status;
    }

    /**
     * @param branch_status the branch_status to set
     */
    public void setBranch_status(char branch_status) {
        this.branch_status = branch_status;
    }
    
    
    
}
