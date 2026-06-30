
package Day11.Activity;

import java.util.Scanner;

public class Activity7_Buenaventura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] num = new int[5];
        int sum = 0;
        double average;
        
        System.out.println("Enter 5 numbers: ");
        for (int i = 0; i < num.length; i++){
            System.out.println("Number" + (i + 1) + ": ");
            num[i] = scanner.nextInt();
            sum += num[i];
        }
        
        System.out.println("\nYou Entered: ");
      
        for (int i = 0; i < num.length; i++ ) {
            System.out.println("index " + i + ": " + num[i]);
        }
        
        average = (double) sum / num.length;
        
        System.out.println("\nSum: " + sum);
        System.out.println("\nProduct: " + average);
                
    
    
    
    
    }
    
}
