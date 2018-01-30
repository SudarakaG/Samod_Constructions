/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.controllerimpl;

import com.brotherssoft.samodconstructions.controller.R_ProjectGradeController;
import com.brotherssoft.samodconstructions.model.R_ProjectGrade;
import com.brotherssoft.samodconstructions.servicefactory.ServiceFactory;
import com.brotherssoft.samodconstructions.servicefactoryimpl.ServiceFactoryImpl;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

/**
 *
 * @author gksde
 */
public class R_ProjectGradeControllerImpl extends UnicastRemoteObject implements R_ProjectGradeController{
    
    private ServiceFactory sf = new ServiceFactoryImpl();
    
    public R_ProjectGradeControllerImpl()throws Exception{
        
    }

    @Override
    public R_ProjectGrade searchProjectGrade(int pGradeId) throws Exception {
        return sf.getProjectGradeService().searchProjectGrade(pGradeId);
    }

    @Override
    public List<R_ProjectGrade> getAllProjectGrades() throws Exception {
        return sf.getProjectGradeService().getAllProjectGrades();
    }

    @Override
    public R_ProjectGrade searProjectGradeByNAme(String pGradeName) throws Exception {
        return sf.getProjectGradeService().searchProjectGradeByName(pGradeName);
    }
    
}
