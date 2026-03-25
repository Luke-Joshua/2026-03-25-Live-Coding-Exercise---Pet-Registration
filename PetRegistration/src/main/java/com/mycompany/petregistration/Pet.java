package com.mycompany.petregistration;

import java.util.Scanner;

/**
 * @author Luke Joshua (ST10511274)
 * */
public class Pet {
    
    private String name = "";
    public String owner = "";
    private String species = "";
    private int age = 0;
    
    public Pet(Scanner scanIn){
        System.out.println("Please capture your new pet's details :)");
        
        System.out.print("Name: ");
        name = scanIn.next();
        
        System.out.print("Species: ");
        species = scanIn.next();
        
        System.out.print("Owner: ");
        owner = scanIn.next();
        
        System.out.print("Age in years: ");
        age = scanIn.nextInt();
    }
    
    public void editPet(Scanner scanIn){
        
        System.out.println("Updating Pet Info'");
        
        System.out.print("Name - currently is '" + name + "', what should it be: ");
        name = scanIn.next();
        
        System.out.print("Owner - currently is '" + owner + "', what should it be: ");
        owner = scanIn.next();
        
        System.out.println("Species - currently is '" + species + "', what should it be: ");
        species = scanIn.next();
        
        System.out.println("Age - currently is '" +age + ", what should it be: ");
        age = scanIn.nextInt();
    }
    
    public Pet(String Name, String Owner, String Species, int Age){
        name = Name;
        owner = Owner;
        species = Species;
        age = Age;
    }
    
    
    public void displayInfo(){
        System.out.println("See below Pet's Information");
        System.out.println("Pet name: " + name);
        System.out.println("Pet owner: " + owner);
        System.out.println("Pet Species: " + species);
        System.out.println("Pet age: " + age);
    }
    
    public String toString(){
        return name + " - " + species + " - Owner: " + owner + " - Age: " + age + ")";
    }
}




