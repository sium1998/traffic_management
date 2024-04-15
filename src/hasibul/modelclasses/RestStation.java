/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hasibul.modelclasses;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import mainpkg.AppendableObjectOutputStream;

/**
 *
 * @author Dell
 */
public class RestStation implements Serializable {
    private String name;
    private String city;
    private String area;
    private String location;
    private String type;

    public RestStation(String name, String city, String area, String location, String type) {
        this.name = name;
        this.city = city;
        this.area = area;
        this.location = location;
        this.type = type;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    
    public void saveNewToDatabase() throws IOException
    {
        File f = new File("RestStation.bin");
        FileOutputStream fos;
        ObjectOutputStream oos;
        
        if (f.exists())
        {
            fos = new FileOutputStream("RestStation.bin", true);
            oos = new AppendableObjectOutputStream(fos);
        }
        else
        {
            f.createNewFile();
            
            fos = new FileOutputStream("RestStation.bin");
            oos = new ObjectOutputStream(fos);
        }
        
        oos.writeObject(this);
        oos.close();
        fos.close();
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
    
}
