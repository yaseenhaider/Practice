// Account.java
public class Account {
    // Data member
    private double balance;

    // No-argument constructor
    public Account() {
        this.balance = 0.0; // Default balance
    }

    // Constructor with initial balance
    public Account(double initialBalance) {
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0.0; // Default to 0 if negative
            System.out.println("Initial balance cannot be negative. Setting balance to $0.00.");
        }
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.printf("Deposited: $%.2f. New balance: $%.2f.%n", amount, balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.printf("Withdrew: $%.2f. New balance: $%.2f.%n", amount, balance);
        } else if (amount > balance) {
            System.out.println("Insufficient funds.");
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    // Method to get the current balance
    public double getBalance() {
        return balance;
    }

    // Main method to test the Account class
    public static void main(String[] args) {
        // Create an account using the no-argument constructor
        Account account1 = new Account();
        account1.deposit(100);
        account1.withdraw(30);

        // Create an account using the constructor with an initial balance
        Account account2 = new Account(200);
        account2.deposit(50);
        account2.withdraw(100);
    }
}