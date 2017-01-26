/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.WorkQueue;

import Business.Pharmacy.Drug;

/**
 *
 * @author Aayush
 */
public class DrugMngrToFDAWorkRequest extends WorkRequest {
    
    private Drug drug;
    private String enterpriseName;
    private String entId;

    public Drug getDrug() {
        return drug;
    }

    public void setDrug(Drug drug) {
        this.drug = drug;
    }

    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
    }

    public String getEntId() {
        return entId;
    }

    public void setEntId(String entId) {
        this.entId = entId;
    }

    @Override
    public String toString() {
        return super.getMessage();
    }
    
    
    
}
