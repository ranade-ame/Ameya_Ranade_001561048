/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ameya
 */
public class Main {
    public static ArrayList<Patient> ptndir = PatientDirectory.newPtnDirectory();
    public static ArrayList<Person> perdir = PersonDirectory.newPersonDirectory();
    public static ArrayList<Encounter> enchistory = EncounterHistory.newEncHistory();
    
    public static void main(String[] args){
        addPer();
        Patient ptn = null;
        Person per;
        
        int check = 0;
        while (check == 0){
            
            System.out.println("\nADD a new patient\nVIEW existing user?\nUPDATE existing user\nType EXIT to end.");
            Scanner scuser = new Scanner(System.in);
            String scuserinp = scuser.nextLine();
            if (scuserinp.equalsIgnoreCase("add")){
                int check2 = 0;
                while(check2 == 0){
                    System.out.println("Enter patient's details below :");
                    per = new Person();
                    per.getPersonDetails();
                    VitalSigns vitalsigns1 = VitalSigns.newVitalSign();
                    vitalsigns1.setFname(per.getName());
                    Encounter enc = new Encounter();
                    ArrayList<VitalSigns> encounter = enc.newEncounter();
                    ptn = Patient.newPatient(); //Create new patient object
                    vitalsigns1.getDetails(vitalsigns1); 
                    vitalsigns1.getAgeGroup(vitalsigns1); 
                    ptn.setPtnName(vitalsigns1.getFname());
                    enc.setEncName(vitalsigns1.getFname());
                    boolean statusvs1 = ptn.isPatientnormal(vitalsigns1);
                    vitalsigns1.status = statusvs1;
                    if (statusvs1 == false){
                        System.out.println("\nPatient is abnormal!");
                    }
                    else {
                        System.out.println("\nPatient is normal!");
                    }
                    encounter.add(vitalsigns1);
                    ptndir.add(ptn);
                    enchistory.add(enc);
                    perdir.add(per);
                    Scanner ptnoptsc = new Scanner(System.in);
                    System.out.println("Check specific vitalsign?");
                    String ptnopt1 = ptnoptsc.nextLine();
                    if ("Yes".equalsIgnoreCase(ptnopt1)){
                        int vsigncount = 0;
                        while(vsigncount == 0){
                            System.out.println("Enter the vital sign to check");
                            String ptnopt2 = ptnoptsc.nextLine();
                            boolean vsignret = ptn.isThisVitalSignNormal(ptnopt2, vitalsigns1.getFname());
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
                    
                    System.out.println("\nWould you like to add another patient");
                    String ptnopt = ptnoptsc.nextLine();
                    if ("Yes".equalsIgnoreCase(ptnopt)){
                        check2 = 0;
                    }
                    else if ("No".equalsIgnoreCase(ptnopt)){
                        check2 = 1;
                        break;
                    }
                    else {
                        System.out.println("Invalid Input");
                        check2 = 1;
                        break;  
                    }
                }
            }

            else if(scuserinp.equalsIgnoreCase("view")){
                PersonDirectory.printPerDir();
                Scanner ptndiropt = new Scanner(System.in);
                System.out.println("\nWould you like to see the patient's directory?");
                String ptndiropt2 = ptndiropt.nextLine();
                if ("Yes".equalsIgnoreCase(ptndiropt2)){
                    PatientDirectory.printPtnDir();
                    EncounterHistory.printEncHistory();
                }
                else if("No".equalsIgnoreCase(ptndiropt2)){
                    break;
                }
                else {
                    System.out.println("Invalid Input");
                    break;
                }
            }
            
            else if(scuserinp.equalsIgnoreCase("update")){
                PatientDirectory.printPtnDir();
                Scanner encopt = new Scanner(System.in);
                System.out.println("Enter patient's FULLNAME.");
                String encopt1 = encopt.nextLine();
                Encounter enc2 = EncounterHistory.getEncHistory(encopt1);
                VitalSigns vitalsign2 = VitalSigns.newVitalSign();
                ptn = PatientDirectory.getPatient(enc2.getEncName());
                vitalsign2.setFname(enc2.getEncName());
                vitalsign2.getDetails(vitalsign2); 
                vitalsign2.getAgeGroup(vitalsign2); 
                boolean statusv2 = ptn.isPatientnormal(vitalsign2);
                ptn.setPtnName(vitalsign2.getFname());
                enc2.setEncName(vitalsign2.getFname());
                enc2.encounter.add(vitalsign2);
                if (statusv2 == false){
                        System.out.println("\nPatient is abnormal!");
                    }
                    else {
                        System.out.println("\nPatient is normal!");
                    }
                Scanner ptnoptsc = new Scanner(System.in);
                    System.out.println("Check specific vitalsign?");
                    String ptnopt1 = ptnoptsc.nextLine();
                    if ("Yes".equalsIgnoreCase(ptnopt1)){
                        int vsigncount = 0;
                        while(vsigncount == 0){
                            System.out.println("Enter the vital sign to check");
                            String ptnopt2 = ptnoptsc.nextLine();
                            boolean vsignret = ptn.isThisVitalSignNormal(ptnopt2, vitalsign2.getFname());
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
            }
            
            else if(scuserinp.equalsIgnoreCase("exit")){
                check = 1;
            }
            else {
                System.out.println("Invalid Input");
            } 
        }
    }
    
    public static int gen() {
        Random r = new Random( System.currentTimeMillis() );
        return ((1 + r.nextInt(2)) * 10000 + r.nextInt(10000));
    }
    
    public static void addPer(){
        String [] name = {"Chandler Bing",  "Joey Tribianni", "Rachel Green", "Ross Geller", "Monica Geller", "Phoebe Buffay"};
        String [] address = {"90 Bedford St, New York, NY 10014","90 Bedford St, New York, NY 10014","90 Bedford St, New York, NY 10014","90 Bedford St, New York, NY 10014","90 Bedford St, New York, NY 10014","90 Bedford St, New York, NY 10014"};
        String [] parents = {"Nora Tyler Bing", "Joseph Tribbiani Sr.", "Dr. Leonard Green", "Jack Geller", "Jack Geller", "Frank Buffay"};
        float[] ages = {0.01f, 0.8f, 2f, 4f, 9f, 18f};
        double [] resp = {15, 25, 25, 25, 25, 15};
        double [] heart = {140, 100, 100, 90, 80, 75};
        double [] bldpres = {55, 80, 60, 90, 90, 115};
        double [] wgt = {2.5, 7, 12, 25, 30, 60};

        for(int c = 0; c < 6; c++){
           VitalSigns vsper = VitalSigns.newVitalSign();
           Patient ptnper = Patient.newPatient();
           Person per = Person.newPerson();
           per.setName(name[c]);
           per.setAddress(address[c]);
           per.setParentname(parents[c]);
           Encounter encper = new Encounter();
           ArrayList<VitalSigns> encperdir = encper.newEncounter();
           vsper.setFname(name[c]);
           vsper.setAge(ages[c]);
           vsper.setRespRate(resp[c]);
           vsper.setHeartRate(heart[c]);
           vsper.setBldPressure(bldpres[c]);
           vsper.setWgtKg(wgt[c]);
           vsper.setWgtLbs(vsper.wgtKg * 2.20462);
           vsper.setID(gen());
           vsper.getAgeGroup(vsper);
           ptnper.setPtnName(vsper.getFname());
           encper.setEncName(vsper.getFname());
           boolean statusper = ptnper.isPatientnormal(vsper);
           vsper.status = statusper;
           encperdir.add(vsper);
           ptndir.add(ptnper);
           enchistory.add(encper);
           perdir.add(per);
        }
    }

    
}
