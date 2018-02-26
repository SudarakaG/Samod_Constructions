/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.service;

import com.brotherssoft.samodconstructions.dbAccessFactory.DBAccessFactory;
import com.brotherssoft.samodconstructions.dbAccessFactoryImpl.DBAccessFactoryImpl;
import com.brotherssoft.samodconstructions.model.T_Expences;
import com.brotherssoft.samodconstructions.reservation.T_ExpenceReserver;
import java.util.Date;
import java.util.List;

/**
 *
 * @author gksde
 */
public class T_ExpenceService {
    
    private final DBAccessFactory dbaf;    

    public T_ExpenceService() {
        this.dbaf = new DBAccessFactoryImpl();
    }    
    
    public boolean addExpence(T_Expences expences)throws Exception{
        return dbaf.getExpencesDBAccess().addExpence(expences);
    }
    
    public boolean updateExpence(T_Expences expences)throws Exception{
        return dbaf.getExpencesDBAccess().updateExpence(expences);
    }
    
    public boolean deleteExpence(int id)throws Exception{
        return dbaf.getExpencesDBAccess().deleteExpence(id);
    }
    
    public T_Expences searchExpence(int id)throws Exception{
        return dbaf.getExpencesDBAccess().searchExpence(id);
    }
    
    public List<T_Expences> getAllExpences()throws Exception{
        return dbaf.getExpencesDBAccess().getAllExpences();
    }
    
    public List<T_Expences> getExpencesByLetter(String phrase)throws Exception{
        return dbaf.getExpencesDBAccess().getAllExpencesByLetter(phrase);
    }
    
    public T_Expences searchExpence(Date date, int project, double amount)throws Exception{
        return dbaf.getExpencesDBAccess().searchExpence(date, project, amount);
    }   
    
}
