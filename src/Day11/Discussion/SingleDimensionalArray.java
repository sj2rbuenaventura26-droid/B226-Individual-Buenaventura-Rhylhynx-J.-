
package Day11.Discussion;
import java.util.Scanner;
public class SingleDimensionalArray {
    public static void main(String[] args) {
        // syntax for single dimensional array
        // collection of ages: 24 43 35 18 28 25 
        //            0   1   2    3   4   5    
        //int[] ages = {24, 43, 35, 18, 28, 25};  
      // System.out.println(ages[2]);
        // Traverse an ages array using for loop and for each loop 
        // for each loop
        //for (int age : ages) {
          //  System.out.println(age);
        //}
        // for loop 
        //for (int i = 0; i < ages.length; i++) {
          //  System.out.println(ages[i]);
       // }
        
        
        
       // String[] names = {"Michael", "Les", "Kent", "Ray", "Jeff" };
        // System.out.println(names.length);
         
         // maximum index   
         
         // Traversing an array using for loop 
      //   for (int i = 0; i < names.length; i++) {
        //     System.out.println(names[i]);
         //}
         
         // Tranversing an array using for-each loop/ enchance for loop 
         //for (String name : names) {
           //  System.out.println(name);
         //}
         
            // Array Declaration with specified size only 
            
            Scanner scanner = new Scanner(System.in);
            String[] anime = new String[5];
            
            for (int i = 0; i < 5; i++) {
                System.out.println("Enter anime tittle: ");
                anime[i] = scanner.nextLine();
            }
            
            System.out.println("\nAnime you entered: ");
            for (String tittle: anime) {
                System.out.println(tittle);
            }
         
            
        
    }
}
