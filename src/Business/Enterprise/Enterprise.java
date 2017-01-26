/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Enterprise;

import Business.Encounter.Encounter;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import java.util.ArrayList;

/**
 *
 * @author Aayush
 */
public abstract class Enterprise extends Organization {
    
    private EnterpriseType enterpriseType;
    private OrganizationDirectory organizationDirectory;
    
    public Enterprise (String name, EnterpriseType type)
    {
        super(name);
        this.organizationDirectory=new OrganizationDirectory();
        this.enterpriseType=type;
    }
    

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }
    
    public enum EnterpriseType
    {
        Hospital("Hospital"),
        Clinic ("Clinic"),
        Pharmacy("Pharmacy"),
        GlobalAuthority("Global Authority"),
        PharmaceuticalCompany("Pharmaceutical Company");
        
        private String value;
        
        private EnterpriseType(String value)
        {
            this.value=value;
        }
        
        public String getValue()
        {
            return value;
        }
        
        @Override
        public String toString()
        {
            return value;
        }
    }

    @Override
    public String toString() {
        return super.getName();
    }
    
    
}
