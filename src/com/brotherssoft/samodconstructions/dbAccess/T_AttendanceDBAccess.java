/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.dbAccess;

import com.brotherssoft.samodconstructions.db.DBConnection;
import com.brotherssoft.samodconstructions.model.T_Attendance;
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
public class T_AttendanceDBAccess {
    public boolean addAttendance(T_Attendance attendance) throws Exception {

        Connection connection = DBConnection.getDBConnection().getConnection();
        String sql = "Insert into t_att values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement stm = connection.prepareStatement(sql);
        stm.setObject(1, attendance.getAttendance_id());
        stm.setObject(2, attendance.getAttendance_date());
        stm.setObject(3, attendance.getAttendance_siteId());
        stm.setObject(4, attendance.getAttendance_employeeId());
        stm.setObject(5, attendance.getAttendance_in());
        stm.setObject(6, attendance.getAttendance_out());
        stm.setObject(7, attendance.getAttendance_ot());
        stm.setObject(8, attendance.getAttendance_advance());
        stm.setObject(9, attendance.getAttendance_enteredBy());
        stm.setObject(10, attendance.getAttendance_approvedBy());
        stm.setObject(11, attendance.getAttendance_workId());
        stm.setObject(12, attendance.getAttendance_comment());
        stm.setObject(13, attendance.getAttendance_status());
        stm.setObject(14, attendance.getAttendance_enteredDate());
        stm.setObject(15, attendance.getAttendance_approvedDate());
        stm.setObject(16, attendance.getAttendance_days());
        stm.setObject(17, attendance.getAttendance_dailyRate());
        stm.setObject(18, attendance.getAttendance_otRate());
        stm.setObject(19, attendance.getAttendance_processed());
        stm.setObject(20, attendance.getAttendance_salaryBatch());
        stm.setObject(21, attendance.getEmployeeCategory());
        return stm.executeUpdate() > 0;

    }

    public boolean updateAttendance(T_Attendance attendance) throws Exception {
        String sql = "Update t_att set ATT_DATE=?, ATT_SITEID=?, ATT_EMP_ID=?, ATT_IN=?, ATT_OUT=?, ATT_OT=?, ATT_ADVANCE=?, ATT_ENTERBY=?, ATT_APPROVEDBY=?, ATT_WORKID=?, ATT_COMMENT=?, ATT_STATUS=?, ATT_ENTERDATE=?, ATT_APPROVEDDATE=?, ATT_DAYS=?, ATT_DAILYRATE=?, ATT_OTRATE=?, ATT_PROCESSED=?, ATT_SALBATCH=?, ATT_EMP_CAT=? where ATT_ID=?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);

        stm.setObject(1, attendance.getAttendance_date());
        stm.setObject(2, attendance.getAttendance_siteId());
        stm.setObject(3, attendance.getAttendance_employeeId());
        stm.setObject(4, attendance.getAttendance_in());
        stm.setObject(5, attendance.getAttendance_out());
        stm.setObject(6, attendance.getAttendance_ot());
        stm.setObject(7, attendance.getAttendance_advance());
        stm.setObject(8, attendance.getAttendance_enteredBy());
        stm.setObject(9, attendance.getAttendance_approvedBy());
        stm.setObject(10, attendance.getAttendance_workId());
        stm.setObject(11, attendance.getAttendance_comment());
        stm.setObject(12, attendance.getAttendance_status());
        stm.setObject(13, attendance.getAttendance_enteredDate());
        stm.setObject(14, attendance.getAttendance_approvedDate());
        stm.setObject(15, attendance.getAttendance_days());
        stm.setObject(16, attendance.getAttendance_dailyRate());
        stm.setObject(17, attendance.getAttendance_otRate());
        stm.setObject(18, attendance.getAttendance_processed());
        stm.setObject(19, attendance.getAttendance_salaryBatch());
        stm.setObject(20, attendance.getEmployeeCategory());
        stm.setObject(21, attendance.getAttendance_id());
        return stm.executeUpdate() > 0;

    }

    public boolean deleteAttendance(int id) throws Exception {

        String sql = "Delete From t_att where ATT_ID=?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, id);
        return stm.executeUpdate() > 0;

    }

    public T_Attendance searchAttendance(int id) throws Exception {

        String sql = "Select * From t_att where ATT_ID=?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, id);
        ResultSet rst = stm.executeQuery();
        T_Attendance attendance = null;
        if (rst.next()) {
            attendance = new T_Attendance(rst.getInt(1), rst.getDate(2), rst.getInt(3), rst.getInt(4), rst.getString(5), rst.getString(6), rst.getDouble(7), rst.getDouble(8), rst.getInt(9), rst.getInt(10), rst.getInt(11), rst.getString(12), rst.getString(13), rst.getDate(14), rst.getDate(15), rst.getDouble(16), rst.getDouble(17), rst.getDouble(18), rst.getString(19), rst.getInt(20),rst.getInt(21));

        }
        return attendance;

    }

    public List<T_Attendance> getAllAttendance() throws Exception {

        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery("Select * From t_att");
        List<T_Attendance> attendances = new ArrayList<>();
        while (rst.next()) {
            T_Attendance attendance = new T_Attendance(rst.getInt(1), rst.getDate(2), rst.getInt(3), rst.getInt(4), rst.getString(5), rst.getString(6), rst.getDouble(7), rst.getDouble(8), rst.getInt(9), rst.getInt(10), rst.getInt(11), rst.getString(12), rst.getString(13), rst.getDate(14), rst.getDate(15), rst.getDouble(16), rst.getDouble(17), rst.getDouble(18), rst.getString(19), rst.getInt(20),rst.getInt(21));
            if (attendance.getAttendance_id() != 0) {
                attendances.add(attendance);
            }
        }
        return attendances;

    }

