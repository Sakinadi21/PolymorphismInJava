package problem9;

// Base class representing a bank account
class BankAccount {
    // Private member variable to store the balance
    private double balance;

    // Constructor to initialize the balance
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Method to get the current balance
    public double getBalance() {
        return balance;
    }

    // Method to deposit an amount into the account
    public void deposit(double amount) {
        balance += amount;
    }

    // Method to withdraw an amount from the account
    public void withdraw(double amount) {
        // Check if there are sufficient funds for the withdrawal
        if (amount <= balance) {
            balance -= amount;
        } else {
            // Print a message if there are insufficient funds
            System.out.println("Insufficient funds");
        }
    }
}

// Class representing a savings account, which extends BankAccount
class SavingAccount extends BankAccount {
    // Private member variable to store the withdrawal limit
    private double withdrawalLimit;

    // Constructor to initialize the balance and withdrawal limit
    public SavingAccount(double initialBalance, double withdrawalLimit) {
        super(initialBalance); // Call the constructor of the superclass (BankAccount)
        this.withdrawalLimit = withdrawalLimit;
    }

    // Overridden method to withdraw an amount, respecting the withdrawal limit
    @Override
    public void withdraw(double amount) {
        // Check if the amount is within the withdrawal limit
        if (amount <= withdrawalLimit) {
            super.withdraw(amount); // Call the withdraw method of the superclass
        } else {
            // Print a message if the withdrawal limit is exceeded
            System.out.println("Withdrawal limit exceeded.");
        }
    }
}

// Class representing a checking account, which extends BankAccount
class CheckingAccount extends BankAccount {
    // Private member variable to store the overdraft fee
    private double overdraftFee;

    // Constructor to initialize the balance and overdraft fee
    public CheckingAccount(double initialBalance, double overdraftFee) {
        super(initialBalance); // Call the constructor of the superclass (BankAccount)
        this.overdraftFee = overdraftFee;
    }

    // Overridden method to withdraw an amount, applying overdraft fee if necessary
    @Override
    public void withdraw(double amount) {
        // Check if there are sufficient funds for the withdrawal
        if (amount <= getBalance()) {
            super.withdraw(amount); // Call the withdraw method of the superclass
        } else {
            // Print a message if overdraft fee is applied
            System.out.println("Overdraft fee applied.");
            super.withdraw(amount + overdraftFee); // Call the withdraw method with the overdraft fee included
        }
    }
}

