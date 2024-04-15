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
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;
import sristy.modelclasses.IncidentDepartmentManager;
import sristy.modelclasses.Message;
import sristy.modelclasses.MessageThread;

/**
 * FXML Controller class
 *
 * @author sajee
 */
public class MessageThreadsDetailsSceneController implements Initializable {

    @FXML
    private Label subjectLabel;
    @FXML
    private Label authorLabel;
    @FXML
    private Label dateLabel;
    @FXML
    private TextArea messageListTextArea;
    @FXML
    private TextArea replyTextArea;
    
    IncidentDepartmentManager incidentDepartmentManager;
    MessageThread thread;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }    

    @FXML
    private void sendReplyButtonOnClick(ActionEvent event) throws IOException {
        Message newMessage = new Message(this.thread, replyTextArea.getText(), LocalDate.now(), this.incidentDepartmentManager);
        newMessage.saveNewToDatabase();
        
        messageListTextArea.appendText("Author: " + newMessage.getAuthor().getUsername() + "\nDate: " + newMessage.getDate() + "\nMessage:\n" + newMessage.getMessageContent() + "\n-----------------------------------\n");
    }

    @FXML
    private void goBackButtonOnClick(ActionEvent event) throws IOException {
        Button button = (Button) event.getSource();  // Node
        Scene currentScene = button.getScene();
        Stage currentStage = (Stage) currentScene.getWindow();
        
        FXMLLoader loader = new FXMLLoader(MessageThreadsListSceneController.class.getResource("MessageThreadsListScene.fxml"));
        
        Scene newScene = new Scene(loader.load());
        MessageThreadsListSceneController controllerClass = loader.getController();
        
        controllerClass.initializeScene(incidentDepartmentManager);
        currentStage.setScene(newScene);
    }
    
    public void initializeScene(IncidentDepartmentManager incidentDepartmentManager, MessageThread thread) throws IOException, ClassNotFoundException
    {
        this.thread = thread;
        this.incidentDepartmentManager = incidentDepartmentManager;
        
        ArrayList<Message> allMessage = this.incidentDepartmentManager.loadAllMessageByThread(this.thread);
        System.out.println("Messages: " + allMessage);
        
        for (Message eachMessage: allMessage)
        {
            messageListTextArea.appendText("Author: " + eachMessage.getAuthor().getUsername() + "\nDate: " + eachMessage.getDate() + "\nMessage:\n" + eachMessage.getMessageContent() + "\n-----------------------------------\n");
        }
        
        subjectLabel.setText("Subject: " + thread.getSubject());
        authorLabel.setText("Author: " + thread.getAuthor().getUsername());
        dateLabel.setText("Date:  " + thread.getDateOpened());
    }
    
}
