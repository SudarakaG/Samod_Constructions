/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.model;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author gksde
 */
public class M_User implements Serializable{
    
    private int user_id;
    private String user_name;
    private String user_password;
    private char user_status;
    private String user_description;
    private Date user_createDate;
    private String user_createdUser;
    private int user_role_id;
    private int user_permission;

    public M_User() {
    }

    public M_User(int user_id, String user_name, String user_password, char user_status, String user_description, Date user_createDate, String user_createdUser, int user_role_id, int user_permission) {
        this.user_id = user_id;
        this.user_name = user_name;
        this.user_password = user_password;
        this.user_status = user_status;
        this.user_description = user_description;
        this.user_createDate = user_createDate;
        this.user_createdUser = user_createdUser;
        this.user_role_id = user_role_id;
        this.user_permission = user_permission;
    }

    /**
     * @return the user_id
     */
    public int getUser_id() {
        return user_id;
    }

    /**
     * @param user_id the user_id to set
     */
    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    /**
     * @return the user_name
     */
    public String getUser_name() {
        return user_name;
    }

    /**
     * @param user_name the user_name to set
     */
    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    /**
     * @return the user_password
     */
    public String getUser_password() {
        return user_password;
    }

    /**
     * @param user_password the user_password to set
     */
    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    /**
     * @return the user_status
     */
    public char getUser_status() {
        return user_status;
    }

    /**
     * @param user_status the user_status to set
     */
    public void setUser_status(char user_status) {
        this.user_status = user_status;
    }

    /**
     * @return the user_description
     */
    public String getUser_description() {
        return user_description;
    }

    /**
     * @param user_description the user_description to set
     */
    public void setUser_description(String user_description) {
        this.user_description = user_description;
    }

    /**
     * @return the user_createDate
     */
    public Date getUser_createDate() {
        return user_createDate;
    }

    /**
     * @param user_createDate the user_createDate to set
     */
    public void setUser_createDate(Date user_createDate) {
        this.user_createDate = user_createDate;
    }

    /**
     * @return the user_createdUser
     */
    public String getUser_createdUser() {
        return user_createdUser;
    }

    /**
     * @param user_createdUser the user_createdUser to set
     */
    public void setUser_createdUser(String user_createdUser) {
        this.user_createdUser = user_createdUser;
    }

    /**
     * @return the user_role_id
     */
    public int getUser_role_id() {
        return user_role_id;
    }

    /**
     * @param user_role_id the user_role_id to set
     */
    public void setUser_role_id(int user_role_id) {
        this.user_role_id = user_role_id;
    }

    /**
     * @return the user_permission
     */
    public int getUser_permission() {
        return user_permission;
    }

    /**
     * @param user_permission the user_permission to set
     */
    public void setUser_permission(int user_permission) {
        this.user_permission = user_permission;
    }
    
    
    
}
