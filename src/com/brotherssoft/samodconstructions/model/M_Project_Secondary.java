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
public class M_Project_Secondary implements Serializable{
    
    private int project_id;
    private double project_secondary_boq;
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
    private String project_currentStatus;
    private double project_secondary_nbt;

    public M_Project_Secondary() {
    }

    public M_Project_Secondary(int project_id, double project_secondary_boq, double project_secondary_vat, String project_secondary_duration, Date project_secondary_agreementDate, String project_secondary_consultant, String project_secondary_consultantAddress, String project_secondary_consultantContact, Date project_secondary_commencementDate, Date project_secondary_completionDate, String project_secondary_performanceBondOrganization, double project_secondary_performanceBondAmount, Date project_secondary_performanceBondValidFrom, Date project_secondary_performanceBondValidTo, String project_secondary_advancePaymentBondOrganization, double project_secondary_advancePaymentBondAmount, Date project_secondary_advancePaymentBondValidFrom, Date project_secondary_advancePaymentBondValidTo, String project_secondary_insuranceCover, String project_secondary_insuranceCoverOrganization, double project_secondary_insuranceCoverAmount, Date project_secondary_insuranceValidFrom, Date project_secondary_insuranceValidTo, String project_secondary_paymentMode, String project_currentStatus, double project_secondary_nbt) {
        this.project_id = project_id;
        this.project_secondary_boq = project_secondary_boq;
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
        this.project_currentStatus = project_currentStatus;
        this.project_secondary_nbt = project_secondary_nbt;
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
     * @return the project_currentStatus
     */
    public String getProject_currentStatus() {
        return project_currentStatus;
    }

    /**
     * @param project_currentStatus the project_currentStatus to set
     */
    public void setProject_currentStatus(String project_currentStatus) {
        this.project_currentStatus = project_currentStatus;
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

    
}
