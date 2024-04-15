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
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author tasfi
 */
public class PlanDistributionController implements Initializable {

    @FXML
    private TextField socialMediaPlatformTextField;
    @FXML
    private TextField campaignTitleTextField;
    @FXML
    private DatePicker socialMediaPlatformsDatePicker;
    @FXML
    private TextField emailsTextField;
    @FXML
    private DatePicker emailsDatePicker;
    @FXML
    private DatePicker blogsOnWebsiteDatePicker;
    @FXML
    private TextField blogsOnWebsiteTextField;
    @FXML
    private TextField pressReleaseTextField;
    @FXML
    private DatePicker pressReleaseDateDatePicker;

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
