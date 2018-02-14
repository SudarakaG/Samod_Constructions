/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.service;

import com.brotherssoft.samodconstructions.dbAccessFactory.DBAccessFactory;
import com.brotherssoft.samodconstructions.dbAccessFactoryImpl.DBAccessFactoryImpl;
import com.brotherssoft.samodconstructions.model.T_SiteAllocation;
import java.util.List;

/**
 *
 * @author gksde
 */
public class T_SiteAllocationService {
    
    private final DBAccessFactory dbaf = new DBAccessFactoryImpl();

    public T_SiteAllocationService() {
    }
    
    public boolean addSiteAllocation(T_SiteAllocation siteAllocation)throws Exception{
        return dbaf.getSiteAllocationDBAccess().addSiteAllocation(siteAllocation);
    }
    public boolean updateSiteAllocation(T_SiteAllocation siteAllocation)throws Exception{
        return dbaf.getSiteAllocationDBAccess().updateSiteAllocation(siteAllocation);
    }
    public boolean deleteSiteAllocation(int sAllocateId)throws Exception{
        return dbaf.getSiteAllocationDBAccess().deleteSiteAllocation(sAllocateId);
    }
    public T_SiteAllocation searchSiteAllocation(int sAllocateId)throws Exception{
        return dbaf.getSiteAllocationDBAccess().searchSiteAllocation(sAllocateId);
    }
    public T_SiteAllocation searchSiteAllocationByItem(String itemId)throws Exception{
        return dbaf.getSiteAllocationDBAccess().searchSiteAllocationByItem(itemId);
    }
    public List<T_SiteAllocation> getSiteAllocations()throws Exception{
        return dbaf.getSiteAllocationDBAccess().getAllSiteAllocations();
    }
    
    public List<T_SiteAllocation> getSiteAllocationsByItem(String itemId)throws Exception{
        return dbaf.getSiteAllocationDBAccess().getAllSiteAllocationsByItem(itemId);
    }
    
    public List<T_SiteAllocation> getAllLastAddedSiteAllocations() throws Exception {
        return dbaf.getSiteAllocationDBAccess().getAllLastAddedSiteAllocations();
    }
    
}
