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
public class M_Employee implements Serializable{
    
    private int emp_id;
    private char emp_title;
    private String emp_initials;
    private String emp_firstName;
    private String emp_middleName;
    private String emp_surName;
    private String emp_address1;
    private String emp_address2;
    private String emp_address3;
    private String emp_address4;
    private String emp_NIC;
    private Date emp_DOB;
    private String emp_contact1;
    private String emp_contact2;
    private String emp_contatct3;
    private String emp_accountNo;
    private int emp_bank_id;
    private int emp_branch_id;
    private int emp_designation_id;
    private int emp_salaryType_id;
    private double emp_salary;
    private double emp_otherAllowance1;
    private double emp_otherAllowance2;
    private int emp_site_id;
    private char emp_status;
    private char emp_epf_status;
    private int emp_jobType_id;
    private Date emp_joinDate;
    private int emp_subContractor_id;
    private double emp_otherAllowance3;
    private double emp_otherAllowance4;

    public M_Employee() {
    }

    public M_Employee(int emp_id, char emp_title, String emp_initials, String emp_firstName, String emp_middleName, String emp_surName, String emp_address1, String emp_address2, String emp_address3, String emp_address4, String emp_NIC, Date emp_DOB, String emp_contact1, String emp_contact2, String emp_contatct3, String emp_accountNo, int emp_bank_id, int emp_branch_id, int emp_designation_id, int emp_salaryType_id, double emp_salary, double emp_otherAllowance1, double emp_otherAllowance2, int emp_site_id, char emp_status, char emp_epf_status, int emp_jobType_id, Date emp_joinDate, int emp_subContractor_id, double emp_otherAllowance3, double emp_otherAllowance4) {
        this.emp_id = emp_id;
        this.emp_title = emp_title;
        this.emp_initials = emp_initials;
        this.emp_firstName = emp_firstName;
        this.emp_middleName = emp_middleName;
        this.emp_surName = emp_surName;
        this.emp_address1 = emp_address1;
        this.emp_address2 = emp_address2;
        this.emp_address3 = emp_address3;
        this.emp_address4 = emp_address4;
        this.emp_NIC = emp_NIC;
        this.emp_DOB = emp_DOB;
        this.emp_contact1 = emp_contact1;
        this.emp_contact2 = emp_contact2;
        this.emp_contatct3 = emp_contatct3;
        this.emp_accountNo = emp_accountNo;
        this.emp_bank_id = emp_bank_id;
        this.emp_branch_id = emp_branch_id;
        this.emp_designation_id = emp_designation_id;
        this.emp_salaryType_id = emp_salaryType_id;
        this.emp_salary = emp_salary;
        this.emp_otherAllowance1 = emp_otherAllowance1;
        this.emp_otherAllowance2 = emp_otherAllowance2;
        this.emp_site_id = emp_site_id;
        this.emp_status = emp_status;
        this.emp_epf_status = emp_epf_status;
        this.emp_jobType_id = emp_jobType_id;
        this.emp_joinDate = emp_joinDate;
        this.emp_subContractor_id = emp_subContractor_id;
        this.emp_otherAllowance3 = emp_otherAllowance3;
        this.emp_otherAllowance4 = emp_otherAllowance4;
    }

    /**
     * @return the emp_id
     */
    public int getEmp_id() {
        return emp_id;
    }

    /**
     * @param emp_id the emp_id to set
     */
    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    /**
     * @return the emp_title
     */
    public char getEmp_title() {
        return emp_title;
    }

    /**
     * @param emp_title the emp_title to set
     */
    public void setEmp_title(char emp_title) {
        this.emp_title = emp_title;
    }

    /**
     * @return the emp_initials
     */
    public String getEmp_initials() {
        return emp_initials;
    }

    /**
     * @param emp_initials the emp_initials to set
     */
    public void setEmp_initials(String emp_initials) {
        this.emp_initials = emp_initials;
    }

    /**
     * @return the emp_firstName
     */
    public String getEmp_firstName() {
        return emp_firstName;
    }

    /**
     * @param emp_firstName the emp_firstName to set
     */
    public void setEmp_firstName(String emp_firstName) {
        this.emp_firstName = emp_firstName;
    }

