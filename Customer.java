import java.util.*;
import java.io.*;

public class Customer extends User {
    protected CheckingAccount checking;
    protected SavingsAccount savings;

    public Customer(String userName, String PIN) {
        super(userName, PIN);
        this.checking = new CheckingAccount();
        this.savings = new SavingsAccount();
    }


    public static void main(String[] args) {
        Customer customer = new Customer("Alice", "1111");
        if (customer.login()) {
            System.out.println("Login Successful");
            customer.start();
        } else {
            System.out.println("Login Failed. Try again.");
        }
    }

    public String menu() {
        return """
            Account Menu
            0) Exit
            1) Manage Checking Account
            2) Manage Savings Account
            3) change PIN
            Please enter 0-3: 
            """;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        boolean keepGoing = true;
        while (keepGoing) {
            System.out.print(menu());
            int choice = scanner.nextInt();
            if (choice == 1) {
                checking.start();
            } else if (choice == 2) {
                savings.start();
            } else if (choice == 3) {
                changePin();
            } else if (choice == 0) {
                keepGoing = false;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public void changePin() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter new PIN: ");
        this.setPIN(scanner.nextLine());
        System.out.println("PIN changed successfully.");
    }

    public String getReport(){
        String report = "User: " + this.getUserName();
        report += ", Checking: " + this.checking.getBalanceString();
        report += ", Savings: " + this.savings.getBalanceString();

        return report;
    }

}
