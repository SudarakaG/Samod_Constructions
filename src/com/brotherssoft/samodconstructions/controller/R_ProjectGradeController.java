/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.controller;

import com.brotherssoft.samodconstructions.model.R_ProjectGrade;
import java.rmi.Remote;
import java.util.List;

/**
 *
 * @author gksde
 */
public interface R_ProjectGradeController extends Remote{
    
    public R_ProjectGrade searchProjectGrade(int pGradeId)throws Exception;
    public List<R_ProjectGrade> getAllProjectGrades()throws Exception;
    public R_ProjectGrade searProjectGradeByNAme(String pGradeName)throws Exception;
    
}
