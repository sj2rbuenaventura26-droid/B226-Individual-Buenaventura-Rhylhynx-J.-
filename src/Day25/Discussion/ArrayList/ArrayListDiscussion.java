
package Day25.Discussion.ArrayList;

import java.util.ArrayList;

public class ArrayListDiscussion {
    
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Isuzu");
        cars.add("Ferrari");
        cars.add("Ford");
        cars.add("Bugatti");
        cars.add("Toyota");
        cars.add(1, "Lightning McQueen");
        
          System.out.println(cars.get(0));
          System.out.println(cars.get(cars.size()-1));
        
        cars.set(0, "McQueen");
        
        System.out.println(cars.get(1));
        
        cars.remove(1);
        cars.remove("Toyota");
        
      //  System.out.println(cars.get(1));
      
      cars.removeAll(cars);
      cars.clear();
      
      System.out.println(cars);
               
    }
}

// toString() 

/*
CRUD Operation 
Create -> add()
Read -> get()
Update -> set()
Delete -> remove()

Delete All -> removeAll() / clear()

*/