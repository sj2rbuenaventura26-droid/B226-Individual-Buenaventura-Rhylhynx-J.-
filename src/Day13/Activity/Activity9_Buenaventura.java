
package Day13.Activity;

import java.util.Scanner;

public class Activity9_Buenaventura {
    public static void main(String[] args) {
        // Research Phase   
       //                   contains() 
       // checks if the a string contains a specific word or character
        // Syntax - string.contains("text");
      /*
        String sentence = "Hello Java";
        
        System.out.println(sentence.contains("Java"));
      System.out.println(sentence.contains("Hotdog"));
        */
      
      //              endsWith() 
      // Checks if the string ends with a specific text
      
     /*
       String word = "Programming";
      
      System.out.println(word.endsWith("ing"));
      System.out.println(word.endsWith("Rsd"));
      System.out.println(word.endsWith("Prog"));
      */
      
     //          startsWith()
     // Checks if the string starts with a specific text
     
     /*
     String word = "Hatdog";
     
     System.out.println(word.startsWith("Hat"));
     System.out.println(word.startsWith("dog"));
     
     */
      
     
     //              indexOf()
     // Finds the position (index) of a character or word 
     
     
  //   String word = "Rhylhynx";
     
   //  System.out.println(word.indexOf("y"));
     //System.out.println(word.indexOf("x"));
     
     
     
     //              isEmpty()
     // Checks if a string is empty
     
    /*
      String word = "";
     String word2 = "Java";
     
     System.out.println(word.isEmpty());
     System.out.println(word2.isEmpty());
     */
    
    
    //                trim()
    // Removes spaces at the beginning and end of a string
    
  /*
      String word = "   Hello     Men    ";
    
    System.out.println(word.trim());
    */
  
  
  //                replace()
  // Replaces characters or words
  
  /*
   String word = "I love kalabasa";
  
  
  System.out.println(word.replace("kalabasa", "sampaguita" ));
  */
  
  
  //             toCharArray()
  // Converts a string into an array of characters
  
/*
    String word = "MEGANUN?!";
  
  char[] letters = word.toCharArray();
  
  for (int i = 0; i < letters.length; i++) {
      System.out.println(letters[i]);
  }
  
 */



//           next.Line().charAt()
     // next.Line() - reads an entire line from the user 
     // charAt - gets one character from that line   

     /*
     Scanner scanner = new Scanner(System.in);

      System.out.print("Enter a letter: ");
      char letter = scanner.nextLine().charAt(3);

       System.out.println(letter);
*/
    
     
     
     
     //             valueOf
     // Converts another data type into string 
     
     /*
     int age = 20;
     
     String text = String.valueOf(age);
     
     System.out.println(text);
     */ 
      
     
     //              Stretch Goal
     
   /*  
     String country = "Philippines";
     
     System.out.println("First Character: " + country.charAt(0));
     System.out.println("Last Character: " + country.charAt(10));
     
     int countp = 0;
     int vowelCount = 0;
     
     
     for (int i = 0; i < country.length(); i++) {    
         char ch = Character.toLowerCase(country.charAt(i));
         
         if (ch == 'p') {
         System.out.println("P: " + ch);
         countp++;
         }
         
         if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
             vowelCount++;
         }
          
         }
     
    
     
      System.out.println("Number of P/p:  " + countp);
      System.out.println("Total number of vowels: " + vowelCount);
     
     */
    
    }
}
