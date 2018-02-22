/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.controller;

import com.brotherssoft.samodconstructions.model.T_SiteAllocation;
import java.rmi.Remote;
import java.util.List;

/**
 *
 * @author gksde
 */
public interface T_SiteAllocationController extends Remote{
    public boolean addSiteAllocation(T_SiteAllocation siteAllocation)throws Exception;
    public boolean updateSiteAllocation(T_SiteAllocation siteAllocation)throws Exception;
    public boolean deleteSiteAllocation(int sAllocateId)throws Exception;
    public T_SiteAllocation searchSiteAllocation(int sAllocateId)throws Exception;
    public T_SiteAllocation searchSiteAllocationByItem(String itemId)throws Exception;
    public List<T_SiteAllocation> getSiteAllocations()throws Exception;
    public List<T_SiteAllocation> getSiteAllocationsByItem(String itemId)throws Exception;
    public List<T_SiteAllocation> getLastAddedSiteAllocations()throws Exception;
    
    public boolean reserveSiteAllocation(int id)throws Exception;
    public boolean releaseSiteAllocation(int id)throws Exception;
    
}
