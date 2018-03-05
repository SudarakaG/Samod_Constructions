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
public class T_Income implements Serializable{
    
    private int income_id;
    private String income_description;
    private int income_typeId;
    private int income_subTypeId;
    private Date income_date;
    private int income_siteId;
    private String income_paymentVoucherNo;
    private double income_billAmount;
    private double income_vatAmount;
    private int income_paymentModeId;
    private Date income_dateOfIssue;
    private Date income_dateOfReceived;
    private int income_RefNo;
    private int income_enteredUser;
    private int income_approvedUser;
    private Date income_enteredDate;
    private Date income_approvedDate;
    private String income_status;
    private int income_account;

    public T_Income() {
    }

    public T_Income(int income_id, String income_description, int income_typeId, int income_subTypeId, Date income_date, int income_siteId, String income_paymentVoucherNo, double income_billAmount, double income_vatAmount, int income_paymentModeId, Date income_dateOfIssue, Date income_dateOfReceived, int income_RefNo, int income_enteredUser, int income_approvedUser, Date income_enteredDate, Date income_approvedDate, String income_status, int income_account) {
        this.income_id = income_id;
        this.income_description = income_description;
        this.income_typeId = income_typeId;
        this.income_subTypeId = income_subTypeId;
        this.income_date = income_date;
        this.income_siteId = income_siteId;
        this.income_paymentVoucherNo = income_paymentVoucherNo;
        this.income_billAmount = income_billAmount;
        this.income_vatAmount = income_vatAmount;
        this.income_paymentModeId = income_paymentModeId;
        this.income_dateOfIssue = income_dateOfIssue;
        this.income_dateOfReceived = income_dateOfReceived;
        this.income_RefNo = income_RefNo;
        this.income_enteredUser = income_enteredUser;
        this.income_approvedUser = income_approvedUser;
        this.income_enteredDate = income_enteredDate;
        this.income_approvedDate = income_approvedDate;
        this.income_status = income_status;
        this.income_account = income_account;
    }

    /**
     * @return the income_id
     */
    public int getIncome_id() {
        return income_id;
    }

    /**
     * @param income_id the income_id to set
     */
    public void setIncome_id(int income_id) {
        this.income_id = income_id;
    }

    /**
     * @return the income_description
     */
    public String getIncome_description() {
        return income_description;
    }

    /**
     * @param income_description the income_description to set
     */
    public void setIncome_description(String income_description) {
        this.income_description = income_description;
    }

    /**
     * @return the income_typeId
     */
    public int getIncome_typeId() {
        return income_typeId;
    }

    /**
     * @param income_typeId the income_typeId to set
     */
    public void setIncome_typeId(int income_typeId) {
        this.income_typeId = income_typeId;
    }

    /**
     * @return the income_subTypeId
     */
    public int getIncome_subTypeId() {
        return income_subTypeId;
    }

    /**
     * @param income_subTypeId the income_subTypeId to set
     */
    public void setIncome_subTypeId(int income_subTypeId) {
        this.income_subTypeId = income_subTypeId;
    }

    /**
     * @return the income_date
     */
    public Date getIncome_date() {
        return income_date;
    }

    /**
     * @param income_date the income_date to set
     */
    public void setIncome_date(Date income_date) {
        this.income_date = income_date;
    }

    /**
     * @return the income_siteId
     */
    public int getIncome_siteId() {
        return income_siteId;
    }

    /**
     * @param income_siteId the income_siteId to set
     */
    public void setIncome_siteId(int income_siteId) {
        this.income_siteId = income_siteId;
    }

    /**
     * @return the income_paymentVoucherNo
     */
    public String getIncome_paymentVoucherNo() {
        return income_paymentVoucherNo;
    }

    /**
     * @param income_paymentVoucherNo the income_paymentVoucherNo to set
     */
    public void setIncome_paymentVoucherNo(String income_paymentVoucherNo) {
        this.income_paymentVoucherNo = income_paymentVoucherNo;
    }

    /**
     * @return the income_billAmount
     */
    public double getIncome_billAmount() {
        return income_billAmount;
    }

    /**
     * @param income_billAmount the income_billAmount to set
     */
    public void setIncome_billAmount(double income_billAmount) {
        this.income_billAmount = income_billAmount;
    }

    /**
     * @return the income_vatAmount
     */
    public double getIncome_vatAmount() {
        return income_vatAmount;
    }

    /**
     * @param income_vatAmount the income_vatAmount to set
     */
    public void setIncome_vatAmount(double income_vatAmount) {
        this.income_vatAmount = income_vatAmount;
    }

    /**
     * @return the income_paymentModeId
     */
    public int getIncome_paymentModeId() {
        return income_paymentModeId;
    }

    /**
     * @param income_paymentModeId the income_paymentModeId to set
     */
    public void setIncome_paymentModeId(int income_paymentModeId) {
        this.income_paymentModeId = income_paymentModeId;
    }

    /**
     * @return the income_dateOfIssue
     */
    public Date getIncome_dateOfIssue() {
        return income_dateOfIssue;
    }

    /**
     * @param income_dateOfIssue the income_dateOfIssue to set
     */
    public void setIncome_dateOfIssue(Date income_dateOfIssue) {
        this.income_dateOfIssue = income_dateOfIssue;
    }

    /**
     * @return the income_dateOfReceived
     */
    public Date getIncome_dateOfReceived() {
        return income_dateOfReceived;
    }

    /**
     * @param income_dateOfReceived the income_dateOfReceived to set
     */
    public void setIncome_dateOfReceived(Date income_dateOfReceived) {
        this.income_dateOfReceived = income_dateOfReceived;
    }

    /**
     * @return the income_RefNo
     */
    public int getIncome_RefNo() {
        return income_RefNo;
    }

    /**
     * @param income_RefNo the income_RefNo to set
     */
    public void setIncome_RefNo(int income_RefNo) {
        this.income_RefNo = income_RefNo;
    }

    /**
     * @return the income_enteredUser
     */
    public int getIncome_enteredUser() {
        return income_enteredUser;
    }

    /**
     * @param income_enteredUser the income_enteredUser to set
     */
    public void setIncome_enteredUser(int income_enteredUser) {
        this.income_enteredUser = income_enteredUser;
    }

    /**
     * @return the income_approvedUser
     */
    public int getIncome_approvedUser() {
        return income_approvedUser;
    }

    /**
     * @param income_approvedUser the income_approvedUser to set
     */
    public void setIncome_approvedUser(int income_approvedUser) {
        this.income_approvedUser = income_approvedUser;
    }

    /**
     * @return the income_enteredDate
     */
    public Date getIncome_enteredDate() {
        return income_enteredDate;
    }

    /**
     * @param income_enteredDate the income_enteredDate to set
     */
    public void setIncome_enteredDate(Date income_enteredDate) {
        this.income_enteredDate = income_enteredDate;
    }

    /**
     * @return the income_approvedDate
     */
    public Date getIncome_approvedDate() {
        return income_approvedDate;
    }

    /**
     * @param income_approvedDate the income_approvedDate to set
     */
    public void setIncome_approvedDate(Date income_approvedDate) {
        this.income_approvedDate = income_approvedDate;
    }

    /**
     * @return the income_status
     */
    public String getIncome_status() {
        return income_status;
    }

    /**
     * @param income_status the income_status to set
     */
    public void setIncome_status(String income_status) {
        this.income_status = income_status;
    }

    /**
     * @return the income_account
     */
    public int getIncome_account() {
        return income_account;
    }

    /**
     * @param income_account the income_account to set
     */
    public void setIncome_account(int income_account) {
        this.income_account = income_account;
    }

    
}
