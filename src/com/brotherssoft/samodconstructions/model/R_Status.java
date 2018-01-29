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
public class R_Status implements Serializable{
    
    private String status_code;
    private String status_name;
    private int status_type;

    public R_Status() {
    }

    public R_Status(String status_code, String status_name, int status_type) {
        this.status_code = status_code;
        this.status_name = status_name;
        this.status_type = status_type;
    }

    /**
     * @return the status_code
     */
    public String getStatus_code() {
        return status_code;
    }

    /**
     * @param status_code the status_code to set
     */
    public void setStatus_code(String status_code) {
        this.status_code = status_code;
    }

    /**
     * @return the status_name
     */
    public String getStatus_name() {
        return status_name;
    }

    /**
     * @param status_name the status_name to set
     */
    public void setStatus_name(String status_name) {
        this.status_name = status_name;
    }

    /**
     * @return the status_type
     */
    public int getStatus_type() {
        return status_type;
    }

    /**
     * @param status_type the status_type to set
     */
    public void setStatus_type(int status_type) {
        this.status_type = status_type;
    }

    
}
