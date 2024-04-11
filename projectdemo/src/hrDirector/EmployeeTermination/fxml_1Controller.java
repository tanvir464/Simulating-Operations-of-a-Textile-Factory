/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package hrDirector.EmployeeTermination;

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
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author USER
 */
public class fxml_1Controller implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void profileOnClick(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("UserProfileScene.fxml"));
        Parent sceneParent = loader.load();
        Scene scene = new Scene(sceneParent);
        Stage stg = (Stage)((Node)event.getSource()).getScene().getWindow(); 
        stg.setScene(scene);
        stg.show();
    }

    @FXML
    private void employeeInfoOnClick(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("EmployeeSearch.fxml"));
        Parent sceneParent = loader.load();
        Scene scene = new Scene(sceneParent);
        Stage stg = (Stage)((Node)event.getSource()).getScene().getWindow(); 
        stg.setScene(scene);
        stg.show();
    }

    @FXML
    private void resignationOnClick(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("Resignation.fxml"));
        Parent sceneParent = loader.load();
        Scene scene = new Scene(sceneParent);
        Stage stg = (Stage)((Node)event.getSource()).getScene().getWindow(); 
        stg.setScene(scene);
        stg.show();
    }

    @FXML
    private void recruitmentOnClick(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("Recruitment.fxml"));
        Parent sceneParent = loader.load();
        Scene scene = new Scene(sceneParent);
        Stage stg = (Stage)((Node)event.getSource()).getScene().getWindow(); 
        stg.setScene(scene);
        stg.show();
    }

    @FXML
    private void complaintOnClick(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("ViewComplaint.fxml"));
        Parent sceneParent = loader.load();
        Scene scene = new Scene(sceneParent);
        Stage stg = (Stage)((Node)event.getSource()).getScene().getWindow(); 
        stg.setScene(scene);
        stg.show();
    }

    @FXML
    private void branchReportOnClick(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("ViewBranchReport.fxml"));
        Parent sceneParent = loader.load();
        Scene scene = new Scene(sceneParent);
        Stage stg = (Stage)((Node)event.getSource()).getScene().getWindow(); 
        stg.setScene(scene);
        stg.show();
    }

    @FXML
    private void terminate(ActionEvent event) {
    }
    
}
