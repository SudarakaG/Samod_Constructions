/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherssoft.samodconstructions.serverconnector;

import com.brotherssoft.samodconstructions.controller.IDController;
import com.brotherssoft.samodconstructions.controller.M_AccountController;
import com.brotherssoft.samodconstructions.controller.M_EmployeeController;
import com.brotherssoft.samodconstructions.controller.M_EquipmentController;
import com.brotherssoft.samodconstructions.controller.M_MainStockController;
import com.brotherssoft.samodconstructions.controller.M_MaterialController;
import com.brotherssoft.samodconstructions.controller.M_PurchaserController;
import com.brotherssoft.samodconstructions.controller.M_VehicleController;
import com.brotherssoft.samodconstructions.controller.R_AccountTypeController;
import com.brotherssoft.samodconstructions.controller.R_AssetCategoryController;
import com.brotherssoft.samodconstructions.controller.R_AssetController;
import com.brotherssoft.samodconstructions.controller.R_BankController;
import com.brotherssoft.samodconstructions.controller.R_BranchController;
import com.brotherssoft.samodconstructions.controller.R_DesignationController;
import com.brotherssoft.samodconstructions.controller.R_FuelTypeController;
import com.brotherssoft.samodconstructions.controller.R_JobTypeController;
import com.brotherssoft.samodconstructions.controller.R_PaymentModeController;
import com.brotherssoft.samodconstructions.controller.R_ProjectGradeController;
import com.brotherssoft.samodconstructions.controller.R_ProjectSpecialityController;
import com.brotherssoft.samodconstructions.controller.R_ProjectTypeController;
import com.brotherssoft.samodconstructions.controller.R_SalaryTypeController;
import com.brotherssoft.samodconstructions.controller.R_UnitController;
import com.brotherssoft.samodconstructions.controller.R_VehivleTypeController;
import com.brotherssoft.samodconstructions.controller.R_WorkController;
import com.brotherssoft.samodconstructions.controllerfactory.ControllerFactory;
import java.rmi.Naming;
import com.brotherssoft.samodconstructions.controller.M_Project_PrimaryController;
import com.brotherssoft.samodconstructions.controller.M_Project_SecondaryController;
import com.brotherssoft.samodconstructions.controller.M_Project_ThirdController;
import com.brotherssoft.samodconstructions.controller.R_ExpenceSubTypeController;
import com.brotherssoft.samodconstructions.controller.R_ExpenceTypeController;
import com.brotherssoft.samodconstructions.controller.R_IncomeSubTypeController;
import com.brotherssoft.samodconstructions.controller.R_IncomeTypeControler;
import com.brotherssoft.samodconstructions.controller.T_AttendanceController;
import com.brotherssoft.samodconstructions.controller.T_CashAllocationController;
import com.brotherssoft.samodconstructions.controller.T_ExpencesController;
import com.brotherssoft.samodconstructions.controller.T_IncomeController;
import com.brotherssoft.samodconstructions.controller.T_RunchartController;
import com.brotherssoft.samodconstructions.controller.T_SalaryController;
import com.brotherssoft.samodconstructions.controller.T_SiteAllocationController;

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
    private M_Project_PrimaryController primary_ProjectController;
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
    private R_JobTypeController jobTypeController;
    private R_DesignationController designationController;
    private M_EmployeeController employeeController;
    private R_SalaryTypeController salaryTypeController;
    private R_WorkController workController;
    private R_AssetController assetController;
    private R_AssetCategoryController assetCategoryController;
    private R_UnitController unitController;
    private M_EquipmentController equipmentController;
    private M_MaterialController materialController;
    private M_Project_SecondaryController secondaryController;
    private M_Project_ThirdController thirdController;
    private T_CashAllocationController cashAllocationController;
    private M_MainStockController mainStockController;
    private T_SiteAllocationController siteAllocationController;
    private T_RunchartController runchartController;
    private T_ExpencesController expencesController;
    private R_ExpenceSubTypeController expenceSubTypeController;
    private R_ExpenceTypeController expenceTypeController;
    private R_IncomeSubTypeController incomeSubTypeController;
    private R_IncomeTypeControler incomeTypeControler;
    private T_IncomeController incomeController;
    private T_AttendanceController attendanceController;
    private T_SalaryController salaryController;
    
    //private UserHistoryController uhc;

    private ServerConnector() throws Exception {
        cf = (ControllerFactory) Naming.lookup("rmi://localhost:4040/SCServer");
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
    
    public M_Project_PrimaryController getPrimary_ProjectController()throws Exception{
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
    
    public R_JobTypeController getJobTypeController()throws Exception{
        if(jobTypeController == null){
            jobTypeController = cf.getJobTypeController();
        }
        return jobTypeController;
    }
    
    public R_DesignationController getDesignationController()throws Exception{
        if(designationController == null){
            designationController = cf.getDesignationController();
        }
        return designationController;
    }
    
    public M_EmployeeController getEmployeeController()throws Exception{
        if(employeeController == null){
            employeeController = cf.getEmployeeController();
        }
        return employeeController;
    }
    
    public R_SalaryTypeController getSalaryTypeController()throws Exception{
        if(salaryTypeController == null){
            salaryTypeController = cf.getSalaryTypeController();
        }
        return salaryTypeController;
    }
    
    public R_WorkController getWorkController()throws Exception{
        if(workController == null){
            workController = cf.getWorkController();
        }
        return workController;
    }
    
    public R_AssetController getAssetController()throws Exception{
        if(assetController == null){
            assetController = cf.getAssetController();
        }
        return assetController;
    }
    
    public R_AssetCategoryController getAssetCategoryController()throws Exception{
        if(assetCategoryController == null){
            assetCategoryController = cf.getAssetCategoryController();
        }
        return assetCategoryController;
    }
    
    public R_UnitController getUnitController()throws Exception{
        if(unitController == null){
            unitController = cf.getUnitController();
        }
        return unitController;
    }
    
    public M_EquipmentController getEquipmentController() throws Exception{
        if(equipmentController == null){
            equipmentController = cf.getEquipmentController();
        }
        return equipmentController;
    }
    
    public M_MaterialController getMaterialController()throws Exception{
        if(materialController == null){
            materialController = cf.getMaterialController();
        }
        return materialController;
    }
    
    public M_Project_SecondaryController getSecondaryController()throws Exception{
        if(secondaryController == null){
            secondaryController = cf.getSecondary_ProjectController();
        }
        return secondaryController;
    }
    
    public M_Project_ThirdController getThirdController()throws Exception{
        if(thirdController == null){
            thirdController = cf.getThird_ProjectController();
        }
        return thirdController;
    }
    
    public T_CashAllocationController getCashAllocationController()throws Exception{
        if(cashAllocationController == null){
            cashAllocationController = cf.getCashAllocationController();
        }
        return cashAllocationController;
    }
    
    public M_MainStockController getMainStockController()throws Exception{
        if(mainStockController == null){
            mainStockController = cf.getMainStockController();
        }
        return mainStockController;
    }
    
    public T_SiteAllocationController getSiteAllocationController()throws Exception{
        if (siteAllocationController == null) {
            siteAllocationController = cf.getSiteAllocationController();
        }
        return siteAllocationController;
    }
    
    public T_RunchartController getRunchartController()throws Exception{
        if (runchartController == null) {
            runchartController = cf.getRunchartController();
        }
        return runchartController;
    }
    
    public T_ExpencesController getExpencesController()throws Exception{
        if (expencesController == null) {
            expencesController = cf.getExpencesController();
        }
        return expencesController;
    }
    
    public R_ExpenceSubTypeController getExpenceSubTypeController()throws Exception{
        if (expenceSubTypeController == null) {
            expenceSubTypeController = cf.getExpenceSubTypeController();
        }
        return expenceSubTypeController;
    }
    
    public R_ExpenceTypeController getExpenceTypeController()throws Exception{
        if (expenceTypeController == null) {
            expenceTypeController = cf.getExpenceTypeController();
        }
        return expenceTypeController;
    }
    
    public R_IncomeSubTypeController getIncomeSubTypeController()throws Exception{
        if (incomeSubTypeController == null) {
            incomeSubTypeController = cf.getIncomeSubTypeController();
        }
        return incomeSubTypeController;
    }
    
    public R_IncomeTypeControler getIncomeTypeControler()throws Exception{
        if (incomeTypeControler == null) {
            incomeTypeControler = cf.getIncomeTypeControler();
        }
        return incomeTypeControler;
    }
    
    public T_IncomeController getIncomeController()throws Exception{
        if (incomeController == null) {
            incomeController = cf.getIncomeController();
        }
        return incomeController;
    }
    
    public T_AttendanceController getAttendanceController()throws Exception{
        if (attendanceController == null) {
            attendanceController = cf.getAttendanceController();
        }
        return attendanceController;
    }
    
    public T_SalaryController getSalaryController()throws Exception{
        if (salaryController == null) {
            salaryController = cf.getSalaryController();
        }
        return salaryController;
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
