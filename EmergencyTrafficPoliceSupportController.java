/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */

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
public class EmergencyTrafficPoliceSupportController implements Initializable {

    @FXML
    private TextField nametextfield;
    @FXML
    private TextField livelocationtextfield;
    @FXML
    private TextField addresstextfield;
    @FXML
    private ComboBox<String> vehcletypecombobox;
    @FXML
    private TextArea problemtextarea;
    @FXML
    private Button submitbtn;
    @FXML
    private TextField numtextfield;

    public TextField getNametextfield() {
        return nametextfield;
    }

    public void setNametextfield(TextField nametextfield) {
        this.nametextfield = nametextfield;
    }

    public TextField getLivelocationtextfield() {
        return livelocationtextfield;
    }

    public void setLivelocationtextfield(TextField livelocationtextfield) {
        this.livelocationtextfield = livelocationtextfield;
    }

    public TextField getAddresstextfield() {
        return addresstextfield;
    }

    public void setAddresstextfield(TextField addresstextfield) {
        this.addresstextfield = addresstextfield;
    }

    public ComboBox<String> getVehcletypecombobox() {
        return vehcletypecombobox;
    }

    public void setVehcletypecombobox(ComboBox<String> vehcletypecombobox) {
        this.vehcletypecombobox = vehcletypecombobox;
    }

    public TextArea getProblemtextarea() {
        return problemtextarea;
    }

    public void setProblemtextarea(TextArea problemtextarea) {
        this.problemtextarea = problemtextarea;
    }

    public Button getSubmitbtn() {
        return submitbtn;
    }

    public void setSubmitbtn(Button submitbtn) {
        this.submitbtn = submitbtn;
    }

    public TextField getNumtextfield() {
        return numtextfield;
    }

    public void setNumtextfield(TextField numtextfield) {
        this.numtextfield = numtextfield;
    }

    public EmergencyTrafficPoliceSupportController(TextField nametextfield, TextField livelocationtextfield, TextField addresstextfield, ComboBox<?> vehcletypecombobox, TextArea problemtextarea, Button submitbtn, TextField numtextfield) {
        this.nametextfield = nametextfield;
        this.livelocationtextfield = livelocationtextfield;
        this.addresstextfield = addresstextfield;
        this.vehcletypecombobox = vehcletypecombobox;
        this.problemtextarea = problemtextarea;
        this.submitbtn = submitbtn;
        this.numtextfield = numtextfield;
    }

    @Override
    public String toString() {
        return "EmergencyTrafficPoliceSupportController{" + "nametextfield=" + nametextfield + ", livelocationtextfield=" + livelocationtextfield + ", addresstextfield=" + addresstextfield + ", vehcletypecombobox=" + vehcletypecombobox + ", problemtextarea=" + problemtextarea + ", submitbtn=" + submitbtn + ", numtextfield=" + numtextfield + '}';
    }

   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
