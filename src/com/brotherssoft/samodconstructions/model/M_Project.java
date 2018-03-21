/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.model;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;

/**
 *
 * @author gksde
 */
public class M_Project implements Serializable{
    
    private int project_id;
    private String project_primary_name;
    private String project_primary_description;
    private String project_primary_address1;
    private String project_primary_address2;
    private String project_primary_address3;
    private String project_primary_address4;
    private int project_primary_type;
    private String project_primary_vatAdded;
    private String project_primary_contractBidNo;
    private String project_primary_clientName;
    private String project_primary_clientAddress1;
    private String project_primary_clientAddress2;
    private String project_primary_clientAddress3;
    private String project_primary_clientAddress4;
    private String project_primary_clientContact1;
    private String project_primary_clientContact2;
    private String project_primary_intendedDuration;
    private int project_primary_ictadSpeciality_id;
    private int project_primary_ictadGrade_id;
    private double project_primary_engineerEstimate;
    private double project_primary_tenderFee;
    private String project_primary_bidPaymentMode;
    private double project_primary_bidAmount;
    private String project_primary_bidDuration;
    private String project_primary_bidOrganization;
    private Date project_primary_tenderOpenDate;
    private Time project_primary_tenderOpenTime;
    private String project_primary_tenderResult;
    private Date project_primary_statusActiveDate;
    private Date project_primary_statusInactiveDate;
    
    private double project_secondary_boq;
    
    private double project_secondary_nbt;
    
    private double project_secondary_vat;
    private String project_secondary_duration;
    private Date project_secondary_agreementDate;
    private String project_secondary_consultant;
    private String project_secondary_consultantAddress;
    private String project_secondary_consultantContact;
    private Date project_secondary_commencementDate;
    private Date project_secondary_completionDate;
    private String project_secondary_performanceBondOrganization;
    private double project_secondary_performanceBondAmount;
    private Date project_secondary_performanceBondValidFrom;
    private Date project_secondary_performanceBondValidTo;
    private String project_secondary_advancePaymentBondOrganization;
    private double project_secondary_advancePaymentBondAmount;
    private Date project_secondary_advancePaymentBondValidFrom;
    private Date project_secondary_advancePaymentBondValidTo;
    private String project_secondary_insuranceCover;
    private String project_secondary_insuranceCoverOrganization;
    private double project_secondary_insuranceCoverAmount;
    private Date project_secondary_insuranceValidFrom;
    private Date project_secondary_insuranceValidTo;
    private String project_secondary_paymentMode;
    
    private double project_final_boq;
    private double project_final_exceed;
    private double project_final_extraWork;
    private double project_final_priceEscallation;
    
    private double project_final_nbt;
    
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

    public M_Project() {
    }

