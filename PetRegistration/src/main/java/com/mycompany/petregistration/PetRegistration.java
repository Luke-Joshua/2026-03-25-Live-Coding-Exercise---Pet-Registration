package com.mycompany.petregistration;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Luke Joshua (ST10511274)
 */
public class PetRegistration {
    private static List<Pet> allPets = new ArrayList<Pet>();

    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.println("Welcome to our Pet Registration System");
        
        Pet pet1 = new Pet("Jack", "Jackrussel", 5);
        allPets.add(pet1);
        
        Pet pet2 = new Pet("Whickers", "Tabby Cat", 7);
        allPets.add(pet2);
        
        pet1.displayPetInfo();
        pet2.displayPetInfo();
        
        
    }
}
