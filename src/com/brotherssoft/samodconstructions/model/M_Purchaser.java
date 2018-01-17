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
public class M_Purchaser implements Serializable{
    
    private int purchaser_id;
    private String purchaser_name;
    private String purchaser_address;
    private String purchaser_accountNo;
    private int purchaser_bank_id;
    private int purchaser_branch_id;
    private String purchaser_contact1;
    private String purchaser_contact2;
    private String purchaser_repName;
    private String purchaser_repContact;
    private char purchaser_status;

    public M_Purchaser() {
    }

    public M_Purchaser(int purchaser_id, String purchaser_name, String purchaser_address, String purchaser_accountNo, int purchaser_bank_id, int purchaser_branch_id, String purchaser_contact1, String purchaser_contact2, String purchaser_repName, String purchaser_repContact, char purchaser_status) {
        this.purchaser_id = purchaser_id;
        this.purchaser_name = purchaser_name;
        this.purchaser_address = purchaser_address;
        this.purchaser_accountNo = purchaser_accountNo;
        this.purchaser_bank_id = purchaser_bank_id;
        this.purchaser_branch_id = purchaser_branch_id;
        this.purchaser_contact1 = purchaser_contact1;
        this.purchaser_contact2 = purchaser_contact2;
        this.purchaser_repName = purchaser_repName;
        this.purchaser_repContact = purchaser_repContact;
        this.purchaser_status = purchaser_status;
    }

    /**
     * @return the purchaser_id
     */
    public int getPurchaser_id() {
        return purchaser_id;
    }

    /**
     * @param purchaser_id the purchaser_id to set
     */
    public void setPurchaser_id(int purchaser_id) {
        this.purchaser_id = purchaser_id;
    }

    /**
     * @return the purchaser_name
     */
    public String getPurchaser_name() {
        return purchaser_name;
    }

    /**
     * @param purchaser_name the purchaser_name to set
     */
    public void setPurchaser_name(String purchaser_name) {
        this.purchaser_name = purchaser_name;
    }

    /**
     * @return the purchaser_address
     */
    public String getPurchaser_address() {
        return purchaser_address;
    }

    /**
     * @param purchaser_address the purchaser_address to set
     */
    public void setPurchaser_address(String purchaser_address) {
        this.purchaser_address = purchaser_address;
    }

    /**
     * @return the purchaser_accountNo
     */
    public String getPurchaser_accountNo() {
        return purchaser_accountNo;
    }

    /**
     * @param purchaser_accountNo the purchaser_accountNo to set
     */
    public void setPurchaser_accountNo(String purchaser_accountNo) {
        this.purchaser_accountNo = purchaser_accountNo;
    }

    /**
     * @return the purchaser_bank_id
     */
    public int getPurchaser_bank_id() {
        return purchaser_bank_id;
    }

    /**
     * @param purchaser_bank_id the purchaser_bank_id to set
     */
    public void setPurchaser_bank_id(int purchaser_bank_id) {
        this.purchaser_bank_id = purchaser_bank_id;
    }

    /**
     * @return the purchaser_branch_id
     */
    public int getPurchaser_branch_id() {
        return purchaser_branch_id;
    }

    /**
     * @param purchaser_branch_id the purchaser_branch_id to set
     */
    public void setPurchaser_branch_id(int purchaser_branch_id) {
        this.purchaser_branch_id = purchaser_branch_id;
    }

    /**
     * @return the purchaser_contact1
     */
    public String getPurchaser_contact1() {
        return purchaser_contact1;
    }

    /**
     * @param purchaser_contact1 the purchaser_contact1 to set
     */
    public void setPurchaser_contact1(String purchaser_contact1) {
        this.purchaser_contact1 = purchaser_contact1;
    }

    /**
     * @return the purchaser_contact2
     */
    public String getPurchaser_contact2() {
        return purchaser_contact2;
    }

    /**
     * @param purchaser_contact2 the purchaser_contact2 to set
     */
    public void setPurchaser_contact2(String purchaser_contact2) {
        this.purchaser_contact2 = purchaser_contact2;
    }

    /**
     * @return the purchaser_repName
     */
    public String getPurchaser_repName() {
        return purchaser_repName;
    }

    /**
     * @param purchaser_repName the purchaser_repName to set
     */
    public void setPurchaser_repName(String purchaser_repName) {
        this.purchaser_repName = purchaser_repName;
    }

    /**
     * @return the purchaser_repContact
     */
    public String getPurchaser_repContact() {
        return purchaser_repContact;
    }

    /**
     * @param purchaser_repContact the purchaser_repContact to set
     */
    public void setPurchaser_repContact(String purchaser_repContact) {
        this.purchaser_repContact = purchaser_repContact;
    }

    /**
     * @return the purchaser_status
     */
    public char getPurchaser_status() {
        return purchaser_status;
    }

    /**
     * @param purchaser_status the purchaser_status to set
     */
    public void setPurchaser_status(char purchaser_status) {
        this.purchaser_status = purchaser_status;
    }
    
    
    
}
