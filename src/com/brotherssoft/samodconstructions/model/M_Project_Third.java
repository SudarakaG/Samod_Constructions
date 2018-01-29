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
public class M_Project_Third implements Serializable{
    
    private int project_id;   
    private double project_final_boq;
    private double project_final_exceed;
    private double project_final_extraWork;
    private double project_final_priceEscallation;
    private double project_final_vat;
    private Date project_final_takeOverDate;
    private Date project_final_completeDate;
    private Date project_final_handOverDate;
    private String project_final_timeExtentionRequestPeriod;
    private String project_final_timeExtentionApprovedPeriod;
    private String project_final_liquidityDamage;
    private String project_final_liquidityDamagePeriod;
    private double project_final_liquidityDamageAmount;
    private String project_final_completionCertification;
    private String project_final_retention;
    private String project_final_retentionMode;
    private double project_final_retentionAmount;
    private String project_final_retentionOrganization;
    private Date project_final_retentionPeriodFrom;
    private Date project_final_retentionPeriodTo;
    private String project_final_retentionRelease;
    private double project_final_retentionReleaseAmount;
    private Date project_final_retentionReleaseDate;
    private String project_final_status;
    private String project_final_currentStatus;

    public M_Project_Third() {
    }

    public M_Project_Third(int project_id, double project_final_boq, double project_final_exceed, double project_final_extraWork, double project_final_priceEscallation, double project_final_vat, Date project_final_takeOverDate, Date project_final_completeDate, Date project_final_handOverDate, String project_final_timeExtentionRequestPeriod, String project_final_timeExtentionApprovedPeriod, String project_final_liquidityDamage, String project_final_liquidityDamagePeriod, double project_final_liquidityDamageAmount, String project_final_completionCertification, String project_final_retention, String project_final_retentionMode, double project_final_retentionAmount, String project_final_retentionOrganization, Date project_final_retentionPeriodFrom, Date project_final_retentionPeriodTo, String project_final_retentionRelease, double project_final_retentionReleaseAmount, Date project_final_retentionReleaseDate, String project_final_status, String project_final_currentStatus) {
        this.project_id = project_id;
        this.project_final_boq = project_final_boq;
        this.project_final_exceed = project_final_exceed;
        this.project_final_extraWork = project_final_extraWork;
        this.project_final_priceEscallation = project_final_priceEscallation;
        this.project_final_vat = project_final_vat;
        this.project_final_takeOverDate = project_final_takeOverDate;
        this.project_final_completeDate = project_final_completeDate;
        this.project_final_handOverDate = project_final_handOverDate;
        this.project_final_timeExtentionRequestPeriod = project_final_timeExtentionRequestPeriod;
        this.project_final_timeExtentionApprovedPeriod = project_final_timeExtentionApprovedPeriod;
        this.project_final_liquidityDamage = project_final_liquidityDamage;
        this.project_final_liquidityDamagePeriod = project_final_liquidityDamagePeriod;
        this.project_final_liquidityDamageAmount = project_final_liquidityDamageAmount;
        this.project_final_completionCertification = project_final_completionCertification;
        this.project_final_retention = project_final_retention;
        this.project_final_retentionMode = project_final_retentionMode;
        this.project_final_retentionAmount = project_final_retentionAmount;
        this.project_final_retentionOrganization = project_final_retentionOrganization;
        this.project_final_retentionPeriodFrom = project_final_retentionPeriodFrom;
        this.project_final_retentionPeriodTo = project_final_retentionPeriodTo;
        this.project_final_retentionRelease = project_final_retentionRelease;
        this.project_final_retentionReleaseAmount = project_final_retentionReleaseAmount;
        this.project_final_retentionReleaseDate = project_final_retentionReleaseDate;
        this.project_final_status = project_final_status;
        this.project_final_currentStatus = project_final_currentStatus;
    }

    /**
     * @return the project_id
     */
    public int getProject_id() {
        return project_id;
    }

    /**
     * @param project_id the project_id to set
     */
    public void setProject_id(int project_id) {
        this.project_id = project_id;
    }

    /**
     * @return the project_final_boq
     */
    public double getProject_final_boq() {
        return project_final_boq;
    }

    /**
     * @param project_final_boq the project_final_boq to set
     */
    public void setProject_final_boq(double project_final_boq) {
        this.project_final_boq = project_final_boq;
    }

    /**
     * @return the project_final_exceed
     */
    public double getProject_final_exceed() {
        return project_final_exceed;
    }

    /**
     * @param project_final_exceed the project_final_exceed to set
     */
    public void setProject_final_exceed(double project_final_exceed) {
        this.project_final_exceed = project_final_exceed;
    }

