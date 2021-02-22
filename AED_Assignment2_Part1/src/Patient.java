
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ameya
 */
public class Patient {
    public void getDetails(VitalSigns vs){ //Method called to set the User Input values to the variables in Vital Signs.
        Scanner scan = new Scanner(System.in);
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
    
    public Boolean isPatientnormal(VitalSigns vs) { //Method called to check if the values stored in each varaible are within their normal ranges defined in the assignment table
        
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
        
        if (x==1){
           return false;
       }
        else{
           return true;
       }
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
    
    public void printhistory(VitalSigns vs){ //Method called to print the details enterred as User Input and the corresponding status of the patient
        System.out.println("Age: " + vs.getAge());
        System.out.println("Age group: " + vs.getAgeGroup());
        System.out.println("Respiratory Rate: " + vs.getRespRate());
        System.out.println("Heart Rate: " + vs.getHeartRate());
        System.out.println("Weight(kg): " + vs.getWgtKg());
        System.out.println("Weight(Lbs): " + vs.getWgtLbs());
        System.out.println("Status: " + vs.isStatus());
    }
}
