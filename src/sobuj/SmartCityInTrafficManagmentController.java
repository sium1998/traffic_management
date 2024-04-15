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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author User
 */
public class SmartCityInTrafficManagmentController implements Initializable {

    @FXML
    private Label welcomedashboard;
    @FXML
    private TextField citynametextfield;
    @FXML
    private TextField trafficareatextfield;
    @FXML
    private TextField trafficcondtextfield;
    @FXML
    private TextField citymayortextfield;
    @FXML
    private TextField officernametextfield;
    @FXML
    private TextField ptitextfield;
    @FXML
    private TableView<?> informationallview;
    @FXML
    private TableColumn<string, string> citytablecol;
    @FXML
    private TableColumn<string, string> trafficareatablecol;
    @FXML
    private TableColumn<string, string> officertablecol;
    @FXML
    private TableColumn<string, string> mayortablecol;
    @FXML
    private TableColumn<string, string> trafficcondtablecol;
    @FXML
    private TableColumn<string, string> ptntablecol;
    @FXML
    private TableColumn<string, string> closeroadtablecol;
    @FXML
    private Button submitbutton;
    @FXML
    private TextArea livemapstextarea;
    @FXML
    private TextArea cameraandmonitextarea;
    @FXML
    private Label allinform;
    @FXML
    private DatePicker datepicker;

    public Label getWelcomedashboard() {
        return welcomedashboard;
    }

    public void setWelcomedashboard(Label welcomedashboard) {
        this.welcomedashboard = welcomedashboard;
    }

    public TextField getCitynametextfield() {
        return citynametextfield;
    }

    public void setCitynametextfield(TextField citynametextfield) {
        this.citynametextfield = citynametextfield;
    }

    public TextField getTrafficareatextfield() {
        return trafficareatextfield;
    }

    public void setTrafficareatextfield(TextField trafficareatextfield) {
        this.trafficareatextfield = trafficareatextfield;
    }

    public TextField getTrafficcondtextfield() {
        return trafficcondtextfield;
    }

    public void setTrafficcondtextfield(TextField trafficcondtextfield) {
        this.trafficcondtextfield = trafficcondtextfield;
    }

    public TextField getCitymayortextfield() {
        return citymayortextfield;
    }

    public void setCitymayortextfield(TextField citymayortextfield) {
        this.citymayortextfield = citymayortextfield;
    }

    public TextField getOfficernametextfield() {
        return officernametextfield;
    }

    public void setOfficernametextfield(TextField officernametextfield) {
        this.officernametextfield = officernametextfield;
    }

    public TextField getPtitextfield() {
        return ptitextfield;
    }

    public void setPtitextfield(TextField ptitextfield) {
        this.ptitextfield = ptitextfield;
    }

    public TableView<?> getInformationallview() {
        return informationallview;
    }

    public void setInformationallview(TableView<?> informationallview) {
        this.informationallview = informationallview;
    }

    public TableColumn<?, ?> getCitytablecol() {
        return citytablecol;
    }

    public void setCitytablecol(TableColumn<string, string> citytablecol) {
        this.citytablecol = citytablecol;
    }

    public TableColumn<string, string> getTrafficareatablecol() {
        return trafficareatablecol;
    }

    public void setTrafficareatablecol(TableColumn<string, string> trafficareatablecol) {
        this.trafficareatablecol = trafficareatablecol;
    }

    public TableColumn<string, string> getOfficertablecol() {
        return officertablecol;
    }

    public void setOfficertablecol(TableColumn<string, string> officertablecol) {
        this.officertablecol = officertablecol;
    }

    public TableColumn<string, string> getMayortablecol() {
        return mayortablecol;
    }

    public void setMayortablecol(TableColumn<string, string> mayortablecol) {
        this.mayortablecol = mayortablecol;
    }

    public TableColumn<string, string> getTrafficcondtablecol() {
        return trafficcondtablecol;
    }

    public void setTrafficcondtablecol(TableColumn<string, string> trafficcondtablecol) {
        this.trafficcondtablecol = trafficcondtablecol;
    }

    public TableColumn<string, string> getPtntablecol() {
        return ptntablecol;
    }

