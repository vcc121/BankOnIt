import.java.util.*;
import.java.io.*;

public class Customer extends User {
    protected CheckingAccount checking;
    protected SavingsAccount savings;

    public Customer(String userName, String PIN) {
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

}