    public T_Attendance searchAttendance(Date date,int empId) throws Exception {

        String sql = "Select * From t_att where ATT_DATE=? AND ATT_EMP_ID=?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, date);
        stm.setObject(2, empId);
        ResultSet rst = stm.executeQuery();
        T_Attendance attendance = null;
        if (rst.next()) {
            attendance = new T_Attendance(rst.getInt(1), rst.getDate(2), rst.getInt(3), rst.getInt(4), rst.getString(5), rst.getString(6), rst.getDouble(7), rst.getDouble(8), rst.getInt(9), rst.getInt(10), rst.getInt(11), rst.getString(12), rst.getString(13), rst.getDate(14), rst.getDate(15), rst.getDouble(16), rst.getDouble(17), rst.getDouble(18), rst.getString(19), rst.getInt(20),rst.getInt(21));

        }
        return attendance;

    }

    public List<T_Attendance> getAllAttendanceByLetter(String phrase) throws Exception {

        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery("Select * From t_att WHERE ATT_DATE LIKE '" + phrase + "%'");
        List<T_Attendance> attendances = new ArrayList<>();
        while (rst.next()) {
            T_Attendance attendance = new T_Attendance(rst.getInt(1), rst.getDate(2), rst.getInt(3), rst.getInt(4), rst.getString(5), rst.getString(6), rst.getDouble(7), rst.getDouble(8), rst.getInt(9), rst.getInt(10), rst.getInt(11), rst.getString(12), rst.getString(13), rst.getDate(14), rst.getDate(15), rst.getDouble(16), rst.getDouble(17), rst.getDouble(18), rst.getString(19), rst.getInt(20),rst.getInt(21));
            if (attendance.getAttendance_id() != 0) {
                attendances.add(attendance);
            }
        }
        return attendances;

    }
    
    public List<T_Attendance> getAllAttendanceByDate(Date date) throws Exception {

        String sql = "Select * From t_att WHERE ATT_DATE =?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, date);
        ResultSet rst = stm.executeQuery();
        List<T_Attendance> attendances = new ArrayList<>();
        while (rst.next()) {
            T_Attendance attendance = new T_Attendance(rst.getInt(1), rst.getDate(2), rst.getInt(3), rst.getInt(4), rst.getString(5), rst.getString(6), rst.getDouble(7), rst.getDouble(8), rst.getInt(9), rst.getInt(10), rst.getInt(11), rst.getString(12), rst.getString(13), rst.getDate(14), rst.getDate(15), rst.getDouble(16), rst.getDouble(17), rst.getDouble(18), rst.getString(19), rst.getInt(20),rst.getInt(21));
            System.out.println("(((((((((("+attendance.getAttendance_date());
            if (attendance.getAttendance_id() != 0) {
                attendances.add(attendance);
            }
        }
        return attendances;

    }
    
    public List<T_Attendance> getAllAttendance(Date date,int jobTypeId) throws Exception {

        String sql = "Select * From t_att WHERE ATT_DATE=? AND ATT_EMP_CAT=?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, date);
        stm.setObject(2, jobTypeId);
        ResultSet rst = stm.executeQuery();
        List<T_Attendance> attendances = new ArrayList<>();
        while (rst.next()) {
            T_Attendance attendance = new T_Attendance(rst.getInt(1), rst.getDate(2), rst.getInt(3), rst.getInt(4), rst.getString(5), rst.getString(6), rst.getDouble(7), rst.getDouble(8), rst.getInt(9), rst.getInt(10), rst.getInt(11), rst.getString(12), rst.getString(13), rst.getDate(14), rst.getDate(15), rst.getDouble(16), rst.getDouble(17), rst.getDouble(18), rst.getString(19), rst.getInt(20),rst.getInt(21));
            System.out.println("(((((((((("+attendance.getAttendance_date());
            if (attendance.getAttendance_id() != 0) {
                attendances.add(attendance);
            }
        }
        return attendances;

    }
    
    public List<T_Attendance> getAllAttendance(Date fromDate, Date toDate) throws Exception {

        String sql = "Select * From t_att WHERE ATT_DATE between ? and ?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, fromDate);
        stm.setObject(2, toDate);
        ResultSet rst = stm.executeQuery();
        List<T_Attendance> attendances = new ArrayList<>();
        while (rst.next()) {
            T_Attendance attendance = new T_Attendance(rst.getInt(1), rst.getDate(2), rst.getInt(3), rst.getInt(4), rst.getString(5), rst.getString(6), rst.getDouble(7), rst.getDouble(8), rst.getInt(9), rst.getInt(10), rst.getInt(11), rst.getString(12), rst.getString(13), rst.getDate(14), rst.getDate(15), rst.getDouble(16), rst.getDouble(17), rst.getDouble(18), rst.getString(19), rst.getInt(20),rst.getInt(21));
            System.out.println("(((((((((("+attendance.getAttendance_date());
            if (attendance.getAttendance_id() != 0) {
                attendances.add(attendance);
            }
        }
        return attendances;

    }
}
