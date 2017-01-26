/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.WorkQueue;

import Business.Enterprise.Enterprise;
import Business.Person.Doctor;
import Business.Person.Patient;
import Business.Pharmacy.Drug;
import java.util.ArrayList;

/**
 *
 * @author Aayush
 */
public class DoctorToPharmacyWorkRequest extends WorkRequest {
    
    private Patient patient;
    private Doctor doctor;
    private Enterprise enterprise;
    private ArrayList<Drug> encounterDrugList;

    public DoctorToPharmacyWorkRequest() {
        encounterDrugList=new ArrayList<>();
    }
    
    

    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }

    public ArrayList<Drug> getEncounterDrugList() {
        return encounterDrugList;
    }

    public void setEncounterDrugList(ArrayList<Drug> encounterDrugList) {
        this.encounterDrugList = encounterDrugList;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    @Override
    public String toString() {
        return super.getMessage();
    }
    
    
    
    
}
