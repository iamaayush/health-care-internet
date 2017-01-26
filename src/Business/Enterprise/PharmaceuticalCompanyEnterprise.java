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
public class PharmaceuticalCompanyEnterprise extends Enterprise{
    
    private ArrayList<Drug>drugList;
    private ArrayList<PharmacyEnterprise>pharmacyList;
    
    public PharmaceuticalCompanyEnterprise(String name, Enterprise.EnterpriseType type) {
        super(name, Enterprise.EnterpriseType.PharmaceuticalCompany);
        drugList = new ArrayList();
        pharmacyList = new ArrayList<>();
    }

    public ArrayList<Drug> getDrugList() {
        return drugList;
    }

    public void setDrugList(ArrayList<Drug> drugList) {
        this.drugList = drugList;
    }

    public ArrayList<PharmacyEnterprise> getPharmacyList() {
        return pharmacyList;
    }

    public void setPharmacyList(ArrayList<PharmacyEnterprise> pharmacyList) {
        this.pharmacyList = pharmacyList;
    }

    

    @Override
    public ArrayList<Role> getSupportedRole() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
