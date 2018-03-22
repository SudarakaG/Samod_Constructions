/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.controllerimpl;

import com.brotherssoft.samodconstructions.controller.T_IncomeController;
import com.brotherssoft.samodconstructions.model.T_Income;
import com.brotherssoft.samodconstructions.reservation.T_IncomeReserver;
import com.brotherssoft.samodconstructions.servicefactory.ServiceFactory;
import com.brotherssoft.samodconstructions.servicefactoryimpl.ServiceFactoryImpl;
import java.rmi.server.UnicastRemoteObject;
import java.util.Date;
import java.util.List;

/**
 *
 * @author gksde
 */
public class T_IncomeControllerImpl extends UnicastRemoteObject implements T_IncomeController{

    private final ServiceFactory sf;
    private static final T_IncomeReserver INCOME_RESERVER = new T_IncomeReserver();
    
    public T_IncomeControllerImpl() throws Exception{
        this.sf = new ServiceFactoryImpl();
    }

    @Override
    public boolean addIncome(T_Income income) throws Exception {
        return sf.getIncomeService().addIncome(income);
    }

    @Override
    public boolean updateIncome(T_Income income) throws Exception {
        return sf.getIncomeService().updateIncome(income);
    }

    @Override
    public boolean deleteIncome(int id) throws Exception {
        return sf.getIncomeService().deleteIncome(id);
    }

    @Override
    public T_Income searchIncome(int id) throws Exception {
        return sf.getIncomeService().searchIncome(id);
    }

    @Override
    public List<T_Income> getAllIncomes() throws Exception {
        return  sf.getIncomeService().getAllIncomes();
    }

    @Override
    public List<T_Income> getIncomesByLetter(String phrase) throws Exception {
        return sf.getIncomeService().getIncomesByLetter(phrase);
    }

    @Override
    public T_Income searchIncome(Date date, int project, double amount) throws Exception {
        return sf.getIncomeService().searchIncome(date, project, amount);
    }

    @Override
    public boolean reserveIncome(int id) throws Exception {
        return INCOME_RESERVER.reserveIncome(id, this);
    }

    @Override
    public boolean releaseIncome(int id) throws Exception {
        return INCOME_RESERVER.releaseIncome(id, this);
    }

    @Override
    public T_Income searchIncome(Date date, int inType, int inSubType, int project, double amount) throws Exception {
        return sf.getIncomeService().searchIncome(date, inType, inSubType, project, amount);
    }
    
}
