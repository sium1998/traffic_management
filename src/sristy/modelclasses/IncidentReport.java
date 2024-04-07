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
public class IncidentReport implements Serializable {
    private String reportTitle;
    private LocalDate dateIssued;
    private String incidentLocation;
    private String incidentTime;
    private int incidentSeverity;

    public IncidentReport(String reportTitle, LocalDate dateIssued, String incidentLocation, String incidentTime, int incidentSeverity) {
        this.reportTitle = reportTitle;
        this.dateIssued = dateIssued;
        this.incidentLocation = incidentLocation;
        this.incidentTime = incidentTime;
        this.incidentSeverity = incidentSeverity;
    }

    public int getIncidentSeverity() {
        return incidentSeverity;
    }

    public void setIncidentSeverity(int incidentSeverity) {
        this.incidentSeverity = incidentSeverity;
    }

    public String getReportTitle() {
        return reportTitle;
    }

    public void setReportTitle(String reportTitle) {
        this.reportTitle = reportTitle;
    }

    public LocalDate getDateIssued() {
        return dateIssued;
    }

    public void setDateIssued(LocalDate dateIssued) {
        this.dateIssued = dateIssued;
    }

    public String getIncidentLocation() {
        return incidentLocation;
    }

    public void setIncidentLocation(String incidentLocation) {
        this.incidentLocation = incidentLocation;
    }

    public String getIncidentTime() {
        return incidentTime;
    }

    public void setIncidentTime(String incidentTime) {
        this.incidentTime = incidentTime;
    }
    
    public void saveNewToDatabase() throws IOException
    {
        File f = new File("IncidentReport.bin");
        FileOutputStream fos;
        ObjectOutputStream oos;
        
        if (f.exists())
        {
            fos = new FileOutputStream("IncidentReport.bin", true);
            oos = new AppendableObjectOutputStream(fos);
        }
        else
        {
            f.createNewFile();
            
            fos = new FileOutputStream("IncidentReport.bin");
            oos = new ObjectOutputStream(fos);
        }
        
        oos.writeObject(this);
        oos.close();
        fos.close();
    }
}
