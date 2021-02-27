/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.util.ArrayList;

/**
 *
 * @author ameya
 */
public class House extends City{
    
    public String houseName;
    
    public ArrayList<Person> houseList = new ArrayList<Person>();

    public String getHouseName() {
        return houseName;
    }

    public void setHouseName(String houseName) {
        this.houseName = houseName;
    }

    public ArrayList<Person> getHouseList() {
        return houseList;
    }

    public void setHouseList(ArrayList<Person> houseList) {
        this.houseList = houseList;
    }
    
    
    
}
