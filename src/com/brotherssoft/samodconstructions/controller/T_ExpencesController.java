/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.controller;

import com.brotherssoft.samodconstructions.model.T_Expences;
import java.rmi.Remote;
import java.util.Date;
import java.util.List;

/**
 *
 * @author gksde
 */
public interface T_ExpencesController extends Remote{
    
    public boolean addExpence(T_Expences expences)throws Exception;
    public boolean updateExpence(T_Expences expences)throws Exception;
    public boolean deleteExpence(int id)throws Exception;
    public T_Expences searchExpence(int id)throws Exception;
    public List<T_Expences> getAllExpences()throws Exception;
    public List<T_Expences> getExpencesByLetter(String phrase)throws Exception;
    public T_Expences searchExpence(Date date, int project, double amount)throws Exception;
    
    public boolean reserveExpence(int id)throws Exception;
    public boolean releaseExpence(int id)throws Exception;
    
}
