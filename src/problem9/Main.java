
package problem9;

// Main class to test the bank account classes
public class Main {
    public static void main(String[] args) {
        // Create a savings account with an initial balance and withdrawal limit
        BankAccount savingsAccount = new SavingAccount(2000, 650);
        // Create a checking account with an initial balance and overdraft fee
        BankAccount checkingAccount = new CheckingAccount(1000, 100);

        // Withdraw an amount from the savings account
        withdrawFromAccount(savingsAccount, 300);
        // Withdraw an amount from the checking account
        withdrawFromAccount(checkingAccount, 250);

        // Print the current balance of the savings account
        System.out.println("Savings Account Balance: " + savingsAccount.getBalance());
        // Print the current balance of the checking account
        System.out.println("Checking Account Balance: " + checkingAccount.getBalance());
    }

    // Static method to withdraw an amount from a given bank account
    public static void withdrawFromAccount(BankAccount account, double amount) {
        account.withdraw(amount); // Call the withdraw method on the given account
    }
}
