/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.controller;

import com.brotherssoft.samodconstructions.model.M_Material;
import java.rmi.Remote;
import java.util.List;

/**
 *
 * @author gksde
 */
public interface M_MaterialController extends Remote{
    
    public boolean addMaterial(M_Material material)throws Exception;
    public boolean updateMaterial(M_Material material)throws Exception;
    public boolean deleteMaterial(String id)throws Exception;
    public M_Material searchMaterial(String id)throws Exception;
    public List<M_Material> getAllMaterials()throws Exception;
    
    public M_Material searchMaterialByName(String name)throws Exception;
    public List<M_Material> getAllMaterialsByLetter(String phrase)throws Exception;
    
    public boolean reserveMaterial(String id)throws Exception;
    public boolean releaseMaterial(String id)throws Exception;
    
}
