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
            System.out.println("\nPatient is abnormal!");
        }
        else {
            System.out.println("\nPatient is normal!");
        }
        
        VitalSigns vitalsigns2 = ptn.newVitalSign(); //Same as last piece of code but this is second object of Vital Sign
        ptn.getDetails(vitalsigns2);
        ptn.getAgeGroup(vitalsigns2);
        boolean statusvs2 = ptn.isPatientnormal(vitalsigns2);
        System.out.println("\nPatient condition is normal? : " + statusvs2);
        vitalsigns2.status = statusvs2;
         if (statusvs2 == false){
            System.out.println("\nPatient is abnormal!");
        }
        else {
            System.out.println("\nPatient is normal!");
        } 
        
        ptn.printhistory(); //Print both VitalSign objects stored in vitalsh ArrayList
        
        Scanner sc = new Scanner(System.in); //Takes input from user to determine which vitalsign is to be checked
        int x = 0;
        while (x == 0) {
            System.out.println("\nEnter the Vital Sign you want to check is normal: ");
            String vsign = sc.nextLine(); //Stores User input as vsign
            boolean isVsNormal = ptn.isThisVitalSignNormal(vsign); //Runs a method to check if the the vitalsign is within normal range and stores it 
            System.out.println("\nIs the VitalSign normal? : " + isVsNormal);
            if (isVsNormal == true){
                System.out.println("\nVital Sign " + vsign + " is normal");
            }
            else if (isVsNormal == false){
                System.out.println("\nVital Sign " + vsign + " is abnormal");
            }
            System.out.println("\nCheck another vsign? Enter 'Yes of 'No'! ");
            String option3 = sc.nextLine();
            if ("Yes".equals(option3) || "yes".equals(option3)){
                x = 0;
            }
            else if ("No".equals(option3) || "no".equals(option3)){
                x = 1;
            }
            else {
                System.out.println("\nInvalid Input");
                x = 0;
            }
        }
        sc.close();
    }
    
}
