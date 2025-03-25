import java.io.*;
import java.util.*;

public class Admin extends User {

    public Admin(String userName, String PIN) {
        this.userName = "admin";
        this.PIN = "0000";
    }

    public void menu() {
        System.out.println("Admin Menu");
        System.out.println("0) Exit this menu");
        System.out.println("1) Full customer report");
        System.out.println("2) Add user");
        System.out.println("3) Apply interest to savings accounts");
    }

    // Empty start method
    public void start() {
        // Admin actions are handled in Bank
    }

    // Simple report method (mostly unused)
    public String getReport() {
        return "Admin: " + getUserName() + ", PIN: " + getPin();
    }
}
