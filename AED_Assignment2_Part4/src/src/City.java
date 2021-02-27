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
public class City extends Cities{
    
    public String cityName;
    
    public static ArrayList<Community> cityList = new ArrayList<Community>();
    
//    public static ArrayList<Community> newCity(){
//        cityList = new ArrayList<Community>();
//        return cityList;
//    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public ArrayList<Community> getCityList() {
        return cityList;
    }

    public static void setCityList(ArrayList<Community> cityList) {
        City.cityList = cityList;
    }
    
    
    public Community setHouseCommunity(String communityName){
        Community comget = null;
        for (Community com : cityList){
            if(com.getCommunityName().equalsIgnoreCase(communityName)){
                comget = com;
            }
        }
        if (comget == null){
            comget = new Community();
            cityList.add(comget);
        }
        return comget;
    }
    
    public void printCommunity(String cityName){
        City cityPrint = setCityinCities(cityName);
        ArrayList<Community> citylistPrint = cityPrint.getCityList();
        int b = 1;
        for(Community comPrint : citylistPrint){
            System.out.println(b + ". " + comPrint.getCommunityName());
            b++;
        }
    }
    
}
