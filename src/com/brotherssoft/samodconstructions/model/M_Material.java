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
public class M_Material implements Serializable{
    
    private int material_id;
    private String material_name;
    private String material_description;
    private int material_unit_id;
    private int material_status;
    private Date material_regDate;

    public M_Material() {
    }

    public M_Material(int material_id, String material_name, String material_description, int material_unit_id, int material_status, Date material_regDate) {
        this.material_id = material_id;
        this.material_name = material_name;
        this.material_description = material_description;
        this.material_unit_id = material_unit_id;
        this.material_status = material_status;
        this.material_regDate = material_regDate;
    }

    /**
     * @return the material_id
     */
    public int getMaterial_id() {
        return material_id;
    }

    /**
     * @param material_id the material_id to set
     */
    public void setMaterial_id(int material_id) {
        this.material_id = material_id;
    }

    /**
     * @return the material_name
     */
    public String getMaterial_name() {
        return material_name;
    }

    /**
     * @param material_name the material_name to set
     */
    public void setMaterial_name(String material_name) {
        this.material_name = material_name;
    }

    /**
     * @return the material_description
     */
    public String getMaterial_description() {
        return material_description;
    }

    /**
     * @param material_description the material_description to set
     */
    public void setMaterial_description(String material_description) {
        this.material_description = material_description;
    }

    /**
     * @return the material_unit_id
     */
    public int getMaterial_unit_id() {
        return material_unit_id;
    }

    /**
     * @param material_unit_id the material_unit_id to set
     */
    public void setMaterial_unit_id(int material_unit_id) {
        this.material_unit_id = material_unit_id;
    }

    /**
     * @return the material_status
     */
    public int getMaterial_status() {
        return material_status;
    }

    /**
     * @param material_status the material_status to set
     */
    public void setMaterial_status(int material_status) {
        this.material_status = material_status;
    }

    /**
     * @return the material_regDate
     */
    public Date getMaterial_regDate() {
        return material_regDate;
    }

    /**
     * @param material_regDate the material_regDate to set
     */
    public void setMaterial_regDate(Date material_regDate) {
        this.material_regDate = material_regDate;
    }

    
}
