/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author ameya
 */
public class PatientDirectory {
    
    public static ArrayList<Patient> ptnDirectory;
    
    public static ArrayList<Patient> newPtnDirectory(){
         ptnDirectory = new ArrayList<Patient>();
         return ptnDirectory;
    }
    
    public static void printPtnDir(){
        int x = 0;
        for (Patient ptn : ptnDirectory){
            x++;
            System.out.println(x + ". " + ptn.getPtnName() + " -- " + ptn.toString());
        }
    }
    
    public static Patient getPatient(String encName) {
        Patient ptnget = null;
        for (Patient ptn : ptnDirectory){
            if(ptn.getPtnName().equals(encName)){
                ptnget = ptn;
            }
        }
        return ptnget;
    }
}
