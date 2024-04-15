/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author User
 */
public class PassengerinformationController implements Initializable {

    @FXML
    private Label passengerlabel;
    @FXML
    private TextField nametextfield;
    @FXML
    private TextField departuretextfield;
    @FXML
    private TextField datetextfield;
    @FXML
    private TextField arrivaltextfield;
    @FXML
    private TextField emailtextfield;
    @FXML
    private TextField phnnumbertextfield;
    @FXML
    private TextField timetextfield;
    @FXML
    private TextField ecntextfield;
    @FXML
    private TextArea feedbacktextarea;
    @FXML
    private Button submitbtn;

    public Label getPassengerlabel() {
        return passengerlabel;
    }

    public void setPassengerlabel(Label passengerlabel) {
        this.passengerlabel = passengerlabel;
    }

    public TextField getNametextfield() {
        return nametextfield;
    }

    public void setNametextfield(TextField nametextfield) {
        this.nametextfield = nametextfield;
    }

    public TextField getDeparturetextfield() {
        return departuretextfield;
    }

    public void setDeparturetextfield(TextField departuretextfield) {
        this.departuretextfield = departuretextfield;
    }

    public TextField getDatetextfield() {
        return datetextfield;
    }

    public void setDatetextfield(TextField datetextfield) {
        this.datetextfield = datetextfield;
    }

    public TextField getArrivaltextfield() {
        return arrivaltextfield;
    }

    public void setArrivaltextfield(TextField arrivaltextfield) {
        this.arrivaltextfield = arrivaltextfield;
    }

    public TextField getEmailtextfield() {
        return emailtextfield;
    }

    public void setEmailtextfield(TextField emailtextfield) {
        this.emailtextfield = emailtextfield;
    }

    public TextField getPhnnumbertextfield() {
        return phnnumbertextfield;
    }

    public void setPhnnumbertextfield(TextField phnnumbertextfield) {
        this.phnnumbertextfield = phnnumbertextfield;
    }

    public TextField getTimetextfield() {
        return timetextfield;
    }

    public void setTimetextfield(TextField timetextfield) {
        this.timetextfield = timetextfield;
    }

    public TextField getEcntextfield() {
        return ecntextfield;
    }

    public void setEcntextfield(TextField ecntextfield) {
        this.ecntextfield = ecntextfield;
    }

    public TextArea getFeedbacktextarea() {
        return feedbacktextarea;
    }

    public void setFeedbacktextarea(TextArea feedbacktextarea) {
        this.feedbacktextarea = feedbacktextarea;
    }

    public Button getSubmitbtn() {
        return submitbtn;
    }

    public void setSubmitbtn(Button submitbtn) {
        this.submitbtn = submitbtn;
    }

    @Override
    public String toString() {
        return "PassengerinformationController{" + "passengerlabel=" + passengerlabel + ", nametextfield=" + nametextfield + ", departuretextfield=" + departuretextfield + ", datetextfield=" + datetextfield + ", arrivaltextfield=" + arrivaltextfield + ", emailtextfield=" + emailtextfield + ", phnnumbertextfield=" + phnnumbertextfield + ", timetextfield=" + timetextfield + ", ecntextfield=" + ecntextfield + ", feedbacktextarea=" + feedbacktextarea + ", submitbtn=" + submitbtn + '}';
    }

    public PassengerinformationController(Label passengerlabel, TextField nametextfield, TextField departuretextfield, TextField datetextfield, TextField arrivaltextfield, TextField emailtextfield, TextField phnnumbertextfield, TextField timetextfield, TextField ecntextfield, TextArea feedbacktextarea, Button submitbtn) {
        this.passengerlabel = passengerlabel;
        this.nametextfield = nametextfield;
        this.departuretextfield = departuretextfield;
        this.datetextfield = datetextfield;
        this.arrivaltextfield = arrivaltextfield;
        this.emailtextfield = emailtextfield;
        this.phnnumbertextfield = phnnumbertextfield;
        this.timetextfield = timetextfield;
        this.ecntextfield = ecntextfield;
        this.feedbacktextarea = feedbacktextarea;
        this.submitbtn = submitbtn;
    }

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
