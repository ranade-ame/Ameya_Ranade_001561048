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

public class Patient {
        
    public static ArrayList<VitalSigns> vitalsh = new ArrayList<VitalSigns>(); //ArrayList to store VitalSign objects is created and initialised
        
    public VitalSigns newVitalSign(){ //Method to create a new Vital Sign object
        VitalSigns vs = new VitalSigns();
        return vs;
    }
    
    public void getDetails(VitalSigns vs){ //Method called to set the User Input values to the variables in Vital Signs.
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter full name: ");
        vs.setFname(scan.nextLine());
        //System.out.println("Enter date: ");
        //vs.setDate(scan.nextLine());
        System.out.println("Enter age : ");
        vs.setAge(scan.nextFloat());
        System.out.println("Enter respiratory rate : ");
        vs.setRespRate(scan.nextDouble());
        System.out.println("Enter heart rate : ");
        vs.setHeartRate(scan.nextDouble());
        System.out.println("Enter systolic blood pressure : ");
        vs.setBldPressure(scan.nextDouble());
        System.out.println("Enter weight in kilo : ");
        vs.setWgtKg(scan.nextDouble());
        vs.setWgtLbs(vs.wgtKg * 2.20462);
        
        
    }
    
    public void getAgeGroup(VitalSigns vs){ //Checks the age value enterred by user and assigns the corresponding age group defined in the table
        if (vs.age == 0.1){
            vs.setAgeGroup("Newborn");
        }
        else if (vs.age > 0.1 && vs.age <= 1){
            vs.setAgeGroup("Infant");
        }
        else if (vs.age > 1 && vs.age <= 3){
            vs.setAgeGroup("Toddler");
        }
        else if (vs.age > 3 && vs.age <= 5){
            vs.setAgeGroup("Preschooler");
        }
        else if (vs.age > 5 && vs.age <= 12){
            vs.setAgeGroup("School Age");
        }
        else if (vs.age > 12){
            vs.setAgeGroup("Adolescent");
        }
    }
    
    public Boolean isPatientnormal(VitalSigns vs) {  //Method called to check if the values stored in each varaible are within their normal ranges defined in the assignment table    
        
        int x = 0;
        if ("Newborn".equals(vs.ageGroup)) {
            if((vs.respRate < 30 || vs.respRate >= 50) || (vs.heartRate < 120 || vs.heartRate >= 160) || (vs.bldPressure < 50 || vs.bldPressure >= 70) || (vs.wgtKg < 2 || vs.wgtKg >= 3) || (vs.wgtLbs < 4.5 || vs.wgtLbs >= 7)){
                x = 1;
            }
        }
        
        if ("Infant".equals(vs.ageGroup)) {
            if((vs.respRate < 20 || vs.respRate >= 30) || (vs.heartRate < 80 || vs.heartRate >= 140) || (vs.bldPressure < 70 || vs.bldPressure >= 100) || (vs.wgtKg < 4 || vs.wgtKg >= 10) || (vs.wgtLbs < 9 || vs.wgtLbs >= 22)){
                x = 1;
            }
        }
        if ("Toddler".equals(vs.ageGroup)) {
            if((vs.respRate < 20 || vs.respRate >= 30) || (vs.heartRate < 80 || vs.heartRate >= 130) || (vs.bldPressure < 80 || vs.bldPressure >= 110) || (vs.wgtKg < 10 || vs.wgtKg >= 14) || (vs.wgtLbs < 22 || vs.wgtLbs >= 31)){
                x = 1;
            }
        }
        if ("Preschooler".equals(vs.ageGroup)) {
            if((vs.respRate < 20 || vs.respRate >= 30) || (vs.heartRate < 80 || vs.heartRate >= 120) || (vs.bldPressure < 80 || vs.bldPressure >= 110) || (vs.wgtKg < 14 || vs.wgtKg >= 18) || (vs.wgtLbs < 31 || vs.wgtLbs >= 40)){
                x = 1;
            }
        }
        if ("School Age".equals(vs.ageGroup)) {
            if((vs.respRate < 20 || vs.respRate >= 30) || (vs.heartRate < 70 || vs.heartRate >= 110) || (vs.bldPressure < 80 || vs.bldPressure >= 120) || (vs.wgtKg < 20 || vs.wgtKg >= 42) || (vs.wgtLbs < 41 || vs.wgtLbs >= 92)){
                x = 1;
            }
        }   
        if ("Adolescent".equals(vs.ageGroup)) {
            if((vs.respRate < 12 || vs.respRate >= 20) || (vs.heartRate < 55 || vs.heartRate >= 105) || (vs.bldPressure < 110 || vs.bldPressure >= 120) || (vs.wgtKg <= 50) || (vs.wgtLbs <= 110)){
                x = 1;
            }
        }            
        
        vitalsh.add(vs);
        
        if (x == 1){
           return false;
       }
        else{
           return true;
       }
    }
    
    public void printhistory(){ //Method called to print the details enterred as User Input and the corresponding status of the patient
               
        for (VitalSigns vs : vitalsh){
            
            System.out.println("\nFull name: " + vs.getFname());
            System.out.println("Time: " + vs.toString());
            System.out.println("Age: " + vs.getAge());
            System.out.println("Age group: " + vs.getAgeGroup());
            System.out.println("Respiratory Rate: " + vs.getRespRate());
            System.out.println("Heart Rate: " + vs.getHeartRate());
            System.out.println("Weight(kg): " + vs.getWgtKg());
            System.out.println("Weight(Lbs): " + vs.getWgtLbs());
            System.out.println("Status: " + vs.isStatus());
            
        }
    }
    
