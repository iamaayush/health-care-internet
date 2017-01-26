/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Encounter;

import Business.Person.Doctor;
import Business.Person.Patient;
import Business.Pharmacy.Drug;
import Business.WorkQueue.DoctorToLabWorkRequest;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Aayush
 */
public class Encounter {

    private static int count = 1001;
    private int encounterID;
    private Doctor doctor;
    private Patient patient;
    private VitalSign vitalSign;
    private ArrayList<String>prescriptionList;
    private Date encounterDate;
    private DoctorToLabWorkRequest request;
    private ArrayList<Drug>drugList;

    public Encounter() {

        encounterID = count;
        count++;
        prescriptionList = new ArrayList<>();
        vitalSign = new VitalSign();
        drugList = new ArrayList<>();
    }

    public int getEncounterID() {
        return encounterID;
    }

    public void setEncounterID(int encounterID) {
        this.encounterID = encounterID;
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

    public VitalSign getVitalSign() {
        return vitalSign;
    }

    public void setVitalSign(VitalSign vitalSign) {
        this.vitalSign = vitalSign;
    }

    public ArrayList<String> getPrescriptionList() {
        return prescriptionList;
    }

    public void setPrescriptionList(ArrayList<String> prescriptionList) {
        this.prescriptionList = prescriptionList;
    }

    public ArrayList<Drug> getDrugList() {
        return drugList;
    }

    public void setDrugList(ArrayList<Drug> drugList) {
        this.drugList = drugList;
    }

    


    public Date getEncounterDate() {
        return encounterDate;
    }

    public void setEncounterDate(Date encounterDate) {
        this.encounterDate = encounterDate;
    }

    public DoctorToLabWorkRequest getRequest() {
        return request;
    }

    public void setRequest(DoctorToLabWorkRequest request) {
        this.request = request;
    }

    @Override
    public String toString() {
        return String.valueOf(encounterID);
    }
    
    

}
