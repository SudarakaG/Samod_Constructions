/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.custom;

import com.brotherssoft.samodconstructions.serverconnector.ServerConnector;
import com.brotherssoft.samodconstructions.view.Bank_Panel;
import com.brotherssoft.samodconstructions.view.Cash_Allocated;
import com.brotherssoft.samodconstructions.view.Company_Account_Registration_Panel;
import com.brotherssoft.samodconstructions.view.Employee_Panel;
import com.brotherssoft.samodconstructions.view.Equiment_Allocation;
import com.brotherssoft.samodconstructions.view.Equipment_Registration_Panel;
import com.brotherssoft.samodconstructions.view.Expences;
import com.brotherssoft.samodconstructions.view.IncomeNew;
import com.brotherssoft.samodconstructions.view.Meterial_Registration_Panel;
import com.brotherssoft.samodconstructions.view.Project_Primary_Panel;
import com.brotherssoft.samodconstructions.view.Purchaser_Registration_Panel;
import com.brotherssoft.samodconstructions.view.Running_Chart;
import com.brotherssoft.samodconstructions.view.Vehical_Registration_Panel;
import com.brotherssoft.samodconstructions.view.Work_Registration_Panel;

/**
 *
 * @author gksde
 */
public class ReleaseAllReservation {

    public static void releaseAllReservation() throws Exception {
            ServerConnector.getServerConnetor().getAccountController().releaseAccount(Company_Account_Registration_Panel.accountIdPub);
            ServerConnector.getServerConnetor().getBankController().releaseBank(Bank_Panel.bankIdPub);
            ServerConnector.getServerConnetor().getBranchController().releaseBranch(Bank_Panel.branchIdPub);
            ServerConnector.getServerConnetor().getCashAllocationController().releaseCashAllocation(Cash_Allocated.cashAllocationIdPub);
            ServerConnector.getServerConnetor().getEmployeeController().releaseEmployee(Employee_Panel.empIdPub);
            ServerConnector.getServerConnetor().getMainStockController().releaseMainStock(Equiment_Allocation.mainStockIdPub);
            ServerConnector.getServerConnetor().getSiteAllocationController().releaseSiteAllocation(Equiment_Allocation.siteStockIdPub);
            ServerConnector.getServerConnetor().getEquipmentController().releaseEquipment(Equipment_Registration_Panel.equipIdPub);
            ServerConnector.getServerConnetor().getMaterialController().releaseMaterial(Meterial_Registration_Panel.materialIdPub);
            ServerConnector.getServerConnetor().getPrimary_ProjectController().releaseProject(Project_Primary_Panel.projectIdPub);
            ServerConnector.getServerConnetor().getPurchaserController().releasePurchaser(Purchaser_Registration_Panel.purchaserIdPub);
            ServerConnector.getServerConnetor().getRunchartController().releaseRunchart(Running_Chart.runChartIdPub);
            ServerConnector.getServerConnetor().getVehicleController().releaseVehicle(Vehical_Registration_Panel.vehicleIdPub);
            ServerConnector.getServerConnetor().getWorkController().releaseWork(Work_Registration_Panel.workIdPub);
            ServerConnector.getServerConnetor().getExpencesController().releaseExpence(Expences.expenceIdPub);
            ServerConnector.getServerConnetor().getIncomeController().releaseIncome(IncomeNew.incomeIdPub);
    }
}
