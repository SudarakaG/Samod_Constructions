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
public class T_CashRequest implements Serializable{
    
    private int cashRequest_id;
    private Date cashRequest_date;
    private int cashRequest_employeeId;
    private int cashRequest_responceId;
    private int cashRequest_siteId;
    private String cashRequest_purpose;
    private double cashRequest_amount;
    private int cashRequest_paymentTypeId;
    private String cashRequest_chequeNo;
    private Date cashRequest_chequeDate;
    private String cashRequest_status;
    private double cashRequest_requestedAmount;

    public T_CashRequest() {
    }

    public T_CashRequest(int cashRequest_id, Date cashRequest_date, int cashRequest_employeeId, int cashRequest_responceId, int cashRequest_siteId, String cashRequest_purpose, double cashRequest_amount, int cashRequest_paymentTypeId, String cashRequest_chequeNo, Date cashRequest_chequeDate, String cashRequest_status, double cashRequest_requestedAmount) {
        this.cashRequest_id = cashRequest_id;
        this.cashRequest_date = cashRequest_date;
        this.cashRequest_employeeId = cashRequest_employeeId;
        this.cashRequest_responceId = cashRequest_responceId;
        this.cashRequest_siteId = cashRequest_siteId;
        this.cashRequest_purpose = cashRequest_purpose;
        this.cashRequest_amount = cashRequest_amount;
        this.cashRequest_paymentTypeId = cashRequest_paymentTypeId;
        this.cashRequest_chequeNo = cashRequest_chequeNo;
        this.cashRequest_chequeDate = cashRequest_chequeDate;
        this.cashRequest_status = cashRequest_status;
        this.cashRequest_requestedAmount = cashRequest_requestedAmount;
    }

    /**
     * @return the cashRequest_id
     */
    public int getCashRequest_id() {
        return cashRequest_id;
    }

    /**
     * @param cashRequest_id the cashRequest_id to set
     */
    public void setCashRequest_id(int cashRequest_id) {
        this.cashRequest_id = cashRequest_id;
    }

    /**
     * @return the cashRequest_date
     */
    public Date getCashRequest_date() {
        return cashRequest_date;
    }

    /**
     * @param cashRequest_date the cashRequest_date to set
     */
    public void setCashRequest_date(Date cashRequest_date) {
        this.cashRequest_date = cashRequest_date;
    }

    /**
     * @return the cashRequest_employeeId
     */
    public int getCashRequest_employeeId() {
        return cashRequest_employeeId;
    }

    /**
     * @param cashRequest_employeeId the cashRequest_employeeId to set
     */
    public void setCashRequest_employeeId(int cashRequest_employeeId) {
        this.cashRequest_employeeId = cashRequest_employeeId;
    }

    /**
     * @return the cashRequest_responceId
     */
    public int getCashRequest_responceId() {
        return cashRequest_responceId;
    }

    /**
     * @param cashRequest_responceId the cashRequest_responceId to set
     */
    public void setCashRequest_responceId(int cashRequest_responceId) {
        this.cashRequest_responceId = cashRequest_responceId;
    }

    /**
     * @return the cashRequest_siteId
     */
    public int getCashRequest_siteId() {
        return cashRequest_siteId;
    }

    /**
     * @param cashRequest_siteId the cashRequest_siteId to set
     */
    public void setCashRequest_siteId(int cashRequest_siteId) {
        this.cashRequest_siteId = cashRequest_siteId;
    }

    /**
     * @return the cashRequest_purpose
     */
    public String getCashRequest_purpose() {
        return cashRequest_purpose;
    }

    /**
     * @param cashRequest_purpose the cashRequest_purpose to set
     */
    public void setCashRequest_purpose(String cashRequest_purpose) {
        this.cashRequest_purpose = cashRequest_purpose;
    }

    /**
     * @return the cashRequest_amount
     */
    public double getCashRequest_amount() {
        return cashRequest_amount;
    }

    /**
     * @param cashRequest_amount the cashRequest_amount to set
     */
    public void setCashRequest_amount(double cashRequest_amount) {
        this.cashRequest_amount = cashRequest_amount;
    }

    /**
     * @return the cashRequest_paymentTypeId
     */
    public int getCashRequest_paymentTypeId() {
        return cashRequest_paymentTypeId;
    }

    /**
     * @param cashRequest_paymentTypeId the cashRequest_paymentTypeId to set
     */
    public void setCashRequest_paymentTypeId(int cashRequest_paymentTypeId) {
        this.cashRequest_paymentTypeId = cashRequest_paymentTypeId;
    }

    /**
     * @return the cashRequest_chequeNo
     */
    public String getCashRequest_chequeNo() {
        return cashRequest_chequeNo;
    }

    /**
     * @param cashRequest_chequeNo the cashRequest_chequeNo to set
     */
    public void setCashRequest_chequeNo(String cashRequest_chequeNo) {
        this.cashRequest_chequeNo = cashRequest_chequeNo;
    }

    /**
     * @return the cashRequest_chequeDate
     */
    public Date getCashRequest_chequeDate() {
        return cashRequest_chequeDate;
    }

    /**
     * @param cashRequest_chequeDate the cashRequest_chequeDate to set
     */
    public void setCashRequest_chequeDate(Date cashRequest_chequeDate) {
        this.cashRequest_chequeDate = cashRequest_chequeDate;
    }

    /**
     * @return the cashRequest_status
     */
    public String getCashRequest_status() {
        return cashRequest_status;
    }

    /**
     * @param cashRequest_status the cashRequest_status to set
     */
    public void setCashRequest_status(String cashRequest_status) {
        this.cashRequest_status = cashRequest_status;
    }

    /**
     * @return the cashRequest_requestedAmount
     */
    public double getCashRequest_requestedAmount() {
        return cashRequest_requestedAmount;
    }

    /**
     * @param cashRequest_requestedAmount the cashRequest_requestedAmount to set
     */
    public void setCashRequest_requestedAmount(double cashRequest_requestedAmount) {
        this.cashRequest_requestedAmount = cashRequest_requestedAmount;
    }
    
}
