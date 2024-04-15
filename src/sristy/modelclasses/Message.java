/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sristy.modelclasses;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.LocalDate;
import mainpkg.AppendableObjectOutputStream;

/**
 *
 * @author HP
 */
public class Message implements Serializable {
    private MessageThread thread;
    private String messageContent;
    private LocalDate date;
    private IncidentDepartmentManager author;

    public Message(MessageThread thread, String messageContent, LocalDate date, IncidentDepartmentManager author) {
        this.thread = thread;
        this.messageContent = messageContent;
        this.date = date;
        this.author = author;
    }

    public MessageThread getThread() {
        return thread;
    }

    public String getMessageContent() {
        return messageContent;
    }

    public LocalDate getDate() {
        return date;
    }

    public IncidentDepartmentManager getAuthor() {
        return author;
    }

    public void setMessageContent(String messageContent) {
        this.messageContent = messageContent;
    }
    
    public void saveNewToDatabase() throws IOException
    {
        File f = new File("Message.bin");
        FileOutputStream fos;
        ObjectOutputStream oos;
        
        if (f.exists())
        {
            fos = new FileOutputStream("Message.bin", true);
            oos = new AppendableObjectOutputStream(fos);
        }
        else
        {
            f.createNewFile();
            
            fos = new FileOutputStream("Message.bin");
            oos = new ObjectOutputStream(fos);
        }
        
        oos.writeObject(this);
        oos.close();
        fos.close();
    }
    
}
