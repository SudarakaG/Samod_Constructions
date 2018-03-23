/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.dbAccess;

import com.brotherssoft.samodconstructions.db.DBConnection;
import com.brotherssoft.samodconstructions.model.T_Salary;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author gksde
 */
public class T_SalaryDBAccess {

    public boolean addSalaryDetail(T_Salary salary) throws Exception {

        Connection connection = DBConnection.getDBConnection().getConnection();
        String sql = "Insert into t_salary values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement stm = connection.prepareStatement(sql);
        stm.setObject(1, salary.getSalary_fromDate());
        stm.setObject(2, salary.getSalary_toDate());
        stm.setObject(3, salary.getSalary_employeeId());
        stm.setObject(4, salary.getSalary_basic());
        stm.setObject(5, salary.getSalary_daily());
        stm.setObject(6, salary.getSalary_otherAllowance1());
        stm.setObject(7, salary.getSalary_otherAllowance2());
        stm.setObject(8, salary.getSalary_ot());
        stm.setObject(9, salary.getSalary_advace());
        stm.setObject(10, salary.getSalary_addition());
        stm.setObject(11, salary.getSalary_deduction());
        stm.setObject(12, salary.getSalary_gross());
        stm.setObject(13, salary.getSalary_totalDeduction());
        stm.setObject(14, salary.getSalary_net());
        stm.setObject(15, salary.getSalary_status());
        stm.setObject(16, salary.getSalary_enteredUser());
        stm.setObject(17, salary.getSalary_enteredDate());
        stm.setObject(18, salary.getSalary_approvedUser());
        stm.setObject(19, salary.getSalary_approvedDate());
        stm.setObject(20, salary.getSalary_otherAllowance3());
        stm.setObject(21, salary.getSalary_otherAllowance4());
        stm.setObject(22, salary.getSalary_batchId());

        return stm.executeUpdate() > 0;

    }

    public boolean updateSalaryDetail(T_Salary salary) throws Exception {
        String sql = "Update t_salary set SAL_BASIC=?, SAL_DAILY=?, SAL_OTHALLOW1=?, SAL_OTHALLOW2=?, SAL_OT=?, SAL_ADVANCE=?, SAL_ADDITION=?, SAL_DEDUCTION=?, SAL_GROSS=?, SAL_TOT_DEDUCTION=?, SAL_NET=?, SAL_STATUS=?, SAL_ENTERD_USER=?, SAL_ENTERED_DATE=?, SAL_APP_USER=?, SAL_APP_DATE=?, SAL_OTHALLOW3=?, SAL_OTHALLOW4=?, SAL_BATCH=? where SAL_FROM_DATE=? AND SAL_TO_DATE=? AND SAL_EMP_ID=?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);

        stm.setObject(1, salary.getSalary_basic());
        stm.setObject(2, salary.getSalary_daily());
        stm.setObject(3, salary.getSalary_otherAllowance1());
        stm.setObject(4, salary.getSalary_otherAllowance2());
        stm.setObject(5, salary.getSalary_ot());
        stm.setObject(6, salary.getSalary_advace());
        stm.setObject(7, salary.getSalary_addition());
        stm.setObject(8, salary.getSalary_deduction());
        stm.setObject(9, salary.getSalary_gross());
        stm.setObject(10, salary.getSalary_totalDeduction());
        stm.setObject(11, salary.getSalary_net());
        stm.setObject(12, salary.getSalary_status());
        stm.setObject(13, salary.getSalary_enteredUser());
        stm.setObject(14, salary.getSalary_enteredDate());
        stm.setObject(15, salary.getSalary_approvedUser());
        stm.setObject(16, salary.getSalary_approvedDate());
        stm.setObject(17, salary.getSalary_otherAllowance3());
        stm.setObject(18, salary.getSalary_otherAllowance4());
        stm.setObject(19, salary.getSalary_batchId());
        stm.setObject(20, salary.getSalary_fromDate());
        stm.setObject(21, salary.getSalary_toDate());
        stm.setObject(22, salary.getSalary_employeeId());
        return stm.executeUpdate() > 0;

    }

    public boolean deleteSalaryDetail(Date from, Date to, int empId) throws Exception {

        String sql = "Delete From t_salary where SAL_FROM_DATE=? AND SAL_TO_DATE=? AND SAL_EMP_ID=?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, from);
        stm.setObject(2, to);
        stm.setObject(3, empId);
        return stm.executeUpdate() > 0;

    }

    public T_Salary searchSalaryDetail(Date from, Date to, int empId) throws Exception {

        String sql = "Select * From t_salary where SAL_FROM_DATE=? AND SAL_TO_DATE=? AND SAL_EMP_ID=?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, from);
        stm.setObject(2, to);
        stm.setObject(3, empId);
        ResultSet rst = stm.executeQuery();
        T_Salary salary = null;
        if (rst.next()) {
            salary = new T_Salary(rst.getDate(1), rst.getDate(2), rst.getInt(3), rst.getDouble(4), rst.getDouble(5), rst.getDouble(6), rst.getDouble(7), rst.getDouble(8), rst.getDouble(9), rst.getDouble(10), rst.getDouble(11), rst.getDouble(12), rst.getDouble(13), rst.getDouble(14), rst.getString(15), rst.getInt(16), rst.getDate(17), rst.getInt(18), rst.getDate(19), rst.getDouble(20), rst.getDouble(21), rst.getInt(22));

        }
        return salary;

    }

    public List<T_Salary> getAllSalaryDetail() throws Exception {

        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery("Select * From t_salary");
        List<T_Salary> salaries = new ArrayList<>();
        while (rst.next()) {
            T_Salary salary = new T_Salary(rst.getDate(1), rst.getDate(2), rst.getInt(3), rst.getDouble(4), rst.getDouble(5), rst.getDouble(6), rst.getDouble(7), rst.getDouble(8), rst.getDouble(9), rst.getDouble(10), rst.getDouble(11), rst.getDouble(12), rst.getDouble(13), rst.getDouble(14), rst.getString(15), rst.getInt(16), rst.getDate(17), rst.getInt(18), rst.getDate(19), rst.getDouble(20), rst.getDouble(21), rst.getInt(22));
            salaries.add(salary);
        }
        return salaries;

    }

    
    public List<T_Salary> getAllSalaryDetail(Date from,Date to) throws Exception {

        String sql = "Select * From t_salary WHERE SAL_FROM_DATE =? AND SAL_TO_DATE=?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, from);
        stm.setObject(2, to);
        ResultSet rst = stm.executeQuery();
        List<T_Salary> salaries = new ArrayList<>();
        while (rst.next()) {
            T_Salary salary = new T_Salary(rst.getDate(1), rst.getDate(2), rst.getInt(3), rst.getDouble(4), rst.getDouble(5), rst.getDouble(6), rst.getDouble(7), rst.getDouble(8), rst.getDouble(9), rst.getDouble(10), rst.getDouble(11), rst.getDouble(12), rst.getDouble(13), rst.getDouble(14), rst.getString(15), rst.getInt(16), rst.getDate(17), rst.getInt(18), rst.getDate(19), rst.getDouble(20), rst.getDouble(21), rst.getInt(22));
            salaries.add(salary);
        }
        return salaries;

    }

}
