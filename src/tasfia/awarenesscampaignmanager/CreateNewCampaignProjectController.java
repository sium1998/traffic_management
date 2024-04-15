/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package tasfia.awarenesscampaignmanager;

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
    private TableView<Campaign> newCampaignTableView;
    @FXML
    private TableColumn<Campaign, String> campaignTitleTableColumn;
    @FXML
    private TableColumn<Campaign, String> purposeTableColumn;
    @FXML
    private TableColumn<Campaign, String> objectiveTableColumn;
    @FXML
    private TableColumn<Campaign, String> goalsTableColumn;
    @FXML
    private TableColumn<Campaign, String> budgetTableColumn;
    @FXML
    private TableColumn<Campaign, String> startDateTableColumn;
    @FXML
    private TableColumn<Campaign, String> endDateTableColumn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       campaignTitleTableColumn.setCellValueFactory(PropertyValueFactory<Campaign, String>("Title"));
       purposeTableColumn.setCellValueFactory(PropertyValueFactory<Campaign, String>("Purpose"));
       objectiveTableColumn.setCellValueFactory(PropertyValueFactory<Campaign, String>("Objective"));
       goalsTableColumn.setCellValueFactory(PropertyValueFactory<Campaign, String>("Goals"));
       budgetTableColumn.setCellValueFactory(PropertyValueFactory<Campaign, String>("Budget"));
       startDateTableColumn.setCellValueFactory(PropertyValueFactory<Campaign, String>("start date"));
       endDateTableColumn.setCellValueFactory(PropertyValueFactory<Campaign, String>("end date"));
       


    }    

    @FXML
    private void confirmButtonOnMouseClicked(ActionEvent event) {
    }

    @FXML
    private void backButtonOnMouseclicked(ActionEvent event) {
    }
    
}
