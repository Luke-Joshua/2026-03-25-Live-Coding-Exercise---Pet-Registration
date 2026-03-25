package com.mycompany.petregistration;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

/**
 * @author Luke Joshua (ST10511274)
 * */
public class Pet {
    
    private String name = "";
    public String owner = "";
    private String species = "";
    private LocalDate dateOfBirth = LocalDate.now(); 
    
    public Pet(Scanner scanIn){
        System.out.println("Please capture your new pet's details :)");
        
        System.out.print("Name: ");
        name = scanIn.next();
        
        System.out.print("Species: ");
        species = scanIn.next();
        
        System.out.print("Age in years: ");
        dateOfBirth = LocalDate.now().minusYears(scanIn.nextInt());
        
        System.out.println("New species created!\r\n\r\n");
    }
    
    public Pet(String Name, String Owner, String Species, int Age){
        name = Name;
        owner = Owner;
        species = Species;
        dateOfBirth = LocalDate.now().minusYears(Age);
    }
    
    public Pet(String petName, String petSpecies, int petAge){
        name = petName;
        owner = "Unkown owner";
        species = petSpecies;
        dateOfBirth = LocalDate.now().minusYears(petAge);
    }
    
    public void displayPetInfo(){
        System.out.println("See below Pet's Information");
        System.out.println("Pet name: " + name);
        System.out.println("Pet owner: " + owner);
        System.out.println("Pet Species: " + species);
        System.out.println("Pet age: " + ChronoUnit.YEARS.between(dateOfBirth, LocalDate.now()));
    }
}




