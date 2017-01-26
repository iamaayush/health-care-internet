/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.WorkQueue;

import Business.Encounter.Encounter;
import Business.Enterprise.Enterprise;
import Business.Person.Patient;
import java.util.ArrayList;

/**
 *
 * @author Aayush
 */
public class ReferredDoctorWorkRequest extends WorkRequest{
    
    private Patient patient;
    private Enterprise sendEnt;
    private Enterprise recvEnt;
    private ArrayList<Encounter> encounterList;
    private String appointment;

    public ReferredDoctorWorkRequest() {
        encounterList = new ArrayList<>();
    }
    
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

    public Enterprise getSendEnt() {
        return sendEnt;
    }

    public void setSendEnt(Enterprise sendEnt) {
        this.sendEnt = sendEnt;
    }

    public Enterprise getRecvEnt() {
        return recvEnt;
    }

    public void setRecvEnt(Enterprise recvEnt) {
        this.recvEnt = recvEnt;
    }

    public ArrayList<Encounter> getEncounterList() {
        return encounterList;
    }

    public void setEncounterList(ArrayList<Encounter> encounterList) {
        this.encounterList = encounterList;
    }

    @Override
    public String toString() {
        return super.getMessage();
    }
    
    
    
    
    
    
}
