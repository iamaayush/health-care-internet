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
public class PatientWorkRequest extends WorkRequest {
    
    private Patient patient;
    private Doctor doctor;
    private Enterprise entRecv;
    private String appointment;

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public String getAppointment() {
        return appointment;
    }

    public void setAppointment(String appointment) {
        this.appointment = appointment;
    }

    
    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Enterprise getEntRecv() {
        return entRecv;
    }

    public void setEntRecv(Enterprise entRecv) {
        this.entRecv = entRecv;
    }


    @Override
    public String toString() {
        return super.getMessage();
    }

    
    
    
    
    
}
