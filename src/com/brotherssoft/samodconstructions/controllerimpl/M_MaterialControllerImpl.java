/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.controllerimpl;

import com.brotherssoft.samodconstructions.controller.M_MaterialController;
import com.brotherssoft.samodconstructions.model.M_Material;
import com.brotherssoft.samodconstructions.servicefactory.ServiceFactory;
import com.brotherssoft.samodconstructions.servicefactoryimpl.ServiceFactoryImpl;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

/**
 *
 * @author gksde
 */
public class M_MaterialControllerImpl extends UnicastRemoteObject implements M_MaterialController{

    private final ServiceFactory sf = new ServiceFactoryImpl();
    
    public M_MaterialControllerImpl() throws Exception{
    }

    @Override
    public boolean addMaterial(M_Material material) throws Exception {
        return sf.getMaterialService().addMaterial(material);
    }

    @Override
    public boolean updateMaterial(M_Material material) throws Exception {
        return sf.getMaterialService().updateMaterial(material);
    }

    @Override
    public boolean deleteMaterial(String id) throws Exception {
        return sf.getMaterialService().deleteMaterial(id);
    }

    @Override
    public M_Material searchMaterial(String id) throws Exception {
        return sf.getMaterialService().searchMaterial(id);
    }

    @Override
    public List<M_Material> getAllMaterials() throws Exception {
        return sf.getMaterialService().getAllMaterials();
    }

    @Override
    public M_Material searchMaterialByName(String name) throws Exception {
        return sf.getMaterialService().searchMaterialByName(name);
    }

    @Override
    public List<M_Material> getAllMaterialsByLetter(String phrase) throws Exception {
        return sf.getMaterialService().getAllMaterialsByLetter(phrase);
    }
    
    
}
