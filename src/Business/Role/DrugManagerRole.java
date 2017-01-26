/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.DrugRegulatoryOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UI.DrugManager.DrugManagerWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Aayush
 */
public class DrugManagerRole extends Role{
    private Organization drugRegOrg;
    
     public DrugManagerRole() {
        super(Role.RoleType.DrugManager.getValue());
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system) {
        for(Organization org : system.getCreator().getOrganizationDirectory().getOrganizationList())
        {
            if (org instanceof DrugRegulatoryOrganization)
                drugRegOrg = org;
        }
        
        return new DrugManagerWorkAreaJPanel(userProcessContainer,enterprise,drugRegOrg);
    }
    
}
