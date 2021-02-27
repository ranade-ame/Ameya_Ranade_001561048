/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ameya
 */
public class Patient {
    
    public String ptnName;//
    public int ptnID;
    
    public static int gen() {
        Random r = new Random( System.currentTimeMillis() );
        return ((1 + r.nextInt(2)) * 10000 + r.nextInt(10000));
    }
    
    private Date ptntime = new Date();

    public String getPtnName() {
        return ptnName;
    }

    public void setPtnName(String ptnName) {
        this.ptnName = ptnName;
    }
    
    public static Patient newPatient(){ //Method to create a new Vital Sign object
        Patient ptn = new Patient();
        return ptn;
    }
    
    public Boolean isPatientnormal(VitalSigns vs) {  //Method called to check if the values stored in each varaible are within their normal ranges defined in the assignment table    
        
        int x = 0;
        if (null != vs.ageGroup) switch (vs.ageGroup) {
            case "Newborn" -> {
                if((vs.respRate < 30 || vs.respRate >= 50) || (vs.heartRate < 120 || vs.heartRate >= 160) || (vs.bldPressure < 50 || vs.bldPressure >= 70) || (vs.wgtKg < 2 || vs.wgtKg >= 3) || (vs.wgtLbs < 4.5 || vs.wgtLbs >= 7)){
                    x = 1;
                }
            }
            case "Infant" -> {
                if((vs.respRate < 20 || vs.respRate >= 30) || (vs.heartRate < 80 || vs.heartRate >= 140) || (vs.bldPressure < 70 || vs.bldPressure >= 100) || (vs.wgtKg < 4 || vs.wgtKg >= 10) || (vs.wgtLbs < 9 || vs.wgtLbs >= 22)){
                    x = 1;
                }
            }
            case "Toddler" -> {
                if((vs.respRate < 20 || vs.respRate >= 30) || (vs.heartRate < 80 || vs.heartRate >= 130) || (vs.bldPressure < 80 || vs.bldPressure >= 110) || (vs.wgtKg < 10 || vs.wgtKg >= 14) || (vs.wgtLbs < 22 || vs.wgtLbs >= 31)){
                    x = 1;
                }
            }
            case "Preschooler" -> {
                if((vs.respRate < 20 || vs.respRate >= 30) || (vs.heartRate < 80 || vs.heartRate >= 120) || (vs.bldPressure < 80 || vs.bldPressure >= 110) || (vs.wgtKg < 14 || vs.wgtKg >= 18) || (vs.wgtLbs < 31 || vs.wgtLbs >= 40)){
                    x = 1;
                }
            }
            case "School Age" -> {
                if((vs.respRate < 20 || vs.respRate >= 30) || (vs.heartRate < 70 || vs.heartRate >= 110) || (vs.bldPressure < 80 || vs.bldPressure >= 120) || (vs.wgtKg < 20 || vs.wgtKg >= 42) || (vs.wgtLbs < 41 || vs.wgtLbs >= 92)){
                    x = 1;
                }
            }
            case "Adolescent" -> {
                if((vs.respRate < 12 || vs.respRate >= 20) || (vs.heartRate < 55 || vs.heartRate >= 105) || (vs.bldPressure < 110 || vs.bldPressure >= 120) || (vs.wgtKg <= 50) || (vs.wgtLbs <= 110)){
                    x = 1;
                }
            }
            default -> {
            }
        }
        
        if (x == 1){
           return false;
       }
        else{
           return true;
       }
    }
    
    public Boolean isThisVitalSignNormal(String vsign, String name){ //Method that takes String vsign as input as defined by user
        Boolean value = null; //Identifies the corresponding vitalsign variable and runs the corresponding method to check whether the value of that variable is in normal range
        Encounter encvsign = EncounterHistory.getEncHistory(name);
        
        switch (vsign) {
            case "Respiratory Rate", "respiratory rate" -> value = isRespRateNormal(encvsign);
            case "Heart Rate", "heart rate" -> value = isHeartRateNormal(encvsign);
            case "Blood Pressure", "blood pressure" -> value = isBldPressureNormal(encvsign);
            case "Weight", "weight" -> value = isWgtKgNormal(encvsign);
        default ->  {
            System.out.println("Invalid Input");
            value = false;
                }
        }
        return value;      
    }
    
