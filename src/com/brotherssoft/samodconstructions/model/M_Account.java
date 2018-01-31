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
public class M_Account implements Serializable{
    
    private int account_id;
    private int account_bank_id;
    private int account_branch_id;
    private String account_accountNo;
    private int account_accountType_id;
    private String account_status;
    private String account_accountName;

    public M_Account() {
    }

    public M_Account(int account_id, int account_bank_id, int account_branch_id, String account_accountNo, int account_accountType_id, String account_status, String account_accountName) {
        this.account_id = account_id;
        this.account_bank_id = account_bank_id;
        this.account_branch_id = account_branch_id;
        this.account_accountNo = account_accountNo;
        this.account_accountType_id = account_accountType_id;
        this.account_status = account_status;
        this.account_accountName = account_accountName;
    }

    /**
     * @return the account_id
     */
    public int getAccount_id() {
        return account_id;
    }

    /**
     * @param account_id the account_id to set
     */
    public void setAccount_id(int account_id) {
        this.account_id = account_id;
    }

    /**
     * @return the account_bank_id
     */
    public int getAccount_bank_id() {
        return account_bank_id;
    }

    /**
     * @param account_bank_id the account_bank_id to set
     */
    public void setAccount_bank_id(int account_bank_id) {
        this.account_bank_id = account_bank_id;
    }

    /**
     * @return the account_branch_id
     */
    public int getAccount_branch_id() {
        return account_branch_id;
    }

    /**
     * @param account_branch_id the account_branch_id to set
     */
    public void setAccount_branch_id(int account_branch_id) {
        this.account_branch_id = account_branch_id;
    }

    /**
     * @return the account_accountNo
     */
    public String getAccount_accountNo() {
        return account_accountNo;
    }

    /**
     * @param account_accountNo the account_accountNo to set
     */
    public void setAccount_accountNo(String account_accountNo) {
        this.account_accountNo = account_accountNo;
    }

    /**
     * @return the account_accountType_id
     */
    public int getAccount_accountType_id() {
        return account_accountType_id;
    }

    /**
     * @param account_accountType_id the account_accountType_id to set
     */
    public void setAccount_accountType_id(int account_accountType_id) {
        this.account_accountType_id = account_accountType_id;
    }

    /**
     * @return the account_status
     */
    public String getAccount_status() {
        return account_status;
    }

    /**
     * @param account_status the account_status to set
     */
    public void setAccount_status(String account_status) {
        this.account_status = account_status;
    }

    /**
     * @return the account_accountName
     */
    public String getAccount_accountName() {
        return account_accountName;
    }

    /**
     * @param account_accountName the account_accountName to set
     */
    public void setAccount_accountName(String account_accountName) {
        this.account_accountName = account_accountName;
    }

    
}
