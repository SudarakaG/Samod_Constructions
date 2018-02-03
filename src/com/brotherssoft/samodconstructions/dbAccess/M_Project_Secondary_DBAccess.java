/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.dbAccess;

import com.brotherssoft.samodconstructions.db.DBConnection;
import com.brotherssoft.samodconstructions.model.M_Project_Primary;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author Akvasoft
 */
public class M_Project_Secondary_DBAccess {
     public boolean addPrimaryProject(M_Project_Primary primary) throws Exception{
     
            Connection connection = DBConnection.getDBConnection().getConnection();
            String sql = "Insert into m_project values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setObject(1, primary.getProject_id());
            stm.setObject(2, primary.getProject_primary_name());
            stm.setObject(3, primary.getProject_primary_description());
            stm.setObject(4, primary.getProject_primary_address1());
            stm.setObject(5, primary.getProject_primary_address2());
            stm.setObject(6, primary.getProject_primary_address3());
            stm.setObject(7, primary.getProject_primary_address4());
            stm.setObject(8, primary.getProject_primary_type());
            stm.setObject(9, primary.getProject_primary_vatAdded());
            stm.setObject(10, primary.getProject_primary_contractBidNo());
            stm.setObject(11, primary.getProject_primary_clientName());
            stm.setObject(12, primary.getProject_primary_clientAddress1());
            stm.setObject(13, primary.getProject_primary_clientAddress2());
            stm.setObject(14, primary.getProject_primary_clientAddress3());
            stm.setObject(15, primary.getProject_primary_clientAddress4());
            stm.setObject(16, primary.getProject_primary_clientContact1());
            stm.setObject(17, primary.getProject_primary_clientContact2());
            stm.setObject(18, primary.getProject_primary_intendedDuration());
            stm.setObject(19, primary.getProject_primary_ictadSpeciality_id());
            stm.setObject(20, primary.getProject_primary_ictadGrade_id());
            stm.setObject(21, primary.getProject_primary_engineerEstimate());
            stm.setObject(22, primary.getProject_primary_tenderFee());
            stm.setObject(23, primary.getProject_primary_bidPaymentMode());
            stm.setObject(24, primary.getProject_primary_bidAmount());
            stm.setObject(25, primary.getProject_primary_bidDuration());
            stm.setObject(26, primary.getProject_primary_bidOrganization());
            stm.setObject(27, primary.getProject_primary_tenderOpenDate());
            stm.setObject(28, primary.getProject_primary_tenderOpenTime());
            stm.setObject(29, primary.getProject_primary_tenderResult());
            stm.setObject(30, primary.getProject_primary_statusActiveDate());
            stm.setObject(31, primary.getProject_primary_statusInactiveDate());
            stm.setObject(32, null);
            stm.setObject(33, null);
            stm.setObject(34, null);
            stm.setObject(35, null);
            stm.setObject(36, null);
            stm.setObject(37, null);
            stm.setObject(38, null);
            stm.setObject(39, null);
            stm.setObject(40, null);
            stm.setObject(41, null);
            stm.setObject(42, null);
            stm.setObject(43, null);
            stm.setObject(44, null);
            stm.setObject(45, null);
            stm.setObject(46, null);
            stm.setObject(47, null);
            stm.setObject(48, null);
            stm.setObject(49, null);
            stm.setObject(50, null);
            stm.setObject(51, null);
            stm.setObject(52, null);
            stm.setObject(53, null);
            stm.setObject(54, null);
            stm.setObject(55, null);
            stm.setObject(56, null);
            stm.setObject(57, null);
            stm.setObject(58, null);
            stm.setObject(59, null);
            stm.setObject(60, null);
            stm.setObject(61, null);
            stm.setObject(62, null);
            stm.setObject(63, null);
            stm.setObject(64, null);
            stm.setObject(65, null);
            stm.setObject(66, null);
            stm.setObject(67, null);
            stm.setObject(68, null);
            stm.setObject(69, null);
            stm.setObject(70, null);
            stm.setObject(71, null);
            stm.setObject(72, null);
            stm.setObject(73, null);
            stm.setObject(74, null);
            stm.setObject(75, null);
            stm.setObject(76, null);
            stm.setObject(77, null);
            stm.setObject(78, null);
            stm.setObject(79, primary.getProject_current_status());
            return stm.executeUpdate() > 0;
        
    }
    
}
