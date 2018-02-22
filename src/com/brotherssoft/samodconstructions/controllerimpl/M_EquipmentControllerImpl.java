/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.controllerimpl;

import com.brotherssoft.samodconstructions.controller.M_EquipmentController;
import com.brotherssoft.samodconstructions.model.M_Equipment;
import com.brotherssoft.samodconstructions.reservation.M_EquipmentReserver;
import com.brotherssoft.samodconstructions.servicefactory.ServiceFactory;
import com.brotherssoft.samodconstructions.servicefactoryimpl.ServiceFactoryImpl;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

/**
 *
 * @author gksde
 */
public class M_EquipmentControllerImpl extends UnicastRemoteObject implements M_EquipmentController{

    private final ServiceFactory sf;
    private static final M_EquipmentReserver EQUIPMENT_RESERVER = new M_EquipmentReserver();
    
    public M_EquipmentControllerImpl() throws Exception{
        this.sf = new ServiceFactoryImpl();
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
    public boolean deleteEquipment(String id) throws Exception {
        return sf.getEquipmentService().deleteEquipment(id);
    }

    @Override
    public M_Equipment searchEquipment(String id) throws Exception {
        return sf.getEquipmentService().searchEquipment(id);
    }

    @Override
    public List<M_Equipment> getAllEquipments() throws Exception {
        return sf.getEquipmentService().getAllEquipments();
    }

    @Override
    public M_Equipment searchEquipmentByName(String name) throws Exception {
        return sf.getEquipmentService().searchEquipmentByName(name);
    }

    @Override
    public List<M_Equipment> getAllEquipmentsByLetter(String phrase) throws Exception {
        return sf.getEquipmentService().getAllEquipmentsByLetter(phrase);
    }

    @Override
    public boolean reserveEquipment(String id) throws Exception {
        return EQUIPMENT_RESERVER.reserveEquipment(id, this);
    }

    @Override
    public boolean releaseEquipment(String id) throws Exception {
        return EQUIPMENT_RESERVER.releaseEquipment(id, this);
    }
    
    
    
}
