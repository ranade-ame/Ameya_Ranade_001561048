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
public class PersonDirectory {
    
    public static ArrayList<Person> personDirectory;
    
     public static ArrayList<Person> newPersonDirectory(){
        personDirectory = new ArrayList<Person>();
        return personDirectory;
    }
     
    public static void printPerDir(){
        int y = 0;
        for(Person per : personDirectory){
            y++;
            System.out.println(y + ".Name:\t" + per.getName() + "\nAddress:\t" + per.getAddress() + "\nParent/Legal Guardian\t" + per.getParentname());
        }
    }
    
    
     
    
}
