/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Organization;

import Business.Pharmacy.PharmacyStores;
import java.util.ArrayList;
import Business.Role.Role;

/**
 *
 * @author Aayush
 */
public class PharmacyStoreOrganization extends Organization{
    
    private ArrayList<PharmacyStores>pharmaStoresList;

    public ArrayList<PharmacyStores> getPharmaStoresList() {
        return pharmaStoresList;
    }
    
    
    public PharmacyStoreOrganization() {
        super(Organization.Type.PharmacyStore.getValue());
        pharmaStoresList = new ArrayList<>();
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