    /**
     * @return the project_final_extraWork
     */
    public double getProject_final_extraWork() {
        return project_final_extraWork;
    }

    /**
     * @param project_final_extraWork the project_final_extraWork to set
     */
    public void setProject_final_extraWork(double project_final_extraWork) {
        this.project_final_extraWork = project_final_extraWork;
    }

    /**
     * @return the project_final_priceEscallation
     */
    public double getProject_final_priceEscallation() {
        return project_final_priceEscallation;
    }

    /**
     * @param project_final_priceEscallation the project_final_priceEscallation to set
     */
    public void setProject_final_priceEscallation(double project_final_priceEscallation) {
        this.project_final_priceEscallation = project_final_priceEscallation;
    }

    /**
     * @return the project_final_vat
     */
    public double getProject_final_vat() {
        return project_final_vat;
    }

    /**
     * @param project_final_vat the project_final_vat to set
     */
    public void setProject_final_vat(double project_final_vat) {
        this.project_final_vat = project_final_vat;
    }

    /**
     * @return the project_final_takeOverDate
     */
    public Date getProject_final_takeOverDate() {
        return project_final_takeOverDate;
    }

    /**
     * @param project_final_takeOverDate the project_final_takeOverDate to set
     */
    public void setProject_final_takeOverDate(Date project_final_takeOverDate) {
        this.project_final_takeOverDate = project_final_takeOverDate;
    }

    /**
     * @return the project_final_completeDate
     */
    public Date getProject_final_completeDate() {
        return project_final_completeDate;
    }

    /**
     * @param project_final_completeDate the project_final_completeDate to set
     */
    public void setProject_final_completeDate(Date project_final_completeDate) {
        this.project_final_completeDate = project_final_completeDate;
    }

    /**
     * @return the project_final_handOverDate
     */
    public Date getProject_final_handOverDate() {
        return project_final_handOverDate;
    }

    /**
     * @param project_final_handOverDate the project_final_handOverDate to set
     */
    public void setProject_final_handOverDate(Date project_final_handOverDate) {
        this.project_final_handOverDate = project_final_handOverDate;
    }

    /**
     * @return the project_final_timeExtentionRequestPeriod
     */
    public String getProject_final_timeExtentionRequestPeriod() {
        return project_final_timeExtentionRequestPeriod;
    }

    /**
     * @param project_final_timeExtentionRequestPeriod the project_final_timeExtentionRequestPeriod to set
     */
    public void setProject_final_timeExtentionRequestPeriod(String project_final_timeExtentionRequestPeriod) {
        this.project_final_timeExtentionRequestPeriod = project_final_timeExtentionRequestPeriod;
    }

    /**
     * @return the project_final_timeExtentionApprovedPeriod
     */
    public String getProject_final_timeExtentionApprovedPeriod() {
        return project_final_timeExtentionApprovedPeriod;
    }

    /**
     * @param project_final_timeExtentionApprovedPeriod the project_final_timeExtentionApprovedPeriod to set
     */
    public void setProject_final_timeExtentionApprovedPeriod(String project_final_timeExtentionApprovedPeriod) {
        this.project_final_timeExtentionApprovedPeriod = project_final_timeExtentionApprovedPeriod;
    }

    /**
     * @return the project_final_liquidityDamage
     */
    public String getProject_final_liquidityDamage() {
        return project_final_liquidityDamage;
    }

    /**
     * @param project_final_liquidityDamage the project_final_liquidityDamage to set
     */
    public void setProject_final_liquidityDamage(String project_final_liquidityDamage) {
        this.project_final_liquidityDamage = project_final_liquidityDamage;
    }

    /**
     * @return the project_final_liquidityDamagePeriod
     */
    public String getProject_final_liquidityDamagePeriod() {
        return project_final_liquidityDamagePeriod;
    }

    /**
     * @param project_final_liquidityDamagePeriod the project_final_liquidityDamagePeriod to set
     */
    public void setProject_final_liquidityDamagePeriod(String project_final_liquidityDamagePeriod) {
        this.project_final_liquidityDamagePeriod = project_final_liquidityDamagePeriod;
    }

    /**
     * @return the project_final_liquidityDamageAmount
     */
    public double getProject_final_liquidityDamageAmount() {
        return project_final_liquidityDamageAmount;
    }

    /**
     * @param project_final_liquidityDamageAmount the project_final_liquidityDamageAmount to set
     */
    public void setProject_final_liquidityDamageAmount(double project_final_liquidityDamageAmount) {
        this.project_final_liquidityDamageAmount = project_final_liquidityDamageAmount;
    }

