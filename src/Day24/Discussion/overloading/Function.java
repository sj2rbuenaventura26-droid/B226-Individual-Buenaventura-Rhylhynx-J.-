
package Day24.Discussion.overloading;


public class Function {
    
    public void jump() {}
    
    public void jump(int noOfJump) {}
   
    public void jump(double height) {}
    
     public void jump(String Animation) {}
     
      public void jump(int noOfJump,double height ) {}
      
     public void jump(int noOfJump,double height, String Animation ) {} 
    
     // Compile Time Polymorphism
    public static void main(String[] args) {
        Function f = new Function();
        f.jump(2);  
    }
}

// confirmSubscription(String promo)
// confirmSubscription()