/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samod_constructions_pvt_ltd_server;

import com.brotherssoft.samodconstructions.controllerfactoryimpl.ControllerFactoryImpl;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author gksde
 */
public class Samod_Constructions_Pvt_Ltd_SERVER {

    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        try {
            Registry rr = LocateRegistry.createRegistry(4040);
            System.out.println("Server Statrted Successfully..");
            rr.rebind("SCServer", new ControllerFactoryImpl());
            JOptionPane.showMessageDialog(null, "Servere Started Successfully..");
            
            //int count = 1;
        } catch (Exception ex) {
            Logger.getLogger(Samod_Constructions_Pvt_Ltd_SERVER.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
