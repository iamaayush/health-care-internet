/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Enterprise;

import Business.Creator;
import java.util.ArrayList;

/**
 *
 * @author Aayush
 */
public class EnterpriseDirectory {
    
    private ArrayList<Enterprise> enterpriseList;
    
    public EnterpriseDirectory()
    {
        enterpriseList = new ArrayList();
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
    
    public Enterprise createAndAddEnterprise(String name, Enterprise.EnterpriseType type)
    {
        Enterprise enterprise = null;
        if(type == Enterprise.EnterpriseType.Hospital)
        {
            enterprise = new HospitalEnterprise(name, type);
            enterpriseList.add(enterprise);
        }
        
        if(type == Enterprise.EnterpriseType.Clinic)
        {
            enterprise = new ClinicEnterprise(name, type);
            enterpriseList.add(enterprise);
        }
        
        if(type == Enterprise.EnterpriseType.Pharmacy)
        {
            enterprise = new PharmacyEnterprise(name, type);
            enterpriseList.add(enterprise);
        }
        
        if(type == Enterprise.EnterpriseType.PharmaceuticalCompany)
        {
            enterprise = new PharmaceuticalCompanyEnterprise(name, type);
            enterpriseList.add(enterprise);
        }
        if(type == Enterprise.EnterpriseType.GlobalAuthority)
        {
            enterprise = new Creator(name);
            enterpriseList.add(enterprise);
        }
        
        return enterprise;
    }
    
    public void removeEnterprise(Enterprise enterprise)
    {
        enterpriseList.remove(enterprise);
    }
}
