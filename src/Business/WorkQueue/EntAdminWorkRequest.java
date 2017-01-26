/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.WorkQueue;

import Business.Enterprise.Enterprise;
import Business.Person.Doctor;
import Business.Person.Patient;

/**
 *
 * @author Aayush
 */
public class EntAdminWorkRequest extends WorkRequest {
    
    private Enterprise entSender;
    private Doctor doctor;
    private Patient patient;

    public Enterprise getEntSender() {
        return entSender;
    }

    public void setEntSender(Enterprise entSender) {
        this.entSender = entSender;
    }

    

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    @Override
    public String toString() {
        return super.getMessage();
    }


    
    
    

    
    
    
}
