import java.util.*;
import java.io.*;

public class Bank implements HasMenu, Serializable {

    Admin admin = new Admin();
    CustomerList customers = new CustomerList();
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
		new Bank();
	}

    public Bank (){
        // Uncomment these to refresh data
        // this.loadSampleCustomers();
        // this.saveCustomers();

        this.loadCustomers();
        this.start();
        this.saveCustomers();
    }

    public void loadSampleCustomers(){
        customers.add(new Customer("Alice", "1111"));
        customers.add(new Customer("Bob", "2222"));
        customers.add(new Customer("Cindy", "3333"));
    }

    public void saveCustomers(){
        try {
            FileOutputStream fo = new FileOutputStream("Customers.dat");
            ObjectOutputStream obOut = new ObjectOutputStream(fo);
            obOut.writeObject(customers);
            obOut.close();
            fo.close();
            } catch (IOException e) {
            System.out.println("Error saving customers.");
        }
    }
    
    public void loadCustomers() {
        try {
            FileInputStream fi = new FileInputStream("Customers.dat");
            ObjectInputStream obIn = new ObjectInputStream(fi);
            customers = (CustomerList) obIn.readObject();
            obIn.close();
            fi.close();
        } catch (IOException e) {
            System.out.println("No previous customer data found. Loading sample data.");
            loadSampleCustomers();
        }
    }

    public void loginAsCustomer(){
        System.out.print("User Name: ");
        String userNameIn = scanner.nextLine();
        System.out.print("PIN: ");
        String pinIn = scanner.nextLine();

        Customer currentCustomer = null;
        for (Customer customer: customers){
            if (customer.login(userNameIn, pinIn)){
                currentCustomer = customer;
            }
        }

        if (currentCustomer == null){
            System.out.println("Customer not found");
        } else {
            currentCustomer.start();
        }
    }

    public void loginAsAdmin() {
        System.out.print("User Name: ");
        String userNameIn = scanner.nextLine();
        System.out.print("PIN: ");
        String pinIn = scanner.nextLine();

        if (admin.login(userNameIn, pinIn)) {
            System.out.println("Admin login successful.");
            adminStart();
        } else {
            System.out.println("Invalid admin credentials.");
        }
    }

    public String menu() {
        System.out.println("Bank Menu");
        System.out.println("0) Exit system");
        System.out.println("1) Login as Admin");
        System.out.println("2) Login as Customer");
        String result = scanner.nextLine();

        return result;
    }
}