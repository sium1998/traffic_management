/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package awarenesscampaignmanager;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import tasfia.awarenesscampaignmanager.CampaignWorker;

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
    private TableView<CampaignWorker> campaignWorkerDetailsTableView;
    @FXML
    private TableColumn<CampaignWorker, String> nameTableColumn;
    @FXML
    private TableColumn<CampaignWorker, String> genderTableColumn;
    @FXML
    private TableColumn<CampaignWorker, String> placeOfServiceTableColumn;
    @FXML
    private TableColumn<CampaignWorker, String> noOfCampaignsTableColumn;
    @FXML
    private TableColumn<CampaignWorker, String> phoneNumberTableColumn;
    
    ToggleGroup tg1,tg2,tg3;
    ArrayList<CampaignWorker> campList; 

   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        tg1= new ToggleGroup();
        tg2= new ToggleGroup();
        tg3= new ToggleGroup();


        maleRadioButton.setToggleGroup(tg1);
        femaleRadioButton.setToggleGroup(tg2);
        othersRadioButton.setToggleGroup(tg3);

    }    

    @FXML
    private void addInfoButtonOnMouseClicked(ActionEvent event) {
    }

    @FXML
    private void showInfoButtonOnMouseClicked(ActionEvent event) {
    }

    @FXML
    private void backButtonOnMouseClicked(ActionEvent event) {
        
    }
    
}
