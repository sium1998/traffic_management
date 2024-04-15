/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hasibul.modelclasses;

import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author Dell
 */
public class RestStationTableData {
    private SimpleStringProperty name;
    private SimpleStringProperty location;
    private SimpleStringProperty type;
    
    public RestStationTableData(String name, String location, String type)
    {
        this.name = new SimpleStringProperty(this, "name");
        this.name.setValue(name);
        this.location = new SimpleStringProperty(this, "location");
        this.location.setValue(location);
        this.type = new SimpleStringProperty(this, "type");
        this.type.setValue(type);
    }
    
    public String getName()
    {
        return this.name.getValue();
    }
    
    public void setName(String name)
    {
        this.name.setValue(name);
    }
    
    public String getLocation()
    {
        return this.location.getValue();
    }
    
    public void setLocation(String location)
    {
        this.location.setValue(location);
    }
    
    public String getType()
    {
        return this.type.getValue();
    }
    
    public void setType(String type)
    {
        this.type.setValue(type);
    }
}
