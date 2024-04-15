/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package hasibul;

import hasibul.modelclasses.CommercialDriver;
import hasibul.modelclasses.RestStation;
import hasibul.modelclasses.RestStationTableData;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
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
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Dell
 */
public class RestAreaAndFuelStationInformationSceneController implements Initializable {

    @FXML
    private TableView<RestStationTableData> restStationTableView;
    @FXML
    private TableColumn<RestStationTableData, String> nameTableColumn;
    @FXML
    private TableColumn<RestStationTableData, String> locationTableColumn;
    @FXML
    private TableColumn<RestStationTableData, String> typeTableColumn;
    @FXML
    private ComboBox<String> cityComboBox;
    @FXML
    private ComboBox<String> areaComboBox;
    
    CommercialDriver commercialDriverUser;
    ArrayList<RestStation> allRestStation;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        nameTableColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        locationTableColumn.setCellValueFactory(new PropertyValueFactory<>("location"));
        typeTableColumn.setCellValueFactory(new PropertyValueFactory<>("type"));
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

    @FXML
    private void showButtonOnClick(ActionEvent event) {
        restStationTableView.getItems().clear();
        
        for (RestStation eachRestStation: this.allRestStation)
        {
            if (eachRestStation.getCity().equals(cityComboBox.getSelectionModel().getSelectedItem()))
            {
                if (eachRestStation.getArea().equals(areaComboBox.getSelectionModel().getSelectedItem()))
                {
                    restStationTableView.getItems().add(new RestStationTableData(eachRestStation.getName(), eachRestStation.getLocation(), eachRestStation.getType()));
                }
            }
        }
    }
    
    public void initializeScene(CommercialDriver user) throws IOException, ClassNotFoundException
    {
        this.commercialDriverUser = user;
        
        this.allRestStation = this.commercialDriverUser.loadAllRestStationFromDatabase();
        
        for (RestStation eachRestStation: this.allRestStation)
        {
            if(!cityComboBox.getItems().contains(eachRestStation.getCity()))
            {
                cityComboBox.getItems().add(eachRestStation.getCity());
            }
            
            restStationTableView.getItems().add(new RestStationTableData(eachRestStation.getName(), eachRestStation.getLocation(), eachRestStation.getType()));
        }
    }

    @FXML
    private void cityComboBoxOnItemSelected(ActionEvent event) {
        areaComboBox.getItems().clear();
        for (RestStation eachRestStation: allRestStation)
        {
            if (eachRestStation.getCity().equals(cityComboBox.getSelectionModel().getSelectedItem()))
            {
                if(!areaComboBox.getItems().contains(eachRestStation.getArea()))
                {
                    areaComboBox.getItems().add(eachRestStation.getArea());
                }
            }
        }
    }
    
}
