/* Dillan Poorman
 * CSC205
 * 09/30/2019
 * Driver classes for exception handling
 * idk why the errors are including the location of the exception classes but Imma leave it, because I have been grinding these programs for about 10 hours now.
 */
package exceptions_hospital_employee;

/**
 * @author Your name 
 * This program demonstrates the trying and catching of exceptions thrown by HospitalEmployee class's methods. 
 * 
 * <p>
 * Expected output
 * 
 *Error - Invalid name
 *Error - Invalid Employee number
 *Error - Invalid pay rate: 150.0
 *Error - Invalid number of hours: 100.0
 *Error - Invalid the social security number : 45-4567-45647a
*/

public class HopitalEmployeeExceptionTester
{
   public static void main(String[] args)
   {
      //HospitalEmployee2 employ = null;      // Reference variable set it  to null
                                                     // in order to make compiler happy
     
            
      // Create an HospitalEmployee object in the try block with an empty string for the name in the constructor
      //make sure that the rest of the arguments are all valid.
      try {
    	  
    	  HospitalEmployee2 employ1 = new HospitalEmployee2();
    	  employ1.setEmpName("");
    	  employ1.setEmpNumber(4567);
    	  employ1.setHoursWorked(40);
    	  employ1.setPayRate(12);
    	  employ1.setSocSecNumber("123-12-1234");
    	  
      }
      	catch(InvalidNameException | InvalidPayRateException | InvalidEmpNumberException | InvalidHoursWorkedException | InvalidSocSecException e){
    	  System.out.println("Error - " + e);
    	  
      }
      
      
      
      
      //You can always use the Multicatch block to catch all of them in one catch using |

      
      
      
      // Create a an HospitalEmployee object in the try block with an invalid EmpNumber in the constructor
      
      try {
    	  
    	  HospitalEmployee2 employ2 = new HospitalEmployee2("Dillan Poorman", -4562, 40, 12, "");
    	  //employ1.setEmpName("");
    	  //employ1.setEmpNumber(-4567);
    	 // employ1.setHoursWorked(40);
    	 // employ1.setPayRate(12);
    	 // employ1.setSocSecNumber("123-12-1234");
    	  
      }
      	catch(InvalidNameException | InvalidPayRateException | InvalidEmpNumberException | InvalidHoursWorkedException | InvalidSocSecException e){
    	  System.out.println("Error - " + e);
    	  
      }
      
      
      
      
      
      // Try to set an invalid hourly pay rate.
      try {
    	  HospitalEmployee2 employ1 = new HospitalEmployee2();
    	  employ1.setEmpName("Dillan Poorman");
    	  employ1.setEmpNumber(4567);
    	  employ1.setHoursWorked(40);
    	  employ1.setPayRate(150);
    	  employ1.setSocSecNumber("123-12-1234");
    	  
      }
      	catch(InvalidNameException | InvalidPayRateException | InvalidEmpNumberException | InvalidHoursWorkedException | InvalidSocSecException e){
    	  System.out.println("Error - " + e);
    	  
      }
      
      
      
      
      // Try to set an invalid number of hours worked.
      try {
    	  HospitalEmployee2 employ1 = new HospitalEmployee2();
    	  employ1.setEmpName("Dillan Poorman");
    	  employ1.setEmpNumber(4567);
    	  employ1.setHoursWorked(1562);
    	  employ1.setPayRate(12);
    	  employ1.setSocSecNumber("123-12-1234");
    	  
      }
      	catch(InvalidNameException | InvalidPayRateException | InvalidEmpNumberException | InvalidHoursWorkedException | InvalidSocSecException e){
    	  System.out.println("Error - " + e);
    	 
      }  
      
      try {
    	  HospitalEmployee2 employ1 = new HospitalEmployee2();
    	  employ1.setEmpName("Dillan Poorman");
    	  employ1.setEmpNumber(4567);
    	  employ1.setHoursWorked(40);
    	  employ1.setPayRate(12);
    	  employ1.setSocSecNumber("45-4567-45647a");
    	  
      }
      	catch(InvalidNameException | InvalidPayRateException | InvalidEmpNumberException | InvalidHoursWorkedException | InvalidSocSecException e){
    	  System.out.println("Error - " + e);
   }
}
}
/*
Error - CSC205.InvalidNameException: Invalid Name
Error - CSC205.InvalidEmpNumberException: Negative Value: -4562
Error - CSC205.InvalidPayRateException: Invalid Pay Rate: 150.0
Error - CSC205.InvalidHoursWorkedException: Invalid Hours: 1562.0
Error - CSC205.InvalidSocSecException: Invalid SSN: 45-4567-45647a
*/