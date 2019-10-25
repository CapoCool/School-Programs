/* Dillan Poorman
 * CSC205
 * 09/30/2019
 * invalid hours worked exception class
 * 
 */

package exceptions_hospital_employee;

public class InvalidHoursWorkedException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidHoursWorkedException() {
		super();
	}
	
	public InvalidHoursWorkedException(double hoursWorked) {
		
		super("Invalid Hours: " + hoursWorked);
	}

}
