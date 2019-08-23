//Program: Bank.java
//Author: Dillan Poorman
//Class: CSC110AA
//Date: 2/28/2018
//Description: Simulates changes made within the BankAccount.java
package ch4;
import java.text.NumberFormat;

public class Bank 
{
	public static void main(String[] args)
	{
		
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		BankAccount myAcct = new BankAccount();
		System.out.print("Welcome to our bank\n\n");
		System.out.println("Beginning state of myAcct: " + "balance: " + fmt.format(myAcct.getBalance()));
		myAcct.deposit(1000000);
		System.out.println("The balance of myAcct after deposit is: " + fmt.format(myAcct.getBalance()));
		myAcct.withdraw(158786);
		System.out.println("State myAcct after deposit and withdrawal: " + "balance: " + fmt.format(myAcct.getBalance()));
		
	}

}
