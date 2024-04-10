/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Financialofficer;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Mahdi Hasan
 */
public class UploadfinantialreportController implements Initializable {

    @FXML
    private ComboBox<String> uploadFinancialReportTypeCB;
    @FXML
    private TextField uploadFinancialReportAmountTF;
    @FXML
    private TextField uploadFinancialReportDescriptionTF;
    @FXML
    private DatePicker uploadDate;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        uploadFinancialReportTypeCB.getItems().addAll("Order Raw Materials","Clear Salary"
                , "Utility Bill","Tax Payment", "Buy New Machine"
                , "Fix Machines", "Food");
    }    

    @FXML
    private void uploadFinancialReportSaveButtonOnClick(ActionEvent event) throws IOException {
    }

    @FXML
    private void logOutButtonOnClick(ActionEvent event) throws IOException {
    }

    @FXML
    private void goBackButtonOnClick(ActionEvent event)throws IOException  {
    }

    @FXML
    private void uploadFinancialReportSceneOnClick(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Uploadfinantialreport.fxml"));
        
    }

    @FXML
    private void viewFinancialReportsSceneOnClick(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("ViewAllReportsScene.fxml"));
    }

    @FXML
    private void expenseControlSceneOnClick(ActionEvent event)throws IOException  {
        Parent root = FXMLLoader.load(getClass().getResource("ExpenseControlSystemScene.fxml"));
    }

    @FXML
    private void searchReportsSceneOnClick(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("SearchReportsScene.fxml"));
    }

    @FXML
    private void generateIncomeDataSceneOnClick(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("GenerateIncomeDataScene.fxml"));
    }

    @FXML
    private void auditReportSceneOnClick(ActionEvent event)throws IOException  {
        Parent root = FXMLLoader.load(getClass().getResource("CreateAuditReportScene.fxml"));
    }

    @FXML
    private void manageAssetsSceneOnClick(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("AssetManagementScene.fxml"));
    }

    @FXML
    private void createFinancialForecastsSceneOnClick(ActionEvent event)throws IOException  {
        Parent root = FXMLLoader.load(getClass().getResource("FinancialForecastingScene.fxml"));
    }

    @FXML
    private void FODashboardButtonOnClick(ActionEvent event)throws IOException  {
         Parent root = FXMLLoader.load(getClass().getResource("DashboardScene.fxml"));
    }

    
}
