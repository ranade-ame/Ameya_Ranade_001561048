/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author ameya
 */
public class VitalSigns {
    
    public double respRate;
    public double heartRate;
    public double bldPressure;
    public double wgtKg;
    public double wgtLbs; 
    public String ageGroup;
    public boolean status;
    public float age;
    public String fullname;
    public int ID;
    int idTemp = 1000;
    private Date time = new Date();
    
    public static VitalSigns newVitalSign(){ //Method to create a new Vital Sign object
        VitalSigns vs = new VitalSigns();
        return vs;
    }
    
    public static int gen() {
        Random r = new Random( System.currentTimeMillis() );
        return ((1 + r.nextInt(2)) * 10000 + r.nextInt(10000));
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    
    public String getFname() {
        return fullname;
    }

    public void setFname(String fname) {
        this.fullname = fname;
    }
    
    public float getAge() {
        return age;
    }

    public void setAge(float age) {
        this.age = age;
    }
    
    public double getRespRate() {
        return respRate;
    }

    public void setRespRate(double respRate) {
        this.respRate = respRate;
    }

    public double getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(double heartRate) {
        this.heartRate = heartRate;
    }

    public double getBldPressure() {
        return bldPressure;
    }

    public void setBldPressure(double bldPressure) {
        this.bldPressure = bldPressure;
    }

    public double getWgtKg() {
        return wgtKg;
    }

    public void setWgtKg(double wgtKg) {
        this.wgtKg = wgtKg;
    }

    public double getWgtLbs() {
        return wgtLbs;
    }

    public void setWgtLbs(double wgtLbs) {
        this.wgtLbs = wgtLbs;
    }

    public String getAgeGroup() {
        return ageGroup;
    }

    public void setAgeGroup(String ageGroup) {
        this.ageGroup = ageGroup;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
        if (status == false){
                System.out.println("\nPatient is abnormal!");
            }
            else {
                System.out.println("\nPatient is normal!");
            }
    }
    
    @Override
    public String toString(){ //Set the format of the Time variable that records the time of the patient visit
        SimpleDateFormat dt = new SimpleDateFormat("MM/dd/yyyy - hh:mm:ss");
        return dt.format(time);
    }
    
    public static void getDetails(VitalSigns vs){ //Method called to set the User Input values to the variables in Vital Signs.
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
        vs.setID(gen());
        
        
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
    
    
}
