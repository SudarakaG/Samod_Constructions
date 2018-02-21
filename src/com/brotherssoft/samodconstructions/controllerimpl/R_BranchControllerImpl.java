/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.controllerimpl;

import com.brotherssoft.samodconstructions.controller.R_BranchController;
import com.brotherssoft.samodconstructions.model.R_Branch;
import com.brotherssoft.samodconstructions.servicefactory.ServiceFactory;
import com.brotherssoft.samodconstructions.servicefactoryimpl.ServiceFactoryImpl;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

/**
 *
 * @author gksde
 */
public class R_BranchControllerImpl extends UnicastRemoteObject implements R_BranchController{
    
    private final ServiceFactory sf;
    
    public R_BranchControllerImpl()throws Exception{
        this.sf = new ServiceFactoryImpl();
        
    }

    @Override
    public boolean addBranch(R_Branch branch) throws Exception {
        return sf.getBranchService().addBranch(branch);
    }

    @Override
    public boolean updateBranch(R_Branch branch) throws Exception {
        return sf.getBranchService().updateBranch(branch);
    }

    @Override
    public boolean deleteBranch(int branchId) throws Exception {
        return sf.getBranchService().deleteBranch(branchId);
    }

    @Override
    public R_Branch searchBranch(int branchId) throws Exception {
        return sf.getBranchService().searchBranch(branchId);
    }

    @Override
    public List<R_Branch> getAllBranches() throws Exception {
        return sf.getBranchService().getAllBranches();
    }

    @Override
    public R_Branch searchBranchByCode(String branchCode) throws Exception {
        return sf.getBranchService().searchBranchByCode(branchCode);
    }

    @Override
    public R_Branch searchBranch(String branchName, int bankId) throws Exception {
        return sf.getBranchService().searBranch(branchName, bankId);
    }

    @Override
    public List<R_Branch> getAllBranchesByLetter(String phrase) throws Exception {
        return sf.getBranchService().getAllBranchesByLetter(phrase);
    }
    
}
