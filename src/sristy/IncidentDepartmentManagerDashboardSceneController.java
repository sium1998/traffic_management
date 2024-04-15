/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package sristy;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import mainpkg.LoginSceneController;
import sristy.modelclasses.IncidentDepartmentManager;

/**
 * FXML Controller class
 *
 * @author HP
 */
public class IncidentDepartmentManagerDashboardSceneController implements Initializable {
    IncidentDepartmentManager user;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void logoutButtonOnClick(ActionEvent event) throws IOException {
        Button button = (Button) event.getSource();
        Scene currentScene = button.getScene();
        Stage currentStage = (Stage) currentScene.getWindow();
        Scene newScene = new Scene(FXMLLoader.load(LoginSceneController.class.getResource("LoginScene.fxml")));
        currentStage.setScene(newScene);
    }
    
    public void initializeScene(IncidentDepartmentManager user)
    {
        this.user = user;
    }

    @FXML
    private void incidentReportButtonOnClick(ActionEvent event) throws IOException {
        Button button = (Button) event.getSource();
        Scene currentScene = button.getScene();
        Stage currentStage = (Stage) currentScene.getWindow();
        FXMLLoader loader = new FXMLLoader(IncidentReportingAndTrackingSceneController.class.getResource("IncidentReportingAndTrackingScene.fxml"));
        Scene newScene = new Scene(loader.load());
        IncidentReportingAndTrackingSceneController controllerClass = loader.getController();
        controllerClass.initializeScene(user);
        currentStage.setScene(newScene);
    }

    @FXML
    private void messagingButtonOnClick(ActionEvent event) throws IOException {
        Button button = (Button) event.getSource();
        Scene currentScene = button.getScene();
        Stage currentStage = (Stage) currentScene.getWindow();
        FXMLLoader loader = new FXMLLoader(MessageThreadsListSceneController.class.getResource("MessageThreadsListScene.fxml"));
        Scene newScene = new Scene(loader.load());
        MessageThreadsListSceneController controllerClass = loader.getController();
        controllerClass.initializeScene(user);
        currentStage.setScene(newScene);
    }

    @FXML
    private void incidentAnalysisButtonOnClick(ActionEvent event) throws IOException {
        Button button = (Button) event.getSource();
        Scene currentScene = button.getScene();
        Stage currentStage = (Stage) currentScene.getWindow();
        FXMLLoader loader = new FXMLLoader(IncidentReportingAndTrackingSceneController.class.getResource("IncidentReportAndTrackingScene.fxml"));
        Scene newScene = new Scene(loader.load());
        IncidentReportingAndTrackingSceneController controllerClass = loader.getController();
        controllerClass.initializeScene(user);
        currentStage.setScene(newScene);
    }

    @FXML
    private void reportGenerationButtonOnClick(ActionEvent event) throws IOException {
        Button button = (Button) event.getSource();
        Scene currentScene = button.getScene();
        Stage currentStage = (Stage) currentScene.getWindow();
        FXMLLoader loader = new FXMLLoader(IncidentReportingAndTrackingSceneController.class.getResource("IncidentReportAndTrackingScene.fxml"));
        Scene newScene = new Scene(loader.load());
        IncidentReportingAndTrackingSceneController controllerClass = loader.getController();
        controllerClass.initializeScene(user);
        currentStage.setScene(newScene);
    }

    @FXML
    private void resourceAllocationButtonOnClick(ActionEvent event) throws IOException {
        Button button = (Button) event.getSource();
        Scene currentScene = button.getScene();
        Stage currentStage = (Stage) currentScene.getWindow();
        FXMLLoader loader = new FXMLLoader(IncidentReportingAndTrackingSceneController.class.getResource("IncidentReportAndTrackingScene.fxml"));
        Scene newScene = new Scene(loader.load());
        IncidentReportingAndTrackingSceneController controllerClass = loader.getController();
        controllerClass.initializeScene(user);
        currentStage.setScene(newScene);
    }

    @FXML
    private void emergencyServiceButtonOnClick(ActionEvent event) throws IOException {
        Button button = (Button) event.getSource();
        Scene currentScene = button.getScene();
        Stage currentStage = (Stage) currentScene.getWindow();
        FXMLLoader loader = new FXMLLoader(IncidentReportingAndTrackingSceneController.class.getResource("IncidentReportAndTrackingScene.fxml"));
        Scene newScene = new Scene(loader.load());
        IncidentReportingAndTrackingSceneController controllerClass = loader.getController();
        controllerClass.initializeScene(user);
        currentStage.setScene(newScene);
    }

    @FXML
    private void incidentDatabaseButtonOnClick(ActionEvent event) throws IOException {
        Button button = (Button) event.getSource();
        Scene currentScene = button.getScene();
        Stage currentStage = (Stage) currentScene.getWindow();
        FXMLLoader loader = new FXMLLoader(IncidentReportingAndTrackingSceneController.class.getResource("IncidentReportAndTrackingScene.fxml"));
        Scene newScene = new Scene(loader.load());
        IncidentReportingAndTrackingSceneController controllerClass = loader.getController();
        controllerClass.initializeScene(user);
        currentStage.setScene(newScene);
    }

    @FXML
    private void incidentRecoveryButtonOnClick(ActionEvent event) throws IOException {
        Button button = (Button) event.getSource();
        Scene currentScene = button.getScene();
        Stage currentStage = (Stage) currentScene.getWindow();
        FXMLLoader loader = new FXMLLoader(IncidentReportingAndTrackingSceneController.class.getResource("IncidentReportAndTrackingScene.fxml"));
        Scene newScene = new Scene(loader.load());
        IncidentReportingAndTrackingSceneController controllerClass = loader.getController();
        controllerClass.initializeScene(user);
        currentStage.setScene(newScene);
    }
    
}
