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
public class R_Asset implements Serializable{
    
    private int asset_id;
    private String asset_name;
    private String asset_description;
    private String asset_status;
    private int asset_category_id;

    public R_Asset() {
    }

    public R_Asset(int asset_id, String asset_name, String asset_description, String asset_status, int asset_category_id) {
        this.asset_id = asset_id;
        this.asset_name = asset_name;
        this.asset_description = asset_description;
        this.asset_status = asset_status;
        this.asset_category_id = asset_category_id;
    }

    /**
     * @return the asset_id
     */
    public int getAsset_id() {
        return asset_id;
    }

    /**
     * @param asset_id the asset_id to set
     */
    public void setAsset_id(int asset_id) {
        this.asset_id = asset_id;
    }

    /**
     * @return the asset_name
     */
    public String getAsset_name() {
        return asset_name;
    }

    /**
     * @param asset_name the asset_name to set
     */
    public void setAsset_name(String asset_name) {
        this.asset_name = asset_name;
    }

    /**
     * @return the asset_description
     */
    public String getAsset_description() {
        return asset_description;
    }

    /**
     * @param asset_description the asset_description to set
     */
    public void setAsset_description(String asset_description) {
        this.asset_description = asset_description;
    }

    /**
     * @return the asset_status
     */
    public String getAsset_status() {
        return asset_status;
    }

    /**
     * @param asset_status the asset_status to set
     */
    public void setAsset_status(String asset_status) {
        this.asset_status = asset_status;
    }

    /**
     * @return the asset_category_id
     */
    public int getAsset_category_id() {
        return asset_category_id;
    }

    /**
     * @param asset_category_id the asset_category_id to set
     */
    public void setAsset_category_id(int asset_category_id) {
        this.asset_category_id = asset_category_id;
    }

    
    
}
