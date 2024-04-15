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
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author tasfi
 */
public class EducatePedestriansController implements Initializable {

    @FXML
    private TextField locationTextField;
    @FXML
    private RadioButton seniorRadioButton;
    @FXML
    private RadioButton studentRadioButton;
    @FXML
    private RadioButton touristRadioButton;
    @FXML
    private TextField crosswalkRulesTextField;
    @FXML
    private TextField trafficSignalMeaningsTextField;
    @FXML
    private TextField safetyTipsTextField;
    @FXML
    private TextField messageTextField;
    @FXML
    private TableView<?> pedestrianTableView;
    @FXML
    private TableColumn<?, ?> locationTableColumn;
    @FXML
    private TableColumn<?, ?> targetAudienceTableColumn;
    @FXML
    private TableColumn<?, ?> trafficSignalMeaningsTableColumn;
    @FXML
    private TableColumn<?, ?> crosswalkRulesTableColumn;
    @FXML
    private TableColumn<?, ?> safetyTipsTableColumn;
    @FXML
    private TableColumn<?, ?> messageTableColumn;

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
