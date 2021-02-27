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
    public static ArrayList<City> listofCities = Cities.newlistofCities();
    
    public static void main(String[] args){
        addStockPer();
        Patient ptn = null;
        Person per;
        House house;
        Community community;
        City city;
        Cities cities = new Cities();
        
        int check = 0;
        while (check == 0){
            
            System.out.println("\nADD a new patient\nVIEW existing user?\nUPDATE existing user\nGET abnormal cases\nType EXIT to end.");
            Scanner scuser = new Scanner(System.in);
            String scuserinp = scuser.nextLine();
            if (scuserinp.equalsIgnoreCase("add")){
                int check2 = 0;
                while(check2 == 0){
                    System.out.println("Enter patient's details below :");
                    per = new Person();
                    per.getPersonDetails();
                    
                    city = Cities.setCityinCities(per.getCity());
                    city.setCityName(per.getCity());
                    community = city.setHouseCommunity(per.getCommunity());
                    community.setCommunityName(per.getCommunity());
                    house = community.setPerHouse(per.getHouse());
                    house.setHouseName(per.getHouse());
                    
                    VitalSigns vitalsigns1 = VitalSigns.newVitalSign();
                    vitalsigns1.setFname(per.getName());
                    Encounter enc = new Encounter();
                    ArrayList<VitalSigns> encounter = enc.newEncounter();
                    ptn = Patient.newPatient(); //Create new patient object
                    vitalsigns1.getDetails(vitalsigns1); 
                    vitalsigns1.getAgeGroup(vitalsigns1); 
                    ptn.setPtnName(vitalsigns1.getFname());
                    enc.setEncName(vitalsigns1.getFname());
                    ArrayList<Person> houseList = house.getHouseList();
                    houseList.add(per);
                    
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
                    continue;
                }
                else {
                    System.out.println("Invalid Input");
                    continue;
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
            
            else if(scuserinp.equalsIgnoreCase("get")){
                city = new City();
                community = new Community();
                house = new House();
                Cities.printCities();
                Scanner getscan = new Scanner(System.in);
                System.out.println("Select a city");
                String cityGet = getscan.nextLine();
                city.printCommunity(cityGet);
                System.out.println("Select a community");
                String comGet = getscan.nextLine();
                community.printAbnormalCases(comGet);
                
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
    
    public static void addStockPer(){
        String [] name = {"Chandler Bing",  "Joey Tribianni", "Rachel Green", "Ross Geller", "Monica Geller", "Phoebe Buffay","Lois Britton","Amin Phillips","Susie Cresswell","Asha Gibbs","Jacob Page","Latisha Stark","Maddox Rayner","Hashim Willis","Lesley Mcpherson","Peggy Maxwell", "Angelica Barrett", "Neal Garza", "Angie Gross", "Rosa Wood", "Muriel Hall", "Kate Rivera", "Glenda Fields", "Bessie Singleton", "Caroline Ruiz", "Nora Leonard", "Zachary Bates", "Natasha Rios", "Jamie Taylor", "Sarah Henry"};
        String [] house = {"90 Bedford St 1", "90 Bedford St 1", "90 Bedford St 2", "91 Bedford St", "90 Bedford St 2", "1-15 Morton St 1","33 Lan","34 Lan","35 Lan","45 Lan","50 Lan","55 Lan","60 Lan","15 Lan","20 Lan","25 Lan", "30 Beacon", "40 Boylston", "26 Lan", "28 Lan", "45 Boylston", "32 Beacon", "40 Bedford", "50 Beacon", "42 Boylston", "12 Lan", "18 Lan", "20 Beacon", "30 Boylston", "15 Lan"};
        String [] community = {"Greenwich", "Greenwich","Greenwich","Greenwich","Greenwich","Greenwich", "Brookline", "Brookline", "Brookline", "Brookline", "Brookline", "Brookline", "Brookline", "Brookline","Brookline","Brookline", "Greenwich", "Brookline", "Greenwich", "Brookline", "Greenwich", "Brookline", "Greenwich", "Brookline", "Brookline", "Brookline", "Brookline", "Brookline", "Brookline", "Brookline"};
        String [] city = {"Boston", "Boston", "Boston", "Boston", "Boston", "Boston","Boston","Boston","Boston","Boston","Boston","Boston","Boston","Boston","Boston","Boston", "Boston", "Boston", "Boston", "Boston", "Boston", "Boston", "Boston", "Boston", "Boston", "Boston", "Boston", "Boston", "Boston", "Boston"};
        String [] parents = {"Nora Tyler Bing", "Joseph Tribbiani Sr.", "Dr. Leonard Green", "Jack Geller", "Jack Geller", "Frank Buffay", "Krista Hansen", "Leah Mcgee", "Wilfred Baker", "Lillie Caldwell", "Lindsey Watson", "Harry Hubbard", "Nicholas Burke", "Juana Chapman", "Marlon Leonard", "Luz Hogan", "Felix Lucas", "Joanna Gill", "Emilio Boone", "Matthew Rose", "Beverly Bass", "Darryl Andrews", "Tricia Santiago", "Amber Cannon", "Traci Sanders", "Ryan Gibson", "Christian Beck", "Roger Collins", "Agnes Hart", "Jan Vasquez"};
        float[] ages = {0.01f, 0.8f, 2f, 4f, 9f, 18f, 0.03f, 0.2f, 2f, 4f, 9f, 15f, 5f, 0.01f, 1.5f, 2f, 15f, 5f, 0.08f, 0.5f, 8f, 3f, 12f, 10f, 17f, 6f, 9f, 10f, 13f, 5f};
        double [] resp = {15, 25, 25, 25, 25, 15, 12, 25, 25, 25, 25, 25, 25, 25, 25, 25, 35, 20, 22, 27, 29, 31, 33, 34, 23, 19, 12, 10, 11, 12};
        double [] heart = {140, 100, 100, 90, 80, 75, 140, 100, 120, 105, 115, 120, 150, 160, 105, 140, 120, 130, 135, 130, 128, 125, 132, 145, 125, 142, 137, 127, 122, 105};
        double [] bldpres = {55, 80, 60, 90, 90, 115, 80, 90, 85, 100, 80, 90, 120, 100, 90, 85, 57, 63, 70, 65, 90, 100, 113, 103, 98, 70, 60, 80, 93, 88};
        double [] wgt = {2.5, 7, 12, 25, 30, 60, 5, 8, 9, 10, 20, 35, 40, 55, 60, 65, 2.5, 4.5, 8, 9, 4.7, 3.8, 8.8, 50, 25, 18, 30, 35, 27, 18};

        for(int c = 0; c < name.length; c++){
           Cities citiesStock = new Cities();
           VitalSigns vsper = VitalSigns.newVitalSign();
           Patient ptnper = Patient.newPatient();
           Person per = Person.newPerson();
           per.setName(name[c]);
           ptnper.setPtnName(name[c]);
           per.setHouse(house[c]);
           per.setCommunity(community[c]);
           per.setCity(city[c]);
           per.setParentname(parents[c]);
           per.setAddress(per.getHouse() + ", " + per.getCommunity() + ", " + per.getCity());
           City cityStockObj = citiesStock.setCityinCities(per.getCity());
           cityStockObj.setCityName(per.getCity());
           Community comStockObj = cityStockObj.setHouseCommunity(per.getCommunity());
           comStockObj.setCommunityName(per.getCommunity());
           House houseStockObj = comStockObj.setPerHouse(per.getHouse());
           houseStockObj.setHouseName(per.getHouse()); 
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
           ArrayList<Person> houseListStock = houseStockObj.getHouseList();
           houseListStock.add(per);
        }
    }

    
}
