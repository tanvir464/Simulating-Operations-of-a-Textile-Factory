/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Financialofficer;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

/**
 * FXML Controller class
 *
 * @author Mahdi Hasan
 */
public class ViewAuditReportSceneController implements Initializable {

    @FXML
    private Button logOutButton1;
    @FXML
    private Button goBackButton1;
    @FXML
    private Button uploadFinancialReportButton;
    @FXML
    private Button viewFinancialReportsButton;
    @FXML
    private Button expenseControlButton;
    @FXML
    private Button searchReportsButton;
    @FXML
    private Button generateIncomeDataButton;
    @FXML
    private Button auditReportButton;
    @FXML
    private Button manageAssetsButton;
    @FXML
    private Button createFinancialForecastsButton;
    @FXML
    private DatePicker auditReportDate;
    @FXML
    private TableView<?> specificAuditReportTableView;
    @FXML
    private TableColumn<?, ?> auditReportQ1TC;
    @FXML
    private TableColumn<?, ?> auditReportQ2TC;
    @FXML
    private TableColumn<?, ?> auditReportQ3TC;
    @FXML
    private TableColumn<?, ?> auditReportQ4TC;
    @FXML
    private TableColumn<?, ?> auditReportQ5TC;
    @FXML
    private TableColumn<?, ?> auditReportQ6TC;
    @FXML
    private TableColumn<?, ?> auditReportQ7TC;
    @FXML
    private TableColumn<?, ?> auditReportQ8TC;
    @FXML
    private TableColumn<?, ?> auditReportQ9TC;
    @FXML
    private TableColumn<?, ?> auditReportQ10TC;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void logOutButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void goBackButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void uploadFinancialReportSceneOnClick(ActionEvent event) {
    }

    @FXML
    private void viewFinancialReportsSceneOnClick(ActionEvent event) {
    }

    @FXML
    private void expenseControlSceneOnClick(ActionEvent event) {
    }

    @FXML
    private void searchReportsSceneOnClick(ActionEvent event) {
    }

    @FXML
    private void generateIncomeDataSceneOnClick(ActionEvent event) {
    }

    @FXML
    private void auditReportSceneOnClick(ActionEvent event) {
    }

    @FXML
    private void manageAssetsSceneOnClick(ActionEvent event) {
    }

    @FXML
    private void createFinancialForecastsSceneOnClick(ActionEvent event) {
    }
    
}
