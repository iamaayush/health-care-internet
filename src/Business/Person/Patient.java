/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Person;

import Business.Enterprise.Enterprise;
import java.util.Date;

/**
 *
 * @author Aayush
 */
public class Patient extends Person{
    
    private Date joiningDate;
    private String description;
    private String allergies;
    private String insuranceID;
    private Doctor prefferedDoctor;
    private String maritalStatus;
    private static int count=0;
    int MRN;
    private String adminDoctorAssign;
    private Doctor referredDoctor;
    private Enterprise entPrefDoc;
    private Enterprise entreffDoc;

    public Patient() {
        
        
        joiningDate = new Date();
        count++;
        MRN = count;
    }

    public Doctor getReferredDoctor() {
        return referredDoctor;
    }

    public void setReferredDoctor(Doctor referredDoctor) {
        this.referredDoctor = referredDoctor;
    }

    public Enterprise getEntPrefDoc() {
        return entPrefDoc;
    }

    public void setEntPrefDoc(Enterprise entPrefDoc) {
        this.entPrefDoc = entPrefDoc;
    }

    public Enterprise getEntreffDoc() {
        return entreffDoc;
    }

    public void setEntreffDoc(Enterprise entreffDoc) {
        this.entreffDoc = entreffDoc;
    }
    
    public String getAdminDoctorAssign() {
        return adminDoctorAssign;
    }

    public void setAdminDoctorAssign(String adminDoctorAssign) {
        this.adminDoctorAssign = adminDoctorAssign;
    }


    

    public int getMRN() {
        return MRN;
    }

    public void setMRN(int MRN) {
        this.MRN = MRN;
    }

    
    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    
    
    public Doctor getPrefferedDoctor() {
        return prefferedDoctor;
    }

    public void setPrefferedDoctor(Doctor prefferedDoctor) {
        this.prefferedDoctor = prefferedDoctor;
    }

    public String getInsuranceID() {
        return insuranceID;
    }

    public void setInsuranceID(String insuranceID) {
        this.insuranceID = insuranceID;
    }

    public String getAllergies() {
        return allergies;
    }

    public void setAllergies(String allergies) {
        this.allergies = allergies;
    }
    

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(Date joiningDate) {
        this.joiningDate = joiningDate;
    }

    @Override
    public String toString() {
        return super.getFirstName();
    }
    
    
    
    
}
