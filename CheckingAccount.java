import.java.util.*;
import.java.io.*;

public class CheckingAccount implements HasMenu, Serializable {
	double balance;
	
	public static void main (String[] args){
		CheckingAccount ca = new CheckingAccount();
		ca.start();
	}

	public void start(){
		boolean keepGoing = true;
		while(keepGoing){
			String response = menu();
			if (response.equals("0")){
				keepGoing = false;
			}
			else if (response.equals("1")){
				System.out.println("Checking balance...");
				this.checkBalance();
			}
			else if (response.equals("2")){
				System.out.println("Making a deposit...");
				this.makeDeposit();
			}
			else if (response.equals("3")){
				System.out.println("Making a withdrawal...");
				this.makeWithdrawal();
			}
			else {
				System.out.println("Invalid input.")
			}
		}
	}

	public double getBalance(){
        return this.balance;
    }

	public String getBalanceString(){
		return String.format("$%.2f", this.balance)
	}

	public void checkBalance(){
		Systme.out.println("Current balance: " + this.getBalance())
	}

	private double getDouble(){
		Scanner input = new Scanner(System.in)
		String sResult = input.nextLine();
		double result = 0d;
		try {
			result = Double.parseDouble(sResult);
		}
		catch(Exception e){
			System.out.println("Not a legal input. Changing to zero.")
			result = 0d;
		}
		return result;
	}

	public void makeDeposit(){
		Scanner scanner = new Scanner(System.in)
		System.out.print("How much to deposit? ");
        double amount = getDouble(scanner);
        if (amount > 0) {
            balance += amount;
            System.out.println("New balance: " + getBalanceString());
        } else {
            System.out.println("Deposit failed. Invalid amount.");
        }
    }

	public void makeWithdrawal(){
		
	}
	}
}
