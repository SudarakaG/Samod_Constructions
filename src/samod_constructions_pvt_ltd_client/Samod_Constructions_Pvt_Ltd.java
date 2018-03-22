/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samod_constructions_pvt_ltd_client;

import com.brotherssoft.samodconstructions.view.GUI_Home;
import com.brotherssoft.samodconstructions.view.Login;
import com.brotherssoft.samodconstructions.view.Splash;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import jdk.nashorn.internal.codegen.CompilerConstants;

/**
 *
 * @author gksde
 */
public class Samod_Constructions_Pvt_Ltd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
            if ("Nimbus".equals(info.getName())) {
                try {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());

                    break;
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Samod_Constructions_Pvt_Ltd.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    Logger.getLogger(Samod_Constructions_Pvt_Ltd.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(Samod_Constructions_Pvt_Ltd.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(Samod_Constructions_Pvt_Ltd.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        

        Splash s = new Splash();
        s.setVisible(true);
        Login login = new Login();

        for (int i = 0; i < 101; i++) {

            try {
                Thread.sleep(60);
                s.jLabel4.setText(Integer.toString(i) + "%");
            } catch (InterruptedException ex) {
                Logger.getLogger(Samod_Constructions_Pvt_Ltd.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        s.dispose();
        login.setVisible(true);
    }

}
