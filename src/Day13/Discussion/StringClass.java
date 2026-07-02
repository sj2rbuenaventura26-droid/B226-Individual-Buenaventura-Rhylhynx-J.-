
package Day13.Discussion;

    import java.util.Scanner;

public class StringClass {
    public static void main(String[] args ) { 
    Scanner scanner = new Scanner(System.in);
    // Display the exit confirmation menu  
    System.out.println("Are you sure you want to exit? \n\t[Y] Yes \n\t[N] No");
    // Prompt the user for their choice   
    System.out.println("Enter your choice: ");
      String choice  = scanner.nextLine();
      // Check the user's choice (ignoring case sensitivity)
      if (choice.equalsIgnoreCase("Y")) {
          System.out.println("Exiting..."); // if user enters Y or y 
      } else if (choice.equalsIgnoreCase("n")){
          System.out.println("Go back to Main Menu");
      } else {
          System.out.println("Invalid Input!"); 
      }
      
      scanner.close(); // Close the scanner
       
    }    
}
/*
 charAt()
int num = 10; // fixed values 
       
       String word = "Hello";
       System.out.println(word.charAt(0));
       System.out.println(word.charAt(2));
       
       System.out.print("Enter gender: ");
       String gender = "Male"; // The String Value 
       char genderPrefix = gender.charAt(0); // Gets the first character
       System.out.println(genderPrefix);
*/

/*
   String word  =  " Hello Java "; 
       System.out.println(word.length());
       
       for (int i = 0; i < word.length(); i++) {
           System.out.println(word.charAt(i));
       }
*/

/*
 String country = "Philippines";
      System.out.println(country.toLowerCase());
      System.out.println(country.toUpperCase());
*/

/* concat() + 
      String firstName = "Winter";
      String lastName = "Mapagmahal";
      
        System.out.println(firstName.concat(lastName));
        System.out.println(firstName + lastName);
*/

/*
// equals()
      String userName = "Winter";
      String loginUsername = "Mapagmahal";
      
     
      System.out.println(userName.equals(loginUsername));
*/