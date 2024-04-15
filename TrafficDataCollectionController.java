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
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author User
 */
public class TrafficDataCollectionController implements Initializable {

    @FXML
    private Label trafficdashboard;
    @FXML
    private TextField sppedstextfield;
    @FXML
    private TextField tvoltextfield;
    @FXML
    private ComboBox<String> vehiclecombobox;
    @FXML
    private TextField signaltextfield;
    @FXML
    private TextArea outputtextarea;
    @FXML
    private Button submitbutton;

    public Label getTrafficdashboard() {
        return trafficdashboard;
    }

    public void setTrafficdashboard(Label trafficdashboard) {
        this.trafficdashboard = trafficdashboard;
    }

    public TextField getSppedstextfield() {
        return sppedstextfield;
    }

    public void setSppedstextfield(TextField sppedstextfield) {
        this.sppedstextfield = sppedstextfield;
    }

    public TextField getTvoltextfield() {
        return tvoltextfield;
    }

    public void setTvoltextfield(TextField tvoltextfield) {
        this.tvoltextfield = tvoltextfield;
    }

    public ComboBox<String> getVehiclecombobox() {
        return vehiclecombobox;
    }

    public void setVehiclecombobox(ComboBox<String> vehiclecombobox) {
        this.vehiclecombobox = vehiclecombobox;
    }

    public TextField getSignaltextfield() {
        return signaltextfield;
    }

    public void setSignaltextfield(TextField signaltextfield) {
        this.signaltextfield = signaltextfield;
    }

    public TextArea getOutputtextarea() {
        return outputtextarea;
    }

    public void setOutputtextarea(TextArea outputtextarea) {
        this.outputtextarea = outputtextarea;
    }

    public Button getSubmitbutton() {
        return submitbutton;
    }

    public void setSubmitbutton(Button submitbutton) {
        this.submitbutton = submitbutton;
    }

    @Override
    public String toString() {
        return "TrafficDataCollectionController{" + "trafficdashboard=" + trafficdashboard + ", sppedstextfield=" + sppedstextfield + ", tvoltextfield=" + tvoltextfield + ", vehiclecombobox=" + vehiclecombobox + ", signaltextfield=" + signaltextfield + ", outputtextarea=" + outputtextarea + ", submitbutton=" + submitbutton + '}';
    }

    public TrafficDataCollectionController(Label trafficdashboard, TextField sppedstextfield, TextField tvoltextfield, ComboBox<String> vehiclecombobox, TextField signaltextfield, TextArea outputtextarea, Button submitbutton) {
        this.trafficdashboard = trafficdashboard;
        this.sppedstextfield = sppedstextfield;
        this.tvoltextfield = tvoltextfield;
        this.vehiclecombobox = vehiclecombobox;
        this.signaltextfield = signaltextfield;
        this.outputtextarea = outputtextarea;
        this.submitbutton = submitbutton;
    }

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
