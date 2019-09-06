package CSC205;

import ch4.BankAccount3;

public class SavingsDriver {

	public static void main(String[] args) {
		
		SavingsAccount mySavings = new SavingsAccount();
		
		System.out.println(mySavings);
		
		mySavings.deposit(5000);
		mySavings.addInterest();
		
		System.out.println("Current balance: " + mySavings.getBalance());
		
		
	}

}
