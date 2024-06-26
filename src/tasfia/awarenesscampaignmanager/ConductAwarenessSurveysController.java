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
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

/**
 * FXML Controller class
 *
 * @author tasfi
 */
public class ConductAwarenessSurveysController implements Initializable {

    @FXML
    private RadioButton beforeCampaignRadioButton;
    @FXML
    private RadioButton afterCampaignRadioButton;
    @FXML
    private TextField questionOneTextField;
    @FXML
    private TextField questionTwoTextField;
    @FXML
    private TextField questionThreeTextField;
    @FXML
    private TextField questionFourTextField;
    @FXML
    private TextField questionFiveTextField;

    ToggleGroup tg1,tg2;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        tg1= new ToggleGroup();
        tg2= new ToggleGroup();
        beforeCampaignRadioButton.setToggleGroup(tg1);
        afterCampaignRadioButton.setToggleGroup(tg2);

    }    

    @FXML
    private void confirmButtonOnMouseClicked(ActionEvent event) {
    }

    @FXML
    private void backButtonOnMouseClicked(ActionEvent event) {
    }
    
}
