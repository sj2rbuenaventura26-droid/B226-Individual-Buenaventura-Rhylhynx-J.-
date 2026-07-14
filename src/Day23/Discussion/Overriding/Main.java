
package Day23.Discussion.Overriding;


public class Main {
    public static void main(String[] args) {
      Person person = new Person();
        
      /*  Person father = new Father();
        Person husband = new Husband();
        Person child = new Child();
        
        father.role();
       // husband.role();
       // child.role();
        
        person.walk();
*/    
       
      Father father = new Father();
      father.printName();
}
    
   
}

// Runtime
// Compile Time 