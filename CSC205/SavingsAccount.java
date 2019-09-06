package CSC205;

import java.text.NumberFormat;

import ch4.BankAccount3;

public class SavingsAccount extends BankAccount3 {
	
	private double interestRate; // The annual interest rate
	
	//Calls the super class’s constructor and initializes interestRate to 0.05
	public SavingsAccount() {
		
		super();
		interestRate = 0.05;
		
	}
	
	// overloaded constructor. Calls the super class’s constructor. Sets its instance variable interestRate
	public SavingsAccount(int acctNum, String name, double balance, double interestRate) {
		
		super(acctNum, balance, name);
		
		this.interestRate = interestRate;
	}
	
	//sets instance variable interestRate
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	//returns interestRate
	public double getInterestRate() {
		return this.interestRate;
	}
	
	//calculate the interest and add it to the balance
	public void addInterest() {
		
		double amount;
		
		amount = (this.getBalance() * this.interestRate) + this.getBalance();
		
		this.setBalance(amount);
	}
	
	// returns the String representation of SavingsAccount object
	public String toString()
    {
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
	 	return (" acctNumber: "  + acctNumber +  " balance : " + fmt.format(balance)
			        + " name : " + name  );
	 }
}
