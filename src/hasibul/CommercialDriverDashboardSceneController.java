/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package hasibul;

import hasibul.modelclasses.CommercialDriver;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import mainpkg.LoginSceneController;

/**
 * FXML Controller class
 *
 * @author Dell
 */
public class CommercialDriverDashboardSceneController implements Initializable {
    CommercialDriver user;

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
        Parent root = FXMLLoader.load(LoginSceneController.class.getResource("LoginScene.fxml"));
        Scene newScene = new Scene(root);
        currentStage.setScene(newScene);
    }
    
    public void initializeScene(CommercialDriver user)
    {
        this.user = user;
    }

    @FXML
    private void restAreaButtonOnClick(ActionEvent event) throws IOException, ClassNotFoundException {
        Button button = (Button) event.getSource();

        Scene currentScene = button.getScene();

        Stage currentStage = (Stage) currentScene.getWindow();

        FXMLLoader loader = new FXMLLoader(RestAreaAndFuelStationInformationSceneController.class.getResource("RestAreaAndFuelStationInformationScene.fxml"));

        Scene newScene = new Scene(loader.load());

        RestAreaAndFuelStationInformationSceneController controllerClass = loader.getController();
        controllerClass.initializeScene(user);

        currentStage.setScene(newScene);
    }

    @FXML
    private void trafficUpdatesButtonOnClick(ActionEvent event) throws IOException {
        Button button = (Button) event.getSource();

        Scene currentScene = button.getScene();

        Stage currentStage = (Stage) currentScene.getWindow();

        FXMLLoader loader = new FXMLLoader(TrafficUpdatesSceneController.class.getResource("TrafficUpdatesScene.fxml"));

        Scene newScene = new Scene(loader.load());

        TrafficUpdatesSceneController controllerClass = loader.getController();
        controllerClass.initializeScene(user);

        currentStage.setScene(newScene);
    }

    @FXML
    private void driverTimerButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void customizeVehicleButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void complianceNotificationsButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void hazardAlertsButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void weatherAndRoadConditionAlertsButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void emergencyAssistanceButtonOnClick(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(EmergencyAssistanceRequestPopUpSceneController.class.getResource("EmergencyAssistanceRequestPopUp.fxml"));
        Scene popup = new Scene(loader.load());
        EmergencyAssistanceRequestPopUpSceneController controllerClass = loader.getController();
        controllerClass.initializeScene(this.user);
        Stage popUpStage = new Stage();
        popUpStage.setScene(popup);
        popUpStage.show();
    }
}
