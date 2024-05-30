package OnlineQuizPlatform;

import java.util.Scanner;

public class BankingApplication {
    public static void main (String[] args) {
        BankAccount account = new BankAccount("John Doe", 1000);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Welcome, " + account.getOwnerName());
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Balance: INR" + account.getBalance());
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: INR");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    System.out.println("Deposit successful. New balance: INR" + account.getBalance());
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw: INR");
                    double withdrawAmount = scanner.nextDouble();
                    if (account.withdraw(withdrawAmount)) {
                        System.out.println("Withdrawal successful. New balance: INR" + account.getBalance());
                    } else {
                        System.out.println("Insufficient funds.");
                    }
                    break;
                case 4:
                    System.out.println("Thank you for using our banking system.");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

//    public static class BankAccount {
//        private String ownerName;
//        private double balance;
//
//        public BankAccount(String ownerName, double initialBalance) {
//            this.ownerName = ownerName;
//            this.balance = initialBalance;
//        }
//
//        public String getOwnerName() {
//            return ownerName;
//        }
//
//        public double getBalance() {
//            return balance;
//        }
//
//        public void deposit(double amount) {
//            if (amount > 0) {
//                balance += amount;
//            } else {
//                System.out.println("Invalid amount.");
//            }
//        }
//
//        public boolean withdraw(double amount) {
//            if (amount > 0 && amount <= balance) {
//                balance -= amount;
//                return true;
//            } else {
//                return false;
//            }
//        }
//    }
//}

