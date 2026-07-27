import java.util.Scanner;

class BankAccount {
    private int accountNumber;
    private String holderName;
    private double balance;

    BankAccount(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount Deposited Successfully.");
        } else {
            System.out.println("Invalid Amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Amount Withdrawn Successfully.");
        } else {
            System.out.println("Insufficient Balance.");
        }
    }

    public void displayBalance() {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + holderName);
        System.out.println("Current Balance : " + balance);
    }
}
class BankAccountSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();

        BankAccount account = new BankAccount(accNo, name, balance);

        System.out.println("\n1. Deposit");
        System.out.println("2. Withdraw");
        System.out.print("Enter Choice: ");
        int choice = sc.nextInt();

        System.out.print("Enter Amount: ");
        double amount = sc.nextDouble();

        if (choice == 1) {
            account.deposit(amount);
        } else if (choice == 2) {
            account.withdraw(amount);
        } else {
            System.out.println("Invalid Choice");
        }

        account.displayBalance();

        sc.close();
    }
}