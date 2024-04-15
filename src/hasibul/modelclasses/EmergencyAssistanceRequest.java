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
public class EmergencyAssistanceRequest implements Serializable {
    private CommercialDriver requestedBy;
    private String message;

    public EmergencyAssistanceRequest(CommercialDriver requestedBy, String message) {
        this.requestedBy = requestedBy;
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public CommercialDriver getRequestedBy() {
        return requestedBy;
    }
    
    public void saveNewToDatabase() throws IOException
    {
        File f = new File("EmergencyAssistanceRequest.bin");
        FileOutputStream fos;
        ObjectOutputStream oos;
        
        if (f.exists())
        {
            fos = new FileOutputStream("EmergencyAssistanceRequest.bin", true);
            oos = new AppendableObjectOutputStream(fos);
        }
        else
        {
            f.createNewFile();
            
            fos = new FileOutputStream("EmergencyAssistanceRequest.bin");
            oos = new ObjectOutputStream(fos);
        }
        
        oos.writeObject(this);
        oos.close();
        fos.close();
    }
    
}
