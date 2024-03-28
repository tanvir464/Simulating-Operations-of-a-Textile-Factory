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
public class ExpenseControlSystemSceneController implements Initializable {

    @FXML
    private DatePicker expenseControlSystemDate;
    @FXML
    private ComboBox<?> expenseControlSystemTypeCB;
    @FXML
    private TextField expenseControlSystemAmount;
    @FXML
    private Button goBackButton;
    @FXML
    private Button logOutButton;
    @FXML
    private Button expenseControlSystemCheckOutButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void expenseControlSystemTypeCBonClick(ActionEvent event) {
    }

    @FXML
    private void goBackButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void logOutButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void expenseControlSystemCheckOutButtonOnClick(ActionEvent event) {
    }
    
}
