/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package tasfia.awarenesscampaignmanager;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author tasfi
 */
public class CreateCampaignSchedulesController implements Initializable {

    @FXML
    private DatePicker dateOfCampaignDatePicker;
    @FXML
    private TextField placeOfCampaignTextField;
    @FXML
    private TextField agendaOfCampaignTextField;
    @FXML
    private TextField workersAvailableTextField;
    @FXML
    private TextField timeOfCampaignTextField;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void createCampaignButtonOnMouseClicked(ActionEvent event) {
    }

    @FXML
    private void notifyWorkersButtonOnMouseClicked(ActionEvent event) {
    }

    @FXML
    private void backButtonOnMouseClicked(ActionEvent event) {
    }
    
}
