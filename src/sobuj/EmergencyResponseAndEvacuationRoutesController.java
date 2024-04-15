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
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author User
 */
public class EmergencyResponseAndEvacuationRoutesController implements Initializable {

    @FXML
    private TextField areatextfield;
    @FXML
    private TextField officernametextfield;
    @FXML
    private TextField thanatextfield;
    @FXML
    private TextField hospitaltextfield;
    @FXML
    private TextField ambulancetextfield;
    @FXML
    private TextField officernumtextfield;
    @FXML
    private ComboBox<String> vehicletypecombobox;
    @FXML
    private TextField accidentsdatetextfield;
    @FXML
    private Button allinfbtn;
    @FXML
    private TextArea outputtextarea;
    @FXML
    private TextField livelocationtextfield;

    public TextField getAreatextfield() {
        return areatextfield;
    }

    public void setAreatextfield(TextField areatextfield) {
        this.areatextfield = areatextfield;
    }

    public TextField getOfficernametextfield() {
        return officernametextfield;
    }

    public void setOfficernametextfield(TextField officernametextfield) {
        this.officernametextfield = officernametextfield;
    }

    public TextField getThanatextfield() {
        return thanatextfield;
    }

    public void setThanatextfield(TextField thanatextfield) {
        this.thanatextfield = thanatextfield;
    }

    public TextField getHospitaltextfield() {
        return hospitaltextfield;
    }

    public void setHospitaltextfield(TextField hospitaltextfield) {
        this.hospitaltextfield = hospitaltextfield;
    }

    public TextField getAmbulancetextfield() {
        return ambulancetextfield;
    }

    public void setAmbulancetextfield(TextField ambulancetextfield) {
        this.ambulancetextfield = ambulancetextfield;
    }

    public TextField getOfficernumtextfield() {
        return officernumtextfield;
    }

    public void setOfficernumtextfield(TextField officernumtextfield) {
        this.officernumtextfield = officernumtextfield;
    }

    public ComboBox<String> getVehicletypecombobox() {
        return vehicletypecombobox;
    }

    public void setVehicletypecombobox(ComboBox<String> vehicletypecombobox) {
        this.vehicletypecombobox = vehicletypecombobox;
    }

    public TextField getAccidentsdatetextfield() {
        return accidentsdatetextfield;
    }

    public void setAccidentsdatetextfield(TextField accidentsdatetextfield) {
        this.accidentsdatetextfield = accidentsdatetextfield;
    }

    public Button getAllinfbtn() {
        return allinfbtn;
    }

    public void setAllinfbtn(Button allinfbtn) {
        this.allinfbtn = allinfbtn;
    }

    public TextArea getOutputtextarea() {
        return outputtextarea;
    }

    public void setOutputtextarea(TextArea outputtextarea) {
        this.outputtextarea = outputtextarea;
    }

    public TextField getLivelocationtextfield() {
        return livelocationtextfield;
    }

    public void setLivelocationtextfield(TextField livelocationtextfield) {
        this.livelocationtextfield = livelocationtextfield;
    }

    public EmergencyResponseAndEvacuationRoutesController(TextField areatextfield, TextField officernametextfield, TextField thanatextfield, TextField hospitaltextfield, TextField ambulancetextfield, TextField officernumtextfield, ComboBox<String> vehicletypecombobox, TextField accidentsdatetextfield, Button allinfbtn, TextArea outputtextarea, TextField livelocationtextfield) {
        this.areatextfield = areatextfield;
        this.officernametextfield = officernametextfield;
        this.thanatextfield = thanatextfield;
        this.hospitaltextfield = hospitaltextfield;
        this.ambulancetextfield = ambulancetextfield;
        this.officernumtextfield = officernumtextfield;
        this.vehicletypecombobox = vehicletypecombobox;
        this.accidentsdatetextfield = accidentsdatetextfield;
        this.allinfbtn = allinfbtn;
        this.outputtextarea = outputtextarea;
        this.livelocationtextfield = livelocationtextfield;
    }

    @Override
    public String toString() {
        return "EmergencyResponseAndEvacuationRoutesController{" + "areatextfield=" + areatextfield + ", officernametextfield=" + officernametextfield + ", thanatextfield=" + thanatextfield + ", hospitaltextfield=" + hospitaltextfield + ", ambulancetextfield=" + ambulancetextfield + ", officernumtextfield=" + officernumtextfield + ", vehicletypecombobox=" + vehicletypecombobox + ", accidentsdatetextfield=" + accidentsdatetextfield + ", allinfbtn=" + allinfbtn + ", outputtextarea=" + outputtextarea + ", livelocationtextfield=" + livelocationtextfield + '}';
    }

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
