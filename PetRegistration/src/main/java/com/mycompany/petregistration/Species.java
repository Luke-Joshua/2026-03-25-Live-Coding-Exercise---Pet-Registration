package com.mycompany.petregistration;

import java.util.Scanner;

/**
 * @author Luke Joshua (ST10511274)
==> company  [in template "Templates/Classes/Class.java" at line 24, column 15]*/

public class Species {
    private String name = "";
    public String history = "";
    public String characteristics = "";
    
    public Species(String speciesName, String speciesHistory, String speciesCharacteristics){
        name = speciesName;
        history = speciesHistory;
        characteristics = speciesCharacteristics;
    }
    
    public Species(String speciesName){
        name = speciesName;
        history = "";
        characteristics = "";
    }
    
    public Species(Scanner  scanIn){
        System.out.println("Please capture your pet species details: ");
        
        System.out.print("Species Name: ");
        name = scanIn.next();
        
        System.out.print("Species History: ");
        history =  scanIn.next();
        
        System.out.print("Species Characteristics: ");
        characteristics = scanIn.next();
    }
    
    public void displayInfo(){
        System.out.println("Species Name: " + name);
        System.out.println("Species History: " + history);
        System.out.println("Species Characteristics: " + characteristics);
    }
    
    public String toString(){
        return name + " - History: " + history + " - Characteristics: " + characteristics;
    }
}
