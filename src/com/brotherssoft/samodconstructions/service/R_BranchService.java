/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.service;

import com.brotherssoft.samodconstructions.dbAccessFactory.DBAccessFactory;
import com.brotherssoft.samodconstructions.dbAccessFactoryImpl.DBAccessFactoryImpl;
import com.brotherssoft.samodconstructions.model.R_Bank;
import com.brotherssoft.samodconstructions.model.R_Branch;
import java.util.List;

/**
 *
 * @author gksde
 */
public class R_BranchService {
    
    private final DBAccessFactory dbAccessFactory = new DBAccessFactoryImpl();

    public R_BranchService() {
    }

    
    
    public boolean addBranch(R_Branch branch)throws Exception{
        return dbAccessFactory.getBranchDBAccess().addBranch(branch);
    }
    
    public boolean updateBranch(R_Branch branch)throws Exception{
        return dbAccessFactory.getBranchDBAccess().updateBranch(branch);
    }
    
    public boolean deleteBranch(int id)throws Exception{
        return dbAccessFactory.getBranchDBAccess().deleteBranch(id);
    }
    
    public R_Branch searchBranch(int id)throws Exception{
        return dbAccessFactory.getBranchDBAccess().searchBranch(id);
    }
    
    public List<R_Branch> getAllBranches()throws Exception{
        return dbAccessFactory.getBranchDBAccess().getAllBranches();
    }    
    
    public R_Branch searchBranchByCode(String code)throws Exception{
        return dbAccessFactory.getBranchDBAccess().searchBranchByCode(code);
    }
    
    public R_Branch searBranch(String branchName, int bankId)throws Exception{
        return dbAccessFactory.getBranchDBAccess().searchBranch(branchName, bankId);
    }
    
    public List<R_Branch> getAllBranchesByLetter(String phrase)throws Exception{
        return dbAccessFactory.getBranchDBAccess().getAllBranchesNyLetter(phrase);
    }
    
}
