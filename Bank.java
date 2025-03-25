import java.util.*;
import java.io.*;

public class Bank implements HasMenu, Serializable {

    Admin admin = new Admin();
    CustomerList customers = new CustomerList();
    Scanner scanner = new Scanner(System.in);
}