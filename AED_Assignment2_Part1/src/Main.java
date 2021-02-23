
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
        String option = sc.nextLine(); //Get input from user regarding User Input to Test Cases
        
        if (("User Input".equals(option)) || ("user input".equals(option))){ //If User Input, get input of Vital Signs variables from console

            Patient ptn = new Patient();
            VitalSigns vitalsigns1 = new VitalSigns();
            ptn.getDetails(vitalsigns1);
            ptn.getAgeGroup(vitalsigns1);
            boolean statusvs1 = ptn.isPatientnormal(vitalsigns1); //Returns the output of the isPatientnormal method and stores it
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

        else if (("Test Cases".equals(option)) || ("test cases".equals(option)) || ("test case".equals(option)) || ("Test Case".equals(option))){ //If Test Cases, select one of the 6 cases and run to get True everytime
            int x = 0;
            while(x == 0){
                TestCases ts = new TestCases();
                VitalSigns vitalsigns = new VitalSigns();
                Patient ptnTestCase = new Patient();
                Scanner sc2 = new Scanner(System.in);
                System.out.println("Select the Test Case:\nNewborn\nInfant\nToddler\nPreschooler\nSchool\nAdolescent"); //Take Input from user to determine which of 6 Test Cases to run
                String option2 = sc2.nextLine();
                if(("Newborn".equals(option2)) || ("newborn".equals(option2))){
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
                else if(("Infant".equals(option2)) || ("infant".equals(option2))){
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
                else if(("Toddler".equals(option2)) || ("toddler".equals(option2))){
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
                else if(("Preschooler".equals(option2)) || ("preschooler".equals(option2))){
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
                else if(("School".equals(option2)) || ("school".equals(option2))){
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
                else if(("Adolescent".equals(option2)) || ("adolescent".equals(option2))){
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
                else {
                    System.out.println("Invalid Input ");
                }
                System.out.println("\nRun another Test Case? Enter 'Yes' or 'No'");
                String option3 = sc.nextLine();
                if (("Yes".equals(option3)) || ("yes".equals(option3))){
                    x = 0;
                }
                else if (("No".equals(option3)) || ("no".equals(option3))){
                    x = 1;
                }
                else {
                    System.out.println("Invalid Input");
                }
            }
        }
        else {
            System.out.println("Invalid Input - CASE SENSITIVE");
        }     
    }
    
}
