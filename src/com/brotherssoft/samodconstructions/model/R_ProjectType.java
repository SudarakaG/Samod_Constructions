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
public class R_ProjectType implements Serializable{
    
    private int projectType_id;
    private String projectType_code;
    private String projectType_name;
    private String projectType_status;

    public R_ProjectType() {
    }

    public R_ProjectType(int projectType_id, String projectType_code, String projectType_name, String projectType_status) {
        this.projectType_id = projectType_id;
        this.projectType_code = projectType_code;
        this.projectType_name = projectType_name;
        this.projectType_status = projectType_status;
    }

    /**
     * @return the projectType_id
     */
    public int getProjectType_id() {
        return projectType_id;
    }

    /**
     * @param projectType_id the projectType_id to set
     */
    public void setProjectType_id(int projectType_id) {
        this.projectType_id = projectType_id;
    }

    /**
     * @return the projectType_code
     */
    public String getProjectType_code() {
        return projectType_code;
    }

    /**
     * @param projectType_code the projectType_code to set
     */
    public void setProjectType_code(String projectType_code) {
        this.projectType_code = projectType_code;
    }

    /**
     * @return the projectType_name
     */
    public String getProjectType_name() {
        return projectType_name;
    }

    /**
     * @param projectType_name the projectType_name to set
     */
    public void setProjectType_name(String projectType_name) {
        this.projectType_name = projectType_name;
    }

    /**
     * @return the projectType_status
     */
    public String getProjectType_status() {
        return projectType_status;
    }

    /**
     * @param projectType_status the projectType_status to set
     */
    public void setProjectType_status(String projectType_status) {
        this.projectType_status = projectType_status;
    }
    
    
}
