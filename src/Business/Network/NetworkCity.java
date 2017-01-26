/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Network;

import Business.Enterprise.EnterpriseDirectory;

/**
 *
 * @author Aayush
 */
public class NetworkCity {
    
    private String cityName;
    private EnterpriseDirectory enterpriseDirectory;
    
    public NetworkCity()
    {
        enterpriseDirectory = new EnterpriseDirectory();
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    public void setEnterpriseDirectory(EnterpriseDirectory enterpriseDirectory) {
        this.enterpriseDirectory = enterpriseDirectory;
    }
    
    @Override
    public String toString()
    {
        return cityName;
    }
}
