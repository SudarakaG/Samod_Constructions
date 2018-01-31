/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.serverconnector;

import com.brotherssoft.samodconstructions.controller.IDController;
import com.brotherssoft.samodconstructions.controller.M_AccountController;
import com.brotherssoft.samodconstructions.controller.M_Primary_ProjectController;
import com.brotherssoft.samodconstructions.controller.M_PurchaserController;
import com.brotherssoft.samodconstructions.controller.M_VehicleController;
import com.brotherssoft.samodconstructions.controller.R_AccountTypeController;
import com.brotherssoft.samodconstructions.controller.R_BankController;
import com.brotherssoft.samodconstructions.controller.R_BranchController;
import com.brotherssoft.samodconstructions.controller.R_FuelTypeController;
import com.brotherssoft.samodconstructions.controller.R_PaymentModeController;
import com.brotherssoft.samodconstructions.controller.R_ProjectGradeController;
import com.brotherssoft.samodconstructions.controller.R_ProjectSpecialityController;
import com.brotherssoft.samodconstructions.controller.R_ProjectTypeController;
import com.brotherssoft.samodconstructions.controller.R_VehivleTypeController;
import com.brotherssoft.samodconstructions.controllerfactory.ControllerFactory;
import java.rmi.Naming;

/**
 *
 * @author gksde
 */
public class ServerConnector {
    
    private static ServerConnector sc;
    private final ControllerFactory cf;
    private IDController ic;
    private R_BankController bc;
    private R_BranchController branchController;
    private M_Primary_ProjectController primary_ProjectController;
    private R_ProjectGradeController projectGradeController;
    private R_ProjectSpecialityController projectSpecialityController;
    private R_ProjectTypeController projectTypeController;
    private R_PaymentModeController paymentModeController;
    private M_AccountController accountController;
    private R_AccountTypeController accountTypeController;
    private R_VehivleTypeController vehivleTypeController;
    private R_FuelTypeController fuelTypeController;
    private M_VehicleController vehicleController;
    private M_PurchaserController purchaserController;
    
    //private UserHistoryController uhc;

    private ServerConnector() throws Exception {
        cf = (ControllerFactory) Naming.lookup("rmi://localhost:4040/Server");
    }

    public R_BankController getBankController() throws Exception {
        if (bc == null) {
            bc = cf.getBankController();
        }
        return bc;
    }
    
    public IDController getIDController()throws Exception{
        if(ic == null){
            ic = cf.getIDController();
        }
        return ic;
    }
    
    public R_BranchController getBranchController()throws Exception{
        if(branchController == null){
            branchController = cf.getBranchController();
        }
        return branchController;
    }
    
    public M_Primary_ProjectController getPrimary_ProjectController()throws Exception{
        if (primary_ProjectController == null) {
            primary_ProjectController = cf.getPrimaryProjectController();
        }
        return primary_ProjectController;
    }
    
    public R_ProjectGradeController getProjectGradeController()throws Exception{
        if(projectGradeController == null){
            projectGradeController = cf.getProjectGradeController();
        }
        return projectGradeController;
    }
    
    public R_ProjectSpecialityController getProjectSpecialityController()throws Exception{
        if(projectSpecialityController == null){
            projectSpecialityController = cf.getProjectSpecialityController();
        }
        return projectSpecialityController;
    }
    
    public R_ProjectTypeController getProjectTypeController()throws Exception{
        if(projectTypeController == null){
            projectTypeController = cf.getProjectTypeController();
        }
        return projectTypeController;
    }
    
    public R_PaymentModeController getPaymentModeController()throws Exception{
        if(paymentModeController == null){
            paymentModeController = cf.getPaymentModeController();
        }
        return paymentModeController;
    }
    
    public M_AccountController getAccountController()throws Exception{
        if(accountController == null){
            accountController = cf.getAccountController();
        }
        return accountController;
    }
    
    public R_AccountTypeController getAccountTypeController()throws Exception{
        if(accountTypeController == null){
            accountTypeController = cf.getAccountTypeController();
        }
        return accountTypeController;
    }
    
    public R_VehivleTypeController getVehivleTypeController()throws Exception{
        if(vehivleTypeController == null){
            vehivleTypeController = cf.getVehivleTypeController();
        }
        return vehivleTypeController;
    }
    
    public R_FuelTypeController getFuelTypeController()throws Exception{
        if(fuelTypeController == null){
            fuelTypeController = cf.getFuelTypeController();
        }
        return fuelTypeController;
    }
    
    public M_VehicleController getVehicleController()throws Exception{
        if(vehicleController == null){
            vehicleController = cf.getVehicleController();
        }
        return vehicleController;
    }
    
    public M_PurchaserController getPurchaserController()throws Exception{
        if(purchaserController == null){
            purchaserController = cf.getPurchaserController();
        }
        return purchaserController;
    }

//    
//    
//    public UserHistoryController getUserHistoryConnector() throws FileNotFoundException, IOException, RemoteException, ParseException{
//        if(uhc == null){
//            uhc = cf.getUserHistoryController();
//        }
//        return uhc;
//    }
    
    public static ServerConnector getServerConnetor() throws Exception {
        if (sc == null) {
            sc = new ServerConnector();
        }
        return sc;
    }
    
}
