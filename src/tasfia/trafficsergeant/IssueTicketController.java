/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package trafficsergeant;

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
public class IssueTicketController implements Initializable {

    @FXML
    private TextField licensePlateNumberTextField;
    @FXML
    private TextField drivingLicenseNumberTextField;
    @FXML
    private TextField violationTextField;
    @FXML
    private TextField fineAmountTextField;
    @FXML
    private TextField deadlineOfPaymentTextField;
    @FXML
    private TextField insuranceTextField;
    @FXML
    private TextField additionalNotesTextField;

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
