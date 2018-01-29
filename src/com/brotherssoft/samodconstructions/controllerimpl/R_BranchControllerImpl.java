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
    
    private ServiceFactory sf = new ServiceFactoryImpl();
    
    public R_BranchControllerImpl()throws Exception{
        
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
    
}
