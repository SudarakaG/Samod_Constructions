/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.dbAccess;

import com.brotherssoft.samodconstructions.db.DBConnection;
import com.brotherssoft.samodconstructions.model.M_Project_Secondary;
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
public class M_Project_SecondaryDBAccess {

    public boolean updateSecondaryProject(M_Project_Secondary secondary) throws Exception {

        String sql = "Update M_Project set PROJECTB_BOQ=?, PROJECTB_VAT=?, PROJECTB_DURATION=?, PROJECTB_AGREEMENTDATE=?, PROJECTB_CONSULTANT=?, PROJECTB_CONSULTANTADDRESS=?, PROJECTB_CONSULTANTCONTACT=?, PROJECTB_COMMENCEMENTDATE=?, PROJECTB_COMPLETIONDATE=?, PROJECTB_PERFBONDORGANIZATION=?, PROJECTB_PERFBONDAMOUNT=?, PROJECTB_PERFBONDVALIDFROM=?, PROJECTB_PERFBONDVALIDTO=?, PROJECTB_ADVPAYBONDORGANIZATION=?, PROJECTB_ADVPAYBONDAMOUNT=?, PROJECTB_ADVPAYBONDVALIDFROM=?, PROJECTB_ADVPAYBONDVALIDTO=?, PROJECTB_INSURANCECOVER=?, PROJECTB_INSURANCEORGANIZATION=?, PROJECTB_INSURANCEAMOUNT=?, PROJECTB_INSURANCEVALITFROM=?, PROJECTB_INSURANCEVALIDTO=?, PROJECTB_PAYMENTMODE=?, PROJECT_CURRENT_STATUS=? where PROJECT_ID=?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);

        stm.setObject(1, secondary.getProject_secondary_boq());
        stm.setObject(2, secondary.getProject_secondary_vat());
        stm.setObject(3, secondary.getProject_secondary_duration());
        stm.setObject(4, secondary.getProject_secondary_agreementDate());
        stm.setObject(5, secondary.getProject_secondary_consultant());
        stm.setObject(6, secondary.getProject_secondary_consultantAddress());
        stm.setObject(7, secondary.getProject_secondary_consultantContact());
        stm.setObject(8, secondary.getProject_secondary_commencementDate());
        stm.setObject(9, secondary.getProject_secondary_completionDate());
        stm.setObject(10, secondary.getProject_secondary_performanceBondOrganization());
        stm.setObject(11, secondary.getProject_secondary_performanceBondAmount());
        stm.setObject(12, secondary.getProject_secondary_performanceBondValidFrom());
        stm.setObject(13, secondary.getProject_secondary_performanceBondValidTo());
        stm.setObject(14, secondary.getProject_secondary_advancePaymentBondOrganization());
        stm.setObject(15, secondary.getProject_secondary_advancePaymentBondAmount());
        stm.setObject(16, secondary.getProject_secondary_advancePaymentBondValidFrom());
        stm.setObject(17, secondary.getProject_secondary_advancePaymentBondValidTo());
        stm.setObject(18, secondary.getProject_secondary_insuranceCover());
        stm.setObject(19, secondary.getProject_secondary_insuranceCoverOrganization());
        stm.setObject(20, secondary.getProject_secondary_insuranceCoverAmount());
        stm.setObject(21, secondary.getProject_secondary_insuranceValidFrom());
        stm.setObject(22, secondary.getProject_secondary_insuranceValidTo());
        stm.setObject(23, secondary.getProject_secondary_paymentMode());
        stm.setObject(24, secondary.getProject_currentStatus());
        stm.setObject(25, secondary.getProject_id());
                
        return stm.executeUpdate() > 0;

    }

    public boolean deleteSecondaryProject(int id) throws Exception {

        String sql = "Delete From M_Project where PROJECT_ID=?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, id);
        return stm.executeUpdate() > 0;

    }

    public M_Project_Secondary searchSecondaryProject(int id) throws Exception {

        String sql = "Select PROJECT_ID, PROJECTB_BOQ, PROJECTB_VAT, PROJECTB_DURATION, PROJECTB_AGREEMENTDATE, PROJECTB_CONSULTANT, PROJECTB_CONSULTANTADDRESS, PROJECTB_CONSULTANTCONTACT, PROJECTB_COMMENCEMENTDATE, PROJECTB_COMPLETIONDATE, PROJECTB_PERFBONDORGANIZATION, PROJECTB_PERFBONDAMOUNT, PROJECTB_PERFBONDVALIDFROM, PROJECTB_PERFBONDVALIDTO, PROJECTB_ADVPAYBONDORGANIZATION, PROJECTB_ADVPAYBONDAMOUNT, PROJECTB_ADVPAYBONDVALIDFROM, PROJECTB_ADVPAYBONDVALIDTO, PROJECTB_INSURANCECOVER, PROJECTB_INSURANCEORGANIZATION, PROJECTB_INSURANCEAMOUNT, PROJECTB_INSURANCEVALITFROM, PROJECTB_INSURANCEVALIDTO, PROJECTB_PAYMENTMODE, PROJECT_CURRENT_STATUS FROM m_project where PROJECT_ID=?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, id);
        ResultSet rst = stm.executeQuery();
        M_Project_Secondary secondary = null;
        if (rst.next()) {
            secondary = new M_Project_Secondary(rst.getInt(1), rst.getDouble(2), rst.getDouble(3), rst.getString(4), rst.getDate(5), rst.getString(6), rst.getString(7), rst.getString(8), rst.getDate(9), rst.getDate(10), rst.getString(11), rst.getDouble(12), rst.getDate(13), rst.getDate(14), rst.getString(15), rst.getDouble(16), rst.getDate(17), rst.getDate(18), rst.getString(19), rst.getString(20), rst.getDouble(21), rst.getDate(22), rst.getDate(23), rst.getString(24), rst.getString(25));
        }
        return secondary;

    }

