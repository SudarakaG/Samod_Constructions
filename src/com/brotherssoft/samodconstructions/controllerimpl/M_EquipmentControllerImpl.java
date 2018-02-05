/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.controllerimpl;

import com.brotherssoft.samodconstructions.controller.M_EquipmentController;
import com.brotherssoft.samodconstructions.model.M_Equipment;
import com.brotherssoft.samodconstructions.servicefactory.ServiceFactory;
import com.brotherssoft.samodconstructions.servicefactoryimpl.ServiceFactoryImpl;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

/**
 *
 * @author gksde
 */
public class M_EquipmentControllerImpl extends UnicastRemoteObject implements M_EquipmentController{

    private final ServiceFactory sf = new ServiceFactoryImpl();
    
    public M_EquipmentControllerImpl() throws Exception{
    }

    @Override
    public boolean addEquipment(M_Equipment equipment) throws Exception {
        return sf.getEquipmentService().addEquipment(equipment);
    }

    @Override
    public boolean updateEuipment(M_Equipment equipment) throws Exception {
        return sf.getEquipmentService().updateEquipment(equipment);
    }

    @Override
    public boolean deleteEquipment(int id) throws Exception {
        return sf.getEquipmentService().deleteEquipment(id);
    }

    @Override
    public M_Equipment searchEquipment(int id) throws Exception {
        return sf.getEquipmentService().searchEquipment(id);
    }

    @Override
    public List<M_Equipment> getAllEquipments() throws Exception {
        return sf.getEquipmentService().getAllEquipments();
    }

    @Override
    public M_Equipment searEquipment(String name) throws Exception {
        return sf.getEquipmentService().searchEquipment(name);
    }

    @Override
    public List<M_Equipment> getAllEquipmentsByLetter(String phrase) throws Exception {
        return sf.getEquipmentService().getAllEquipmentsByLetter(phrase);
    }
    
    
    
}
