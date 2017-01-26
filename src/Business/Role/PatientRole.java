/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Person.Patient;
import Business.UserAccount.UserAccount;
import UI.PatientRole.PatientWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Aayush
 */
public class PatientRole extends Role {

    private Patient patient;

    public PatientRole() {
        super(RoleType.Patient.getValue());
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system) {
        if (account.getPerson() instanceof Patient) {
            patient = (Patient) account.getPerson();
        }
        return new PatientWorkAreaJPanel(userProcessContainer, system, patient);
//    return null;
    }

}
