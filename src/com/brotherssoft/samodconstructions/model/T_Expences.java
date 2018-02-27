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
public class T_Expences implements Serializable{
    
    private int expence_id;
    private String expence_description;
    private int expence_typeId;
    private int expence_subTypeId;
    private Date expence_date;
    private int expence_purchaserId;
    private String expence_invoiceNo;
    private double expence_invoiceAmount;
    private double expence_vatAmount;
    private int expence_paymentModeId;
    private String expence_RefNo;
    private Date expence_dateIssued;
    private Date expence_dateReceived;
    private int expence_refId;
    private int expence_refSiteId;
    private int expence_enteredUser;
    private int expence_approvedUser;
    private Date expence_enteredDate;
    private Date expence_approvedDate;
    private String expence_status;
    private int expence_account;

    public T_Expences() {
    }

    public T_Expences(int expence_id, String expence_description, int expence_typeId, int expence_subTypeId, Date expence_date, int expence_purchaserId, String expence_invoiceNo, double expence_invoiceAmount, double expence_vatAmount, int expence_paymentModeId, String expence_RefNo, Date expence_dateIssued, Date expence_dateReceived, int expence_refId, int expence_refSiteId, int expence_enteredUser, int expence_approvedUser, Date expence_enteredDate, Date expence_approvedDate, String expence_status, int expence_account) {
        this.expence_id = expence_id;
        this.expence_description = expence_description;
        this.expence_typeId = expence_typeId;
        this.expence_subTypeId = expence_subTypeId;
        this.expence_date = expence_date;
        this.expence_purchaserId = expence_purchaserId;
        this.expence_invoiceNo = expence_invoiceNo;
        this.expence_invoiceAmount = expence_invoiceAmount;
        this.expence_vatAmount = expence_vatAmount;
        this.expence_paymentModeId = expence_paymentModeId;
        this.expence_RefNo = expence_RefNo;
        this.expence_dateIssued = expence_dateIssued;
        this.expence_dateReceived = expence_dateReceived;
        this.expence_refId = expence_refId;
        this.expence_refSiteId = expence_refSiteId;
        this.expence_enteredUser = expence_enteredUser;
        this.expence_approvedUser = expence_approvedUser;
        this.expence_enteredDate = expence_enteredDate;
        this.expence_approvedDate = expence_approvedDate;
        this.expence_status = expence_status;
        this.expence_account = expence_account;
    }

    /**
     * @return the expence_id
     */
    public int getExpence_id() {
        return expence_id;
    }

    /**
     * @param expence_id the expence_id to set
     */
    public void setExpence_id(int expence_id) {
        this.expence_id = expence_id;
    }

    /**
     * @return the expence_description
     */
    public String getExpence_description() {
        return expence_description;
    }

    /**
     * @param expence_description the expence_description to set
     */
    public void setExpence_description(String expence_description) {
        this.expence_description = expence_description;
    }

    /**
     * @return the expence_typeId
     */
    public int getExpence_typeId() {
        return expence_typeId;
    }

    /**
     * @param expence_typeId the expence_typeId to set
     */
    public void setExpence_typeId(int expence_typeId) {
        this.expence_typeId = expence_typeId;
    }

    /**
     * @return the expence_subTypeId
     */
    public int getExpence_subTypeId() {
        return expence_subTypeId;
    }

    /**
     * @param expence_subTypeId the expence_subTypeId to set
     */
    public void setExpence_subTypeId(int expence_subTypeId) {
        this.expence_subTypeId = expence_subTypeId;
    }

    /**
     * @return the expence_date
     */
    public Date getExpence_date() {
        return expence_date;
    }

    /**
     * @param expence_date the expence_date to set
     */
    public void setExpence_date(Date expence_date) {
        this.expence_date = expence_date;
    }

    /**
     * @return the expence_purchaserId
     */
    public int getExpence_purchaserId() {
        return expence_purchaserId;
    }

    /**
     * @param expence_purchaserId the expence_purchaserId to set
     */
    public void setExpence_purchaserId(int expence_purchaserId) {
        this.expence_purchaserId = expence_purchaserId;
    }

    /**
     * @return the expence_invoiceNo
     */
    public String getExpence_invoiceNo() {
        return expence_invoiceNo;
    }

    /**
     * @param expence_invoiceNo the expence_invoiceNo to set
     */
    public void setExpence_invoiceNo(String expence_invoiceNo) {
        this.expence_invoiceNo = expence_invoiceNo;
    }

