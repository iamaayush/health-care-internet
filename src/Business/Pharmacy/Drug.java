/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Pharmacy;

import Business.Enterprise.Enterprise;

/**
 *
 * @author Aayush
 */
public class Drug {
    
    private String drugName;
    private String drugID;
    private String strength;
    private Enterprise manufacturingCompany;
    private String specification;
    private String stability;
    private String dosage;
    private float price;
    private String fdaStatus;
//    private String companyID;
    private MedicalGuideline mg;

    
    public String getDrugID() {
        return drugID;
    }

    public void setDrugID(String drugID) {
        this.drugID = drugID;
    }
    
    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public String getStrength() {
        return strength;
    }

    public void setStrength(String strength) {
        this.strength = strength;
    }

    public MedicalGuideline getMg() {
        return mg;
    }

    public void setMg(MedicalGuideline mg) {
        this.mg = mg;
    }

    public Enterprise getManufacturingCompany() {
        return manufacturingCompany;
    }

    public void setManufacturingCompany(Enterprise manufacturingCompany) {
        this.manufacturingCompany = manufacturingCompany;
    }

    
    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public String getStability() {
        return stability;
    }

    public void setStability(String stability) {
        this.stability = stability;
    }

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }


    public String getFdaStatus() {
        return fdaStatus;
    }

    public void setFdaStatus(String fdaStatus) {
        this.fdaStatus = fdaStatus;
    }

    @Override
    public String toString() {
        return drugName;
    }
    
    
    
}
