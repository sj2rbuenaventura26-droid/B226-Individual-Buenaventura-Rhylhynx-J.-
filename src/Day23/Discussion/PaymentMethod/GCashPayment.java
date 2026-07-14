
package Day23.Discussion.PaymentMethod;


public class GCashPayment extends Payment {
    
    @Override
     public void pay(double amount) {
        System.out.println("Paid P" + amount + "using GCash Payment");
    }
}
