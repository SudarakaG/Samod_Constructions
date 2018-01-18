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
public class R_Form implements Serializable{
    
    private int form_id;
    private String form_name;
    private String form_description;
    private char form_status;
    private char form_group;
    private String form_group_description;
    private String form_source;
    private int form_loadOrder;

    public R_Form() {
    }

    public R_Form(int form_id, String form_name, String form_description, char form_status, char form_group, String form_group_description, String form_source, int form_loadOrder) {
        this.form_id = form_id;
        this.form_name = form_name;
        this.form_description = form_description;
        this.form_status = form_status;
        this.form_group = form_group;
        this.form_group_description = form_group_description;
        this.form_source = form_source;
        this.form_loadOrder = form_loadOrder;
    }

    /**
     * @return the form_id
     */
    public int getForm_id() {
        return form_id;
    }

    /**
     * @param form_id the form_id to set
     */
    public void setForm_id(int form_id) {
        this.form_id = form_id;
    }

    /**
     * @return the form_name
     */
    public String getForm_name() {
        return form_name;
    }

    /**
     * @param form_name the form_name to set
     */
    public void setForm_name(String form_name) {
        this.form_name = form_name;
    }

    /**
     * @return the form_description
     */
    public String getForm_description() {
        return form_description;
    }

    /**
     * @param form_description the form_description to set
     */
    public void setForm_description(String form_description) {
        this.form_description = form_description;
    }

    /**
     * @return the form_status
     */
    public char getForm_status() {
        return form_status;
    }

    /**
     * @param form_status the form_status to set
     */
    public void setForm_status(char form_status) {
        this.form_status = form_status;
    }

    /**
     * @return the form_group
     */
    public char getForm_group() {
        return form_group;
    }

    /**
     * @param form_group the form_group to set
     */
    public void setForm_group(char form_group) {
        this.form_group = form_group;
    }

    /**
     * @return the form_group_description
     */
    public String getForm_group_description() {
        return form_group_description;
    }

    /**
     * @param form_group_description the form_group_description to set
     */
    public void setForm_group_description(String form_group_description) {
        this.form_group_description = form_group_description;
    }

    /**
     * @return the form_source
     */
    public String getForm_source() {
        return form_source;
    }

    /**
     * @param form_source the form_source to set
     */
    public void setForm_source(String form_source) {
        this.form_source = form_source;
    }

    /**
     * @return the form_loadOrder
     */
    public int getForm_loadOrder() {
        return form_loadOrder;
    }

    /**
     * @param form_loadOrder the form_loadOrder to set
     */
    public void setForm_loadOrder(int form_loadOrder) {
        this.form_loadOrder = form_loadOrder;
    }
    
    
    
}
