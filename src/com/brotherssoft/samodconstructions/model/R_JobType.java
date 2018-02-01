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
public class R_JobType implements Serializable{
    
    private int jobType_id;
    private String jobType_name;
    private String jobType_description;
    private String jobType_status;
    private String jobType_att;

    public R_JobType() {
    }

    public R_JobType(int jobType_id, String jobType_name, String jobType_description, String jobType_status, String jobType_att) {
        this.jobType_id = jobType_id;
        this.jobType_name = jobType_name;
        this.jobType_description = jobType_description;
        this.jobType_status = jobType_status;
        this.jobType_att = jobType_att;
    }

    /**
     * @return the jobType_id
     */
    public int getJobType_id() {
        return jobType_id;
    }

    /**
     * @param jobType_id the jobType_id to set
     */
    public void setJobType_id(int jobType_id) {
        this.jobType_id = jobType_id;
    }

    /**
     * @return the jobType_name
     */
    public String getJobType_name() {
        return jobType_name;
    }

    /**
     * @param jobType_name the jobType_name to set
     */
    public void setJobType_name(String jobType_name) {
        this.jobType_name = jobType_name;
    }

    /**
     * @return the jobType_description
     */
    public String getJobType_description() {
        return jobType_description;
    }

    /**
     * @param jobType_description the jobType_description to set
     */
    public void setJobType_description(String jobType_description) {
        this.jobType_description = jobType_description;
    }

    /**
     * @return the jobType_status
     */
    public String getJobType_status() {
        return jobType_status;
    }

    /**
     * @param jobType_status the jobType_status to set
     */
    public void setJobType_status(String jobType_status) {
        this.jobType_status = jobType_status;
    }

    /**
     * @return the jobType_att
     */
    public String getJobType_att() {
        return jobType_att;
    }

    /**
     * @param jobType_att the jobType_att to set
     */
    public void setJobType_att(String jobType_att) {
        this.jobType_att = jobType_att;
    }

    
}
