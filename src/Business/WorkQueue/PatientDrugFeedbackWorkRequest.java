/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.WorkQueue;

import Business.Person.Patient;
import Business.Pharmacy.Drug;

/**
 *
 * @author Aayush
 */
public class PatientDrugFeedbackWorkRequest extends WorkRequest {
    
    private Drug drug;
    private Patient patient;

    public Drug getDrug() {
        return drug;
    }

    public void setDrug(Drug drug) {
        this.drug = drug;
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
