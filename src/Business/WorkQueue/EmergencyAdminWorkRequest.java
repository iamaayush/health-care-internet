/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.WorkQueue;

import Business.Enterprise.Enterprise;
import Business.Person.Doctor;

/**
 *
 * @author Aayush
 */
public class EmergencyAdminWorkRequest extends WorkRequest{
    
    private int MRN;
    private String patientName;
    private Doctor doctor;
    private Enterprise enterprise;

    public int getMRN() {
        return MRN;
    }

    public void setMRN(int MRN) {
        this.MRN = MRN;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
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
