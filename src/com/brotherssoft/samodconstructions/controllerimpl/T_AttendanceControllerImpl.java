/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.controllerimpl;

import com.brotherssoft.samodconstructions.controller.T_AttendanceController;
import com.brotherssoft.samodconstructions.model.T_Attendance;
import com.brotherssoft.samodconstructions.reservation.T_AttendanceReserver;
import com.brotherssoft.samodconstructions.servicefactory.ServiceFactory;
import com.brotherssoft.samodconstructions.servicefactoryimpl.ServiceFactoryImpl;
import java.rmi.server.UnicastRemoteObject;
import java.util.Date;
import java.util.List;

/**
 *
 * @author gksde
 */
public class T_AttendanceControllerImpl extends UnicastRemoteObject implements T_AttendanceController{

    private final ServiceFactory sf;
    private static final T_AttendanceReserver ATTENDANCE_RESERVER = new T_AttendanceReserver();
    
    public T_AttendanceControllerImpl() throws Exception{
        this.sf = new ServiceFactoryImpl();
    }

    @Override
    public boolean addAttendance(T_Attendance attendance) throws Exception {
        return sf.getAttendanceService().addAttendance(attendance);
    }

    @Override
    public boolean updateAttendance(T_Attendance attendance) throws Exception {
        return sf.getAttendanceService().updateAttendance(attendance);
    }

    @Override
    public boolean deleteAttendance(int id) throws Exception {
        return sf.getAttendanceService().deleteAttendance(id);
    }

    @Override
    public T_Attendance searchAttendance(int id) throws Exception {
        return sf.getAttendanceService().searchAttendance(id);
    }

    @Override
    public List<T_Attendance> getAllAttendances() throws Exception {
        return sf.getAttendanceService().getAllAttendances();
    }

    @Override
    public T_Attendance searchAttendance(Date date, int empId, int site) throws Exception {
        return sf.getAttendanceService().searchAttendance(date, empId, site);
    }

    @Override
    public List<T_Attendance> getAllAttendancesByLetter(String phrase) throws Exception {
        return sf.getAttendanceService().getAllAttendancesByLetter(phrase);
    }

    @Override
    public boolean reserveAttendance(int id) throws Exception {
        return ATTENDANCE_RESERVER.reserveAccount(id, this);
    }

    @Override
    public boolean releaseAttendance(int id) throws Exception {
        return ATTENDANCE_RESERVER.releaseAccount(id, this);
    }
    
    
    
}