    public M_Project(int project_id, String project_primary_name, String project_primary_description, String project_primary_address1, String project_primary_address2, String project_primary_address3, String project_primary_address4, int project_primary_type, String project_primary_vatAdded, String project_primary_contractBidNo, String project_primary_clientName, String project_primary_clientAddress1, String project_primary_clientAddress2, String project_primary_clientAddress3, String project_primary_clientAddress4, String project_primary_clientContact1, String project_primary_clientContact2, String project_primary_intendedDuration, int project_primary_ictadSpeciality_id, int project_primary_ictadGrade_id, double project_primary_engineerEstimate, double project_primary_tenderFee, String project_primary_bidPaymentMode, double project_primary_bidAmount, String project_primary_bidDuration, String project_primary_bidOrganization, Date project_primary_tenderOpenDate, Time project_primary_tenderOpenTime, String project_primary_tenderResult, Date project_primary_statusActiveDate, Date project_primary_statusInactiveDate, double project_secondary_boq, double project_secondary_nbt, double project_secondary_vat, String project_secondary_duration, Date project_secondary_agreementDate, String project_secondary_consultant, String project_secondary_consultantAddress, String project_secondary_consultantContact, Date project_secondary_commencementDate, Date project_secondary_completionDate, String project_secondary_performanceBondOrganization, double project_secondary_performanceBondAmount, Date project_secondary_performanceBondValidFrom, Date project_secondary_performanceBondValidTo, String project_secondary_advancePaymentBondOrganization, double project_secondary_advancePaymentBondAmount, Date project_secondary_advancePaymentBondValidFrom, Date project_secondary_advancePaymentBondValidTo, String project_secondary_insuranceCover, String project_secondary_insuranceCoverOrganization, double project_secondary_insuranceCoverAmount, Date project_secondary_insuranceValidFrom, Date project_secondary_insuranceValidTo, String project_secondary_paymentMode, double project_final_boq, double project_final_exceed, double project_final_extraWork, double project_final_priceEscallation, double project_final_nbt, double project_final_vat, Date project_final_takeOverDate, Date project_final_completeDate, Date project_final_handOverDate, String project_final_timeExtentionRequestPeriod, String project_final_timeExtentionApprovedPeriod, String project_final_liquidityDamage, String project_final_liquidityDamagePeriod, double project_final_liquidityDamageAmount, String project_final_completionCertification, String project_final_retention, String project_final_retentionMode, double project_final_retentionAmount, String project_final_retentionOrganization, Date project_final_retentionPeriodFrom, Date project_final_retentionPeriodTo, String project_final_retentionRelease, double project_final_retentionReleaseAmount, Date project_final_retentionReleaseDate, String project_final_status, String project_final_currentStatus) {
        this.project_id = project_id;
        this.project_primary_name = project_primary_name;
        this.project_primary_description = project_primary_description;
        this.project_primary_address1 = project_primary_address1;
        this.project_primary_address2 = project_primary_address2;
        this.project_primary_address3 = project_primary_address3;
        this.project_primary_address4 = project_primary_address4;
        this.project_primary_type = project_primary_type;
        this.project_primary_vatAdded = project_primary_vatAdded;
        this.project_primary_contractBidNo = project_primary_contractBidNo;
        this.project_primary_clientName = project_primary_clientName;
        this.project_primary_clientAddress1 = project_primary_clientAddress1;
        this.project_primary_clientAddress2 = project_primary_clientAddress2;
        this.project_primary_clientAddress3 = project_primary_clientAddress3;
        this.project_primary_clientAddress4 = project_primary_clientAddress4;
        this.project_primary_clientContact1 = project_primary_clientContact1;
        this.project_primary_clientContact2 = project_primary_clientContact2;
        this.project_primary_intendedDuration = project_primary_intendedDuration;
        this.project_primary_ictadSpeciality_id = project_primary_ictadSpeciality_id;
        this.project_primary_ictadGrade_id = project_primary_ictadGrade_id;
        this.project_primary_engineerEstimate = project_primary_engineerEstimate;
        this.project_primary_tenderFee = project_primary_tenderFee;
        this.project_primary_bidPaymentMode = project_primary_bidPaymentMode;
        this.project_primary_bidAmount = project_primary_bidAmount;
        this.project_primary_bidDuration = project_primary_bidDuration;
        this.project_primary_bidOrganization = project_primary_bidOrganization;
        this.project_primary_tenderOpenDate = project_primary_tenderOpenDate;
        this.project_primary_tenderOpenTime = project_primary_tenderOpenTime;
        this.project_primary_tenderResult = project_primary_tenderResult;
        this.project_primary_statusActiveDate = project_primary_statusActiveDate;
        this.project_primary_statusInactiveDate = project_primary_statusInactiveDate;
        this.project_secondary_boq = project_secondary_boq;
        this.project_secondary_nbt = project_secondary_nbt;
        this.project_secondary_vat = project_secondary_vat;
        this.project_secondary_duration = project_secondary_duration;
        this.project_secondary_agreementDate = project_secondary_agreementDate;
        this.project_secondary_consultant = project_secondary_consultant;
        this.project_secondary_consultantAddress = project_secondary_consultantAddress;
        this.project_secondary_consultantContact = project_secondary_consultantContact;
        this.project_secondary_commencementDate = project_secondary_commencementDate;
        this.project_secondary_completionDate = project_secondary_completionDate;
        this.project_secondary_performanceBondOrganization = project_secondary_performanceBondOrganization;
        this.project_secondary_performanceBondAmount = project_secondary_performanceBondAmount;
        this.project_secondary_performanceBondValidFrom = project_secondary_performanceBondValidFrom;
        this.project_secondary_performanceBondValidTo = project_secondary_performanceBondValidTo;
        this.project_secondary_advancePaymentBondOrganization = project_secondary_advancePaymentBondOrganization;
        this.project_secondary_advancePaymentBondAmount = project_secondary_advancePaymentBondAmount;
        this.project_secondary_advancePaymentBondValidFrom = project_secondary_advancePaymentBondValidFrom;
        this.project_secondary_advancePaymentBondValidTo = project_secondary_advancePaymentBondValidTo;
        this.project_secondary_insuranceCover = project_secondary_insuranceCover;
        this.project_secondary_insuranceCoverOrganization = project_secondary_insuranceCoverOrganization;
        this.project_secondary_insuranceCoverAmount = project_secondary_insuranceCoverAmount;
        this.project_secondary_insuranceValidFrom = project_secondary_insuranceValidFrom;
        this.project_secondary_insuranceValidTo = project_secondary_insuranceValidTo;
        this.project_secondary_paymentMode = project_secondary_paymentMode;
        this.project_final_boq = project_final_boq;
        this.project_final_exceed = project_final_exceed;
        this.project_final_extraWork = project_final_extraWork;
        this.project_final_priceEscallation = project_final_priceEscallation;
        this.project_final_nbt = project_final_nbt;
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
     * @return the project_primary_name
     */
    public String getProject_primary_name() {
        return project_primary_name;
    }

    /**
     * @param project_primary_name the project_primary_name to set
     */
    public void setProject_primary_name(String project_primary_name) {
        this.project_primary_name = project_primary_name;
    }

    /**
     * @return the project_primary_description
     */
    public String getProject_primary_description() {
        return project_primary_description;
    }

    /**
     * @param project_primary_description the project_primary_description to set
     */
    public void setProject_primary_description(String project_primary_description) {
        this.project_primary_description = project_primary_description;
    }

    /**
     * @return the project_primary_address1
     */
    public String getProject_primary_address1() {
        return project_primary_address1;
    }

    /**
     * @param project_primary_address1 the project_primary_address1 to set
     */
    public void setProject_primary_address1(String project_primary_address1) {
        this.project_primary_address1 = project_primary_address1;
    }

    /**
     * @return the project_primary_address2
     */
    public String getProject_primary_address2() {
        return project_primary_address2;
    }

    /**
     * @param project_primary_address2 the project_primary_address2 to set
     */
    public void setProject_primary_address2(String project_primary_address2) {
        this.project_primary_address2 = project_primary_address2;
    }

    /**
     * @return the project_primary_address3
     */
    public String getProject_primary_address3() {
        return project_primary_address3;
    }

    /**
     * @param project_primary_address3 the project_primary_address3 to set
     */
    public void setProject_primary_address3(String project_primary_address3) {
        this.project_primary_address3 = project_primary_address3;
    }

    /**
     * @return the project_primary_address4
     */
    public String getProject_primary_address4() {
        return project_primary_address4;
    }

    /**
     * @param project_primary_address4 the project_primary_address4 to set
     */
    public void setProject_primary_address4(String project_primary_address4) {
        this.project_primary_address4 = project_primary_address4;
    }

    /**
     * @return the project_primary_type
     */
    public int getProject_primary_type() {
        return project_primary_type;
    }

    /**
     * @param project_primary_type the project_primary_type to set
     */
    public void setProject_primary_type(int project_primary_type) {
        this.project_primary_type = project_primary_type;
    }

    /**
     * @return the project_primary_vatAdded
     */
    public String getProject_primary_vatAdded() {
        return project_primary_vatAdded;
    }

    /**
     * @param project_primary_vatAdded the project_primary_vatAdded to set
     */
    public void setProject_primary_vatAdded(String project_primary_vatAdded) {
        this.project_primary_vatAdded = project_primary_vatAdded;
    }

    /**
     * @return the project_primary_contractBidNo
     */
    public String getProject_primary_contractBidNo() {
        return project_primary_contractBidNo;
    }

    /**
     * @param project_primary_contractBidNo the project_primary_contractBidNo to set
     */
    public void setProject_primary_contractBidNo(String project_primary_contractBidNo) {
        this.project_primary_contractBidNo = project_primary_contractBidNo;
    }

    /**
     * @return the project_primary_clientName
     */
    public String getProject_primary_clientName() {
        return project_primary_clientName;
    }

    /**
     * @param project_primary_clientName the project_primary_clientName to set
     */
    public void setProject_primary_clientName(String project_primary_clientName) {
        this.project_primary_clientName = project_primary_clientName;
    }

    /**
     * @return the project_primary_clientAddress1
     */
    public String getProject_primary_clientAddress1() {
        return project_primary_clientAddress1;
    }

    /**
     * @param project_primary_clientAddress1 the project_primary_clientAddress1 to set
     */
    public void setProject_primary_clientAddress1(String project_primary_clientAddress1) {
        this.project_primary_clientAddress1 = project_primary_clientAddress1;
    }

    /**
     * @return the project_primary_clientAddress2
     */
    public String getProject_primary_clientAddress2() {
        return project_primary_clientAddress2;
    }

    /**
     * @param project_primary_clientAddress2 the project_primary_clientAddress2 to set
     */
    public void setProject_primary_clientAddress2(String project_primary_clientAddress2) {
        this.project_primary_clientAddress2 = project_primary_clientAddress2;
    }

    /**
     * @return the project_primary_clientAddress3
     */
    public String getProject_primary_clientAddress3() {
        return project_primary_clientAddress3;
    }

    /**
     * @param project_primary_clientAddress3 the project_primary_clientAddress3 to set
     */
    public void setProject_primary_clientAddress3(String project_primary_clientAddress3) {
        this.project_primary_clientAddress3 = project_primary_clientAddress3;
    }

    /**
     * @return the project_primary_clientAddress4
     */
    public String getProject_primary_clientAddress4() {
        return project_primary_clientAddress4;
    }

    /**
     * @param project_primary_clientAddress4 the project_primary_clientAddress4 to set
     */
    public void setProject_primary_clientAddress4(String project_primary_clientAddress4) {
        this.project_primary_clientAddress4 = project_primary_clientAddress4;
    }

    /**
     * @return the project_primary_clientContact1
     */
    public String getProject_primary_clientContact1() {
        return project_primary_clientContact1;
    }

    /**
     * @param project_primary_clientContact1 the project_primary_clientContact1 to set
     */
    public void setProject_primary_clientContact1(String project_primary_clientContact1) {
        this.project_primary_clientContact1 = project_primary_clientContact1;
    }

    /**
     * @return the project_primary_clientContact2
     */
    public String getProject_primary_clientContact2() {
        return project_primary_clientContact2;
    }

    /**
     * @param project_primary_clientContact2 the project_primary_clientContact2 to set
     */
    public void setProject_primary_clientContact2(String project_primary_clientContact2) {
        this.project_primary_clientContact2 = project_primary_clientContact2;
    }

    /**
     * @return the project_primary_intendedDuration
     */
    public String getProject_primary_intendedDuration() {
        return project_primary_intendedDuration;
    }

    /**
     * @param project_primary_intendedDuration the project_primary_intendedDuration to set
     */
    public void setProject_primary_intendedDuration(String project_primary_intendedDuration) {
        this.project_primary_intendedDuration = project_primary_intendedDuration;
    }

    /**
     * @return the project_primary_ictadSpeciality_id
     */
    public int getProject_primary_ictadSpeciality_id() {
        return project_primary_ictadSpeciality_id;
    }

    /**
     * @param project_primary_ictadSpeciality_id the project_primary_ictadSpeciality_id to set
     */
    public void setProject_primary_ictadSpeciality_id(int project_primary_ictadSpeciality_id) {
        this.project_primary_ictadSpeciality_id = project_primary_ictadSpeciality_id;
    }

    /**
     * @return the project_primary_ictadGrade_id
     */
    public int getProject_primary_ictadGrade_id() {
        return project_primary_ictadGrade_id;
    }

    /**
     * @param project_primary_ictadGrade_id the project_primary_ictadGrade_id to set
     */
    public void setProject_primary_ictadGrade_id(int project_primary_ictadGrade_id) {
        this.project_primary_ictadGrade_id = project_primary_ictadGrade_id;
    }

    /**
     * @return the project_primary_engineerEstimate
     */
    public double getProject_primary_engineerEstimate() {
        return project_primary_engineerEstimate;
    }

    /**
     * @param project_primary_engineerEstimate the project_primary_engineerEstimate to set
     */
    public void setProject_primary_engineerEstimate(double project_primary_engineerEstimate) {
        this.project_primary_engineerEstimate = project_primary_engineerEstimate;
    }

    /**
     * @return the project_primary_tenderFee
     */
    public double getProject_primary_tenderFee() {
        return project_primary_tenderFee;
    }

    /**
     * @param project_primary_tenderFee the project_primary_tenderFee to set
     */
    public void setProject_primary_tenderFee(double project_primary_tenderFee) {
        this.project_primary_tenderFee = project_primary_tenderFee;
    }

    /**
     * @return the project_primary_bidPaymentMode
     */
    public String getProject_primary_bidPaymentMode() {
        return project_primary_bidPaymentMode;
    }

    /**
     * @param project_primary_bidPaymentMode the project_primary_bidPaymentMode to set
     */
    public void setProject_primary_bidPaymentMode(String project_primary_bidPaymentMode) {
        this.project_primary_bidPaymentMode = project_primary_bidPaymentMode;
    }

    /**
     * @return the project_primary_bidAmount
     */
    public double getProject_primary_bidAmount() {
        return project_primary_bidAmount;
    }

    /**
     * @param project_primary_bidAmount the project_primary_bidAmount to set
     */
    public void setProject_primary_bidAmount(double project_primary_bidAmount) {
        this.project_primary_bidAmount = project_primary_bidAmount;
    }

    /**
     * @return the project_primary_bidDuration
     */
    public String getProject_primary_bidDuration() {
        return project_primary_bidDuration;
    }

    /**
     * @param project_primary_bidDuration the project_primary_bidDuration to set
     */
    public void setProject_primary_bidDuration(String project_primary_bidDuration) {
        this.project_primary_bidDuration = project_primary_bidDuration;
    }

    /**
     * @return the project_primary_bidOrganization
     */
    public String getProject_primary_bidOrganization() {
        return project_primary_bidOrganization;
    }

    /**
     * @param project_primary_bidOrganization the project_primary_bidOrganization to set
     */
    public void setProject_primary_bidOrganization(String project_primary_bidOrganization) {
        this.project_primary_bidOrganization = project_primary_bidOrganization;
    }

    /**
     * @return the project_primary_tenderOpenDate
     */
    public Date getProject_primary_tenderOpenDate() {
        return project_primary_tenderOpenDate;
    }

    /**
     * @param project_primary_tenderOpenDate the project_primary_tenderOpenDate to set
     */
    public void setProject_primary_tenderOpenDate(Date project_primary_tenderOpenDate) {
        this.project_primary_tenderOpenDate = project_primary_tenderOpenDate;
    }

    /**
     * @return the project_primary_tenderOpenTime
     */
    public Time getProject_primary_tenderOpenTime() {
        return project_primary_tenderOpenTime;
    }

    /**
     * @param project_primary_tenderOpenTime the project_primary_tenderOpenTime to set
     */
    public void setProject_primary_tenderOpenTime(Time project_primary_tenderOpenTime) {
        this.project_primary_tenderOpenTime = project_primary_tenderOpenTime;
    }

    /**
     * @return the project_primary_tenderResult
     */
    public String getProject_primary_tenderResult() {
        return project_primary_tenderResult;
    }

    /**
     * @param project_primary_tenderResult the project_primary_tenderResult to set
     */
    public void setProject_primary_tenderResult(String project_primary_tenderResult) {
        this.project_primary_tenderResult = project_primary_tenderResult;
    }

    /**
     * @return the project_primary_statusActiveDate
     */
    public Date getProject_primary_statusActiveDate() {
        return project_primary_statusActiveDate;
    }

    /**
     * @param project_primary_statusActiveDate the project_primary_statusActiveDate to set
     */
    public void setProject_primary_statusActiveDate(Date project_primary_statusActiveDate) {
        this.project_primary_statusActiveDate = project_primary_statusActiveDate;
    }

    /**
     * @return the project_primary_statusInactiveDate
     */
    public Date getProject_primary_statusInactiveDate() {
        return project_primary_statusInactiveDate;
    }

    /**
     * @param project_primary_statusInactiveDate the project_primary_statusInactiveDate to set
     */
    public void setProject_primary_statusInactiveDate(Date project_primary_statusInactiveDate) {
        this.project_primary_statusInactiveDate = project_primary_statusInactiveDate;
    }

    /**
     * @return the project_secondary_boq
     */
    public double getProject_secondary_boq() {
        return project_secondary_boq;
    }

    /**
     * @param project_secondary_boq the project_secondary_boq to set
     */
    public void setProject_secondary_boq(double project_secondary_boq) {
        this.project_secondary_boq = project_secondary_boq;
    }

    /**
     * @return the project_secondary_nbt
     */
    public double getProject_secondary_nbt() {
        return project_secondary_nbt;
    }

    /**
     * @param project_secondary_nbt the project_secondary_nbt to set
     */
    public void setProject_secondary_nbt(double project_secondary_nbt) {
        this.project_secondary_nbt = project_secondary_nbt;
    }

    /**
     * @return the project_secondary_vat
     */
    public double getProject_secondary_vat() {
        return project_secondary_vat;
    }

    /**
     * @param project_secondary_vat the project_secondary_vat to set
     */
    public void setProject_secondary_vat(double project_secondary_vat) {
        this.project_secondary_vat = project_secondary_vat;
    }

    /**
     * @return the project_secondary_duration
     */
    public String getProject_secondary_duration() {
        return project_secondary_duration;
    }

    /**
     * @param project_secondary_duration the project_secondary_duration to set
     */
    public void setProject_secondary_duration(String project_secondary_duration) {
        this.project_secondary_duration = project_secondary_duration;
    }

    /**
     * @return the project_secondary_agreementDate
     */
    public Date getProject_secondary_agreementDate() {
        return project_secondary_agreementDate;
    }

    /**
     * @param project_secondary_agreementDate the project_secondary_agreementDate to set
     */
    public void setProject_secondary_agreementDate(Date project_secondary_agreementDate) {
        this.project_secondary_agreementDate = project_secondary_agreementDate;
    }

    /**
     * @return the project_secondary_consultant
     */
    public String getProject_secondary_consultant() {
        return project_secondary_consultant;
    }

    /**
     * @param project_secondary_consultant the project_secondary_consultant to set
     */
    public void setProject_secondary_consultant(String project_secondary_consultant) {
        this.project_secondary_consultant = project_secondary_consultant;
    }

    /**
     * @return the project_secondary_consultantAddress
     */
    public String getProject_secondary_consultantAddress() {
        return project_secondary_consultantAddress;
    }

    /**
     * @param project_secondary_consultantAddress the project_secondary_consultantAddress to set
     */
    public void setProject_secondary_consultantAddress(String project_secondary_consultantAddress) {
        this.project_secondary_consultantAddress = project_secondary_consultantAddress;
    }

    /**
     * @return the project_secondary_consultantContact
     */
    public String getProject_secondary_consultantContact() {
        return project_secondary_consultantContact;
    }

    /**
     * @param project_secondary_consultantContact the project_secondary_consultantContact to set
     */
    public void setProject_secondary_consultantContact(String project_secondary_consultantContact) {
        this.project_secondary_consultantContact = project_secondary_consultantContact;
    }

    /**
     * @return the project_secondary_commencementDate
     */
    public Date getProject_secondary_commencementDate() {
        return project_secondary_commencementDate;
    }

    /**
     * @param project_secondary_commencementDate the project_secondary_commencementDate to set
     */
    public void setProject_secondary_commencementDate(Date project_secondary_commencementDate) {
        this.project_secondary_commencementDate = project_secondary_commencementDate;
    }

    /**
     * @return the project_secondary_completionDate
     */
    public Date getProject_secondary_completionDate() {
        return project_secondary_completionDate;
    }

    /**
     * @param project_secondary_completionDate the project_secondary_completionDate to set
     */
    public void setProject_secondary_completionDate(Date project_secondary_completionDate) {
        this.project_secondary_completionDate = project_secondary_completionDate;
    }

    /**
     * @return the project_secondary_performanceBondOrganization
     */
    public String getProject_secondary_performanceBondOrganization() {
        return project_secondary_performanceBondOrganization;
    }

    /**
     * @param project_secondary_performanceBondOrganization the project_secondary_performanceBondOrganization to set
     */
    public void setProject_secondary_performanceBondOrganization(String project_secondary_performanceBondOrganization) {
        this.project_secondary_performanceBondOrganization = project_secondary_performanceBondOrganization;
    }

    /**
     * @return the project_secondary_performanceBondAmount
     */
    public double getProject_secondary_performanceBondAmount() {
        return project_secondary_performanceBondAmount;
    }

    /**
     * @param project_secondary_performanceBondAmount the project_secondary_performanceBondAmount to set
     */
    public void setProject_secondary_performanceBondAmount(double project_secondary_performanceBondAmount) {
        this.project_secondary_performanceBondAmount = project_secondary_performanceBondAmount;
    }

    /**
     * @return the project_secondary_performanceBondValidFrom
     */
    public Date getProject_secondary_performanceBondValidFrom() {
        return project_secondary_performanceBondValidFrom;
    }

    /**
     * @param project_secondary_performanceBondValidFrom the project_secondary_performanceBondValidFrom to set
     */
    public void setProject_secondary_performanceBondValidFrom(Date project_secondary_performanceBondValidFrom) {
        this.project_secondary_performanceBondValidFrom = project_secondary_performanceBondValidFrom;
    }

    /**
     * @return the project_secondary_performanceBondValidTo
     */
    public Date getProject_secondary_performanceBondValidTo() {
        return project_secondary_performanceBondValidTo;
    }

    /**
     * @param project_secondary_performanceBondValidTo the project_secondary_performanceBondValidTo to set
     */
    public void setProject_secondary_performanceBondValidTo(Date project_secondary_performanceBondValidTo) {
        this.project_secondary_performanceBondValidTo = project_secondary_performanceBondValidTo;
    }

    /**
     * @return the project_secondary_advancePaymentBondOrganization
     */
    public String getProject_secondary_advancePaymentBondOrganization() {
        return project_secondary_advancePaymentBondOrganization;
    }

    /**
     * @param project_secondary_advancePaymentBondOrganization the project_secondary_advancePaymentBondOrganization to set
     */
    public void setProject_secondary_advancePaymentBondOrganization(String project_secondary_advancePaymentBondOrganization) {
        this.project_secondary_advancePaymentBondOrganization = project_secondary_advancePaymentBondOrganization;
    }

    /**
     * @return the project_secondary_advancePaymentBondAmount
     */
    public double getProject_secondary_advancePaymentBondAmount() {
        return project_secondary_advancePaymentBondAmount;
    }

    /**
     * @param project_secondary_advancePaymentBondAmount the project_secondary_advancePaymentBondAmount to set
     */
    public void setProject_secondary_advancePaymentBondAmount(double project_secondary_advancePaymentBondAmount) {
        this.project_secondary_advancePaymentBondAmount = project_secondary_advancePaymentBondAmount;
    }

    /**
     * @return the project_secondary_advancePaymentBondValidFrom
     */
    public Date getProject_secondary_advancePaymentBondValidFrom() {
        return project_secondary_advancePaymentBondValidFrom;
    }

    /**
     * @param project_secondary_advancePaymentBondValidFrom the project_secondary_advancePaymentBondValidFrom to set
     */
    public void setProject_secondary_advancePaymentBondValidFrom(Date project_secondary_advancePaymentBondValidFrom) {
        this.project_secondary_advancePaymentBondValidFrom = project_secondary_advancePaymentBondValidFrom;
    }

    /**
     * @return the project_secondary_advancePaymentBondValidTo
     */
    public Date getProject_secondary_advancePaymentBondValidTo() {
        return project_secondary_advancePaymentBondValidTo;
    }

    /**
     * @param project_secondary_advancePaymentBondValidTo the project_secondary_advancePaymentBondValidTo to set
     */
    public void setProject_secondary_advancePaymentBondValidTo(Date project_secondary_advancePaymentBondValidTo) {
        this.project_secondary_advancePaymentBondValidTo = project_secondary_advancePaymentBondValidTo;
    }

    /**
     * @return the project_secondary_insuranceCover
     */
    public String getProject_secondary_insuranceCover() {
        return project_secondary_insuranceCover;
    }

    /**
     * @param project_secondary_insuranceCover the project_secondary_insuranceCover to set
     */
    public void setProject_secondary_insuranceCover(String project_secondary_insuranceCover) {
        this.project_secondary_insuranceCover = project_secondary_insuranceCover;
    }

    /**
     * @return the project_secondary_insuranceCoverOrganization
     */
    public String getProject_secondary_insuranceCoverOrganization() {
        return project_secondary_insuranceCoverOrganization;
    }

    /**
     * @param project_secondary_insuranceCoverOrganization the project_secondary_insuranceCoverOrganization to set
     */
    public void setProject_secondary_insuranceCoverOrganization(String project_secondary_insuranceCoverOrganization) {
        this.project_secondary_insuranceCoverOrganization = project_secondary_insuranceCoverOrganization;
    }

    /**
     * @return the project_secondary_insuranceCoverAmount
     */
    public double getProject_secondary_insuranceCoverAmount() {
        return project_secondary_insuranceCoverAmount;
    }

    /**
     * @param project_secondary_insuranceCoverAmount the project_secondary_insuranceCoverAmount to set
     */
    public void setProject_secondary_insuranceCoverAmount(double project_secondary_insuranceCoverAmount) {
        this.project_secondary_insuranceCoverAmount = project_secondary_insuranceCoverAmount;
    }

    /**
     * @return the project_secondary_insuranceValidFrom
     */
    public Date getProject_secondary_insuranceValidFrom() {
        return project_secondary_insuranceValidFrom;
    }

    /**
     * @param project_secondary_insuranceValidFrom the project_secondary_insuranceValidFrom to set
     */
    public void setProject_secondary_insuranceValidFrom(Date project_secondary_insuranceValidFrom) {
        this.project_secondary_insuranceValidFrom = project_secondary_insuranceValidFrom;
    }

    /**
     * @return the project_secondary_insuranceValidTo
     */
    public Date getProject_secondary_insuranceValidTo() {
        return project_secondary_insuranceValidTo;
    }

    /**
     * @param project_secondary_insuranceValidTo the project_secondary_insuranceValidTo to set
     */
    public void setProject_secondary_insuranceValidTo(Date project_secondary_insuranceValidTo) {
        this.project_secondary_insuranceValidTo = project_secondary_insuranceValidTo;
    }

    /**
     * @return the project_secondary_paymentMode
     */
    public String getProject_secondary_paymentMode() {
        return project_secondary_paymentMode;
    }

    /**
     * @param project_secondary_paymentMode the project_secondary_paymentMode to set
     */
    public void setProject_secondary_paymentMode(String project_secondary_paymentMode) {
        this.project_secondary_paymentMode = project_secondary_paymentMode;
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
     * @return the project_final_nbt
     */
    public double getProject_final_nbt() {
        return project_final_nbt;
    }

    /**
     * @param project_final_nbt the project_final_nbt to set
     */
    public void setProject_final_nbt(double project_final_nbt) {
        this.project_final_nbt = project_final_nbt;
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
