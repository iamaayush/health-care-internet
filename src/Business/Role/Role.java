/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author Aayush
 */
public abstract class Role {
    
    public enum RoleType{
        SystemAdmin("SystemAdmin"),
        Admin("Admin"),
        Doctor("Doctor"),
        LabAssistant("LabAssistant"),
        Nurse("Nurse"),
        Pharmacy("Pharmacy"),
        DrugManager("DrugManager"),
        PharmaceuticalCompany("PharmaceuticalCompany"),
        Patient("Patient"),
        IFDA("IFDA"),
        ICD("ICD"),
        Creator("Creator");
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    String role;
    public Role(String role)
    {
        this.role = role;
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system);

    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
}
