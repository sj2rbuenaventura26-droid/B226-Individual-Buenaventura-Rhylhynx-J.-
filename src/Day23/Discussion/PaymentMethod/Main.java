
package Day23.Discussion.PaymentMethod;


public class Main {
    public static void main(String[] args) {
        // instantiation (Dynamic Polymorphism)
       Payment cashpayment = new Cashpayment();
       Payment creditpayment = new CreditCardPayment();
       Payment gcashpayment = new GCashPayment();
       
       cashpayment.pay(100);
       creditpayment.pay(100);
       gcashpayment.pay(100);
       
    }
}
