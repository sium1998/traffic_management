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
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author tasfi
 */
public class CreateShiftScheduleController implements Initializable {

    @FXML
    private DatePicker dateDatePicker;
    @FXML
    private TextField nameTextField;
    @FXML
    private TextField locationTextField;
    @FXML
    private ComboBox<?> startTimeComboBox;
    @FXML
    private TableView<?> shiftScheduleTableView;
    @FXML
    private TableColumn<?, ?> dateTableColumn;
    @FXML
    private TableColumn<?, ?> nameTableColumn;
    @FXML
    private TableColumn<?, ?> locationTableColumn;
    @FXML
    private TableColumn<?, ?> shiftHourTableColumn;
    @FXML
    private TableColumn<?, ?> startTimeTableColumn;
    @FXML
    private RadioButton twelveHourShiftRadioButton;
    @FXML
    private RadioButton tenHourShiftRadioButton;
    @FXML
    private RadioButton eightHourShiftRadioButton;

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
