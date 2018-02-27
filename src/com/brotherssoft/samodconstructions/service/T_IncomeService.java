/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.service;

import com.brotherssoft.samodconstructions.dbAccessFactory.DBAccessFactory;
import com.brotherssoft.samodconstructions.dbAccessFactoryImpl.DBAccessFactoryImpl;
import com.brotherssoft.samodconstructions.model.T_Income;
import java.util.Date;
import java.util.List;

/**
 *
 * @author gksde
 */
public class T_IncomeService {

    private final DBAccessFactory dbaf;
    
    public T_IncomeService() {
        this.dbaf = new DBAccessFactoryImpl();
    }
    
    public boolean addIncome(T_Income income)throws Exception{
        return dbaf.getIncomeDBAccess().addIncome(income);
    }
    
    public boolean updateIncome(T_Income income)throws Exception{
        return dbaf.getIncomeDBAccess().updateIncome(income);
    }
    
    public boolean deleteIncome(int id)throws Exception{
        return dbaf.getIncomeDBAccess().deleteIncome(id);
    }
    
    public T_Income searchIncome(int id)throws Exception{
        return dbaf.getIncomeDBAccess().searchIncome(id);
    }
    
    public List<T_Income> getAllIncomes()throws Exception{
        return dbaf.getIncomeDBAccess().getAllIncomes();
    }
    
    public List<T_Income> getIncomesByLetter(String phrase)throws Exception{
        return dbaf.getIncomeDBAccess().getAllIncomesByLetter(phrase);
    }
    
    public T_Income searchIncome(Date date, int project, double amount)throws Exception{
        return dbaf.getIncomeDBAccess().searchIncome(date, project, amount);
    }
    
}
