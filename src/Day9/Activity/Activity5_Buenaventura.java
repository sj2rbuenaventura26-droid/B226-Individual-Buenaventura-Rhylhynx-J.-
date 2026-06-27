
package Day9.Activity;

import java.util.Scanner;

public class Activity5_Buenaventura {
    public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
          
          // 5.1 Summation of 1 to N
         // System.out.print("Enter N: ");
         // int n = input.nextInt();
          
         // int sum = 0;
          //for (int i = 1; i <= n; i++){
            //  sum += i;
             // System.out.println("i = " + i + ", sum = " + sum);
              
         // }
          //System.out.println("Final Sum: " + sum);
          
      // 5.2 Product of 1 to N
      System.out.print("Enter N: ");
       int n = input.nextInt();
       
       int product = 1;
       for (int i = 1; i <= n; i++){
           product *= i; 
           System.out.println("i = " + i + ", product = " + product);
       }
       System.out.println("Final Product: " + product);
          
          
          
          
          
    }
    
}
