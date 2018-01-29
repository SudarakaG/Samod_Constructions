/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.dbAccess;

import com.brotherssoft.samodconstructions.db.DBConnection;
import com.brotherssoft.samodconstructions.model.R_Branch;
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
public class R_BranchDBAccess {
    
    public boolean addBranch(R_Branch branch) throws Exception{
     
            Connection connection = DBConnection.getDBConnection().getConnection();
            String sql = "Insert into R_Branch values(?,?,?,?,?,?,?)";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setObject(1, branch.getBranch_id());
            stm.setObject(2, branch.getBranch_bank_id());
            stm.setObject(3, branch.getBranch_name());
            stm.setObject(4, branch.getBranch_code());
            stm.setObject(5, branch.getBranch_description());
            stm.setObject(6, branch.getBranch_address());
            stm.setObject(7, branch.getBranch_status());
            return stm.executeUpdate() > 0;
        
    }
    
    public boolean updateBranch(R_Branch branch) throws Exception {
        String sql = "Update R_Branch set BRANCH_BANKID=?,BRANCH_NAME=?,BRANCH_CODE=?, BRANCH_DESC=?, BRANCH_ADDRESS=?, BRANCH_STATUS=? where BRANCH_ID=?";
            Connection conn = DBConnection.getDBConnection().getConnection();
            PreparedStatement stm = conn.prepareStatement(sql);
            
            stm.setObject(1, branch.getBranch_bank_id());
            stm.setObject(2, branch.getBranch_name());
            stm.setObject(3, branch.getBranch_code());
            stm.setObject(4, branch.getBranch_description());
            stm.setObject(5, branch.getBranch_address());
            stm.setObject(6, branch.getBranch_status());
            stm.setObject(7, branch.getBranch_id());
            return stm.executeUpdate() > 0;
        
    }

    public boolean deleteBranch(int id) throws Exception{
        
            String sql = "Delete From R_Branch where BRANCH_ID=?";
            Connection conn = DBConnection.getDBConnection().getConnection();
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setObject(1, id);
            return stm.executeUpdate() > 0;
        
    }

    public R_Branch searchBranch(int id) throws Exception {
        
            String sql = "Select * From R_Branch where BRANCH_ID=?";
            Connection conn = DBConnection.getDBConnection().getConnection();
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setObject(1, id);
            ResultSet rst = stm.executeQuery();
            R_Branch branch = null;
            if (rst.next()) {
                branch = new R_Branch(rst.getInt(1), rst.getInt(2), rst.getString(3), rst.getString(4), rst.getString(5), rst.getString(6), rst.getInt(7));

            }
            return branch;
        
    }

    public List<R_Branch> getAllBranches() throws Exception {
       
            Connection conn = DBConnection.getDBConnection().getConnection();
            Statement stm = conn.createStatement();
            ResultSet rst = stm.executeQuery("Select * From R_Branch");
            List<R_Branch> branchList = new ArrayList<>();
            while (rst.next()) {
                R_Branch branch = new R_Branch(rst.getInt(1), rst.getInt(2), rst.getString(3), rst.getString(4), rst.getString(5), rst.getString(6), rst.getInt(7));
                branchList.add(branch);
            }
            return branchList;
        
    }
    
    public R_Branch searchBranchByCode(String code) throws Exception {
        
            String sql = "Select * From R_Branch where BRANCH_CODE=?";
            Connection conn = DBConnection.getDBConnection().getConnection();
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setObject(1, code);
            ResultSet rst = stm.executeQuery();
            R_Branch branch = null;
            if (rst.next()) {
                branch = new R_Branch(rst.getInt(1), rst.getInt(2), rst.getString(3), rst.getString(4), rst.getString(5), rst.getString(6), rst.getInt(7));

            }
            return branch;
        
    }
    
}
