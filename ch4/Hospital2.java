//Program Name: Hospital2.java
//Author Name: Dillan Poorman
//Class: CSC110AA
//Date: 4/14/2018
//Description: Driver class for Child class Doctor, and parent class Hopsital employee
//------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------

package ch4;

import java.text.NumberFormat;

public class Hospital2 
{
	public static void main(String[] args)
	{
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		
		//set up for luke
		//---------------------------------------------------------------------------------
		HospitalEmployee2 luke = new HospitalEmployee2("Luke Skywalker", 5432, 40, 20.50);
		System.out.println("Welcome to our hospital\n=======================\n");
		System.out.println("Beginning state of luke:\n" + luke.toString());
		
		System.out.println(luke.getEmpName() + " is a satisfactory HospitalEmployee. Bonus = " + 
							fmt.format(luke.calculateBonus("satisfactory")));
		//-----------------=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
		//set up for darth
		//==--==--=-==----====-==---=--=-=-=-=-=-=-=-=-=-=-=---------=-==-=-=-=-=-=-=-=-=-=-=-=-=-
		Doctor darth = new Doctor("Darth Vader", 9876, 17, 150, null);
		darth.setSpecialty("Plastic Surgery");
		
		System.out.print("\n\nBeginning state of darth: \n" + darth.toString());
		
		System.out.println("\n" + darth.getEmpName() + " is a doctor and works the evening shift. Bonus: " + fmt.format(darth.calculateBonus("evening")));
		
		System.out.println("Darth Vader's loging is: " + darth.createLogin());
		
		System.out.println("\nNumber of Hospital Employess created: " + darth.getHospitalEmployeeCount());
		
		System.out.println("Goodbye");
		//=---------==================================================================================
		
	/*	Welcome to our hospital
		=======================

		Beginning state of luke:
		empName: Luke Skywalker empNumber: 5432 hoursWorked: 40.0 payRate: $20.50
		Luke Skywalker is a satisfactory HospitalEmployee. Bonus = $300.00


		Beginning state of darth: 
		empName: Darth Vader empNumber: 9876 hoursWorked: 17.0 payRate: $150.00 specialty: Plastic Surgery
		Darth Vader is a doctor and works the evening shift. Bonus: $127.50
		Darth Vader's loging is: Da69876

		Number of Hospital Employess created: 2
		Goodbye */
	}

}
