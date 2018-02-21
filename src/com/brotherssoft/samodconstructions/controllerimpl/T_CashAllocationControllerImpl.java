/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.controllerimpl;

import com.brotherssoft.samodconstructions.controller.T_CashAllocationController;
import com.brotherssoft.samodconstructions.model.T_CashRequest;
import com.brotherssoft.samodconstructions.servicefactory.ServiceFactory;
import com.brotherssoft.samodconstructions.servicefactoryimpl.ServiceFactoryImpl;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

/**
 *
 * @author gksde
 */
public class T_CashAllocationControllerImpl extends UnicastRemoteObject implements T_CashAllocationController{

    private final ServiceFactory sf;
    
    public T_CashAllocationControllerImpl() throws Exception{
        this.sf = new ServiceFactoryImpl();
    }

    @Override
    public boolean addCashAllocation(T_CashRequest cashRequest) throws Exception {
        return sf.getCashAllocationService().addCashAllocation(cashRequest);
    }

    @Override
    public boolean updateCashAllocation(T_CashRequest cashRequest) throws Exception {
        return sf.getCashAllocationService().updateCashAllocation(cashRequest);
    }

    @Override
    public boolean deleteCashAllocation(int cashReqId) throws Exception {
        return sf.getCashAllocationService().deleteCashAllocation(cashReqId);
    }

    @Override
    public List<T_CashRequest> getAllCashAllocations() throws Exception {
        return sf.getCashAllocationService().getAllCashAllocations();
    }

    @Override
    public T_CashRequest searchCashAllocation(int cashReqId) throws Exception {
        return sf.getCashAllocationService().searchCashAllocation(cashReqId);
    }

    @Override
    public T_CashRequest searchCashAllocationByRequestedEmployee(int empId) throws Exception {
        return sf.getCashAllocationService().searchCashAllocationByRequestedEmployee(empId);
    }

    @Override
    public List<T_CashRequest> getAllCashAllocationsByLetter(int empId) throws Exception {
        return sf.getCashAllocationService().getAllCashAllocationsByLetter(empId);
    }
    
    
    
}
