
package Day23.Discussion.PaymentMethod;

// tight coupling 
public class Cashpayment extends Payment{
    
    @Override
    public void pay(double amount) {
        System.out.println("Paid P" + amount + "using Cash Payment");
    }
    
    @Override
    public void deposit(double amount, String refNum) {
        System.out.println("refund...");
    }

}
