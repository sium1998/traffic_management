/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hasibul.modelclasses;

import hasibul.RoadData;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class CommercialDriver {
    private String username;
    private String password;
    
    public CommercialDriver(String username, String password)
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
    
    public ArrayList<RoadData> loadAllRoadDataFromDatabase() throws IOException, ClassNotFoundException
    {
        ArrayList<RoadData> allRoadData = new ArrayList<>();
        
        File f = new File("RoadData.bin");
        
        if (f.exists())
        {
            FileInputStream fis = new FileInputStream("RoadData.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);
            try
            {
                while(true)
                {
                    RoadData eachRoadData = (RoadData) ois.readObject();
                    allRoadData.add(eachRoadData);
                }
            }
            catch (EOFException e)
            {
                return allRoadData;
            }
        }
        
        return allRoadData;
    }
    
    public RoadData loadRoadDataByRoadNumber(String roadNumber) throws IOException, ClassNotFoundException
    {
        File f = new File("RoadData.bin");
        
        if (f.exists())
        {
            FileInputStream fis = new FileInputStream("RoadData.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);
            
            try
            {
                while(true)
                {
                    RoadData eachRoadData = (RoadData) ois.readObject();
                    if (eachRoadData.getRoadNumber().equals(roadNumber))
                    {
                        return eachRoadData;
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

    @Override
    public String toString()
    {
        return "<CommercialDriver: " + this.username + ">";
    }
}
