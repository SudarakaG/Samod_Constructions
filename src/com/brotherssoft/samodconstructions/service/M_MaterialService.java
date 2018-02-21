/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.service;

import com.brotherssoft.samodconstructions.dbAccessFactory.DBAccessFactory;
import com.brotherssoft.samodconstructions.dbAccessFactoryImpl.DBAccessFactoryImpl;
import com.brotherssoft.samodconstructions.model.M_Material;
import java.util.List;

/**
 *
 * @author gksde
 */
public class M_MaterialService {
    
    private final DBAccessFactory dbaf;

    public M_MaterialService(){
        this.dbaf = new DBAccessFactoryImpl();
    }
    
    public boolean addMaterial(M_Material material)throws Exception{
        return dbaf.getMaterialDBAccess().addMaterial(material);
    }
    
    public boolean updateMaterial(M_Material material)throws Exception{
        return dbaf.getMaterialDBAccess().updateMaterial(material);
    }
    
    public boolean deleteMaterial(String id)throws Exception{
        return dbaf.getMaterialDBAccess().deleteEquipment(id);
    }
    
    public M_Material searchMaterial(String id)throws Exception{
        return dbaf.getMaterialDBAccess().searchMaterial(id);
    }
    
    public M_Material searchMaterialByName(String name)throws Exception{
        return dbaf.getMaterialDBAccess().searchMaterialByName(name);
    }
    
    public List<M_Material> getAllMaterials()throws Exception{
        return dbaf.getMaterialDBAccess().getAllMaterials();
    }
    
    public List<M_Material> getAllMaterialsByLetter(String phrase)throws Exception{
        return dbaf.getMaterialDBAccess().getAllMaterialsByLetter(phrase);
    }
    
}
