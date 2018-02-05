/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.controller;

import com.brotherssoft.samodconstructions.model.R_Work;
import java.rmi.Remote;
import java.util.List;

/**
 *
 * @author gksde
 */
public interface R_WorkController extends Remote{
    
    public boolean addWork(R_Work work)throws Exception;
    public boolean updateWork(R_Work work)throws Exception;
    public boolean deleteWork(int id)throws Exception;
    public R_Work searchWork(int id)throws Exception;
    public R_Work searchWork(String name)throws Exception;
    public List<R_Work> getAllWorks()throws Exception;
    public List<R_Work> getAllWorksByLetter(String phrase)throws Exception;
    
}
