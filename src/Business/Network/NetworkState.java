/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Network;

import java.util.ArrayList;

/**
 *
 * @author Aayush
 */
public class NetworkState {
    
    private String stateName;
    private ArrayList<NetworkCity> cityList;
    
    public NetworkState()
    {
        cityList = new ArrayList<>();
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public ArrayList<NetworkCity> getCityList() {
        return cityList;
    }

    public void setCityList(ArrayList<NetworkCity> cityList) {
        this.cityList = cityList;
    }
    
    public NetworkCity createAndAddCity()
    {
        NetworkCity networkCity = new NetworkCity();
        cityList.add(networkCity);
        return networkCity;
    }
    
    public void removeCity(NetworkCity ncity)
    {
        cityList.remove(ncity);
    }

    
    @Override
    public String toString()
    {
        return stateName;
    }
    
}
