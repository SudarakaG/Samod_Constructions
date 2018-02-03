/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.controller;

import com.brotherssoft.samodconstructions.model.M_Equipment;
import java.rmi.Remote;
import java.util.List;

/**
 *
 * @author gksde
 */
public interface M_EquipmentController extends Remote{
    
    public boolean addEquipment(M_Equipment equipment)throws Exception;
    public boolean updateEuipment(M_Equipment equipment)throws Exception;
    public boolean deleteEquipment(int id)throws Exception;
    public M_Equipment searchEquipment(int id)throws Exception;
    public List<M_Equipment> getAllEquipments()throws Exception;
    
    public M_Equipment searEquipment(String name)throws Exception;
    
}
