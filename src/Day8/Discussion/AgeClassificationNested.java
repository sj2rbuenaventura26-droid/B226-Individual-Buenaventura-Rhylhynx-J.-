
package Day8.Discussion;

import java.util.Scanner;

public class AgeClassificationNested {
    public static void main (String[] args) {
        /*
        Age: 0 - 12 > child 
           Age: 0 - 15 > Specifically, Toddler
           Age: 6 - 12 > Specifically, Pre teen
        Age: 13 - 19 > teenager
           Age: 13- 15 > Early Teen
           Age: 16 - 19 > Late teen
        Age: 20 - 59 > Adult
           Age: 20 - 35 > Young Adult
           Age: 36 - 59 > Middle Age
        Age 60 - 120 > Senior Citizen
           Age: 60 - 75 > Young Senior 
           Age: 76 - 120 > Elderly
        Invalid Age > Invalid Input 
        */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Age: ");
        int age = input.nextInt ();
        
      if (age >= 0 && age <=120) {
    
        if (age <=12) { // 0 - 12
            System.out.println("You are a child");
            if (age <= 5) { // toddler
                System.out.println("Specifically, you are toddler.");
            } else { 
                System.out.println("Specifically, you are Pre-teen.");
            }
        } else if (age <= 19) { // 13 - 19
            System.out.println("You are a teenager");
            if (age <= 15) { // Early Teen
                System.out.println("Specifically, you are early teen");
            } else { 
                System.out.println("Specifically, you are late teen.");
            }
        } else if (age <= 59){ // 20 - 59 
            System.out.println("You are a Adult");
             if (age <= 35) { // Younng Adult 
                System.out.println("Specifically, you are young Adult");
            } else { 
                System.out.println("Specifically, you are middle age.");
            }
        } else if (age <= 120) { // 60 - 120
            System.out.println("You are a Senior Citizen");
             if (age <= 75) { // Young senior
                System.out.println("Specifically, you are young senior");
            } else { 
                System.out.println("Specifically, you are elderly");
            }
        } else {
            System.out.println("Invalid age entered");
        }   
    }else {
          System.out.println("Invalid Age Entered");
      }
            
        // code minimization
        
         input.close();
    }
            
}
    