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
public class AddUpdateCampaignWorkerDetailsController implements Initializable {

    @FXML
    private TextField nameTextField;
    @FXML
    private RadioButton maleRadioButton;
    @FXML
    private RadioButton femaleRadioButton;
    @FXML
    private RadioButton othersRadioButton;
    @FXML
    private TextField placeOfServiceTextField;
    @FXML
    private TextField completedNoOfCampaignsTextField;
    @FXML
    private TextField phoneNoTextField;
    @FXML
    private TableView<?> campaignWorkerDetailsTableView;
    @FXML
    private TableColumn<?, ?> nameTableColumn;
    @FXML
    private TableColumn<?, ?> genderTableColumn;
    @FXML
    private TableColumn<?, ?> placeOfServiceTableColumn;
    @FXML
    private TableColumn<?, ?> noOfCampaignsTableColumn;
    @FXML
    private TableColumn<?, ?> phoneNumberTableColumn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void addInfoButtonOnMouseClicked(ActionEvent event) {
    }

    @FXML
    private void showInfoButtonOnMouseClicked(ActionEvent event) {
    }
    
}
