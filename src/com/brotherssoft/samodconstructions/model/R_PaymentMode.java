/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.model;

import java.io.Serializable;

/**
 *
 * @author gksde
 */
public class R_PaymentMode implements Serializable{
    
    private int paymentMode_id;
    private String paymentMode_name;
    private String paymentMode_description;
    private String paymentMode_category;
    private String paymentMode_status;
    private String paymentMode_gl_account;

    public R_PaymentMode() {
    }

    public R_PaymentMode(int paymentMode_id, String paymentMode_name, String paymentMode_description, String paymentMode_category, String paymentMode_status, String paymentMode_gl_account) {
        this.paymentMode_id = paymentMode_id;
        this.paymentMode_name = paymentMode_name;
        this.paymentMode_description = paymentMode_description;
        this.paymentMode_category = paymentMode_category;
        this.paymentMode_status = paymentMode_status;
        this.paymentMode_gl_account = paymentMode_gl_account;
    }

    /**
     * @return the paymentMode_id
     */
    public int getPaymentMode_id() {
        return paymentMode_id;
    }

    /**
     * @param paymentMode_id the paymentMode_id to set
     */
    public void setPaymentMode_id(int paymentMode_id) {
        this.paymentMode_id = paymentMode_id;
    }

    /**
     * @return the paymentMode_name
     */
    public String getPaymentMode_name() {
        return paymentMode_name;
    }

    /**
     * @param paymentMode_name the paymentMode_name to set
     */
    public void setPaymentMode_name(String paymentMode_name) {
        this.paymentMode_name = paymentMode_name;
    }

    /**
     * @return the paymentMode_description
     */
    public String getPaymentMode_description() {
        return paymentMode_description;
    }

    /**
     * @param paymentMode_description the paymentMode_description to set
     */
    public void setPaymentMode_description(String paymentMode_description) {
        this.paymentMode_description = paymentMode_description;
    }

    /**
     * @return the paymentMode_category
     */
    public String getPaymentMode_category() {
        return paymentMode_category;
    }

    /**
     * @param paymentMode_category the paymentMode_category to set
     */
    public void setPaymentMode_category(String paymentMode_category) {
        this.paymentMode_category = paymentMode_category;
    }

    /**
     * @return the paymentMode_status
     */
    public String getPaymentMode_status() {
        return paymentMode_status;
    }

    /**
     * @param paymentMode_status the paymentMode_status to set
     */
    public void setPaymentMode_status(String paymentMode_status) {
        this.paymentMode_status = paymentMode_status;
    }

    /**
     * @return the paymentMode_gl_account
     */
    public String getPaymentMode_gl_account() {
        return paymentMode_gl_account;
    }

    /**
     * @param paymentMode_gl_account the paymentMode_gl_account to set
     */
    public void setPaymentMode_gl_account(String paymentMode_gl_account) {
        this.paymentMode_gl_account = paymentMode_gl_account;
    }
    
    
}
