
package Day7.Discussion;

import java.util.Scanner;

public class UserInput {
   public static void main(String[] args) {
    // Instatiation / create object of Scanner 
    
       Scanner input = new Scanner(System.in);
       
       System.out.println("Enter Name: ");
       String name = input.nextLine(); //String Input
       
        System.out.println("Enter Age: ");
        int age = input.nextInt(); // int input
        
        System.out.println("Enter Salary: ");
        double salary = input.nextDouble(); // double input
        
        // output input by user
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        
        
        
   }
}
