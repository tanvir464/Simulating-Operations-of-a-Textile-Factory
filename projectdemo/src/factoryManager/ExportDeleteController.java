/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package factoryManager;

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
public class ExportDeleteController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void profileOnClick(ActionEvent event)  throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("UserProfileFactoryScene.fxml"));
        Parent sceneParent = loader.load();
        Scene scene = new Scene(sceneParent);
        Stage stg = (Stage)((Node)event.getSource()).getScene().getWindow(); 
        stg.setScene(scene);
        stg.show();
   
    }

    @FXML
    private void deleteImportOnClick(ActionEvent event)  throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("ImportDelete.fxml"));
        Parent sceneParent = loader.load();
        Scene scene = new Scene(sceneParent);
        Stage stg = (Stage)((Node)event.getSource()).getScene().getWindow(); 
        stg.setScene(scene);
        stg.show();
    
    }

    @FXML
    private void editExportOnClick(ActionEvent event)  throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("ExportEdit.fxml"));
        Parent sceneParent = loader.load();
        Scene scene = new Scene(sceneParent);
        Stage stg = (Stage)((Node)event.getSource()).getScene().getWindow(); 
        stg.setScene(scene);
        stg.show();
    
    }

    @FXML
    private void editBranchReportOnClick(ActionEvent event)  throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("BranchReportEdit.fxml"));
        Parent sceneParent = loader.load();
        Scene scene = new Scene(sceneParent);
        Stage stg = (Stage)((Node)event.getSource()).getScene().getWindow(); 
        stg.setScene(scene);
        stg.show();
    
    }

    @FXML
    private void newImportOnClick(ActionEvent event)  throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("Import.fxml"));
        Parent sceneParent = loader.load();
        Scene scene = new Scene(sceneParent);
        Stage stg = (Stage)((Node)event.getSource()).getScene().getWindow(); 
        stg.setScene(scene);
        stg.show();
    
    }

    @FXML
    private void newExportOnClick(ActionEvent event)  throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("Export.fxml"));
        Parent sceneParent = loader.load();
        Scene scene = new Scene(sceneParent);
        Stage stg = (Stage)((Node)event.getSource()).getScene().getWindow(); 
        stg.setScene(scene);
        stg.show();
    

    }

    @FXML
    private void deleteExportOnClick(ActionEvent event)  throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("ExportDelete.fxml"));
        Parent sceneParent = loader.load();
        Scene scene = new Scene(sceneParent);
        Stage stg = (Stage)((Node)event.getSource()).getScene().getWindow(); 
        stg.setScene(scene);
        stg.show();
    
    }

    @FXML
    private void createBranchReportOnClick(ActionEvent event)  throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("CreateBranchReport.fxml"));
        Parent sceneParent = loader.load();
        Scene scene = new Scene(sceneParent);
        Stage stg = (Stage)((Node)event.getSource()).getScene().getWindow(); 
        stg.setScene(scene);
        stg.show();
    
    }

    @FXML
    private void doneOnClick(ActionEvent event) {
    }
    
}
