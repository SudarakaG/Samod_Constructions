/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.controller;

import com.brotherssoft.samodconstructions.model.T_Attendance;
import java.rmi.Remote;
import java.util.Date;
import java.util.List;

/**
 *
 * @author gksde
 */
public interface T_AttendanceController extends Remote{
    
    public boolean addAttendance(T_Attendance attendance)throws Exception;
    public boolean updateAttendance(T_Attendance attendance)throws Exception;
    public boolean deleteAttendance(int id)throws Exception;
    public T_Attendance searchAttendance(int id)throws Exception;
    public List<T_Attendance> getAllAttendances()throws Exception;
    public T_Attendance searchAttendance(Date date,int empId)throws Exception;
    public List<T_Attendance> getAllAttendancesByLetter(String phrase)throws Exception;
    public List<T_Attendance> getAllAttendancesByDate(Date date)throws Exception;
    public List<T_Attendance> getAllAttendances(Date date,int jobTypeId)throws Exception;
    public List<T_Attendance> getAllAttendances(Date fromDate,Date toDate)throws Exception;
    
    public boolean reserveAttendance(int id)throws Exception;
    public boolean releaseAttendance(int id)throws Exception;
    
}
