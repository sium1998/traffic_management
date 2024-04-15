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
public class EvaluateAlternateRouteController implements Initializable {

    @FXML
    private TextField mostCongestedRouteTextField;
    @FXML
    private ComboBox<?> destinationComboBox;
    @FXML
    private TextField alternateCongestedRouteTextField;
    @FXML
    private TableView<?> routeTableView;
    @FXML
    private TableColumn<?, ?> congestedRouteTableColumn;
    @FXML
    private TableColumn<?, ?> alternateRouteTableColumn;

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