    public Boolean isRespRateNormal(Encounter encvsign) { //A method for each Vital Sign variable to check if it is within normal range
        int x = 0;
        VitalSigns vs2 = encvsign.encounter.get(encvsign.encounter.size() - 1);

        if (null != vs2.ageGroup) switch (vs2.ageGroup) {
            case "Newborn" -> {
                if(vs2.respRate <= 30 || vs2.respRate >= 50){
                    x = 1;
                }
            }
            case "Infant" -> {
                if(vs2.respRate <= 20 || vs2.respRate >= 30){
                    x = 1;
                }
            }
            case "Toddler" -> {
                if(vs2.respRate <= 20 || vs2.respRate >= 30){
                    x = 1;
                }
            }
            case "Preschooler" -> {
                if(vs2.respRate <= 20 || vs2.respRate >= 30){
                    x = 1;
                }
            }
            case "School Age" -> {
                if(vs2.respRate <= 20 || vs2.respRate >= 30){
                    x = 1;
                }
            }
            case "Adolescent" -> {
                if(vs2.respRate <= 12 || vs2.respRate >= 20){
                    x = 1;
                }
            }
            default -> {
            }
        }
        
        
        if (x==1){
           return false;
       }
        else {
           return true;
        }
    }

    public Boolean isHeartRateNormal(Encounter encvsign){
        int x = 0;
        VitalSigns vs2 = encvsign.encounter.get(encvsign.encounter.size() - 1);
        if (null != vs2.ageGroup) switch (vs2.ageGroup) {
            case "Newborn" -> {
                if(vs2.heartRate <= 120 || vs2.heartRate >= 160){
                    x = 1;
                }
            }
            case "Infant" -> {
                if(vs2.heartRate <= 80 || vs2.heartRate >= 140){
                    x = 1;
                }
            }
            case "Toddler" -> {
                if(vs2.respRate <= 20 || vs2.respRate >= 30){
                    x = 1;
                }
            }
            case "Preschooler" -> {
                if(vs2.heartRate <= 80 || vs2.heartRate >= 120){
                    x = 1;
                }
            }
            case "School Age" -> {
                if(vs2.heartRate <= 70 || vs2.heartRate >= 110){
                    x = 1;
                }
            }
            case "Adolescent" -> {
                if(vs2.heartRate <= 55 || vs2.heartRate >= 105){
                    x = 1;
                }
            }
            default -> {
            }
        }
        
        if (x==1){
           return false;
       }
        else{
           return true;
       }
    }

    private Boolean isBldPressureNormal(Encounter encvsign) {
        int x = 0;
        VitalSigns vs2 = encvsign.encounter.get(encvsign.encounter.size() - 1);
        if (null != vs2.ageGroup) switch (vs2.ageGroup) {
            case "Newborn" -> {
                if(vs2.bldPressure <= 50 || vs2.bldPressure >= 70){
                    x = 1;
                }
            }
            case "Infant" -> {
                if(vs2.bldPressure <= 70 || vs2.bldPressure >= 100){
                    x = 1;
                }
            }
            case "Toddler" -> {
                if(vs2.bldPressure <= 80 || vs2.bldPressure >= 110){
                    x = 1;
                }
            }
            case "Preschooler" -> {
                if(vs2.bldPressure <= 80 || vs2.bldPressure >= 110){
                    x = 1;
                }
            }
            case "School Age" -> {
                if(vs2.bldPressure <= 80 || vs2.bldPressure >= 120){
                    x = 1;
                }
            }
            case "Adolescent" -> {
                if(vs2.bldPressure <= 110 || vs2.bldPressure >= 120){
                    x = 1;
                }
            }
            default -> {
            }
        }
        
        if (x==1){
           return false;
       }
        else{
           return true;
       }
    }

    private Boolean isWgtKgNormal(Encounter encvsign) {
        int x = 0;
        VitalSigns vs2 = encvsign.encounter.get(encvsign.encounter.size() - 1);
        if (null != vs2.ageGroup) switch (vs2.ageGroup) {
            case "Newborn" -> {
                if(vs2.bldPressure <= 50 || vs2.bldPressure >= 70){
                    x = 1;
                }
            }
            case "Infant" -> {
                if(vs2.bldPressure <= 70 || vs2.bldPressure >= 100){
                    x = 1;
                }
            }
            case "Toddler" -> {
                if(vs2.bldPressure <= 80 || vs2.bldPressure >= 110){
                    x = 1;
                }
            }
            case "Preschooler" -> {
                if(vs2.bldPressure <= 80 || vs2.bldPressure >= 110){
                    x = 1;
                }
            }
            case "School Age" -> {
                if(vs2.bldPressure <= 80 || vs2.bldPressure >= 120){
                    x = 1;
                }
            }
            case "Adolescent" -> {
                if(vs2.bldPressure <= 110 || vs2.bldPressure >= 120){
                    x = 1;
                }
            }
            default -> {
            }
        }
        
        if (x==1){
           return false;
       }
        else{
           return true;
       }
    }
    
    @Override
    public String toString(){ //Set the format of the Time variable that records the time of the patient visit
        SimpleDateFormat dt = new SimpleDateFormat("MM/dd/yyyy - hh:mm:ss");
        return dt.format(ptntime);
    }
}
