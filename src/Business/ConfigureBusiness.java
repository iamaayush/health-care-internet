/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business;

import Business.Person.Person;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author Aayush
 */
public class ConfigureBusiness {
    public static EcoSystem configure(){
        EcoSystem system = EcoSystem.getInstance();
        
        Person person = system.getPersonDirectory().createPerson("Aayush","shah");
        UserAccount userAccount = system.getUserAccountDirectory().createUserAccount("sa", "sa", person, new SystemAdminRole());
        return system;
    }
    
}
