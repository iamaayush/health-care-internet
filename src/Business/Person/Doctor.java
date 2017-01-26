/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Person;

import Business.Enterprise.Enterprise;
import java.util.ArrayList;

/**
 *
 * @author Aayush
 */
public class Doctor extends Person {
    
    private String doctorLiscenceID;
    private String doctorStatus;
    private String speciality;
    private ArrayList<Patient> patientList;
    private ArrayList<Enterprise> myEnterpriseList;

    public Doctor() {
    
    patientList = new ArrayList<>();
    myEnterpriseList=new ArrayList<>();
    }

    public ArrayList<Patient> getPatientList() {
        return patientList;
    }

    public void setPatientList(ArrayList<Patient> patientList) {
        this.patientList = patientList;
    }

    public ArrayList<Enterprise> getMyEnterpriseList() {
        return myEnterpriseList;
    }

    public void setMyEnterpriseList(ArrayList<Enterprise> myEnterpriseList) {
        this.myEnterpriseList = myEnterpriseList;
    }
    
    

    public String getDoctorLiscenceID() {
        return doctorLiscenceID;
    }

    public void setDoctorLiscenceID(String doctorLiscenceID) {
        this.doctorLiscenceID = doctorLiscenceID;
    }

  

    public String getDoctorStatus() {
        return doctorStatus;
    }

    public void setDoctorStatus(String doctorStatus) {
        this.doctorStatus = doctorStatus;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
    

    @Override
    public String toString() {
        return super.getFirstName();
    }
    
    
    
    
    
    
}
