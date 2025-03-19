class SavingsAccount extends CheckingAccount {
    double interestRate = 0.5d;

    public static void main(String[] args){
		SavingsAccount sa = new SavingsAccount();
		sa.start();
	}

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public void calcInterest() {
        double interest = this.balance * interestRate;
        setBalance(this.balance + interest);
        System.out.println("Interest applied. New balance: " + getBalanceString());
    }

    public double getInterestRate() {
        return this.interestRate;
    }


}