/* Dillan Poorman
 * CSC205
 * 09/30/2019
 * invalid social security exception class
 * 
 */
package exceptions_hospital_employee;

public class InvalidSocSecException extends Exception {
	
	public InvalidSocSecException(String ssn) {
		
		super("Invalid SSN: " + ssn);
	}

}
