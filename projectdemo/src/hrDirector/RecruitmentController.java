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
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author USER
 */
public class RecruitmentController implements Initializable {

    @FXML
    private TextField nameOfEmployee;
    @FXML
    private ComboBox<?> departmentCB;
    @FXML
    private TextField jobDescription;
    @FXML
    private TextField roleOfEmployee;

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
        loader.setLocation(getClass().getResource("UserProfileScene.fxml"));
        Parent sceneParent = loader.load();
        Scene scene = new Scene(sceneParent);
        Stage stg = (Stage)((Node)event.getSource()).getScene().getWindow(); 
        stg.setScene(scene);
        stg.show();

    }

    @FXML
    private void infoOfEmployeeOnClick(ActionEvent event)  throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("EmployeeSearch.fxml"));
        Parent sceneParent = loader.load();
        Scene scene = new Scene(sceneParent);
        Stage stg = (Stage)((Node)event.getSource()).getScene().getWindow(); 
        stg.setScene(scene);
        stg.show();

    }

    @FXML
    private void viewResignationOnClick(ActionEvent event)  throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("ViewResignation.fxml"));
        Parent sceneParent = loader.load();
        Scene scene = new Scene(sceneParent);
        Stage stg = (Stage)((Node)event.getSource()).getScene().getWindow(); 
        stg.setScene(scene);
        stg.show();

    }

    @FXML
    private void viewComplaintOnClick(ActionEvent event)  throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("ViewComplaint.fxml"));
        Parent sceneParent = loader.load();
        Scene scene = new Scene(sceneParent);
        Stage stg = (Stage)((Node)event.getSource()).getScene().getWindow(); 
        stg.setScene(scene);
        stg.show();

    }

    @FXML
    private void viewBranchReportOnClick(ActionEvent event)  throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("ViewBranchReport.fxml"));
        Parent sceneParent = loader.load();
        Scene scene = new Scene(sceneParent);
        Stage stg = (Stage)((Node)event.getSource()).getScene().getWindow(); 
        stg.setScene(scene);
        stg.show();

    }

    @FXML
    private void addEmployeeOnClick(ActionEvent event) {
    }
    
}