    /**
     * @return the expence_invoiceAmount
     */
    public double getExpence_invoiceAmount() {
        return expence_invoiceAmount;
    }

    /**
     * @param expence_invoiceAmount the expence_invoiceAmount to set
     */
    public void setExpence_invoiceAmount(double expence_invoiceAmount) {
        this.expence_invoiceAmount = expence_invoiceAmount;
    }

    /**
     * @return the expence_vatAmount
     */
    public double getExpence_vatAmount() {
        return expence_vatAmount;
    }

    /**
     * @param expence_vatAmount the expence_vatAmount to set
     */
    public void setExpence_vatAmount(double expence_vatAmount) {
        this.expence_vatAmount = expence_vatAmount;
    }

    /**
     * @return the expence_paymentModeId
     */
    public int getExpence_paymentModeId() {
        return expence_paymentModeId;
    }

    /**
     * @param expence_paymentModeId the expence_paymentModeId to set
     */
    public void setExpence_paymentModeId(int expence_paymentModeId) {
        this.expence_paymentModeId = expence_paymentModeId;
    }

    /**
     * @return the expence_RefNo
     */
    public String getExpence_RefNo() {
        return expence_RefNo;
    }

    /**
     * @param expence_RefNo the expence_RefNo to set
     */
    public void setExpence_RefNo(String expence_RefNo) {
        this.expence_RefNo = expence_RefNo;
    }

    /**
     * @return the expence_dateIssued
     */
    public Date getExpence_dateIssued() {
        return expence_dateIssued;
    }

    /**
     * @param expence_dateIssued the expence_dateIssued to set
     */
    public void setExpence_dateIssued(Date expence_dateIssued) {
        this.expence_dateIssued = expence_dateIssued;
    }

    /**
     * @return the expence_dateReceived
     */
    public Date getExpence_dateReceived() {
        return expence_dateReceived;
    }

    /**
     * @param expence_dateReceived the expence_dateReceived to set
     */
    public void setExpence_dateReceived(Date expence_dateReceived) {
        this.expence_dateReceived = expence_dateReceived;
    }

    /**
     * @return the expence_refId
     */
    public int getExpence_refId() {
        return expence_refId;
    }

    /**
     * @param expence_refId the expence_refId to set
     */
    public void setExpence_refId(int expence_refId) {
        this.expence_refId = expence_refId;
    }

    /**
     * @return the expence_refSiteId
     */
    public int getExpence_refSiteId() {
        return expence_refSiteId;
    }

    /**
     * @param expence_refSiteId the expence_refSiteId to set
     */
    public void setExpence_refSiteId(int expence_refSiteId) {
        this.expence_refSiteId = expence_refSiteId;
    }

    /**
     * @return the expence_enteredUser
     */
    public int getExpence_enteredUser() {
        return expence_enteredUser;
    }

    /**
     * @param expence_enteredUser the expence_enteredUser to set
     */
    public void setExpence_enteredUser(int expence_enteredUser) {
        this.expence_enteredUser = expence_enteredUser;
    }

    /**
     * @return the expence_approvedUser
     */
    public int getExpence_approvedUser() {
        return expence_approvedUser;
    }

    /**
     * @param expence_approvedUser the expence_approvedUser to set
     */
    public void setExpence_approvedUser(int expence_approvedUser) {
        this.expence_approvedUser = expence_approvedUser;
    }

    /**
     * @return the expence_enteredDate
     */
    public Date getExpence_enteredDate() {
        return expence_enteredDate;
    }

    /**
     * @param expence_enteredDate the expence_enteredDate to set
     */
    public void setExpence_enteredDate(Date expence_enteredDate) {
        this.expence_enteredDate = expence_enteredDate;
    }

    /**
     * @return the expence_approvedDate
     */
    public Date getExpence_approvedDate() {
        return expence_approvedDate;
    }

    /**
     * @param expence_approvedDate the expence_approvedDate to set
     */
    public void setExpence_approvedDate(Date expence_approvedDate) {
        this.expence_approvedDate = expence_approvedDate;
    }

    /**
     * @return the expence_status
     */
    public String getExpence_status() {
        return expence_status;
    }

    /**
     * @param expence_status the expence_status to set
     */
    public void setExpence_status(String expence_status) {
        this.expence_status = expence_status;
    }

    /**
     * @return the expence_account
     */
    public int getExpence_account() {
        return expence_account;
    }

    /**
     * @param expence_account the expence_account to set
     */
    public void setExpence_account(int expence_account) {
        this.expence_account = expence_account;
    }

    
}
