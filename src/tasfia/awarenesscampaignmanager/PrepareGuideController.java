/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package awarenesscampaignmanager;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author tasfi
 */
public class PrepareGuideController implements Initializable {

    @FXML
    private TextField carPoolTextField;
    @FXML
    private TextField bicyclingTextField;
    @FXML
    private TextField walkingTextField;
    @FXML
    private TextField choiceOfRightCarTextField;
    @FXML
    private TextField electricVehiclesTextField;
    @FXML
    private TextField dangersTextField;
    @FXML
    private TextField additionalNotesTextField;
    @FXML
    private TextField importanceOfReducingCarbonEmissionTextField;
    @FXML
    private TextField percentageOfCarbonEmittedTextField;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void confirmButtonOnMouseClicked(ActionEvent event) {
    }
    
}
