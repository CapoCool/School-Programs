/* Class Name: The BankAccount class - UPDATE 3
   Author:  P Baker / P Jalowiec
	Date : 2011
	Brief Description:

    Add overloaded methods.  constructor and withdraw
	 
    Add static variable count to count the number of objects created
	 Add static method getCount to return the count
    
 */
package ch4;
import java.text.NumberFormat;  //using currency format in toString




class BankAccount3 
{

    private static int count = 0;   //class to count accounts
  
	private int acctNumber;
    private double balance;
    private String name;
	
    private static int acctCount = 0;
	 
    
    /* constructs a bank account with zero balance and account number,
       and Unknown name
     */

    public BankAccount3() 
	 {
		 acctNumber = 1234;
		 balance = 0.0;
		 name = "Dillan Poorman";
		 
		 count++;
	 }
	 
	 /*constructs a bank account with an account number, initial balance, and owner*/
	 public BankAccount3(int acctNo, double initBalance, String owner)
	 {
	  	 acctNumber =acctNo;
		 balance = initBalance;
		 name = owner;
		 
		 count++;
	 }
	
    //all of the mutator methods - set

    public void setAcctNumber(int acct)
	 {
		    acctNumber = acct;
    }

 	//not appropriate.  would not want to reset a balance  
	/*public void setBalance(double amount)
	 {
	    balance = amount;
    }*/
   
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
	 
	 //overloaded method.  charges a fee!
	 public void withdraw(double amount, double fee) 
	 {
        balance = balance - amount - fee;
    }
	 
	 public String setStatus()
	 {
		if (balance > 0 )
		{
			return ("Fuck all of you");
		}
		else if(balance < 0)
		{
			return("Overdrawn!");
		}
		else
			return("You broke!");
	 }
	 
	 
    public String toString()
    {
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
	 	return (" acctNumber: "  + acctNumber +  " balance : " + fmt.format(balance)
			        + " name : " + name  );
	 }
	 
	 //Class method to return the number of accounts created
	 public static int getCount()
	 {
	 	return count;
  	 }

	
}