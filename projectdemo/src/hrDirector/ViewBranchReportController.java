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
import javafx.scene.control.TableView;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author USER
 */
public class ViewBranchReportController implements Initializable {

    @FXML
    private TableView<?> branchReports;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void viewUserProfileOnClick(ActionEvent event)  throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("UserMProfileScene.fxml"));
        Parent sceneParent = loader.load();
        Scene scene = new Scene(sceneParent);
        Stage stg = (Stage)((Node)event.getSource()).getScene().getWindow(); 
        stg.setScene(scene);
        stg.show();

    }

    @FXML
    private void viewEmployeeInfoOnClick(ActionEvent event)  throws IOException {
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
    private void viewComplaintOnClick(ActionEvent event)  throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("ViewComplaint.fxml"));
        Parent sceneParent = loader.load();
        Scene scene = new Scene(sceneParent);
        Stage stg = (Stage)((Node)event.getSource()).getScene().getWindow(); 
        stg.setScene(scene);
        stg.show();

    }
    
}
