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
public class MessageThread implements Serializable {
    private String subject;
    private IncidentDepartmentManager author;
    private LocalDate dateOpened;

    public MessageThread(String subject, IncidentDepartmentManager author, LocalDate dateOpened) {
        this.subject = subject;
        this.author = author;
        this.dateOpened = dateOpened;
    }

    public LocalDate getDateOpened() {
        return dateOpened;
    }

    public void setDateOpened(LocalDate dateOpened) {
        this.dateOpened = dateOpened;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public IncidentDepartmentManager getAuthor() {
        return author;
    }
    
    @Override
    public String toString()
    {
        return this.subject;
    }
    
    public void saveNewToDatabase() throws IOException
    {
        File f = new File("MessageThread.bin");
        FileOutputStream fos;
        ObjectOutputStream oos;
        
        if (f.exists())
        {
            fos = new FileOutputStream("MessageThread.bin", true);
            oos = new AppendableObjectOutputStream(fos);
        }
        else
        {
            f.createNewFile();
            
            fos = new FileOutputStream("MessageThread.bin");
            oos = new ObjectOutputStream(fos);
        }
        
        oos.writeObject(this);
        oos.close();
        fos.close();
    }
}
