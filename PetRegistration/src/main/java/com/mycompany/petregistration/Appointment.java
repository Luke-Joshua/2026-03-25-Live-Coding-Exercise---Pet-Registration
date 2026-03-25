package com.mycompany.petregistration;

import java.time.LocalDate;

/**
 * @author Luke Joshua (ST10511274)
 */

public class Appointment {
    public String typeOfAppointment = "";
    public LocalDate dateOfAppointment = LocalDate.now();
    private Pet pet; 
    
    public Appointment(String type, LocalDate date, Pet petDetails){
        typeOfAppointment = type;
        date = dateOfAppointment;
        pet = petDetails;
    }
    
    public String toString(){
        return dateOfAppointment.toString() +  typeOfAppointment + " - " + pet.owner ;
    }
}
