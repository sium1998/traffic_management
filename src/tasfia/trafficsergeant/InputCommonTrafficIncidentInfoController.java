/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package trafficsergeant;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author tasfi
 */
public class InputCommonTrafficIncidentInfoController implements Initializable {

    @FXML
    private TextField commonViolatedLawsTextField;
    @FXML
    private TextField majorAccidentPointsTextField;
    @FXML
    private TextField causesOfMostAccidentsTextField;
    @FXML
    private TextField numberOfAccidentsTextField;
    @FXML
    private TextField numberOfVehiclesFinedTextField;
    @FXML
    private TableView<?> incidentInfoTableView;
    @FXML
    private TableColumn<?, ?> commonViolatedLawsTableColumn;
    @FXML
    private TableColumn<?, ?> majorAccidentPointsTableColumn;
    @FXML
    private TableColumn<?, ?> causesTableColumn;
    @FXML
    private TableColumn<?, ?> numberOfAccidentsInAMonthTableColumn;
    @FXML
    private TableColumn<?, ?> numberOfVehiclesFinedInAMonthTableColumn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void updateButtonOnMouseClicked(ActionEvent event) {
    }

    @FXML
    private void showInfoButtonOnMouseClicked(ActionEvent event) {
    }
    
}
