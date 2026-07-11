
package Day18.Discussion;


public class MethodInvocation {
    public static void main(String[] args) {
        MethodInvocation obj = new MethodInvocation();
        obj.b();
        MethodInvocation.a();
    }
    
    // Static Method 
    public static void a() {
        System.out.println("Acessing static method...");
    }
    
    // instance method
    public void b() {
        System.out.println("Acessing instance method...");
    }
}
