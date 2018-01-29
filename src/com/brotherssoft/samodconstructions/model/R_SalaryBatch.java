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
public class R_SalaryBatch implements Serializable{
    
    private int batch_id;
    private Date batch_fromDate;
    private Date batch_toDate;
    private Time batch_timeStamp;

    public R_SalaryBatch() {
    }

    public R_SalaryBatch(int batch_id, Date batch_fromDate, Date batch_toDate, Time batch_timeStamp) {
        this.batch_id = batch_id;
        this.batch_fromDate = batch_fromDate;
        this.batch_toDate = batch_toDate;
        this.batch_timeStamp = batch_timeStamp;
    }

    /**
     * @return the batch_id
     */
    public int getBatch_id() {
        return batch_id;
    }

    /**
     * @param batch_id the batch_id to set
     */
    public void setBatch_id(int batch_id) {
        this.batch_id = batch_id;
    }

    /**
     * @return the batch_fromDate
     */
    public Date getBatch_fromDate() {
        return batch_fromDate;
    }

    /**
     * @param batch_fromDate the batch_fromDate to set
     */
    public void setBatch_fromDate(Date batch_fromDate) {
        this.batch_fromDate = batch_fromDate;
    }

    /**
     * @return the batch_toDate
     */
    public Date getBatch_toDate() {
        return batch_toDate;
    }

    /**
     * @param batch_toDate the batch_toDate to set
     */
    public void setBatch_toDate(Date batch_toDate) {
        this.batch_toDate = batch_toDate;
    }

    /**
     * @return the batch_timeStamp
     */
    public Time getBatch_timeStamp() {
        return batch_timeStamp;
    }

    /**
     * @param batch_timeStamp the batch_timeStamp to set
     */
    public void setBatch_timeStamp(Time batch_timeStamp) {
        this.batch_timeStamp = batch_timeStamp;
    }
    
    
    
}
