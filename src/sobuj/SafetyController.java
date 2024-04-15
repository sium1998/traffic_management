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
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author User
 */
public class SafetyController implements Initializable {

    @FXML
    private TextField bikelanestextfield;
    
    @FXML
    private TextField parkingpoliciestextfield;
    @FXML
    private TextField pricingtextfield;
    @FXML
    private TextField sidewalktextfield;
    @FXML
    private TextField carfreezonetextfield;
    @FXML
    private TextField crosstextfield;
    @FXML
    private TextArea outputtextarea;
    @FXML
    private Button clickbtn;

    public TextField getBikelanestextfield() {
        return bikelanestextfield;
    }

    public void setBikelanestextfield(TextField bikelanestextfield) {
        this.bikelanestextfield = bikelanestextfield;
    }

    public TextField getParkingpoliciestextfield() {
        return parkingpoliciestextfield;
    }

    public void setParkingpoliciestextfield(TextField parkingpoliciestextfield) {
        this.parkingpoliciestextfield = parkingpoliciestextfield;
    }

    public TextField getPricingtextfield() {
        return pricingtextfield;
    }

    public void setPricingtextfield(TextField pricingtextfield) {
        this.pricingtextfield = pricingtextfield;
    }

    public TextField getSidewalktextfield() {
        return sidewalktextfield;
    }

    public void setSidewalktextfield(TextField sidewalktextfield) {
        this.sidewalktextfield = sidewalktextfield;
    }

    public TextField getCarfreezonetextfield() {
        return carfreezonetextfield;
    }

    public void setCarfreezonetextfield(TextField carfreezonetextfield) {
        this.carfreezonetextfield = carfreezonetextfield;
    }

    public TextField getCrosstextfield() {
        return crosstextfield;
    }

    public void setCrosstextfield(TextField crosstextfield) {
        this.crosstextfield = crosstextfield;
    }

    public TextArea getOutputtextarea() {
        return outputtextarea;
    }

    public void setOutputtextarea(TextArea outputtextarea) {
        this.outputtextarea = outputtextarea;
    }

    public Button getClickbtn() {
        return clickbtn;
    }

    public void setClickbtn(Button clickbtn) {
        this.clickbtn = clickbtn;
    }

    public SafetyController(TextField bikelanestextfield, TextField parkingpoliciestextfield, TextField pricingtextfield, TextField sidewalktextfield, TextField carfreezonetextfield, TextField crosstextfield, TextArea outputtextarea, Button clickbtn) {
        this.bikelanestextfield = bikelanestextfield;
        this.parkingpoliciestextfield = parkingpoliciestextfield;
        this.pricingtextfield = pricingtextfield;
        this.sidewalktextfield = sidewalktextfield;
        this.carfreezonetextfield = carfreezonetextfield;
        this.crosstextfield = crosstextfield;
        this.outputtextarea = outputtextarea;
        this.clickbtn = clickbtn;
    }

    @Override
    public String toString() {
        return "SafetyController{" + "bikelanestextfield=" + bikelanestextfield + ", parkingpoliciestextfield=" + parkingpoliciestextfield + ", pricingtextfield=" + pricingtextfield + ", sidewalktextfield=" + sidewalktextfield + ", carfreezonetextfield=" + carfreezonetextfield + ", crosstextfield=" + crosstextfield + ", outputtextarea=" + outputtextarea + ", clickbtn=" + clickbtn + '}';
    }

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
