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
public class T_Purchase implements Serializable{
    
    private int purchase_id;
    private Date purchase_date;
    private String purchase_invoiceNo;
    private int purchase_purchaserId;
    private String purchase_location;
    private double purchase_amount;
    private int purchase_paymentTypeId;
    private String purchase_chequeNo;
    private Date purchase_chequeDate;

    public T_Purchase() {
    }

    public T_Purchase(int purchase_id, Date purchase_date, String purchase_invoiceNo, int purchase_purchaserId, String purchase_location, double purchase_amount, int purchase_paymentTypeId, String purchase_chequeNo, Date purchase_chequeDate) {
        this.purchase_id = purchase_id;
        this.purchase_date = purchase_date;
        this.purchase_invoiceNo = purchase_invoiceNo;
        this.purchase_purchaserId = purchase_purchaserId;
        this.purchase_location = purchase_location;
        this.purchase_amount = purchase_amount;
        this.purchase_paymentTypeId = purchase_paymentTypeId;
        this.purchase_chequeNo = purchase_chequeNo;
        this.purchase_chequeDate = purchase_chequeDate;
    }

    /**
     * @return the purchase_id
     */
    public int getPurchase_id() {
        return purchase_id;
    }

    /**
     * @param purchase_id the purchase_id to set
     */
    public void setPurchase_id(int purchase_id) {
        this.purchase_id = purchase_id;
    }

    /**
     * @return the purchase_date
     */
    public Date getPurchase_date() {
        return purchase_date;
    }

    /**
     * @param purchase_date the purchase_date to set
     */
    public void setPurchase_date(Date purchase_date) {
        this.purchase_date = purchase_date;
    }

    /**
     * @return the purchase_invoiceNo
     */
    public String getPurchase_invoiceNo() {
        return purchase_invoiceNo;
    }

    /**
     * @param purchase_invoiceNo the purchase_invoiceNo to set
     */
    public void setPurchase_invoiceNo(String purchase_invoiceNo) {
        this.purchase_invoiceNo = purchase_invoiceNo;
    }

    /**
     * @return the purchase_purchaserId
     */
    public int getPurchase_purchaserId() {
        return purchase_purchaserId;
    }

    /**
     * @param purchase_purchaserId the purchase_purchaserId to set
     */
    public void setPurchase_purchaserId(int purchase_purchaserId) {
        this.purchase_purchaserId = purchase_purchaserId;
    }

    /**
     * @return the purchase_location
     */
    public String getPurchase_location() {
        return purchase_location;
    }

    /**
     * @param purchase_location the purchase_location to set
     */
    public void setPurchase_location(String purchase_location) {
        this.purchase_location = purchase_location;
    }

    /**
     * @return the purchase_amount
     */
    public double getPurchase_amount() {
        return purchase_amount;
    }

    /**
     * @param purchase_amount the purchase_amount to set
     */
    public void setPurchase_amount(double purchase_amount) {
        this.purchase_amount = purchase_amount;
    }

    /**
     * @return the purchase_paymentTypeId
     */
    public int getPurchase_paymentTypeId() {
        return purchase_paymentTypeId;
    }

    /**
     * @param purchase_paymentTypeId the purchase_paymentTypeId to set
     */
    public void setPurchase_paymentTypeId(int purchase_paymentTypeId) {
        this.purchase_paymentTypeId = purchase_paymentTypeId;
    }

    /**
     * @return the purchase_chequeNo
     */
    public String getPurchase_chequeNo() {
        return purchase_chequeNo;
    }

    /**
     * @param purchase_chequeNo the purchase_chequeNo to set
     */
    public void setPurchase_chequeNo(String purchase_chequeNo) {
        this.purchase_chequeNo = purchase_chequeNo;
    }

    /**
     * @return the purchase_chequeDate
     */
    public Date getPurchase_chequeDate() {
        return purchase_chequeDate;
    }

    /**
     * @param purchase_chequeDate the purchase_chequeDate to set
     */
    public void setPurchase_chequeDate(Date purchase_chequeDate) {
        this.purchase_chequeDate = purchase_chequeDate;
    }
    
}
