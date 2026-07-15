
package Day24.Activity;

public class CheckingAccount extends Account implements Transaction {

        private double overdraftlimit; 
        
        public CheckingAccount (String accountNumber, String accountHolder, 
                double balance, double overdraftlimit) {
            
           super (accountNumber, accountHolder, balance);
            this.overdraftlimit = overdraftlimit;
            
        }
    
        @Override
       public void displayAccountInfo(){
           
           System.out.println("--------Checking Account -------");
           System.out.println("Account Number: " + accountNumber);
           System.out.println("Account Holder: " + accountHolder);
           System.out.println("Balance: " + balance);
           System.out.println("Over Draft Limit: " + overdraftlimit);
       }
       
       @Override
       public void deposit(double amount) {
           
           balance += amount;
           System.out.println("Deposited: " + amount + "Into Checking Account.");
           System.out.println("New Balance: " + balance);
       }
       
        @Override
       public void withdraw(double amount) {
           
           if (balance + overdraftlimit >= amount) {
               balance -= amount;
               
               System.out.println();
               System.out.println("Withdrawn: " + amount + "from Checking Account.");
               
               if (balance < 0) {
                   System.out.println("Transaction allowen using overdraft.");
               } 
               System.out.println("New Balance: " + balance);
         
           } else {
               System.out.println("Overdraft Limit Exceeded");
           }
       }
}
