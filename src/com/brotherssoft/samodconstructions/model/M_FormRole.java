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
public class M_FormRole implements Serializable{
    
    private int formRole_id;
    private int formRole_form_id;
    private int formRole_role_id;
    private char formRole_status;
    private char formRole_formType;

    public M_FormRole() {
    }

    public M_FormRole(int formRole_id, int formRole_form_id, int formRole_role_id, char formRole_status, char formRole_formType) {
        this.formRole_id = formRole_id;
        this.formRole_form_id = formRole_form_id;
        this.formRole_role_id = formRole_role_id;
        this.formRole_status = formRole_status;
        this.formRole_formType = formRole_formType;
    }

    /**
     * @return the formRole_id
     */
    public int getFormRole_id() {
        return formRole_id;
    }

    /**
     * @param formRole_id the formRole_id to set
     */
    public void setFormRole_id(int formRole_id) {
        this.formRole_id = formRole_id;
    }

    /**
     * @return the formRole_form_id
     */
    public int getFormRole_form_id() {
        return formRole_form_id;
    }

    /**
     * @param formRole_form_id the formRole_form_id to set
     */
    public void setFormRole_form_id(int formRole_form_id) {
        this.formRole_form_id = formRole_form_id;
    }

    /**
     * @return the formRole_role_id
     */
    public int getFormRole_role_id() {
        return formRole_role_id;
    }

    /**
     * @param formRole_role_id the formRole_role_id to set
     */
    public void setFormRole_role_id(int formRole_role_id) {
        this.formRole_role_id = formRole_role_id;
    }

    /**
     * @return the formRole_status
     */
    public char getFormRole_status() {
        return formRole_status;
    }

    /**
     * @param formRole_status the formRole_status to set
     */
    public void setFormRole_status(char formRole_status) {
        this.formRole_status = formRole_status;
    }

    /**
     * @return the formRole_formType
     */
    public char getFormRole_formType() {
        return formRole_formType;
    }

    /**
     * @param formRole_formType the formRole_formType to set
     */
    public void setFormRole_formType(char formRole_formType) {
        this.formRole_formType = formRole_formType;
    }

    
    
}
