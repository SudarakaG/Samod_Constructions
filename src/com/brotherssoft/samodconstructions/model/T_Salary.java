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
public class T_Salary implements Serializable{
    
    private Date salary_fromDate;
    private Date salary_toDate;
    private int salary_employeeId;
    private double salary_basic;
    private double salary_daily;
    private double salary_otherAllowance1;
    private double salary_otherAllowance2;
    private double salary_ot;
    private double salary_advace;
    private double salary_addition;
    private double salary_deduction;
    private double salary_gross;
    private double salary_totalDeduction;
    private double salary_net;
    private String salary_status;
    private int salary_enteredUser;
    private Date salary_enteredDate;
    private int salary_approvedUser;
    private Date salary_approvedDate;
    private double salary_otherAllowance3;
    private double salary_otherAllowance4;
    private int salary_batchId;

    public T_Salary() {
    }

    public T_Salary(Date salary_fromDate, Date salary_toDate, int salary_employeeId, double salary_basic, double salary_daily, double salary_otherAllowance1, double salary_otherAllowance2, double salary_ot, double salary_advace, double salary_addition, double salary_deduction, double salary_gross, double salary_totalDeduction, double salary_net, String salary_status, int salary_enteredUser, Date salary_enteredDate, int salary_approvedUser, Date salary_approvedDate, double salary_otherAllowance3, double salary_otherAllowance4, int salary_batchId) {
        this.salary_fromDate = salary_fromDate;
        this.salary_toDate = salary_toDate;
        this.salary_employeeId = salary_employeeId;
        this.salary_basic = salary_basic;
        this.salary_daily = salary_daily;
        this.salary_otherAllowance1 = salary_otherAllowance1;
        this.salary_otherAllowance2 = salary_otherAllowance2;
        this.salary_ot = salary_ot;
        this.salary_advace = salary_advace;
        this.salary_addition = salary_addition;
        this.salary_deduction = salary_deduction;
        this.salary_gross = salary_gross;
        this.salary_totalDeduction = salary_totalDeduction;
        this.salary_net = salary_net;
        this.salary_status = salary_status;
        this.salary_enteredUser = salary_enteredUser;
        this.salary_enteredDate = salary_enteredDate;
        this.salary_approvedUser = salary_approvedUser;
        this.salary_approvedDate = salary_approvedDate;
        this.salary_otherAllowance3 = salary_otherAllowance3;
        this.salary_otherAllowance4 = salary_otherAllowance4;
        this.salary_batchId = salary_batchId;
    }

    /**
     * @return the salary_fromDate
     */
    public Date getSalary_fromDate() {
        return salary_fromDate;
    }

    /**
     * @param salary_fromDate the salary_fromDate to set
     */
    public void setSalary_fromDate(Date salary_fromDate) {
        this.salary_fromDate = salary_fromDate;
    }

    /**
     * @return the salary_toDate
     */
    public Date getSalary_toDate() {
        return salary_toDate;
    }

    /**
     * @param salary_toDate the salary_toDate to set
     */
    public void setSalary_toDate(Date salary_toDate) {
        this.salary_toDate = salary_toDate;
    }

    /**
     * @return the salary_employeeId
     */
    public int getSalary_employeeId() {
        return salary_employeeId;
    }

    /**
     * @param salary_employeeId the salary_employeeId to set
     */
    public void setSalary_employeeId(int salary_employeeId) {
        this.salary_employeeId = salary_employeeId;
    }

    /**
     * @return the salary_basic
     */
    public double getSalary_basic() {
        return salary_basic;
    }

    /**
     * @param salary_basic the salary_basic to set
     */
    public void setSalary_basic(double salary_basic) {
        this.salary_basic = salary_basic;
    }

    /**
     * @return the salary_daily
     */
    public double getSalary_daily() {
        return salary_daily;
    }

    /**
     * @param salary_daily the salary_daily to set
     */
    public void setSalary_daily(double salary_daily) {
        this.salary_daily = salary_daily;
    }

    /**
     * @return the salary_otherAllowance1
     */
    public double getSalary_otherAllowance1() {
        return salary_otherAllowance1;
    }

    /**
     * @param salary_otherAllowance1 the salary_otherAllowance1 to set
     */
    public void setSalary_otherAllowance1(double salary_otherAllowance1) {
        this.salary_otherAllowance1 = salary_otherAllowance1;
    }

    /**
     * @return the salary_otherAllowance2
     */
    public double getSalary_otherAllowance2() {
        return salary_otherAllowance2;
    }

    /**
     * @param salary_otherAllowance2 the salary_otherAllowance2 to set
     */
    public void setSalary_otherAllowance2(double salary_otherAllowance2) {
        this.salary_otherAllowance2 = salary_otherAllowance2;
    }

