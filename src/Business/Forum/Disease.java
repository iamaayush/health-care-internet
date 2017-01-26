/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Forum;

/**
 *
 * @author Aayush
 */
public class Disease {
    
    private String diseaseName;
    private float iCDCode;
    private String symptoms;
    private String description;

    public String getDiseaseName() {
        return diseaseName;
    }

    public void setDiseaseName(String diseaseName) {
        this.diseaseName = diseaseName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getiCDCode() {
        return iCDCode;
    }

    public void setiCDCode(float iCDCode) {
        this.iCDCode = iCDCode;
    }

    public String getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

    @Override
    public String toString() {
        return diseaseName;
    }
    
    
    
}
