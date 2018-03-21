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
public class T_Attendance implements Serializable{
    
    private int attendance_id;
    private Date attendance_date;
    private int attendance_siteId;
    private int attendance_employeeId;
    private String attendance_in;
    private String attendance_out;
    private double attendance_ot;
    private double attendance_advance;
    private int attendance_enteredBy;
    private int attendance_approvedBy;
    private int attendance_workId;
    private String attendance_comment;
    private String attendance_status;
    private Date attendance_enteredDate;
    private Date attendance_approvedDate;
    private double attendance_days;
    private double attendance_dailyRate;
    private double attendance_otRate;
    private String attendance_processed;
    private int attendance_salaryBatch;
    private int employeeCategory;

    public T_Attendance() {
    }

    public T_Attendance(int attendance_id, Date attendance_date, int attendance_siteId, int attendance_employeeId, String attendance_in, String attendance_out, double attendance_ot, double attendance_advance, int attendance_enteredBy, int attendance_approvedBy, int attendance_workId, String attendance_comment, String attendance_status, Date attendance_enteredDate, Date attendance_approvedDate, double attendance_days, double attendance_dailyRate, double attendance_otRate, String attendance_processed, int attendance_salaryBatch, int employeeCategory) {
        this.attendance_id = attendance_id;
        this.attendance_date = attendance_date;
        this.attendance_siteId = attendance_siteId;
        this.attendance_employeeId = attendance_employeeId;
        this.attendance_in = attendance_in;
        this.attendance_out = attendance_out;
        this.attendance_ot = attendance_ot;
        this.attendance_advance = attendance_advance;
        this.attendance_enteredBy = attendance_enteredBy;
        this.attendance_approvedBy = attendance_approvedBy;
        this.attendance_workId = attendance_workId;
        this.attendance_comment = attendance_comment;
        this.attendance_status = attendance_status;
        this.attendance_enteredDate = attendance_enteredDate;
        this.attendance_approvedDate = attendance_approvedDate;
        this.attendance_days = attendance_days;
        this.attendance_dailyRate = attendance_dailyRate;
        this.attendance_otRate = attendance_otRate;
        this.attendance_processed = attendance_processed;
        this.attendance_salaryBatch = attendance_salaryBatch;
        this.employeeCategory = employeeCategory;
    }

    /**
     * @return the attendance_id
     */
    public int getAttendance_id() {
        return attendance_id;
    }

    /**
     * @param attendance_id the attendance_id to set
     */
    public void setAttendance_id(int attendance_id) {
        this.attendance_id = attendance_id;
    }

    /**
     * @return the attendance_date
     */
    public Date getAttendance_date() {
        return attendance_date;
    }

    /**
     * @param attendance_date the attendance_date to set
     */
    public void setAttendance_date(Date attendance_date) {
        this.attendance_date = attendance_date;
    }

    /**
     * @return the attendance_siteId
     */
    public int getAttendance_siteId() {
        return attendance_siteId;
    }

    /**
     * @param attendance_siteId the attendance_siteId to set
     */
    public void setAttendance_siteId(int attendance_siteId) {
        this.attendance_siteId = attendance_siteId;
    }

    /**
     * @return the attendance_employeeId
     */
    public int getAttendance_employeeId() {
        return attendance_employeeId;
    }

    /**
     * @param attendance_employeeId the attendance_employeeId to set
     */
    public void setAttendance_employeeId(int attendance_employeeId) {
        this.attendance_employeeId = attendance_employeeId;
    }

    /**
     * @return the attendance_in
     */
    public String getAttendance_in() {
        return attendance_in;
    }

    /**
     * @param attendance_in the attendance_in to set
     */
    public void setAttendance_in(String attendance_in) {
        this.attendance_in = attendance_in;
    }

    /**
     * @return the attendance_out
     */
    public String getAttendance_out() {
        return attendance_out;
    }

    /**
     * @param attendance_out the attendance_out to set
     */
    public void setAttendance_out(String attendance_out) {
        this.attendance_out = attendance_out;
    }

    /**
     * @return the attendance_ot
     */
    public double getAttendance_ot() {
        return attendance_ot;
    }

    /**
     * @param attendance_ot the attendance_ot to set
     */
    public void setAttendance_ot(double attendance_ot) {
        this.attendance_ot = attendance_ot;
    }

    /**
     * @return the attendance_advance
     */
    public double getAttendance_advance() {
        return attendance_advance;
    }

