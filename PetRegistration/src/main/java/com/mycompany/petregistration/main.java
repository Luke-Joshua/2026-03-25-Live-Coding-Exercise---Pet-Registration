package com.mycompany.petregistration;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Luke Joshua (ST10511274)
 */

/* REFERENCE LIST

sadia (2010). How to clear the console using Java? [online] Stack Overflow. Available at: https://stackoverflow.com/a/32295974. [Accessed 25 Mar. 2026].

Waran, B. (2016). How to clear the console using Java? [online] Stack Overflow. Available at: https://stackoverflow.com/a/40041221 [Accessed 25 Mar. 2026].

BalusC. (2011). How to delete stuff printed to console by System.out.println()? [online] Available at: https://stackoverflow.com/a/7522190. [Accessed 25 Mar. 2026].

‌
‌
*/

public class main {
    private static List<Pet> allPets = new ArrayList<Pet>();
    private static List<Client> allClients = new ArrayList<Client>();
    private static List<Species> allSpecies = new ArrayList<Species>();
    private static List<Appointment> allAppointments = new ArrayList<Appointment>();
    
    //CRUD stands for Create, Read, Edit and Delete, it referes to a common type of form on websites where the user gets a list of records where they can create, read, edit and delete specific records. 
    //
    
    public static void handlePetsMenu(Scanner scanIn){
        
        clearScreen(); //This cannot be inside the loop because the user must be able to see any previous error messages or work. 
        
                
            while(true){
                System.out.println("");
                System.out.println("Pets MENU - To open, edit, or delete a record just enter the record number");
            
                int i = 0; //So this would normally be inside the loop declaration but I want it to use after the scope of the loop (outside the loop
                for (i = 0; i < allPets.size(); i++) {
                    System.out.println(i + "> " + allPets.get(i).toString());
                }
                
                System.out.println("");
                System.out.println("create>> Type 'create' to delete a new Pet");
                System.out.println("back>> Type 'back' or 'cancel' to return to previous menu.\");");

                String response = scanIn.next();

                try{
                    i =  Integer.parseInt(response); //Capture the record id, if this doesn't give an error then a valid number was passed. 
                   clearScreen();
                    
                    if(i >= 0 && i < allPets.size()){ // Check the number given matches a valid record
                        allPets.get(i).displayInfo();//Opening / reading this pet record

                        while(true){
                            System.out.println("");
                            System.out.println("edit>> Type 'edit' to edit this record");
                            System.out.println("delete>> Type 'delete' to delete this record");
                            System.out.println("back>> Type 'back' or 'exit' to return to previous menu.\");");
                            
                            String secondResponse = scanIn.next().trim().toLowerCase(); //this gets the user input, cuts off any extra spaces and then makes it all lower case and then assigns it to the secondResponse string :)
                            
                            if(secondResponse.equals("edit")){
                                allPets.get(i).editPet(scanIn);
                                break;//task complete, return to pets menu
                            }
                            else if(secondResponse.equals("delete")){
                                allPets.remove(i);
                                break;//task complete, return to pets menu
                            }
                            else if(secondResponse.equals("back") || secondResponse.equals("exit") ){
                                break;//User is satisfied, back to the pets menu
                            }
                            else{
                                System.out.println("Unrecognised command, please try again."); //repeat the loop, give the user the options again. 
                            }
                        }
                    }
                    else{
                        System.out.println("You entered an invalid record number, please try again. ");
                    }
                } catch (NumberFormatException ex) { //This means the string captured was not a number, therefore it's either a command or non-sense. 
                    response = response.trim().toLowerCase(); // This trims off any unwanted spaced and then turns all the text to lower case. 
                    
                    if(response.equals("create")){
                        allPets.add(new Pet(scanIn));
                        //And the loop runs back so the user can see the list
                    }
                    else if(response.equals("back") || response.equals("exit") || response.equals("close")){
                        break;
                        //And the loop closes, returning to main menu
                    }
                    else{
                        System.out.println("The command '" + response + "' is not recognised, please try again.");
                        //And the loop repeats. 
                    }
                }
        }
        
    }

    public static void main(String[] args) {
        Scanner scanIn =  new Scanner(System.in);
        //This is where I will initalise a database
                
        System.out.println("Welcome to our Pet Registration System");
        
        while(true){
            clearScreen();
            System.out.println("");
            System.out.println("1. Pets Menu");
            System.out.println("2. Species Menu");
            System.out.println("3. Clients Menu");
            System.out.println("4. Appointments Menu");
            System.out.println("0. Close Application");
            System.out.println("-1. Do the example I was told to code (templates)");
            
            String menuSelect = scanIn.next();
            
            try{
                int menuId =  Integer.parseInt(menuSelect); //Capture the menu id, if this doesn't give an error then a valid number was passed. 
                
                if(menuId == 1){
                    handlePetsMenu(scanIn);
                } else if (menuId == 2) {
                    System.out.println("This feature hasn't been completed yet, please try another. ");
                } else if (menuId == 3) {
                    System.out.println("This feature hasn't been completed yet, please try another. ");
                } else if (menuId == 4) {
                    System.out.println("This feature hasn't been completed yet, please try another. ");
                } else if (menuId == 0) {
                    System.out.println("Thank you, have a wonderful day! ");
                    break; // This closes the main loop and then ends the application
                } else if (menuId  == -1){
                    Pet pet1 = new Pet("Jack", "Jane  Snow", "Jack Russell", 5);
                    allPets.add(pet1);        
                    Pet pet2 = new Pet("Whickers", "John Flow", "Tabby Cat", 7);
                    allPets.add(pet2);

                    pet1.displayInfo();
                    pet2.displayInfo();
                }                
                else {
                    System.out.println("Unrecognised menu selection '" + menuId + "', please try again.");
                }
            }catch (NumberFormatException ex) { //This means the user types a word or letter because the input could not be converted to a number
                menuSelect = menuSelect.trim().toLowerCase(); // This trims off any unwanted spaced and then turns all the text to lower case. 
                
                if(menuSelect.equals("pet") || menuSelect.equals("pets")){
                    handlePetsMenu(scanIn);
                }
                else if(menuSelect.equals("close") || menuSelect.equals("exit") || menuSelect.equals("back")){
                    System.out.println("Thank you, have a wonderful day! ");
                    break; // This closes the main loop and then ends the application
                }
                else{
                    System.out.println("Unrecognised menu selection '" + menuSelect + "', please try again.");
                }
                
            }
            
            clearScreen(); 
            //Save the database with any changes.
            
        }
        
        scanIn.close();
    }
    
   
    
    // Source - https://stackoverflow.com/a/32295974
    // Posted by satish, modified by community. See post 'Timeline' for change history
    // Retrieved 2026-03-25, License - CC BY-SA 4.0
    public static void clearScreen() {  //Doesn't work in netbeans terminal
        //This loop shouldn't be needed but it's for when none of the below work
        for (int i = 0; i < 18; i++) {
            System.out.println("\b");
        }
        
        System.out.print("\033[H\033[2J");
        // Source - https://stackoverflow.com/a/40041221
        // Posted by Bhuvanesh Waran, modified by community. See post 'Timeline' for change history
        // Retrieved 2026-03-25, License - CC BY-SA 3.0
        System.out.print("\033\143"); //This is an overkill for some systems (Mac / Linux / Windows)
                
        System.out.flush();
        System.out.println("");
    }  

}
