/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.controller;

import com.brotherssoft.samodconstructions.model.T_Income;
import java.rmi.Remote;
import java.util.Date;
import java.util.List;

/**
 *
 * @author gksde
 */
public interface T_IncomeController extends Remote{
    
    public boolean addIncome(T_Income income)throws Exception;
    public boolean updateIncome(T_Income income)throws Exception;
    public boolean deleteIncome(int id)throws Exception;
    public T_Income searchIncome(int id)throws Exception;
    public List<T_Income> getAllIncomes()throws Exception;
    public List<T_Income> getIncomesByLetter(String phrase)throws Exception;
    public T_Income searchIncome(Date date, int project, double amount)throws Exception;
    
    public boolean reserveIncome(int id)throws Exception;
    public boolean releaseIncome(int id)throws Exception;
    
}
