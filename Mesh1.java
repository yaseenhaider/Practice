import java.util.Scanner;

class BankAccount {
    private String accountHolder;
    private double balance;

    public BankAccount(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public boolean isSameHolder(BankAccount other) {
        return this.accountHolder.equals(other.accountHolder);
    }

    public boolean hasHigherBalance(BankAccount other) {
        return this.balance > other.balance;
    }
}

public class SimpleBank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create two accounts
        System.out.print("First account holder name: ");
        BankAccount account1 = new BankAccount(scanner.nextLine(), 0);

        System.out.print("Second account holder name: ");
        BankAccount account2 = new BankAccount(scanner.nextLine(), 0);

        // Transactions for account 1
        System.out.print("Deposit for " + account1.getAccountHolder() + ": ");
        account1.deposit(scanner.nextDouble());

        System.out.print("Withdraw for " + account1.getAccountHolder() + ": ");
        account1.withdraw(scanner.nextDouble());

        // Transactions for account 2
        System.out.print("Deposit for " + account2.getAccountHolder() + ": ");
        account2.deposit(scanner.nextDouble());

        System.out.print("Withdraw for " + account2.getAccountHolder() + ": ");
        account2.withdraw(scanner.nextDouble());

        // Compare accounts
        if (account1.isSameHolder(account2)) {
            System.out.println("Same account holder.");
        } else {
            System.out.println("Different account holders.");
        }

        // Show higher balance
        BankAccount higher = account1.hasHigherBalance(account2) ? account1 : account2;
        System.out.printf("Higher balance: %s ($%.2f)%n", higher.getAccountHolder(), higher.getBalance());

        scanner.close();
    }
}