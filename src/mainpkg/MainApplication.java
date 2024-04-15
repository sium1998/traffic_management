/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML.java to edit this template
 */
package mainpkg;

import hasibul.modelclasses.RoadData;
import hasibul.modelclasses.CommercialDriver;
import hasibul.modelclasses.RestStation;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import sristy.modelclasses.BankingManager;
import sristy.modelclasses.IncidentDepartmentManager;
import sristy.modelclasses.IncidentReport;
import sristy.modelclasses.MessageThread;

/**
 *
 * @author Dell
 */
public class MainApplication extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("LoginScene.fxml"));
        
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
        initializeMessageThreads();
        createDummyUsers();
        initializeRestStations();

        launch(args);
    }
    
    public static void initializeRestStations() throws IOException
    {
        File f = new File("RestStation.bin");
        if (f.exists())
        {
            f.delete();
        }
        RestStation rs = new RestStation("Station 1", "Dhaka", "Baridhara", "Baridhara Main Road", "Rest Area");
        rs.saveNewToDatabase();
        rs = new RestStation("Station 2", "Dhaka", "Baridhara", "Road 2", "Rest Area");
        rs.saveNewToDatabase();
        rs = new RestStation("Station 3", "Barishal", "Chahutpur", "Road 3", "Fuel Station");
        rs.saveNewToDatabase();
        rs = new RestStation("Station 4", "Noakhali", "Maijdee", "Main Road", "Rest Area & Fuel Station");
        rs.saveNewToDatabase();
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
    
    public static void initializeMessageThreads() throws IOException
    {
        File f = new File("MessageThread.bin");
        
        if (f.exists())
        {
            f.delete();
        }
        
        MessageThread thread = new MessageThread("Subject 1", new IncidentDepartmentManager("Author 1", "Password"), LocalDate.now());
        thread.saveNewToDatabase();
        
        thread = new MessageThread("Subject 2", new IncidentDepartmentManager("Author 2", "Password"), LocalDate.now());
        thread.saveNewToDatabase();
        
        thread = new MessageThread("Subject 3", new IncidentDepartmentManager("Author 3", "Password"), LocalDate.now());
        thread.saveNewToDatabase();
        
    }
    
    public static void createDummyUsers() throws IOException
    {
        File f;
        IncidentDepartmentManager user1;
        BankingManager user2;
        CommercialDriver user3;
        
        f = new File("IncidentDepartmentManager.bin");
        
        if (!f.exists())
        {
            user1 = new IncidentDepartmentManager("Sristy1", "abcdefg");
            user1.saveNewToDatabase();
        }
        
        f = new File("BankingManager.bin");
        
        if (!f.exists())
        {
            user2 = new BankingManager("Sristy2", "1234567");
            user2.saveNewToDatabase();
        }
        
        f = new File("CommercialDriver.bin");
        
        if (!f.exists())
        {
            user3 = new CommercialDriver("Hasibul1", "1234567");
            user3.saveNewToDatabase();
        }
    }
}