    public void setPtntablecol(TableColumn<string, string> ptntablecol) {
        this.ptntablecol = ptntablecol;
    }

    public TableColumn<string, string> getCloseroadtablecol() {
        return closeroadtablecol;
    }

    public void setCloseroadtablecol(TableColumn<string, string> closeroadtablecol) {
        this.closeroadtablecol = closeroadtablecol;
    }

    public Button getSubmitbutton() {
        return submitbutton;
    }

    public void setSubmitbutton(Button submitbutton) {
        this.submitbutton = submitbutton;
    }

    public TextArea getLivemapstextarea() {
        return livemapstextarea;
    }

    public void setLivemapstextarea(TextArea livemapstextarea) {
        this.livemapstextarea = livemapstextarea;
    }

    public TextArea getCameraandmonitextarea() {
        return cameraandmonitextarea;
    }

    public void setCameraandmonitextarea(TextArea cameraandmonitextarea) {
        this.cameraandmonitextarea = cameraandmonitextarea;
    }

    public Label getAllinform() {
        return allinform;
    }

    public void setAllinform(Label allinform) {
        this.allinform = allinform;
    }

    public DatePicker getDatepicker() {
        return datepicker;
    }

    public void setDatepicker(DatePicker datepicker) {
        this.datepicker = datepicker;
    }

    @Override
    public String toString() {
        return "SmartCityInTrafficManagmentController{" + "welcomedashboard=" + welcomedashboard + ", citynametextfield=" + citynametextfield + ", trafficareatextfield=" + trafficareatextfield + ", trafficcondtextfield=" + trafficcondtextfield + ", citymayortextfield=" + citymayortextfield + ", officernametextfield=" + officernametextfield + ", ptitextfield=" + ptitextfield + ", informationallview=" + informationallview + ", citytablecol=" + citytablecol + ", trafficareatablecol=" + trafficareatablecol + ", officertablecol=" + officertablecol + ", mayortablecol=" + mayortablecol + ", trafficcondtablecol=" + trafficcondtablecol + ", ptntablecol=" + ptntablecol + ", closeroadtablecol=" + closeroadtablecol + ", submitbutton=" + submitbutton + ", livemapstextarea=" + livemapstextarea + ", cameraandmonitextarea=" + cameraandmonitextarea + ", allinform=" + allinform + ", datepicker=" + datepicker + '}';
    }

    public SmartCityInTrafficManagmentController(Label welcomedashboard, TextField citynametextfield, TextField trafficareatextfield, TextField trafficcondtextfield, TextField citymayortextfield, TextField officernametextfield, TextField ptitextfield, TableView<?> informationallview, TableColumn<?, ?> citytablecol, TableColumn<?, ?> trafficareatablecol, TableColumn<?, ?> officertablecol, TableColumn<?, ?> mayortablecol, TableColumn<?, ?> trafficcondtablecol, TableColumn<?, ?> ptntablecol, TableColumn<?, ?> closeroadtablecol, Button submitbutton, TextArea livemapstextarea, TextArea cameraandmonitextarea, Label allinform, DatePicker datepicker) {
        this.welcomedashboard = welcomedashboard;
        this.citynametextfield = citynametextfield;
        this.trafficareatextfield = trafficareatextfield;
        this.trafficcondtextfield = trafficcondtextfield;
        this.citymayortextfield = citymayortextfield;
        this.officernametextfield = officernametextfield;
        this.ptitextfield = ptitextfield;
        this.informationallview = informationallview;
        this.citytablecol = (TableColumn<string, string>) citytablecol;
        this.trafficareatablecol = (TableColumn<string, string>) trafficareatablecol;
        this.officertablecol = (TableColumn<string, string>) officertablecol;
        this.mayortablecol = (TableColumn<string, string>) mayortablecol;
        this.trafficcondtablecol = (TableColumn<string, string>) trafficcondtablecol;
        this.ptntablecol = (TableColumn<string, string>) ptntablecol;
        this.closeroadtablecol = (TableColumn<string, string>) closeroadtablecol;
        this.submitbutton = submitbutton;
        this.livemapstextarea = livemapstextarea;
        this.cameraandmonitextarea = cameraandmonitextarea;
        this.allinform = allinform;
        this.datepicker = datepicker;
    }

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
