    
package Day21.Activity;

import java.util.Scanner;

public class Main {
       public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);
           
           System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
           System.out.println("*      User Account Registration    *");
           System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
           System.out.println();
           
           System.out.println("Enter First Name: ");
           String firstName = scanner.nextLine();
           
           System.out.println("Enter Middle Name: ");
           String middleName = scanner.nextLine();
           
           System.out.println("Enter Last Name: ");
           String lastName = scanner.nextLine();
           
           System.out.println("Enter Address: ");
           String address = scanner.nextLine();
           
           System.out.println("Enter Email: ");
           String email = scanner.nextLine();
           
           System.out.println("Enter Password: ");
           String password = scanner.nextLine();
           
           UserAccount user = new UserAccount(
           firstName, middleName, lastName, address, email, password
           );
           
           System.out.println();
           System.out.println("---------User Account ---------");
           System.out.println("Full Name: " + user.getFirstName() + " " + user.getMiddleName() + " " + user.getLastName());
           
           System.out.println("Address: " + user.getAddress());
           System.out.println("Email: " + user.getEmail());
           
       }
}
