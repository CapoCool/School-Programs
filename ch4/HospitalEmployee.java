//Program name: HospitalEmployee.java
//Author Name: Dillan Poorman
//Class: CSC110AA
//Date Written : 03/22/2018
//Description: class that sets up the structure for Hospital the driver class
//---------------------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------------------------

package ch4;

import java.text.*;

public class HospitalEmployee 
{
	private String empName;
	private int empNumber;
	private double hoursWorked;
	private double payRate;
	private static int hospitalEmployeeCount;
	
	//constructor for HospitalEmployee
	public HospitalEmployee() 
	{
		empName = "Dillan Poorman";
		empNumber = 9999;
		hoursWorked = 0;
		payRate = 0;
		
		hospitalEmployeeCount++;
	}
	//second constructor for worker2
		public HospitalEmployee(String eName, int eNumber, double hours, double pay)
		{
			empName = eName;
			empNumber = eNumber;
			hoursWorked = hours;
			payRate = pay;
		
			hospitalEmployeeCount++;
		
		}
	
	//getter for objects created
	public static int getHospitalEmployeeCount()
	{
		return hospitalEmployeeCount;
	}
	
	//getter for employee name
	public String getEmpName() 
	{
		return empName;
	}
	
	//new setter to not allow hours to go below zero
	public void setHoursWorked(double hours)
	{
		
		if (hours < 0)
		{
			hoursWorked = hoursWorked;
		}
		
		else
		{
			hoursWorked = hours;
		}
	}
	
	//new setter for pay rate to not allow hours to fall below zero
	public void setPayRate(double rate)
	{
		
		if (rate < 0 ) 
		{
			payRate = payRate;
		}
		
		else 
		{
			payRate = rate;
		}
	}
		
	//getter for employee number
	public int getEmpNumber() 
	{
		return empNumber;
	}
	
	//getter for hours worked
	public double getHoursWorked()
	{
		return hoursWorked;
	}
	
	//getter for pay rate
	public double getPayRate()
	{
		return payRate;
	}
	
	//setter for employee name
	public void setName(String ename)
	{
		empName = ename;
	}
	
	//setter for employee number
	public void setEmpNumber(int eNumber)
	{
		empNumber = eNumber;
	}
		
	//calculates gross pay
	public double calculateGrossPay()
	{
		return (hoursWorked * payRate);
	}
	
	//changes hours worked to hours
	public void changeHoursWorked(double hours)
	{
		hoursWorked = hoursWorked + hours;
	}
	
	//changes pay rate to an amount
	public void changePayRate(double amount)
	{
		payRate = payRate + amount;
	}
	
	//calculates bonus based on string entered
	public double calculateBonus(String rating)
	{
		double bonus = 0;
		
		if (rating.equals("excellent"))
		{
			bonus = 500.00;
		}
		
		else if (rating.equals("satisfactory"))
		{
			bonus = 300.00;
		}
		
		else
		{
			bonus = 0;
		}
		
		return bonus;
	}
	
	//adds another rating that determines feedback based on 0-2
	public double calculateBonus(int scale)
	{
		double bonus = 0;
		if (scale == 2)
		{
			bonus = 100.0;
		}
		
		else if (scale == 1)
		{
			bonus = 50.0;
		}
		
		else
		{
			bonus = 0;
		}
		
		return bonus;
	}
	
	//toString method
	public String toString()
	{
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		return ("Employee: " + empName + " Employee Number: " + empNumber + " hoursWorked:  " + hoursWorked 
				+ " payRate: " + fmt.format(payRate));
	}
	

	
}
