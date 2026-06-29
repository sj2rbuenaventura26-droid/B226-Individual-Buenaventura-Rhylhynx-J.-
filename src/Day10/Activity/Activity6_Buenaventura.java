
package Day10.Activity;

import java.util.Scanner;

public class Activity6_Buenaventura {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
    
     System.out.println("Enter a number: ");
     int number = input.nextInt();
     
     System.out.println("\nMultiplication Table of: " + number);
     
     for (int i = 1; i <= 10; i++) {
         System.out.println(number + " * " + i + " = " + (number * i));
         
     }
    
    input.close();
    }
    
}
