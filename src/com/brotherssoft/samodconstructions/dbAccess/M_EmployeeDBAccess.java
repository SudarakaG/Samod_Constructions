/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.dbAccess;

import com.brotherssoft.samodconstructions.db.DBConnection;
import com.brotherssoft.samodconstructions.model.M_Employee;
import com.brotherssoft.samodconstructions.model.R_Bank;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author Akvasoft
 */
public class M_EmployeeDBAccess {
    public boolean addEmployee(M_Employee employee) throws Exception{
     
            Connection connection = DBConnection.getDBConnection().getConnection();
            String sql = "Insert into m_emp values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setObject(1, employee.getEmp_id());
            stm.setObject(2, employee.getEmp_title());
            stm.setObject(3, employee.getEmp_initials());
            stm.setObject(4, employee.getEmp_firstName());
            stm.setObject(5, employee.getEmp_middleName());
            stm.setObject(6, employee.getEmp_surName());
            stm.setObject(7, employee.getEmp_address1());
            stm.setObject(8, employee.getEmp_address2());
            stm.setObject(9, employee.getEmp_address3());
            stm.setObject(10, employee.getEmp_address4());
            stm.setObject(11, employee.getEmp_NIC());
            stm.setObject(12, employee.getEmp_DOB());
            stm.setObject(13, employee.getEmp_contact1());
            stm.setObject(14, employee.getEmp_contact2());
            stm.setObject(15, employee.getEmp_contatct3());
            stm.setObject(16, employee.getEmp_accountNo());
            stm.setObject(17, employee.getEmp_bank_id());
            stm.setObject(18, employee.getEmp_branch_id());
            stm.setObject(19, employee.getEmp_designation_id());
            stm.setObject(20, employee.getEmp_salaryType_id());
            stm.setObject(21, employee.getEmp_salary());
            stm.setObject(22, employee.getEmp_otherAllowance1());
            stm.setObject(23, employee.getEmp_otherAllowance2());
            stm.setObject(24, employee.getEmp_site_id());
            stm.setObject(25, employee.getEmp_status());
            stm.setObject(26, employee.getEmp_epf_status());
            stm.setObject(27, employee.getEmp_jobType_id());
            stm.setObject(28, employee.getEmp_joinDate());
            stm.setObject(29, employee.getEmp_subContractor_id());
            stm.setObject(30, employee.getEmp_otherAllowance3());
            stm.setObject(31, employee.getEmp_otherAllowance4());
            return stm.executeUpdate() > 0;
        
    }
}
