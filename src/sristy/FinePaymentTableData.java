/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sristy;

import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author HP
 */
public class FinePaymentTableData {
    private SimpleStringProperty title;
    private SimpleStringProperty dateOfIssue;
    private SimpleStringProperty infractionLocation;
    private SimpleStringProperty amount;
    private SimpleStringProperty paymentStatus;

    public FinePaymentTableData(String title, String dateOfIssue, String infractionLocation, String amount, String paymentStatus) {
        this.title = new SimpleStringProperty(this, "title");
        this.title.setValue(title);
        this.dateOfIssue = new SimpleStringProperty(this, "dateOfIssue");
        this.dateOfIssue.setValue(dateOfIssue);
        this.infractionLocation = new SimpleStringProperty(this, "infractionLocation");
        this.infractionLocation.setValue(infractionLocation);
        this.amount = new SimpleStringProperty(this, "amount");
        this.amount.setValue(amount);
        this.paymentStatus = new SimpleStringProperty(this, "paymentStatus");
        this.paymentStatus.setValue(paymentStatus);
    }

    public String getTitle() {
        return title.getValue();
    }

    public void setTitle(String title) {
        this.title.setValue(title);
    }

    public String getDateOfIssue() {
        return dateOfIssue.getValue();
    }

    public void setDateOfIssue(String dateOfIssue) {
        this.dateOfIssue.setValue(dateOfIssue);
    }

    public String getInfractionLocation() {
        return infractionLocation.getValue();
    }

    public void setInfractionLocation(String infractionLocation) {
        this.infractionLocation.setValue(infractionLocation);
    }

    public String getAmount() {
        return amount.getValue();
    }

    public void setAmount(String amount) {
        this.amount.setValue(amount);
    }

    public String getPaymentStatus() {
        return paymentStatus.getValue();
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus.setValue(paymentStatus);
    }
    
}
