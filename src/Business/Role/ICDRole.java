/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.DrugRegulatoryOrganization;
import Business.Organization.ICDOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UI.Creator.ICDWorkAreaJPanel;
import UI.Creator.IFDAWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Aayush
 */
public class ICDRole extends Role{
    
    private ICDOrganization iCDOrg;
    public ICDRole()
    {
       super(Role.RoleType.ICD.getValue());
    }
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization,Enterprise enterprise, EcoSystem system) {
        for(Organization org : system.getCreator().getOrganizationDirectory().getOrganizationList())
        {
            if (org instanceof ICDOrganization)
                iCDOrg = (ICDOrganization)org;
        }
        return new ICDWorkAreaJPanel(userProcessContainer, iCDOrg);
//        return null;
    }
    
}
