
package Day23.Discussion.Overriding;


public class Father extends Person {

    /* @Override annotation tells the compiler that this
        method is overriding the method from parent.
    */  
    
    String name = "Father Les";
    
    public void printName() {
        System.out.println(name);
    }
      @Override
    public void role () {
       System.out.println( "I  am  a father. I provide ");      
    }     
    // Access level: public protected default private
    
}
    