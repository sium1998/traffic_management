/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hasibul.modelclasses;

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
 * @author Dell
 */
public class CommercialDriver implements Serializable {
    private String username;
    private String password;
    
    public CommercialDriver(String username, String password)
    {
        this.username = username;
        this.password = password;
    }
    
    public CommercialDriver()
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
    
    public ArrayList<RestStation> loadAllRestStationFromDatabase() throws IOException, ClassNotFoundException
    {
        ArrayList<RestStation> allRestStation = new ArrayList<>();
        
        File f = new File("RestStation.bin");
        
        if (f.exists())
        {
            FileInputStream fis = new FileInputStream("RestStation.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);
            try
            {
                while(true)
                {
                    RestStation eachRestStation = (RestStation) ois.readObject();
                    allRestStation.add(eachRestStation);
                }
            }
            catch (EOFException e)
            {
                return allRestStation;
            }
        }
        
        return allRestStation;
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
    
    public CommercialDriver loadByUsername(String username) throws FileNotFoundException, IOException, ClassNotFoundException
    {
        File f = new File("CommercialDriver.bin");
        
        if (f.exists())
        {
            FileInputStream fis = new FileInputStream("CommercialDriver.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);
            
            try
            {
                while(true)
                {
                    CommercialDriver eachUser = (CommercialDriver) ois.readObject();
                    
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
        File f = new File("CommercialDriver.bin");
        FileOutputStream fos;
        ObjectOutputStream oos;
        
        if (f.exists())
        {
            fos = new FileOutputStream("CommercialDriver.bin", true);
            oos = new AppendableObjectOutputStream(fos);
        }
        else
        {
            f.createNewFile();
            
            fos = new FileOutputStream("CommercialDriver.bin");
            oos = new ObjectOutputStream(fos);
        }
        
        oos.writeObject(this);
        oos.close();
        fos.close();
    }
}
