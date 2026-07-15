
package Day24.Activity;

public class Main {
    public static void main (String[] args) {
        
        SavingsAccount savings = new SavingsAccount (
        "1001",
                "Hukbalahab",
                5000,
                2.5);
        
        CheckingAccount checking = new CheckingAccount(
        "2001",
                "Rhylhynx",
                3000,
                1000
        );
        
        savings.displayAccountInfo();
        savings.deposit(1000);
        savings.withdraw(2000);
        
        System.out.println();
        
        checking.displayAccountInfo();
        checking.deposit(500);
        checking.withdraw(3500);
        
    }
}
