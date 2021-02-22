/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.util.Date;
import java.text.SimpleDateFormat;  

/**
 *
 * @author ameya
 */
public class VitalSigns {  //Consists of all the required variables for Vital Signs along with their respective Getters and Setters
     
    
    public String fname;
    public float age;
    public double respRate;
    public double heartRate;
    public double bldPressure;
    public double wgtKg;
    public double wgtLbs; 
    public String ageGroup;
    public boolean status;
    private Date time = new Date();

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
    
    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    public String getAgeGroup() {
        return ageGroup;
    }

    public void setAgeGroup(String ageGroup) {
        this.ageGroup = ageGroup;
    }
      
    public String getFname() {       
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
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
    
    @Override
    public String toString(){ //Set the format of the Time variable that records the time of the patient visit
        SimpleDateFormat dt = new SimpleDateFormat("MM/dd/yyyy - hh:mm:ss");
        return dt.format(time);
    }
    
}
