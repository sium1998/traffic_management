/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package mainpkg;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import sristy.IncidentDepartmentManagerDashboardSceneController;
import sristy.modelclasses.IncidentDepartmentManager;

/**
 *
 * @author HP
 */
public class LoginSceneController implements Initializable {
    
    @FXML
    private PasswordField passwordPasswordField;
    @FXML
    private ComboBox<String> usertypeComboBox;
    @FXML
    private TextField usernameTextField;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        usertypeComboBox.getItems().addAll("Incident Department Manager","Banking Manager","Commercial Driver","App Supporting Manager","Traffic Engineer","BRTA Representative","Traffic Sergeant","Awareness campaign manager");
    }    

    @FXML
    private void loginButtonOnClick(ActionEvent event) throws IOException, FileNotFoundException, ClassNotFoundException {
        if (usertypeComboBox.getSelectionModel().getSelectedItem().equals("Incident Department Manager"))
        {
            IncidentDepartmentManager user = new IncidentDepartmentManager();
            user = user.loadByUsername(usernameTextField.getText());
            if (user != null)
            {
                if (user.checkPassword(passwordPasswordField.getText()))
                {
                    Button button = (Button) event.getSource();

                    Scene currentScene = button.getScene();

                    Stage currentStage = (Stage) currentScene.getWindow();

                    FXMLLoader loader = new FXMLLoader(IncidentDepartmentManagerDashboardSceneController.class.getResource("IncidentDepartmentManagerDashboardScene.fxml"));

                    Scene newScene = new Scene(loader.load());

                    IncidentDepartmentManagerDashboardSceneController controllerClass = loader.getController();
                    controllerClass.initializeScene(user);

                    currentStage.setScene(newScene);
                }
                else
                {
                    Alert alert = new Alert(AlertType.ERROR);
                    alert.setContentText("Password does not match");
                    alert.showAndWait();
                }
            }
            else
            {
                Alert alert = new Alert(AlertType.ERROR);
                alert.setContentText("User not found");
                alert.showAndWait();
            }
        }
    }
    
}
