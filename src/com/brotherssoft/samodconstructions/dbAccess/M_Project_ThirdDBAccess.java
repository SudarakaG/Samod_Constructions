/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.dbAccess;

import com.brotherssoft.samodconstructions.db.DBConnection;
import com.brotherssoft.samodconstructions.model.M_Project_Third;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gksde
 */
public class M_Project_ThirdDBAccess {
    
    public boolean updateThirdProject(M_Project_Third third) throws Exception {

        String sql = "Update M_Project set PROJECTC_FINALBOQ=?, PROJECTC_FINALEXCEED=?, PROJECTC_FINALEXTRAWORK=?, PROJECTC_FINALPRICEESCA=?, PROJECTC_FINALVAT=?, PROJECTC_TAKEOVERDATE=?, PROJECTC_COMPLETEDDATE=?, PROJECTC_DATEHANDOVER=?, PROJECTC_TIMEEXTREQPERIOD=?, PROJECTC_TIMEEXTAPPROVEDPERIOD=?, PROJECTC_LIQUIDITYDAMAGE=?, PROJECTC_LIQUIDITYDAMAGEPERIOD=?, PROJECTC_LIQUIDITYDAMAGEAMOUNT=?, PROJECTC_COMPLETIONCERT=?, PROJECTC_RETENTION=?, PROJECTC_RETENTIONMODE=?, PROJECTC_RETENTIONAMOUNT=?, PROJECTC_RETENTIONORGANIZATION=?, PROJECTC_RETENTIONPERIODFROM=?, PROJECTC_RETENTIONPERIODTO=?, PROJECTC_RETENTIONRELEASE=?, PROJECTC_RETENTIONRELEASEAMOUNT=?, PROJECTC_RETENTIONRELEASEDATE=?, PROJECT_STATUS=?, PROJECT_CURRENT_STATUS=? where PROJECT_ID=?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);

        stm.setObject(1, third.getProject_final_boq());
        stm.setObject(2, third.getProject_final_exceed());
        stm.setObject(3, third.getProject_final_extraWork());
        stm.setObject(4, third.getProject_final_priceEscallation());
        stm.setObject(5, third.getProject_final_vat());
        stm.setObject(6, third.getProject_final_takeOverDate());
        stm.setObject(7, third.getProject_final_completeDate());
        stm.setObject(8, third.getProject_final_handOverDate());
        stm.setObject(9, third.getProject_final_timeExtentionRequestPeriod());
        stm.setObject(10, third.getProject_final_timeExtentionApprovedPeriod());
        stm.setObject(11, third.getProject_final_liquidityDamage());
        stm.setObject(12, third.getProject_final_liquidityDamagePeriod());
        stm.setObject(13, third.getProject_final_liquidityDamageAmount());
        stm.setObject(14, third.getProject_final_completionCertification());
        stm.setObject(15, third.getProject_final_retention());
        stm.setObject(16, third.getProject_final_retentionMode());
        stm.setObject(17, third.getProject_final_retentionAmount());
        stm.setObject(18, third.getProject_final_retentionOrganization());
        stm.setObject(19, third.getProject_final_retentionPeriodFrom());
        stm.setObject(20, third.getProject_final_retentionPeriodTo());
        stm.setObject(21, third.getProject_final_retentionRelease());
        stm.setObject(22, third.getProject_final_retentionReleaseAmount());
        stm.setObject(23, third.getProject_final_retentionReleaseDate());
        stm.setObject(24, third.getProject_final_status());
        stm.setObject(25, third.getProject_final_currentStatus());
        stm.setObject(26, third.getProject_id());
                
        return stm.executeUpdate() > 0;

    }

    public boolean deleteThirdProject(int id) throws Exception {

        String sql = "Delete From M_Project where PROJECT_ID=?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, id);
        return stm.executeUpdate() > 0;

    }

    public M_Project_Third searchThirdProject(int id) throws Exception {

        String sql = "Select PROJECT_ID, PROJECTC_FINALBOQ, PROJECTC_FINALEXCEED, PROJECTC_FINALEXTRAWORK, PROJECTC_FINALPRICEESCA, PROJECTC_FINALVAT, PROJECTC_TAKEOVERDATE, PROJECTC_COMPLETEDDATE, PROJECTC_DATEHANDOVER, PROJECTC_TIMEEXTREQPERIOD, PROJECTC_TIMEEXTAPPROVEDPERIOD, PROJECTC_LIQUIDITYDAMAGE, PROJECTC_LIQUIDITYDAMAGEPERIOD, PROJECTC_LIQUIDITYDAMAGEAMOUNT, PROJECTC_COMPLETIONCERT, PROJECTC_RETENTION, PROJECTC_RETENTIONMODE, PROJECTC_RETENTIONAMOUNT, PROJECTC_RETENTIONORGANIZATION, PROJECTC_RETENTIONPERIODFROM, PROJECTC_RETENTIONPERIODTO, PROJECTC_RETENTIONRELEASE, PROJECTC_RETENTIONRELEASEAMOUNT, PROJECTC_RETENTIONRELEASEDATE, PROJECT_STATUS, PROJECT_CURRENT_STATUS FROM M_Project where PROJECT_ID=?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, id);
        ResultSet rst = stm.executeQuery();
        M_Project_Third third = null;
        if (rst.next()) {
            third = new M_Project_Third(rst.getInt(1), rst.getDouble(2), rst.getDouble(3), rst.getDouble(4), rst.getDouble(5), rst.getDouble(6), rst.getDate(7), rst.getDate(8), rst.getDate(9), rst.getString(10), rst.getString(11), rst.getString(12), rst.getString(13), rst.getDouble(14), rst.getString(15), rst.getString(16), rst.getString(17), rst.getDouble(18), rst.getString(19), rst.getDate(20), rst.getDate(21), rst.getString(22), rst.getDouble(23), rst.getDate(24), rst.getString(25), rst.getString(26));
        }
        return third;

    }