    /**
     * @return the emp_middleName
     */
    public String getEmp_middleName() {
        return emp_middleName;
    }

    /**
     * @param emp_middleName the emp_middleName to set
     */
    public void setEmp_middleName(String emp_middleName) {
        this.emp_middleName = emp_middleName;
    }

    /**
     * @return the emp_surName
     */
    public String getEmp_surName() {
        return emp_surName;
    }

    /**
     * @param emp_surName the emp_surName to set
     */
    public void setEmp_surName(String emp_surName) {
        this.emp_surName = emp_surName;
    }

    /**
     * @return the emp_address1
     */
    public String getEmp_address1() {
        return emp_address1;
    }

    /**
     * @param emp_address1 the emp_address1 to set
     */
    public void setEmp_address1(String emp_address1) {
        this.emp_address1 = emp_address1;
    }

    /**
     * @return the emp_address2
     */
    public String getEmp_address2() {
        return emp_address2;
    }

    /**
     * @param emp_address2 the emp_address2 to set
     */
    public void setEmp_address2(String emp_address2) {
        this.emp_address2 = emp_address2;
    }

    /**
     * @return the emp_address3
     */
    public String getEmp_address3() {
        return emp_address3;
    }

    /**
     * @param emp_address3 the emp_address3 to set
     */
    public void setEmp_address3(String emp_address3) {
        this.emp_address3 = emp_address3;
    }

    /**
     * @return the emp_address4
     */
    public String getEmp_address4() {
        return emp_address4;
    }

    /**
     * @param emp_address4 the emp_address4 to set
     */
    public void setEmp_address4(String emp_address4) {
        this.emp_address4 = emp_address4;
    }

    /**
     * @return the emp_NIC
     */
    public String getEmp_NIC() {
        return emp_NIC;
    }

    /**
     * @param emp_NIC the emp_NIC to set
     */
    public void setEmp_NIC(String emp_NIC) {
        this.emp_NIC = emp_NIC;
    }

    /**
     * @return the emp_DOB
     */
    public Date getEmp_DOB() {
        return emp_DOB;
    }

    /**
     * @param emp_DOB the emp_DOB to set
     */
    public void setEmp_DOB(Date emp_DOB) {
        this.emp_DOB = emp_DOB;
    }

    /**
     * @return the emp_contact1
     */
    public String getEmp_contact1() {
        return emp_contact1;
    }

    /**
     * @param emp_contact1 the emp_contact1 to set
     */
    public void setEmp_contact1(String emp_contact1) {
        this.emp_contact1 = emp_contact1;
    }

    /**
     * @return the emp_contact2
     */
    public String getEmp_contact2() {
        return emp_contact2;
    }

    /**
     * @param emp_contact2 the emp_contact2 to set
     */
    public void setEmp_contact2(String emp_contact2) {
        this.emp_contact2 = emp_contact2;
    }

    /**
     * @return the emp_contatct3
     */
    public String getEmp_contatct3() {
        return emp_contatct3;
    }

    /**
     * @param emp_contatct3 the emp_contatct3 to set
     */
    public void setEmp_contatct3(String emp_contatct3) {
        this.emp_contatct3 = emp_contatct3;
    }

    /**
     * @return the emp_accountNo
     */
    public String getEmp_accountNo() {
        return emp_accountNo;
    }

    /**
     * @param emp_accountNo the emp_accountNo to set
     */
    public void setEmp_accountNo(String emp_accountNo) {
        this.emp_accountNo = emp_accountNo;
    }

    /**
     * @return the emp_bank_id
     */
    public int getEmp_bank_id() {
        return emp_bank_id;
    }

    /**
     * @param emp_bank_id the emp_bank_id to set
     */
    public void setEmp_bank_id(int emp_bank_id) {
        this.emp_bank_id = emp_bank_id;
    }

    /**
     * @return the emp_branch_id
     */
    public int getEmp_branch_id() {
        return emp_branch_id;
    }

    /**
     * @param emp_branch_id the emp_branch_id to set
     */
    public void setEmp_branch_id(int emp_branch_id) {
        this.emp_branch_id = emp_branch_id;
    }

    /**
     * @return the emp_designation_id
     */
    public int getEmp_designation_id() {
        return emp_designation_id;
    }

