/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.WorkQueue;

import Business.Encounter.Encounter;
import Business.Enterprise.Enterprise;
import Business.Person.Doctor;
import java.util.ArrayList;

/**
 *
 * @author Aayush
 */
public class EmergencyDoctorEnquiryWorkRequest extends WorkRequest{
    
    private int MRN;
    private ArrayList<Encounter>encounterList;
    private Doctor doctor;
    private Enterprise entSender;

    public EmergencyDoctorEnquiryWorkRequest() {
        encounterList=new ArrayList<>();
    }

    
    
    public int getMRN() {
        return MRN;
    }

    public void setMRN(int MRN) {
        this.MRN = MRN;
    }

    public ArrayList<Encounter> getEncounterList() {
        return encounterList;
    }

    public void setEncounterList(ArrayList<Encounter> encounterList) {
        this.encounterList = encounterList;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Enterprise getEntSender() {
        return entSender;
    }

    public void setEntSender(Enterprise entSender) {
        this.entSender = entSender;
    }

    @Override
    public String toString() {
        return super.getMessage();
    }
    
    
    
}
