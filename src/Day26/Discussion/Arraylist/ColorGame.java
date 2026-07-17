
package Day26.Discussion.Arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ColorGame {
    
    public static void main(String[] args) {
        List<String> dice = new ArrayList<>(); 
        dice.add("Blue");
        dice.add("Red");
        dice.add("Pink");
        dice.add("Green");
        dice.add("Yellow");
        dice.add("White");
        
        for (int i = 0; i < 3; i++) {
            Collections.shuffle(dice);
            System.out.println("Dice: " + (i + 1) + ": " + dice.get(0));
        }
        
        
    
        
        /*
        Collections.shuffle(dice);
        System.out.println("Dice 1: " + dice.get(0));
        
         Collections.shuffle(dice);
        System.out.println("Dice 2: " + dice.get(0));
        
         Collections.shuffle(dice);
        System.out.println("Dice 3: " + dice.get(0));
      */  
      // Traverse an ArrayList using for Loop
      
    //  for (int i = 0; i < dice.size(); i++) {
      //    System.out.println(dice.get(i));
      //}
      
     
      // Traverse an ArrayList using For Each Loop 
     // for (String color : dice) {
       //   System.out.println(color);
     // }

      // Lamba Experience  
      //dice.forEach((color) -> System.out.println(color));
      
    //  dice.forEach(System.out:: println);
      

     //   int lastIndexPosition = dice.lastIndexOf("White");
     // System.out.println(lastIndexPosition);  
        
//  int indexPosition = dice.indexOf("White");
      //System.out.println(indexPosition);
        
    //    ArrayList<String> dice2 = new ArrayList<>();
      //  dice.add("Black");
        //dice2.addAll(dice);
     //   System.out.println(dice2);  
        
     //    ArrayList<String> dice3 = new ArrayList<>(dice);
      //   System.out.println(dice3);
      
      
        
      // System.out.println(  dice.contains("Black"));
        
        //HashSet
        
 //     Collections.sort(dice);
   //    System.out.println(dice);
     
 //LIFO  
    //   Collections.reverse(dice);
      // System.out.println(dice);
       
      // Collections.shuffle(colors);
     //  System.out.println(colors);
    }
}
