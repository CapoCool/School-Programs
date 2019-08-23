//Program Name: Hospital.java
//Author Name: Dillan Poorman
//Class: CSC110AA
//Date: 03//22/2018
//Description: Driver class for Hospital Employee
//------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------------------
package ch4;

import java.text.*;

public class Hospital {

	public static void main(String[] args) 
	{
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		System.out.println("Welcome to Our Hospital!\n");
		
		//create a hospital employee object and displays the state of it before hours worked and pay rate
		HospitalEmployee worker1 = new HospitalEmployee();
		System.out.println("Beginning state of worker1:\n" + worker1.toString());
		
		//sets pay rate to 20 dollars an hour and displays the state after it is set
		worker1.setPayRate(20.0);
		System.out.println("\nAfter pay rate is set:\n" + worker1.toString());
		
		//sets and displays hours times pay rate
		worker1.setPayRate(24.50);
		worker1.setHoursWorked(30.00);
		System.out.println("\nAfter pay rate and hours worked increases:\n" + worker1.toString());
		System.out.println("\nEmployee " + worker1.getEmpName() + " earned: " + fmt.format(worker1.calculateGrossPay()));
		
		//sets bonus to "excellent" and then displays the overall gross pay of the worker1 object
		System.out.println("\nAfter bonus: " + worker1.getEmpName() + " recieved a bonus of " 
							+ fmt.format(worker1.calculateBonus("excellent")) + " and earned a total of " 
							+ fmt.format(worker1.calculateGrossPay() + worker1.calculateBonus("excellent")));
		
		System.out.println("\n===============================================================================\n");
		System.out.println("Creating another Hospital Employee");
		
		//creating a new object with parameters
		HospitalEmployee worker2 = new HospitalEmployee("Sue Smart", 1122, 0 , 10.50);
		
		//displays worker1 and worker2
		System.out.println("State of worker1: " + worker1.toString());
		System.out.println("State of worker2: " + worker2.toString());
		
		//sets pay rate and hours worked. I wasn't sure if I should set up a conditional that just changes 
		//the neg number into a positive or just to set it to zero if it's below 0, so I just went with the second 
		//option, but I did have to idea just to times the neg number by -1 if a neg # was entered for input
		//validation
		worker2.setPayRate(12.25);
		worker2.setHoursWorked(15);
		worker2.setPayRate(-10.50);
		
		//displays worker1 and worker2 after the changes
		System.out.println("State of workers after worker2 pay rate and hours worked reset.");
		System.out.println("State of worker1: " + worker1.toString());
		System.out.println("State of worker2: " + worker2.toString());
		
		//displays the gross pay of worker 2
		System.out.println("Employee " + worker2.getEmpName() + " earned " + fmt.format(worker2.calculateGrossPay()));
		
		//displays amount of bonus
		System.out.println("After bonus " + worker2.getEmpName() + " recieved a bonus of " + worker2.calculateBonus(2) 
							+ " after getting great feeback." );
		//displays the amount of objects created
		System.out.println("Number of HospitalEmployees created: " + HospitalEmployee.getHospitalEmployeeCount());
		System.out.println("\nGoodbye");
		
		/*
		Welcome to Our Hospital!

		Beginning state of worker1:
		Employee: Dillan Poorman Employee Number: 9999 hoursWorked:  0.0 payRate: $0.00

		After pay rate is set:
		Employee: Dillan Poorman Employee Number: 9999 hoursWorked:  0.0 payRate: $20.00

		After pay rate and hours worked increases:
		Employee: Dillan Poorman Employee Number: 9999 hoursWorked:  30.0 payRate: $24.50

		Employee Dillan Poorman earned: $735.00

		After bonus: Dillan Poorman recieved a bonus of $500.00 and earned a total of $1,235.00

		===============================================================================

		Creating another Hospital Employee
		State of worker1: Employee: Dillan Poorman Employee Number: 9999 hoursWorked:  30.0 payRate: $24.50
		State of worker2: Employee: Sue Smart Employee Number: 1122 hoursWorked:  0.0 payRate: $10.50
		State of workers after worker2 pay rate and hours worked reset.
		State of worker1: Employee: Dillan Poorman Employee Number: 9999 hoursWorked:  30.0 payRate: $24.50
		State of worker2: Employee: Sue Smart Employee Number: 1122 hoursWorked:  15.0 payRate: $12.25
		Employee Sue Smart earned $183.75
		After bonus Sue Smart recieved a bonus of 100.0 after getting great feeback.
		Number of HospitalEmployees created: 2

		Goodbye
		*/

	}

}
