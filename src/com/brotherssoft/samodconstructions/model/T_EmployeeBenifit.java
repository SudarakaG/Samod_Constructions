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
public class T_EmployeeBenifit implements Serializable{
    
    private int employeeBenifit_id;
    private Date employeeBenifit_date;
    private int employeeBenifit_employeeId;
    private int employeeBenifit_benifitId;
    private double employeeBenifit_amount;
    private int employeeBenifit_siteId;

    public T_EmployeeBenifit() {
    }

    public T_EmployeeBenifit(int employeeBenifit_id, Date employeeBenifit_date, int employeeBenifit_employeeId, int employeeBenifit_benifitId, double employeeBenifit_amount, int employeeBenifit_siteId) {
        this.employeeBenifit_id = employeeBenifit_id;
        this.employeeBenifit_date = employeeBenifit_date;
        this.employeeBenifit_employeeId = employeeBenifit_employeeId;
        this.employeeBenifit_benifitId = employeeBenifit_benifitId;
        this.employeeBenifit_amount = employeeBenifit_amount;
        this.employeeBenifit_siteId = employeeBenifit_siteId;
    }

    /**
     * @return the employeeBenifit_id
     */
    public int getEmployeeBenifit_id() {
        return employeeBenifit_id;
    }

    /**
     * @param employeeBenifit_id the employeeBenifit_id to set
     */
    public void setEmployeeBenifit_id(int employeeBenifit_id) {
        this.employeeBenifit_id = employeeBenifit_id;
    }

    /**
     * @return the employeeBenifit_date
     */
    public Date getEmployeeBenifit_date() {
        return employeeBenifit_date;
    }

    /**
     * @param employeeBenifit_date the employeeBenifit_date to set
     */
    public void setEmployeeBenifit_date(Date employeeBenifit_date) {
        this.employeeBenifit_date = employeeBenifit_date;
    }

    /**
     * @return the employeeBenifit_employeeId
     */
    public int getEmployeeBenifit_employeeId() {
        return employeeBenifit_employeeId;
    }

    /**
     * @param employeeBenifit_employeeId the employeeBenifit_employeeId to set
     */
    public void setEmployeeBenifit_employeeId(int employeeBenifit_employeeId) {
        this.employeeBenifit_employeeId = employeeBenifit_employeeId;
    }

    /**
     * @return the employeeBenifit_benifitId
     */
    public int getEmployeeBenifit_benifitId() {
        return employeeBenifit_benifitId;
    }

    /**
     * @param employeeBenifit_benifitId the employeeBenifit_benifitId to set
     */
    public void setEmployeeBenifit_benifitId(int employeeBenifit_benifitId) {
        this.employeeBenifit_benifitId = employeeBenifit_benifitId;
    }

    /**
     * @return the employeeBenifit_amount
     */
    public double getEmployeeBenifit_amount() {
        return employeeBenifit_amount;
    }

    /**
     * @param employeeBenifit_amount the employeeBenifit_amount to set
     */
    public void setEmployeeBenifit_amount(double employeeBenifit_amount) {
        this.employeeBenifit_amount = employeeBenifit_amount;
    }

    /**
     * @return the employeeBenifit_siteId
     */
    public int getEmployeeBenifit_siteId() {
        return employeeBenifit_siteId;
    }

    /**
     * @param employeeBenifit_siteId the employeeBenifit_siteId to set
     */
    public void setEmployeeBenifit_siteId(int employeeBenifit_siteId) {
        this.employeeBenifit_siteId = employeeBenifit_siteId;
    }
    
}
