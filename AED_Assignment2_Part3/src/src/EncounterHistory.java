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
public class EncounterHistory {
    
    public static ArrayList<Encounter> enchistory;
    
    public static ArrayList<Encounter> newEncHistory(){
        enchistory = new ArrayList<Encounter>();
        return enchistory;
    }
    
    public static void printEncHistory(){ //Method called to print the details enterred as User Input and the corresponding status of the patient
            Patient ptnenc = new Patient();
            Scanner encopt = new Scanner(System.in);
            System.out.println("Get which patient's records?");
            String encopt1 = encopt.nextLine();
            for (Encounter enc : enchistory){
                if (enc.getEncName().equalsIgnoreCase(encopt1)){
                    enc.printEncounter();
                    Scanner ptnoptsc = new Scanner(System.in);
                    System.out.println("Check specific vitalsign?");
                    String ptnopt1 = ptnoptsc.nextLine();
                    if ("Yes".equalsIgnoreCase(ptnopt1)){
                        int vsigncount = 0;
                        while(vsigncount == 0){
                            System.out.println("Enter the vital sign to check");
                            String ptnopt2 = ptnoptsc.nextLine();
                            boolean vsignret = ptnenc.isThisVitalSignNormal(ptnopt2, enc.getEncName());
                            if (vsignret == true){
                                System.out.println("Vital Sign is normal");
                            }
                            else{
                                System.out.println("Vital Sign is abnormal");
                            }
                            System.out.println("Check another vital sign?");
                            String ptnopt3 = ptnoptsc.nextLine();
                            if ("Yes".equalsIgnoreCase(ptnopt3)){
                                vsigncount = 0;
                            }
                            else if ("No".equalsIgnoreCase(ptnopt3)){
                                vsigncount++;
                            }
                            else {
                                System.out.println("Invalid Input");
                                vsigncount++;
                            }
                        }   
                    }
                    else if ("No".equalsIgnoreCase(ptnopt1)){
                        break;
                    }
                    else {
                        System.out.println("Invalid Input");
                        break;  
                    }
                    break;
                }
//                else{
//                    System.out.println("Patient not found, still looking");
//                }
                
            }
    }
    
    public static Encounter getEncHistory(String encopt1){
        Encounter encget = null;
//        Scanner encopt = new Scanner(System.in);
//        System.out.println("Enter patient's FULLNAME.");
//        String encopt1 = encopt.nextLine();
        int encindex = 0;
        for (Encounter enc : enchistory){
            if (enc.getEncName().equalsIgnoreCase(encopt1)){
                encget = enc;
                break;

            }
            encindex++;
        }
        return encget;
    }
}
