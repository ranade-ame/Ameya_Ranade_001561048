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
    public String address;
    public String parentname;
    
    
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
        System.out.println("Enter address");
        setAddress(scannerper.nextLine());
        System.out.println("Enter parent / legal guardian's name");
        setParentname(scannerper.nextLine());
    }
}
