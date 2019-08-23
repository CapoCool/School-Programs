//Program Name:Doctor.java
//Author Name: Dillan Poorman
//Class: CSC110AA
//Date 4/14/2018
//Description: Child class of Hospital Employee
//------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------

package ch4;

import java.util.*;

public class Doctor extends HospitalEmployee2 
{
	private String specialty;
	
	//Constructor that calls parent constructor
	public Doctor(String eName, int eNumber, double hours, double pay, String special) 
	{
		super(eName, eNumber, hours, pay);
	}
	
	//setter for specialty
	public void setSpecialty(String special)
	{
		specialty = special;
	}
	
	//getter for specialty
	public String getSpecialty()
	{
		return specialty;
	}
	
	//calculates bonus using parent class with different methods
	public double calculateBonus(String shift)
	{	
		double percent;
		if(shift.equals("night"))
		{
			percent = super.calculateBonus(10);
		}
		
		else if(shift.equals("evening"))
		{
			percent = super.calculateBonus(5);
		}
		
		else
		{
			percent = super.calculateBonus(0.0);
		}
		
		return percent;
	}
	
	//generates a login for doctor
	public String createLogin()
	{
		String login;
		String name = this.getEmpName();
		int num = this.getEmpNumber();
		
		Random gen = new Random();
		int random = gen.nextInt(10);
		
		login = name.substring(0, 2)  + random + num;
		
		return login;
	}
	
	//to string method that calls parent's to string with some extra statements
	public String toString()
	{
		return (super.toString() + " specialty: " + specialty);
	}
	
	
	

}
