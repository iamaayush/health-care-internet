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
public class NetworkCountry {
    
    private String countryName;
    private ArrayList<NetworkState> stateList;
    
    public NetworkCountry()
    {
        stateList = new ArrayList<>();
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public ArrayList<NetworkState> getStateList() {
        return stateList;
    }

    public void setStateList(ArrayList<NetworkState> stateList) {
        this.stateList = stateList;
    }
    public NetworkState createAndAddState()
    {
        NetworkState networkState = new NetworkState();
        stateList.add(networkState);
        return networkState;
    }
    
    public void removeState(NetworkState ns)
    {
        stateList.remove(ns);
    }


    @Override
    public String toString()
    {
        return countryName;
    }
    
}
