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
public class M_Equipment implements Serializable{
    
    private int equipment_id;
    private int equipment_asset_id;
    private int equipment_asset_category_id;
    private String equipment_name;
    private String equipment_description;
    private String equipment_regNo;
    private String equipment_capacity;
    private Date equipment_regDate;
    private int equipment_status;
    private double equipment_depreciationRate;

    public M_Equipment() {
    }

    public M_Equipment(int equipment_id, int equipment_asset_id, int equipment_asset_category_id, String equipment_name, String equipment_description, String equipment_regNo, String equipment_capacity, Date equipment_regDate, int equipment_status, double equipment_depreciationRate) {
        this.equipment_id = equipment_id;
        this.equipment_asset_id = equipment_asset_id;
        this.equipment_asset_category_id = equipment_asset_category_id;
        this.equipment_name = equipment_name;
        this.equipment_description = equipment_description;
        this.equipment_regNo = equipment_regNo;
        this.equipment_capacity = equipment_capacity;
        this.equipment_regDate = equipment_regDate;
        this.equipment_status = equipment_status;
        this.equipment_depreciationRate = equipment_depreciationRate;
    }

    /**
     * @return the equipment_id
     */
    public int getEquipment_id() {
        return equipment_id;
    }

    /**
     * @param equipment_id the equipment_id to set
     */
    public void setEquipment_id(int equipment_id) {
        this.equipment_id = equipment_id;
    }

    /**
     * @return the equipment_asset_id
     */
    public int getEquipment_asset_id() {
        return equipment_asset_id;
    }

    /**
     * @param equipment_asset_id the equipment_asset_id to set
     */
    public void setEquipment_asset_id(int equipment_asset_id) {
        this.equipment_asset_id = equipment_asset_id;
    }

    /**
     * @return the equipment_asset_category_id
     */
    public int getEquipment_asset_category_id() {
        return equipment_asset_category_id;
    }

    /**
     * @param equipment_asset_category_id the equipment_asset_category_id to set
     */
    public void setEquipment_asset_category_id(int equipment_asset_category_id) {
        this.equipment_asset_category_id = equipment_asset_category_id;
    }

    /**
     * @return the equipment_name
     */
    public String getEquipment_name() {
        return equipment_name;
    }

    /**
     * @param equipment_name the equipment_name to set
     */
    public void setEquipment_name(String equipment_name) {
        this.equipment_name = equipment_name;
    }

    /**
     * @return the equipment_description
     */
    public String getEquipment_description() {
        return equipment_description;
    }

    /**
     * @param equipment_description the equipment_description to set
     */
    public void setEquipment_description(String equipment_description) {
        this.equipment_description = equipment_description;
    }

    /**
     * @return the equipment_regNo
     */
    public String getEquipment_regNo() {
        return equipment_regNo;
    }

    /**
     * @param equipment_regNo the equipment_regNo to set
     */
    public void setEquipment_regNo(String equipment_regNo) {
        this.equipment_regNo = equipment_regNo;
    }

    /**
     * @return the equipment_capacity
     */
    public String getEquipment_capacity() {
        return equipment_capacity;
    }

    /**
     * @param equipment_capacity the equipment_capacity to set
     */
    public void setEquipment_capacity(String equipment_capacity) {
        this.equipment_capacity = equipment_capacity;
    }

    /**
     * @return the equipment_regDate
     */
    public Date getEquipment_regDate() {
        return equipment_regDate;
    }

    /**
     * @param equipment_regDate the equipment_regDate to set
     */
    public void setEquipment_regDate(Date equipment_regDate) {
        this.equipment_regDate = equipment_regDate;
    }

    /**
     * @return the equipment_status
     */
    public int getEquipment_status() {
        return equipment_status;
    }

    /**
     * @param equipment_status the equipment_status to set
     */
    public void setEquipment_status(int equipment_status) {
        this.equipment_status = equipment_status;
    }

    /**
     * @return the equipment_depreciationRate
     */
    public double getEquipment_depreciationRate() {
        return equipment_depreciationRate;
    }

    /**
     * @param equipment_depreciationRate the equipment_depreciationRate to set
     */
    public void setEquipment_depreciationRate(double equipment_depreciationRate) {
        this.equipment_depreciationRate = equipment_depreciationRate;
    }

    
}
