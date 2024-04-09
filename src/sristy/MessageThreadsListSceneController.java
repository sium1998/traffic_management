/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package sristy;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import sristy.modelclasses.IncidentDepartmentManager;
import sristy.modelclasses.MessageThread;

/**
 * FXML Controller class
 *
 * @author HP
 */
public class MessageThreadsListSceneController implements Initializable {

    @FXML
    private ListView<MessageThread> threadListView;
    ArrayList<MessageThread> allMessageThread;
    IncidentDepartmentManager incidentDepartmentManager;
    @FXML
    private TextField subjectTextField;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }    

    @FXML
    private void backToDashboardButtonOnClick(ActionEvent event) throws IOException {
        Button button = (Button) event.getSource();
        
        Scene currentScene = button.getScene();
        
        Stage currentStage = (Stage) currentScene.getWindow();
        
        FXMLLoader loader = new FXMLLoader(IncidentDepartmentManagerDashboardSceneController.class.getResource("IncidentDepartmentManagerDashboardScene.fxml"));
        
        Scene newScene = new Scene(loader.load());
        IncidentDepartmentManagerDashboardSceneController controllerClass = loader.getController();
        
        controllerClass.initializeScene(incidentDepartmentManager);
        currentStage.setScene(newScene);
    }

    @FXML
    private void openThreadButtonOnClick(ActionEvent event) throws IOException, ClassNotFoundException {
        Button button = (Button) event.getSource();
        
        Scene currentScene = button.getScene();
        
        Stage currentStage = (Stage) currentScene.getWindow();
        
        FXMLLoader loader = new FXMLLoader(MessageThreadsDetailsSceneController.class.getResource("MessageThreadsDetailsScene.fxml"));
        
        Scene newScene = new Scene(loader.load());
        MessageThreadsDetailsSceneController controllerClass = loader.getController();
        
        System.out.println("Selected: " + threadListView.getSelectionModel().getSelectedItem());
        controllerClass.initializeScene(incidentDepartmentManager, threadListView.getSelectionModel().getSelectedItem());
        currentStage.setScene(newScene);
    }

    @FXML
    private void addThreadButtonOnClick(ActionEvent event) throws IOException {
        MessageThread newThread = new MessageThread(subjectTextField.getText(), incidentDepartmentManager, LocalDate.now());
        threadListView.getItems().add(newThread);
        newThread.saveNewToDatabase();
    }
    
    public void initializeScene(IncidentDepartmentManager incidentDepartmentManager)
    {
        this.incidentDepartmentManager = incidentDepartmentManager;
        
        try {
            allMessageThread = incidentDepartmentManager.loadAllMessageThreadFromDatabase();
            
            threadListView.getItems().addAll(allMessageThread);
        } catch (IOException ex) {
            Logger.getLogger(MessageThreadsListSceneController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MessageThreadsListSceneController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
