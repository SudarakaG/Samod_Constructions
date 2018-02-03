/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.service;

import com.brotherssoft.samodconstructions.dbAccessFactory.DBAccessFactory;
import com.brotherssoft.samodconstructions.dbAccessFactoryImpl.DBAccessFactoryImpl;
import com.brotherssoft.samodconstructions.model.M_Equipment;
import java.util.List;

/**
 *
 * @author gksde
 */
public class M_EquipmentService {

    private final DBAccessFactory dbaf = new DBAccessFactoryImpl();
    
    public M_EquipmentService() {
    }
    
    public boolean addEquipment(M_Equipment equipment)throws Exception{
        return dbaf.getEquipmentDBAccess().addEquipment(equipment);
    }
    
    public boolean updateEquipment(M_Equipment equipment)throws Exception{
        return dbaf.getEquipmentDBAccess().updateEquipment(equipment);
    }
    
    public boolean deleteEquipment(int id)throws Exception{
        return dbaf.getEquipmentDBAccess().deleteEquipment(id);
    }
    
    public M_Equipment searchEquipment(int id)throws Exception{
        return dbaf.getEquipmentDBAccess().searchEquipment(id);
    }
    
    public M_Equipment searchEquipment(String name)throws Exception{
        return dbaf.getEquipmentDBAccess().searchEquipment(name);
    }
    
    public List<M_Equipment> getAllEquipments()throws Exception{
        return dbaf.getEquipmentDBAccess().getAllEquipments();
    }
    
}
