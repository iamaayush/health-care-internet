/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Organization;

import java.util.ArrayList;

/**
 *
 * @author Aayush
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Organization.Type type){
        Organization organization = null;
        if (type.getValue().equals(Organization.Type.Doctor.getValue())){
            organization = new DoctorOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.Lab.getValue())){
            organization = new LabOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.Nurse.getValue())){
            organization = new NurseOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.Patient.getValue())){
            organization = new PatientOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.PharmacyStore.getValue())){
            organization = new PharmacyStoreOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.DrugManagement.getValue())){
            organization = new DrugManagementOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.DrugRegulatory.getValue())){
            organization = new DrugRegulatoryOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.InternationClassificationOfDiseases.getValue())){
            organization = new ICDOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
    
}
