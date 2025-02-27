package classesObjects.level2;

class BankAccount {
    String accountHolder;
    String accountNumber;
    double balance;

    // Constructor
    public BankAccount(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    // Method to display balance
    public void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

public class ATMSimulation {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Alice", "123456789", 1000.0);
        account.deposit(500);
        account.withdraw(200);
        account.displayBalance();
    }
}
