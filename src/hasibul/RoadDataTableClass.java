/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hasibul;

import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author Dell
 */
public class RoadDataTableClass {
    private SimpleStringProperty roadNumber;
    private SimpleStringProperty roadStatus;
    
    public RoadDataTableClass(String roadNumber, String roadStatus)
    {
        this.roadNumber = new SimpleStringProperty(this, "roadNumber");
        this.roadNumber.setValue(roadNumber);
        
        this.roadStatus = new SimpleStringProperty(this, "roadStatus");
        this.roadStatus.setValue(roadStatus);
    }
    
    public String getRoadNumber()
    {
        return this.roadNumber.getValue();
    }
    
    public void setRoadNumber(String roadNumber)
    {
        this.roadNumber.setValue(roadNumber);
    }
    
    public String getRoadStatus()
    {
        return this.roadStatus.getValue();
    }
    
    public void setRoadStatus(String roadStatus)
    {
        this.roadStatus.setValue(roadStatus);
    }
}
