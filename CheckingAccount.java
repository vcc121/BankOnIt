import java.util.*;
import java.io.*;

public class CheckingAccount implements HasMenu, Serializable {
    double balance;
    
    public CheckingAccount() {
        this.balance = 0.0;
    }

    public CheckingAccount(double balance) {
        this.balance = balance;
    }

    public static void main(String[] args) {
        CheckingAccount ca = new CheckingAccount();
        ca.start();
    }

    public String menu() {
        return """
            Account Menu
            0) Quit
            1) Check Balance
            2) Make a Deposit
            3) Make a Withdrawal
            Please enter 0-3: 
            """;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        boolean keepGoing = true;
        while (keepGoing) {
            System.out.print(menu());
            String response = scanner.nextLine();
            
            if (response.equals("0")) {
                keepGoing = false;
            } 
            else if (response.equals("1")) {
                System.out.println("Checking balance...");
                this.checkBalance();
            } 
            else if (response.equals("2")) {
                System.out.println("Making a deposit...");
                this.makeDeposit();
            } 
            else if (response.equals("3")) {
                System.out.println("Making a withdrawal...");
                this.makeWithdrawal();
            } 
            else {
                System.out.println("Invalid input.");
            }
        }
    }

    public double getBalance() {
        return this.balance;
    }

    public String getBalanceString() {
        return String.format("$%.2f", this.balance);
    }

    public void checkBalance() {
        System.out.println("Current balance: " + this.getBalanceString());
    }

    private double getDouble() {
        Scanner input = new Scanner(System.in);
        String sResult = input.nextLine();
        double result = 0d;
        try {
            result = Double.parseDouble(sResult);
        } 
        catch (Exception e) {
            System.out.println("Not a legal input. Changing to zero.");
            result = 0d;
        }
        return result;
    }

    public void makeDeposit() {
        System.out.print("How much to deposit? ");
        double amount = getDouble();
        if (amount > 0) {
            balance += amount;
            System.out.println("New balance: " + getBalanceString());
        } else {
            System.out.println("Deposit failed. Invalid amount.");
        }
    }

    public void makeWithdrawal() {
        System.out.print("How much to withdraw? ");
        double amount = getDouble();
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("New balance: " + getBalanceString());
        } else {
            System.out.println("Withdrawal failed. Invalid amount or insufficient balance.");
        }
    }
}
