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
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Mahdi Hasan
 */
public class UploadReportSceneController implements Initializable {

    @FXML
    private Button logoutButton;
    @FXML
    private DatePicker upload;
    @FXML
    private ComboBox<?> uploadFinancialReportTypeCB;
    @FXML
    private TextField uploadFinancialReportAmountTF;
    @FXML
    private TextField uploadFinancialReportDescriptionTF;
    @FXML
    private Button goBackButton;
    @FXML
    private Button uploadFinancialReportSaveButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void logoutButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void GoBackButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void uploadFinancialReportSaveButtonOnClick(ActionEvent event) {
    }
    
}
