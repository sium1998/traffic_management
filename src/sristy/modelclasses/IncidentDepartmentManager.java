/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sristy.modelclasses;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import mainpkg.AppendableObjectOutputStream;

/**
 *
 * @author HP
 */
public class IncidentDepartmentManager implements Serializable {
    private String username;
    private String password;
    
    public IncidentDepartmentManager(String username, String password)
    {
        this.username = username;
        this.password = password;
    }
    
    public IncidentDepartmentManager()
    {
        
    }
    
    public String getUsername()
    {
        return this.username;
    }
    
    public void setUsername(String username)
    {
        this.username = username;
    }
    
    public boolean checkPassword(String password)
    {
        return this.password.equals(password);
    }
    
    public void setPassword(String password)
    {
        this.password = password;
    }
    
    @Override
    public String toString()
    {
        return "<IncidentDepartmentManager: " + this.username + ">";
    }
    
    public ArrayList<IncidentReport> loadAllIncidentReportFromDatabase() throws IOException, ClassNotFoundException
    {
        ArrayList<IncidentReport> allIncidentReport = new ArrayList<>();
        
        File f = new File("IncidentReport.bin");
        
        if (f.exists())
        {
            FileInputStream fis = new FileInputStream("IncidentReport.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);
            try
            {
                while(true)
                {
                    IncidentReport eachIncidentReport = (IncidentReport) ois.readObject();
                    allIncidentReport.add(eachIncidentReport);
                }
            }
            catch (EOFException e)
            {
                return allIncidentReport;
            }
        }
        
        return allIncidentReport;
    }
    
    public ArrayList<MessageThread> loadAllMessageThreadFromDatabase() throws IOException, ClassNotFoundException
    {
        ArrayList<MessageThread> allMessageThread = new ArrayList<>();
        
        File f = new File("MessageThread.bin");
        
        if (f.exists())
        {
            FileInputStream fis = new FileInputStream("MessageThread.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);
            try
            {
                while(true)
                {
                    MessageThread eachMessageThread = (MessageThread) ois.readObject();
                    allMessageThread.add(eachMessageThread);
                }
            }
            catch (EOFException e)
            {
                return allMessageThread;
            }
        }
        
        return allMessageThread;
    }
    
    public ArrayList<Message> loadAllMessageByThread(MessageThread thread) throws IOException, ClassNotFoundException
    {
        ArrayList<Message> allMessage = new ArrayList<>();
        File f = new File("Message.bin");
        
        if (f.exists())
        {
            FileInputStream fis = new FileInputStream("Message.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);
            try
            {
                while(true)
                {
                    Message eachMessage = (Message) ois.readObject();
                    
                    if (eachMessage.getThread().getSubject().equals(thread.getSubject()))
                    {
                        allMessage.add(eachMessage);
                    }
                }
            }
            catch (EOFException e)
            {
                return allMessage;
            }
        }
        else
        {
            return allMessage;
        }
    }
    
    public IncidentDepartmentManager loadByUsername(String username) throws FileNotFoundException, IOException, ClassNotFoundException
    {
        File f = new File("IncidentDepartmentManager.bin");
        
        if (f.exists())
        {
            FileInputStream fis = new FileInputStream("IncidentDepartmentManager.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);
            
            try
            {
                while(true)
                {
                    IncidentDepartmentManager eachUser = (IncidentDepartmentManager) ois.readObject();
                    
                    if (eachUser.getUsername().equals(username))
                    {
                        return eachUser;
                    }
                }
            }
            catch (EOFException e)
            {
                return null;
            }
        }
        else
        {
            return null;
        }
    }
    
    public void saveNewToDatabase() throws IOException
    {
        File f = new File("IncidentDepartmentManager.bin");
        FileOutputStream fos;
        ObjectOutputStream oos;
        
        if (f.exists())
        {
            fos = new FileOutputStream("IncidentDepartmentManager.bin", true);
            oos = new AppendableObjectOutputStream(fos);
        }
        else
        {
            f.createNewFile();
            
            fos = new FileOutputStream("IncidentDepartmentManager.bin");
            oos = new ObjectOutputStream(fos);
        }
        
        oos.writeObject(this);
        oos.close();
        fos.close();
    }
}
