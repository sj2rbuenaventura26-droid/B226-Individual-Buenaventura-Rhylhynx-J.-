
package Day24.Discussion_interfacee;


public class Father implements Person {

    @Override
    public void role() {
        System.out.println("I am a Father ");
    }
    
     @Override
    public void walk() {
        System.out.println("Father is walking.");
    }

    @Override
    public void jump() {
        System.out.println("Father is jumping.");
    }
}
