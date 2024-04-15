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

/**
 * FXML Controller class
 *
 * @author User
 */
public class TrafficEngineerDasboardController implements Initializable {

    @FXML
    private Label usernamelabel;
    @FXML
    private Button smatcitybtn;
    @FXML
    private Button ptsbtn;
    @FXML
    private Button accidentsandsafetybtn;
    @FXML
    private Button trafficaccidentsbtn;
    @FXML
    private Button safetybtn;
    @FXML
    private Button environmentbtn;
    @FXML
    private Button emergencybtn;
    @FXML
    private Button logoutbtn;

    public Label getUsernamelabel() {
        return usernamelabel;
    }

    public void setUsernamelabel(Label usernamelabel) {
        this.usernamelabel = usernamelabel;
    }

    public Button getSmatcitybtn() {
        return smatcitybtn;
    }

    public void setSmatcitybtn(Button smatcitybtn) {
        this.smatcitybtn = smatcitybtn;
    }

    public Button getPtsbtn() {
        return ptsbtn;
    }

    public void setPtsbtn(Button ptsbtn) {
        this.ptsbtn = ptsbtn;
    }

    public Button getAccidentsandsafetybtn() {
        return accidentsandsafetybtn;
    }

    public void setAccidentsandsafetybtn(Button accidentsandsafetybtn) {
        this.accidentsandsafetybtn = accidentsandsafetybtn;
    }

    public Button getTrafficaccidentsbtn() {
        return trafficaccidentsbtn;
    }

    public void setTrafficaccidentsbtn(Button trafficaccidentsbtn) {
        this.trafficaccidentsbtn = trafficaccidentsbtn;
    }

    public Button getSafetybtn() {
        return safetybtn;
    }

    public void setSafetybtn(Button safetybtn) {
        this.safetybtn = safetybtn;
    }

    public Button getEnvironmentbtn() {
        return environmentbtn;
    }

    public void setEnvironmentbtn(Button environmentbtn) {
        this.environmentbtn = environmentbtn;
    }

    public Button getEmergencybtn() {
        return emergencybtn;
    }

    public void setEmergencybtn(Button emergencybtn) {
        this.emergencybtn = emergencybtn;
    }

    public Button getLogoutbtn() {
        return logoutbtn;
    }

    public void setLogoutbtn(Button logoutbtn) {
        this.logoutbtn = logoutbtn;
    }

    @Override
    public String toString() {
        return "TrafficEngineerDasboardController{" + "usernamelabel=" + usernamelabel + ", smatcitybtn=" + smatcitybtn + ", ptsbtn=" + ptsbtn + ", accidentsandsafetybtn=" + accidentsandsafetybtn + ", trafficaccidentsbtn=" + trafficaccidentsbtn + ", safetybtn=" + safetybtn + ", environmentbtn=" + environmentbtn + ", emergencybtn=" + emergencybtn + ", logoutbtn=" + logoutbtn + '}';
    }

    public TrafficEngineerDasboardController(Label usernamelabel, Button smatcitybtn, Button ptsbtn, Button accidentsandsafetybtn, Button trafficaccidentsbtn, Button safetybtn, Button environmentbtn, Button emergencybtn, Button logoutbtn) {
        this.usernamelabel = usernamelabel;
        this.smatcitybtn = smatcitybtn;
        this.ptsbtn = ptsbtn;
        this.accidentsandsafetybtn = accidentsandsafetybtn;
        this.trafficaccidentsbtn = trafficaccidentsbtn;
        this.safetybtn = safetybtn;
        this.environmentbtn = environmentbtn;
        this.emergencybtn = emergencybtn;
        this.logoutbtn = logoutbtn;
    }

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
