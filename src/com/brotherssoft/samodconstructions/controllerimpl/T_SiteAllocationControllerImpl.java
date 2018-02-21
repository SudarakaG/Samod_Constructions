/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.controllerimpl;

import com.brotherssoft.samodconstructions.controller.T_SiteAllocationController;
import com.brotherssoft.samodconstructions.model.T_SiteAllocation;
import com.brotherssoft.samodconstructions.servicefactory.ServiceFactory;
import com.brotherssoft.samodconstructions.servicefactoryimpl.ServiceFactoryImpl;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

/**
 *
 * @author gksde
 */
public class T_SiteAllocationControllerImpl extends UnicastRemoteObject implements T_SiteAllocationController{
    
    private final ServiceFactory sf;

    public T_SiteAllocationControllerImpl() throws Exception{
        this.sf = new ServiceFactoryImpl();
    }

    @Override
    public boolean addSiteAllocation(T_SiteAllocation siteAllocation) throws Exception {
        return sf.getSiteAllocationService().addSiteAllocation(siteAllocation);
    }

    @Override
    public boolean updateSiteAllocation(T_SiteAllocation siteAllocation) throws Exception {
        return sf.getSiteAllocationService().updateSiteAllocation(siteAllocation);
    }

    @Override
    public boolean deleteSiteAllocation(int sAllocateId) throws Exception {
        return sf.getSiteAllocationService().deleteSiteAllocation(sAllocateId);
    }

    @Override
    public T_SiteAllocation searchSiteAllocation(int sAllocateId) throws Exception {
        return sf.getSiteAllocationService().searchSiteAllocation(sAllocateId);
    }

    @Override
    public T_SiteAllocation searchSiteAllocationByItem(String itemId) throws Exception {
        return sf.getSiteAllocationService().searchSiteAllocationByItem(itemId);
    }

    @Override
    public List<T_SiteAllocation> getSiteAllocations() throws Exception {
        return sf.getSiteAllocationService().getSiteAllocations();
    }

    @Override
    public List<T_SiteAllocation> getSiteAllocationsByItem(String itemId) throws Exception {
        return sf.getSiteAllocationService().getSiteAllocationsByItem(itemId);
    }

    @Override
    public List<T_SiteAllocation> getLastAddedSiteAllocations() throws Exception {
        return sf.getSiteAllocationService().getAllLastAddedSiteAllocations();
    }
    
    
    
}
