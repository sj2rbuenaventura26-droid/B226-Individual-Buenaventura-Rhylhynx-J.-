
package Day23.Discussion.PaymentMethod;


public class CreditCardPayment extends Payment {
    
    @Override
    public void pay(double amount) {
        System.out.println("Paid P" + amount + "using Credit Card Payment");
    }
}