    /**
     * @param emp_designation_id the emp_designation_id to set
     */
    public void setEmp_designation_id(int emp_designation_id) {
        this.emp_designation_id = emp_designation_id;
    }

    /**
     * @return the emp_salaryType_id
     */
    public int getEmp_salaryType_id() {
        return emp_salaryType_id;
    }

    /**
     * @param emp_salaryType_id the emp_salaryType_id to set
     */
    public void setEmp_salaryType_id(int emp_salaryType_id) {
        this.emp_salaryType_id = emp_salaryType_id;
    }

    /**
     * @return the emp_salary
     */
    public double getEmp_salary() {
        return emp_salary;
    }

    /**
     * @param emp_salary the emp_salary to set
     */
    public void setEmp_salary(double emp_salary) {
        this.emp_salary = emp_salary;
    }

    /**
     * @return the emp_otherAllowance1
     */
    public double getEmp_otherAllowance1() {
        return emp_otherAllowance1;
    }

    /**
     * @param emp_otherAllowance1 the emp_otherAllowance1 to set
     */
    public void setEmp_otherAllowance1(double emp_otherAllowance1) {
        this.emp_otherAllowance1 = emp_otherAllowance1;
    }

    /**
     * @return the emp_otherAllowance2
     */
    public double getEmp_otherAllowance2() {
        return emp_otherAllowance2;
    }

    /**
     * @param emp_otherAllowance2 the emp_otherAllowance2 to set
     */
    public void setEmp_otherAllowance2(double emp_otherAllowance2) {
        this.emp_otherAllowance2 = emp_otherAllowance2;
    }

    /**
     * @return the emp_site_id
     */
    public int getEmp_site_id() {
        return emp_site_id;
    }

    /**
     * @param emp_site_id the emp_site_id to set
     */
    public void setEmp_site_id(int emp_site_id) {
        this.emp_site_id = emp_site_id;
    }

    /**
     * @return the emp_status
     */
    public char getEmp_status() {
        return emp_status;
    }

    /**
     * @param emp_status the emp_status to set
     */
    public void setEmp_status(char emp_status) {
        this.emp_status = emp_status;
    }

    /**
     * @return the emp_epf_status
     */
    public char getEmp_epf_status() {
        return emp_epf_status;
    }

    /**
     * @param emp_epf_status the emp_epf_status to set
     */
    public void setEmp_epf_status(char emp_epf_status) {
        this.emp_epf_status = emp_epf_status;
    }

    /**
     * @return the emp_jobType_id
     */
    public int getEmp_jobType_id() {
        return emp_jobType_id;
    }

    /**
     * @param emp_jobType_id the emp_jobType_id to set
     */
    public void setEmp_jobType_id(int emp_jobType_id) {
        this.emp_jobType_id = emp_jobType_id;
    }

    /**
     * @return the emp_joinDate
     */
    public Date getEmp_joinDate() {
        return emp_joinDate;
    }

    /**
     * @param emp_joinDate the emp_joinDate to set
     */
    public void setEmp_joinDate(Date emp_joinDate) {
        this.emp_joinDate = emp_joinDate;
    }

    /**
     * @return the emp_subContractor_id
     */
    public int getEmp_subContractor_id() {
        return emp_subContractor_id;
    }

    /**
     * @param emp_subContractor_id the emp_subContractor_id to set
     */
    public void setEmp_subContractor_id(int emp_subContractor_id) {
        this.emp_subContractor_id = emp_subContractor_id;
    }

    /**
     * @return the emp_otherAllowance3
     */
    public double getEmp_otherAllowance3() {
        return emp_otherAllowance3;
    }

    /**
     * @param emp_otherAllowance3 the emp_otherAllowance3 to set
     */
    public void setEmp_otherAllowance3(double emp_otherAllowance3) {
        this.emp_otherAllowance3 = emp_otherAllowance3;
    }

    /**
     * @return the emp_otherAllowance4
     */
    public double getEmp_otherAllowance4() {
        return emp_otherAllowance4;
    }

    /**
     * @param emp_otherAllowance4 the emp_otherAllowance4 to set
     */
    public void setEmp_otherAllowance4(double emp_otherAllowance4) {
        this.emp_otherAllowance4 = emp_otherAllowance4;
    }

    
    
}