    /**
     * @return the project_final_completionCertification
     */
    public String getProject_final_completionCertification() {
        return project_final_completionCertification;
    }

    /**
     * @param project_final_completionCertification the project_final_completionCertification to set
     */
    public void setProject_final_completionCertification(String project_final_completionCertification) {
        this.project_final_completionCertification = project_final_completionCertification;
    }

    /**
     * @return the project_final_retention
     */
    public String getProject_final_retention() {
        return project_final_retention;
    }

    /**
     * @param project_final_retention the project_final_retention to set
     */
    public void setProject_final_retention(String project_final_retention) {
        this.project_final_retention = project_final_retention;
    }

    /**
     * @return the project_final_retentionMode
     */
    public String getProject_final_retentionMode() {
        return project_final_retentionMode;
    }

    /**
     * @param project_final_retentionMode the project_final_retentionMode to set
     */
    public void setProject_final_retentionMode(String project_final_retentionMode) {
        this.project_final_retentionMode = project_final_retentionMode;
    }

    /**
     * @return the project_final_retentionAmount
     */
    public double getProject_final_retentionAmount() {
        return project_final_retentionAmount;
    }

    /**
     * @param project_final_retentionAmount the project_final_retentionAmount to set
     */
    public void setProject_final_retentionAmount(double project_final_retentionAmount) {
        this.project_final_retentionAmount = project_final_retentionAmount;
    }

    /**
     * @return the project_final_retentionOrganization
     */
    public String getProject_final_retentionOrganization() {
        return project_final_retentionOrganization;
    }

    /**
     * @param project_final_retentionOrganization the project_final_retentionOrganization to set
     */
    public void setProject_final_retentionOrganization(String project_final_retentionOrganization) {
        this.project_final_retentionOrganization = project_final_retentionOrganization;
    }

    /**
     * @return the project_final_retentionPeriodFrom
     */
    public Date getProject_final_retentionPeriodFrom() {
        return project_final_retentionPeriodFrom;
    }

    /**
     * @param project_final_retentionPeriodFrom the project_final_retentionPeriodFrom to set
     */
    public void setProject_final_retentionPeriodFrom(Date project_final_retentionPeriodFrom) {
        this.project_final_retentionPeriodFrom = project_final_retentionPeriodFrom;
    }

    /**
     * @return the project_final_retentionPeriodTo
     */
    public Date getProject_final_retentionPeriodTo() {
        return project_final_retentionPeriodTo;
    }

    /**
     * @param project_final_retentionPeriodTo the project_final_retentionPeriodTo to set
     */
    public void setProject_final_retentionPeriodTo(Date project_final_retentionPeriodTo) {
        this.project_final_retentionPeriodTo = project_final_retentionPeriodTo;
    }

    /**
     * @return the project_final_retentionRelease
     */
    public String getProject_final_retentionRelease() {
        return project_final_retentionRelease;
    }

    /**
     * @param project_final_retentionRelease the project_final_retentionRelease to set
     */
    public void setProject_final_retentionRelease(String project_final_retentionRelease) {
        this.project_final_retentionRelease = project_final_retentionRelease;
    }

    /**
     * @return the project_final_retentionReleaseAmount
     */
    public double getProject_final_retentionReleaseAmount() {
        return project_final_retentionReleaseAmount;
    }

    /**
     * @param project_final_retentionReleaseAmount the project_final_retentionReleaseAmount to set
     */
    public void setProject_final_retentionReleaseAmount(double project_final_retentionReleaseAmount) {
        this.project_final_retentionReleaseAmount = project_final_retentionReleaseAmount;
    }

    /**
     * @return the project_final_retentionReleaseDate
     */
    public Date getProject_final_retentionReleaseDate() {
        return project_final_retentionReleaseDate;
    }

    /**
     * @param project_final_retentionReleaseDate the project_final_retentionReleaseDate to set
     */
    public void setProject_final_retentionReleaseDate(Date project_final_retentionReleaseDate) {
        this.project_final_retentionReleaseDate = project_final_retentionReleaseDate;
    }

    /**
     * @return the project_final_status
     */
    public String getProject_final_status() {
        return project_final_status;
    }

    /**
     * @param project_final_status the project_final_status to set
     */
    public void setProject_final_status(String project_final_status) {
        this.project_final_status = project_final_status;
    }

    /**
     * @return the project_final_currentStatus
     */
    public String getProject_final_currentStatus() {
        return project_final_currentStatus;
    }

    /**
     * @param project_final_currentStatus the project_final_currentStatus to set
     */
    public void setProject_final_currentStatus(String project_final_currentStatus) {
        this.project_final_currentStatus = project_final_currentStatus;
    }
    
}
