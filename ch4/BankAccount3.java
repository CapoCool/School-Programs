/* Class Name: CSC205
   Author: Dillan Poorman
	Date : 09/5/2019
	Brief Description:
	
	Bank account I wrote in my CSC110 class.  
    
 */
package ch4;
import java.text.NumberFormat;  //using currency format in toString




public class BankAccount3 
{
  
	protected int acctNumber;
    protected double balance;
    protected String name;
	
    protected static int acctCount = 0;
	 
    
    /* constructs a bank account with zero balance and account number,
       and Unknown name
     */

    public BankAccount3() 
	 {
		 acctNumber = 1234;
		 balance = 0.0;
		 name = "Dillan Poorman";
		 
		 acctCount++;
	 }
	 
	 /*constructs a bank account with an account number, initial balance, and owner*/
	 public BankAccount3(int acctNo, double initBalance, String owner)
	 {
	  	 acctNumber =acctNo;
		 balance = initBalance;
		 name = owner;
		 
		 acctCount++;
	 }
	
    //all of the mutator methods - set

    public void setAcctNumber(int acct)
	 {
		    acctNumber = acct;
    }

 	//not appropriate.  would not want to reset a balance  
	public void setBalance(double amount)
	{
	    balance = amount;
    }
   
    public void setName(String owner)
	 {
		name = owner;
    }

	//all of the accessor methods - get
   
	 public int getAcctNumber()
	 {
	    return acctNumber;
    }

    public double getBalance()
	 {
        return balance;
    }

    public String getName()
	 {
	    return name;
    }

    //other methods
	 
    public void deposit(double amount)
    {
        balance = balance + amount;
    }

    public void withdraw(double amount) 
	 {
        balance = balance - amount;
    }
	 
    public String toString()
    {
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
	 	return ("acctNumber: "  + acctNumber +  " balance : " + fmt.format(balance)
			        + " name : " + name  );
	 }
	 
	 //Class method to return the number of accounts created
	 public static int getCount()
	 {
	 	return acctCount;
  	 }

	
}