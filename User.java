import.java.util.*;
import.java.io.*;

public abstract class User implements HasMenu, Serializable {
    String userName = "";
    String PIN = "";

    public boolean login(){
        Scanner input = new Scanner(System.in);
        boolean result = false;
        System.out.print("User name: ")
        String userNameIn = input.nextLine();

        if (userNameIn.equals(this.userName)){
            System.out.print("PIN: ")
            String pinIn = input.nextLine();

            if (pinIn.equals(this.userName)){

            }
        }
    }

}