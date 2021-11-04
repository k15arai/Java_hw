import java.util.*;

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(100, 200);
        BankAccount account2 = new BankAccount(50, 100);
        BankAccount account3 = new BankAccount(25, 50);
                
        System.out.println("The number of accounts: " + account1.accountCount());
        System.out.println("The number of accounts: " + account2.accountCount());
        System.out.println("The number of accounts: " + account3.accountCount());

        account1.depositMoney("checking", 10.0);
        System.out.println("The checking account balance is: " + account1.getCheckingAccountBalance() + " / " + "The savings balance is: " + account1.getSavingsAccountBalance());

        account1.withdrawMoney("checking", 50.0);
        System.out.println("The checking account balance is: " + account1.getCheckingAccountBalance() + " / " + "The savings balance is: " + account1.getSavingsAccountBalance());
        
        account1.depositMoney("savings", 10.0);
        System.out.println("The savings balance is: " + account1.getSavingsAccountBalance() + " / " + "The checking account balance is: " + account1.getCheckingAccountBalance());

        account1.withdrawMoney("savings", 50.0);
        System.out.println("The savings balance is: " + account1.getSavingsAccountBalance() + " / " + "The checking account balance is: " + account1.getCheckingAccountBalance());

        System.out.println("Account 1 Total Balance is: " + account1.getTotalSingleAccountBalance());
        System.out.println("Account 2 Total Balance is: " + account2.getTotalSingleAccountBalance());
        System.out.println("Account 3 Total Balance is: " + account3.getTotalSingleAccountBalance());

        System.out.println("The total amount across ALL acounts is: " + BankAccount.checkAllAccountsTotal());
    }
}