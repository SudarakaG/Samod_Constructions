/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.serverconnector;

import com.brotherssoft.samodconstructions.controller.IDController;
import com.brotherssoft.samodconstructions.controller.M_Primary_ProjectController;
import com.brotherssoft.samodconstructions.controller.R_BankController;
import com.brotherssoft.samodconstructions.controller.R_BranchController;
import com.brotherssoft.samodconstructions.controllerfactory.ControllerFactory;
import java.rmi.Naming;

/**
 *
 * @author gksde
 */
public class ServerConnector {
    
    private static ServerConnector sc;
    private ControllerFactory cf;
    private IDController ic;
    private R_BankController bc;
    private R_BranchController branchController;
    private M_Primary_ProjectController primary_ProjectController;
    
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
