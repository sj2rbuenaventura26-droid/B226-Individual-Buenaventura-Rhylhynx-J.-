
package Day24.Activity;

public abstract class Account {
    
    protected String accountNumber;
    protected String accountHolder;
    protected double balance;
    
    public Account(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    
    public abstract void displayAccountInfo();
    
   
}
