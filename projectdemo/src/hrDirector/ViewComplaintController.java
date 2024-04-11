/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package hrDirector;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author USER
 */
public class ViewComplaintController implements Initializable {

    @FXML
    private Label idSearch;
    @FXML
    private Label complaintSearch;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void userProfileOnClick(ActionEvent event)  throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("userProfileScene.fxml"));
        Parent sceneParent = loader.load();
        Scene scene = new Scene(sceneParent);
        Stage stg = (Stage)((Node)event.getSource()).getScene().getWindow(); 
        stg.setScene(scene);
        stg.show();

    }

    @FXML
    private void employeeInfoOnClick(ActionEvent event)  throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("EmployeeSearch.fxml"));
        Parent sceneParent = loader.load();
        Scene scene = new Scene(sceneParent);
        Stage stg = (Stage)((Node)event.getSource()).getScene().getWindow(); 
        stg.setScene(scene);
        stg.show();

    }

    @FXML
    private void resignationOnClick(ActionEvent event)  throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("Resignation.fxml"));
        Parent sceneParent = loader.load();
        Scene scene = new Scene(sceneParent);
        Stage stg = (Stage)((Node)event.getSource()).getScene().getWindow(); 
        stg.setScene(scene);
        stg.show();

    }

    @FXML
    private void recruitmentOnClick(ActionEvent event)  throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("Recruitment.fxml"));
        Parent sceneParent = loader.load();
        Scene scene = new Scene(sceneParent);
        Stage stg = (Stage)((Node)event.getSource()).getScene().getWindow(); 
        stg.setScene(scene);
        stg.show();

    }

    @FXML
    private void viewComlaintOnClick(ActionEvent event)  throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("ViewComplaint.fxml"));
        Parent sceneParent = loader.load();
        Scene scene = new Scene(sceneParent);
        Stage stg = (Stage)((Node)event.getSource()).getScene().getWindow(); 
        stg.setScene(scene);
        stg.show();

    }

    @FXML
    private void branchReportOnClick(ActionEvent event)  throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("ViewBranchReport.fxml"));
        Parent sceneParent = loader.load();
        Scene scene = new Scene(sceneParent);
        Stage stg = (Stage)((Node)event.getSource()).getScene().getWindow(); 
        stg.setScene(scene);
        stg.show();

    }

    @FXML
    private void acceptOnClick(ActionEvent event) {
    }
    
}