    /**
     * @param attendance_advance the attendance_advance to set
     */
    public void setAttendance_advance(double attendance_advance) {
        this.attendance_advance = attendance_advance;
    }

    /**
     * @return the attendance_enteredBy
     */
    public int getAttendance_enteredBy() {
        return attendance_enteredBy;
    }

    /**
     * @param attendance_enteredBy the attendance_enteredBy to set
     */
    public void setAttendance_enteredBy(int attendance_enteredBy) {
        this.attendance_enteredBy = attendance_enteredBy;
    }

    /**
     * @return the attendance_approvedBy
     */
    public int getAttendance_approvedBy() {
        return attendance_approvedBy;
    }

    /**
     * @param attendance_approvedBy the attendance_approvedBy to set
     */
    public void setAttendance_approvedBy(int attendance_approvedBy) {
        this.attendance_approvedBy = attendance_approvedBy;
    }

    /**
     * @return the attendance_workId
     */
    public int getAttendance_workId() {
        return attendance_workId;
    }

    /**
     * @param attendance_workId the attendance_workId to set
     */
    public void setAttendance_workId(int attendance_workId) {
        this.attendance_workId = attendance_workId;
    }

    /**
     * @return the attendance_comment
     */
    public String getAttendance_comment() {
        return attendance_comment;
    }

    /**
     * @param attendance_comment the attendance_comment to set
     */
    public void setAttendance_comment(String attendance_comment) {
        this.attendance_comment = attendance_comment;
    }

    /**
     * @return the attendance_status
     */
    public String getAttendance_status() {
        return attendance_status;
    }

    /**
     * @param attendance_status the attendance_status to set
     */
    public void setAttendance_status(String attendance_status) {
        this.attendance_status = attendance_status;
    }

    /**
     * @return the attendance_enteredDate
     */
    public Date getAttendance_enteredDate() {
        return attendance_enteredDate;
    }

    /**
     * @param attendance_enteredDate the attendance_enteredDate to set
     */
    public void setAttendance_enteredDate(Date attendance_enteredDate) {
        this.attendance_enteredDate = attendance_enteredDate;
    }

    /**
     * @return the attendance_approvedDate
     */
    public Date getAttendance_approvedDate() {
        return attendance_approvedDate;
    }

    /**
     * @param attendance_approvedDate the attendance_approvedDate to set
     */
    public void setAttendance_approvedDate(Date attendance_approvedDate) {
        this.attendance_approvedDate = attendance_approvedDate;
    }

    /**
     * @return the attendance_days
     */
    public double getAttendance_days() {
        return attendance_days;
    }

    /**
     * @param attendance_days the attendance_days to set
     */
    public void setAttendance_days(double attendance_days) {
        this.attendance_days = attendance_days;
    }

    /**
     * @return the attendance_dailyRate
     */
    public double getAttendance_dailyRate() {
        return attendance_dailyRate;
    }

    /**
     * @param attendance_dailyRate the attendance_dailyRate to set
     */
    public void setAttendance_dailyRate(double attendance_dailyRate) {
        this.attendance_dailyRate = attendance_dailyRate;
    }

    /**
     * @return the attendance_otRate
     */
    public double getAttendance_otRate() {
        return attendance_otRate;
    }

    /**
     * @param attendance_otRate the attendance_otRate to set
     */
    public void setAttendance_otRate(double attendance_otRate) {
        this.attendance_otRate = attendance_otRate;
    }

    /**
     * @return the attendance_processed
     */
    public String getAttendance_processed() {
        return attendance_processed;
    }

    /**
     * @param attendance_processed the attendance_processed to set
     */
    public void setAttendance_processed(String attendance_processed) {
        this.attendance_processed = attendance_processed;
    }

    /**
     * @return the attendance_salaryBatch
     */
    public int getAttendance_salaryBatch() {
        return attendance_salaryBatch;
    }

    /**
     * @param attendance_salaryBatch the attendance_salaryBatch to set
     */
    public void setAttendance_salaryBatch(int attendance_salaryBatch) {
        this.attendance_salaryBatch = attendance_salaryBatch;
    }

    /**
     * @return the employeeCategory
     */
    public int getEmployeeCategory() {
        return employeeCategory;
    }

    /**
     * @param employeeCategory the employeeCategory to set
     */
    public void setEmployeeCategory(int employeeCategory) {
        this.employeeCategory = employeeCategory;
    }

    
}
