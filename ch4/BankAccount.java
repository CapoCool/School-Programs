//Program: BankAccount.java
//Author: Dillan Poorman
//Class: CSC110AA
//Date: 2/28/2018
//Description: Simulates a simple bank account.
package ch4;

public class BankAccount 
{
	private double balance;
	
	public BankAccount()
	{
		balance = 0.0;
	}
	
	
	public void deposit(double amount)
	{
		balance += amount;
	}
	
	public void withdraw(double amount)
	{
		balance -= amount;
	}
	
	public double getBalance()
	{
		return balance;
	}
	
}
	
