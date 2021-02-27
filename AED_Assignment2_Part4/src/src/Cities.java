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
public class Cities{
    
    public static ArrayList<City> listofCities;
    
    public static ArrayList<City> newlistofCities(){
        listofCities = new ArrayList<City>();
        return listofCities;
    }

    public static ArrayList<City> getListofCities() {
        return listofCities;
    }

    public static void setListofCities(ArrayList<City> listofCities) {
        Cities.listofCities = listofCities;
    }
    
    public static City setCityinCities(String cityName){
        City cityget = null;
        for (City c : listofCities){
            if(c.getCityName().equalsIgnoreCase(cityName)){
                cityget = c;
            }
        }
        if (cityget == null){
            cityget = new City();
            listofCities.add(cityget);
        }
        return cityget;
    }
    
    public static void printCities(){
        int a = 1;
        for (City cityprint : listofCities){
            System.out.println(a + ". "+ cityprint.getCityName());
            a++;
        }
    }
    
}
