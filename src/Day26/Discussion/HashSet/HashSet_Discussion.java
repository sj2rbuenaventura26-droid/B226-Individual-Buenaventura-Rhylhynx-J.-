
package Day26.Discussion.HashSet;

import java.util.HashSet;
import java.util.Set;


public class HashSet_Discussion {
     public static void main(String[] args) {
         
         Set<Integer> lottoNumbers = new HashSet<>();
         
         while(lottoNumbers.size() < 6){
         int randomNumber = (int) (Math.random() * 58);
         
         lottoNumbers.add(randomNumber);
         }
         
         // System.out.println(lottoNumbers);
         
         // Tranverse a hashset using for each loop 
         for (int lotto : lottoNumbers) {
             System.out.println(lotto);
         } 
         
        // lottoNumbers.forEach( (lottoNum -> System.out.println(lottoNum));
       
     }
}
