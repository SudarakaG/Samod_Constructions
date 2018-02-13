/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.controller;

import com.brotherssoft.samodconstructions.model.T_CashRequest;
import java.rmi.Remote;
import java.util.List;

/**
 *
 * @author gksde
 */
public interface T_CashAllocationController extends Remote{
    
    public boolean addCashAllocation(T_CashRequest cashRequest)throws Exception;
    public boolean updateCashAllocation(T_CashRequest cashRequest)throws Exception;
    public boolean deleteCashAllocation(int cashReqId)throws Exception;
    public List<T_CashRequest> getAllCashAllocations()throws Exception;
    public T_CashRequest searchCashAllocation(int cashReqId)throws Exception;
    public T_CashRequest searchCashAllocationByRequestedEmployee(int empId)throws Exception;
    public List<T_CashRequest> getAllCashAllocationsByLetter(int empId)throws Exception;
    
}
