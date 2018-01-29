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
public class R_PaymentSlip implements Serializable{
    
    private int paymentSlip_employee_id;
    private String paymentSlip_employee_Name;
    private Date paymentSlip_fromDate;
    private Date paymentSlip_toDate;
    private double paymentSlip_basic;
    private double paymentSlip_daily;
    private double paymentSlip_otherAllowance;
    private double paymentSlip_otherAllowance2;
    private double paymentSlip_ot;
    private double paymentSlip_advance;
    private double paymentSlip_addition;
    private double paymentSlip_deduction;
    private double paymentSlip_gross;
    private double paymentSlip_totalDeduvtion;
    private double paymentSlip_net;
    private String paymentSlip_designation;
    private double paymentSlip_otherAllowance3;
    private double paymentSlip_otherAllowance4;
    private double paymentSlip_epf8;
    private double paymentSlip_epf12;
    private double paymentSlip_etf3;

    public R_PaymentSlip() {
    }

    public R_PaymentSlip(int paymentSlip_employee_id, String paymentSlip_employee_Name, Date paymentSlip_fromDate, Date paymentSlip_toDate, double paymentSlip_basic, double paymentSlip_daily, double paymentSlip_otherAllowance, double paymentSlip_otherAllowance2, double paymentSlip_ot, double paymentSlip_advance, double paymentSlip_addition, double paymentSlip_deduction, double paymentSlip_gross, double paymentSlip_totalDeduvtion, double paymentSlip_net, String paymentSlip_designation, double paymentSlip_otherAllowance3, double paymentSlip_otherAllowance4, double paymentSlip_epf8, double paymentSlip_epf12, double paymentSlip_etf3) {
        this.paymentSlip_employee_id = paymentSlip_employee_id;
        this.paymentSlip_employee_Name = paymentSlip_employee_Name;
        this.paymentSlip_fromDate = paymentSlip_fromDate;
        this.paymentSlip_toDate = paymentSlip_toDate;
        this.paymentSlip_basic = paymentSlip_basic;
        this.paymentSlip_daily = paymentSlip_daily;
        this.paymentSlip_otherAllowance = paymentSlip_otherAllowance;
        this.paymentSlip_otherAllowance2 = paymentSlip_otherAllowance2;
        this.paymentSlip_ot = paymentSlip_ot;
        this.paymentSlip_advance = paymentSlip_advance;
        this.paymentSlip_addition = paymentSlip_addition;
        this.paymentSlip_deduction = paymentSlip_deduction;
        this.paymentSlip_gross = paymentSlip_gross;
        this.paymentSlip_totalDeduvtion = paymentSlip_totalDeduvtion;
        this.paymentSlip_net = paymentSlip_net;
        this.paymentSlip_designation = paymentSlip_designation;
        this.paymentSlip_otherAllowance3 = paymentSlip_otherAllowance3;
        this.paymentSlip_otherAllowance4 = paymentSlip_otherAllowance4;
        this.paymentSlip_epf8 = paymentSlip_epf8;
        this.paymentSlip_epf12 = paymentSlip_epf12;
        this.paymentSlip_etf3 = paymentSlip_etf3;
    }

    /**
     * @return the paymentSlip_employee_id
     */
    public int getPaymentSlip_employee_id() {
        return paymentSlip_employee_id;
    }

    /**
     * @param paymentSlip_employee_id the paymentSlip_employee_id to set
     */
    public void setPaymentSlip_employee_id(int paymentSlip_employee_id) {
        this.paymentSlip_employee_id = paymentSlip_employee_id;
    }

    /**
     * @return the paymentSlip_employee_Name
     */
    public String getPaymentSlip_employee_Name() {
        return paymentSlip_employee_Name;
    }

    /**
     * @param paymentSlip_employee_Name the paymentSlip_employee_Name to set
     */
    public void setPaymentSlip_employee_Name(String paymentSlip_employee_Name) {
        this.paymentSlip_employee_Name = paymentSlip_employee_Name;
    }

    /**
     * @return the paymentSlip_fromDate
     */
    public Date getPaymentSlip_fromDate() {
        return paymentSlip_fromDate;
    }

    /**
     * @param paymentSlip_fromDate the paymentSlip_fromDate to set
     */
    public void setPaymentSlip_fromDate(Date paymentSlip_fromDate) {
        this.paymentSlip_fromDate = paymentSlip_fromDate;
    }

    /**
     * @return the paymentSlip_toDate
     */
    public Date getPaymentSlip_toDate() {
        return paymentSlip_toDate;
    }

    /**
     * @param paymentSlip_toDate the paymentSlip_toDate to set
     */
    public void setPaymentSlip_toDate(Date paymentSlip_toDate) {
        this.paymentSlip_toDate = paymentSlip_toDate;
    }

    /**
     * @return the paymentSlip_basic
     */
    public double getPaymentSlip_basic() {
        return paymentSlip_basic;
    }

    /**
     * @param paymentSlip_basic the paymentSlip_basic to set
     */
    public void setPaymentSlip_basic(double paymentSlip_basic) {
        this.paymentSlip_basic = paymentSlip_basic;
    }

    /**
     * @return the paymentSlip_daily
     */
    public double getPaymentSlip_daily() {
        return paymentSlip_daily;
    }

    /**
     * @param paymentSlip_daily the paymentSlip_daily to set
     */
    public void setPaymentSlip_daily(double paymentSlip_daily) {
        this.paymentSlip_daily = paymentSlip_daily;
    }

    /**
     * @return the paymentSlip_otherAllowance
     */
    public double getPaymentSlip_otherAllowance() {
        return paymentSlip_otherAllowance;
    }