    public Boolean isThisVitalSignNormal(String vsign){ //Method that takes String vsign as input as defined by user
        Boolean value = null;                           //Identifies the corresponding vitalsign variable and runs the corresponding method
                                                        //to check whether the value of that variable is in normal range
        if(vsign.equals("Respiratory Rate")) {
            value = isRespRateNormal(); 
        }
        else if (vsign.equals("Heart Rate")){
            value = isHeartRateNormal();
        }
        else if (vsign.equals("Blood Pressure")){
            value = isBldPressureNormal();
        }
        else if (vsign.equals("Weight")){
            value = isWgtKgNormal();
        }
        return value;      
    }
    
    public Boolean isRespRateNormal() { //A method for each Vital Sign variable to check if it is within normal range
        int x = 0;
        for (VitalSigns vs: vitalsh){
            
            if ("Newborn".equals(vs.ageGroup)) {
                if(vs.respRate <= 30 || vs.respRate >= 50){
                    x = 1;
                }
            }
            if ("Infant".equals(vs.ageGroup)) {
                if(vs.respRate <= 20 || vs.respRate >= 30){
                    x = 1;
                }
            }
            if ("Toddler".equals(vs.ageGroup)) {
                if(vs.respRate <= 20 || vs.respRate >= 30){
                x = 1;
                }
            }
            if ("Preschooler".equals(vs.ageGroup)) {
                if(vs.respRate <= 20 || vs.respRate >= 30){
                    x = 1;
                }
            }
            if ("School Age".equals(vs.ageGroup)) {
                if(vs.respRate <= 20 || vs.respRate >= 30){
                    x = 1;
                }
            }      
            if ("Adolescent".equals(vs.ageGroup)) {
                if(vs.respRate <= 12 || vs.respRate >= 20){
                    x = 1;
                }
            }    
        }
        
        if (x==1){
           return false;
       }
        else {
           return true;
        }
    }

    public Boolean isHeartRateNormal(){
        int x = 0;
        for (VitalSigns vs: vitalsh){
            if ("Newborn".equals(vs.ageGroup)) {
                if(vs.heartRate <= 120 || vs.heartRate >= 160){
                    x = 1;
                }
            }
            if ("Infant".equals(vs.ageGroup)) {
                if(vs.heartRate <= 80 || vs.heartRate >= 140){
                    x = 1;
                }
            }
            if ("Toddler".equals(vs.ageGroup)) {
                if(vs.respRate <= 20 || vs.respRate >= 30){
                    x = 1;
                }
            }
            if ("Preschooler".equals(vs.ageGroup)) {
                if(vs.heartRate <= 80 || vs.heartRate >= 120){
                    x = 1;
                }
            }
            if ("School Age".equals(vs.ageGroup)) {
                if(vs.heartRate <= 70 || vs.heartRate >= 110){
                    x = 1;
                }
            }   
            if ("Adolescent".equals(vs.ageGroup)) {
                if(vs.heartRate <= 55 || vs.heartRate >= 105){
                    x = 1;
                }
            } 
        }
        
        if (x==1){
           return false;
       }
        else{
           return true;
       }
    }

    private Boolean isBldPressureNormal() {
        int x = 0;
        for (VitalSigns vs: vitalsh){
            if ("Newborn".equals(vs.ageGroup)) {
                if(vs.bldPressure <= 50 || vs.bldPressure >= 70){
                    x = 1;
                }
            }
            if ("Infant".equals(vs.ageGroup)) {
                if(vs.bldPressure <= 70 || vs.bldPressure >= 100){
                    x = 1;
                }
            }
            if ("Toddler".equals(vs.ageGroup)) {
                if(vs.bldPressure <= 80 || vs.bldPressure >= 110){
                    x = 1;
                }
            }
            if ("Preschooler".equals(vs.ageGroup)) {
                if(vs.bldPressure <= 80 || vs.bldPressure >= 110){
                    x = 1;
                }
            }
            if ("School Age".equals(vs.ageGroup)) {
                if(vs.bldPressure <= 80 || vs.bldPressure >= 120){
                    x = 1;
                }
            }   
            if ("Adolescent".equals(vs.ageGroup)) {
                if(vs.bldPressure <= 110 || vs.bldPressure >= 120){
                    x = 1;
                }
            } 
        }
        
        if (x==1){
           return false;
       }
        else{
           return true;
       }
    }

    private Boolean isWgtKgNormal() {
        int x = 0;
        for (VitalSigns vs: vitalsh){
            if ("Newborn".equals(vs.ageGroup)) {
                if(vs.bldPressure <= 50 || vs.bldPressure >= 70){
                    x = 1;
                }
            }
            if ("Infant".equals(vs.ageGroup)) {
                if(vs.bldPressure <= 70 || vs.bldPressure >= 100){
                    x = 1;
                }
            }
            if ("Toddler".equals(vs.ageGroup)) {
                if(vs.bldPressure <= 80 || vs.bldPressure >= 110){
                    x = 1;
                }
            }
            if ("Preschooler".equals(vs.ageGroup)) {
                if(vs.bldPressure <= 80 || vs.bldPressure >= 110){
                    x = 1;
                }
            }
            if ("School Age".equals(vs.ageGroup)) {
                if(vs.bldPressure <= 80 || vs.bldPressure >= 120){
                    x = 1;
                }
            }   
            if ("Adolescent".equals(vs.ageGroup)) {
                if(vs.bldPressure <= 110 || vs.bldPressure >= 120){
                    x = 1;
                }
            } 
        }
        
        if (x==1){
           return false;
       }
        else{
           return true;
       }
    }
}
