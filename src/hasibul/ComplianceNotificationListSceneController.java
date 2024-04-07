/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package hasibul;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;

/**
 * FXML Controller class
 *
 * @author Dell
 */
public class ComplianceNotificationListSceneController implements Initializable {

    @FXML
    private ListView<String> notificationListView;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        notificationListView.getItems().addAll("Item 1", "Item 2");
    }    

    @FXML
    private void openNotificationButtonOnClick(ActionEvent event) {
        String selectedItem = notificationListView.getSelectionModel().getSelectedItem();
        
        System.out.println("Selected: " + selectedItem);
    }
    
}
