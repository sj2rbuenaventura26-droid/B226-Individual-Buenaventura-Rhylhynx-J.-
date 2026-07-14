
package Day23.Discussion.PaymentMethod;


public class Cashpayment extends Payment{
    
    @Override
    public void pay(double amount) {
        System.out.println("Paid P" + amount + "using Cash Payment");
    }

}
