/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.custom;

import com.brotherssoft.samodconstructions.serverconnector.ServerConnector;
import com.brotherssoft.samodconstructions.view.Bank_Panel;
import com.brotherssoft.samodconstructions.view.Company_Account_Registration_Panel;

/**
 *
 * @author gksde
 */
public class ReleaseAllReservation {

    public static void releaseAllReservation() throws Exception {
            ServerConnector.getServerConnetor().getAccountController().releaseAccount(Company_Account_Registration_Panel.accountIdPub);
            ServerConnector.getServerConnetor().getBankController().releaseBank(Bank_Panel.bankIdPub);
            ServerConnector.getServerConnetor().getBranchController().releaseBranch(Bank_Panel.branchIdPub);
    }
}
