/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.dbAccess;

import com.brotherssoft.samodconstructions.db.DBConnection;
import com.brotherssoft.samodconstructions.model.T_CashRequest;
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
public class T_CashAllocationDBAccess {
    public boolean addCashAllocation(T_CashRequest cashRequest) throws Exception{
     
            Connection connection = DBConnection.getDBConnection().getConnection();
            String sql = "Insert into t_cashreqq values(?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setObject(1, cashRequest.getCashRequest_id());
            stm.setObject(2, cashRequest.getCashRequest_date());
            stm.setObject(3, cashRequest.getCashRequest_employeeId());
            stm.setObject(4, cashRequest.getCashRequest_responceId());
            stm.setObject(5, cashRequest.getCashRequest_siteId());
            stm.setObject(6, cashRequest.getCashRequest_purpose());
            stm.setObject(7, cashRequest.getCashRequest_amount());
            stm.setObject(8, cashRequest.getCashRequest_paymentTypeId());
            stm.setObject(9, cashRequest.getCashRequest_chequeNo());
            stm.setObject(10, cashRequest.getCashRequest_chequeDate());
            stm.setObject(11, cashRequest.getCashRequest_status());
            stm.setObject(12, cashRequest.getCashRequest_requestedAmount());
            return stm.executeUpdate() > 0;
        
    }
    
    public boolean updateCashAllocation(T_CashRequest cashRequest) throws Exception {
        String sql = "Update t_cashreqq set CASHREQ_DATE=?, CASHREQ_EMPID=?, CASHREQ_RESP_ID=?, CASHREQ_SITEID=?, CASHREQ_PURPOSE=?, CASHREQ_AMOUNT=?, CASHREQ_PAYTYPEID=?, CASHREQ_CHQNO=?, CASHREQ_CHQDATE=?, CASHREQ_STATUS=?, CASHREQ_REQ_AMOUNT=? where CASHREQ_ID=?";
            Connection conn = DBConnection.getDBConnection().getConnection();
            PreparedStatement stm = conn.prepareStatement(sql);
            
            stm.setObject(1, cashRequest.getCashRequest_date());
            stm.setObject(2, cashRequest.getCashRequest_employeeId());
            stm.setObject(3, cashRequest.getCashRequest_responceId());
            stm.setObject(4, cashRequest.getCashRequest_siteId());
            stm.setObject(5, cashRequest.getCashRequest_purpose());
            stm.setObject(6, cashRequest.getCashRequest_amount());
            stm.setObject(7, cashRequest.getCashRequest_paymentTypeId());
            stm.setObject(8, cashRequest.getCashRequest_chequeNo());
            stm.setObject(9, cashRequest.getCashRequest_chequeDate());
            stm.setObject(10, cashRequest.getCashRequest_status());
            stm.setObject(11, cashRequest.getCashRequest_requestedAmount());
            stm.setObject(12, cashRequest.getCashRequest_id());
            return stm.executeUpdate() > 0;
        
    }

    public boolean deleteCashAllocation(int id) throws Exception{
        
            String sql = "Delete From t_cashreqq where CASHREQ_ID=?";
            Connection conn = DBConnection.getDBConnection().getConnection();
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setObject(1, id);
            return stm.executeUpdate() > 0;
        
    }

    public T_CashRequest searchCashAllocation(int id) throws Exception {
        
            String sql = "Select * From t_cashreqq where CASHREQ_ID=?";
            Connection conn = DBConnection.getDBConnection().getConnection();
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setObject(1, id);
            ResultSet rst = stm.executeQuery();
            T_CashRequest cashRequest = null;
            if (rst.next()) {
               cashRequest = new T_CashRequest(rst.getInt(1), rst.getDate(2), rst.getInt(3), rst.getInt(4), rst.getInt(5), rst.getString(6), rst.getDouble(7), rst.getInt(8), rst.getString(9), rst.getDate(10), rst.getInt(11), rst.getDouble(12));

            }
            return cashRequest;
        
    }

    public List<T_CashRequest> getAllCashAllocations() throws Exception {
       
            Connection conn = DBConnection.getDBConnection().getConnection();
            Statement stm = conn.createStatement();
            ResultSet rst = stm.executeQuery("Select * From t_cashreqq");
            List<T_CashRequest> cashRequests = new ArrayList<>();
            while (rst.next()) {
                T_CashRequest cashRequest = new T_CashRequest(rst.getInt(1), rst.getDate(2), rst.getInt(3), rst.getInt(4), rst.getInt(5), rst.getString(6), rst.getDouble(7), rst.getInt(8), rst.getString(9), rst.getDate(10), rst.getInt(11), rst.getDouble(12));
                cashRequests.add(cashRequest);
            }
            return cashRequests;
        
    }
    
    public T_CashRequest searchCashAllocationByEmployee(int empId) throws Exception {
        
            String sql = "Select * From t_cashreqq where CASHREQ_EMPID=?";
            Connection conn = DBConnection.getDBConnection().getConnection();
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setObject(1, empId);
            ResultSet rst = stm.executeQuery();
            T_CashRequest cashRequest = null;
            if (rst.next()) {
               cashRequest = new T_CashRequest(rst.getInt(1), rst.getDate(2), rst.getInt(3), rst.getInt(4), rst.getInt(5), rst.getString(6), rst.getDouble(7), rst.getInt(8), rst.getString(9), rst.getDate(10), rst.getInt(11), rst.getDouble(12));

            }
            return cashRequest;
        
    }
    
    public List<T_CashRequest> getAllCashAllocationsByLetter(int empId) throws Exception {
       
            Connection conn = DBConnection.getDBConnection().getConnection();
            Statement stm = conn.createStatement();
            ResultSet rst = stm.executeQuery("Select * From t_cashreqq WHERE CASHREQ_EMPID = '"+empId+"'");
            List<T_CashRequest> cashRequests = new ArrayList<>();
            while (rst.next()) {
                T_CashRequest cashRequest = new T_CashRequest(rst.getInt(1), rst.getDate(2), rst.getInt(3), rst.getInt(4), rst.getInt(5), rst.getString(6), rst.getDouble(7), rst.getInt(8), rst.getString(9), rst.getDate(10), rst.getInt(11), rst.getDouble(12));
                cashRequests.add(cashRequest);
            }
            return cashRequests;
        
    }
}
