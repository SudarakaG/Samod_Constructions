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
public class R_Title implements Serializable{
    
    private int title_id;
    private String title_name;
    private String title_description;
    private String title_status;

    public R_Title() {
    }

    public R_Title(int title_id, String title_name, String title_description, String title_status) {
        this.title_id = title_id;
        this.title_name = title_name;
        this.title_description = title_description;
        this.title_status = title_status;
    }

    /**
     * @return the title_id
     */
    public int getTitle_id() {
        return title_id;
    }

    /**
     * @param title_id the title_id to set
     */
    public void setTitle_id(int title_id) {
        this.title_id = title_id;
    }

    /**
     * @return the title_name
     */
    public String getTitle_name() {
        return title_name;
    }

    /**
     * @param title_name the title_name to set
     */
    public void setTitle_name(String title_name) {
        this.title_name = title_name;
    }

    /**
     * @return the title_description
     */
    public String getTitle_description() {
        return title_description;
    }

    /**
     * @param title_description the title_description to set
     */
    public void setTitle_description(String title_description) {
        this.title_description = title_description;
    }

    /**
     * @return the title_status
     */
    public String getTitle_status() {
        return title_status;
    }

    /**
     * @param title_status the title_status to set
     */
    public void setTitle_status(String title_status) {
        this.title_status = title_status;
    }
    
    
}
