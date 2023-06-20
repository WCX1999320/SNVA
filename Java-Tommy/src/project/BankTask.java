package project;

import java.util.Scanner;

class BankAccount {

    private String[] ids;
    private String[] passwords;
    private double[] balances;

    public BankAccount() {

    }
    public BankAccount(String[] ids, String[] passwords, double[] balances) {
        this.ids = ids;
        this.passwords = passwords;
        this.balances = balances;
    }
    public double getBalance(String id, String password) {
        for (int i = 0; i < ids.length; i++) {
            if (ids[i].equals(id) && passwords[i].equals(password)) {
                return balances[i];
            }
        }
        return -1;
    }
}

public class BankTask {
    public static void main(String[] args) {
        String[] ids = { "12345", "67890", "54321" };
        String[] passwords = { "myPass123", "myPass456", "myPass789" };
        double[] balances = { 10000.0, 10500.0, 25000.0 };

        BankAccount bankAccount = new BankAccount(ids, passwords, balances);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Finance Bank!");

        boolean continueFlag = true;

        do {
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();

            System.out.print("Enter your ID: ");
            String id = scanner.nextLine();

            System.out.print("Enter your password: ");
            String password = scanner.nextLine();

            double balance = bankAccount.getBalance(id, password);
            if (balance != -1) {
                System.out.println("Hello, " + name + "! Your balance is: $" + balance);
            } else {
                System.out.println("Invalid ID or password.");
            }

            System.out.print("Do you want to continue? (yes/no): ");
            String continueChoice = scanner.nextLine();
            continueFlag = continueChoice.equalsIgnoreCase("yes");

        } while (continueFlag);
    }
}
