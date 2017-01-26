/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Organization;

import Business.Role.DoctorRole;
import Business.Role.IFDARole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Aayush
 */
public class DrugRegulatoryOrganization extends Organization{
    
    public DrugRegulatoryOrganization() {
        super(Organization.Type.DrugRegulatory.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new IFDARole());
        return roles;
    }
    
}