    public List<M_Project_Third> getAllThirdProjects() throws Exception {

        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery("Select PROJECT_ID, PROJECTC_FINALBOQ, PROJECTC_FINALEXCEED, PROJECTC_FINALEXTRAWORK, PROJECTC_FINALPRICEESCA, PROJECTC_FINALVAT, PROJECTC_TAKEOVERDATE, PROJECTC_COMPLETEDDATE, PROJECTC_DATEHANDOVER, PROJECTC_TIMEEXTREQPERIOD, PROJECTC_TIMEEXTAPPROVEDPERIOD, PROJECTC_LIQUIDITYDAMAGE, PROJECTC_LIQUIDITYDAMAGEPERIOD, PROJECTC_LIQUIDITYDAMAGEAMOUNT, PROJECTC_COMPLETIONCERT, PROJECTC_RETENTION, PROJECTC_RETENTIONMODE, PROJECTC_RETENTIONAMOUNT, PROJECTC_RETENTIONORGANIZATION, PROJECTC_RETENTIONPERIODFROM, PROJECTC_RETENTIONPERIODTO, PROJECTC_RETENTIONRELEASE, PROJECTC_RETENTIONRELEASEAMOUNT, PROJECTC_RETENTIONRELEASEDATE, PROJECT_STATUS, PROJECT_CURRENT_STATUS From M_Project");
        List<M_Project_Third> thirds = new ArrayList<>();
        while (rst.next()) {
            M_Project_Third third = new M_Project_Third(rst.getInt(1), rst.getDouble(2), rst.getDouble(3), rst.getDouble(4), rst.getDouble(5), rst.getDouble(6), rst.getDate(7), rst.getDate(8), rst.getDate(9), rst.getString(10), rst.getString(11), rst.getString(12), rst.getString(13), rst.getDouble(14), rst.getString(15), rst.getString(16), rst.getString(17), rst.getDouble(18), rst.getString(19), rst.getDate(20), rst.getDate(21), rst.getString(22), rst.getDouble(23), rst.getDate(24), rst.getString(25), rst.getString(26));
            if (third.getProject_id() != 0) {
                thirds.add(third);
            }
        }
        return thirds;

    }

    public M_Project_Third searchThirdProject(String name) throws Exception {

        String sql = "Select PROJECT_ID, PROJECTC_FINALBOQ, PROJECTC_FINALEXCEED, PROJECTC_FINALEXTRAWORK, PROJECTC_FINALPRICEESCA, PROJECTC_FINALVAT, PROJECTC_TAKEOVERDATE, PROJECTC_COMPLETEDDATE, PROJECTC_DATEHANDOVER, PROJECTC_TIMEEXTREQPERIOD, PROJECTC_TIMEEXTAPPROVEDPERIOD, PROJECTC_LIQUIDITYDAMAGE, PROJECTC_LIQUIDITYDAMAGEPERIOD, PROJECTC_LIQUIDITYDAMAGEAMOUNT, PROJECTC_COMPLETIONCERT, PROJECTC_RETENTION, PROJECTC_RETENTIONMODE, PROJECTC_RETENTIONAMOUNT, PROJECTC_RETENTIONORGANIZATION, PROJECTC_RETENTIONPERIODFROM, PROJECTC_RETENTIONPERIODTO, PROJECTC_RETENTIONRELEASE, PROJECTC_RETENTIONRELEASEAMOUNT, PROJECTC_RETENTIONRELEASEDATE, PROJECT_STATUS, PROJECT_CURRENT_STATUS FROM M_Project where PROJECTA_NAME=?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, name);
        ResultSet rst = stm.executeQuery();
        M_Project_Third third = null;
        if (rst.next()) {
            third = new M_Project_Third(rst.getInt(1), rst.getDouble(2), rst.getDouble(3), rst.getDouble(4), rst.getDouble(5), rst.getDouble(6), rst.getDate(7), rst.getDate(8), rst.getDate(9), rst.getString(10), rst.getString(11), rst.getString(12), rst.getString(13), rst.getDouble(14), rst.getString(15), rst.getString(16), rst.getString(17), rst.getDouble(18), rst.getString(19), rst.getDate(20), rst.getDate(21), rst.getString(22), rst.getDouble(23), rst.getDate(24), rst.getString(25), rst.getString(26));
        }
        return third;

    }
    
}
