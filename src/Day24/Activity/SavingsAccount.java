
package Day24.Activity;


public class SavingsAccount extends Account implements Transaction {
    
    private double interestRate;
 
    public SavingsAccount(String accountNumber, String accountHolder, 
            double balance, double interestRate) {
       
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }
    
       @Override
       public void displayAccountInfo(){
           System.out.println("-------Savings Account --------");
           System.out.println("Account Number: " + accountNumber);
           System.out.println("Account Holder: " + accountHolder);
           System.out.println("Balance: " + balance);
           System.out.println("Interest Rate: " + interestRate + "%");
       }
       
       @Override
       public void deposit(double amount) {
           balance += amount;
           
           System.out.println();
           System.out.println("Deposited: " + amount + "into Savings Account");
           System.out.println("New Balance: " + balance);
       }
       
       @Override
       public void withdraw(double amount) {
           
           if (balance >= amount) {
               balance -= amount;
               System.out.println("Withdrawn: " + amount + "from Savings Account.");
               System.out.println("New Balance: " + balance);
           } else {
               System.out.println("Insufficient Balance ");
           }
       }
               
    
}
