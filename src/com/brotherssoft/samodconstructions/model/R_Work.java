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
public class R_Work implements Serializable{
    
    private int work_id;
    private String work_name;
    private String work_description;
    private String work_status;

    public R_Work() {
    }

    public R_Work(int work_id, String work_name, String work_description, String work_status) {
        this.work_id = work_id;
        this.work_name = work_name;
        this.work_description = work_description;
        this.work_status = work_status;
    }

    /**
     * @return the work_id
     */
    public int getWork_id() {
        return work_id;
    }

    /**
     * @param work_id the work_id to set
     */
    public void setWork_id(int work_id) {
        this.work_id = work_id;
    }

    /**
     * @return the work_name
     */
    public String getWork_name() {
        return work_name;
    }

    /**
     * @param work_name the work_name to set
     */
    public void setWork_name(String work_name) {
        this.work_name = work_name;
    }

    /**
     * @return the work_description
     */
    public String getWork_description() {
        return work_description;
    }

    /**
     * @param work_description the work_description to set
     */
    public void setWork_description(String work_description) {
        this.work_description = work_description;
    }

    /**
     * @return the work_status
     */
    public String getWork_status() {
        return work_status;
    }

    /**
     * @param work_status the work_status to set
     */
    public void setWork_status(String work_status) {
        this.work_status = work_status;
    }
    
}
