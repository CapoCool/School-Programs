/* Dillan Poorman
 * CSC205
 * 09/30/2019
 * employee class
 * 
 */
package exceptions_hospital_employee;
//********************************************************************
// Class Name: HospitalEmployee.java     Base class for Inheritance   
// Authors: Lewis and Loftus and 	Patricia Baker
// Brief Description:
//            Defines a HospitalEmployee - base class or super class
//          
//
//********************************************************************

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class HospitalEmployee2
{
   NumberFormat fmt = NumberFormat.getCurrencyInstance();
   DecimalFormat fmt2 = new DecimalFormat("0.00");
   
   private String empName;
   private int empNumber;
   private double hoursWorked;
   private double payRate;
   private String socSecNumber;
   
	private static int hospitalEmployeeCount = 0;


   //-----------------------------------------------------------------
   //  Sets up this hospital employee with default information.
   //-----------------------------------------------------------------
   public HospitalEmployee2() 
   {
	  empName = "";
	  empNumber = 0;
	  hoursWorked = 0;
      payRate = 0;
      socSecNumber = "";
		
		hospitalEmployeeCount++;

   }
	
	//overloaded constructor.
	public HospitalEmployee2(String eName, int eNumber, double hours, double pay, String socSecNumber) throws InvalidNameException, InvalidEmpNumberException, InvalidHoursWorkedException, InvalidPayRateException, InvalidSocSecException
	{
		
		if(eName == null || eName == "") {
			 throw new InvalidNameException();
	  } else { this.empName = eName; }
	  
	  if(eNumber < 0) {
		  throw new InvalidEmpNumberException(eNumber);
	  } else { this.empNumber = eNumber;}
	  
	  if(hours > 0 || hours < 84) {
		  throw new InvalidHoursWorkedException(hours);
     } else { this.hoursWorked = hours; }
	  
	  if(pay < 0 || pay > 25) {
		   throw new InvalidPayRateException(pay);
	   } else { this.payRate = pay; }
	  
      int num = socSecNumber.trim().replaceAll(" +", "").length();
	  
	  if(num == 11 && socSecNumber.matches("^(?!000|666)[0-8][0-9]{2}-(?!00)[0-9]{2}-(?!0000)[0-9]{4}$") ) {
		  this.socSecNumber = socSecNumber;
		  
	  } else { throw new InvalidSocSecException(socSecNumber); }
		
		hospitalEmployeeCount++;
	
	}

   //-----------------------------------------------------------------
   //  Sets the name for this employee.
   //-----------------------------------------------------------------
   public void setEmpName (String eName) throws InvalidNameException
   {
	  if(eName == null || eName == "") {
		  throw new InvalidNameException();
	  }
	  
      this.empName = eName;
   }


   //-----------------------------------------------------------------
   //  Sets the employee number for this employee.
   //-----------------------------------------------------------------
   public void setEmpNumber (int eNumber) throws InvalidEmpNumberException
   {
	  if(eNumber < 0) {
		  throw new InvalidEmpNumberException(eNumber);
	  }
      	this.empNumber = eNumber;
   }

   //-----------------------------------------------------------------
   //  Sets the hours worked for this employee.
   //-----------------------------------------------------------------
   public void setHoursWorked (double hours) throws InvalidHoursWorkedException
   {
	   if(hours < 0 || hours > 84) {
			  throw new InvalidHoursWorkedException(hours);
	   }
       this.hoursWorked = hours;
    }

   //-----------------------------------------------------------------
   //  Sets the pay rate  for this employee.
   //-----------------------------------------------------------------
   public void setPayRate (double rate) throws InvalidPayRateException
   {
	   if(rate < 0 || rate > 25) {
		   throw new InvalidPayRateException(rate);
	   }
       this.payRate = rate;
   }


   //-----------------------------------------------------------------
   //  Returns this employee's name.
   //-----------------------------------------------------------------
   public String getEmpName()
   {
      return this.empName;
   }


   //-----------------------------------------------------------------
   //  Returns this employee's number.
   //-----------------------------------------------------------------
   public int getEmpNumber()
   {
      return empNumber;
   }

   //-----------------------------------------------------------------
   //  Returns hours worked.
   //-----------------------------------------------------------------
   public double getHoursWorked()
   {
      return hoursWorked;
   }

   //-----------------------------------------------------------------
   //  Returns employee payRate
   //-----------------------------------------------------------------
   public double getpayRate()
   {
      return payRate;
   }


	//-----------------------------------------------------------------
   //  Returns this employee's gross pay.
   //-----------------------------------------------------------------
   public double calculateGrossPay()
   {
      return (hoursWorked * payRate);
   }


   //-----------------------------------------------------------------
   //  This adds or subtracts hours from the hoursWorked instance var.
   //-----------------------------------------------------------------
   public void changeHoursWorked(double hours) throws InvalidHoursWorkedException
   {
	  if(hours > 0 || hours < 84) {
		throw new InvalidHoursWorkedException(hours);
	  }
      hoursWorked = hoursWorked + hours;
   }

   //-----------------------------------------------------------------
   //  Changes the instance variable payRate by the amount
   //-----------------------------------------------------------------
   public void changePayRate(double amount)
   {
	    payRate = payRate + amount;
   }

   //---------------------------------------------------------------
   // Calculates a bonus based on a rating
	//  Returns 500 for excellent employees
	//  Returns 300 for satisfactory employees
	//  Returns 0 for all other ratings
   //
   //  good example to overload.  
   //---------------------------------------------------------------
   public double calculateBonus(String rating)
   {
	  
	   double bonus = 0.0;
	   rating = rating.toLowerCase();

	   if (rating.equals("excellent") )
	   {
		   bonus = 500;
	   } else if (rating.equals("satisfactory") )
		{
		   bonus = 300;
		} //everyone else is 0
		
	   return bonus;
   }

 
  //overloaded calculateBonus
  //bonus is calculated as a percent of gross pay
  //percent = 10% passed in a 10
  
  public double calculateBonus(double percent)
  {
      double bonus = calculateGrossPay() * percent / 100.0;
      return bonus;
  
  }
  
  public void setSocSecNumber(String socSecNumber) throws InvalidSocSecException {
	  
	  int num = socSecNumber.trim().replaceAll(" +", "").length();
	  
	  if(num == 11 && socSecNumber.matches("^(?!000|666)[0-8][0-9]{2}-(?!00)[0-9]{2}-(?!0000)[0-9]{4}$") ) {
		  this.socSecNumber = socSecNumber;
		  
	  } else { throw new InvalidSocSecException(socSecNumber); }
	  
	  
	  
  }

   //-----------------------------------------------------------------
   //  Returns a description of this employee as a string.
   //-----------------------------------------------------------------
   public String toString()
   {
      
      return ("empName: " + empName + " empNumber: " + empNumber + " hoursWorked: " +
       hoursWorked + " payRate: " + fmt.format(payRate) );
   }
	
	//static method that returns number of HospitalEmployee objects created
	public static int getHospitalEmployeeCount( )
	{
	
			return hospitalEmployeeCount;
	
	}


}