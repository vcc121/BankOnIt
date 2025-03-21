import.java.util.*;
import.java.io.*;

public class Customer extends User {
    protected CheckingAccount checking;
    protected SavingsAccount savings;

    public Customer(String userName, String PIN) {
        this.checking = new CheckingAccount();
        this.savings = new SavingsAccount();
    }
}
