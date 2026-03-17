//Ashwani Chauhan (2400320100318)//
import java.util.Scanner;

class BankAccount {  
    private String accHolder;
    private String accNo;
    private double balance;
    public BankAccount(String accHolder, String accNo, double initialBalance) {
        this.accHolder = accHolder;
        this.accNo = accNo;
        this.balance = initialBalance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Successfully withdrawn: " + amount);
        } else if (amount > balance) {
            System.out.println("Error: Insufficient balance.");
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }
    public void display() {
        System.out.println("\n--- Account Details ---");
        System.out.println("Account Holder: " + accHolder);
        System.out.println("Account Number: " + accNo);
        System.out.println("Current Balance: " + balance);
        System.out.println("-----------------------");
    }
}

public class BankSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Account Number: ");
        String number = sc.nextLine();
        System.out.print("Enter Initial Deposit: ");
        double initialAmt = sc.nextDouble();
        BankAccount myAccount = new BankAccount(name, number, initialAmt);
        int choice;
        do {
            System.out.println("\n--- Bank Menu ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Display Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double dAmount = sc.nextDouble();
                    myAccount.deposit(dAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double wAmount = sc.nextDouble();
                    myAccount.withdraw(wAmount);
                    break;
                case 3:
                    myAccount.display();
                    break;
                case 4:
                    System.out.println("Thank you for using our banking system!");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 4);
        sc.close();
    }
}