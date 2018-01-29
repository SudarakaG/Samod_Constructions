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
public class R_Role implements Serializable{
    
    private int role_id;
    private String role_name;
    private String role_description;

    public R_Role() {
    }

    public R_Role(int role_id, String role_name, String role_description) {
        this.role_id = role_id;
        this.role_name = role_name;
        this.role_description = role_description;
    }

    /**
     * @return the role_id
     */
    public int getRole_id() {
        return role_id;
    }

    /**
     * @param role_id the role_id to set
     */
    public void setRole_id(int role_id) {
        this.role_id = role_id;
    }

    /**
     * @return the role_name
     */
    public String getRole_name() {
        return role_name;
    }

    /**
     * @param role_name the role_name to set
     */
    public void setRole_name(String role_name) {
        this.role_name = role_name;
    }

    /**
     * @return the role_description
     */
    public String getRole_description() {
        return role_description;
    }

    /**
     * @param role_description the role_description to set
     */
    public void setRole_description(String role_description) {
        this.role_description = role_description;
    }
    
    
}
