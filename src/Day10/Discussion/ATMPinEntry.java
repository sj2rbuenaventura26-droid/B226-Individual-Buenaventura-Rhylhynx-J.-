
package Day10.Discussion;

import java.util.Scanner;

public class ATMPinEntry {
    public static void main(String[] args) {
        // syntax of while loop
        
        // Print your name 10 times using while loop
        
        // Program for ATM PIN Entry -> max attempt 3 
       
        Scanner input = new Scanner(System.in);
        
       int maxAttempt = 5;
      
       int pin = 123456; // registered pin /PIN set in the system
       int enteredPin;
      boolean accessGranted = false; // flag track if the PIN is correct
       
       System.out.println("Welcome to BDO");
       // System.out.print("Enter you pin: "); // Ask your 
       //validation check: compared entered PIN with the correct PIN
       // Keep asking until the user enters the correct PIN 
       for (int attempt = 1; attempt <= 5; attempt++) {
           System.out.print("Enter you pin: ");
           enteredPin = input.nextInt();
           
            
           if (pin != enteredPin) {
               System.out.print("\nIncorrect PIN! Try Again"); // Attempt --;
              // System.out.println("Attempts Remaining: " + remaining);
           } else {
                System.out.println("\nAccess Granted!" );
                accessGranted = true;
                break; // Exit the loop immediately
       }
       }
        // After loop, check if access was granted 
       if (!accessGranted) {
           System.out.println("Too many failed attempts, your account is locked. ");
       }
       
    }
}

        
        /* int pin = 123456; // registered pin / PIN set in the system
        int enteredPin;
        
        System.out.print("Enter your PIN"); // Ask the user to input a PIN
        enteredPin = input.nextInt(); // Read the PIN entered by the user
        
        // Validation Check: compared entered PIN with the correct PIN
        // Keep asking until the user enters the correct PIN
        while (pin != enteredPin) {
            System.out.println("Incorrect PIN! Try again"); // Feedback if wrong
            System.out.print("Enter your PIN: "); // Prompt again
            enteredPin = input.nextInt(); // Read new input
        } 
        
        // If the loop ends, it means the PIN is correct
        System.out.println("Access Granted!"); 
        
        input.close(); // Close the Scanner to free resources
    }
}

/*
    int counter = 1;
        while (true){
            System.out.println(counter + ": Hello");
            counter++;
        }


         int i = 0;
        
        while (i < 10) {
            System.out.println("Winter");
            i++;








/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

                    
         