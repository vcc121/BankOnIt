import java.io.*;
import java.util.*;

public class Admin extends User implements HasMenu, Serializable {

    public static void main(String[] args) {
        Admin a = new Admin();
    }

    public Admin() {
        super("admin","0000");
    }

    public String menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Admin Menu");
        System.out.println("0) Exit this menu");
        System.out.println("1) Full customer report");
        System.out.println("2) Add user");
        System.out.println("3) Apply interest to savings accounts");
        String result = scanner.nextLine();

        return result;
    }

    public void start() {
        // Admin actions are handled in Bank
    }

    public String getReport() {
        return "Admin: " + getUserName() + "\nPIN: " + getPIN();
    }
}
