/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.util.Date;
import java.text.SimpleDateFormat; 
import java.util.Scanner;

/**
 *
 * @author ameya
 */
public class Person extends Patient{
    
    public String name;
    public String house;
    public String community;
    public String city;
    public String address;
    public String parentname;

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public String getCommunity() {
        return community;
    }

    public void setCommunity(String community) {
        this.community = community;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    } 
    
    public static Person newPerson(){
        Person per = new Person();
        return per;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getParentname() {
        return parentname;
    }

    public void setParentname(String parentname) {
        this.parentname = parentname;
    }
    
    public void getPersonDetails(){
        Scanner scannerper = new Scanner(System.in);
        System.out.println("\nEnter full name: ");
        setName(scannerper.nextLine());
        System.out.println("Enter city");
        setCity(scannerper.nextLine());
        System.out.println("Enter community");
        setCommunity(scannerper.nextLine());
        System.out.println("Enter house");
        setHouse(scannerper.nextLine());
        System.out.println("Enter parent / legal guardian's name");
        setParentname(scannerper.nextLine());
        setAddress(getHouse() + ", " + getCommunity() + ", " + getCity());
    }
}
