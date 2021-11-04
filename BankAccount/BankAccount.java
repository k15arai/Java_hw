public class BankAccount {
    // member variables
    private double checkingBalance;
    private double savingsBalance;

    // static variables
    private static int numberOfAccounts;
    private static double totalBalanceAcrossAllAccounts;

    // static methods
    public static int accountCount() {
        return numberOfAccounts;
    }

    public static double checkAllAccountsTotal() {
        return totalBalanceAcrossAllAccounts;
    }

    // default constructor
    public BankAccount() {
        this.checkingBalance = 0;
        this.savingsBalance = 0;
        totalBalanceAcrossAllAccounts = 0;
        numberOfAccounts++;
    }

    // constructor with parameters
    public BankAccount(double checkingBalance, double savingsBalance) {
        this.checkingBalance = checkingBalance;
        this.savingsBalance = savingsBalance;
        totalBalanceAcrossAllAccounts += (checkingBalance + savingsBalance);
        numberOfAccounts++;
    }

    // instance methods
    public double getCheckingAccountBalance() {
        return checkingBalance;
    }

    public double getSavingsAccountBalance() {
        return savingsBalance;
    }

    public double getTotalSingleAccountBalance() {
        return checkingBalance + savingsBalance;
    }

    public void depositMoney(String accountType, double depositAmount) {
        if (accountType.equalsIgnoreCase("savings")) {
            savingsBalance += depositAmount;
            totalBalanceAcrossAllAccounts += depositAmount;
        }
        if (accountType.equalsIgnoreCase("checking")) {
            checkingBalance += depositAmount;
            totalBalanceAcrossAllAccounts += depositAmount;
        }
    }

    public void withdrawMoney(String accountType, double withdrawalAmount) {
        if (accountType.equals("savings") && savingsBalance >= withdrawalAmount) {
            savingsBalance -= withdrawalAmount;
            totalBalanceAcrossAllAccounts -= withdrawalAmount;
        } else if (accountType.equals("checking") && checkingBalance >= withdrawalAmount) {
            checkingBalance -= withdrawalAmount;
            totalBalanceAcrossAllAccounts -= withdrawalAmount;
        } else {
            System.out.println("You do not have sufficient funds.");
        }
    }

}

// Tasks:

// Ninja Bonus (Optional):

// Add the the following class attribute: account number. The type is up to you, can be a String or a Long or another type.
// Create a private method that returns a random ten digit account number.
// In the constructor, call the private method from above so that each user has a random ten digit account.