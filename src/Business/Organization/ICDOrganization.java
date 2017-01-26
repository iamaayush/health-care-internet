/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Organization;

import Business.Forum.Disease;
import Business.Forum.ForumTopic;
import Business.Role.ICDRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Aayush
 */
public class ICDOrganization extends Organization{
    
    private ArrayList<Disease>worldDiseaseList;
    private ArrayList<ForumTopic>forumList;
    
    public ICDOrganization() {
        super(Organization.Type.InternationClassificationOfDiseases.getValue());
        worldDiseaseList=new ArrayList<>();
        forumList=new ArrayList<>();
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new ICDRole());
        return roles;
    }

    public ArrayList<Disease> getWorldDiseaseList() {
        return worldDiseaseList;
    }

    public void setWorldDiseaseList(ArrayList<Disease> worldDiseaseList) {
        this.worldDiseaseList = worldDiseaseList;
    }

    public ArrayList<ForumTopic> getForumList() {
        return forumList;
    }

    public void setForumList(ArrayList<ForumTopic> forumList) {
        this.forumList = forumList;
    }
    
    
    
}
