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
public class R_SalaryType implements Serializable{
    
    private int salaryType_id;
    private String salaryType_name;
    private String salaryType_status;

    public R_SalaryType() {
    }

    public R_SalaryType(int salaryType_id, String salaryType_name, String salaryType_status) {
        this.salaryType_id = salaryType_id;
        this.salaryType_name = salaryType_name;
        this.salaryType_status = salaryType_status;
    }

    /**
     * @return the salaryType_id
     */
    public int getSalaryType_id() {
        return salaryType_id;
    }

    /**
     * @param salaryType_id the salaryType_id to set
     */
    public void setSalaryType_id(int salaryType_id) {
        this.salaryType_id = salaryType_id;
    }

    /**
     * @return the salaryType_name
     */
    public String getSalaryType_name() {
        return salaryType_name;
    }

    /**
     * @param salaryType_name the salaryType_name to set
     */
    public void setSalaryType_name(String salaryType_name) {
        this.salaryType_name = salaryType_name;
    }

    /**
     * @return the salaryType_status
     */
    public String getSalaryType_status() {
        return salaryType_status;
    }

    /**
     * @param salaryType_status the salaryType_status to set
     */
    public void setSalaryType_status(String salaryType_status) {
        this.salaryType_status = salaryType_status;
    }
    
    
}