    public List<M_Project_Secondary> getAllSecondaryProjects() throws Exception {

        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery("Select PROJECT_ID, PROJECTB_BOQ, PROJECTB_VAT, PROJECTB_DURATION, PROJECTB_AGREEMENTDATE, PROJECTB_CONSULTANT, PROJECTB_CONSULTANTADDRESS, PROJECTB_CONSULTANTCONTACT, PROJECTB_COMMENCEMENTDATE, PROJECTB_COMPLETIONDATE, PROJECTB_PERFBONDORGANIZATION, PROJECTB_PERFBONDAMOUNT, PROJECTB_PERFBONDVALIDFROM, PROJECTB_PERFBONDVALIDTO, PROJECTB_ADVPAYBONDORGANIZATION, PROJECTB_ADVPAYBONDAMOUNT, PROJECTB_ADVPAYBONDVALIDFROM, PROJECTB_ADVPAYBONDVALIDTO, PROJECTB_INSURANCECOVER, PROJECTB_INSURANCEORGANIZATION, PROJECTB_INSURANCEAMOUNT, PROJECTB_INSURANCEVALITFROM, PROJECTB_INSURANCEVALIDTO, PROJECTB_PAYMENTMODE, PROJECT_CURRENT_STATUS FROM m_project");
        List<M_Project_Secondary> secondarys = new ArrayList<>();
        while (rst.next()) {
            M_Project_Secondary secondary = new M_Project_Secondary(rst.getInt(1), rst.getDouble(2), rst.getDouble(3), rst.getString(4), rst.getDate(5), rst.getString(6), rst.getString(7), rst.getString(8), rst.getDate(9), rst.getDate(10), rst.getString(11), rst.getDouble(12), rst.getDate(13), rst.getDate(14), rst.getString(15), rst.getDouble(16), rst.getDate(17), rst.getDate(18), rst.getString(19), rst.getString(20), rst.getDouble(21), rst.getDate(22), rst.getDate(23), rst.getString(24), rst.getString(25));
            if (secondary.getProject_id() != 0) {
                secondarys.add(secondary);
            }
        }
        return secondarys;

    }

    public M_Project_Secondary searchSecondaryProject(String name) throws Exception {

        String sql = "Select PROJECT_ID, PROJECTB_BOQ, PROJECTB_VAT, PROJECTB_DURATION, PROJECTB_AGREEMENTDATE, PROJECTB_CONSULTANT, PROJECTB_CONSULTANTADDRESS, PROJECTB_CONSULTANTCONTACT, PROJECTB_COMMENCEMENTDATE, PROJECTB_COMPLETIONDATE, PROJECTB_PERFBONDORGANIZATION, PROJECTB_PERFBONDAMOUNT, PROJECTB_PERFBONDVALIDFROM, PROJECTB_PERFBONDVALIDTO, PROJECTB_ADVPAYBONDORGANIZATION, PROJECTB_ADVPAYBONDAMOUNT, PROJECTB_ADVPAYBONDVALIDFROM, PROJECTB_ADVPAYBONDVALIDTO, PROJECTB_INSURANCECOVER, PROJECTB_INSURANCEORGANIZATION, PROJECTB_INSURANCEAMOUNT, PROJECTB_INSURANCEVALITFROM, PROJECTB_INSURANCEVALIDTO, PROJECTB_PAYMENTMODE, PROJECT_CURRENT_STATUS FROM m_project where PROJECTA_NAME=?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, name);
        ResultSet rst = stm.executeQuery();
        M_Project_Secondary secondary = null;
        if (rst.next()) {
            secondary = new M_Project_Secondary(rst.getInt(1), rst.getDouble(2), rst.getDouble(3), rst.getString(4), rst.getDate(5), rst.getString(6), rst.getString(7), rst.getString(8), rst.getDate(9), rst.getDate(10), rst.getString(11), rst.getDouble(12), rst.getDate(13), rst.getDate(14), rst.getString(15), rst.getDouble(16), rst.getDate(17), rst.getDate(18), rst.getString(19), rst.getString(20), rst.getDouble(21), rst.getDate(22), rst.getDate(23), rst.getString(24), rst.getString(25));
        }
        return secondary;

    }

}
