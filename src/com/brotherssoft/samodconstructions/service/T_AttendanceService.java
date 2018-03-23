/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.service;

import com.brotherssoft.samodconstructions.dbAccessFactory.DBAccessFactory;
import com.brotherssoft.samodconstructions.dbAccessFactoryImpl.DBAccessFactoryImpl;
import com.brotherssoft.samodconstructions.model.T_Attendance;
import java.util.Date;
import java.util.List;

/**
 *
 * @author gksde
 */
public class T_AttendanceService {

    private final DBAccessFactory dbaf;
    
    public T_AttendanceService() {
        this.dbaf = new DBAccessFactoryImpl();
    }
    
    public boolean addAttendance(T_Attendance attendance)throws Exception{
        return dbaf.getAttendanceDBAccess().addAttendance(attendance);
    }
    
    public boolean updateAttendance(T_Attendance attendance)throws Exception{
        return dbaf.getAttendanceDBAccess().updateAttendance(attendance);
    }
    
    public boolean deleteAttendance(int id)throws Exception{
        return dbaf.getAttendanceDBAccess().deleteAttendance(id);
    }
    
    public T_Attendance searchAttendance(int id)throws Exception{
        return dbaf.getAttendanceDBAccess().searchAttendance(id);
    }
    
    public List<T_Attendance> getAllAttendances()throws Exception{
        return dbaf.getAttendanceDBAccess().getAllAttendance();
    }
    
    public T_Attendance searchAttendance(Date date,int empId)throws Exception{
        return dbaf.getAttendanceDBAccess().searchAttendance(date, empId);
    }
    
    public List<T_Attendance> getAllAttendancesByLetter(String phrase)throws Exception{
        return dbaf.getAttendanceDBAccess().getAllAttendanceByLetter(phrase);
    }
    
    public List<T_Attendance> getAllAttendancesByDate(Date date)throws Exception{
        return dbaf.getAttendanceDBAccess().getAllAttendanceByDate(date);
    }
    
    public List<T_Attendance> getAllAttendances(Date date,int jobTypeId)throws Exception{
        return dbaf.getAttendanceDBAccess().getAllAttendance(date,jobTypeId);
    }
    
    public List<T_Attendance> getAllAttendances(Date fromDate,Date toDate)throws Exception{
        return dbaf.getAttendanceDBAccess().getAllAttendance(fromDate, toDate);
    }
    
}
