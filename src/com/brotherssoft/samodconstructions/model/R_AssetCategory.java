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
public class R_AssetCategory implements Serializable{
    
    private int assetCategory_id;
    private String assetCategory_description;
    private String assetCategory_status;

    public R_AssetCategory() {
    }

    public R_AssetCategory(int assetCategory_id, String assetCategory_description, String assetCategory_status) {
        this.assetCategory_id = assetCategory_id;
        this.assetCategory_description = assetCategory_description;
        this.assetCategory_status = assetCategory_status;
    }

    /**
     * @return the assetCategory_id
     */
    public int getAssetCategory_id() {
        return assetCategory_id;
    }

    /**
     * @param assetCategory_id the assetCategory_id to set
     */
    public void setAssetCategory_id(int assetCategory_id) {
        this.assetCategory_id = assetCategory_id;
    }

    /**
     * @return the assetCategory_description
     */
    public String getAssetCategory_description() {
        return assetCategory_description;
    }

    /**
     * @param assetCategory_description the assetCategory_description to set
     */
    public void setAssetCategory_description(String assetCategory_description) {
        this.assetCategory_description = assetCategory_description;
    }

    /**
     * @return the assetCategory_status
     */
    public String getAssetCategory_status() {
        return assetCategory_status;
    }

    /**
     * @param assetCategory_status the assetCategory_status to set
     */
    public void setAssetCategory_status(String assetCategory_status) {
        this.assetCategory_status = assetCategory_status;
    }

    
}
