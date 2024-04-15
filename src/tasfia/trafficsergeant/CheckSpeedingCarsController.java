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
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author tasfi
 */
public class CheckSpeedingCarsController implements Initializable {

    @FXML
    private TextField vehicleNumberTextField;
    @FXML
    private TextField speedTextField;
    @FXML
    private TextField locationTextField;
    @FXML
    private DatePicker dateDatePicker;
    @FXML
    private TableView<?> speedingCarTableView;
    @FXML
    private TableColumn<?, ?> vehicleNumberTableColumn;
    @FXML
    private TableColumn<?, ?> speedTableColumn;
    @FXML
    private TableColumn<?, ?> locationTableColumn;
    @FXML
    private TableColumn<?, ?> dateTableColumn;

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

    @FXML
    private void showButtonOnMouseClicked(ActionEvent event) {
    }
    
}
