
package Day16.Activity;

//import java.util.Random;

import java.util.Scanner; 

public class Activity12_Buenaventura {
    
    // A method to identify if a number is odd or even 
    /* 
    A method to identify if a number is odd or even 
    public static void oddOrEven (int number) {
        if (number % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
    */
    
    // A method to print your name 50 times 
    /*
    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {
            System.out.println("Rhylhynx");
        }
    }
    */
    
    // A method to get the square root of certain variable 
    /*
    public static void main(String[] args) {
        System.out.println(Math.sqrt(100));
    }
    */
    
    // A method to get the power of a number using base and exponent
    /*
     public static void main(String[] args) {
          System.out.println(Math.pow(2, 3));
     }
*/
    
    // A method to print a random number between 1 to 100
    /*
    public static int randomNumber() {
        Random random = new Random();
        return random.nextInt(100) + 1;
        
    }
     public static void main(String[] args) {
         System.out.println("Random Number:" + randomNumber());
     }
    */

    
    // A method to get the area of a circle using a radius
    /*
    public static void main(String[] args) {
        System.out.println(Math.sin(Math.PI / 2));
        
    }
*/
    
    // A method to identify if a person is a voter or not.
  /*
    public static void voter(int age) {
 
        if (age >= 18) {
            System.out.println("Required to vote" + age);
        } else {
            System.out.println("Not Required to vote" + age);
    }
    }
    
    public static void main(String[] args) {
         int age = 20;
    }
    */
    
    // A method to get the lenght of a certain word 
    /*
    public static void main(String[] args) {
        String word = "Hello darsi";
        System.out.println(word.length());
    }
*/
    
    // A method to print a certain word in reverse order
    
    /*
    public static void printReversedWord(String word) {
        for (int i = 0; i < word.length(); i--){
            System.out.print(word.charAt(i));
        }
    }
     
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a word to reverse: ");
        String wordToReverse = scanner.nextLine();
        
        printReversedWord(wordToReverse);
        System.out.println();
    }
*/
    
    // A method to print your full name and age
 /*
    public static void printFullNameAndAge (String fullName, int userAge) {
        System.out.println("Full Name: " + fullName);
        System.out.println("Age: " + userAge);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter your name: ");
        String fullName = scanner.nextLine();
      
        System.out.println("Enter your age: ");
        int userAge = scanner.nextInt();
        
        printFullNameAndAge (fullName, userAge);
    }
    
*/
}
