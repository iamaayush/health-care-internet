/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.DB4OUtil.DB4OUtil;
import Business.Enterprise.Enterprise;
import Business.Network.NetworkCity;
import Business.Network.NetworkCountry;
import Business.Network.NetworkState;
import Business.Organization.Organization;
import Business.Role.SystemAdminRole;
import java.util.ArrayList;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import javax.swing.JOptionPane;

/**
 *
 * @author Aayush
 */
public class EcoSystem extends Organization {

    private static EcoSystem system;
    private static EcoSystem currentSystem;
    private Creator creator;
    private ArrayList<NetworkCountry> countryNetworkList;

    public static EcoSystem getInstance() {
        if (system == null) {
            system = new EcoSystem();
        }
        return system;
    }

    private EcoSystem() {
        super(null);
        countryNetworkList = new ArrayList<>();
        creator = new Creator("Global Authority");
    }

    public Creator getCreator() {
        return creator;
    }

    public void setCreator(Creator creator) {
        this.creator = creator;
    }

    public static EcoSystem getSystem() {
        return system;
    }

    public static void setSystem(EcoSystem system) {
        EcoSystem.system = system;
    }

    public NetworkCountry createAndAddCountry() {
        NetworkCountry networkCountry = new NetworkCountry();
        countryNetworkList.add(networkCountry);
        return networkCountry;
    }

    public void removeCountry(NetworkCountry nc) {
        countryNetworkList.remove(nc);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList();
        roleList.add(new SystemAdminRole());
        return roleList;
    }

    public ArrayList<NetworkCountry> getCountryNetworkList() {
        return countryNetworkList;
    }

    public void setCountryNetworkList(ArrayList<NetworkCountry> countryNetworkList) {
        this.countryNetworkList = countryNetworkList;
    }

    public static void getCurrentSystem(EcoSystem sys) {
        currentSystem = sys;
    }

    public static boolean checkIfUsernameUnique(String username) {
        EcoSystem system = currentSystem;

        System.out.println("1");

        if (system.getCreator() != null) {
            System.out.println("2");
            for (UserAccount ua : system.getCreator().getUserAccountDirectory().getUserAccountList()) {
                if (ua.getUsername().equals(username)) {
                    JOptionPane.showMessageDialog(null, "Username already exists.");
                    return false;
                }
            }
            for (Organization o : system.getCreator().getOrganizationDirectory().getOrganizationList()) {
                for (UserAccount ua : o.getUserAccountDirectory().getUserAccountList()) {
                    if (ua.getUsername().equals(username)) {
                        JOptionPane.showMessageDialog(null, "Username already exists.");
                        return false;
                    }
                }
            }
        }

        System.out.println("3");

        for (UserAccount ua : system.getUserAccountDirectory().getUserAccountList()) {
            if (ua.getUsername().equals(username)) {
                JOptionPane.showMessageDialog(null, "Username already exists.");
                return false;
            }
        }
        System.out.println("4");
        for (NetworkCountry nc : system.getCountryNetworkList()) {
            for (NetworkState ns : nc.getStateList()) {
                for (NetworkCity ncity : ns.getCityList()) {
                    for (Enterprise e : ncity.getEnterpriseDirectory().getEnterpriseList()) {
                        for (UserAccount ua : e.getUserAccountDirectory().getUserAccountList()) {
                            if (ua.getUsername().equals(username)) {
                                JOptionPane.showMessageDialog(null, "Username already exists.");
                                return false;
                            }
                        }
                        for (Organization o : e.getOrganizationDirectory().getOrganizationList()) {
                            for (UserAccount ua : o.getUserAccountDirectory().getUserAccountList()) {
                                if (ua.getUsername().equals(username)) {
                                    JOptionPane.showMessageDialog(null, "Username already exists.");
                                    return false;
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println("5");
        return true;
    }

}
