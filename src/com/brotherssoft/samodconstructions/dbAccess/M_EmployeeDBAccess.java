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
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Akvasoft
 */
public class M_EmployeeDBAccess {

    public boolean addEmployee(M_Employee employee) throws Exception {

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

    public boolean updateEmployee(M_Employee employee) throws Exception {

        String sql = "UPDATE m_emp SET EMP_TITLE=?, EMP_INITIALS=?, EMP_FIRSTNAME=?, EMP_MIDLENAMES=?, EMP_SURNAME=?, EMP_ADD1=?, EMP_ADD2=?, EMP_ADD3=?, EMP_ADD4=?, EMP_NIC=?, EMP_DOB=?, EMP_CONT1=?, EMP_CONT2=?, EMP_CONT3=?, EMP_ACCNO=?, EMP_BANKID=?, EMP_BRANCHID=?, EMP_DESGID=?, EMP_SALARYTYPE=?, EMP_SALARY=?, EMP_OTHALLOW1=?, EMP_OTHALLOW2=?, EMP_SITEID=?, EMP_STATUS=?, EMP_EPFSTATUS=?, EMP_JOBTYPEID=?, EMP_JOINDATE=?, EMP_SUBCONID=?, EMP_OTHALLOW3=?, EMP_OTHALLOW4=? WHERE EMP_ID=?";
        Connection connection = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = connection.prepareStatement(sql);
        
        stm.setObject(1, employee.getEmp_title());
        stm.setObject(2, employee.getEmp_initials());
        stm.setObject(3, employee.getEmp_firstName());
        stm.setObject(4, employee.getEmp_middleName());
        stm.setObject(5, employee.getEmp_surName());
        stm.setObject(6, employee.getEmp_address1());
        stm.setObject(7, employee.getEmp_address2());
        stm.setObject(8, employee.getEmp_address3());
        stm.setObject(9, employee.getEmp_address4());
        stm.setObject(10, employee.getEmp_NIC());
        stm.setObject(11, employee.getEmp_DOB());
        stm.setObject(12, employee.getEmp_contact1());
        stm.setObject(13, employee.getEmp_contact2());
        stm.setObject(14, employee.getEmp_contatct3());
        stm.setObject(15, employee.getEmp_accountNo());
        stm.setObject(16, employee.getEmp_bank_id());
        stm.setObject(17, employee.getEmp_branch_id());
        stm.setObject(18, employee.getEmp_designation_id());
        stm.setObject(19, employee.getEmp_salaryType_id());
        stm.setObject(20, employee.getEmp_salary());
        stm.setObject(21, employee.getEmp_otherAllowance1());
        stm.setObject(22, employee.getEmp_otherAllowance2());
        stm.setObject(23, employee.getEmp_site_id());
        stm.setObject(24, employee.getEmp_status());
        stm.setObject(25, employee.getEmp_epf_status());
        stm.setObject(26, employee.getEmp_jobType_id());
        stm.setObject(27, employee.getEmp_joinDate());
        stm.setObject(28, employee.getEmp_subContractor_id());
        stm.setObject(29, employee.getEmp_otherAllowance3());
        stm.setObject(30, employee.getEmp_otherAllowance4());
        stm.setObject(31, employee.getEmp_id());
        
        return stm.executeUpdate() > 0;

    }
    
    public boolean deleteEmployee(int id)throws Exception{
        
        String sql = "DELETE FROM m_emp WHERE EMP_ID=?";
        Connection connection = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = connection.prepareStatement(sql);
        stm.setObject(1, id);
        
        return stm.executeUpdate() > 0;
        
    }
    
    public M_Employee searchEmployee(int id)throws Exception{
        
        String sql = "SELECT * FROM m_emp WHERE EMP_ID=?";
        Connection connection = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = connection.prepareStatement(sql);
        stm.setObject(1, id);
        ResultSet rst = stm.executeQuery();
        
        M_Employee employee = null;
        if(rst.next()){
            employee = new M_Employee(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5), rst.getString(6), rst.getString(7), rst.getString(8), rst.getString(9), rst.getString(10), rst.getString(11), rst.getDate(12), rst.getString(13), rst.getString(14), rst.getString(15), rst.getString(16), rst.getInt(17), rst.getInt(18), rst.getInt(19), rst.getInt(20), rst.getDouble(21), rst.getDouble(22), rst.getDouble(23), rst.getInt(24), rst.getString(25), rst.getString(26), rst.getInt(27), rst.getDate(28), rst.getInt(29), rst.getDouble(30), rst.getDouble(31));
        }
        return employee;
        
    }
    
