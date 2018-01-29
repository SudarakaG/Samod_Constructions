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
public class M_Project_Primary implements Serializable{
    
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

    public M_Project_Primary() {
    }

    public M_Project_Primary(int project_id, String project_primary_name, String project_primary_description, String project_primary_address1, String project_primary_address2, String project_primary_address3, String project_primary_address4, int project_primary_type, String project_primary_vatAdded, String project_primary_contractBidNo, String project_primary_clientName, String project_primary_clientAddress1, String project_primary_clientAddress2, String project_primary_clientAddress3, String project_primary_clientAddress4, String project_primary_clientContact1, String project_primary_clientContact2, String project_primary_intendedDuration, int project_primary_ictadSpeciality_id, int project_primary_ictadGrade_id, double project_primary_engineerEstimate, double project_primary_tenderFee, String project_primary_bidPaymentMode, double project_primary_bidAmount, String project_primary_bidDuration, String project_primary_bidOrganization, Date project_primary_tenderOpenDate, Time project_primary_tenderOpenTime, String project_primary_tenderResult, Date project_primary_statusActiveDate, Date project_primary_statusInactiveDate) {
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

    
}
