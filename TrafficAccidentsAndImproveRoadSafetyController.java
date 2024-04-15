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
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author User
 */
public class TrafficAccidentsAndImproveRoadSafetyController implements Initializable {

    @FXML
    private Label namelabel;
    @FXML
    private TextField roadcontextfield;
    @FXML
    private TextField recordstextfield;
    @FXML
    private TextArea descriptionall;
    @FXML
    private DatePicker datepick;
    @FXML
    private TextField liveloactiontextfield;
    @FXML
    private TextField accidenrareatextfield;
    @FXML
    private TextField trafficvoltextfield;
    @FXML
    private TextArea showalloutputtextarea;
    @FXML
    private Button clickbutton;

    public Label getNamelabel() {
        return namelabel;
    }

    public void setNamelabel(Label namelabel) {
        this.namelabel = namelabel;
    }

    public TextField getRoadcontextfield() {
        return roadcontextfield;
    }

    public void setRoadcontextfield(TextField roadcontextfield) {
        this.roadcontextfield = roadcontextfield;
    }

    public TextField getRecordstextfield() {
        return recordstextfield;
    }

    public void setRecordstextfield(TextField recordstextfield) {
        this.recordstextfield = recordstextfield;
    }

    public TextArea getDescriptionall() {
        return descriptionall;
    }

    public void setDescriptionall(TextArea descriptionall) {
        this.descriptionall = descriptionall;
    }

    public DatePicker getDatepick() {
        return datepick;
    }

    public void setDatepick(DatePicker datepick) {
        this.datepick = datepick;
    }

    public TextField getLiveloactiontextfield() {
        return liveloactiontextfield;
    }

    public void setLiveloactiontextfield(TextField liveloactiontextfield) {
        this.liveloactiontextfield = liveloactiontextfield;
    }

    public TextField getAccidenrareatextfield() {
        return accidenrareatextfield;
    }

    public void setAccidenrareatextfield(TextField accidenrareatextfield) {
        this.accidenrareatextfield = accidenrareatextfield;
    }

    public TextField getTrafficvoltextfield() {
        return trafficvoltextfield;
    }

    public void setTrafficvoltextfield(TextField trafficvoltextfield) {
        this.trafficvoltextfield = trafficvoltextfield;
    }

    public TextArea getShowalloutputtextarea() {
        return showalloutputtextarea;
    }

    public void setShowalloutputtextarea(TextArea showalloutputtextarea) {
        this.showalloutputtextarea = showalloutputtextarea;
    }

    public Button getClickbutton() {
        return clickbutton;
    }

    public void setClickbutton(Button clickbutton) {
        this.clickbutton = clickbutton;
    }

    public TrafficAccidentsAndImproveRoadSafetyController(Label namelabel, TextField roadcontextfield, TextField recordstextfield, TextArea descriptionall, DatePicker datepick, TextField liveloactiontextfield, TextField accidenrareatextfield, TextField trafficvoltextfield, TextArea showalloutputtextarea, Button clickbutton) {
        this.namelabel = namelabel;
        this.roadcontextfield = roadcontextfield;
        this.recordstextfield = recordstextfield;
        this.descriptionall = descriptionall;
        this.datepick = datepick;
        this.liveloactiontextfield = liveloactiontextfield;
        this.accidenrareatextfield = accidenrareatextfield;
        this.trafficvoltextfield = trafficvoltextfield;
        this.showalloutputtextarea = showalloutputtextarea;
        this.clickbutton = clickbutton;
    }

    @Override
    public String toString() {
        return "TrafficAccidentsAndImproveRoadSafetyController{" + "namelabel=" + namelabel + ", roadcontextfield=" + roadcontextfield + ", recordstextfield=" + recordstextfield + ", descriptionall=" + descriptionall + ", datepick=" + datepick + ", liveloactiontextfield=" + liveloactiontextfield + ", accidenrareatextfield=" + accidenrareatextfield + ", trafficvoltextfield=" + trafficvoltextfield + ", showalloutputtextarea=" + showalloutputtextarea + ", clickbutton=" + clickbutton + '}';
    }

   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
