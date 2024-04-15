/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package hasibul;

import hasibul.modelclasses.CommercialDriver;
import hasibul.modelclasses.EmergencyAssistanceRequest;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Dell
 */
public class EmergencyAssistanceRequestPopUpSceneController implements Initializable {

    @FXML
    private TextArea locationTextArea;
    CommercialDriver user;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void requestEmergencyAssistanceButtonOnClick(ActionEvent event) throws IOException {
        EmergencyAssistanceRequest request = new EmergencyAssistanceRequest(this.user, locationTextArea.getText());
        request.saveNewToDatabase();
        
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setContentText("Help is on the way. Please wait.");
        alert.showAndWait();
        
        Button button = (Button) event.getSource();
        Scene currentScene = button.getScene();
        
        Stage currentStage = (Stage) currentScene.getWindow();
        
        currentStage.close();
    }
    
    public void initializeScene(CommercialDriver user)
    {
        this.user = user;
    }
    
}
