/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Person;

/**
 *
 * @author Aayush
 */
public class LabAssistant extends Person{
    
    private String labAssistLiscenceID;
    private String Speciality;

    public String getLabAssistLiscenceID() {
        return labAssistLiscenceID;
    }

    public void setLabAssistLiscenceID(String labAssistLiscenceID) {
        this.labAssistLiscenceID = labAssistLiscenceID;
    }

    public String getSpeciality() {
        return Speciality;
    }

    public void setSpeciality(String Speciality) {
        this.Speciality = Speciality;
    }

    @Override
    public String toString() {
        return super.getFirstName();
    }
    
    
}
