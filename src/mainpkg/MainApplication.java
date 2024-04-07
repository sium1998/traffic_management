/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML.java to edit this template
 */
package mainpkg;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sristy.*;
import hasibul.*;
import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import sristy.modelclasses.IncidentReport;

/**
 *
 * @author Dell
 */
public class MainApplication extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(IncidentReportingAndTrackingSceneController.class.getResource("IncidentReportingAndTrackingScene.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        initializeRoadData();
        initializeIncidentReports();

        launch(args);
    }
    
    private static void initializeRoadData() throws IOException
    {
        File f = new File("RoadData.bin");
        if (f.exists())
        {
            f.delete();
        }
        
        RoadData rd = new RoadData("Road 1", "Open");
        rd.saveNewToDatabase();
        
        rd = new RoadData("Road 2", "Closed");
        rd.saveNewToDatabase();
        
        rd = new RoadData("Road 3", "Blocked due to Emergency");
        rd.saveNewToDatabase();
        
        rd = new RoadData("Road 4", "Blocked due to Disaster");
        rd.saveNewToDatabase();
    }
    
    private static void initializeIncidentReports() throws IOException
    {
        File f = new File("IncidentReport.bin");
        if (f.exists())
        {
            f.delete();
        }
        
        IncidentReport ir = new IncidentReport("Title 1", LocalDate.now(), "Dhaka", "11:50 PM", 1);
        ir.saveNewToDatabase();
        
        ir = new IncidentReport("Title 2", LocalDate.now(), "Barishal", "11:50 PM", 2);
        ir.saveNewToDatabase();
        
        ir = new IncidentReport("Title 3", LocalDate.now(), "Comilla", "11:50 PM", 3);
        ir.saveNewToDatabase();
        
        ir = new IncidentReport("Title 4", LocalDate.now(), "Noakhali", "11:50 PM", 4);
        ir.saveNewToDatabase();
    }
}
