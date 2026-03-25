package com.mycompany.petregistration;

import java.util.Scanner;

/**
 * @author Luke Joshua (ST10511274)
 */

public class Client {
    public String name = "";
    private String phoneNumber = "";
    private String email = "";
    
    public Client(Scanner scanIn){
        System.out.println("Please enter the details to create your new client file");
        
        System.out.print("Client Name: ");
        name = scanIn.next();
        
        System.out.print("Client Phone Number: ");
        phoneNumber = scanIn.next();
        
        System.out.print("Client Email Address: ");
        email = scanIn.next();
    }
    
    public Client(String clientName){
        name = clientName;
    }
    
    public Client(String clientName, String clientPhone, String clientEmail){
        name = clientName;
        phoneNumber = clientPhone;
        email = clientEmail;
    }
    
    public void displayInfo(){
        System.out.println("Client Name: " + name);
        System.out.println("Client Phone Number: " + phoneNumber);
        System.out.println("Client Email: " + email);
    }
    
    public String toString(){
        return name + " - " + phoneNumber + " - " + email;
    }
}