    /**
     * @return the salary_ot
     */
    public double getSalary_ot() {
        return salary_ot;
    }

    /**
     * @param salary_ot the salary_ot to set
     */
    public void setSalary_ot(double salary_ot) {
        this.salary_ot = salary_ot;
    }

    /**
     * @return the salary_advace
     */
    public double getSalary_advace() {
        return salary_advace;
    }

    /**
     * @param salary_advace the salary_advace to set
     */
    public void setSalary_advace(double salary_advace) {
        this.salary_advace = salary_advace;
    }

    /**
     * @return the salary_addition
     */
    public double getSalary_addition() {
        return salary_addition;
    }

    /**
     * @param salary_addition the salary_addition to set
     */
    public void setSalary_addition(double salary_addition) {
        this.salary_addition = salary_addition;
    }

    /**
     * @return the salary_deduction
     */
    public double getSalary_deduction() {
        return salary_deduction;
    }

    /**
     * @param salary_deduction the salary_deduction to set
     */
    public void setSalary_deduction(double salary_deduction) {
        this.salary_deduction = salary_deduction;
    }

    /**
     * @return the salary_gross
     */
    public double getSalary_gross() {
        return salary_gross;
    }

    /**
     * @param salary_gross the salary_gross to set
     */
    public void setSalary_gross(double salary_gross) {
        this.salary_gross = salary_gross;
    }

    /**
     * @return the salary_totalDeduction
     */
    public double getSalary_totalDeduction() {
        return salary_totalDeduction;
    }

    /**
     * @param salary_totalDeduction the salary_totalDeduction to set
     */
    public void setSalary_totalDeduction(double salary_totalDeduction) {
        this.salary_totalDeduction = salary_totalDeduction;
    }

    /**
     * @return the salary_net
     */
    public double getSalary_net() {
        return salary_net;
    }

    /**
     * @param salary_net the salary_net to set
     */
    public void setSalary_net(double salary_net) {
        this.salary_net = salary_net;
    }

    /**
     * @return the salary_status
     */
    public String getSalary_status() {
        return salary_status;
    }

    /**
     * @param salary_status the salary_status to set
     */
    public void setSalary_status(String salary_status) {
        this.salary_status = salary_status;
    }

    /**
     * @return the salary_enteredUser
     */
    public int getSalary_enteredUser() {
        return salary_enteredUser;
    }

    /**
     * @param salary_enteredUser the salary_enteredUser to set
     */
    public void setSalary_enteredUser(int salary_enteredUser) {
        this.salary_enteredUser = salary_enteredUser;
    }

    /**
     * @return the salary_enteredDate
     */
    public Date getSalary_enteredDate() {
        return salary_enteredDate;
    }

    /**
     * @param salary_enteredDate the salary_enteredDate to set
     */
    public void setSalary_enteredDate(Date salary_enteredDate) {
        this.salary_enteredDate = salary_enteredDate;
    }

    /**
     * @return the salary_approvedUser
     */
    public int getSalary_approvedUser() {
        return salary_approvedUser;
    }

    /**
     * @param salary_approvedUser the salary_approvedUser to set
     */
    public void setSalary_approvedUser(int salary_approvedUser) {
        this.salary_approvedUser = salary_approvedUser;
    }

    /**
     * @return the salary_approvedDate
     */
    public Date getSalary_approvedDate() {
        return salary_approvedDate;
    }

    /**
     * @param salary_approvedDate the salary_approvedDate to set
     */
    public void setSalary_approvedDate(Date salary_approvedDate) {
        this.salary_approvedDate = salary_approvedDate;
    }

    /**
     * @return the salary_otherAllowance3
     */
    public double getSalary_otherAllowance3() {
        return salary_otherAllowance3;
    }

    /**
     * @param salary_otherAllowance3 the salary_otherAllowance3 to set
     */
    public void setSalary_otherAllowance3(double salary_otherAllowance3) {
        this.salary_otherAllowance3 = salary_otherAllowance3;
    }

    /**
     * @return the salary_otherAllowance4
     */
    public double getSalary_otherAllowance4() {
        return salary_otherAllowance4;
    }

    /**
     * @param salary_otherAllowance4 the salary_otherAllowance4 to set
     */
    public void setSalary_otherAllowance4(double salary_otherAllowance4) {
        this.salary_otherAllowance4 = salary_otherAllowance4;
    }

    /**
     * @return the salary_batchId
     */
    public int getSalary_batchId() {
        return salary_batchId;
    }

    /**
     * @param salary_batchId the salary_batchId to set
     */
    public void setSalary_batchId(int salary_batchId) {
        this.salary_batchId = salary_batchId;
    }
    
}
