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
    
    private final DBAccessFactory dbaf = new DBAccessFactoryImpl();

    public M_MaterialService(){
    }
    
    public boolean addMaterial(M_Material material)throws Exception{
        return dbaf.getMaterialDBAccess().addMaterial(material);
    }
    
    public boolean updateMaterial(M_Material material)throws Exception{
        return dbaf.getMaterialDBAccess().updateMaterial(material);
    }
    
    public boolean deleteMaterial(int id)throws Exception{
        return dbaf.getMaterialDBAccess().deleteEquipment(id);
    }
    
    public M_Material searchMaterial(int id)throws Exception{
        return dbaf.getMaterialDBAccess().searchMaterial(id);
    }
    
    public M_Material searchMaterial(String name)throws Exception{
        return dbaf.getMaterialDBAccess().searchMaterial(name);
    }
    
    public List<M_Material> getAllMaterials()throws Exception{
        return dbaf.getMaterialDBAccess().getAllMaterials();
    }
    
}
