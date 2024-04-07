/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sristy.modelclasses;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class IncidentDepartmentManager {
    private String username;
    private String password;
    
    public IncidentDepartmentManager(String username, String password)
    {
        this.username = username;
        this.password = password;
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
}
