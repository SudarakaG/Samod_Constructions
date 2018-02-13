/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.service;

import com.brotherssoft.samodconstructions.dbAccessFactory.DBAccessFactory;
import com.brotherssoft.samodconstructions.dbAccessFactoryImpl.DBAccessFactoryImpl;
import com.brotherssoft.samodconstructions.model.T_CashRequest;
import java.util.List;

/**
 *
 * @author gksde
 */
public class T_CashAllocationService {
    
    private final DBAccessFactory dbaf = new DBAccessFactoryImpl();

    public T_CashAllocationService() {
    }
       
    public boolean addCashAllocation(T_CashRequest cashRequest)throws Exception{
        return dbaf.getCashAllocationDBAccess().addCashAllocation(cashRequest);
    }
    public boolean updateCashAllocation(T_CashRequest cashRequest)throws Exception{
        return dbaf.getCashAllocationDBAccess().updateCashAllocation(cashRequest);
    }
    public boolean deleteCashAllocation(int cashReqId)throws Exception{
        return dbaf.getCashAllocationDBAccess().deleteCashAllocation(cashReqId);
    }
    public List<T_CashRequest> getAllCashAllocations()throws Exception{
        return dbaf.getCashAllocationDBAccess().getAllCashAllocations();
    }
    public T_CashRequest searchCashAllocation(int cashReqId)throws Exception{
        return dbaf.getCashAllocationDBAccess().searchCashAllocation(cashReqId);
    }
    public T_CashRequest searchCashAllocationByRequestedEmployee(int empId)throws Exception{
        return dbaf.getCashAllocationDBAccess().searchCashAllocationByEmployee(empId);
    }
    public List<T_CashRequest> getAllCashAllocationsByLetter(int empId)throws Exception{
        return dbaf.getCashAllocationDBAccess().getAllCashAllocationsByLetter(empId);
    }
    
}
