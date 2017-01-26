/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Enterprise;

import Business.Pharmacy.Drug;
import java.util.ArrayList;
import Business.Role.Role;

/**
 *
 * @author Aayush
 */
public class PharmacyEnterprise extends Enterprise{
    private ArrayList<Drug>drugList;
    
    public PharmacyEnterprise(String name, Enterprise.EnterpriseType type) {
        super(name, Enterprise.EnterpriseType.Pharmacy);
        
        drugList = new ArrayList<>();
    }

    public ArrayList<Drug> getDrugList() {
        return drugList;
    }

    public void setDrugList(ArrayList<Drug> drugList) {
        this.drugList = drugList;
    }

    
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
