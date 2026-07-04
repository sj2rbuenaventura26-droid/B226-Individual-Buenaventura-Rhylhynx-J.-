
package Day15.Discussion;

public class RandomNumber {
    public static void main(String[] args) {
        
        // BINGO Simulator 
        
        // 1 - 75
        
      int roll = (int)(Math.random()*75) + 1;
      
        String letter;
        
        // roll 
        if (roll <= 15) { // 1 - 15
            letter = "B";
        } else if (roll <= 30) { // 16 - 30
            letter = "I";
        } else if (roll <= 45){ // 31 - 45
             letter = "N";   
        } else if (roll <= 60) { // 46 - 60
              letter = "G";  
        } else { // 61 - 75
              letter = "O";  
        }
     
        
            System.out.println("Sa letra ng " + letter + ": " + roll);
        
    
     
    }
}



// Casting -> 
// downcasting / upcasting
  /*   int x = 10;
     
     double num = x; // upcasting 
     
     float y = 10.5f;
     
     int num2 = (int) y; // downcasting -> explicit casting 
     System.out.println(num2);
     // byte short int long float double 

// Parsing -> Converts String into primitive data type or vice versa

/*
        String x = "10";
       
       int num = Integer.valueOf(x);
       System.out.println(num);
       */ 

/*
//   int randomNumber = (int) (Math.random() * 58) + 1;
      // System.out.println(randomNumber);
        
        // Lotto Simulator ( 6 / 58)
        System.out.println("Lotto Numbers: ");
        for (int i = 0; i <= 6; i++) {
            int randomNumber = (int)(Math.random() * 58) + 1;
            System.out.println("[" + (i + 1) + "]: " + randomNumber);
        }
*/