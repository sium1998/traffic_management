/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package sristy;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author HP
 */
public class FinePaymentProcessingSceneController implements Initializable {

    @FXML
    private TableView<FinePaymentTableData> finePaymentTableView;
    @FXML
    private TableColumn<FinePaymentTableData, String> titleTableColumn;
    @FXML
    private TableColumn<FinePaymentTableData, String> dateOfIssueTableColumn;
    @FXML
    private TableColumn<FinePaymentTableData, String> infractionLocationTableColumn;
    @FXML
    private TableColumn<FinePaymentTableData, String> amountTableColumn;
    @FXML
    private TableColumn<FinePaymentTableData, String> paymentStatusTableColumn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        titleTableColumn.setCellValueFactory(new PropertyValueFactory<>("title"));
        dateOfIssueTableColumn.setCellValueFactory(new PropertyValueFactory<>("dateOfIssue"));
        infractionLocationTableColumn.setCellValueFactory(new PropertyValueFactory<>("infractionLocation"));
        amountTableColumn.setCellValueFactory(new PropertyValueFactory<>("amount"));
        paymentStatusTableColumn.setCellValueFactory(new PropertyValueFactory<>("paymentStatus"));
        
        
        finePaymentTableView.getItems().addAll(
                new FinePaymentTableData("Title 1", "12-12-12", "basha", "100", "incomplete"),
                new FinePaymentTableData("Title 1", "12-12-12", "basha", "100", "incomplete"),
                new FinePaymentTableData("Title 1", "12-12-12", "basha", "100", "incomplete"),
                new FinePaymentTableData("Title 1", "12-12-12", "basha", "100", "incomplete"),
                new FinePaymentTableData("Title 1", "12-12-12", "basha", "100", "incomplete")
        );

    }    

    @FXML
    private void backToDashboardButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void completeSelectedButtonOnClick(ActionEvent event) {
        FinePaymentTableData selectedItem = finePaymentTableView.getSelectionModel().getSelectedItem();
        selectedItem.setPaymentStatus("Completed");
        finePaymentTableView.refresh();
    }
    
}
