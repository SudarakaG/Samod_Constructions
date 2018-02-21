/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.service;

import com.brotherssoft.samodconstructions.dbAccessFactory.DBAccessFactory;
import com.brotherssoft.samodconstructions.dbAccessFactoryImpl.DBAccessFactoryImpl;
import com.brotherssoft.samodconstructions.model.R_ProjectGrade;
import java.util.List;

/**
 *
 * @author gksde
 */
public class R_ProjectGradeService {
    
    private final DBAccessFactory dbaf;

    public R_ProjectGradeService() {
        this.dbaf = new DBAccessFactoryImpl();
    }
    
    public R_ProjectGrade searchProjectGrade(int pGradeId)throws Exception{
        return dbaf.getProjectGradeDBAccess().searchProjectGrade(pGradeId);
    }
    
    public List<R_ProjectGrade> getAllProjectGrades()throws Exception{
        return dbaf.getProjectGradeDBAccess().getAllProjectGrades();
    }
    
    public R_ProjectGrade searchProjectGradeByName(String pGradeName)throws Exception{
        return dbaf.getProjectGradeDBAccess().searchProjectGradeByName(pGradeName);
    }
    
}
