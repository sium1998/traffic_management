/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package hasibul;

import hasibul.modelclasses.RoadDataTableClass;
import hasibul.modelclasses.RoadData;
import hasibul.modelclasses.CommercialDriver;
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

/**
 * FXML Controller class
 *
 * @author Dell
 */
public class TrafficUpdatesSceneController implements Initializable {

    @FXML
    private TableView<RoadDataTableClass> trafficUpdatesTableView;
    @FXML
    private TableColumn<RoadDataTableClass, String> roadNumberTableColumn;
    @FXML
    private TableColumn<RoadDataTableClass, String> roadStatusTableColumn;
    
    private CommercialDriver commercialDriverUser;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        roadNumberTableColumn.setCellValueFactory(new PropertyValueFactory<>("roadNumber"));
        roadStatusTableColumn.setCellValueFactory(new PropertyValueFactory<>("roadStatus"));
    }

    @FXML
    private void backToDashboardButtonOnClick(ActionEvent event) throws IOException {
        Button button = (Button) event.getSource();
        Scene currentScene = button.getScene();
        Stage currentStage = (Stage) currentScene.getWindow();
        
        FXMLLoader loader = new FXMLLoader(CommercialDriverDashboardSceneController.class.getResource("CommercialDriverDashboardScene.fxml"));
        
        Scene newScene = new Scene(loader.load());
        
        CommercialDriverDashboardSceneController controllerClass = loader.getController();
        controllerClass.initializeScene(commercialDriverUser);

        currentStage.setScene(newScene);
    }

    void initializeScene(CommercialDriver user) {
        this.commercialDriverUser = user;
        
        try {
            ArrayList<RoadData> allRoadData = commercialDriverUser.loadAllRoadDataFromDatabase();
            
            for (RoadData eachRoadData: allRoadData)
            {
                trafficUpdatesTableView.getItems().addAll(new RoadDataTableClass(eachRoadData.getRoadNumber(), eachRoadData.getStatus()));
            }
            
        } catch (IOException ex) {
            Logger.getLogger(TrafficUpdatesSceneController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TrafficUpdatesSceneController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
