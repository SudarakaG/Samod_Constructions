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
public class R_ProjectSpeciality implements Serializable{
    
    private int projectSpeciality_id;
    private String projectSpeciality_name;
    private String projectSpeciality_status;

    public R_ProjectSpeciality() {
    }

    public R_ProjectSpeciality(int projectSpeciality_id, String projectSpeciality_name, String projectSpeciality_status) {
        this.projectSpeciality_id = projectSpeciality_id;
        this.projectSpeciality_name = projectSpeciality_name;
        this.projectSpeciality_status = projectSpeciality_status;
    }

    /**
     * @return the projectSpeciality_id
     */
    public int getProjectSpeciality_id() {
        return projectSpeciality_id;
    }

    /**
     * @param projectSpeciality_id the projectSpeciality_id to set
     */
    public void setProjectSpeciality_id(int projectSpeciality_id) {
        this.projectSpeciality_id = projectSpeciality_id;
    }

    /**
     * @return the projectSpeciality_name
     */
    public String getProjectSpeciality_name() {
        return projectSpeciality_name;
    }

    /**
     * @param projectSpeciality_name the projectSpeciality_name to set
     */
    public void setProjectSpeciality_name(String projectSpeciality_name) {
        this.projectSpeciality_name = projectSpeciality_name;
    }

    /**
     * @return the projectSpeciality_status
     */
    public String getProjectSpeciality_status() {
        return projectSpeciality_status;
    }

    /**
     * @param projectSpeciality_status the projectSpeciality_status to set
     */
    public void setProjectSpeciality_status(String projectSpeciality_status) {
        this.projectSpeciality_status = projectSpeciality_status;
    }
    
    
}
