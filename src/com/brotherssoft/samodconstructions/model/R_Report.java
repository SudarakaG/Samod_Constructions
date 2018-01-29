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
public class R_Report implements Serializable{
    
    private int report_id;
    private String report_name;
    private String report_description;
    private String report_path;
    private String report_status;

    public R_Report() {
    }

    public R_Report(int report_id, String report_name, String report_description, String report_path, String report_status) {
        this.report_id = report_id;
        this.report_name = report_name;
        this.report_description = report_description;
        this.report_path = report_path;
        this.report_status = report_status;
    }

    /**
     * @return the report_id
     */
    public int getReport_id() {
        return report_id;
    }

    /**
     * @param report_id the report_id to set
     */
    public void setReport_id(int report_id) {
        this.report_id = report_id;
    }

    /**
     * @return the report_name
     */
    public String getReport_name() {
        return report_name;
    }

    /**
     * @param report_name the report_name to set
     */
    public void setReport_name(String report_name) {
        this.report_name = report_name;
    }

    /**
     * @return the report_description
     */
    public String getReport_description() {
        return report_description;
    }

    /**
     * @param report_description the report_description to set
     */
    public void setReport_description(String report_description) {
        this.report_description = report_description;
    }

    /**
     * @return the report_path
     */
    public String getReport_path() {
        return report_path;
    }

    /**
     * @param report_path the report_path to set
     */
    public void setReport_path(String report_path) {
        this.report_path = report_path;
    }

    /**
     * @return the report_status
     */
    public String getReport_status() {
        return report_status;
    }

    /**
     * @param report_status the report_status to set
     */
    public void setReport_status(String report_status) {
        this.report_status = report_status;
    }
    
    
}
