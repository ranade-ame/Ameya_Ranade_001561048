/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ameya
 */
public class Encounter extends Person{
    
    public String encName;
    
    public ArrayList<VitalSigns> encounter;
    
    public ArrayList<VitalSigns> newEncounter(){
        encounter = new ArrayList<VitalSigns>();
        return encounter;
    }

    public String getEncName() {
        return encName;
    }

    public void setEncName(String encName) {
        this.encName = encName;
    }
    
    public void printEncounter(){ //Method called to print the details enterred as User Input and the corresponding status of the patient
            
        for (VitalSigns vs : encounter){

            System.out.println("\nFull name: " + vs.getFname());
            System.out.println("Patient ID: " + vs.getID());
            System.out.println("Time: " + vs.toString());
            System.out.println("Age: " + vs.getAge());
            System.out.println("Age group: " + vs.getAgeGroup());
            System.out.println("Respiratory Rate: " + vs.getRespRate());
            System.out.println("Heart Rate: " + vs.getHeartRate());
            System.out.println("Blood Pressure: " + vs.getBldPressure());
            System.out.println("Weight(kg): " + vs.getWgtKg());
            System.out.println("Weight(Lbs): " + vs.getWgtLbs());
            System.out.println("Status: " + vs.isStatus());        
        }   
    }    
}
