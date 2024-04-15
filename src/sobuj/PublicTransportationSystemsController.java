/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Mainpkg;

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
public class PublicTransportationSystemsController implements Initializable {

    @FXML
    private Label ptsdashboard;
    @FXML
    private TextField transformationroutestextfield;
    @FXML
    private TextField schulestextfield;
    @FXML
    private TextField livelocationtextfield;
    @FXML
    private TextField riderdatatextfield;
    @FXML
    private TextField roadcontetxtfield;
    @FXML
    private TextArea outputtextarea;
    @FXML
    private Button btnclick;

    public Label getPtsdashboard() {
        return ptsdashboard;
    }

    public void setPtsdashboard(Label ptsdashboard) {
        this.ptsdashboard = ptsdashboard;
    }

    public TextField getTransformationroutestextfield() {
        return transformationroutestextfield;
    }

    public void setTransformationroutestextfield(TextField transformationroutestextfield) {
        this.transformationroutestextfield = transformationroutestextfield;
    }

    public TextField getSchulestextfield() {
        return schulestextfield;
    }

    public void setSchulestextfield(TextField schulestextfield) {
        this.schulestextfield = schulestextfield;
    }

    public TextField getLivelocationtextfield() {
        return livelocationtextfield;
    }

    public void setLivelocationtextfield(TextField livelocationtextfield) {
        this.livelocationtextfield = livelocationtextfield;
    }

    public TextField getRiderdatatextfield() {
        return riderdatatextfield;
    }

    public void setRiderdatatextfield(TextField riderdatatextfield) {
        this.riderdatatextfield = riderdatatextfield;
    }

    public TextField getRoadcontetxtfield() {
        return roadcontetxtfield;
    }

    public void setRoadcontetxtfield(TextField roadcontetxtfield) {
        this.roadcontetxtfield = roadcontetxtfield;
    }

    public TextArea getOutputtextarea() {
        return outputtextarea;
    }

    public void setOutputtextarea(TextArea outputtextarea) {
        this.outputtextarea = outputtextarea;
    }

    public Button getBtnclick() {
        return btnclick;
    }

    public void setBtnclick(Button btnclick) {
        this.btnclick = btnclick;
    }

    public PublicTransportationSystemsController(Label ptsdashboard, TextField transformationroutestextfield, TextField schulestextfield, TextField livelocationtextfield, TextField riderdatatextfield, TextField roadcontetxtfield, TextArea outputtextarea, Button btnclick) {
        this.ptsdashboard = ptsdashboard;
        this.transformationroutestextfield = transformationroutestextfield;
        this.schulestextfield = schulestextfield;
        this.livelocationtextfield = livelocationtextfield;
        this.riderdatatextfield = riderdatatextfield;
        this.roadcontetxtfield = roadcontetxtfield;
        this.outputtextarea = outputtextarea;
        this.btnclick = btnclick;
    }

    @Override
    public String toString() {
        return "PublicTransportationSystemsController{" + "ptsdashboard=" + ptsdashboard + ", transformationroutestextfield=" + transformationroutestextfield + ", schulestextfield=" + schulestextfield + ", livelocationtextfield=" + livelocationtextfield + ", riderdatatextfield=" + riderdatatextfield + ", roadcontetxtfield=" + roadcontetxtfield + ", outputtextarea=" + outputtextarea + ", btnclick=" + btnclick + '}';
    }

   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
