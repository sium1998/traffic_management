/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package mainpkg;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

/**
 *
 * @author HP
 */
public class LoginSceneController implements Initializable {
    
    @FXML
    private TextField emailTextField;
    @FXML
    private PasswordField passwordPasswordField;
    @FXML
    private ComboBox<String> usertypeComboBox;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        usertypeComboBox.getItems().addAll("Support Staff","Contact Tracers","Commercial Drivers","Administrators","Traffic Engineer","User6: BRTA Representative","Traffic Sergeant","Awareness campaign manager");
    }    

    @FXML
    private void loginButtonOnClick(ActionEvent event) {
    }
    
}
