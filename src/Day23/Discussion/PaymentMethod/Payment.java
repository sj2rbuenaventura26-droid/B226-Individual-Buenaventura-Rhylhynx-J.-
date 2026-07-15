
package Day23.Discussion.PaymentMethod;


public class Payment {
   
    public void pay(double amount) {
        System.out.println("Processing payment of P" + amount);
    }
    
    public void deposit(double amount, String refNum) {
        System.out.println("Deposit...");
    }
}
