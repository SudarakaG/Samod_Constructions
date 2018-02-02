/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.service;

import com.brotherssoft.samodconstructions.dbAccessFactory.DBAccessFactory;
import com.brotherssoft.samodconstructions.dbAccessFactoryImpl.DBAccessFactoryImpl;
import com.brotherssoft.samodconstructions.model.R_Work;
import java.util.List;

/**
 *
 * @author gksde
 */
public class R_WorkService {
    
    private final DBAccessFactory dbAccessFactory = new DBAccessFactoryImpl();

    public R_WorkService() {
    }
    
    public boolean addWork(R_Work work)throws Exception{
        return dbAccessFactory.getWorkDBAccess().addWork(work);
    }
    
    public boolean updateWork(R_Work work)throws Exception{
        return dbAccessFactory.getWorkDBAccess().updateWork(work);
    }
    
    public boolean deleteWork(int id)throws Exception{
        return dbAccessFactory.getWorkDBAccess().deleteWork(id);
    }
    
    public R_Work searchWork(int id)throws Exception{
        return dbAccessFactory.getWorkDBAccess().searchWork(id);
    }
    
    public List<R_Work> getAllWorks()throws Exception{
        return dbAccessFactory.getWorkDBAccess().getAllWorks();
    }    
    
    public R_Work searchWork(String name)throws Exception{
        return dbAccessFactory.getWorkDBAccess().searchWork(name);
    }
    
}
