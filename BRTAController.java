/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author User
 */
public class BRTAController implements Initializable {

    @FXML
    private Label BRTAlabel;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void passengerinfobtnmouseonclick(ActionEvent event) throws IOException {
     
    FXMLLoader loader = new FXMLLoader(getClass().getResource("passengerinformation.fxml"));
    Parent dmOrdersceneParent = loader.load();
    Scene dmOrderscene = new Scene(dmOrdersceneParent);
    Stage dmOrderstage = (Stage)((Node)event.getSource()).getScene().getWindow(); 
    dmOrderstage.setScene(dmOrderscene);
    dmOrderstage.show();
       }
    

    @FXML
    private void publictransitmouseonclick(ActionEvent event) throws IOException {
        
        
    FXMLLoader loader = new FXMLLoader(getClass().getResource("Public transit routes.fxml"));
    Parent dmOrdersceneParent = loader.load();
    Scene dmOrderscene = new Scene(dmOrdersceneParent);
    Stage dmOrderstage = (Stage)((Node)event.getSource()).getScene().getWindow(); 
    dmOrderstage.setScene(dmOrderscene);
    dmOrderstage.show();
        
    }
    

    @FXML
    private void speedbtnmouseonclick(ActionEvent event) throws IOException {
       
        
    FXMLLoader loader = new FXMLLoader(getClass().getResource("Speed monitoring.fxml"));
    Parent dmOrdersceneParent = loader.load();
    Scene dmOrderscene = new Scene(dmOrdersceneParent);
    Stage dmOrderstage = (Stage)((Node)event.getSource()).getScene().getWindow(); 
    dmOrderstage.setScene(dmOrderscene);
    dmOrderstage.show();
        
    }
    

    @FXML
    private void safetyandsecuritymoouseonclick(ActionEvent event) throws IOException {
        
        
    FXMLLoader loader = new FXMLLoader(getClass().getResource("safety and security on public transit.fxml"));
    Parent dmOrdersceneParent = loader.load();
    Scene dmOrderscene = new Scene(dmOrdersceneParent);
    Stage dmOrderstage = (Stage)((Node)event.getSource()).getScene().getWindow(); 
    dmOrderstage.setScene(dmOrderscene);
    dmOrderstage.show();
        
    }
    

    @FXML
    private void Emergencypolicebtnmouseonclick(ActionEvent event) throws IOException {
      
        
    FXMLLoader loader = new FXMLLoader(getClass().getResource("Emergency traffic police support.fxml"));
    Parent dmOrdersceneParent = loader.load();
    Scene dmOrderscene = new Scene(dmOrdersceneParent);
    Stage dmOrderstage = (Stage)((Node)event.getSource()).getScene().getWindow(); 
    dmOrderstage.setScene(dmOrderscene);
    dmOrderstage.show();
        
    }
    

    @FXML
    private void publictransitroutesmouseonclick(ActionEvent event) throws IOException {
      
        
    FXMLLoader loader = new FXMLLoader(getClass().getResource("Public transit routes.fxml"));
    Parent dmOrdersceneParent = loader.load();
    Scene dmOrderscene = new Scene(dmOrdersceneParent);
    Stage dmOrderstage = (Stage)((Node)event.getSource()).getScene().getWindow(); 
    dmOrderstage.setScene(dmOrderscene);
    dmOrderstage.show();
        
    }
    

    @FXML
    private void logoutmouseonclick(ActionEvent event) throws IOException {
     
        
    FXMLLoader loader = new FXMLLoader(getClass().getResource("logout.fxml"));
    Parent dmOrdersceneParent = loader.load();
    Scene dmOrderscene = new Scene(dmOrdersceneParent);
    Stage dmOrderstage = (Stage)((Node)event.getSource()).getScene().getWindow(); 
    dmOrderstage.setScene(dmOrderscene);
    dmOrderstage.show();
        
    }
    
    
}
