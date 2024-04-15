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
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author tasfi
 */
public class CountPublicBusInASignalController implements Initializable {

    @FXML
    private ComboBox<String> startSignalComboBox;
    @FXML
    private ComboBox<String> endSignalComboBox;
    @FXML
    private TextField destinationTextField;
    @FXML
    private TextField noOfPublicBusTextField;
    @FXML
    private TableView<?> signalInfoTableView;
    @FXML
    private TableColumn<?, ?> endSignalTableColumn;
    @FXML
    private TableColumn<?, ?> noOfPublicBusTableColumn;

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
