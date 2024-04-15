/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package awarenesscampaignmanager;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author tasfi
 */
public class CreateNewCampaignProjectController implements Initializable {

    @FXML
    private TextField campaignTitleTableView;
    @FXML
    private TextField purposeTableView;
    @FXML
    private TextField objectiveTableView;
    @FXML
    private TextField goalsTableView;
    @FXML
    private TextField budgetTableView;
    @FXML
    private DatePicker startDateDatePicker;
    @FXML
    private DatePicker endDateDatePicker;
    @FXML
    private DatePicker campaignLaunchDateDatePicker;
    @FXML
    private DatePicker midpointReviewDatePicker;
    @FXML
    private TableView<?> newCampaignTableView;
    @FXML
    private TableColumn<?, ?> campaignTitleTableColumn;
    @FXML
    private TableColumn<?, ?> purposeTableColumn;
    @FXML
    private TableColumn<?, ?> objectiveTableColumn;
    @FXML
    private TableColumn<?, ?> goalsTableColumn;
    @FXML
    private TableColumn<?, ?> budgetTableColumn;
    @FXML
    private TableColumn<?, ?> startDateTableColumn;
    @FXML
    private TableColumn<?, ?> endDateTableColumn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void confirmButtonOnMouseClicked(ActionEvent event) {
    }
    
}
