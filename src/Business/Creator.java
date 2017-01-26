/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Role.CreatorRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Aayush
 */
public class Creator extends Enterprise {

    private Creator creator;
    boolean creatorAdmin=false;
    public Creator(String name) {
        super(name, EnterpriseType.GlobalAuthority);
    }

    public boolean isCreatorAdmin() {
        return creatorAdmin;
    }

    public void setCreatorAdmin(boolean creatorAdmin) {
        this.creatorAdmin = creatorAdmin;
    }

    
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList();
        roleList.add(new CreatorRole());
        return roleList;
    }

}
