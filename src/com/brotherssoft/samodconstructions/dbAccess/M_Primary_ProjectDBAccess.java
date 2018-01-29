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
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gksde
 */
public class M_Primary_ProjectDBAccess {
    
    public boolean addPrimaryProject(M_Project_Primary primary) throws Exception{
     
            Connection connection = DBConnection.getDBConnection().getConnection();
            String sql = "Insert into m_project values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
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
            return stm.executeUpdate() > 0;
        
    }
    
    public boolean updatePrimaryProject(M_Project_Primary primary) throws Exception {

        String sql = "Update M_Project set PROJECTA_NAME=?, PROJECTA_DESC=?, PROJECTA_ADD1=?, PROJECTA_ADD2=?, PROJECTA_ADD3=?, PROJECTA_ADD4=?, PROJECTA_TYPE=?, PROJECTA_VATADDED=?, PROJECTA_CONBIDNO=?, PROJECTA_CLINTNAME=?, PROJECTA_CLINTADD1=?, PROJECTA_CLINTADD2=?, PROJECTA_CLINTADD3=?, PROJECTA_CLINTADD4=?, PROJECTA_CONTACT1=?, PROJECTA_CONTACT2=?, PROJECTA_INTENTEDDURATION=?, PROJECTA_ICTADSPECI=?, PROJECTA_ICTADGRADE=?, PROJECTA_ENGESTIMATE=?, PROJECTA_TENDERFEE=?, PROJECTA_BIDSECPAYMODE=?, PROJECTA_BIDSECAMOUNT=?, PROJECTA_BIDSECDURATION=?, PROJECTA_BIDSECORGANIZATION=?, PROJECTA_TENDEROPENDATE=?, PROJECTA_TENDEROPENTIME=?, PROJECTA_TENDERRESULT=?, PROJECTA_STATUSACTIVEDATE=?, PROJECTA_STATUSINACTIVEDATE=? where PROJECT_ID=?";
            Connection conn = DBConnection.getDBConnection().getConnection();
            PreparedStatement stm = conn.prepareStatement(sql);
                        
            stm.setObject(1, primary.getProject_primary_name());
            stm.setObject(2, primary.getProject_primary_description());
            stm.setObject(3, primary.getProject_primary_address1());
            stm.setObject(4, primary.getProject_primary_address2());
            stm.setObject(5, primary.getProject_primary_address3());
            stm.setObject(6, primary.getProject_primary_address4());
            stm.setObject(7, primary.getProject_primary_type());
            stm.setObject(8, primary.getProject_primary_vatAdded());
            stm.setObject(9, primary.getProject_primary_contractBidNo());
            stm.setObject(10, primary.getProject_primary_clientName());
            stm.setObject(11, primary.getProject_primary_clientAddress1());
            stm.setObject(12, primary.getProject_primary_clientAddress2());
            stm.setObject(13, primary.getProject_primary_clientAddress3());
            stm.setObject(14, primary.getProject_primary_clientAddress4());
            stm.setObject(15, primary.getProject_primary_clientContact1());
            stm.setObject(16, primary.getProject_primary_clientContact2());
            stm.setObject(17, primary.getProject_primary_intendedDuration());
            stm.setObject(18, primary.getProject_primary_ictadSpeciality_id());
            stm.setObject(19, primary.getProject_primary_ictadGrade_id());
            stm.setObject(20, primary.getProject_primary_engineerEstimate());
            stm.setObject(21, primary.getProject_primary_tenderFee());
            stm.setObject(22, primary.getProject_primary_bidPaymentMode());
            stm.setObject(23, primary.getProject_primary_bidAmount());
            stm.setObject(24, primary.getProject_primary_bidDuration());
            stm.setObject(25, primary.getProject_primary_bidOrganization());
            stm.setObject(26, primary.getProject_primary_tenderOpenDate());
            stm.setObject(27, primary.getProject_primary_tenderOpenTime());
            stm.setObject(28, primary.getProject_primary_tenderResult());
            stm.setObject(29, primary.getProject_primary_statusActiveDate());
            stm.setObject(30, primary.getProject_primary_statusInactiveDate());
            stm.setObject(31, primary.getProject_id());
            return stm.executeUpdate() > 0;
        
    }

    public boolean deletePrimaryProject(int id) throws Exception{
        
            String sql = "Delete From M_Project where PROJECT_ID=?";
            Connection conn = DBConnection.getDBConnection().getConnection();
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setObject(1, id);
            return stm.executeUpdate() > 0;
        
    }

