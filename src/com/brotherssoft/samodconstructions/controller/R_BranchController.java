/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.controller;

import com.brotherssoft.samodconstructions.model.R_Branch;
import java.rmi.Remote;
import java.util.List;

/**
 *
 * @author gksde
 */
public interface R_BranchController extends Remote{
    
    public boolean addBranch(R_Branch branch)throws Exception;
    public boolean updateBranch(R_Branch branch)throws Exception;
    public boolean deleteBranch(int branchId)throws Exception;
    public R_Branch searchBranch(int branchId)throws Exception;
    public List<R_Branch> getAllBranches()throws Exception;
    
    public R_Branch searchBranchByCode(String branchCode)throws Exception;
    public R_Branch searchBranch(String branchName, int bankId)throws Exception;
    public List<R_Branch> getAllBranchesByLetter(String phrase)throws Exception;
    
}
