
package Day8.Discussion;

import java.util.Scanner;

public class LoginProgram {
    public static void main (String[] args) {
       // User Login Program // Predefined username and password (hardcore for demo purpose)
        String username = "winter";
        String password = "admin123";
       
        // Create scanner object to accept input from user 
        Scanner input = new Scanner(System.in);
        // Ask the user for username
        
       System.out.println("====Login====");
       System.out.print("Enter username: "); //Ask for username
       String loginUsername = input.nextLine(); // Read user input and stores it to login 
       System.out.print("Enter Password: "); // Ask for password
       String loginPassword = input.nextLine(); // Read user inpur and stores it to login
       
       // Check if both username and password match predefined values
       if (loginUsername.equals(username) && loginPassword.equals(password)) {
           System.out.println("\nLogin successful!" + "Welcome," + username);
           
       } else {
         System.out.println("\nLogin Failed. Invalid username and password.");
       }
       
       // close the scanner 
       
       input.close();
        
       
       
        
        
        
        
        
        
        
        
        
    }
    
    
}
