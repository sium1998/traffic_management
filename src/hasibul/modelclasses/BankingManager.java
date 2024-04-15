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
import mainpkg.AppendableObjectOutputStream;

/**
 *
 * @author HP
 */
public class BankingManager implements Serializable{
    private String username;
    private String password;
    
    public BankingManager(String username, String password)
    {
        this.username = username;
        this.password = password;
    }
    
    public BankingManager()
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
        return "<BankingManager: " + this.username + ">";
    }

    public void saveNewToDatabase() throws IOException
    {
        File f = new File("BankingManager.bin");
        FileOutputStream fos;
        ObjectOutputStream oos;
        
        if (f.exists())
        {
            fos = new FileOutputStream("BankingManager.bin", true);
            oos = new AppendableObjectOutputStream(fos);
        }
        else
        {
            f.createNewFile();
            
            fos = new FileOutputStream("BankingManager.bin");
            oos = new ObjectOutputStream(fos);
        }
        
        oos.writeObject(this);
        oos.close();
        fos.close();
    }
    
}