    public M_Project_Primary searchPrimaryProject(int id) throws Exception {
        
            String sql = "Select PROJECTA_NAME, PROJECTA_DESC, PROJECTA_ADD1, PROJECTA_ADD2, PROJECTA_ADD3, PROJECTA_ADD4, PROJECTA_TYPE, PROJECTA_VATADDED, PROJECTA_CONBIDNO, PROJECTA_CLINTNAME, PROJECTA_CLINTADD1, PROJECTA_CLINTADD2, PROJECTA_CLINTADD3, PROJECTA_CLINTADD4, PROJECTA_CONTACT1, PROJECTA_CONTACT2, PROJECTA_INTENTEDDURATION, PROJECTA_ICTADSPECI, PROJECTA_ICTADGRADE, PROJECTA_ENGESTIMATE, PROJECTA_TENDERFEE, PROJECTA_BIDSECPAYMODE, PROJECTA_BIDSECAMOUNT, PROJECTA_BIDSECDURATION, PROJECTA_BIDSECORGANIZATION, PROJECTA_TENDEROPENDATE, PROJECTA_TENDEROPENTIME, PROJECTA_TENDERRESULT, PROJECTA_STATUSACTIVEDATE, PROJECTA_STATUSINACTIVEDATE From M_Project where PROJECT_ID=?";
            Connection conn = DBConnection.getDBConnection().getConnection();
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setObject(1, id);
            ResultSet rst = stm.executeQuery();
            M_Project_Primary project_Primary = null;
            if (rst.next()) {
                project_Primary = new M_Project_Primary(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5), rst.getString(6), rst.getString(7), rst.getInt(8), rst.getString(9), rst.getString(10), rst.getString(11), rst.getString(12), rst.getString(13), rst.getString(14), rst.getString(15), rst.getString(16), rst.getString(17), rst.getString(18), rst.getInt(19), rst.getInt(20), rst.getDouble(21), rst.getDouble(22), rst.getString(23), rst.getDouble(24), rst.getString(25), rst.getString(26), rst.getDate(27), rst.getTime(28), rst.getString(29), rst.getDate(30), rst.getDate(31));

            }
            return project_Primary;
        
    }

    public List<M_Project_Primary> getAllPrimaryProjects() throws Exception {
       
            Connection conn = DBConnection.getDBConnection().getConnection();
            Statement stm = conn.createStatement();
            ResultSet rst = stm.executeQuery("Select Select PROJECTA_NAME, PROJECTA_DESC, PROJECTA_ADD1, PROJECTA_ADD2, PROJECTA_ADD3, PROJECTA_ADD4, PROJECTA_TYPE, PROJECTA_VATADDED, PROJECTA_CONBIDNO, PROJECTA_CLINTNAME, PROJECTA_CLINTADD1, PROJECTA_CLINTADD2, PROJECTA_CLINTADD3, PROJECTA_CLINTADD4, PROJECTA_CONTACT1, PROJECTA_CONTACT2, PROJECTA_INTENTEDDURATION, PROJECTA_ICTADSPECI, PROJECTA_ICTADGRADE, PROJECTA_ENGESTIMATE, PROJECTA_TENDERFEE, PROJECTA_BIDSECPAYMODE, PROJECTA_BIDSECAMOUNT, PROJECTA_BIDSECDURATION, PROJECTA_BIDSECORGANIZATION, PROJECTA_TENDEROPENDATE, PROJECTA_TENDEROPENTIME, PROJECTA_TENDERRESULT, PROJECTA_STATUSACTIVEDATE, PROJECTA_STATUSINACTIVEDATE From M_Project");
            List<M_Project_Primary> primaryProjectList = new ArrayList<>();
            while (rst.next()) {
                M_Project_Primary project_Primary = new M_Project_Primary(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5), rst.getString(6), rst.getString(7), rst.getInt(8), rst.getString(9), rst.getString(10), rst.getString(11), rst.getString(12), rst.getString(13), rst.getString(14), rst.getString(15), rst.getString(16), rst.getString(17), rst.getString(18), rst.getInt(19), rst.getInt(20), rst.getDouble(21), rst.getDouble(22), rst.getString(23), rst.getDouble(24), rst.getString(25), rst.getString(26), rst.getDate(27), rst.getTime(28), rst.getString(29), rst.getDate(30), rst.getDate(31));
                primaryProjectList.add(project_Primary);
            }
            return primaryProjectList;
        
    }
    
}