    public M_Employee searchEmployee(String name)throws Exception{
        
        String sql = "SELECT * FROM m_emp WHERE EMP_FIRSTNAME=?";
        Connection connection = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = connection.prepareStatement(sql);
        stm.setObject(1, name);
        ResultSet rst = stm.executeQuery();
        
        M_Employee employee = null;
        if(rst.next()){
            employee = new M_Employee(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5), rst.getString(6), rst.getString(7), rst.getString(8), rst.getString(9), rst.getString(10), rst.getString(11), rst.getDate(12), rst.getString(13), rst.getString(14), rst.getString(15), rst.getString(16), rst.getInt(17), rst.getInt(18), rst.getInt(19), rst.getInt(20), rst.getDouble(21), rst.getDouble(22), rst.getDouble(23), rst.getInt(24), rst.getString(25), rst.getString(26), rst.getInt(27), rst.getDate(28), rst.getInt(29), rst.getDouble(30), rst.getDouble(31));
        }
        return employee;
        
    }
    
    public M_Employee searchEmployeeByNIC(String nic)throws Exception{
        
        String sql = "SELECT * FROM m_emp WHERE EMP_NIC=?";
        Connection connection = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = connection.prepareStatement(sql);
        stm.setObject(1, nic);
        ResultSet rst = stm.executeQuery();
        
        M_Employee employee = null;
        if(rst.next()){
            employee = new M_Employee(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5), rst.getString(6), rst.getString(7), rst.getString(8), rst.getString(9), rst.getString(10), rst.getString(11), rst.getDate(12), rst.getString(13), rst.getString(14), rst.getString(15), rst.getString(16), rst.getInt(17), rst.getInt(18), rst.getInt(19), rst.getInt(20), rst.getDouble(21), rst.getDouble(22), rst.getDouble(23), rst.getInt(24), rst.getString(25), rst.getString(26), rst.getInt(27), rst.getDate(28), rst.getInt(29), rst.getDouble(30), rst.getDouble(31));
        }
        return employee;
        
    }
    
    public List<M_Employee> getAllEmployees()throws Exception{
        
        String sql = "SELECT * FROM m_emp";
        Connection connection = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = connection.prepareStatement(sql);
        ResultSet rst = stm.executeQuery();
        
        List<M_Employee> employees = new ArrayList<>();
        while (rst.next()) {            
            M_Employee employee = new M_Employee(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5), rst.getString(6), rst.getString(7), rst.getString(8), rst.getString(9), rst.getString(10), rst.getString(11), rst.getDate(12), rst.getString(13), rst.getString(14), rst.getString(15), rst.getString(16), rst.getInt(17), rst.getInt(18), rst.getInt(19), rst.getInt(20), rst.getDouble(21), rst.getDouble(22), rst.getDouble(23), rst.getInt(24), rst.getString(25), rst.getString(26), rst.getInt(27), rst.getDate(28), rst.getInt(29), rst.getDouble(30), rst.getDouble(31));
            employees.add(employee);
        }
        return employees;
        
    }
    
    public M_Employee searchBySubContractorId(int subId)throws Exception{
        
        String sql = "SELECT * FROM m_emp WHERE EMP_SUBCONID=?";
        Connection connection = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = connection.prepareStatement(sql);
        stm.setObject(1, subId);
        ResultSet rst = stm.executeQuery();
        
        M_Employee employee = null;
        if(rst.next()){
            employee = new M_Employee(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5), rst.getString(6), rst.getString(7), rst.getString(8), rst.getString(9), rst.getString(10), rst.getString(11), rst.getDate(12), rst.getString(13), rst.getString(14), rst.getString(15), rst.getString(16), rst.getInt(17), rst.getInt(18), rst.getInt(19), rst.getInt(20), rst.getDouble(21), rst.getDouble(22), rst.getDouble(23), rst.getInt(24), rst.getString(25), rst.getString(26), rst.getInt(27), rst.getDate(28), rst.getInt(29), rst.getDouble(30), rst.getDouble(31));
        }
        return employee;
        
    }
    
    public M_Employee searchByFullName(String initials,String fName,String mName,String lName)throws Exception{
        
        String sql = "SELECT * FROM m_emp WHERE EMP_INITIALS=? AND EMP_FIRSTNAME=? AND EMP_MIDLENAMES=? AND EMP_SURNAME=?";
        Connection connection = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = connection.prepareStatement(sql);
        stm.setObject(1, initials);
        stm.setObject(2, fName);
        stm.setObject(3, mName);
        stm.setObject(4, lName);
        ResultSet rst = stm.executeQuery();
        
        M_Employee employee = null;
        if(rst.next()){
            employee = new M_Employee(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5), rst.getString(6), rst.getString(7), rst.getString(8), rst.getString(9), rst.getString(10), rst.getString(11), rst.getDate(12), rst.getString(13), rst.getString(14), rst.getString(15), rst.getString(16), rst.getInt(17), rst.getInt(18), rst.getInt(19), rst.getInt(20), rst.getDouble(21), rst.getDouble(22), rst.getDouble(23), rst.getInt(24), rst.getString(25), rst.getString(26), rst.getInt(27), rst.getDate(28), rst.getInt(29), rst.getDouble(30), rst.getDouble(31));
        }
        return employee;
        
    }

}
