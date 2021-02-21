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
    
    
    public static void main(String[] args){
        
        Patient ptn = new Patient();
       
        VitalSigns vitalsigns1 = ptn.newVitalSign();
        ptn.getDetails(vitalsigns1);
        ptn.getAgeGroup(vitalsigns1);
        boolean statusvs1 = ptn.isPatientnormal(vitalsigns1);
        vitalsigns1.status = statusvs1;
        System.out.println("\nPatient condition is normal? " + statusvs1);
        if (statusvs1 == false){
            System.out.println("Patient is abnormal!");
        }
        else {
            System.out.println("Patient is normal!");
        }
        
        VitalSigns vitalsigns2 = ptn.newVitalSign();
        ptn.getDetails(vitalsigns2);
        ptn.getAgeGroup(vitalsigns2);
        boolean statusvs2 = ptn.isPatientnormal(vitalsigns2);
        System.out.println("\nPatient condition is normal? " + statusvs2);
        vitalsigns2.status = statusvs2;
         if (statusvs2 == false){
            System.out.println("Patient is abnormal!");
        }
        else {
            System.out.println("Patient is normal!");
        } 
        ptn.printhistory();
        
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the Vital Sign you want to check is normal: CASE SENSTIVE! ");
        String vsign = sc.nextLine();
        
        boolean isVsNormal = ptn.isThisVitalSignNormal(vsign);
        System.out.println(isVsNormal);
        
        if (isVsNormal == true){
            System.out.println("Vital Sign " + vsign + " is normal");
        }
        else{
            System.out.println("Vital Sign " + vsign + " is abnormal");
        }
        sc.close();
        
    }
    
}
