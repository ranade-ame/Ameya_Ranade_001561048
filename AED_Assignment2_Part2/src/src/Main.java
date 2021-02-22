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
public class Main {
    
    
    public static void main(String[] args){ //No Test Cases in Part 2, only User Input
        
        Patient ptn = new Patient(); //Create new patient object
        VitalSigns vitalsigns1 = ptn.newVitalSign(); //Create new VitalSigns object
        ptn.getDetails(vitalsigns1); //Take input from user using getDetails() method which takes VS object as input
        ptn.getAgeGroup(vitalsigns1); //Set the age group of the patient
        boolean statusvs1 = ptn.isPatientnormal(vitalsigns1); //statusv1 stores return value of isPatientnormal()
        vitalsigns1.status = statusvs1;
        System.out.println("\nPatient condition is normal? " + statusvs1);
        if (statusvs1 == false){
            System.out.println("Patient is abnormal!");
        }
        else {
            System.out.println("Patient is normal!");
        }
        
        VitalSigns vitalsigns2 = ptn.newVitalSign(); //Same as last piece of code but this is second object of Vital Sign
        ptn.getDetails(vitalsigns2);
        ptn.getAgeGroup(vitalsigns2);
        boolean statusvs2 = ptn.isPatientnormal(vitalsigns2);
        System.out.println("\nPatient condition is normal? : " + statusvs2);
        vitalsigns2.status = statusvs2;
         if (statusvs2 == false){
            System.out.println("Patient is abnormal!");
        }
        else {
            System.out.println("Patient is normal!");
        } 
        
        ptn.printhistory(); //Print both VitalSign objects stored in vitalsh ArrayList
        
        Scanner sc = new Scanner(System.in); //Takes input from user to determine which vitalsign is to be checked
        System.out.println("\nEnter the Vital Sign you want to check is normal: CASE SENSTIVE! ");
        String vsign = sc.nextLine(); //Stores User input as vsign
        boolean isVsNormal = ptn.isThisVitalSignNormal(vsign); //Runs a method to check if the the vitalsign is within normal range and stores it 
        System.out.println("\nIs the VitalSign normal? : " + isVsNormal);
        if (isVsNormal == true){
            System.out.println("Vital Sign " + vsign + " is normal");
        }
        else{
            System.out.println("Vital Sign " + vsign + " is abnormal");
        }
        sc.close();
    }
    
}
