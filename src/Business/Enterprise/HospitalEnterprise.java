/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Enterprise;

import Business.Encounter.Encounter;
import java.util.ArrayList;
import Business.Role.Role;

/**
 *
 * @author Aayush
 */
public class HospitalEnterprise extends Enterprise {
    
    private ArrayList<Encounter>encounterList;
    
    public HospitalEnterprise(String name, EnterpriseType type) {
        super(name, EnterpriseType.Hospital);
        
        encounterList = new ArrayList<>();
    }

    public ArrayList<Encounter> getEncounterList() {
        return encounterList;
    }

    public void setEncounterList(ArrayList<Encounter> encounterList) {
        this.encounterList = encounterList;
    }
    
    

    @Override
    public ArrayList<Role> getSupportedRole() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