    /**
     * @param paymentSlip_otherAllowance the paymentSlip_otherAllowance to set
     */
    public void setPaymentSlip_otherAllowance(double paymentSlip_otherAllowance) {
        this.paymentSlip_otherAllowance = paymentSlip_otherAllowance;
    }

    /**
     * @return the paymentSlip_otherAllowance2
     */
    public double getPaymentSlip_otherAllowance2() {
        return paymentSlip_otherAllowance2;
    }

    /**
     * @param paymentSlip_otherAllowance2 the paymentSlip_otherAllowance2 to set
     */
    public void setPaymentSlip_otherAllowance2(double paymentSlip_otherAllowance2) {
        this.paymentSlip_otherAllowance2 = paymentSlip_otherAllowance2;
    }

    /**
     * @return the paymentSlip_ot
     */
    public double getPaymentSlip_ot() {
        return paymentSlip_ot;
    }

    /**
     * @param paymentSlip_ot the paymentSlip_ot to set
     */
    public void setPaymentSlip_ot(double paymentSlip_ot) {
        this.paymentSlip_ot = paymentSlip_ot;
    }

    /**
     * @return the paymentSlip_advance
     */
    public double getPaymentSlip_advance() {
        return paymentSlip_advance;
    }

    /**
     * @param paymentSlip_advance the paymentSlip_advance to set
     */
    public void setPaymentSlip_advance(double paymentSlip_advance) {
        this.paymentSlip_advance = paymentSlip_advance;
    }

    /**
     * @return the paymentSlip_addition
     */
    public double getPaymentSlip_addition() {
        return paymentSlip_addition;
    }

    /**
     * @param paymentSlip_addition the paymentSlip_addition to set
     */
    public void setPaymentSlip_addition(double paymentSlip_addition) {
        this.paymentSlip_addition = paymentSlip_addition;
    }

    /**
     * @return the paymentSlip_deduction
     */
    public double getPaymentSlip_deduction() {
        return paymentSlip_deduction;
    }

    /**
     * @param paymentSlip_deduction the paymentSlip_deduction to set
     */
    public void setPaymentSlip_deduction(double paymentSlip_deduction) {
        this.paymentSlip_deduction = paymentSlip_deduction;
    }

    /**
     * @return the paymentSlip_gross
     */
    public double getPaymentSlip_gross() {
        return paymentSlip_gross;
    }

    /**
     * @param paymentSlip_gross the paymentSlip_gross to set
     */
    public void setPaymentSlip_gross(double paymentSlip_gross) {
        this.paymentSlip_gross = paymentSlip_gross;
    }

    /**
     * @return the paymentSlip_totalDeduvtion
     */
    public double getPaymentSlip_totalDeduvtion() {
        return paymentSlip_totalDeduvtion;
    }

    /**
     * @param paymentSlip_totalDeduvtion the paymentSlip_totalDeduvtion to set
     */
    public void setPaymentSlip_totalDeduvtion(double paymentSlip_totalDeduvtion) {
        this.paymentSlip_totalDeduvtion = paymentSlip_totalDeduvtion;
    }

    /**
     * @return the paymentSlip_net
     */
    public double getPaymentSlip_net() {
        return paymentSlip_net;
    }

    /**
     * @param paymentSlip_net the paymentSlip_net to set
     */
    public void setPaymentSlip_net(double paymentSlip_net) {
        this.paymentSlip_net = paymentSlip_net;
    }

    /**
     * @return the paymentSlip_designation
     */
    public String getPaymentSlip_designation() {
        return paymentSlip_designation;
    }

    /**
     * @param paymentSlip_designation the paymentSlip_designation to set
     */
    public void setPaymentSlip_designation(String paymentSlip_designation) {
        this.paymentSlip_designation = paymentSlip_designation;
    }

    /**
     * @return the paymentSlip_otherAllowance3
     */
    public double getPaymentSlip_otherAllowance3() {
        return paymentSlip_otherAllowance3;
    }

    /**
     * @param paymentSlip_otherAllowance3 the paymentSlip_otherAllowance3 to set
     */
    public void setPaymentSlip_otherAllowance3(double paymentSlip_otherAllowance3) {
        this.paymentSlip_otherAllowance3 = paymentSlip_otherAllowance3;
    }

    /**
     * @return the paymentSlip_otherAllowance4
     */
    public double getPaymentSlip_otherAllowance4() {
        return paymentSlip_otherAllowance4;
    }

    /**
     * @param paymentSlip_otherAllowance4 the paymentSlip_otherAllowance4 to set
     */
    public void setPaymentSlip_otherAllowance4(double paymentSlip_otherAllowance4) {
        this.paymentSlip_otherAllowance4 = paymentSlip_otherAllowance4;
    }

    /**
     * @return the paymentSlip_epf8
     */
    public double getPaymentSlip_epf8() {
        return paymentSlip_epf8;
    }

    /**
     * @param paymentSlip_epf8 the paymentSlip_epf8 to set
     */
    public void setPaymentSlip_epf8(double paymentSlip_epf8) {
        this.paymentSlip_epf8 = paymentSlip_epf8;
    }

    /**
     * @return the paymentSlip_epf12
     */
    public double getPaymentSlip_epf12() {
        return paymentSlip_epf12;
    }

    /**
     * @param paymentSlip_epf12 the paymentSlip_epf12 to set
     */
    public void setPaymentSlip_epf12(double paymentSlip_epf12) {
        this.paymentSlip_epf12 = paymentSlip_epf12;
    }

    /**
     * @return the paymentSlip_etf3
     */
    public double getPaymentSlip_etf3() {
        return paymentSlip_etf3;
    }

    /**
     * @param paymentSlip_etf3 the paymentSlip_etf3 to set
     */
    public void setPaymentSlip_etf3(double paymentSlip_etf3) {
        this.paymentSlip_etf3 = paymentSlip_etf3;
    }
    
    
}
