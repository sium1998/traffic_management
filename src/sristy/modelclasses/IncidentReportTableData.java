/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sristy.modelclasses;

import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author HP
 */
public class IncidentReportTableData {
    private SimpleStringProperty reportTitle;
    private SimpleStringProperty dateIssued;
    private SimpleStringProperty incidentLocation;
    private SimpleStringProperty incidentTime;
    private SimpleStringProperty incidentSeverity;
    
    public IncidentReportTableData(String reportTitle, String dateIssued, String incidentLocation, String incidentTime, String incidentSeverity)
    {
        this.reportTitle = new SimpleStringProperty(this, "reportTitle");
        this.reportTitle.setValue(reportTitle);
        
        this.dateIssued = new SimpleStringProperty(this, "dateIssued");
        this.dateIssued.setValue(dateIssued);
        
        this.incidentLocation = new SimpleStringProperty(this, "incidentLocation");
        this.incidentLocation.setValue(incidentLocation);
        
        this.incidentTime = new SimpleStringProperty(this, "incidentTime");
        this.incidentTime.setValue(incidentTime);
        
        this.incidentSeverity = new SimpleStringProperty(this, "incidentSeverity");
        this.incidentSeverity.setValue(incidentSeverity);
    }
    
    public String getReportTitle()
    {
        return this.reportTitle.getValue();
    }
    
    public void setReportTitle(String reportTitle)
    {
        this.reportTitle.setValue(reportTitle);
    }
    
    public String getDateIssued()
    {
        return this.dateIssued.getValue();
    }
    
    public void setDateIssued(String dateIssued)
    {
        this.dateIssued.setValue(dateIssued);
    }
    
    public String getIncidentLocation()
    {
        return this.incidentLocation.getValue();
    }
    
    public void setIncidentLocation(String incidentLocation)
    {
        this.incidentLocation.setValue(incidentLocation);
    }
    
    public String getIncidentTime()
    {
        return this.incidentTime.getValue();
    }
    
    public void setIncidentTime(String incidentTime)
    {
        this.incidentTime.setValue(incidentTime);
    }
    
    public String getIncidentSeverity()
    {
        return this.incidentSeverity.getValue();
    }
    
    public void setIncidentSeverity(String incidentSeverity)
    {
        this.incidentSeverity.setValue(incidentSeverity);
    }
}
