
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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 'Test Cases' to use Test Cases.\nEnter 'User Input' to enter values.\n");
        String option = sc.nextLine();
        
        if ("User Input".equals(option)){
            
            Patient ptn = new Patient();
            VitalSigns vitalsigns1 = new VitalSigns();
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
            ptn.printhistory(vitalsigns1);
        }
        
        if ("Test Cases".equals(option)){
            TestCases ts = new TestCases();
            VitalSigns vitalsigns = new VitalSigns();
            Patient ptnTestCase = new Patient();
            Scanner sc2 = new Scanner(System.in);
            System.out.println("Select the Test Case:\nNewborn\nInfant\nToddler\nPreschooler\nSchool\nAdolescent");
            String option2 = sc2.nextLine();
            if("Newborn".equals(option2)){
                ts.NewbornTestCase(vitalsigns);
                ptnTestCase.getAgeGroup(vitalsigns);
                boolean statusTestCase = ptnTestCase.isPatientnormal(vitalsigns);
                vitalsigns.status = statusTestCase;
                if (statusTestCase == false){
                    System.out.println("Patient is abnormal!");
                }
                else {
                    System.out.println("Patient is normal!");
                }
                ptnTestCase.printhistory(vitalsigns);
            }
            if("Infant".equals(option2)){
                ts.InfantTestCase(vitalsigns);
                ptnTestCase.getAgeGroup(vitalsigns);
                boolean statusTestCase = ptnTestCase.isPatientnormal(vitalsigns);
                vitalsigns.status = statusTestCase;
                if (statusTestCase == false){
                    System.out.println("Patient is abnormal!");
                }
                else {
                    System.out.println("Patient is normal!");
                }
                ptnTestCase.printhistory(vitalsigns);
            }
            if("Toddler".equals(option2)){
                ts.TodderTestCase(vitalsigns);
                ptnTestCase.getAgeGroup(vitalsigns);
                boolean statusTestCase = ptnTestCase.isPatientnormal(vitalsigns);
                vitalsigns.status = statusTestCase;
                if (statusTestCase == false){
                    System.out.println("Patient is abnormal!");
                }
                else {
                    System.out.println("Patient is normal!");
                }
                ptnTestCase.printhistory(vitalsigns);
            }
            if("Preschooler".equals(option2)){
                ts.PreschoolerTestCase(vitalsigns);
                ptnTestCase.getAgeGroup(vitalsigns);
                boolean statusTestCase = ptnTestCase.isPatientnormal(vitalsigns);
                vitalsigns.status = statusTestCase;
                if (statusTestCase == false){
                    System.out.println("Patient is abnormal!");
                }
                else {
                    System.out.println("Patient is normal!");
                }
                ptnTestCase.printhistory(vitalsigns);
            }
            if("School".equals(option2)){
                ts.SchoolTestCase(vitalsigns);
                ptnTestCase.getAgeGroup(vitalsigns);
                boolean statusTestCase = ptnTestCase.isPatientnormal(vitalsigns);
                vitalsigns.status = statusTestCase;
                if (statusTestCase == false){
                    System.out.println("Patient is abnormal!");
                }
                else {
                    System.out.println("Patient is normal!");
                }
                ptnTestCase.printhistory(vitalsigns);
            }
            if("Adolescent".equals(option2)){
                ts.AdolescentTestCase(vitalsigns);
                ptnTestCase.getAgeGroup(vitalsigns);
                boolean statusTestCase = ptnTestCase.isPatientnormal(vitalsigns);
                vitalsigns.status = statusTestCase;
                if (statusTestCase == false){
                    System.out.println("Patient is abnormal!");
                }
                else {
                    System.out.println("Patient is normal!");
                }
                ptnTestCase.printhistory(vitalsigns);
            }
            
            
            
        }
        
        
    }
    
}
