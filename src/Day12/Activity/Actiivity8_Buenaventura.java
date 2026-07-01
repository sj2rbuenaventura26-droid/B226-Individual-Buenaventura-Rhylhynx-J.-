
package Day12.Activity;

import java.util.Scanner;

public class Actiivity8_Buenaventura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("=======Average Calculator======");
        System.out.println("===============================");
        
        System.out.println("Enter number of Students: ");
        int students = scanner.nextInt();
        scanner.nextLine();
        
      System.out.println("Enter number of Subjects: ");
      int subjects = scanner.nextInt();
      scanner.nextLine();
      
       String[] subjectNames = new String[subjects];
       System.out.println("\nEnter Subjects Name: ");
         for (int i = 0; i < subjects; i++ ){
         System.out.print("subjects" + ( i + 1 ) + ": ");
           subjectNames[i] = scanner.nextLine();
        }
   
       String[] studentNames = new String[students];
       System.out.println("\n Number of Students: ");
       for (int i = 0; i < students; i++) {
           System.out.println("students" + (i + 1) + ": ");
           studentNames[i] = scanner.nextLine();
       }
      
       String[][] studentNames = new String[students];
       double[][] grades = new double [students][subjects];   
               
        
            
            
        
    }
    
}
