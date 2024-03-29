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
import javafx.scene.chart.BarChart;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

/**
 * FXML Controller class
 *
 * @author Mahdi Hasan
 */
public class DisplayFinancialReportSceneController implements Initializable {

    @FXML
    private Button logOutButton;
    @FXML
    private Button goBackButton;
    @FXML
    private TableView<?> financialReportTable;
    @FXML
    private TableColumn<?, ?> financialReportDateTC;
    @FXML
    private TableColumn<?, ?> financialReportTypeTC;
    @FXML
    private TableColumn<?, ?> financialReportAmountTC;
    @FXML
    private TableColumn<?, ?> financialReportDescriptionTC;
    @FXML
    private BarChart<?, ?> financialReportBarChart;
    @FXML
    private Button requestNewestReportsFromFactoryManagerButton;

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
    private void requestNewestReportsFromFactoryManagerSceneOnClick(ActionEvent event) {
    }
    
}
