/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package sristy;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import sristy.modelclasses.IncidentDepartmentManager;
import sristy.modelclasses.IncidentReport;
import sristy.modelclasses.IncidentReportTableData;

/**
 * FXML Controller class
 *
 * @author HP
 */
public class IncidentReportingAndTrackingSceneController implements Initializable {

    @FXML
    private TableView<IncidentReportTableData> incidentReportTableView;
    @FXML
    private TableColumn<IncidentReportTableData, String> reportTitleTableColumn;
    @FXML
    private TableColumn<IncidentReportTableData, String> dateIssuedTableColumn;
    @FXML
    private TableColumn<IncidentReportTableData, String> incidentLocationTableColumn;
    @FXML
    private TableColumn<IncidentReportTableData, String> incidentTimeTableColumn;
    @FXML
    private TableColumn<IncidentReportTableData, String> incidentSeverityTableColumn;
    
    private IncidentDepartmentManager incidentDepartmentManager;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        incidentDepartmentManager = new IncidentDepartmentManager("Username", "Password");

        reportTitleTableColumn.setCellValueFactory(new PropertyValueFactory<>("reportTitle"));
        dateIssuedTableColumn.setCellValueFactory(new PropertyValueFactory<>("dateIssued"));
        incidentLocationTableColumn.setCellValueFactory(new PropertyValueFactory<>("incidentLocation"));
        incidentTimeTableColumn.setCellValueFactory(new PropertyValueFactory<>("incidentTime"));
        incidentSeverityTableColumn.setCellValueFactory(new PropertyValueFactory<>("incidentSeverity"));
        
        try {    
            ArrayList<IncidentReport> allIncidentReport = incidentDepartmentManager.loadAllIncidentReportFromDatabase();
            
            for (IncidentReport eachIncidentReport: allIncidentReport)
            {
                incidentReportTableView.getItems().addAll(new IncidentReportTableData(eachIncidentReport.getReportTitle(), eachIncidentReport.getDateIssued().toString(), eachIncidentReport.getIncidentLocation(), eachIncidentReport.getIncidentTime(), Integer.toString(eachIncidentReport.getIncidentSeverity())));
            }
            
            incidentReportTableView.refresh();
            
            System.out.println("allIncidentReport: " + allIncidentReport);
        } catch (IOException ex) {
            Logger.getLogger(IncidentReportingAndTrackingSceneController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(IncidentReportingAndTrackingSceneController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    

    @FXML
    private void backToDashboardButtonOnClick(ActionEvent event) throws IOException {
        Button button = (Button) event.getSource();
        Scene currentScene = button.getScene();
        Stage currentStage = (Stage) currentScene.getWindow();
        
        Parent root = FXMLLoader.load(IncidentDepartmentManagerDashboardSceneController.class.getResource("IncidentDepartmentManagerDashboardScene.fxml"));
        
        Scene newScene = new Scene(root);

        currentStage.setScene(newScene);
    }
    
}
