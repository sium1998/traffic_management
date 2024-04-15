/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author User
 */
public class SpeedMonitoringController implements Initializable {

    @FXML
    private TextField nametextfield;
    @FXML
    private TextField livelocationtextfield;
    @FXML
    private TextField managernumbertextfield;
    @FXML
    private TextField driverphntaextfield;
    @FXML
    private TextField speedtextfield;
    @FXML
    private TextField busnotextfield;
    @FXML
    private TextField thanatextfield;
    @FXML
    private TextArea monitoring;

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

    public TextField getManagernumbertextfield() {
        return managernumbertextfield;
    }

    public void setManagernumbertextfield(TextField managernumbertextfield) {
        this.managernumbertextfield = managernumbertextfield;
    }

    public TextField getDriverphntaextfield() {
        return driverphntaextfield;
    }

    public void setDriverphntaextfield(TextField driverphntaextfield) {
        this.driverphntaextfield = driverphntaextfield;
    }

    public TextField getSpeedtextfield() {
        return speedtextfield;
    }

    public void setSpeedtextfield(TextField speedtextfield) {
        this.speedtextfield = speedtextfield;
    }

    public TextField getBusnotextfield() {
        return busnotextfield;
    }

    public void setBusnotextfield(TextField busnotextfield) {
        this.busnotextfield = busnotextfield;
    }

    public TextField getThanatextfield() {
        return thanatextfield;
    }

    public void setThanatextfield(TextField thanatextfield) {
        this.thanatextfield = thanatextfield;
    }

    public TextArea getMonitoring() {
        return monitoring;
    }

    public void setMonitoring(TextArea monitoring) {
        this.monitoring = monitoring;
    }

    public SpeedMonitoringController(TextField nametextfield, TextField livelocationtextfield, TextField managernumbertextfield, TextField driverphntaextfield, TextField speedtextfield, TextField busnotextfield, TextField thanatextfield, TextArea monitoring) {
        this.nametextfield = nametextfield;
        this.livelocationtextfield = livelocationtextfield;
        this.managernumbertextfield = managernumbertextfield;
        this.driverphntaextfield = driverphntaextfield;
        this.speedtextfield = speedtextfield;
        this.busnotextfield = busnotextfield;
        this.thanatextfield = thanatextfield;
        this.monitoring = monitoring;
    }

    @Override
    public String toString() {
        return "SpeedMonitoringController{" + "nametextfield=" + nametextfield + ", livelocationtextfield=" + livelocationtextfield + ", managernumbertextfield=" + managernumbertextfield + ", driverphntaextfield=" + driverphntaextfield + ", speedtextfield=" + speedtextfield + ", busnotextfield=" + busnotextfield + ", thanatextfield=" + thanatextfield + ", monitoring=" + monitoring + '}';
    }

   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
