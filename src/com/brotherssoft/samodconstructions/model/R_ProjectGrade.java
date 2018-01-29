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
public class R_ProjectGrade implements Serializable{
    
    private int projectGrade_id;
    private String projectGrade_name;
    private String projectGrade_status;

    public R_ProjectGrade() {
    }

    public R_ProjectGrade(int projectGrade_id, String projectGrade_name, String projectGrade_status) {
        this.projectGrade_id = projectGrade_id;
        this.projectGrade_name = projectGrade_name;
        this.projectGrade_status = projectGrade_status;
    }

    /**
     * @return the projectGrade_id
     */
    public int getProjectGrade_id() {
        return projectGrade_id;
    }

    /**
     * @param projectGrade_id the projectGrade_id to set
     */
    public void setProjectGrade_id(int projectGrade_id) {
        this.projectGrade_id = projectGrade_id;
    }

    /**
     * @return the projectGrade_name
     */
    public String getProjectGrade_name() {
        return projectGrade_name;
    }

    /**
     * @param projectGrade_name the projectGrade_name to set
     */
    public void setProjectGrade_name(String projectGrade_name) {
        this.projectGrade_name = projectGrade_name;
    }

    /**
     * @return the projectGrade_status
     */
    public String getProjectGrade_status() {
        return projectGrade_status;
    }

    /**
     * @param projectGrade_status the projectGrade_status to set
     */
    public void setProjectGrade_status(String projectGrade_status) {
        this.projectGrade_status = projectGrade_status;
    }
    
    
}
